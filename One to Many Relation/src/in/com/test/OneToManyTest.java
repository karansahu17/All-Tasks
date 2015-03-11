/*Create CompanyDTO and VendorDTO and make one to many relation.
Create a CompanyService and perform CRUD operation.
Apply Optimizing Data Access using lazy fetching.*/
package in.com.test;

import in.com.dto.CompanyDTO;
import in.com.dto.VendorDTO;
import in.com.services.CompanyService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class OneToManyTest {
	private static Scanner sc = new Scanner(System.in);
	private static int id;

	public static void testAdd() {

		CompanyDTO companyDTO = new CompanyDTO();
		companyDTO.setCompanyName("TCS");
		companyDTO.setDescription("Consultancy");

		VendorDTO vendorDTO = new VendorDTO();
		vendorDTO.setFirstName("Rohan");
		vendorDTO.setLastName("Singh");
		vendorDTO.setEmail("xyz@gmail.com");
		vendorDTO.setUserName("abhi123");
		vendorDTO.setPassword("pass1234");
		vendorDTO.setAddress("Indore");

		VendorDTO vendorDTO1 = new VendorDTO();
		vendorDTO1.setFirstName("Shiva");
		vendorDTO1.setLastName("Rathore");
		vendorDTO1.setEmail("sr@gmail.com");
		vendorDTO1.setUserName("shubham");
		vendorDTO1.setPassword("shubham1234");
		vendorDTO1.setAddress("Bhikangaon");

		Set<VendorDTO> s = new HashSet<VendorDTO>();
		s.add(vendorDTO);
		s.add(vendorDTO1);

		companyDTO.setVendors(s);
		CompanyService service = new CompanyService();
		service.add(companyDTO);

	}

	public static void testDelete() {
		CompanyDTO cDto = new CompanyDTO();
		CompanyService service = new CompanyService();
		System.out.println("Enter Id to delete");
		id = sc.nextInt();
		cDto = service.get(id);
		service.delete(cDto);
	}

	@SuppressWarnings("unchecked")
	public static void testList() {
		CompanyService service = new CompanyService();
		CompanyDTO companyDTO = new CompanyDTO();
		List<CompanyDTO> list = new ArrayList<CompanyDTO>();
		list = service.getList();
		Iterator<CompanyDTO> it = list.iterator();
		while (it.hasNext()) {

			System.out.println("       ----Company List----");
			companyDTO = (CompanyDTO) it.next();
			System.out.print(companyDTO.getId() + "\t");
			System.out.print(companyDTO.getCompanyName() + "\t");
			System.out.print(companyDTO.getDescription() + "\t");
			System.out.println();
			System.out.println();

			System.out.println("       ----Vendors List----");
			for (VendorDTO vDto1 : companyDTO.getVendors()) {
				System.out.print(vDto1.getAddress() + "\t");
				System.out.print(vDto1.getFirstName() + "\t");
				System.out.print(vDto1.getPassword() + "\t");
				System.out.print(vDto1.getEmail() + "\t");
				System.out.print(vDto1.getUserName() + "\t");
				System.out.println(vDto1.getCompanyCode() + "\t");
			}
		}
	}

	public static void testUpdate() {
		CompanyDTO companyDTO = new CompanyDTO();
		CompanyService service = new CompanyService();
		System.out.println("Enter id to update");
		id = sc.nextInt();
		companyDTO = service.get(id);
		// companyDTO.setId(5);
		Set<VendorDTO> vendorSet = companyDTO.getVendors();

		Iterator<VendorDTO> it = vendorSet.iterator();

		while (it.hasNext()) {
			VendorDTO vendorDTO = (VendorDTO) it.next();
			if (vendorDTO.getVendorCode() == 9) {
				vendorDTO.setFirstName("aaa");
				vendorDTO.setLastName("zzz");
				vendorDTO.setEmail("abc@gmail.com");
				vendorDTO.setUserName("abc1234");
				vendorDTO.setPassword("zzz1234");
				vendorDTO.setAddress("New Delhi");
				companyDTO.setDescription("Developer");
			}
		}
		service.update(companyDTO);
	}

	public static void main(String[] args) {
		// testAdd();
		// testUpdate();
		// testDelete();
		testList();

	}

}