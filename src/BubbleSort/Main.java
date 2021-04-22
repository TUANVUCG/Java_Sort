package BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-1,2,4,5,9,3};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);
        for(int i : arr){
            System.out.print(i+"\t");
        }
    }
}
