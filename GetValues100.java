import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class GetValues100{

	public static List<List<String> > getValues(List <List<String> > data)
	{
		List <List<String> > values = new ArrayList<List<String>>();
		List <String> lati = new ArrayList<String>();
	    List <String> na = new ArrayList<String>();
	    List <String> used = new ArrayList<String>();
	    List <String> longi = new ArrayList<String>();
	    List <String> nameInRange = new ArrayList<String>();
	    List <String> userIDInRange = new ArrayList<String>();

			lati=data.get(0);
			na=data.get(1);
			used=data.get(2);
			longi=data.get(3);

			for(int i=0;i<lati.size();i++){
				String str1=(String) lati.get(i);
				String str2=(String) longi.get(i);
				Long dist=DistanceFromSource.distanceFrom(str1,str2);
				if(dist<=100){
					nameInRange.add(na.get(i));
					userIDInRange.add(used.get(i));
				}
			}
		values.add(nameInRange);
		values.add(userIDInRange);
		return values;
	}
}