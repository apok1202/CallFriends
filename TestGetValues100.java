import static org.junit.Assert.*;
import java.util.*;
import java.io.*;
import org.junit.Test;
import java.util.*;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import org.json.simple.parser.ParseException;

public class TestGetValues100{

	@Test
	public void testGetValues1()
	{
		//Output Data
		List<List<String> > dataOutput = new ArrayList<List<String>>();
		List<String> innerListOutput1 = new ArrayList<String>();
		List<String> innerListOutput2 = new ArrayList<String>();

		innerListOutput1.add("Chris");
		innerListOutput2.add("12");

		dataOutput.add(innerListOutput1);
		dataOutput.add(innerListOutput2);

 		//Input Data

		List<List<String> > data = new ArrayList<List<String>>();
		List<String> innerList1 = new ArrayList<String>();
		List<String> innerList2 = new ArrayList<String>();
		List<String> innerList3 = new ArrayList<String>();
		List<String> innerList4 = new ArrayList<String>();

		innerList1.add("12.986375");
		innerList1.add("11.92893");
		innerList1.add("11.8856167");
		innerList1.add("12.3191841");

		data.add(innerList1);

		innerList2.add("Chris");
		innerList2.add("Alice");
		innerList2.add("Ian");
		innerList2.add("Jack");

		data.add(innerList2);

		innerList3.add("12");
		innerList3.add("1");
		innerList3.add("2");
		innerList3.add("3");

		data.add(innerList3);

		innerList4.add("77.043701");
		innerList4.add("78.27699");
		innerList4.add("78.4240911");
		innerList4.add("78.5072391");

		data.add(innerList4);

		assertEquals("Error in GetValues",dataOutput,GetValues100.getValues(data));
	}
}