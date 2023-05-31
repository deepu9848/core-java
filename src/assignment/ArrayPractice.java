package assignment;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int [] arr =new int[] {1,2,3,4,5};
        int [] arr_new =new int[arr.length -1];
        int i = 4;
        for(int n=0, k= 0; n<arr.length; n++) {
            if( n!=i) {
                arr_new[k] = arr[n];
                k++;

            }
            }System.out.println("Before deletion :" + Arrays.toString(arr));
            System.out.println("After deletion :" + Arrays.toString(arr_new));

        }
    }

