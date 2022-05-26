public class SelectionSort2 {
    public static void printArr(int a , int[] arr){
    System.out.printf("%d: ", a);
    for (int i = 0; i < arr.length; i++) {
        System.out.printf("%d ", arr[i] );
    }
    System.out.println();
}
    public static void selectionSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[ j] < arr[ minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i){
                int temp = arr[ i];
                arr[ i] = arr[minIndex];
                arr[ minIndex] = temp;
            }
            printArr(i,arr);
        }

    }
    public static void main(String[] args) {
          int [] list = {2,4,7,1,6,0,9,8};
          selectionSort(list);
    }
}
