 /**
   * Class name��CommonMultiple
   *
   * Version information:  1.0
   *
   * Date:2017��9��18��
   *
   * Notice ���Ӽ�������������a��b��������Լ������С��������
 */
package text;
import java.util.Scanner;
public class CommonMultiple {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);//�Ӽ�������������a��b��������Լ������С������
        /*
         * new�Ǹ�����new�����٣�һ���ռ�洢ɨ������Ķ�����
         * System.in ��PrintStream���ֽڴ�ӡ������һ��ʵ�� ��ֻ�ܰ��ֽڶ�ȡ
         */
		int m=0;
		int n=0;
		int i=0;
		int j=0;
		int k=0;
		System.out.print("����a=");
		m = input.nextInt();
		System.out.print("����b=");
		n = input.nextInt();
		if(m>0&&n>0){
			j=m;k=n;i=j%k;
			while(i!=0){
				j=k;k=i;i=j%k;
			}
			System.out.print("��С��������"+(m*n)/k);
			System.out.print("���Լ����"+k);
		}else{
			System.out.print("��������ڴ���");
		}
	}

}
