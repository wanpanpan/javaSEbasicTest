import java.util.*;
//一个小球从100高度自由落下,
//每次落地后反跳回原高度的一半,再落下，
//求它在第十次落地时,共经过多少米?
//第10次反弹多高?
public class HolidayHomeWork10{
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入数字n");
		int n = scanner.nextInt();
		double h = 100;
		double d =100;
		int i = 0;
		while(i<n){
			d=d+h;
			h=h/2;
			i++;
		}
		System.out.println("高度为" + d);
		System.out.println("距离为" + h);
	}
}