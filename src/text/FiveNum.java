 /**
   * Class name：FiveNum
   *
   * Version information:  1.0
   *
   * Date:2017年9月17日
   *
   * Notice ： 从键盘输入一个5位数，把每位上的数字相加，求和。
 */
package text;
import java.util.Scanner;
public class FiveNum {
	public static void main (String[] args){ 
		Scanner input = new Scanner(System.in);//从键盘输入一个5位数，把每位上的数字相加，求和
		System.out.print("请输入一个5位数：");
		int num = input.nextInt();//input.nextInt()这个意思是使用控制台输入的方式输入下一个整数。
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
		System.out.print("这数各位数之和为"+s);
		
}
}