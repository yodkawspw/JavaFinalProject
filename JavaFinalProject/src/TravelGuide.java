import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TravelGuide extends JFrame {

	private JPanel contentPane;
	private JTextField textProvince;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TravelGuide frame = new TravelGuide();
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
	public TravelGuide() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("Welcome to Travel Guide");
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(103, 22, 235, 28);
		contentPane.add(lblHeader);
		
		JLabel lblprovince = new JLabel("Input Province :");
		lblprovince.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblprovince.setBounds(34, 104, 139, 50);
		contentPane.add(lblprovince);
		
		
		textProvince = new JTextField();
		textProvince.setBounds(215, 121, 157, 23);
		contentPane.add(textProvince);
		textProvince.setColumns(10);
		
		final JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String province;
				ShowData sd = new ShowData();
				if(e.getSource()==btnOK) {
					province = textProvince.getText();
					if(province.equalsIgnoreCase("Hokkaido")) {
						sd.ShowHokkaido();
						sd.setVisible(true);
					}else if(province.equalsIgnoreCase("Aomori")){
						sd.ShowAomori();
						sd.setVisible(true);
					}else if(province.equalsIgnoreCase("Iwate")) {
						sd.ShowIwate();
						sd.setVisible(true);
					}else if(province.equalsIgnoreCase("Akita")) {
						sd.ShowAkita();
						sd.setVisible(true);
					}else if(province.equalsIgnoreCase("Yamagata")) {
						sd.ShowYamagata();
						sd.setVisible(true);
					}else if(province.equalsIgnoreCase("Fukushima")) {
						sd.ShowFukushima();
						sd.setVisible(true);
					}else if(province.equalsIgnoreCase("Ibaraki")) {
						sd.ShowIbaraki();
						sd.setVisible(true);
					}else if(province.equalsIgnoreCase("Tochigi")) {
						sd.ShowTochigi();
						sd.setVisible(true);
					}else if(province.equalsIgnoreCase("Gunma")) {
						sd.ShowGunma();
						sd.setVisible(true);
					}else if(province.equalsIgnoreCase("Saitama")) {
						sd.ShowSaitama();
						sd.setVisible(true);
					}else if(province.equalsIgnoreCase("Shiba")) {
						sd.ShowShiba();
						sd.setVisible(true);
					}else if(province.equalsIgnoreCase("Tokyo")) {
						sd.ShowTokyo();
						sd.setVisible(true);
					}else if(province.equalsIgnoreCase("Kanagawa")) {
						sd.ShowKanagawa();
						sd.setVisible(true);
					}else if(province.equalsIgnoreCase("Niigata")) {
						sd.ShowNiigata();
						sd.setVisible(true);
					}else if(province.equalsIgnoreCase("Toyama")) {
						sd.ShowToyama();
						sd.setVisible(true);
					}else if(province.equalsIgnoreCase("Ishikawa")) {
						sd.ShowIshikawa();
						sd.setVisible(true);
					}else if(province.equalsIgnoreCase("Fukui")) {
						sd.ShowFukui();
						sd.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Province not found, input again!!","Error",JOptionPane.ERROR_MESSAGE);
					}
				}
				dispose(); //close current Frame and go to ShowData Class
			}
		});
		btnOK.setBounds(243, 251, 68, 23);
		contentPane.add(btnOK);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(321, 251, 77, 23);
		contentPane.add(btnExit);
	}
}
