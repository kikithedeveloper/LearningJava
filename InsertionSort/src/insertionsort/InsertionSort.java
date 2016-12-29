/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author kimberlylin
 */
//public class InsertionSort {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        int[] numbers = {67, 78, 4, 15, 47, 30, 99, 33, 65, 85};
//        InsertionSort(numbers);
//        for (int i=0; i<numbers.length; i++)
//        {
//            System.out.print(numbers[i]+"\t");
//        }
//    }
//    public static void InsertionSort(int[] num)
//    {
//        int j, key, i;
//        for(j = 0; j < num.length; j++)
//        {
//            key = num[j];
//            System.out.println("key: " + key);
//            System.out.println("j: " + j);
//            for(i=j - 1; (i >= 0) && (num[i] > key); i--)
//            {
//                System.out.println("num[i]: " + num[i] + "\tkey: " + key);
//                num[i+1] = num[i];
//            }
//            num[i+1] = key;
//            for (int k=0; k<num.length; k++)
//            {
//                System.out.println(num[k]+"\t");
//            }
//        }
//    }
//}

public class InsertionSort {
 
    public static void main(String a[]){
        int[] arr1 = {67, 78, 4, 15, 47, 30, 99, 33, 65, 85};
        int[] arr2 = InsertionSort(arr1);
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + "\t");
        }
    }
     
    public static int[] InsertionSort(int[] input){
         
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
}