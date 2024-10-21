public class Arrays2d {
    public static void main(String[] args) {
        int [][] arr = {
                {10,10,10},
                {20,20,20},
                {30,30,30}
        };
        int [][] arr1 = {{10, 10, 10},
                {20, 20, 20},
                {30, 30, 30}
        };
        int [][] result = new int[3][3];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                result[i][j] = arr[i][j]+arr1[i][j];
            }
            for (int elements :result[i]){
                System.out.print(elements);
            }
        }
    }
}
