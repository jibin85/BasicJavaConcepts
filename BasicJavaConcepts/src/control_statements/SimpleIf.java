package control_statements;

import java.util.Objects;

/**
 * This Class illustrates a Simple IF Condition for Eligible age to Vote
 * 
 * @author Jibin Thomas
 *
 */
@SuppressWarnings({"java:S106"})
public class SimpleIf {

	/**
	 * SimpleIf Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		CommonPojo pojo = new CommonPojo();
		age1Check(pojo);
		age2Check(pojo);
	}

	/**
	 * This method is used to check whether the age1 is eligible to vote or not
	 * 
	 * @param pojo
	 * @return
	 */
	static boolean age1Check(CommonPojo pojo) {
		if (Objects.nonNull(pojo.getAge1()) && pojo.getAge1() >= 18) {
			System.out.println("AGE_1 is Eligible to Vote" + " " + "Age is :" + pojo.getAge1());
			return true;
		}
		return false;
	}

	/**
	 * This method is used to check whether the age1 is eligible to vote or not
	 * 
	 * @param pojo
	 * @return
	 */
	static boolean age2Check(CommonPojo pojo) {
		if (Objects.nonNull(pojo.getAge2()) && pojo.getAge2() >= 18) {
			System.out.println("AGE_2 is Eligible to Vote" + " " + "Age is :" + pojo.getAge2());
			return true;
		}
		return false;
	}
}
