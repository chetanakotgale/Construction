package HouseConstruction;

import static org.junit.Assert.*;

import org.junit.Test;


public class JUnitInput {

	@Test
	public void test()
	{
		
		ConstructionCost object=new ConstructionCost();
		assertEquals(" Excuted successfully ",42000,object.cost(1, 35,false),0.0);
		assertEquals("Executed Successfully",52650,object.cost(2, 35.1, false),0);
		assertEquals("Executed Successfully",63341.99999999999,object.cost(3, 35.19, false),0);
		assertEquals("Executed Successfully",87975.0,object.cost(4, 35.19, true),0);

	}

	public void fail()
	{
		
		ConstructionCost object=new ConstructionCost();
		assertFalse(" Excuted successfully ",42000!=object.cost(1, 35,false));
		assertFalse("Executed Successfully",52650!=object.cost(2, 35.1, false));
		assertFalse("Executed Successfully",63341.99999999999!=object.cost(3, 35.19, false));
		assertFalse("Executed Successfully",87975.0!=object.cost(4, 35.19, true));

	}

}
