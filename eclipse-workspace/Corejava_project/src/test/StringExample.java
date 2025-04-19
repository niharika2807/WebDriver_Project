package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("James Bond");
		System.out.println("James");
		System.out.println("Bond");
		
		String fname= "Nihu";
		String lname= "Singh";
		String space = "  ";
		
		System.out.println(fname);
		System.out.println(lname);

		//String fullname= fname+' '+lname;
		//System.out.println(fullname);

		
		String fullname= fname+ space +lname;
		System.out.println(fullname);
		System.out.println("Total chars in full name is " + fullname.length());
		System.out.println("first chars in full name is " + fullname.charAt(0));
		System.out.println("second chars in full name is " + fullname.charAt(1));
		String newname = fullname.replace("Bond", "Scott");
		System.out.println(newname);


		
	}

}
