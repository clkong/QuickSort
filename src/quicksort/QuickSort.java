/*
 *Sean Luo 19/11/2018
 *QuickSort.java
 *This is progrem calculates the QuickSort.
 */

package quicksort;
import static java.lang.System.currentTimeMillis;

// Java program for implementation of QuickSort
class QuickSort
{
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
 
 
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    void sort(int arr[], int low, int high)
    {
        if (low > high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            sort(arr, pi-1, high);
            sort(arr, low, pi+1);
            
        }
    }
 
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    public static void quickSort(int data[]) {
    int counter;
    int comps=0;
    int swaps=0;
    //Loop to control number of passes
    for (int pass = 1; pass < data.length; pass++) {
      //Loop to control # of comparisons for length of array-1
      for (int element=0;element<data.length-1;element++) {
          comps++;
        //compare side-by-side elements and swap them if
        //first element is greater than second element
        if (data[element] < data[element + 1]) {
          swaps++;
          swap(data, element, element + 1);  //call swap method
        }
      }
    }
    System.out.println("After sorting using the quick Sort,"
      + " the total swaps are:" + swaps);
    System.out.println("After sorting using the quick Sort,"
      + " the total comparisons are:" + comps);
  }
    public static void swap(int array2[], int first, int second) {
    int hold = array2[first];
    array2[first] = array2[second];
    array2[second] = hold;
  }

    
    // Driver program
    public static void main(String args[])
    {
        int x=100;
        int arr[] =  new int [x];
        for (int i=0; i<x; i++){
        arr[i]=(int)(Math.random()*101);
    }
        int n = arr.length;
 
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);
        
        System.out.println("sorted array");
     printArray(arr);
   
    
        
        double start=0;
        double finish=0;
        double total=0;
        start = currentTimeMillis();
        quickSort(arr);
        finish = currentTimeMillis();
        total = finish - start;

        System.out.println("\nAfter sorting using the Quick Sort,"
          + " the time taken is:" + total + " ms");

        
        
    
    
    }
}
/*This code is contributed by Rajat Mishra */