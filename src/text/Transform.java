/**
   * Class name��Transform
   *
   * Version information:  1.0
   *
   * Date:2017��9��20��
   *
   * Notice ����һ��ʮ����ת��Ϊ�����ƣ�����������ǰ��ߵ���������ߵ�����ڵ�ʮ��������
 */
package text;

public class Transform {
	public static void main(String[] args){  
        Transform text=new Transform();  
        text.change((char)10);      
   }     
   public void change(char c){  
          int ic=c;  
          String sc=Integer.toBinaryString(ic);//ʮ����---->������   
          /*
           * Integer.toBinaryString���������ǽ����������ת���ɶ�������������ת���������String���͵��ַ���
           */
          System.out.println("������Ϊ--->"+sc);//������Ϊ--->1010  
          char[] scc=sc.toCharArray(); //toCharArray()���÷������ַ��������е��ַ�ת��Ϊһ���ַ����� 
          StringBuffer sb=new StringBuffer();
          /*
           * String�����ַ����������ǲ��ɸ��ĵĳ�������StringBuffer���ַ������������Ķ����ǿ���������޸ĵġ�
           */
          for(int i=scc.length-1;i>=0;i--){  
              sb.append(scc[i]);
              /*
               * ����˵����
               * StringBuffer sb=new StringBuffer("Hard ");
               * String aString = "Waxworks";
               * buf.append(aString,3,4);
               * ԭ��˵�������������aString�Ĵ�����λ��3��ʼ�����ĸ��ַ���ɵ��Ӵ�
               * ׷�ӵ�StringBuffer����sb�С�
               * Ȼ��sb����ͻ�����ַ� ��"Hard work"��
               */
          }  
          System.out.println("������ǰ��ߵ���--->"+sb.toString());//������ǰ��ߵ���--->0101  
          Integer it=Integer.valueOf(sb.toString(), 2);//������----->ʮ����
          /*
           * Integer.valueOf(sb.toString(), 2)��������ǰѶ������µ�sb.toString()��ת����ʮ�����¶�Ӧ������
           */
          System.out.println(" �ߵ���Ķ����ƶ�Ӧ��ʮ����--->"+it );// �ߵ���Ķ����ƶ�Ӧ��ʮ����--->5  

      }  
}
