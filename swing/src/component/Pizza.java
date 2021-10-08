package component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;

public class Pizza extends JFrame implements ItemListener, ActionListener {

	private JPanel contentPane;
	private JRadioButton rdoCombo, rdoPotato, rdoBul, rdoPeper, rdoCheese, rdoPepp, rdoBacon, rdoSmall, rdoMedium,
			rdoLarge;
	private JButton btnOrder, btnCancel;
	private JLabel lblMoney;
	private ButtonGroup group1, group2, group3;

	// �׷캰 �ֹ��ݾ� ���� ����
	private int kindMoney, toppingMoney, sizeMoney;
	// �׷캰 ��ǰ���� ���� ����
	private String kind, topping, size;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizza frame = new Pizza();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pizza() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pizza.class.getResource("/component/pizza1.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.setBackground(Color.WHITE);

		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("\uC790\uBC14 \uD53C\uC790\uC5D0 \uC624\uC2E0 \uAC83\uC744 \uD658\uC601\uD569\uB2C8\uB2E4");
		lblNewLabel.setFont(new Font("���� ���", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "\uC885\uB958", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));

		rdoCombo = new JRadioButton("�޺�");
		rdoCombo.setFont(new Font("���� ���", Font.PLAIN, 18));
		rdoCombo.setBackground(Color.WHITE);
		rdoCombo.addItemListener(this);
		panel_2.add(rdoCombo);

		rdoPotato = new JRadioButton("��������");
		rdoPotato.setFont(new Font("���� ���", Font.PLAIN, 18));
		rdoPotato.setBackground(Color.WHITE);
		rdoPotato.addItemListener(this);
		panel_2.add(rdoPotato);

		rdoBul = new JRadioButton("�Ұ��");
		rdoBul.setFont(new Font("���� ���", Font.PLAIN, 18));
		rdoBul.setBackground(Color.WHITE);
		rdoBul.addItemListener(this);
		panel_2.add(rdoBul);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "\uCD94\uAC00\uD1A0\uD551",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));

		rdoPeper = new JRadioButton("�Ǹ�");
		rdoPeper.setFont(new Font("���� ���", Font.PLAIN, 18));
		rdoPeper.setBackground(Color.WHITE);
		rdoPeper.addItemListener(this);
		panel_3.add(rdoPeper);

		rdoCheese = new JRadioButton("ġ��");
		rdoCheese.setFont(new Font("���� ���", Font.PLAIN, 18));
		rdoCheese.setBackground(Color.WHITE);
		rdoCheese.addItemListener(this);
		panel_3.add(rdoCheese);

		rdoPepp = new JRadioButton("���۷δ�");
		rdoPepp.setFont(new Font("���� ���", Font.PLAIN, 18));
		rdoPepp.setBackground(Color.WHITE);
		rdoPepp.addItemListener(this);
		rdoPepp.setActionCommand("1000");
		panel_3.add(rdoPepp);

		rdoBacon = new JRadioButton("������");
		rdoBacon.setFont(new Font("���� ���", Font.PLAIN, 18));
		rdoBacon.setBackground(Color.WHITE);
		rdoBacon.addItemListener(this);
		panel_3.add(rdoBacon);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(
				new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "\uD06C\uAE30", TitledBorder.LEADING,
						TitledBorder.TOP, null, new Color(0, 0, 0)),
				"\uD06C\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));

		rdoSmall = new JRadioButton("Small");
		rdoSmall.setFont(new Font("���� ���", Font.PLAIN, 18));
		rdoSmall.setBackground(Color.WHITE);
		rdoSmall.addItemListener(this);
		panel_4.add(rdoSmall);

		rdoMedium = new JRadioButton("Medium");
		rdoMedium.setFont(new Font("���� ���", Font.PLAIN, 18));
		rdoMedium.setBackground(Color.WHITE);
		rdoMedium.addItemListener(this);
		panel_4.add(rdoMedium);

		rdoLarge = new JRadioButton("Large");
		rdoLarge.setFont(new Font("���� ���", Font.PLAIN, 18));
		rdoLarge.setBackground(Color.WHITE);
		rdoLarge.addItemListener(this);
		panel_4.add(rdoLarge);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);

		btnOrder = new JButton("�ֹ�");
		btnOrder.addActionListener(this);
		panel_1.add(btnOrder);

		btnCancel = new JButton("���");
		btnCancel.addActionListener(this);
		panel_1.add(btnCancel);
		lblMoney = new JLabel("�հ� :");
		panel_1.add(lblMoney);

		// ���� �׷� ����
		group1 = new ButtonGroup();
		group1.add(rdoCombo);
		group1.add(rdoPotato);
		group1.add(rdoBul);

		// �߰����� �׷� ����
		group2 = new ButtonGroup();
		group2.add(rdoPeper);
		group2.add(rdoCheese);
		group2.add(rdoPepp);
		group2.add(rdoBacon);

		// ũ�� �׷� ����
		group3 = new ButtonGroup();
		group3.add(rdoSmall);
		group3.add(rdoMedium);
		group3.add(rdoLarge);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ��ư �̺�Ʈ ó��
		String cmd = e.getActionCommand();

		if (cmd.equals("�ֹ�")) {

			String orderList = "�ֹ�����\n";
			orderList += "���� :" + kind + "\n";
			orderList += "���� :" + topping + "\n";
			orderList += "ũ�� :" + size + "\n";
			orderList += "�ֹ��Ͻðڽ��ϱ�?";

			int result = JOptionPane.showConfirmDialog(getParent(), orderList, "�ֹ�����", JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.INFORMATION_MESSAGE);

			if (result == 0) {
				JOptionPane.showConfirmDialog(getParent(), "�ֹ��� �Ϸ�Ǿ����ϴ�.");
				clear();
			} else {
				clear();
			}

		} else {
			clear();
		}
	}

	private void clear() {

		// ���� ��ư ����
		group1.clearSelection();
		group2.clearSelection();
		group3.clearSelection();

		// �׷캰 �ֹ��ݾ� ���� �ʱ�ȭ
		kindMoney = 0;
		toppingMoney = 0;
		sizeMoney = 0;

		// �׷캰 �ֹ��ݾ� ���� �ʱ�ȭ
		kind = "";
		topping = "";
		size = "";

		lblMoney.setText("�ݾ� : ");
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		// ���� ��ư �̺�Ʈ ó��
		// ���� : �޺�(10000), ��������(12000), �Ұ��(13000)
		// �߰����� : �Ǹ�(2000), ġ��(2000), ���۷δ�(1000), ������(3000)
		// ũ�� : small(1000), medium(2000), large(3000)
		JRadioButton radio = (JRadioButton) e.getItem();

		System.out.println(radio.getText());
		// JRadioButton, JCheckBox ������ ��ȭ�� ����,������ ����
		// ���õǴ� ������ �̺�Ʈ ó��
		if (e.getStateChange() == ItemEvent.SELECTED) {
			if (radio == rdoCombo) {
				kindMoney = 10000;
				kind = radio.getText();
			} else if (radio == rdoPotato) {
				kindMoney = 12000;
				kind = radio.getText();
			} else if (radio == rdoBul) {
				kindMoney = 10000;
				kind = radio.getText();
			} else if (radio == rdoPeper) {
				toppingMoney = 2000;
				topping = radio.getText();
			} else if (radio == rdoCheese) {
				toppingMoney = 2000;
				topping = radio.getText();
			} else if (radio == rdoPepp) {
				toppingMoney = 1000;
				topping = radio.getText();
			} else if (radio == rdoBacon) {
				toppingMoney = 3000;
				topping = radio.getText();
			} else if (radio == rdoSmall) {
				sizeMoney = 1000;
				size = radio.getText();
			} else if (radio == rdoMedium) {
				sizeMoney = 2000;
				size = radio.getText();
			} else if (radio == rdoLarge) {
				sizeMoney = 3000;
				size = radio.getText();
			}
			int price = kindMoney + toppingMoney + sizeMoney;

			lblMoney.setText("�ݾ� : " + price);
		}

	}

}
