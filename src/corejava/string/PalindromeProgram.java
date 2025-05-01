package corejava.string;

public class PalindromeProgram {

    public static void main(String[] args) {
        String checkPalindrom = "jahaj";
        // using stringBuilder can convert and check
        StringBuilder stringBuilder = new StringBuilder(checkPalindrom.toLowerCase());
        if(checkPalindrom.toLowerCase().equals(stringBuilder.reverse().toString())){
            System.out.println("String is palindrome : "+checkPalindrom);
        }else {
            System.out.println("String is not palindrome : "+checkPalindrom);
        }
        // using loop
        System.out.println("String length : "+checkPalindrom.length());
        String convertString ="";
        int length = checkPalindrom.length();
        for(int index = length; index>0;index--){
            convertString = convertString+checkPalindrom.charAt(index-1);
        }
        System.out.println("is palindrome ? : "+convertString +"  : "+  checkPalindrom.equals(convertString));
        // using boolean flag
        boolean ispalindrome = true;
        int lenth = length-1;
        for(int index = 0;index<=lenth;index++){
            System.out.println("loop : "+checkPalindrom.charAt(index) +"  : "+ checkPalindrom.charAt(lenth-index));
           if(checkPalindrom.charAt(index)!=checkPalindrom.charAt(lenth-index)){
                ispalindrome=false;
                break;
            }
        }
        System.out.println("is palindrome ? ## "+ispalindrome);
    }
}
