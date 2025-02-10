import java.util.Scanner;

public class PracticeProblem {
	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input a number: ");

		double num = sc.nextDouble();
		sc.nextLine();

		System.out.println(Math.abs(num));
		
	}

	public static void q2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input a number: ");
		double num = sc.nextDouble();
		sc.nextLine();

		System.out.print("Input another number: ");
		double num2 = sc.nextDouble();
		sc.nextLine();

		System.out.println(Math.floor(num/num2));
		System.out.println(Math.ceil(num/num2));

	}

	public static void q3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input a number: ");
		double num = sc.nextDouble();
		sc.nextLine();

		System.out.println(Math.round(Math.sqrt(num)));

		
	}

	public static void q4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input a number: ");
		double num = sc.nextDouble();
		sc.nextLine();

		System.out.print("Input another number: ");
		double num2 = sc.nextDouble();
		sc.nextLine();

		System.out.println(Math.pow(num,num2));
		
		
	}

	public static void q5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input a number: ");
		double num = sc.nextDouble();
		sc.nextLine();

		System.out.print("Input another number: ");
		double num2 = sc.nextDouble();
		sc.nextLine();

		System.out.print("Input one more number: ");
		double num3 = sc.nextDouble();
		sc.nextLine();

		double maxOne = Math.max(num,num2);
		double maxTwo = Math.max(num3,maxOne);

		double minOne = Math.min(num,num2);
		double minTwo = Math.min(num3,minOne);

		System.out.println(maxTwo);
		System.out.println(minTwo);

	}
	public static void q6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input a sentence: ");
		String sen = sc.nextLine();

		System.out.println(sen.contains("on"));

		
	}
	public static void q7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input the word mango: ");
		String mango = sc.nextLine();

		System.out.println(mango.equalsIgnoreCase("mango"));
		
	}
	public static void q8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input a word: ");
		String word = sc.nextLine();

		System.out.print("Input a letter: ");
		String letter = sc.nextLine();

		System.out.println(word.indexOf(letter));
		System.out.println(word.lastIndexOf(letter));
	}

	public static void q9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input a sentence: ");
		String sen = sc.nextLine();

		System.out.println("Your sentence is "+ sen.length() +" characters long");

		
	}
	public static void q10() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input a sentence: ");
		String sen = sc.nextLine();

		System.out.print("Input a word to replace: ");
		String wordReplace = sc.nextLine();

		System.out.print("What word would you like to replace it with: ");
		String wordNew = sc.nextLine();

		System.out.println(sen.replaceFirst(wordReplace, wordNew));
		
	}

	public static void q11() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input a sentence: ");
		String sen = sc.nextLine();

		System.out.println(sen.toUpperCase().trim());
		System.out.println(sen.toLowerCase().trim());
	}

	public static void q12() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input a word: ");
		String word = sc.nextLine();

		System.out.println(word.substring(0,4));
		System.out.println(word.substring(word.length()-4,word.length()));
		
		
	}
	

}
