package event;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventTest3 extends JFrame {

	private JLabel lbl = new JLabel("Hello");
	private Component contentpane;

	public MouseEventTest3() {
		setTitle("텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 현재 설정된 레이아웃 없애기
		setLayout(null);

		// 레이블 배치
		lbl.setLocation(50, 50);
		lbl.setSize(100, 20);
		add(lbl);

		setSize(200, 200);
		setVisible(true);
		
		// 레이블이 포커스를 받을 수 있도록 설정
		Container contentPane = getContentPane();
		contentPane.addMouseListener(new MyMouseAdapter());

	}

	public static void main(String[] args) {
		new MouseEventTest3();
	}

	class MyMouseAdapter extends MouseAdapter { // 클래스 생성 후 오버라이드 해주기
		@Override
		public void mousePressed(MouseEvent e) {
			// 마우스 클릭 위치 가져오기
			int x = e.getX();
			int y = e.getY();

			lbl.setLocation(x, y);

		}

	}

}
