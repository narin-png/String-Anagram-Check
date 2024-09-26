package taskexamples;

import java.util.Arrays;
import java.util.Scanner;

public class GitHub {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter word:");
        String word=sc.nextLine();
        System.out.println("enter ikinci word:");
        String secondWord=sc.nextLine();
        if(word.length()==secondWord.length()) {
            String[] arr = new String[word.length()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = String.valueOf(word.charAt(i));
            }
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            String[] arr1 = new String[secondWord.length()];
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = String.valueOf(secondWord.charAt(i));
            }
            Arrays.sort(arr1);
            System.out.println(Arrays.toString(arr1));
            if(Arrays.equals(arr,arr1)){
                System.out.println("anagramdir");
            }
            else{
                System.out.println("not anagramdir");
            }
        }


    }
}
