 /**
   * Class name��FiveNum
   *
   * Version information:  1.0
   *
   * Date:2017��9��17��
   *
   * Notice �� �Ӽ�������һ��5λ������ÿλ�ϵ�������ӣ���͡�
 */
package text;
import java.util.Scanner;
public class FiveNum {
	public static void main (String[] args){ 
		Scanner input = new Scanner(System.in);//�Ӽ�������һ��5λ������ÿλ�ϵ�������ӣ����
		System.out.print("������һ��5λ����");
		int num = input.nextInt();//input.nextInt()�����˼��ʹ�ÿ���̨����ķ�ʽ������һ��������
		int shu=1;
		int s=0;
		for(int i=1;i<=5;i++){
			shu=1;
			for(int j=1;j<=6-i;j++){
				shu*=10;	
			}
			num%=shu;                                            
			s+=num/(shu/10);
		}
		System.out.print("������λ��֮��Ϊ"+s);
		
}
}