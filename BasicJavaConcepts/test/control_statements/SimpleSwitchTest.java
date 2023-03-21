package control_statements;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleSwitchTest {

	@Test
	public void additionTest(){
		CommonPojo pojo = new CommonPojo();
		pojo.setNum1(100);
		pojo.setNum2(50);
		pojo.setFinalValue(1);
		
		assertEquals(150, SimpleSwitch.simpleSwitchDemo(pojo));
	}
	
	@Test
	public void subtractionTest(){
		CommonPojo pojo = new CommonPojo();
		pojo.setNum1(100);
		pojo.setNum2(50);
		pojo.setFinalValue(2);
		
		assertEquals(50, SimpleSwitch.simpleSwitchDemo(pojo));
	}
	
	@Test
	public void multiplicationTest(){
		CommonPojo pojo = new CommonPojo();
		pojo.setNum1(100);
		pojo.setNum2(50);
		pojo.setFinalValue(3);
		
		assertEquals(5000, SimpleSwitch.simpleSwitchDemo(pojo));
	}
	
	@Test
	public void divisionTest(){
		CommonPojo pojo = new CommonPojo();
		pojo.setNum1(100);
		pojo.setNum2(50);
		pojo.setFinalValue(4);
		
		assertEquals(2, SimpleSwitch.simpleSwitchDemo(pojo));
	}
	
	@Test
	public void divisionZeroTest(){
		CommonPojo pojo = new CommonPojo();
		pojo.setNum1(100);
		pojo.setNum2(0);
		pojo.setFinalValue(4);
		
		assertEquals(0, SimpleSwitch.simpleSwitchDemo(pojo));
	}
	
	@Test
	public void defaultTest(){
		CommonPojo pojo = new CommonPojo();
		pojo.setNum1(100);
		pojo.setNum2(50);
		pojo.setFinalValue(9);
		
		assertEquals(0, SimpleSwitch.simpleSwitchDemo(pojo));
	}
}
