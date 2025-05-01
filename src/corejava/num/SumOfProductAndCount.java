package corejava.num;

public class SumOfProductAndCount {

    public static void main(String[] args) {

        // W.A.Program to SUM the give number
        System.out.println("## Sum of digit ## ");
        int givenNumber = 125;
        int sumofNumber =0;
        int reminder = 0;
        while (givenNumber>0){
            reminder = givenNumber%10;
            sumofNumber=sumofNumber+reminder;
            givenNumber=givenNumber/10;
        }
        System.out.println("sumofNumber : "+sumofNumber);

        // W.A.Program to product the give number
        System.out.println("## Product of of digit ## ");
        int product =1;
        givenNumber = 125;
        reminder = 0;
        while (givenNumber>0){
            reminder = givenNumber%10;
            product = product*reminder;
            givenNumber=givenNumber/10;
        }
        System.out.println("Product of Number : "+product);

        // W.A.Program to count the give number
        System.out.println("## Count of of digit ## ");
        givenNumber = 9876599;
        int count = 0;
        while (givenNumber>0){
            givenNumber=givenNumber/10;
            count++;
        }
        System.out.println("Count of given Number : "+count);
    }

}
