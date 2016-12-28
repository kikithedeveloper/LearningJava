/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

/**
 *
 * @author kimberlylin
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {67, 78, 4, 15, 47, 30, 99, 33, 65, 85};
        SelectionSort(numbers);
        for (int i = 0; i<numbers.length; i++)
        {
            System.out.print(numbers[i]+"\t");
        }
    }
    public static void SelectionSort (int[] num)
    {
        int i, j, first, temp;
        for (i = num.length - 1; i > 0; i--)
        {
            first = 0;
            for (j = 1; j<= i; j++)
            {
                if (num[j] > num[first])
                    first = j;
            }
            temp = num[first];
            num[first] = num[i];
            num[i] = temp;
        }
    }
    
}
