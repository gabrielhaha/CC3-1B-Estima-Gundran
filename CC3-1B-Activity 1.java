package cc31b;

import java.util.Scanner;

public class CC31B {
        public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        double ele [] = new double[size];
        int i=0;
        int mean=0;
        int sum=0;
        
        for(i=0;i<ele.length; i++){
            System.out.println("Enter the elements for array: ");
            ele[i]=sc.nextInt();
        }
        System.out.println("Mean is : " + mean (ele));
        System.out.println("Mode is : " + mode (ele));
        
    }
        static double mean(double[]array){
        double num =0;
        for(int i=0;i<array.length;i++){
            num+=array[i];
        }
            System.out.println("Sum = " + num);
        
        return num/array.length;
        
    }
        static double mode(double[]array){  
        double modes =0;
        double count =0;
        for(int i=0;i<array.length;i++){
            int cnt = 0;
            for(int j=0; j<array.length;j++){
            if (array[j] == array[i]) ++cnt;
        }
        if (cnt > count){
            count = cnt;
            modes = array[i];
        }
        }
        return modes;
    }
   
}
