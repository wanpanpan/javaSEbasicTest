import java.util.*;
//求整数1~100的累加值，
//但要求跳过所有个位为3的数
public class HolidayHomeWork12{
    public static void main(String[] args){
	    int a = 0;
		for(int i =1;i<=100;i++){
		    if((i%10) != 3){
			    a += i;
			}
		}
			System.out.print(a);
	}
}