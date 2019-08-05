import java.util.*;

public class HolidayHomeWork08{
    public static void main(String[] args){
	    byte[] sourceArray = {1,5,7,9,10};
		byte[] newArray = new byte[sourceArray.length];
		System.arraycopy(sourceArray,0,newArray,0,5);
		System.out.print(Arrays.toString(newArray));
	}
}