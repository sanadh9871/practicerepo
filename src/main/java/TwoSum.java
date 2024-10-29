import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println("Enter 5 number");
        Scanner s=new Scanner(System.in);
        int x[] = new int[5];
        for (int i=0; i<5;i++){
          x[i]= s.nextInt();
        }
        System.out.println("Enter a number to see");
        int target=s.nextInt();
        int findSum=0;
        for (int i=0;i<x.length;i++){
            int z=0;
for(int r=i;r<x.length-1;r++){
    z=0;
    findSum=sum(x[i],x[r+1]);
    z=z+findSum;
    findSum=0;
    if (target==z){
        System.out.println((x[i]) +" "+ x[r+1]);
    }
}
        }
    }public static int sum(int a, int b){
        return a+b;
    }
}
