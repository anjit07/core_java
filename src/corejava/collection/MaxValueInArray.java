package corejava.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxValueInArray {

    public static void main(String[] args) {

        int[] arr = {15,23,34,5,31,23,99};
        int maxval=0;
        for(int val:arr) {
            if (maxval <= val) {
                maxval = val;
            }
        }
        System.out.println("Max value :"+maxval);
        int max = Arrays.stream(arr).max().getAsInt();

        System.out.println("Max num by Stream : "+max);

        int[] arrs = {-1,-2,-3,-4};
        int macValue = Arrays.stream(arrs).max().getAsInt();
        System.out.println("Max value in arrs : "+macValue);
        //using loop
        int maxVal = arrs[0];
        for(int index=1;index<arrs.length;index++){
            if(arrs[index]>maxVal){
                maxVal = arrs[index];
            }
        }
        System.out.println("Max value in array by using loop : "+maxVal);


    }


}
