package types;

import java.util.Random;
import java.util.Scanner;

public class types {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int value = 0;
		System.out.print("Insert the coin : ");
		value = input.nextInt();
		while(value!=0) {
		start(value);
		value--;
		}
	}
	/*public static void init() {
		
	}*/
	public static void start(int value) {
		String arr="abcdefghijklmnopqrstuvwxyz";
		String str="";
		//boolean start;
		quiz(arr,str,value);
		
	}
	 public static void quiz(String arr, String str, int value){
	    Random r = new Random();
	    for(int i = 0; i < 3; i++){
	    	str +=arr.charAt(r.nextInt(26));
	    }
	    System.out.println(str);
	    insert(str,value);
	}
	public static void insert(String str, int value) {
		Scanner input = new Scanner(System.in);
		String words = "";
		words = input.nextLine();
		/*char[] word = new char[3];
		for(int i = 0; i < 3; i++){
	    	word[i] = words.charAt(i);
	    }*/
		check(str,words,value);
	}
	
	private static void check(String str, String words, int value) {
		if(str.equals(words)) {
			System.out.println("correct");
		}
		else {
			System.out.println("wrong");
		}
		
	}

}
