package Insert_Sort;

public class InsertSort {

    public static void main(String[] args) {
        int arr[] = {1,9,-3,5,12};
        insertSort(arr);
        for(int i : arr){
            System.out.print(i+"\t");
        }

    }

    public static void insertSort(int arr[]){
        int pos;
        int temp;
        for(int i = 1; i<arr.length; i++){
            temp = arr[i];
            pos = i;
            while (pos>0 && temp<arr[pos-1]){
                arr[pos] = arr[pos-1];
                pos--;
            }
            arr[pos] = temp;
        }
    }
}
