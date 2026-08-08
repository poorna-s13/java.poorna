package learn_java;

public class functions {

//			1. without argument without return functions
			    
			public static void fire() {
				System.out.println(" fire mode in ON.... ");
			}
			
		//  2. with argument without return functions
			 public static void add(int a, int b) {
				 int c = a+b;
				 System.out.println(" add value : "+c);
			 }
			
//			 3. without argument with return functions
			 public static String demo() {
				 String c = " poorna ";
				 return c;
			 }
			 
//			 4. with argument with return functions
			 public static String palindrome(int num) {
				 int a = num;
				 int b = 0;
				 int t = a;
				 
				 while(t>0) {
					 int d = t%10;
					 b = b*10+d;
					 t = t/10;
				 }
				  if(b==a) {
					  return b+" is a palindrome";
				  }
				  else {
					  return b+" is not a palindrome";
				  }
			 }
			
//			 5. recursive functions
			 public static int fact(int n) {
				 if(n == 1||n == 0){
					 return 1;
				 }
				 else {
					 return n*fact(n-1);
				 }
			 }
			 
			//function tasks
				
				//1.without argument & without return
			
			//1.create a function welcome()
			  
			public static void Welcome() {
				System.out.println("welcome to java programming");
			}
			
			//2.creates a function line()
			
			 public static void line() {
				 System.out.println("===============");
			 }
			 
			 //3.create a function collegeName()
			 
			  public static void instituteName() {
				  System.out.println("Livewire institute");
			  }
			  
			  //4.create a function goodMorning()
			  
			    public static void GoodMorning() {
			    	 System.out.println("Good morning students");
			    }
			   
			  //2.with argument & without return
			    
			    //5.create a function square(int n)that prints the square of a number 
			    
			    public static void square(int n) {
			    	   System.out.println("square ="+(n*n));
			    	   
			    }
			    
			  //6. create a function multiply(int a,int b)that prints the multiplication results
			    
			     public static void multiply(int a, int b) {

			    	  System.out.println("Multiplication="+(a * b));
			     }
			     
//			     7. create a function display name(string name)that prints "hello<name>"
			        public static void displayname(String name) {
			        	System.out.println(" hello "+ name);
			        }
			    
//			     8. create a function even odd (int n) that prints whether
//			          the number is even or odd
			        public static void evenodd(int n) {
			        	  if(n % 2 == 0) {
			        		  System.out.println(" even ");
			        	  }
			        	  else {
			        		  System.out.println(" odd ");
			        	  }
			        }
			    
//			  9. create a function largest(int a, int b)that prints the 
//			        larger number
			        public static void largest(int a, int b) {
			        	if(a>b) {
			        		System.out.println(a);
			        	}
			        	else {
			        		System.out.println(b);
			        	}
			        }
			        
//			    10. create a function vatingAge(int age)that prints whether the person 
//			          is eligible to vote
			       public static void votingAge(int age) {
			    	    if(age >= 18) {
			    	    	System.out.println(" eligible to vote ");
			    	    }
			    	    else {
			    	    	System.out.println(" not eligible ");
			    	    }
			       }
			       
			       
			 	  //3. without argument & with return
			 	       
//			 	    11. create a function cityName() that returns your city name
			 	       public static String cityName() {
			 	    	     return "chennai";
			 	       }
			 	       
//			 	     12. create a function collegeCode()that returns an integer value
			 	       public static int collegeCode() {
			 	    	     return 1109;
			 	       }
			 	       
//			 	     13. create a function piValue()that returns 3.14
			 	       public static double piValue() {
			 	    	     return 3.14;
			 	       }
			 	       
//			 	     14. create a function message()that returns "java is easy"
			 	       public static String message() {
			 	    	     return "java is easy ";
			 	       }
			 	       

//			 	    4. with argument & with return
			 	       
//			 	    15. create a function cube(int n)that returns the cube of a number
			 	       
			 	       public static int cube(int n) {
			 	    	   return n*n*n;
			 	       }
			 	       
//			       16.create a function is positive(int n)that returns "positive" or "negative".
			 	       
