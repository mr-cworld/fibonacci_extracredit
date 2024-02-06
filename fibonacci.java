// Initial Code from the Online GDB link // 

import java.util.Scanner;
public class fibonacci
{
	public static void main(String[] args) {
	    /**Modify this code so that the user can generate the number 
	    of sequences and continually allow the end user to enter a new
	    number of sequences
	    
	    */
        //Variables
        String userinput = "";
        int sequenceCount = 1; //starting variable for how many times to run the sequence

        // create Scanner
        Scanner scnr = new Scanner(System.in);


        //PreLoop - giving better intro 
        System.out.println("Welcome to the Fibonacci Simulator, take a look at it for the first 10 numbers!");
		int n1=0,n2=1,n3,i,count=10;    
        System.out.print(n1+" "+n2);//printing 0 and 1 
        
        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
         {    
              n3=n1+n2;    
              System.out.print(" "+n3);    
              n1=n2;    
              n2=n3;    
         }     
       

    while (!userinput.equals("N")) {
        
        System.out.println();
        System.out.print("Would you like to select a new number? (N to end): ");
        userinput = scnr.nextLine().toUpperCase(); //googled the toUpperCase as well instead of making more if/then statements

       
        if (userinput.equals("N")) {
           System.out.println("Thank you for running the simulation!");
            break;
        }
        else {
           System.out.print("Great! How many numbers of the sequence do you want to see? ");
           sequenceCount = scnr.nextInt();
           scnr.nextLine(); // to consume the newline charector?? googled this
        }

        System.out.print("0 1 "); // start sequence manually

        generateFibonacci(sequenceCount);
         
        
    }



       scnr.close();  
	}

    public static void generateFibonacci(int sequenceCount) {
	int n1=0,n2=1,n3,i;  
    
    for(i=2;i<sequenceCount;++i)
    {    
         n3=n1+n2;    
         System.out.print(" "+n3);    
         n1=n2;    
         n2=n3;    
    }  
}

}