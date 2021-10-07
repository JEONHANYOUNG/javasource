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
		
		setTitle("���������� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ���� contentPane ��������
		Container contentPane = getContentPane();
		
		
		
		
		// ��� �޼��� ���
		JLabel label = new JLabel("�Ʒ��� ��ư �߿��� �ϳ��� Ŭ���Ͻÿ�");
		label.setFont(new Font("����", Font.BOLD, 18));
		add(label,BorderLayout.NORTH);
		
		// ��� �̹��� ���
		// JPanel �� CENTER�� ���� => JPanel�� GridLayout ���� => ��ư 3�� ����
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
		
		// �ϴ� ��� ���
		textField = new JTextField();
		textField.setFont(new Font("����", Font.BOLD, 18));
		contentPane.add(textField,BorderLayout.SOUTH);
				
				
		pack();
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new RockScissorPaper();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// �����ڰ� ���� ����,����,�� ��������
		String cmd = e.getActionCommand(); // rock,paper,scissor �� �ϳ�
		
		// ��ǻ�Ϳ� ����,����,�� ����
		int computer = (int)(Math.random()*3); // 0,1,2
		// System.out.println(num);
		
		
		// ��ǻ�Ϳ� ������ ���̿��� ���� �̰���� ���
		if (cmd.equals("rock")) {
			if (computer==Rock) {
				textField.setText("�����. �ٽ� ����������");
			} else if (computer==Scissor) {
				textField.setText("���� �̰���");
			} else {
				textField.setText("��ǻ�Ͱ� �̰���");
			}
		} else if (cmd.equals("scissor")) { //�����ڰ� ������ �� ���
			if (computer==Rock) {
				textField.setText("��ǻ�Ͱ� �̰���");
			} else if (computer==Scissor) {
				textField.setText("�����. �ٽ� ����������");
			} else {
				textField.setText("���� �̰���");
			}
		} else { //�����ڰ� ���ڱ⸦ �� ���
			if (computer==Rock) {
				textField.setText("���� �̰���");
			}  else if (computer==Scissor) {
				textField.setText("��ǻ�Ͱ� �̰���");
			} else {
				textField.setText("�����. �ٽ� ����������");
			}
			
			
		}
		
		textField.setText(textField.getText());
	}

}
