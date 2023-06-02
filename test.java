package academy.devonline.java.basic.section01_setup.section05_setup;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        var a = new Scanner(System.in).nextInt();
        var b = new Scanner(System.in).nextInt();
        var to = 1;

       int y = a;
       while (y <= b){
           System.out.print(y+"\t");
           y+=to;
           if (y % 10== 0){
               System.out.println();
           }

       }
       int u = a;
       while (u >= b){
            System.out.print(u+"\t");
            u-=to;
            if (u %  10== 0 ){
                System.out.println();
            }
        }
















    }






}
