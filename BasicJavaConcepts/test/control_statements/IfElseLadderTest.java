package control_statements;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IfElseLadderTest {
	@Test
	public void simpleIfElsePositiveTest(){
		CommonPojo pojo1 = new CommonPojo();
		pojo1.setAge1(13);
		assertEquals(true, IfElseLadder.ifElseLadderDemo(pojo1));
	}
	
	@Test
	public void simpleIfElseNegativeTest(){
		CommonPojo pojo1 = new CommonPojo();
		pojo1.setAge1(-13);
		assertEquals(false, IfElseLadder.ifElseLadderDemo(pojo1));
	}
	
	@Test
	public void simpleIfElseNeutralTest(){
		CommonPojo pojo1 = new CommonPojo();
		pojo1.setAge1(0);
		assertEquals(false, IfElseLadder.ifElseLadderDemo(pojo1));
	}
}
