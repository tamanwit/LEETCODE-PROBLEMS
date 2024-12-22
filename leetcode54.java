import java.util.*;

public class leetcode54 {
    public static void spiral(int[][] arr){
        int i=0, j=0, c=arr.length*arr.length, k=0;
        int[] x = new int[arr.length*arr.length];
        while(c>0){
            if(j<arr.length-1){
                x[k++] = arr[i][j];
                j++; c--;
            }
            else if(j==arr.length && i<arr.length-1){
                x[k++] = arr[i][j];
                i++; c--;
            }
            else if(i==arr.length && j>0){
                x[k++] = arr[i][j];
                j--; c--;
            }
            else if(j==0 && i>0){
                x[k++] = arr[i][j];
                i--; c--;
            }
            //till here we are done with the boundary
            //now the center elements
            else if(i==1 && j==0){
                x[k++] = arr[i][j];
                j++; c--;
            }
            else if(i<arr.length-1 && j==arr.length-1){
                x[k++] = arr[i][j];
                i++; c--;
            }
            else if(i==arr.length-1 && j>0){
                x[k++] = arr[i][j];
                j--; c--;
            }
        }
        //printing the output
        for(i=0; i<x.length; i++){
            System.out.print(x[i] + "\t");
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        spiral(arr);
    }
}  
