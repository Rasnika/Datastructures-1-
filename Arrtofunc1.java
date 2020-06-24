/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrtofunc1;
import java.util.*;
/**
 *
 * @author Rasnika
 */
public class Arrtofunc1 {
  
        
   int removeDuplicates(int[] nums) 
   {
       int j=0;
       if(nums.length==0)
           return 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j++]=nums[i];
            }
              
}
       nums[j++]=nums[nums.length-1];
            return j;
   }

        
        

         



    public static void main(String[] args) {
        int i,size;
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of elements of array");
       size=sc.nextInt();
         int[] nums=new int[size];
         System.out.println("enter the elements");
         for(i=0;i<size;i++)
             nums[i]=sc.nextInt();
         Arrtofunc1 a=new Arrtofunc1();
       int n = nums.length;
        n=a.removeDuplicates(nums);
        System.out.println("sorted order without duplicates");
        for(i=0;i<n;i++)
        System.out.println(nums[i]);
        System.out.println("length of the new array is"+n);
         
         
       
                
    }

   
}
