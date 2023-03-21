package control_statements;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NestedIfTest {

	@Test
	public void positiveTest() {
		CommonPojo pojo = new CommonPojo();
		pojo.setFirstName("Jibin");
		pojo.setLastName("Thomas");

		String expected = "JibinThomas";

		String actual = NestedIf.nestedIfDemo(pojo);

		assertEquals(expected, actual);
	}

	@Test(expected = NullPointerException.class)
	public void firstNameNullTest() {
		CommonPojo pojo = new CommonPojo();
		pojo.setLastName("Thomas");

		String expected = "Thomas";

		String actual = NestedIf.nestedIfDemo(pojo);

		assertEquals(expected, actual);
	}

	@Test(expected = NullPointerException.class)
	public void lastNameNullTest() {
		CommonPojo pojo = new CommonPojo();
		pojo.setFirstName("Jibin");

		String expected = "Jibin";

		String actual = NestedIf.nestedIfDemo(pojo);

		assertEquals(expected, actual);
	}

	@Test
	public void negativeTest() {
		CommonPojo pojo = new CommonPojo();

		String expected = null;

		String actual = NestedIf.nestedIfDemo(pojo);

		assertEquals(expected, actual);
	}
}
