package mushfik;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);

       int num = (int)val.nextFloat();
//       eta type casting .. karon ami input for example 16.6 dile eta
//                16 back korbe

        System.out.println(num);

        int i= 16;
        float f= 16.6f;
        long l= 161l;

        double  result = i*f*l;

        System.out.println(result);

        //ekhane kebol shob cheye boro primitive type e output dibe
        // jodi .. long  result = i*f*l; likhtam tobe error dito;

    }
}
