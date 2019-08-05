import java.util.Scanner;
//有一对兔子,从出生后第三个月起每个月都生一对兔子,
//小兔子长到第三个月后每个月又生一对兔子,
//假如兔子都不死,问每个月的兔子总数为多少?
public class HolidayHomeWork13{
    public static void main(String[] args){
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("请输入月份");
	   int inputMonth = scanner.nextInt();
	   int i = 1,j = 0, month,x;
	   for(month = 1;month<inputMonth;month++){
		   x = i;
		   i = i+j;
		   j = x;
	   }
	   System.out.println("第" + month +"个月有" + 2*i + "只兔子" );
	}
}