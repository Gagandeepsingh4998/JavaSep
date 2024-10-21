public class ArraySum {
    public static void main(String[] args) {
        int [] arr = {45,12,13,45,1,6,45};
        int result=0;
        for (int i =0;i< arr.length;i++){
            System.out.println("The sum of the array elements is ");
            result += arr[i];

        }
        System.out.println(result);
    }
}

