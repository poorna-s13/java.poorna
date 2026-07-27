package poorna_java;

public class operators {

	public static void main(String[] args) {
		//1.Find the average value
		
		 int num1 = 30;
		 int num2 = 20;
		 int num3 = 10;
		 double average_value =(num1+num2+num3)/3;
		 System.out.println("num1+num2+num3:"+average_value);
	
		
//		2. Find the area of circle
		 
	     double pi =3.14;
	     int r = 60;
	     double area_of_circle =pi*(r*r);
		
	     System.out.println("area_of_circle :"+area_of_circle);
	     
	     
	    //  find the area of square
    
	   // A = a*a
//	     
       double A = 2.20;
	     int a = 15;
	     double area_of_square =A*(a*a);
	     
	     System.out.println("area_of_square :"+area_of_square);
	     
	     
	     
	     
	     // find the area of triangle
	     
	     
//	    A = 1/2*b*h;
//	    
//	     int b = 20;
//	     int h = 15;
//	     double area_of_triangle =((1/2)*b*h);
//	     System.out.println("area of triangle :"+area_of_triangle);
	

	     
	   // 3.convert celsius to fahrenheit
	     
	     // F =(c*(9/5)+32)
	     
	        int c= 20;
	        double convert_celsius_to_fahrenheit =((9/5)+32);
	        System.out.println("convert celsius to fahrenheit:"+convert_celsius_to_fahrenheit);
	     
	     
	    // 4.convert fahrenheit to celsius 
	     
	     // C =(F-32)/(5/9)
	     
	        int C = 30;
	        double convert_fahrenheit_to_celsius =32/5/9;
	        System.out.println("convert_fahrenheit_to_celsius:"+convert_fahrenheit_to_celsius);
	     
	     
	     //5.calculate simple interest 
	     
	     // simple interest =p*r*t
	     
	       int p = 10000;
	       int R = 5000;
	       int t = 3000;
	       double simple_interest=p*r*t;
	       System.out.println("simple_interest:"+simple_interest);

	     
	    //6.calculate compound interest
	    
	    // compound interest =p(1+r/n)^n*t
	     
//	     int R =2000;
//	     int n=50;
//	     int t =4;
//	     double compound_interest=((1+r/n)^n*t);
//	     System.out.println("compound_interest:"+compound_interest);	
	     
	     
	    //7.swap two numbers using a temporary variables 
	     
	    // two numbers a=b;
	      
//	       int a = 10;
//	       int b = 15;
//	       int t = a;
//	       System.out.println("Before Swap : ");
//	       System.out.println("a : "+a);
//	       System.out.println("b : "+b);
//	       a = b;
//	       b = t;
//	       System.out.println("After Swap : ");
//	       System.out.println("a : "+a);
//	       System.out.println("b : "+b);
//	      
	      
         // 8.swap two numbers without using a temporary variables 
	    
//	       int a = 30;
//	       int b = 40;
//	       System.out.println("before swap:");
//	       System.out.println("a:"+a);
//	       System.out.println("b:"+b);
//	       a=a+b;
//	       b=a-b;
//	       a=a-b;
//	       System.out.println("after swap:");
//	       System.out.println("a:"+a);
//	       System.out.println("b:"+b);
	    		   
	       //9.square root of number
	       
//	      double sq=58;
//	      System.out.println("square root value:"+ Math.pow(sq, 0.5));
	       
	     //10.display the last digit of a number 
//	      int b = 138;
//	       int l =b %100;
//	       System.out.println("display last digit:"+l);
//	       
	       
	       
	       //1.A student buy 3 notebooks with different prices.write a java program to calculate the total amount
	       
//	       int note1 = 50;
//	       int note2 = 40;
//	       int note3 = 30;
//	       
//	       	 int total = note1 + note2 + note3;
//	       	 System.out.println("Total Amount =:"+total);
      	 
	       	//2.A shopkeeper sells 5 pens.write a java program to find the total cost of all pens  
//	       
//	          int pen1 = 5;
//	          int pen2 = 10;
//	          int pen3 = 15;
//	          int pen4 = 20;
//	          int pen5 = 25;
//	           
//	          int tot = pen1 + pen2 + pen3 + pen4 + pen5;
//	          System.out.println("Total cost:"+total_cost);
	       
          //3.Ram scored marks in 3 subjects. write a java program to calculate the average mark.
	       
	       
//	       int sub1 = 97;
//	       int sub2 = 98;
//	       int sub3 = 99;
//	        
//	       int average_mark = sub1 + sub2 + sub3/3;
//	       System.out.println("sub1 + sub2 + sub3 :"+average_mark);
//	       
	       
         // 4.A pizza cost ₹250.write a java program to calculate the total price for 4 pizzas	  
	       
//	       int worker;
//	       
//	       double total_price = 4*250;
//	       System.out.println("4*worker:" + total_price);
	       
         //5.A worker gets ₹800 salary per day.write a java program to calculate salary for 30 days.
	       
	       
//	       int wrk;
//	       double calculate_salary = 800/30;
//	       System.out.println("800/30:"+calculate_salary);
	      
          // 6.A mobile phone price is ₹15000.write a java program to add 18% GST and find the final amount
	       
	       
//	       int price;
//	       double final_amount = 15000+18*100;
//	       System.out.println("15000+1800:"+final_amount);
//	       
////	       7.A student has ₹500.After buying books for ₹320.write a java program to find the remaining balance.
//	       
//	       int student = 500;
//	       int buying_books = 320;
//	       double remaining_balance =(500-320);
//	       System.out.println("remaining_balance:"+remaining_balance);
//  
////	     8.A persons monthly income is ₹25000 and expenses are ₹18000.write a java program to calculate savings.
//	     
//	     int monthly_income = 25000;
//	     int expenses = 18000;
//	     double calculate_savings = 25000-18000;
//	     System.out.println("calculate_savings:"+calculate_savings);
//	       
//	    //9.A rectangle-shaped garden has length 20 and breadth10.write a java program to find the area
//         //area = length*breadth
//	       int length = 20;
//	       int breadth = 10;
//	       double find_area = length*breadth;
//	       System.out.println("find_area:"+find_area);
//	       
//	      //10.a bike travels 150 kilometers using 5 litres of petrol
//	        
//	       int bike_travels = 150;
//	       int petrol = 5;
//	       
//	       double calculate_mileage = 5*150;
//	       System.out.println("calculate_mileage:"+calculate_mileage);
//	       
//	    // 1.a student has ₹500 in his wallet.after buying a book for ₹120 using -=,find the remaining amount
//	       
//	       int balance = 500;
//	       int  book_price  = 120;
//	       balance-=book_price;
//	       System.out.println("available_balance:"+balance);
//	   
//	    //2.a company gives ₹2000 bonus to an employee using +=.find the updated salary.
//	       
//	       int salary = 18000;
//	       int bonus = 2000;
//	       
//	       salary+=bonus;
//	       System.out.println("updated_salary:"+salary);
//	       
//	    //3.A water tank contains 100 liters.20litres are added using +=.find total water.
//	       
//	       int initial_water = 20;
//	       int water_added = 100;
//	       initial_water +=water_added;
//	       System.out.println("total_water:"+initial_water);
//	    
//	    //4.mobile battery is 80%.after using 15% battery with -=,find remaining battery.
//	        
//	       int battery = 80;
//	       int battery_used = 15;
//	       
//	       battery -= battery_used;
//	       System.out.println("remaining_battery:"+battery);
//	    
//	       
//	    //5.a student doubles his savings using *=operator.initial amount = ₹1500.
//	       
//	       int initial_amount = 1500;
//	       int after_savings_doubles = 3000;
//	       
//	       initial_amount *= after_savings_doubles;
//	       System.out.println("initia_amount:"+after_savings_doubles);
//	       
//	       
//	     //11.A water tank contains 500 lit of water.125 lit are used.To find the remaining water
//	       
//	       int water_tank = 500;
//	       int water_used = 125;
//	       double remaining_water = water_tank - water_used;
//	       System.out.println("remaining_water:"+remaining_water);
//	       
//	    //12.A classroom has 48 students.they are divided equally into 6 groups.to find students in each group.
//	       
//	       int total_students = 48;
//	       int divided_groups = 6;
//	       double each_group = total_students/divided_groups;
//	       System.out.println("each_group:"+each_group);
//	       
//	    //13.A customer buys 2 shirts costing ₹750 each.To calculate the total bill.
//	       
//	       int shirt_cost = 750;
//	       int customer_buys = 2;
//	       double total_bill = customer_buys*shirt_cost;
//	       System.out.println("total_bill:"+total_bill);
//	       
//	    //14.A student travels 12km daily to college.to calculate the total distance traveled in 7 days.
//	       
//	       int student_travels = 12;
//	       int distance_traveled = 7;
//	       double total_distance = student_travels*distance_traveled;
//	       System.out.println("total_distance:"+total_distance);
//	       
//	   //15.A company gives a bonus of ₹5000 along with salary ₹25000.to calculate total salary.
//	       
//	       int company_bonus = 5000;
//	       int along_salary = 25000;
//	       double total_salary = company_bonus + along_salary;
//	       System.out.println("total_salary:"+total_salary);
//	       
//	  //16.A juice shop sells one juice for ₹40.to calculate amount for 8 juices.
//	       
//	       int one_juice = 40;
//	       int amount_juices = 8;
//	       double calculate_amount = one_juice*amount_juices;
//	       System.out.println("calculate_amount:"+calculate_amount);	 
//	       
//	  //17.A person deposits ₹10000 in a bank with 5% simple interest.to calculate interest amount.
//	       
//	       int person_deposits = 1000;
//	       int simple_interst = 500;
//	       double calculate_interest = person_deposits + simple_interst;
//	       System.out.println("calculate_interest:"+calculate_interest);
//	       
//	  //18.A cricket player scored runs:45,55 and 70 in 3 matches.TO calculate total runs.
//	       
//	       int scored1 = 45;
//	       int scored2 = 55;
//	       int scored3 = 70;
//	       int matches = 3;
//	       int total_scored = 170;
//	       double calculate_totalrun = total_scored*matches;
//	       System.out.println("calculate_totalrun:"+calculate_totalrun);
//	  
//	 //19.A students total marks in 450 out of 500.to calculate percentage.
//	       
//	      int total_marks = 450;
//	      int max_marks = 500;
//	      double calculate_percentage = total_marks*100/max_marks;
//	      System.out.println("calculate_percentage:"+calculate_percentage);
//	      
//    //20. A car travels 240km in 4hrs.to calculate speed.
//	      
//	     int car_travels = 240;
//	     int hrs = 4;
//	     double speed = car_travels*hrs;
//	     System.out.println("speed:"+speed);
//	     
	     
    }
  }


	
