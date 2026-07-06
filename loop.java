package poorna_java;

public class loop {

	public static void main(String[] args) {
		
				
				
//				 for increment

				
//				 square pattern
			
			    for(int  i=0; i<=4;i++) {
			     for(int j=0;j<=4;j++) {
				       System.out.print("*"+" ");
		     }
		         System.out.println();
			      }

				   
				
			//increment pattern/half pyramid
				
				for(int i = 0; i<=4; i++) {
					for(int j=0;j<=i;j++) {
						System.out.print(i+"");
					}
					   System.out.println();	
					   
				
			}
				     
			      
			// decrement pattern
					
					for(int i = 0; i<=4; i++) {
					for(int j=4;j>=i;j--) {
						System.out.print(i+"");
						}
					   System.out.println();				   
				}

			   
			// full pyramid
					
			 for(int i=0;i<=4;i++) {
					for(int j=4;j>=i;j--) {
						System.out.print(" "+" ");
					}
				 for(int j=0;j<=i;j++) {
					 System.out.print("*"+" ");
					}
			     for(int j=0;j<=i-1;j++) {
			    	 System.out.print("*"+" ");
			     
			     } 
				    System.out.println();
				 }

			     
			    //inverted full pyramid
					
//				for(int i=0;i<=4;i++) {
//					    for(int j=4;j<=i;j--) {
//					    	System.out.print(" "+" ");
//					    }
//				    }
//					  for(int j=0;j>=i;j++) {
//					  System.out.print(i+" ");
//					  }
//					   for(int j=0;j>=i+1;j++) {
//						   System.out.print(j+" ");
//					   }
//					      System.out.println();
//					}

			//   hallow pattern square
					
			System.out.println("**** i value square****");
				for(int i=0;i<=4;i++) {
				 for(int j=0;j<=4;j++) {
					System.out.print(i+" ");
//				 }
//				    System.out.println();
//				}
//			        System.out.println("**** j value square****");
//			        for(int i=0;i<=4;i++) {
//			       	 for(int j=0;j<=4;j++) {
//			       		System.out.print(j+" ");
//			       	 }
//			       	    System.out.println();
//			       	}

//					hallow square 
					
//					for(int i=0;i<=4;i++) {
//					 for(int j=0;j<=4;j++) {
//						 if(i==0||i==4||j==0||j==4) {
//						   System.out.print("*"+" ");	 
//						 }
//						 else {
//							 System.out.print(" " +" ");
//						 }
//						 		 }
//					 System.out.println();
//					}
					
					
					// plus square 
					
//					for(int i=0;i<=4;i++) {
//						 for(int j=0;j<=4;j++) {
//							 if(i==2||j==2) {
//							   System.out.print("*"+" ");	 
//							 }
//							 else {
//								 System.out.print(" " +" ");
//							 }
//							 		 }
//						 System.out.println();
//						}
			//
					
					
					
					// cross pattern
					
//					for(int i=0;i<=4;i++) {
//					 for(int j=0;j<=4;j++) {
//						 if(i==j||i+j==4) {
//							 System.out.print("*"+" ");
//						 }
//						 else {
//							 System.out.print(" "+" ");
//						 }
//					 }
//					 System.out.println();
//					}
//					
					
				
					
					
					
					
					
					
					
					
					
				}
				
			}



	}

}
