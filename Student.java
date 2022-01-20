package javaConnectorProj2;

public class Student {
	
	private int id;
	private String Name;
	private String PhoneNum;
	private String city;
	
	public Student(int id, String name, String phoneNum, String city) {
		super();
		this.id = id;
		Name = name;
		PhoneNum = phoneNum;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhoneNum() {
		return PhoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", PhoneNum=" + PhoneNum + ", city=" + city + "]";
	}
	
	
	
}
