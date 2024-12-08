package week4Assignment;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week4CodingProject {

	public static void main(String[] args) {
		
		// 1. 
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//1.a 
		//firstSubLast = (ages[ages.length-1]) - ages[0];
		System.out.print("1.a) 1st - last = ");
		printingfirstSubLast(ages);

		findingAverge(ages);
		
		//1.b 		

		int [] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 7};
		System.out.print("1.ii) ");
		printingfirstSubLast(ages2);
		
		//2 
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//System.out.println(names[0].length()); how to get the first elements length
		//2. a)
		int results = 0;
			for (int i=0; i<names.length; i++) {
				results += names[i].length();
			} System.out.println("2.a) " + results/names.length); 
		
		//2.b)
			StringBuilder concatenate = new StringBuilder();
			
			for (String name : names) {
				concatenate.append(name + " ");
			} System.out.println("2.b) " +concatenate.toString());
			
		//3 
			System.out.println("3) " + (names.length-1));
		//4
			System.out.println("4) "+ names[0]);
		
		//5	
			int [] nameLengths = new int[names.length];
			for (int i =0; i < names.length; i++) {
				nameLengths[i] = names[i].length();
			} //System.out.println(nameLengths[0]);
			
		//6 
			int sumOfNames =0;
			for (int length : nameLengths) {
				sumOfNames+= length;
			} System.out.println("6) " + sumOfNames);
			
		//7 
			System.out.println("7) "+ returningConcat("Hello",3));
		
		//8
			System.out.println("8) " + fullName(names[0],names[1]));
			
		//9
			System.out.println("9) "+ greaterThan100(ages));
		
		//11
			double [] firstArray =  {3, 9, 23, 64, 2, 8, 28, 93, 100};
			double [] secondArray = {3, 9, 23, 64, 2, 8, 28, 93};
			System.out.println("11) "+ firstArrayIsGreater(firstArray,secondArray));
 			
		//12
			boolean isHotOutside = true;
			double money = 10;
			System.out.println("12) "+ willBuyDrink(isHotOutside,money));
		
		//13
		//method to help figure out your part of the bill when going out with friends. 
		//	
		List<Double> restaurantBill = new ArrayList<Double>();
			restaurantBill.add(19.99);
			restaurantBill.add(30.00);
			restaurantBill.add(25.00);
			restaurantBill.add(15.00);
			
			int people = 5;
			double eachTipAmount = 40.00/people;
			System.out.print("13) ");
			System.out.println(String.format("%.2f",totalWithTaxes(restaurantBill, eachTipAmount)));
			
			//"%.2f" to print double in a 2 decimal format 
			
			
	// method to help figure out your part of the bill when going out with friends. 
	// This method adds all the items you ordered, sums it up, and then adds the taxes and tip to it
	}
	//13
	public static double totalWithTaxes (List<Double> menuItems, double tip) {
			double sum = 0;
			double taxRate = 1.0838;
			for (double item : menuItems) {
				sum +=item;
			} return (sum * taxRate) + tip;
			
		
	}
	
	
	
	//12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		double money = 10.50;
		
		if (isHotOutside && (moneyInPocket > money)) {   // if both represented by && are true then return true
			return true;
		} else {
			
		} return false;   // if 1 is false then whole thing is false 
			
	}
	//11
	public static boolean firstArrayIsGreater (double [] array1, double [] array2) {
		double sumArray1=0, sumArray2 =0;   
			for (double sum1 : array1) {
				sumArray1 += sum1;          
			} for (double sum2 : array2) {
				sumArray2 += sum2;          // these 2 above are the same concept as #10
			} if ((sumArray1/array1.length) > (sumArray2/array2.length)) { // takes both sums from array1 and 2 to compare if the first one is larger in average.
					return true;              // did the average in the paragraph above and compared the 2             
			}else {                           // returning true if 1st array is large or false if 2nd is large 
					return false;
		}		
		
	}
	
	
	
	//10
	public static double returnAverage (double[] arrays) {
		double sum =0.00;
		for (double num : arrays) {
			sum += num;
		} return sum/arrays.length;  //at the end get the total added up in sum and divide by length which is how many numbers were in the array to get average 
	}
	
	//9
	public static boolean greaterThan100 (int[] nums) {
		int result =0;
		for(int num : nums) {   //enhance for loop again to get all the elements in array
			result += num;      // same thing adding them all up and results holds value
		} if (result > 100) {   // after adding it if result is more than 100 then its true
			
		} return true;
	}
	
	//8
	public static String fullName(String firstName, String lastName) {
		StringBuilder fullName = new StringBuilder();  //now that we know StringBuilder found it easier that in #7 with a regular String but similar idea
		fullName.append(firstName + " ");      //adds firstName and a space in " " to fullName String
		fullName.append(lastName);			   // addes the lastName
		return fullName.toString();			   // groups it all together into a String to return 
	}
	
	
	//7
	public static String returningConcat(String word, int n) {
		String concat ="";
		for (int i =0; i <n; i++) {
			concat += word;  // similar to 1.c below concat hold the new String in concat and += keeps adding the word n number of times 
		} return concat;
	}
	
	
	//1.a 
	public static void printingfirstSubLast (int[] ages) {
		int firstSubLast = (ages[ages.length-1]) - ages[0];
		System.out.println( firstSubLast);
	}
	//1. c
	public static void findingAverge (int[] ages) { 
		int results =0;
		for(int age : ages) {   //enhance for loop to get all age in ages
			results += age;     // results hold the value and addes them all up
		} System.out.println("1.c) average " + results/ages.length);
	} 

}
