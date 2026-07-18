package poorna_java;


		

		import java.util.Scanner;

		public class array {

			public static void main(String[] args) {

//				single dimension array
				
//				int ar[] = new int[5];
//				ar[0] = 10;
//				ar[1] = 15;
//				ar[2] = 25;
//				ar[3] = 40;
//				ar[4] = 50;
//				System.out.println(ar[0]);
//				System.out.println(ar[1]);
//				System.out.println(ar[2]);
//				System.out.println(ar[3]);
//				System.out.println(ar[4]);
				
				
//				array iterate the for loop
				
//				for (int i=0 ; i<ar.length ; i++) {
//					System.out.println(ar[i]);
//				}
				
//				for each loop or enhanced for loop
				
//				for(int v:ar) {
//					System.out.println(v);
//				}
				
				
//				array with scanner
				
				Scanner scan = new Scanner(System.in);
//				System.out.print("enter the array size :");
//				int size = scan.nextInt();
//				int ar1[] = new int[size];
//				
//				for(int i = 0; i<size; i++) {
//					System.out.print(" enter the "+i+" index value: ");
//					ar1[i] = scan.nextInt();
//				}
//				for(int v:ar1) {
//					System.out.println(v);
//				}
				
				
//				multi dimension array
				
				int td[][] = new int[2][3];
				td[0][0]=10;
				td[0][1]=15;
				td[0][2]=20;
				td[1][0]=25;
				td[1][1]=35;
				td[1][2]=50;
				
//				System.out.println(td[0][0]);
				
//				for(int i=0; i<2; i++) {
//					for(int j=0; j<3; j++) {
//						System.out.print(td[i][j]+" ");
//					}
//					System.out.println();
//				}
				
//				nested enhanced for loop
//				
//				for (int a[]: td) {
//					for(int v:a) {
//						System.out.print(v+" ");
//					}
//					System.out.println();
//				}
				
//				2D array  
				
				
//				Scanner scan = new Scanner(System.in);
//				System.out.print("enter the array size: ");
//				int row = scan.nextInt();
//				
//				System.out.print(" enter the array column size: ");
//				int column = scan.nextInt();
//				
//				int arr[][] = new int[row][column];
//				
//				for(int i=0; i<row; i++) {
//					for(int j=0; j<column; j++) {
//						System.out.print("array row :"+i+" column :"+j+" : ");
//						arr[i][j] = scan.nextInt();
//					}
//				}
//				
//				for(int a[]:arr) {
//					for(int v:a) {
//						System.out.print(v+" ");
//					}
//					System.out.println();
//				}
				

//				array task
				
//				1. sum of array elements 
				
//				int a[] = { 10, 20, 30, 40, 50 };
//				int ae = a[0];
//				
//				int sum = 0;
//						
//				for(int i=0; i<a.length; i++) {
//					sum += a[i];
//				}
//				System.out.println("sum: "+sum);
				
//				2. largest element in array
				
//				int l[] = { 12, 45, 7, 89, 23 };
//				int largest = l[0];
//				
//				for(int i=0; i<l.length; i++) {
//					if(l[i]>largest) {
//						largest = l[i];
//					}
//				}
//				System.out.println("largest elements in array :"+largest);
				
				
//				3. smallest elements in array
				
//				int s[] = { 12, 45, 7, 89, 23 };
//				int smallest = s[0];
//				
//				for(int i=0; i<s.length; i++) {
//					if(s[i]<smallest) {
//						smallest = s[i];
//					}
//				}
//				System.out.println("smallest elements in array :"+smallest);
				
				
//				4. reverse in array
				
//				/.println();
				
				
//				5. count even and odd numbers
				
				int a[] = { 1, 2, 3, 4, 5, 6 };
				int even = 0; 
				int odd = 0;
				
				for(int i=0; i<a.length; i++ ) {			
					if(a[i] % 2 == 0) {
						even+=1;
					}
					else {
						odd+=1;
					}
					
				}
				System.out.println(" even:"+even);
				System.out.println(" odd:"+odd);
				
				
//				7. sort an array ( ascending order )
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}

		}


	


