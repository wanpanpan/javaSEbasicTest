import java.util.*;
//������1~100���ۼ�ֵ��
//��Ҫ���������и�λΪ3����
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