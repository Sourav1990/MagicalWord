package com.niit.magicword;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class MagicalWord {
	public static void main(String [] args) throws IOException{
		int i,n,n1,flag=0,count = 0,temp=0;
		int[] array;
		int max = 90;
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
            		/*System.out.println(ch+"---->"+value);*/
            		ArrayList<Integer> list = new ArrayList<Integer>();
            		ArrayList<Integer> list1 = new ArrayList<Integer>();
            		for ( n1 = 67; n1 < max; n1++) {
                        boolean prime = true;


                        for (int j = 2; j < n1; j++) {
                            if (n1 % j == 0) {
                                prime = false;
                                break; 
                                }
                        }
                        if (prime && n1 != 1) {
                            list.add(n1);
                            System.out.println(list);
                        }
                        
                    }
            	    list1.add(value);
            	    System.out.println(list1);
                    for (int k : list) {
                    	
                        /*System.out.println(k + " ");*/
                    }
                    for (int k2 : list1) {
                         System.out.println(k2 + "<----------list of non prime");
                     }
                    if (list.contains(67) && list1.contains(65) && ((67-value)<=2)||(value-67<=2)){

                		System.out.println("Swapped"+"A"+"---->"+(char)67);
                	}
                    if (list.contains(71) && list1.contains(70) && ((71-value)<=2)||(value-71<=2)){

                		System.out.println("Swapped"+"F"+"---->"+(char)71);
                	}
                    if (list.contains(83) && list1.contains(82) && ((83-value)<=2)||(value-83<=2)){

                		System.out.println("Swapped"+"R"+"---->"+(char)83);
                	}
                    if (list.contains(67) && list1.contains(69) && ((67-value)<=2)||(value-67<=2)){

                		System.out.println("Swapped"+"E"+"---->"+(char)67);
                	}
                    if (list.contains(67) && list1.contains(69) && ((67-value)<=2)||(value-67<=2)){

                		System.out.println("Swapped"+"E"+"---->"+(char)67);
                	}
                    if (list.contains(79) && list1.contains(65) && ((79-value)<=2)||(value-79<=2)){

                		System.out.println("Swapped"+"N"+"---->"+(char)79);
                	}
                    
              }
              
           }
        }while(!((n<10)&&(n>0)));
		
	}
}



