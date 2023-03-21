package control_statements;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleIfTest {

	@Test
	public void age1CheckTest() {
		CommonPojo pojo1 = new CommonPojo();
		pojo1.setAge1(100);
		
		CommonPojo pojo2 = new CommonPojo();
		pojo2.setAge1(9);
		
		CommonPojo pojo3 = new CommonPojo();
		pojo3.setAge1(0);
		
		assertEquals(true, SimpleIf.age1Check(pojo1));
		assertEquals(false, SimpleIf.age1Check(pojo2));
		assertEquals(false, SimpleIf.age1Check(pojo3));
	}
	
	@Test
	public void age2CheckTest() {
		CommonPojo pojo1 = new CommonPojo();
		pojo1.setAge2(19);
		
		CommonPojo pojo2 = new CommonPojo();
		pojo2.setAge2(9);
		
		CommonPojo pojo3 = new CommonPojo();
		pojo3.setAge2(0);
		
		assertEquals(true, SimpleIf.age2Check(pojo1));
		assertEquals(false, SimpleIf.age2Check(pojo2));
		assertEquals(false, SimpleIf.age2Check(pojo3));
	}
}
