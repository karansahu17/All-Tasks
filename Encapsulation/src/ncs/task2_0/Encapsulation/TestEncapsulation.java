package ncs.task2_0.Encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*Create classes as per Class diagram.
 Encapsulation Implementation
 Exercise 
 1.When do you do encapsulation?
 2.What is done when an expert class is created?
 3.What is expert class?
 4.Why do you keep attributes private and getter and setter methods to access attributes?
 5.Which expert classes you have created for your project*/
public class TestEncapsulation {
	public static void main(String[] args) throws ParseException {
		Date dateOfJoining = new Date();
		Person person = new Person();
		person.setName("Sunrays");
		person.setAddress("Indore");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		dateOfJoining = sdf.parse("01-07-2014");
		person.setDateOfJoining(dateOfJoining);

		System.out.println(person.getName());
		System.out.println(person.getAddress());
		System.out.println(person.getDateOfJoining());
	
		
		//Account Class
		System.out.println("-------Account Class--------");
		Account account = new Account();
		account.setNumber("201178");
		account.setBalance(10000);
		account.setAccountType("saving");
		
		System.out.println(account.getNumber());
		System.out.println(account.getAccountType());
		System.out.println(account.getBalance());
		
		account.deposit(account.getBalance(), "2000");
		System.out.println(account.getBalance());
		
		
		//AutoMobile
		System.out.println("--------AutoMobile Class-----------");
		AutoMobile m = new AutoMobile();
		m.setColor("red");
		m.setMake("Hyundai");
		m.setSpeed(220);
		
		System.out.println("Color: "+m.getColor());
		System.out.println("Make: "+m.getMake());
		System.out.println("Speed: "+m.getSpeed());
	}
}
