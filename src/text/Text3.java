 /*
   * Class name：Text3
   *
   * Version information:  1.0
   *
   * Date:2017年9月18日
   *
   * Notice ：从键盘输入两个数a、b求出其最大公约数和最小公倍数。
 */
package text;
import java.util.Scanner;
public class Text3 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);//从键盘输入两个数a、b求出其最大公约数和最小公倍数
		int m=0;
		int n=0;
		int i=0;
		int j=0;
		int k=0;
		System.out.print("正数a=");
		m = input.nextInt();
		System.out.print("正数b=");
		n = input.nextInt();
		if(m>0&&n>0){
			j=m;k=n;i=j%k;
			while(i!=0){
				j=k;k=i;i=j%k;
			}
			System.out.print("最小公倍数是"+(m*n)/k);
			System.out.print("最大公约数是"+k);
		}else{
			System.out.print("您输入存在错误！");
		}
	}

}
