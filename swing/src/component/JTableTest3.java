package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import dao.UserDAO;
import domain.UserDTO;

import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JTableTest3 extends JFrame {
   
   private JPanel contentPane;
   private JTable table;
   private JPanel panel;
   private JLabel lblNewLabel, lblNewLabel_1, lblNewLabel_2;
   private JTextField txtName, txtAge, txtGender;
   private JButton btnNewButton, btnNewButton_1;
   private DefaultTableModel model;
   private UserDAO dao;

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               JTableTest3 frame = new JTableTest3();
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
   public JTableTest3() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 300);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      contentPane.setLayout(new BorderLayout(0, 0));
      setContentPane(contentPane);
      
      
      JScrollPane scrollPane = new JScrollPane();
      contentPane.add(scrollPane, BorderLayout.CENTER);
      
      table = new JTable();
      String columnNames[] = {"이름","나이","태어난해","주소","전화번호"};
      model = new DefaultTableModel(columnNames,0) {
         
         // 셀의 내용을 수정할 수 없게 만드는 작업 
         
         @Override
         public boolean isCellEditable(int row, int column) {
            // TODO Auto-generated method stub
            return false;
         }
      };
      table.setModel(model);
      scrollPane.setViewportView(table);

      dao = new UserDAO();
      showTable();
      
   }
   
   private void showTable() {
      Vector<UserDTO> vecList = dao.select();
      if(!vecList.isEmpty()) {
         for(UserDTO dto : vecList) {
            Vector<Object> v = new Vector<Object>();
            
            v.add(dto.getNo());
            v.add(dto.getUserName());
            v.add(dto.getBirthYear());
            v.add(dto.getAddr());
            v.add(dto.getMobile());
            
            model.addRow(v);
         }
      }
   }


}