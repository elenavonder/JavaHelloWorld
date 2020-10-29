package com.maxtrain.elena;
//util is a package. ArrayList is a class.
import java.util.ArrayList;
//any class in util package
import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
		//Equivalent to Console.Writeline();
		System.out.println("Hello Java World");
		
		//cannot be null
		int i =0;
		//can be null. Capital letter means class
		Integer m = null;
		var n =1;
		//cannot be null
		boolean b = true;
		//can be null. Capital letter means class
		Boolean e = null;
		//can be null. Capital letter means class
		String s ="Elena";
		//fixed array
		int[] ints = new int[] {1,2,3,4,5};
		//Equivalent to List<int>
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(1);
		//Equivalent to Dictionary<int, string>
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		//Hash (also in C#) takes a value and turns it into a unique number to find it quickly
		hashmap.put(1, "First String");
		//Equivalent to foreach(). : instead of in
		var sum = 0;
		for(var idx : ints) {
			sum += idx;
		}
		System.out.println ("sum is " + sum);
		
		//Equivalent to for (;;;)
		var sum1 = 0;
		for(var idk = 0; idk <= 10; idk++) {
			sum1 += idk;
		}
		System.out.println("sum of numbers 1 to 10 is " + sum1);
	}

}
