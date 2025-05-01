package corejava.num;

public class FactorialNum {

    public static void main(String[] args) {

        FactorialNum fn = new FactorialNum();
        int n = fn.factorial(5);
        System.out.println("n=="+n);
    }


    public int factorial(int num){
        if(num==0 || num==1){
            return 1;
        }
        return num * factorial(num-1);
    }
}
