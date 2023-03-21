package control_statements;

/**
 * This Class Illustrates If-Else Ladder for identifying a number is Positive or Negative or Neutral
 * 
 * @author Jibin Thomas
 *
 */
@SuppressWarnings({"java:S106"})
public class IfElseLadder {

	/**
	 * IfElseLadder Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		CommonPojo pojo = new CommonPojo();
		ifElseLadderDemo(pojo);
	}

	/**
	 * This method is used to check a value is Positive or Negative or Neutral
	 * 
	 * @param pojo
	 * @return
	 */
	static Boolean ifElseLadderDemo(CommonPojo pojo) {
		if (pojo.getAge1() != 0 && pojo.getAge1() > 0) {
			System.out.println(pojo.getAge1() + " " + "is a Positive Number");
			return true;
		} else if (pojo.getAge1() == 0) {
			System.out.println(pojo.getAge1() + " " + "is a Neutral Number");
			return false;
		} else {
			System.out.println(pojo.getAge1() + " " + "is a Negative Number");
			return false;
		}
	}
}
