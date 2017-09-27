 /**
   * Class name：PrintStar
   *
   * Version information:  1.0
   *
   * Date:2017年9月17日
   *
   * Notice ： 从控制台输入数字，输出图形。如果输入数字5，则显示为
  *
  **
  ***
  ****
  *****
如果输入数字6，则显示为
  *
  **
  ***
  ****
  *****
  ******      依次类推...

 */
package text;
import java.util.Scanner;
public class PrintStar {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);//从控制台输入数字，输出图形
		System.out.print("请输入一个数字：");
		int num = input.nextInt();
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.print('\n');
		}
	}

}
