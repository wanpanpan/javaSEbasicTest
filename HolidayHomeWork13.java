import java.util.Scanner;
//��һ������,�ӳ��������������ÿ���¶���һ������,
//С���ӳ����������º�ÿ��������һ������,
//�������Ӷ�����,��ÿ���µ���������Ϊ����?
public class HolidayHomeWork13{
    public static void main(String[] args){
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("�������·�");
	   int inputMonth = scanner.nextInt();
	   int i = 1,j = 0, month,x;
	   for(month = 1;month<inputMonth;month++){
		   x = i;
		   i = i+j;
		   j = x;
	   }
	   System.out.println("��" + month +"������" + 2*i + "ֻ����" );
	}
}