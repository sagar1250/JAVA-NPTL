## To fint maximum and minimum value from the given set of array

import java.util.Scanner;
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];
        
        
        for(int i = 0; i<size; i++){
            num[i] = sc.nextInt();
            
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i<num.length;i++){
            if(num[i] < min){
                min = num[i];
            }
            if(num[i] > max){
                max = num[i];
            }
        }
        
        System.out.println("Minimum value is " + min);
        System.out.println("Maximum value is " + max);
    }
}
