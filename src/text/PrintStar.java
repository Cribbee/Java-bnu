 /**
   * Class name��PrintStar
   *
   * Version information:  1.0
   *
   * Date:2017��9��17��
   *
   * Notice �� �ӿ���̨�������֣����ͼ�Ρ������������5������ʾΪ
  *
  **
  ***
  ****
  *****
�����������6������ʾΪ
  *
  **
  ***
  ****
  *****
  ******      ��������...

 */
package text;
import java.util.Scanner;
public class PrintStar {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);//�ӿ���̨�������֣����ͼ��
		System.out.print("������һ�����֣�");
		int num = input.nextInt();
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.print('\n');
		}
	}

}
