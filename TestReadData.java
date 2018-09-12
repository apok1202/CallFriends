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
import org.junit.rules.ExpectedException;

public class TestReadData{
public ExpectedException exception = ExpectedException.none();
@Test
public void testReadData1()
{
		List<List<String> > data = new ArrayList<List<String>>();
		List<String> innerList1 = new ArrayList<String>();
		List<String> innerList2 = new ArrayList<String>();
		List<String> innerList3 = new ArrayList<String>();
		List<String> innerList4 = new ArrayList<String>();

		innerList1.add("12.986375");
		innerList1.add("11.92893");
		innerList1.add("11.8856167");
		innerList1.add("12.3191841");
		innerList1.add("13.807778");

		data.add(innerList1);

		innerList2.add("Chris");
		innerList2.add("Alice");
		innerList2.add("Ian");
		innerList2.add("Jack");
		innerList2.add("Charlie");

		data.add(innerList2);

		innerList3.add("12");
		innerList3.add("1");
		innerList3.add("2");
		innerList3.add("3");
		innerList3.add("28");

		data.add(innerList3);

		innerList4.add("77.043701");
		innerList4.add("78.27699");
		innerList4.add("78.4240911");
		innerList4.add("78.5072391");
		innerList4.add("76.714444");


		data.add(innerList4);

		
		assertEquals("Error in ReadData",data,ReadJSONData.readData("friends2.json"));
}

@Test
public void testNumberFormatException(){
	exception.expect(NumberFormatException.class);
	exception.expectMessage("Input is wrong");
	ReadJSONData.readData("friends.json");
}

@Test
public void testFileNotFoundException (){
	exception.expect(FileNotFoundException.class);
	exception.expectMessage("File Not Found");
	ReadJSONData.readData("friends.json");
}

@Test
public void testIOException (){
	exception.expect(IOException.class);
	exception.expectMessage("IOException");
	ReadJSONData.readData("friends.json");
}

@Test
public void testParseException (){
	exception.expect(ParseException.class);
	exception.expectMessage("The ParseException Error");
	ReadJSONData.readData("friends.json");
}
}
