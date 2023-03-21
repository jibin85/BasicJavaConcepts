package control_statements;

/**
 * This Class Illustrates Simple If-Else for Positive or Negative Number for a non-zero values
 * 
 * @author Jibin Thomas
 *
 */
@SuppressWarnings({"java:S106"})
public class SimpleIfElse {

	/** 
	 * SimpleIfElse Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		CommonPojo pojo = new CommonPojo();
		simpleIfElse(pojo);
	}

	/**
	 * This method is used to check a non zero value is Positive or Negative
	 * 
	 * @param pojo
	 * @return
	 */
	static Boolean simpleIfElse(CommonPojo pojo) {
		if (pojo.getAge1() != 0 && pojo.getAge1() > 0) {
			System.out.println(pojo.getAge1() + " " + "is a Positive Number");
			return true;
		} else {
			System.out.println(pojo.getAge1() + " " + "is a Negative Number");
			return false;
		}
	}
}
