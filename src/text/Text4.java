/*
   * Class name��Text4
   *
   * Version information:  1.0
   *
   * Date:2017��9��19��
   *
   * Notice ��һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ��������������6=1��2��3.����ҳ�1000���ڵ�����������
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
