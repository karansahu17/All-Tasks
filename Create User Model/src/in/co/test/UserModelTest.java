/*Create User Model that will have dto, service and table as per given UML Diagram
UserService must be able to interact with database and perform desired operations
Search method must provide dynamic parameter search with help of Criteria object.*/
package in.co.test;

import in.co.dto.UserDTO;
import in.co.service.UserService;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UserModelTest {
	private static UserService service = new UserService();

	public static void testAdd() {
		UserDTO dto = new UserDTO();
		dto.setFirstName("Kevin");
		dto.setLastName("James");
		dto.setPassword("kev1234");
		dto.setEmail("kevindian@gmail.com");
		dto.setLoginId("kevindia");
		dto.setStatus(2);
		dto.setUnsuccessfullLogin(1);
		dto.setLastLoginDate(new Timestamp(new Date().getTime()));
		dto.setLockk(false);
		service.add(dto);
	}

	public static void testUpdate() {
		UserDTO dto = new UserDTO();
		System.out.println("Enter Id to Update...");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		dto.setId(id);
		dto.setFirstName("ssss");
		dto.setLastName("sssss");
		dto.setPassword("pass1234");
		dto.setEmail("sunrays.tech@Gmail.com");
		service.update(dto);
	}

	public static void testDelete() {
		UserDTO dto = new UserDTO();
		System.out.println("Enter Id to Delete...");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		dto.setId(id);
		service.delete(dto);
	}

	public static void testGet() {

		UserDTO dto = new UserDTO();
		System.out.println("Enter id to get Values");
		Scanner sc = new Scanner(System.in);
		int rol = sc.nextInt();
		dto = service.get(rol);
		System.out.println(dto.getFirstName() + "\t" + dto.getLastName() + "\t"
				+ dto.getPassword() + "\t" + dto.getEmail());
	}

	public static void testList() {
		List<UserDTO> userList = service.getList();

		Iterator<UserDTO> it = userList.iterator();
		while (it.hasNext()) {
			UserDTO studentDTO = (UserDTO) it.next();
			System.out.println(studentDTO.getFirstName() + "\t"
					+ studentDTO.getLastName() + "\t"
					+ studentDTO.getPassword() + "\t" + studentDTO.getEmail());
		}
	}

	public static void testSearch() {
		try {
			UserDTO dto = null;
			List<UserDTO> list = new ArrayList<UserDTO>();
			dto = new UserDTO();
			// dto.setFirstName("Kevin");
			dto.setId(1);
			// dto.setEmail("sun.tech@gmail.com");

			list = service.search(dto);
			if (list == null) {
				System.out.println("No matching data found");
			} else {
				Iterator<UserDTO> it = list.iterator();
				while (it.hasNext()) {
					dto = (UserDTO) it.next();
					System.out.println(dto.getId());
					System.out.println(dto.getFirstName());
					System.out.println(dto.getLastName());
					System.out.println(dto.getEmail());
					System.out.println(dto.getLoginId());
					System.out.println(dto.getPassword());
					System.out.println(dto.getStatus());
					System.out.println(dto.getLastLoginDate());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testAuthenticate() {
		try {
			UserDTO dto = new UserDTO();

			dto.setEmail("kevindian@gmail.com");
			dto.setPassword("pass1234");
			dto = service.authenticate(dto.getEmail(), dto.getPassword());
			if (dto != null) {
				System.out.println(dto.getFirstName() + " successfully login");
			} else {
				System.out.println("Invalid login Id & password");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testChangePassword() throws Exception {
		boolean b = service.changePassword(1, "kev1234", "pass1234");
		if (b == true) {
			System.out.println("Password changed successfully.");
		} else {
			System.out.println("password has not changed.");
		}
	}

	public static void testLock() throws Exception {
		UserDTO dto = new UserDTO();
		System.out.println("Enter id to lock");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		service.lock(i);
	}

	public static void main(String[] args) throws Exception {
		// TestAdd();
		// testUpdate();
		// testDelete();
		// TestGet();
		// testList();
		// testSearch();
		testAuthenticate();
		// testChangePassword();
		// testLock();
	}

}
