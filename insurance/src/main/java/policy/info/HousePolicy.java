package policy.info;

public class HousePolicy {
	private String propertyType;
	private short numberOfBedrooms;
	private int value;
	private String street;
	private String zipCode;
	private int policyNumber;
	
	public int getPolicyNumber() {
		return policyNumber;
	}
	
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public short getNumberOfBedrooms() {
		return numberOfBedrooms;
	}
	public void setNumberOfBedrooms(short numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
