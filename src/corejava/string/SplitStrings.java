package corejava.string;

public class SplitStrings {
    public static void main(String[] args) {
        String str = "MX1YZs239PP";
        String[] strarr = str.split("\\d");
        for(String st:strarr){
            System.out.println("st=="+st);
        }
    }
}
