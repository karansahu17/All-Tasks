package ncs.task2_2.inheritstring;
/*Inherit java.lang.String class and make its specialized class.*/

public class StringInherit {
	public static void main(String[] args) {

		String name = "Vijay"; 
		name.toUpperCase(); 
		System.out.println(name);

		String newName = name.toUpperCase(); 
		System.out.println(newName);
		
		System.out.println(name);
	}
}
