public class ArrayMinMax {
    public static void main(String[] args) {
        int [] arr = {10,330,230,4220,5120,5121,34223};
int min = arr[0];
int max = arr[0];
for(int i=1;i< arr.length;i++){
    if(arr[i]<min){
        min = arr[i];
    }
    if(arr[i]>max){
        max = arr[i];
    }
}
        System.out.println("The min value is "+min);
        System.out.println("The max value is "+max);
}
}
