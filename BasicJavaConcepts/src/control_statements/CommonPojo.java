package control_statements;

public class CommonPojo {

	private int age1;
	private int age2;
	private int num1;
	private int num2;
	private int finalValue;
	private String firstName;
	private String lastName;

	public int getAge1() {
		return age1;
	}

	public void setAge1(int age1) {
		this.age1 = age1;
	}

	public int getAge2() {
		return age2;
	}

	public void setAge2(int age2) {
		this.age2 = age2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getFinalValue() {
		return finalValue;
	}

	public void setFinalValue(int finalValue) {
		this.finalValue = finalValue;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "CommonPojo [age1=" + age1 + ", age2=" + age2 + ", num1=" + num1 + ", num2=" + num2 + ", finalValue="
				+ finalValue + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
