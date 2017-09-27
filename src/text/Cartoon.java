package text;
/**
 * Class name：Cartoon	
 *
 * Version information:  1.0
 *
 * Date:2017年9月
 *
 * Notice ：实现一个简单的小动画。
*/

import java.awt.Color;
import java.awt.Graphics; //提供图形图像的像素，颜色的绘制。 

import javax.swing.JFrame;
/*窗体作为Swing应用程序中组件的承载体，
 * 处于非常重要的位置，Swing中常用的窗体包括JFrame,JDialog  
 */
import javax.swing.JPanel; /*面板也是一个Swing容器，他可以看作为容器容纳其他组件，
							*但它也必须被添加到其他容器中Swing中常用的面板包括JPanel面板和JScrollPane面板
							*/

public class Cartoon extends JFrame {

	private static final int WIDTH = 650;// 界面的宽度
	private static final int HEIGHT = 600;// 界面的高度

	public static void main(String[] args) {
		Cartoon ge = new Cartoon();
		ge.ShowMoon();
	}

	private void ShowMoon() {
		MyPanel panel = new MyPanel();// 实例化一个面板对象
		Thread t = new Thread(panel);// 实例化一个面板的动画线程
		t.start(); // 启动
		this.add(panel);// 将面板加载到Frame主窗口里
	}

	public Cartoon() {
		this.setSize(WIDTH, HEIGHT);// 设置GUI界面的宽高
		this.setTitle("黑夜里的月");// 设置标题
		this.setResizable(false);// 设置窗口大小不可改变
		this.setLocationRelativeTo(null);// 设置窗口位置居中
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 默认关闭操作
		this.setVisible(true);// 设置窗口可见
	}

}

/**
 * 面板类 所有的绘画操作都在该类内实现
 * 
 * 实现Runnable接口
 * 
 * @author me
 * 
 */
class MyPanel extends JPanel implements Runnable {

	int x = 0;
	int y = 0;
	int r = 50;

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		this.setBackground(Color.black);// 设定背景颜色
		g.setColor(Color.yellow);// 设置画笔颜色
		g.fillOval(x, y + 20, 100, 100);// 画一个实心圆
		g.setColor(Color.black);// 重新设定画笔颜色
		g.fillOval(x + 50, y, 2 * r, 2 * r);// 画实心圆
	}

	// 动画过程在线程内实现
	@Override
	public void run() {
		while (true) {// 月亮的位置一直向下移动
			x++;
			y++;
			if (x > this.getWidth()) {// 直到到达窗口边界
				x = 0;
				y = 0;
			}
			try {
				Thread.sleep(3);// 30ms
			} catch (InterruptedException e) { // 安全性
				e.printStackTrace();
			}
			repaint();// 重新开始
		}

	}

}
