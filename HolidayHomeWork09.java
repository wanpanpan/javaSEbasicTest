import java.util.*;
//��ӡ1000�ڵ�����
public class HolidayHomeWork09{
    public static void main(String[] args){
	    System.out.print("1000���ڵ�������:");
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