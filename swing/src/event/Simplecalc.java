package event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.net.httpserver.Authenticator.Result;

public class Simplecalc extends JFrame implements ActionListener {

	private JTextField num1,num2,result;
		
	public Simplecalc() {
		
		setTitle("덧셈 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 상단 부착 패널 생성
		JPanel top = new JPanel();
		
		// 숫자를 입력하고 결과를 출력할 텍스트필드 생성
		num1 = new JTextField(10);
		top.add(num1);
		
		JLabel op = new JLabel("+");
		top.add(op);
	
		num2 = new JTextField(10);
		top.add(num2);
		
		JLabel op2 = new JLabel("=");
		top.add(op2);
		
		result = new JTextField(10);
		top.add(result);
		
		add(top,BorderLayout.NORTH);
		
		//하단 부착 패널 생성
		JPanel bottom = new JPanel();
		
		// 버튼 2개 생성 후 add
		JButton btnOk = new JButton("확인");
		btnOk.addActionListener(this);
		
		JButton btnOkReset = new JButton("취소");
		btnOkReset.addActionListener(this);		
		
		bottom.add(btnOk);
		bottom.add(btnOkReset);
		
		add(bottom,BorderLayout.CENTER);
		
		setSize(450, 150);
		setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("확인")) {
			// 확인 버튼 클릭
			// num1,num2에 들어있는 값 가져오기
			int op1 = Integer.parseInt(num1.getText()); // "5" + "7" => "57"
			int op2 = Integer.parseInt(num2.getText()); // "5" + "7" => "57"
			
			// 가져온 숫자에 덧셈
			int total = op1 + op2;
			
			// 결과를 result에 보여주기
			//result.setText(total+"");
			result.setText(String.valueOf(total));
			
		} else {
			// 취소 버튼 클릭
			// num1, num2, result에 들어있는 값 지우기
			num1.setText("");
			num2.setText("");
			result.setText("");
		}
	}
	public static void main(String[] args) {
		new Simplecalc();
	}
}
