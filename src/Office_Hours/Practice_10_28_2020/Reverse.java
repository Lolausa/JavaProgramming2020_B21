package Office_Hours.Practice_10_28_2020;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        String name = scan.next();
        //             01234

        String result = ""; // "rebyC"
//
//        result += name.charAt(name.length()-1);
//        result += name.charAt(6);
//        result += name.charAt(5);
//        result += name.charAt(4);
//        result += name.charAt(3);
//        result += name.charAt(2);
//        result += name.charAt(1);
//        result += name.charAt(0);
        for (int i = name.length()-1; i >=0; i--){
        result += name.charAt(i);
//    result += name.substring(i,i+1); // gets one character at time
        }

        System.out.println(result);

    }
}
