import java.util.Scanner;
public class SortArray{
    public static void main(String[] args){
        int [] array = new int [] {1789,2035,1899,1456,2013};
        int temp;
        System.out.println("The original array is:");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    for(int i=0;i<array.length;i++){
        for(int a=(i+1);a<array.length;a++){
           if(array[a]<array[i]){
               temp = array[i];
               array[i] = array[a];
               array[a] = temp;
           } 
        }
    }
    System.out.println("The sorted array is:");
    for(int i=0;i<array.length;i++){
        System.out.print(array[i]+" ");
    }}
}