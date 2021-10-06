package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* ActionListener
 * JButton,JMenuItem,jTextField 컴포넌트의 이벤트 담당
 * 
 * JButton => 마우스나 enter 버튼 선택
 * JTextField => Enter 키 입력
 */

public class MyListener1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// 액션이 일어난 객체의 command 가져옴
		System.out.println("e.getActionCommand() "+e.getActionCommand());
		System.out.println("e.getID() "+e.getID());
		System.out.println("e.getSource() "+e.getSource());

	}

}
