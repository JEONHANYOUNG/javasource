package event;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventTest3 extends JFrame {

	private JLabel lbl = new JLabel("Hello");
	private Component contentpane;

	public KeyEventTest3() {
		setTitle("�ؽ�Ʈ �����̱�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ���� ������ ���̾ƿ� ���ֱ�
		setLayout(null);

		// ���̺� ��ġ
		lbl.setLocation(50, 50);
		lbl.setSize(100, 20);
		add(lbl);

		// ���̺��� ��Ŀ���� ���� �� �ֵ��� ����
		Container contentPane = getContentPane();
		contentPane.addKeyListener(new MyKeyAdapter());
		contentPane.setFocusable(true);
		// Ű �Է��� ���� �� �ֵ��� ���� ��Ŀ�� ���� ����
		contentPane.requestFocus();

		setSize(200, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new KeyEventTest3();
	}

	class MyKeyAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			// ��,��,��,�� Ű�� ���缭 ���ڷ� �̵�

			// ��� Ű�� ���������� Ȯ��
			int keyCode = e.getKeyCode();

			switch (keyCode) {
			case KeyEvent.VK_UP: // upŰ
				lbl.setLocation(lbl.getX(), lbl.getY() - 10);
				break;
			case KeyEvent.VK_DOWN: // downŰ
				lbl.setLocation(lbl.getX(), lbl.getY() + 10);
				break;
			case KeyEvent.VK_LEFT: // leftŰ
				lbl.setLocation(lbl.getX() - 10, lbl.getY());
				break;
			case KeyEvent.VK_RIGHT: // rightŰ
				lbl.setLocation(lbl.getX() + 10, lbl.getY());
				break;
			default:
				break;
			}
		}

	}
}
