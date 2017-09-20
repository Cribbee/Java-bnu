/*
   * Class name：Text4
   *
   * Version information:  1.0
   *
   * Date:2017年9月19日
   *
   * Notice ：一个数如果恰好等于它的因子之和，这个数就称为“完数”。例如6=1＋2＋3.编程找出1000以内的所有完数。
 */
package text;

public class Text4 {
	public static void main(String[] args){
		int sum=0;
		for(int i=1;i<=1000;i++){
			for(int j=1;j<i;j++){
				if(i%j==0){
					sum+=j;
				}
			}
			if(sum==i){
				System.out.print(i+" ");
			}
			sum=0;
		}
	}

}
