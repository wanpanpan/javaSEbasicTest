import java.util.*;
//һ��С���100�߶���������,
//ÿ����غ�����ԭ�߶ȵ�һ��,�����£�
//�����ڵ�ʮ�����ʱ,������������?
//��10�η������?
public class HolidayHomeWork10{
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������n");
		int n = scanner.nextInt();
		double h = 100;
		double d =100;
		int i = 0;
		while(i<n){
			d=d+h;
			h=h/2;
			i++;
		}
		System.out.println("�߶�Ϊ" + d);
		System.out.println("����Ϊ" + h);
	}
}