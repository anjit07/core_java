package corejava.collection;

import java.util.Arrays;

public class SortingArrayExpl {

    public static void main(String[] args) {
        int [] arr = {10,-1,-2,-10,-8,12};

        for(int i=0;i<arr.length-1;i++){
           int minvalueindex = i;
           for(int j=i+1;j< arr.length;j++){
               if(arr[j]<arr[minvalueindex]){
                   minvalueindex=j;
               }
           }
           if(minvalueindex!=i){
               int tmp =arr[i];
               arr[i] = arr[minvalueindex];
               arr[minvalueindex]=tmp;
           }

        }
        for(int val:arr){
            System.out.println(" :: "+val);
        }
        Arrays.sort(arr);
        System.out.println(" Sort Array "+Arrays.toString(arr));

    }
}
