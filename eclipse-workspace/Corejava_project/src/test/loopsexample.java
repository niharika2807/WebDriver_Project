package test;

public class loopsexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while loop when you don't know the limit

		int x = 13;
		int y = 1;

		while (y <= 10) {

			int result = x * y;
			System.out.println(result);
			y = y + 1;
		}

		System.out.println("end of while loop");

		// print table using for loop when you know the limit

		for (int i = 1; i <= 10; i++) {

			System.out.println(x * i);
		}

		System.out.println("end of for loop");

		// for each loop when you have data here in form of array

		String[] names = { "Jon", "Adam", "Eva", "Nancy" };

		for (String str : names) {
			System.out.println(str);
		}

		// same this using normal for loop to print a specific index value then it is helpful.
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

}









