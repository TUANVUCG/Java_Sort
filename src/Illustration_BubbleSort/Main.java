package Illustration_BubbleSort;

import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử trong mảng: ");
        int number = sc.nextInt();
        int[] arr = new int[number];
        for(int i = 0; i<number; i++){
            System.out.print("Nhập phần tử thứ "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Before");
        for(int i : arr){
            System.out.print(i + "\t");
        }
        System.out.println("");
        bubbleSort.bubbleSort(arr);
        System.out.println("After");
        for(int i : arr){
            System.out.print(i +"\t");
        }
    }
}
