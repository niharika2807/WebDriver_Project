package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "This is Automation Testing Masters Program";
		//*String out = "sihT si noitamotuA gnitseT sretsaM margorP";
		
		String[] arr1 = str1.split(" ");
		
		for(String name:arr1) {
			printReverse(name);
			System.out.print(" ");
		}
		

	}
	
	
		public static void printReverse(String name) {
		    char[] charArray = name.toCharArray();
		    
		    for (int i = charArray.length - 1; i >= 0; i--) {
		        System.out.print(charArray[i]);
		    }
		}

		
}
