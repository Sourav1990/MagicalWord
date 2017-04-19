package com.niit.magicword;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class MagicalWord {
	public static void main(String [] args) throws IOException{
		int n,n1,flag=0,count = 0,temp=0;
		int[] array;
		int max = 90;
		String outPutText="";
		Scanner scan = new Scanner(System.in);
		 BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	
            System.out.println("Enter the number of test cases(T)");
            n=scan.nextInt();
	
            
           
            		// TODO Auto-generated method stub
            		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
            	        
                    	System.out.println("Enter name: ");
            			String k = br.readLine();
            			for (int j = 0; j < k.length(); j++) {
            			
            				char a = k.charAt(j);
            	
            				/* outPutText += a;*/
            				System.out.print(nearestPrime(a, a));
            				}
            			
            				System.out.println();
            		
             
        
	
	}
		private static char nearestPrime(char a, char b) {
			int leftascii = (int) a;
			int rightascii = (int) b;
			boolean left = false;
			boolean right = false;
			if ((leftascii >= 65 && leftascii <= 91) || ((leftascii >= 97 && leftascii <= 123))) {
				left = isPrime(leftascii);
			}
			if ((rightascii >= 65 && rightascii <= 91) || ((rightascii >= 97 && rightascii <= 123))) {
				right = isPrime(rightascii);
			}
	 
			if ((left && right) || left) {
				char result = (char) leftascii;
				return result;
			} else if (right) {
				char result = (char) rightascii;
				return result;
			} else {
				return nearestPrime((char) (leftascii-1), (char) (rightascii+1));
			}
		}
		private static boolean isPrime(int n) {
			 
			int k = (int) Math.sqrt(n) + 1;
			for (int i = 2; i <= k; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
}


	
	


	




