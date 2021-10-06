package layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/* ��,��,��,��,���
 * BorderLayout.EAST
 * BorderLayout.WEST
 * BorderLayout.CENTER
 * BorderLayout.NORTH
 * BorderLayout.SOUTH
 */

/* FlowLayout : ������Ʈ�� ���ʿ��� ���������� ��ġ
 * 				������ ������ ������ �Ʒ��� ������
 * 
 */

public class FrameLayoutTest2 extends JFrame {
	public FrameLayoutTest2() {
	    setTitle("BorderLayout �׽�Ʈ");
		
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// �⺻ ���̾ƿ� BorderLayout
		
		// ���̾ƿ� ����	

		// ���� �������� contentpane ��������
		Container container = getContentPane();
		//contentpane �� ���ο� ���̾ƿ� ����
		container.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		 
		//�뵵�� �´� �͵鳢�� ��Ƶ� ��
		JPanel panel = new JPanel(); // �⺻ ���̾ƿ� FlowLayout
		setContentPane(panel);
		
		JButton btn1 = new JButton("��ư1");
		add(btn1);
		
		JButton btn2 = new JButton("��ư2");
		add(btn2);
		
		JButton btn3 = new JButton("��ư3");
		add(btn3);
		
		JButton btn4 = new JButton("��ư4");
		add(btn4);
		
		JButton btn5 = new JButton("��ư5");
		add(btn5);
		
		setSize(300, 200); // ��ư �� ���� ����
		setVisible(true);
	}
		public static void main(String[] args) {
			FrameLayoutTest2 bor = new FrameLayoutTest2();
			
		}
	}