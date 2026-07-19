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
				
				
6. search an elements in array
		
//		int a[] = { 10, 20, 30, 40 };
//		int search = 30;
//		
//		boolean found = false;
//		
//		for (int i=0; i<a.length; i++) {
//			if(a[i]==search) {
//				System.out.println(" elements found in index:"+i);
//				found = true; 
//				break;
//			}
//		}
//		if(found) {
//			System.out.println("element not found");
//		}
		
//		7. sort in array(ascending order)
		
//		int b[] = { 5, 2, 8, 1, 9 };
//		
//		for(int i=0; i<b.length; i++) {
//			for(int j=0; j<b.length; j++) {
//				if(b[i]<b[j]) {
//					int temp = b[i];
//					
//					b[i]=b[j];
//					b[j]=temp;
//				}
//			}
//		}
//		System.out.println("sort in array:");
//		
//		for(int i=0; i<b.length; i++) {
//			System.out.println(b[i]+" ");
//		}
		
//		8. copy one array to another
		
//		int c[] = {10, 20, 30, 40 };
//		int d[] = new int[c.length];
//		
//		for(int i=0; i<c.length; i++) {
//			d[i] = c[i];
//		}
//		System.out.println(" copy array ");
//		
//		for(int i=0; i<d.length; i++) {
//			System.out.println(c[i]+" ");
//		}
		
//		9. find duplicate elements in array
		
//		int d[] = { 1, 2, 3, 2, 4, 5, 1};
//		
//		System.out.println(" duplicate elements: ");
//		
//		for(int i=0; i<d.length; i++) {
//			for(int j=0; j<d.length; j++) {
//				if(d[i]==d[j]) {
//					System.out.println(d[i]+" ");
//				}
//			}
//		}
		
//		10. merge two arrays 
		
		int a[] = { 1, 2, 3 };
		int b[] = { 4, 5, 6 };
		
		int c[] = new int[a.length+b.length];
		
		for(int i=0; i<a.length; i++) {
			c[i] = a[i];
		}
		for(int i=0; i<b.length; i++) {
			c[a.length + i] = b[i];
		}
		System.out.println(" merge array :");
		
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]+" ");
		}
		
		
//		11. second largest elements 
		
		int s[] = { 10, 50, 30, 20, 40 };
		
		for(int i=0; i<s.length-1; i++) {
			for(int j=i+1; j<s.length; j++) {
				if(s[i]>s[j]) {
					int temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		System.out.println("second largest ="+ s[s.length-2]);
		
		
//		12. frequency of each elements 
		
//		int f[] = { 1, 2, 2, 3, 1, 1 };
//		
//		for(int i=0; i<f.length; i++) {
//			int count =0;
//		
//			for(int j=0; j<f.length; j++) {
//				if(f[i] == f[j]) {
//					count ++;
//					f[j] = -1;
//				}
//			}
//		}
//         System.out.println(f[i]+" times ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}

		}


	


