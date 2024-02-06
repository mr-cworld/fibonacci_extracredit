// Initial Code from the Online GDB link // 

import java.util.Scanner;

public class fibonacci
{
	public static void main(String[] args) {
	    /**Modify this code so that the user can generate the number 
	    of sequences and continually allow the end user to enter a new
	    number of sequences
	    
	    */
		 int n1=0,n2=1,n3,i,count=10;    
         System.out.print(n1+" "+n2);//printing 0 and 1    
            
         for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
         {    
              n3=n1+n2;    
              System.out.print(" "+n3);    
              n1=n2;    
              n2=n3;    
         }   
	}
}