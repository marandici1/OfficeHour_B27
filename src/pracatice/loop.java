package pracatice;

public class loop {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 5; i++) {
inner:
            for (int j = 0; j < 4; j++) {
                if(j==1)continue ;
                for (int k = 0; k < 3; k++) {
                    if(k== 2) break;
                    if(k==0) continue;
                    if(k==1) break inner;
                }
                System.out.println("inner");
            }
            System.out.println("outer");
        }
        System.out.println("finnish");
    }
}
