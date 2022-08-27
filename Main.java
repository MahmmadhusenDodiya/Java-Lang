import java.util.Scanner;

public class Main
{
    
	public static void main(String[] args) {
        
        // DataTypes();
        // STRING();
        // MATH();
        // ARRAY();
         INPUT();
    
        
	}
	
	static void INPUT()
	{
	    Scanner sc=new Scanner(System.in);
	    int age=sc.nextInt();
	    System.out.println("Your age is ="+age);
	    
	    
	    String name=sc.next();
	    System.out.println("Your name is="+name);   // only upto next space
	    name=sc.nextLine();  
	    System.out.println("Your Full name is"+name); // Entire line upto enter
	    
	    //float nextFloat()	
	    //double nextDouble()
	    //String nextLine()	
	    
	}
	
	
	static void ARRAY()
	{
	    String[] cars;   // Making array
	    int[] myNum = {10, 20, 30, 40};

	    int []marks=new int[3];               // array initalized with zero
	    int dp[][]=new int[10][20];
	    
	    System.out.println(marks.length);
	   
	    System.out.println(marks[0]);
        
	}
	
	static void MATH(){
	    System.out.println(Math.sqrt(64));
	    System.out.println(Math.max(10,90));
	    System.out.println(Math.abs(-4.7));
	    
	}
	
	static void STRING()
	{
	    String s="PDPUatGujarat";
	    String t="AtIndia";
	    System.out.println(s);
	    System.out.println(s.charAt(1));
	    String q=s+t;
	    System.out.println(q);
	    
	    
	     String str = "GeeksForGeeks";
  
        char[] ch = str.toCharArray();
  
        for (char c : ch) {
  
            System.out.print(c+" ");
        }
	}
	
	
	
	
	static void DataTypes()
    {
        // For Printing
        // 1.\'	    '	Single quote
        // 2.\"	    "	Double quote
        // 3.\\  	\	Backslash
        
        // Data Types
        int x=12;
        boolean isOk=true;
        float f=3.14f;
        System.out.println("This is f="+f);
        
         //Type casting
        int F=(int)f;
        System.out.println("This is F="+F);
    }
}

