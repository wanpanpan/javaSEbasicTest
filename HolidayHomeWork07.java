import java.util.*;
//打印水仙花数
public class HolidayHomeWork07{
    public static void main(String[] args){
	   System.out.print("100~999间的水仙花数有:");
	   for(int i=100;i<=999;i++){
		   int ge = i%10;
		   int shi = i/10%10;
		   int bai = i/100;
		   if(i == (ge*ge*ge)+(shi*shi*shi)+(bai*bai*bai)){
			   System.out.println(i);
		   }
		   
	   }
	}
}