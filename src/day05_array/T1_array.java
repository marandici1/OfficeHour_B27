package day05_array;

public class T1_array {
    public static void main(String[] args) {
        String colors="Yellow Blue Black";
        //0       1       2
        String [] colorArray={"Yellow","Blue","Black"};

        System.out.println("colorArray[0] = " + colorArray[0]);
        System.out.println("colorArray[1] = " + colorArray[1]);
        System.out.println("colorArray[2] = " + colorArray[2]);


        colorArray[1]="White";
        System.out.println("colorArray[1] = " + colorArray[1]);

        String [] names=new String[5];
        names[0]="Adam";
        names[1]="Rabia";
        names[2]="Nick";
        names[3]="Busra";
        names[4]="Sidar";
        // names[5]="Milana";  //we can not do this if  you do this you will get ArrayIndexOutOfBoundsException exception
        System.out.println("names[3] = " + names[3]);

    }
}
