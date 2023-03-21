package control_statements;

import java.util.Objects;

/**
 * This Class Illustrates NestedIf by populating Full Name from any one of First Name or Last name
 * @author a819557
 *
 */
@SuppressWarnings({"java:S106"})
public class NestedIf {

	/**
	 * NestedIf Main Method
	 * @param args
	 */
	public static void main(String[] args) {
		CommonPojo pojo = new CommonPojo();
		nestedIfDemo(pojo);
	}

	/**
	 * This Method is used to Print Full Name by getting atleast any one of First Name or Last name
	 * @param pojo
	 * @return
	 */
	static String nestedIfDemo(CommonPojo pojo) {
		String fullName = null;
		if (Objects.nonNull(pojo.getFirstName()) || Objects.nonNull(pojo.getLastName())) {
			if (Objects.nonNull(pojo.getFirstName())) {
				System.out.println(pojo.getFirstName() + " " + "is the First Name");
			} else {
				System.out.println("First Name is Expected");
			}
			if (Objects.nonNull(pojo.getLastName())) {
				System.out.println(pojo.getLastName() + " " + "is the Last Name");
			} else {
				System.out.println("Last Name is Expected");
			}
			fullName = pojo.getFirstName().concat(pojo.getLastName());
			System.out.println("Full Name : " + pojo.getFirstName().concat(pojo.getLastName()));

		} else {
			System.out.println("Atleast any one Name should not be null");
		}
		return fullName;
	}
}
