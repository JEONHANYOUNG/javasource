package container;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest4 extends JFrame {

	public FrameTest4() {
		setTitle("MyFrame");
		
		//크기를 항상 지정해야함(필요)
		setSize(300, 300);
		
		//프레임을 닫으면 프로그램 종료 : 프로그램을 종료시킬때 사용(필요)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// FlowLayout : 흘러가는대로 배치
		setLayout(new FlowLayout());
		
		// 컴포넌트 : JButton,JCheckBox,JRadio,...(개별 기능을 가진 것)
		JButton btn1 = new JButton("버튼1");
		add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		add(btn4);
		
		JButton btn5 = new JButton("버튼5");
		add(btn5);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		FrameTest4 f = new FrameTest4();
	}

}