			 	       public static String isPositive(int n) {
			 	    	     if(n>=0) {
			 	    	    	  return "positive";
			 	    	     }
			 	    	     else {
			 	    	    	   return "negative";
			 	    	     }
			 	    	   
			 	       }
//			       17.create a function reverseNumber (int n)
			 	       
			 	       public static int reverseNumber(int n) {
			 	    	        int rev = 0;
			 	    	        while(n!=0) {
			 	    	        	 rev = rev*10+n%10;
			 	    	        	 n=n/10;
			 	    	        }
			 	    	        return rev;
			 	       }
			 	       
//			 	      18.create a function isPalindrome (int n)
			 	       
			 	       public static String isPalindrome(int n)
			 	       {
			 	    	     int temp = n,rev =0;
			 	    	     while(temp!=0) {
			 	    	    	 rev = rev*10+temp%10;
			 	    	    	 temp = temp/10;
			 	    	     }
			 	       
			 	       if (rev==n)
			 	    	     return "palindrome";
			 	       else 
			 	    	      return "not palindrome";
			 }

//			 	       19.create a function countDigits(int n)
			 	       
			 	       public static int countDigits(int n) {
			 	    	   int count = 0;
			 	    	   while(n!=0) {
			 	    		   count++;
			 	    		   n=n/10;
			 	    	   }
			 	    	    return count;
			 	    	    
			 	       }
			 	   
//			         20.create a function sumOfDigits(int n)
			 	       
			 	       public static int sumOfDigits(int n) {
			 	    	     int sum = 0;
			 	    	     while(n!=0) {
			 	    	    	   sum = sum +n%10;
			 	    	    	   n=n/10;
			 	    	     }
			 	    	      return sum;
			 	       }
//			 	  	5.	recursive functions 
			 	  	
//			 		   1. to find the factorial of a number
			 		
			 		public static int factorial(int n) {
			 			if (n == 0||n == 1) 
			 				return 1;
			 				return n*factorial(n-1);
			 			}
			 		
//			 		   2. to calculate the sum of numbers from 1 to n
			 		  
			 		 public static int sum(int n) {
			 			 if(n == 1)
			 				 return 1;
			 			     return n + sum(n - 1);
			 		 }
			 		
//			 		   3. to print numbers from 1 to n
			 		 
			 		 public static void prints(int n) {
			 			 if(n == 0)
			 				 return;
			 			   print(n - 1);
			 			   System.out.print(n + " ");
			 		 }
			 		 
//			 		    4. to print numbers from n to 1 
			 		 
			 		 public static void print(int n) {
			 			 if (n == 0)
			 				 return;
			 			   System.out.println(n + " ");
			 			   print(n - 1);
			 		 }
			 		 
//			 		     5. to calculate the power of numbers (a^b)
			 		 
			 		 public static int power(int a, int b) {
			 			 if(b == 0)
			 				 return 1;
			 			 return a*power(a, b - 1);
			 		 }
			 		
			 		
			 		
			 
		   public static void main(String[] args) {
				
				fire();
				
				add(5,10);
				
				System.out.println(demo());
				
				System.out.println(palindrome(153));
				
				int f = fact(5);
				System.out.println("factorial value :"+f);
				
				
			//task
//				1.
				Welcome();
				line();
				instituteName();
				GoodMorning();
			    square(5);
//			    2.
				multiply(4,6);
				displayname("poorna");
		        evenodd(13);
		        largest(20, 15);
		        votingAge(20);
//		        3.
		        System.out.println(cityName());
		        System.out.println(collegeCode());
		        System.out.println(piValue());
		        System.out.println(message());
//		        4.
		        System.out.println(cube(3));
		        System.out.println(isPositive(2));
		        System.out.println(reverseNumber(12345));
		        System.out.println(131);
		        System.out.println(countDigits(456));
		        System.out.println(sumOfDigits(1112));
//		        5.
	 			System.out.println(factorial(5));
	 	        System.out.println(sum(3));
	 	        print(5);
	 	        print(3);
	 	        System.out.println(power(4, 6));
			

				
			



		        

				
				

			}

		


	}


