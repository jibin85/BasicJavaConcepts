package control_statements;

/**
 * This Class illustrates a Simple IF Condition for Eligible age to Vote
 * 
 * @author Jibin Thomas
 *
 */
@SuppressWarnings({ "java:S106" })
public class SimpleSwitch {

	public static final String VALUE = "The Value is : ";

	/**
	 * SimpleSwitch Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		CommonPojo pojo = new CommonPojo();
		simpleSwitchDemo(pojo);
	}

	/**
	 * This Method is used to switch for a particular operation
	 * 
	 * @param pojo
	 * @return
	 */
	static int simpleSwitchDemo(CommonPojo pojo) {
		int firstValue = pojo.getNum1();
		int secondValue = pojo.getNum2();
		int finalValue = pojo.getFinalValue();
		int result = 0;
		switch (finalValue) {
		case 1:
			System.out.println("Addition");
			result = firstValue + secondValue;
			System.out.println(VALUE + result);
			break;
		case 2:
			System.out.println("Difference");
			result = firstValue - secondValue;
			System.out.println(VALUE + result);
			break;
		case 3:
			System.out.println("Product");
			result = firstValue * secondValue;
			System.out.println(VALUE + result);
			break;
		case 4:
			System.out.println("Division");
			if (secondValue != 0) {
				result = firstValue / secondValue;
			} else {
				System.out.println("The Divisor Should not be Zero" + result);
			}
			System.out.println(VALUE + result);
			break;
		default:
			System.out.println("Please Select Valid choice");
			break;
		}
		return result;
	}

}
