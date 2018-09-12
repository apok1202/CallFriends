import java.io.*;
import java.util.*;
public class DistanceFromSource{
	public static int RadiusOfEarthInKM=6367;
	public static Double CordiLatiSource =  Double.parseDouble("12.96611159");
	public static Double CordiLongiSource =  Double.parseDouble("77.6362214");

	public static Long distanceFrom(String cordiLatiDes,String cordiLongiDes){

		Double cordiLatiDesD = Double.parseDouble (cordiLatiDes);
		Double cordiLongiDesD = Double.parseDouble(cordiLongiDes);
		Double phi_1 = Math.toRadians(DistanceFromSource.CordiLatiSource);
		Double phi_2 = Math.toRadians(cordiLatiDesD);
		Double delta_lambda =Math.abs( Math.toRadians(cordiLongiDesD - DistanceFromSource.CordiLongiSource));
		Double delta_sigma = Math.acos(((Math.sin(phi_1)*Math.sin(phi_2))+(Math.cos(phi_1)*Math.cos(phi_2)*Math.cos(delta_lambda))));

		return ((new Double (DistanceFromSource.RadiusOfEarthInKM*delta_sigma)).longValue());
	}
	public static void main(String[] args) {
		System.out.println(DistanceFromSource.distanceFrom("-34.0522","-118.2437"));
	}
}