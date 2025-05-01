package corejava.num;

public class PalindromeAndRever {

    public static void main(String[] args) {

        // check the given number is palindrome or not
        System.out.println("###  check the given number is palindrome or not ##");
        int num = 121;
        int n =num;
        int res = 0;
        int rem = 0;
        while (num>0){
            rem = num%10;
            System.out.println("Rem : "+rem);
            res = (res*10)+rem;
            System.out.println("Rest : "+res);
            num = num/10;
            System.out.println("Num : "+num);
        }
        if (n==res) {
            System.out.println("Given number is palindrome");
        } else {
            System.out.println("Given number is not a palindrome");
        }
        // %10------to get the last digit from a number
        // *10------to increase a digit in a number
        // /10---------to remove the last digit from a number
        // End program to check the given number is palindrome or not

        //W.R.Program to reverse the number
        System.out.println("## Reverse of the given number ##");
        int givenNumber = 123450;
        int reversNumber = 0;
        int reminder = 0;
        while (givenNumber>0){
            reminder = givenNumber%10;
            reversNumber  = (reversNumber*10)+reminder;
            givenNumber = givenNumber/10;
        }
        System.out.println("reversNumber : "+reversNumber);
    }
}
