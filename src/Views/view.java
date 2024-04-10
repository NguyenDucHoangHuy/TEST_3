package Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Models.Hocsinh;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;

public class view extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField_mahocsinh;
	private JTextField textField_hovaten;
	private JTextField textField_diemtrungbinh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view frame = new view();
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
	public view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã học sinh");
		lblNewLabel.setBounds(10, 53, 80, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblHVTn = new JLabel("Họ và tên");
		lblHVTn.setBounds(10, 131, 80, 28);
		contentPane.add(lblHVTn);
		
		JLabel lblNewLabel_1_1 = new JLabel("Điểm trung bình");
		lblNewLabel_1_1.setBounds(10, 210, 80, 28);
		contentPane.add(lblNewLabel_1_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã học sinh", "Họ và tên", "Điểm trung bình"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(68);
		table.getColumnModel().getColumn(1).setPreferredWidth(89);
		table.getColumnModel().getColumn(2).setPreferredWidth(122);
		table.setBounds(252, 25, 338, 153);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(265, 53, 298, 149);
		contentPane.add(scrollPane);
		
		JButton btthem = new JButton("Thêm");
		btthem.setBounds(157, 261, 89, 23);
		contentPane.add(btthem);
		
		JButton btnXa = new JButton("Xóa");
		btnXa.setBounds(379, 261, 89, 23);
		contentPane.add(btnXa);
		
		JButton btluu = new JButton("Lưu");
		btluu.setBounds(266, 261, 89, 23);
		contentPane.add(btluu);
		
		textField_mahocsinh = new JTextField();
		textField_mahocsinh.setBounds(89, 57, 96, 20);
		contentPane.add(textField_mahocsinh);
		textField_mahocsinh.setColumns(10);
		
		textField_hovaten = new JTextField();
		textField_hovaten.setColumns(10);
		textField_hovaten.setBounds(89, 135, 132, 20);
		contentPane.add(textField_hovaten);
		
		textField_diemtrungbinh = new JTextField();
		textField_diemtrungbinh.setColumns(10);
		textField_diemtrungbinh.setBounds(89, 214, 107, 20);
		contentPane.add(textField_diemtrungbinh);
	}
	public void lamrong() {
		 textField_hovaten.setText("");
		 textField_mahocsinh.setText("");
		 textField_diemtrungbinh.setText("");
	}
	public void luuHocSinh(Hocsinh hs) {
		
	}
	
}
