/**
   * Class name：Transform
   *
   * Version information:  1.0
   *
   * Date:2017年9月20日
   *
   * Notice ：将一个十进制转换为二进制，讲二进制数前后颠倒，再算出颠倒后对于的十进制数。
 */
package text;

public class Transform {
	public static void main(String[] args){  
        Transform text=new Transform();  
        text.change((char)10);      
   }     
   public void change(char c){  
          int ic=c;  
          String sc=Integer.toBinaryString(ic);//十进制---->二进制   
          /*
           * Integer.toBinaryString方法，就是将输入的数字转换成二进制数，但是转换输出的是String类型的字符串
           */
          System.out.println("二进制为--->"+sc);//二进制为--->1010  
          char[] scc=sc.toCharArray(); //toCharArray()的用法：将字符串对象中的字符转换为一个字符数组 
          StringBuffer sb=new StringBuffer();
          /*
           * String类是字符串常量，是不可更改的常量。而StringBuffer是字符串变量，它的对象是可以扩充和修改的。
           */
          for(int i=scc.length-1;i>=0;i--){  
              sb.append(scc[i]);
              /*
               * 举例说明：
               * StringBuffer sb=new StringBuffer("Hard ");
               * String aString = "Waxworks";
               * buf.append(aString,3,4);
               * 原文说明：这个操作将aString的从索引位置3开始的由四个字符组成的子串
               * 追加到StringBuffer对象sb中。
               * 然后sb对象就会包含字符 串"Hard work"。
               */
          }  
          System.out.println("二进制前后颠倒后--->"+sb.toString());//二进制前后颠倒后--->0101  
          Integer it=Integer.valueOf(sb.toString(), 2);//二进制----->十进制
          /*
           * Integer.valueOf(sb.toString(), 2)这个方法是把二进制下的sb.toString()，转换成十进制下对应的数字
           */
          System.out.println(" 颠倒后的二进制对应的十进制--->"+it );// 颠倒后的二进制对应的十进制--->5  

      }  
}
