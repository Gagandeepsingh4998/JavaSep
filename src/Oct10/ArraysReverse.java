package Oct10;

public class ArraysReverse {
    public static void main(String[] args)
    {
        int[] arr ={10,20,30,40,50,60,70};
        /*
        for (int i = 0; i < (arr.length)/2 ; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] =temp;
        }
        for(int elements:arr){
            System.out.println(elements);
        }

        */

        int start =0;
        int end = arr.length-1;
        while ( start < end)
        {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        for (int element:arr){
            System.out.println(element);
        }
    }
}
