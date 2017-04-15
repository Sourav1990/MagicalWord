package com.niit.magicword;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MagicalWord {
	public static void main(String [] args) throws IOException{
		int n,i,flag=0,count = 0,temp=0;
		
		 BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		do
        {
            System.out.println("Enter the number of test cases(T)");
            n=Integer.parseInt(in.readLine());
            System.out.println("Enter the String/Strings");
            for(i=1;i<=n;i++)
           {
            	  
                      
            	System.out.println("Enter name: "+ i);
            	String name = in.readLine();
            	/*name += Name[i];*/
            	char[] asciivalue = name.toCharArray();
            	for(char ch:asciivalue){
            		int value=(int)ch;
			        //System.out.println(value+"  "+ch);
			        for(int j=2;j<=value/2;j++){ 
			        	if(value%j==0){
			        		
			        		System.out.println("Number is not prime"+value);
			        		flag=1;
			        			break;
			        		    
			        		}
			        		   
			        	}
			        
			        if(flag==0) 
			        {
			        	
			        }
              }
              
           }
        }while(!((n<10)&&(n>0)));
		
	}
}


