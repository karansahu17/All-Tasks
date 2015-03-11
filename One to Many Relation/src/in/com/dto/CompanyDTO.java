package in.com.dto;

import java.util.Set;

public class CompanyDTO {
	
	private Integer id;
	private String companyName;
	private String description;
	private Set<VendorDTO> vendors;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<VendorDTO> getVendors() {
		return vendors;
	}
	public void setVendors(Set<VendorDTO> vendors) {
		this.vendors = vendors;
	}
	
}
