package component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockScissorPaper extends JFrame implements ActionListener {

	private JTextField textField;
	private JButton btnRock,btnPaper,btnScissor;
	
	static final int Rock = 0;
	static final int Paper = 1;
	static final int Scissor= 2;
	
	public RockScissorPaper() {
		
		setTitle("가위바위보 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 현재 contentPane 가져오기
		Container contentPane = getContentPane();
		
		
		
		
		// 상단 메세지 출력
		JLabel label = new JLabel("아래의 버튼 중에서 하나를 클릭하시오");
		label.setFont(new Font("굴림", Font.BOLD, 18));
		add(label,BorderLayout.NORTH);
		
		// 가운데 이미지 출력
		// JPanel 을 CENTER에 부착 => JPanel을 GridLayout 변경 => 버튼 3개 부착
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3));
		
		btnRock = new JButton();
		btnRock.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/rock.png")));
		btnRock.setActionCommand("rock");
		btnRock.addActionListener(this);
		panel.add(btnRock);
		
		btnPaper = new JButton();
		btnPaper.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/paper.png")));
		btnPaper.setActionCommand("Paper");
		btnPaper.addActionListener(this);
		panel.add(btnPaper);
		
		
		btnScissor = new JButton();
		btnScissor.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/Scissor.png")));
		btnScissor.setActionCommand("Scissor");
		btnScissor.addActionListener(this);
		panel.add(btnScissor);
		
		contentPane.add(panel,BorderLayout.CENTER);
		
		// 하단 결과 출력
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(textField,BorderLayout.SOUTH);
				
				
		pack();
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new RockScissorPaper();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 게임자가 누른 가위,바위,보 가져오기
		String cmd = e.getActionCommand(); // rock,paper,scissor 중 하나
		
		// 컴퓨터에 가위,바위,보 결정
		int computer = (int)(Math.random()*3); // 0,1,2
		// System.out.println(num);
		
		
		// 컴퓨터와 게임자 사이에서 누가 이겼는지 출력
		if (cmd.equals("rock")) {
			if (computer==Rock) {
				textField.setText("비겼음. 다시 가위바위보");
			} else if (computer==Scissor) {
				textField.setText("내가 이겼음");
			} else {
				textField.setText("컴퓨터가 이겼음");
			}
		} else if (cmd.equals("scissor")) { //게임자가 가위를 낸 경우
			if (computer==Rock) {
				textField.setText("컴퓨터가 이겼음");
			} else if (computer==Scissor) {
				textField.setText("비겼음. 다시 가위바위보");
			} else {
				textField.setText("내가 이겼음");
			}
		} else { //게임자가 보자기를 낸 경우
			if (computer==Rock) {
				textField.setText("내가 이겼음");
			}  else if (computer==Scissor) {
				textField.setText("컴퓨터가 이겼음");
			} else {
				textField.setText("비겼음. 다시 가위바위보");
			}
			
			
		}
		
		textField.setText(textField.getText());
	}

}
