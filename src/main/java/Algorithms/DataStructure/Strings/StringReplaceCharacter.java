package Algorithms.DataStructure.Strings;

import java.util.Scanner;

public class StringReplaceCharacter {
    //input : Manish

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name"); //"Manish"
        String firstName = sc.next();
        System.out.println("First Name is  " + firstName);

        String updateString ="";
        StringBuilder sb = new StringBuilder();

        for (int i =0; i<firstName.length();i++){
            if ( (firstName.charAt(i)== 'M')){
             //sb.append('M');
             sb.insert(i,'m');
            }
            else{

             sb.append(firstName.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
