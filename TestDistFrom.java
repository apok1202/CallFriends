import static org.junit.Assert.*;
import java.util.*;
import java.io.*;
import org.junit.Test;
public class TestDistFrom{

	@Test
	public void testDistanceFrom1()
	{
		assertEquals("Error in DistanceFrom",(Long)64L,DistanceFromSource.distanceFrom("12.986375","77.043701"));
	}

	@Test
	public void testDistanceFrom2()
	{
		assertEquals("Error in DistanceFrom",(Long)8662L,DistanceFromSource.distanceFrom("0","0"));
	}

	@Test
	public void testDistanceFrom3()
	{
		assertEquals("Error in DistanceFrom",(Long)0L,DistanceFromSource.distanceFrom("12.96611159","77.6362214"));
	}

	@Test
	public void testDistanceFrom4()
	{
		assertEquals("Error in DistanceFrom",(Long)147L,DistanceFromSource.distanceFrom("11.8856167","78.4240911"));
	}

	@Test
	public void testDistanceFrom5()
	{
		assertEquals("Error in DistanceFrom",(Long)127L,DistanceFromSource.distanceFrom("14.080556","77.361944"));
	}

	@Test
	public void testDistanceFrom6()
	{
		assertEquals("Error in DistanceFrom",(Long)4710L,DistanceFromSource.distanceFrom("34.0522","118.2437"));
	}

	@Test
	public void testDistanceFrom7()
	{
		assertEquals("Error in DistanceFrom",(Long)11442L,DistanceFromSource.distanceFrom("-90.00","0.00"));
	}

	@Test
	public void testDistanceFrom8()
	{
		assertEquals("Error in DistanceFrom",(Long)8560L,DistanceFromSource.distanceFrom("90.00","0.00"));
	}

	@Test //Test Case having negative coordinates
	public void testDistanceFrom9()
	{
		assertEquals("Error in DistanceFrom",(Long)17163L,DistanceFromSource.distanceFrom("-34.0522","-118.2437"));
	}
	

}