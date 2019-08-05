import java.util.*;
//打印1000内的完数
public class HolidayHomeWork09{
    public static void main(String[] args){
	    System.out.print("1000以内的完数有:");
		int s = 0;
	    for(int i=1;i<=1000;i++){
			for(int j=1;j<i;j++){
				if(i % j == 0){
					s += j;
				}
			}
			if(s == i){
				System.out.println(i);
			}
			s = 0;
		}
	}
}