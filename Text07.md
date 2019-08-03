import java.util.*;

public class Text07{
    public static void main(String[] args){
	    byte[] nums = {1,2,3,4,5,6};
	    //System.out.print(nums[3]);
		//for(int i = 0;i<nums.length;i++){
			//System.out.print(nums[i]);
		//}
		//byte[] nums2 = new byte[5];
		//nums2[2] = 5;
        //nums2[4] = 10;		
		//byte[] nums3 = new byte[]{
		//	1,2,3,5,6,7
		//};
		//System.out.print(nums2[4]);
		
		
		
		
		byte[] bytes = {1,5,7,8,3};
		byte[] bytes2 = new byte[byte.length];
		for(int i=0;i<byte.length;i++){
		    bytes2[i] = bytes[i];
		}
		System.out.println(bytes["bytes的第一位:"+bytes[0]);
		System.out.println(bytes2["bytes2的第一位:"+bytes2[0]);
		bytes[0] = 100;
		System.out.println("bytes的第一位:"+bytes[0]);
		System.out.println("bytes2的第一位:"+bytes2[0]);
		System.out.print(Arrays.toString(bytes));
	}
}
	