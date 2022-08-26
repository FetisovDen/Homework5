public class Main {
    public static void main(String[] args) {

        //Задание 1

        int [] weight = new int [3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        double [] number = {1.57, 7.654, 9.986};

        int [] any = {1,2};

        //Задание 2
        {for(int i1 = 0; i1 < 2; i1++){
            System.out.print(weight[i1] + ",");}
            {
                System.out.print(weight[2]);}
        }
        System.out.println();
        {for(int i2 = 0; i2 < 2; i2++){
            System.out.print(number[i2] + ",");}
            {
                System.out.print(number[2]);}
        }
        System.out.println();
        {for(int i3 = 0; i3 < 1; i3++){
            System.out.print(any[i3] + ",");}
            {
                System.out.print(any[1]);}
        }

        //Задание 3
        System.out.println();
        {for(int i4 = 2; i4 >= 1; i4--){
            System.out.print(weight[i4] + ",");}
            {
                System.out.print(weight[0]);}
        }
        System.out.println();
        {for(int i5 = 2; i5 >= 1; i5--){
            System.out.print(number[i5] + ",");}
            {
                System.out.print(number[0]);}
        }
        System.out.println();
        {for(int i6 = 1; i6 >= 1; i6--){
            System.out.print(any[i6] + ",");}
            {
                System.out.print(any[0]);}
        }


        //Задание 4
        System.out.println();
        {
            for (int i7 = 0; i7 < 2; i7++) {
                if (weight[i7] % 2 != 0) {
                    weight[i7] = weight[i7] + 1;
                }
                System.out.print(weight[i7] + ",");
            }
            {
                if (weight[2] %2 != 0) {
                    System.out.print(weight[2]+1);
                } else {
                    System.out.println(weight[2]);
                }
            }


        }












    }
}