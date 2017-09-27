package text;
/**
 * Class name��Cartoon	
 *
 * Version information:  1.0
 *
 * Date:2017��9��
 *
 * Notice ��ʵ��һ���򵥵�С������
*/

import java.awt.Color;
import java.awt.Graphics; //�ṩͼ��ͼ������أ���ɫ�Ļ��ơ� 

import javax.swing.JFrame;
/*������ΪSwingӦ�ó���������ĳ����壬
 * ���ڷǳ���Ҫ��λ�ã�Swing�г��õĴ������JFrame,JDialog  
 */
import javax.swing.JPanel; /*���Ҳ��һ��Swing�����������Կ���Ϊ�����������������
							*����Ҳ���뱻��ӵ�����������Swing�г��õ�������JPanel����JScrollPane���
							*/

public class Cartoon extends JFrame {

	private static final int WIDTH = 650;// ����Ŀ��
	private static final int HEIGHT = 600;// ����ĸ߶�

	public static void main(String[] args) {
		Cartoon ge = new Cartoon();
		ge.ShowMoon();
	}

	private void ShowMoon() {
		MyPanel panel = new MyPanel();// ʵ����һ��������
		Thread t = new Thread(panel);// ʵ����һ�����Ķ����߳�
		t.start(); // ����
		this.add(panel);// �������ص�Frame��������
	}

	public Cartoon() {
		this.setSize(WIDTH, HEIGHT);// ����GUI����Ŀ��
		this.setTitle("��ҹ�����");// ���ñ���
		this.setResizable(false);// ���ô��ڴ�С���ɸı�
		this.setLocationRelativeTo(null);// ���ô���λ�þ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Ĭ�Ϲرղ���
		this.setVisible(true);// ���ô��ڿɼ�
	}

}

/**
 * ����� ���еĻ滭�������ڸ�����ʵ��
 * 
 * ʵ��Runnable�ӿ�
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
		this.setBackground(Color.black);// �趨������ɫ
		g.setColor(Color.yellow);// ���û�����ɫ
		g.fillOval(x, y + 20, 100, 100);// ��һ��ʵ��Բ
		g.setColor(Color.black);// �����趨������ɫ
		g.fillOval(x + 50, y, 2 * r, 2 * r);// ��ʵ��Բ
	}

	// �����������߳���ʵ��
	@Override
	public void run() {
		while (true) {// ������λ��һֱ�����ƶ�
			x++;
			y++;
			if (x > this.getWidth()) {// ֱ�����ﴰ�ڱ߽�
				x = 0;
				y = 0;
			}
			try {
				Thread.sleep(3);// 30ms
			} catch (InterruptedException e) { // ��ȫ��
				e.printStackTrace();
			}
			repaint();// ���¿�ʼ
		}

	}

}
