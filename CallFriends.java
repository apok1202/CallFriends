import java.io.FileNotFoundException;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import org.json.simple.parser.ParseException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class CallFriends{

	
	

	public static void driverFunction() //Driver Function
	{
		List <List<String> > dataFromJson = new ArrayList<List<String>>();
		List <List<String> > dataOfFriendsIn100 = new ArrayList<List<String>>();
		dataFromJson = ReadJSONData.readData("friends.json");
	    if(dataFromJson.isEmpty()){
	        }
	    else{
	    dataOfFriendsIn100=GetValues100.getValues(dataFromJson);
		System.out.println(SortAccUserId.sort_userId(dataOfFriendsIn100));
		}
	}

	public static void main(String[] args) 
	{
		CallFriends.driverFunction();	
	}
}