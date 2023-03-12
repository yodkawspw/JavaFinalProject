import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.*;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ShowData extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowData frame = new ShowData();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	
	/**
	 * Create the frame.
	 */
	public ShowData() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 672);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Japan");
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(206, 21, 261, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : This place");
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(236, 49, 209, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>Input Data in Here</html>");
		lblData.setBounds(22, 365, 605, 184);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		lblPic.setIcon(new ImageIcon("Input Picture here"));
		lblPic.setBounds(38, 88, 572, 266);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});

		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(314, 572, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(501, 572, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowData()
	
	public void ShowHokkaido(){
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 672);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Hokkaido");
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(206, 21, 261, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Goryokaku Fort");
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(236, 49, 209, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>Goryokaku fort or five-pointed star fort is located in Hakodate city. If viewed from a high angle, it resembles a western star. "
						+"The fort was built during the last years of the Edo period to protect against the threat of western powers. In the center of the fort It is the office of the shogunate who governed Hokkaido during the Shogunate period. "
						+"but when not in use Therefore, the building has been renovated and the scenery has been improved to become a park for viewing the cherry blossoms that will bloom together in May. In addition, Fort Goryokaku There is also a 90-meter high Goryokaku Tower for panoramic views of the surrounding fort, "
						+"built in 2006 below the tower. There are souvenir shops, restaurants and exhibitions on the establishment of the fort.</html>");
		lblData.setBounds(22, 365, 605, 184);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Hokkaido.jpeg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setBounds(22, 88, 605, 266);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(314, 572, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(501, 572, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowHokkaido()
	
	public void ShowAomori(){
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Aomori");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(214, 21, 242, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Hirosaki Castle");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(234, 49, 209, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>Hirosaki Castle is considered one of the most beautiful castles. Spring is a time when the castle is particularly beautiful. "
						+"because the whole area is almost completely covered with cherry blossoms In winter, it's just as beautiful. white snow come to spread over the area, "
						+"very romantic, and there are many festivals held here, so It has different charms in every season and can be visited all year round.</html>");
		lblData.setBounds(32, 388, 605, 122);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Aomori.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setBounds(32, 88, 580, 282);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(309, 538, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(501, 538, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowAomori()
	
	public void ShowIwate() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Iwate");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(214, 21, 242, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Koiwai Farm");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(234, 49, 209, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>Farm Koiwai is a farm located near the foot of Mount Iwate. It's called Makibaen. We can milk cows, ride horses, watch sheep and dog shows at the Makiba Observatory. "
						+"You can come to see the sunspot during the day and see the stars in the vast sky at night. There are also other events. Much more varies by season.</html>");
		lblData.setBounds(32, 388, 605, 123);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Iwate.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setBounds(57, 88, 535, 282);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(309, 538, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(501, 538, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowIwate()
	
	public void ShowAkita() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 672);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Akita");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(214, 21, 242, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Shirakami Sanchi");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(234, 49, 209, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>Riding a beautiful train and enjoying a beautiful view is another activity that should not be missed in Akita. because there is a fun train called Resort Shirakami operates the Gono Line between Aomori and Akita. "
						+"This train is divided into 3 designs, and while moving, there will be various recreational activities. Let us experience the charm of Akita. Whether playing the shamisen Puppetry, etc. "
						+"The highlight of this train trip is the scenery along the way. which can appreciate the beauty of Shirakami Sanchi, which is recognized by UNESCO as a World Heritage Site, no matter what season you go it has different beauty depending on the season.</html>");
		lblData.setBounds(44, 381, 566, 168);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Akita.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setBounds(57, 88, 535, 282);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(309, 570, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(501, 570, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowAkita()
	
	public void ShowYamagata() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 608);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Yamagata");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(185, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Ginzan Onsen");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(234, 49, 209, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>Ginzan Onsen It is a hot spring famous for helping alleviate illness. combined with a retro-style area that full of ancient ryokan It looks like a Spirited Away animated scene "
						+"secretly whispering that this place is at its most beautiful in the winter. You can stop by for a day trip or stay overnight.</html>");
		lblData.setBounds(46, 390, 566, 112);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Yamagata.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setBounds(57, 88, 535, 282);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(308, 524, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(500, 524, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowYamagata()
	
	public void ShowFukushima() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 608);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Fukushima");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(185, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Hanamiyama Park");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(210, 49, 248, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>Hanamiyama Park is a large natural park located not far from Fukushima Station. The garden is spectacular with colors from more than 30 types of seasonal flowers such as "
						+"sakura, plum, peach, canola, camellia, etc., especially someyoshino cherry blossoms. Pink flowers bloom all over the hills, especially in the spring.</html>");
		lblData.setBounds(46, 390, 566, 112);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Fukushima.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setBounds(57, 88, 535, 282);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(308, 524, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(500, 524, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowFukushima()
	
	public void ShowIbaraki() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 677);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Ibaraki");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(185, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Hitachi Seaside Park");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(210, 49, 248, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>Located in Hitachinaka City In addition to being able to see beautiful flowers throughout the 4 seasons, we can also enjoy the rides in the amusement park zone here. Or you can take a Ferris wheel to enjoy the view together. "
						+"It can be said that if you come here We will be able to enjoy a variety of activities. This is because Hitachi Seaside Park faces the Kashimanada Sea and is located on a sand dune created by the northeast wind. "
						+"Sand dunes from the Kuji River have accumulated to form a hill where both warm and cold currents converge, making this place very suitable for farming. Plus the weather is good too.</html>");
		lblData.setBounds(46, 381, 566, 152);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Ibaraki.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setBounds(57, 88, 535, 282);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(309, 566, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(501, 566, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowIbaraki()
	
	public void ShowTochigi() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 677);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Tochigi");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(185, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Kirifuri Waterfall");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(210, 49, 248, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>It is one of Nikko's most beautiful spots for viewing autumn leaves. This waterfall is 75 meters high and is divided into two levels: upper and lower. The reason why this waterfall is called Kirifuri is because when the water hits the rocks, "
						+"It diffuses until it looks like a mist (kiri means mist in Japanese and furi means fall). Kirifuri Falls is particularly beautiful in autumn. The leaves change color between the end of October and the beginning of November.</html>");
		lblData.setBounds(46, 381, 566, 152);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Tochigi.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setBounds(57, 88, 535, 282);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(309, 566, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(501, 566, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowTochigi()
	
	public void ShowGunma() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 677);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Gunma");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(185, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Kusatsu Onsen");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(210, 49, 248, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>It is the most famous onsen town in Gunma prefecture. It is also one of the three best onsen towns in Japan, along with Hyogo Prefecture's Arima Onsen and Gifu Prefecture's Gero Onsen. An easily visible feature of Kusatsu Onsen is the Yubatake, a large chute covered with milky white steam. "
						+"it exports about 5,000 liters of water per minute and is ranked as the largest source of hot spring water in Japan. Another highlight is that near the yubatake, Yumomi no Odori is performed, a local performance where the performers dance along. "
						+"and use a large piece of wood to stir and bring along (to reducing the temperature of the hot springs) There will be performances 6 times a day, the admission fee is 600 yen per person.</html>");
		lblData.setBounds(46, 381, 566, 171);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Gunma.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setBounds(57, 88, 548, 282);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(309, 585, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(501, 585, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowGunma
	
	public void ShowSaitama() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 676);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Saitama");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(185, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Kawagoe’s Warehouse District");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(165, 49, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>It is a charming and quirky neighborhood. very unique It is about 2 kilometers north of Kawagoe Station. The main road is about 700 meters long, but there are alleys between both sides of this road. "
						+"that can walk and travel for a long time What makes this old town popular among tourists is that the whole area is full of old houses from the Edo period along both sides of the street. "
						+"We can tell you that it's taken care of so well that it's unbelievable, like stepping into Edo. This gives the area the nickname Koedo Kawagoe or can be translated as Little Edo.</html>");
		lblData.setBounds(46, 424, 566, 149);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Saitama.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setBounds(46, 86, 554, 327);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(302, 584, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(501, 584, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowSaitama()
	
	public void ShowShiba() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 642);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Shiba");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(185, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Naritasan Shinshoji Temple");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(165, 49, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>An old temple not far from Narita Airport, built since 1977 certified by cultural heritage and It is a temple where the Japanese It is the second most popular place in the country to come and ask for blessings in the new year. "
						+"This place is open every day. Inside the temple is shady and cool if you come in the morning. will also have the opportunity to see the monastic ceremonies.</html>");
		lblData.setBounds(46, 424, 566, 149);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Shiba.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setBounds(79, 86, 500, 327);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(302, 557, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(501, 557, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowShiba
	
	public void ShowTokyo() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 728);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Tokyo");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(185, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Shibuya Crossing");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(174, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>One of Tokyo's most iconic landmarks, it has been featured in many movies and TV shows. This intersection is right in front of Shibuya Station in the bustling Shibuya district. In the corridor crossing a large road that people have to walk intersect Rhythm like the heartbeat of Tokyo More than 500,000 people walk through this intersection every day. "
						+"They will have to wait for the signal to tell pedestrians to cross the street. cross the road from all directions until The light will change the car to continue. In rush hour, there will be more than 3,000 people crossing the road at the same time. "
						+"Shibuya Crossing is a very popular spot for tourists to take pictures. You can fully shoot, you only need to be careful and conscious.</html>");
		lblData.setBounds(46, 424, 566, 184);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Tokyo.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setBounds(56, 86, 549, 327);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(302, 634, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(494, 634, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowTokyo
	
	public void ShowKanagawa() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 711);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Kanagawa");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(185, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Fujiko F. Fujio Museum");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(174, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>This museum is home to the works of the famous manga creator Fujiko F. Fujio. The owner of the work, Doraemon, is a real thing. famous The museum also exhibits works by Fujiko F. Fujio. In addition to Doraemon, such as Parman and Kutaro, here exhibits the prototype "
						+"of the cartoon drawn with a pen, a working table with Fujiko F. Fujio's belongings, a mini-cinema, and scenes from the cartoon for tourists to enjoy. Take pictures with your favorite cartoon characters, and end up visiting the museum's souvenir shop to buy as well.</html>");
		lblData.setBounds(56, 431, 539, 148);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Kanagawa.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setBounds(56, 86, 549, 327);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(302, 619, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(494, 619, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowKanagawa
	
	public void ShowNiigata() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 692);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Niigata");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(186, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Takada Castle");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(174, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>Takada Castle at What we see today was renovated in 1991 and 2017 due to earthquakes and fires. In addition, this castle has been praised as one of Japan's 100 best castles for the highlight here is the moat. "
						+"A beautiful castle town and red bridge. In addition, within the beautiful garden, there are many cherry blossom trees. When it enters the spring season, it will bloom so that the view The scenery of Takadayon Castle is even more beautiful.</html>");
		lblData.setBounds(56, 431, 539, 148);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Niigata.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setBounds(56, 86, 549, 327);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(302, 600, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(494, 600, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowNiigata
	
	public void ShowToyama() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 827, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Toyama");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(279, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Ikedaya Yasubei Shoten");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(264, 54, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>Ikedaya Yasubei located in the heart of the city We can see equipment, containers and shelves where various raw materials are stored. species that have been used for the production of medicines since ancient times. There are also staff who explain how to make Hankotan and show you how to do it several times a day. You can also try cutting medicine with old equipment. You can buy it on the 1st floor of the shop. "
						+"Medicines produced by Ikedayayasu Beichen Medicine and herbal teas are available on the second floor, there is a restaurant Kenkozen Yakuto, which offers healthy food based on the concept of traditional Chinese medicine texts. who believes that \"food is a kind of medicine\", food is prepared with carefully selected ingredients. "
						+"and prepare a balanced menu that is good for the body Healthy set meal can choose a course meal. Prices range from 2,000 yen to 3,000 yen, but be aware that reservations are required in advance for dining.</html>");
		lblData.setBounds(49, 435, 730, 184);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("Toyama.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setBounds(96, 93, 642, 327);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(458, 639, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(650, 639, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowToyama
	
	public void ShowIshikawa() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Ishikawa");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(186, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Kenrokuen Garden");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(174, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>It is a very outstanding landmark of Kanazawa City that nature lovers want to see a beautiful garden must come. because here It is known as one of the three most amazing gardens in Japan. Obsessed with the beautiful scenery in the garden that is uniquely beautiful in every season. "
						+"The name \"Kenroku\" means The garden has six good elements: spaciousness, peaceful atmosphere, harmony, long history, water source, and spectacular surrounding scenery.</html>");
		lblData.setBounds(56, 424, 539, 148);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Ishikawa.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setBounds(56, 86, 549, 327);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(303, 583, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(495, 583, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowIshikawa
	
	public void ShowFukui() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Fukui");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(186, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Heisenji Hakusan Shrine");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(174, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>It has been dubbed as A place of faith for over 1,300 years, this shrine was home to over 8,000 warrior monks or sohei (僧兵). including armed with a halberd. Hakusan Heizenji Shrine It was the largest Buddhist city in Japan in the olden days. "
						+"It is a place with an interesting history. It is a Shinto shrine dedicated to the mountain deity Hakuson. One of the highlights of Hakusan Shrine is the Stone pavement that is still intact even after 1,000 years of time already.</html>");
		lblData.setBounds(56, 424, 539, 148);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Fukui.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setBounds(53, 86, 553, 327);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(303, 583, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(495, 583, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowFukui
	
	public void ShowYamanashi() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Yamanashi");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(186, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Chureito Pagoda");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(174, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>It is a five-story pagoda located in Fujiyoshida City. Yamanashi Prefecture and not far from Lake Kawaguchiko. Located on a hill in the grounds of Arakura Sengen Shrine, the Chureito Pagoda was built in 1963 as a memorial. "
						+"In depth of peace and death from the aftermath of World War II. The most beautiful point of the pagoda is the point where you have to climb up more than 400 stairs. It may be a bit tiring but the view is very beautiful.</html>");
		lblData.setBounds(56, 418, 539, 148);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Yamanashi.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPic.setBounds(56, 87, 550, 320);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(303, 583, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(495, 583, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowYamanashi
	
	public void ShowNagano() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Nagano");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(186, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Hakuba Village");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(174, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>Located in the northern part of the Japanese Alps, just a short distance from Nagano City. This is the home of many ski resorts where many people dream of skiing and snowboarding. Kanaska is also the source of the onsen for us to relax after going through the cold snow. "
						+"But in addition to skiing and onsen activities This village is also a natural beauty. Each season has a different color. In summer, we can see lilies in full bloom at Hakuba Iwatake Lily Park against the green Japanese Alps in the background. Looks bright, suitable for the summer.</html>");
		lblData.setBounds(56, 418, 539, 148);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Nagano.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPic.setBounds(56, 87, 550, 320);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(303, 583, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(495, 583, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowNagano
	
	public void ShowGifu() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Gifu");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(186, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Hida Takayama");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(174, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>This is a tourist city of Gifu Prefecture. Featured with Sanmachi district, the old town area full of Japanese-style buildings. Higashiyama Walking Course, "
						+"where you will find restaurants and restaurants that have been around since the Edo Era and the Meiji Era. Cafes, confectionery shops, and various appliances. along both sides But one must-try when coming to this area is the famous Hida Beef.</html>");
		lblData.setBounds(56, 424, 539, 148);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Gifu.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setBounds(56, 87, 550, 320);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(303, 583, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(495, 583, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowGifu
	
	public void ShowShizuoka() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Shizuoka");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(186, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Izu Peninsula");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(174, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>It is a gathering place for famous resorts regularly. 'Shizuoka Prefecture' which consists of amazing onsen, beautiful beaches. and the scenery of the bright blue sea. The reason why this Peninsula is It is very popular with domestic tourists "
						+"because it is not far from Tokyo. Especially many cities located on the Izu Peninsula. They are all famous for their beautiful beaches and hot springs, such as Atami City, Ito City, and Shimoda City.</html>");
		lblData.setBounds(56, 424, 539, 148);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Shizuoka.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.LEFT);
		lblPic.setBounds(56, 87, 550, 320);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(303, 583, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(495, 583, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowShizuoka
	
	public void ShowAichi() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Aichi");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(186, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Yotsuya No Senmaida");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(174, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>Beautiful green terraced rice fields, over 400 years old, planted by farmers in the village along the foothills at a height of 220 – 420 meters above sea level. Today, more than 30 village farmers in the village continue to plant more than 420 rice fields "
						+"(in the past, they planted up to 1296 rice fields) so that the younger generations in the area can cherish and preserve the intellectual property created by their ancestors.</html>");
		lblData.setBounds(56, 424, 539, 148);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Aichi.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setBounds(56, 87, 550, 320);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(303, 583, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(495, 583, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowAichi
	
	public void ShowMie() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Mie");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(186, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Ise Azuchi Momoyama Culture Village");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(174, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>It is a cultural village that reproduces a town in the Atsushimomoyama era. Atsushi Castle is the main fortress and the village area also has a shrine. Old fashioned hair salon, Ninja Museum, Maze, Haunted House "
						+"There are also many activities including geisha performances, samurai show, and a ninja show. It's a place full of fun and laughter.</html>");
		lblData.setBounds(56, 424, 539, 148);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Mie.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setBounds(56, 87, 550, 320);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(303, 583, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(495, 583, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowMie
	
	public void ShowShiga() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Shiga");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(186, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Lake Biwa");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(174, 47, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>It is the largest lake in Japan, located about 10 kilometers to the east of Kyoto. It is also an important resource for a wide range of industries. It is also one of the oldest lakes in the world, being over four million years old. "
						+"Lake Biwa offers a rich environment home to more than 50 species of aquatic fauna and flora, and of course, with a spectacular view of the lake's islands. Including the mountains surrounding the lake, this is a popular tourist spot for tourists.</html>");
		lblData.setBounds(56, 424, 539, 148);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Shiga.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setBounds(56, 87, 550, 320);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(303, 583, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(495, 583, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowShiga
	
	public void ShowKyoto() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Kyoto");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(186, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Ine Fishing Village");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(174, 47, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>Ine is a preserved fishing village that remains. Only a handful of places in Japan are located north of Kyoto. The highlight of the village is the Boat House by the river, which will be a house with a boat dock in its own house. We can also rent a boat to see around the bay and "
						+"feed the seagulls as well. If anyone wants to stay overnight here to enjoy the good atmosphere of the village, there are homestay accommodations for overnight stays with delicious meals made by fishermen.</html>");
		lblData.setBounds(34, 424, 585, 148);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Kyoto.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setBounds(45, 87, 561, 320);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(303, 583, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(495, 583, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowKyoto
	
	public void ShowOsaka() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Osaka");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(186, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Osaka Castle");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(174, 47, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>The symbol of Osaka and one of the three most famous castles in Japan. It took more than 16 years to complete. It was built in the second half of the 16th century as a residence for Toyotomi Hideyoshi. The highlight that can't be missed here is Nishinomaru Garden, "
						+"where more than 600 cherry trees are planted and will bloom beautifully in April every year, makes the area around the castle look like a dream, making it another beautiful cherry blossom viewing spot in Osaka.</html>");
		lblData.setBounds(34, 424, 585, 148);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Osaka.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setBounds(34, 86, 585, 327);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(303, 583, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(495, 583, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowOsaka
	
	public void ShowHyogo() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Hyogo");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(186, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Kobe Port Tower");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(174, 47, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>The tower was completed in 1963 with the design of the company. Well-known Japanese construction firm Nikken Sekkei is not only the designer of the Kobe Port Tower, but is also behind the design of the 600-meter-tall Tokyo Skytree TV tower, as well as the Barcelona Camp Nou stadium. "
				+"Europe's biggest sport And the second largest in the world with a strange but interesting shape of the building that resembles an hourglass. And towering in the center of the city, this place is an important landmark of Kobe by default.</html>");
		lblData.setBounds(34, 424, 607, 148);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Hyogo.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setBounds(34, 86, 585, 327);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(303, 583, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(495, 583, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowHyogo
	
	public void ShowNara() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Nara");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(219, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Todaiji Temple");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(206, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>Todaiji Temple is the most important and oldest temple in Nara, built in the year 743. If talking about the beauty of this temple, let's start with that gate. Daimon (Nandaimon Gate) A large wooden front gate with intricate carvings. Continue with the inner viharn, which has been praised as the world's largest wooden viharn, "
						+"standing 16 meters high. Inside is enshrined Luang Pho To (Daibutsu), a large bronze Buddha image, 15 meters high and weighing 500 tons. These Todaiji temple have been registered as a World Cultural Heritage Site by UNESCO.</html>");
		lblData.setBounds(34, 424, 637, 148);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Nara.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setBounds(34, 86, 637, 327);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(368, 583, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(560, 583, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowNara
	
	public void ShowWakayama() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Wakayama");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(219, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Wakayama Castle");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(206, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>Wakayama Castle was the residence of the Kishu Tokugawa clan, one of the Tokugawa Gosanke of the Edo period. As a symbol of Wakayama Prefecture, From the castle tower, you can see a 360-degree view of Wakayama City, especially in the evening when the sun sets over the sea is very beautiful, "
						+"suitable for those who like taking photos, don't miss the ninja hospitality at Wakayama Castle The unique ninjas provide all sorts of hospitality from taking photos, guiding, to assisting wheelchair users.</html>");
		lblData.setBounds(34, 424, 637, 148);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Wakayama.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setBounds(34, 87, 655, 327);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(368, 583, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(560, 583, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowWakayama
	
	public void ShowTottori() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 703);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Tottori");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(219, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Gosho Aoyama Manga Factory");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(206, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>Tottori is the birthplace of the great Detective Conan author, so the hometown has been transformed into a Conan theme. There is a museum that includes the history of this cartoon since the author is Sensei Aoyama, what he have to go through to become Conan, sending cool related items from the cartoon, the author's simulation office. "
						+"and many other rare collectibles More importantly, they also have many fun activities to try during the visit. Including, there are many more shiny souvenirs that must be collected outside the museum, train stations, corridors, bus stops. And many things are also made out in the Conan theme as well.</html>");
		lblData.setBounds(34, 424, 637, 148);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Tottori.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setBounds(34, 87, 655, 327);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(368, 606, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(560, 606, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowTottori
	
	public void ShowShimane() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 703);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Shimane");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(219, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Izumo Taisha Shrine");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(206, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>Izumo Taisha Shrine has a legend that Japanese gods gather here in October according to the Lunar calendar. (November according to the solar calendar or international calendar) The main hall was built in 1744. It is 24 meters tall, but legend says it is larger, "
						+"reaching 96 meters (usually the main hall is not open to visitors). Which is the place where dances are held for the gods, has the largest rope or Shimenawa rope in Japan, 13 meters long and weighs 5.2 tons.</html>");
		lblData.setBounds(57, 466, 624, 148);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Shimane.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setBounds(34, 87, 655, 368);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(368, 606, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(560, 606, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowShimane
	
	public void ShowOkayama() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 690);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Okayama");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(219, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Okayama Korakuen Garden");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(206, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>A beautiful Japanese garden that is beautiful in every season. Importantly, it is also ranked 1 in 3 of the most beautiful gardens in Japan. The decoration here is something that is very perfect. There is both shady under every part. "
						+"You can also see the background of Okayama Castle. Whether it's spring or autumn leaves, you won't be disappointed if you come here.</html>");
		lblData.setBounds(47, 467, 624, 148);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Okayama.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPic.setBounds(47, 87, 624, 365);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(368, 594, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(560, 594, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowOkayama
	
	public void ShowHiroshima() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 690);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Hiroshima");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(219, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Hiroshima Castle");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(206, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>This five-story castle is surrounded by a moat where the original was built. Built for the first time in 1589 by the governor Moriteru Moto, but was damaged by the bomb, so it was restored. And open as a museum to visit the history of the "
						+"castle and Hiroshima Prefecture every Sunday on the 2nd floor, friends can watch the Hiroshima dance (Aki Hiroshima Busho Tai) as well. Able to see a beautiful view of the city of Hiroshima in a wide angle.</html>");
		lblData.setBounds(47, 463, 624, 120);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Hiroshima.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPic.setBounds(47, 87, 624, 365);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(368, 594, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(560, 594, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowHiroshima
	
	public void ShowYamaguchi() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Yamaguchi");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(233, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Tsunoshima Bridge");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(224, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>Tsunoshima Bridge that connects the village of Hohoku, Shimonoseki City and Tsunoshima Island, because apart from the bridge that stretches in a straight line before bending slightly. You will still be able to see the blue sea that blends in with the bridge. It can be said that it is a harmony between nature and man-made things. "
						+"The beauty of this bridge can be seen from the movie. Japanese car identity There is always money to choose Tsunoshima Bridge as a filming location. We believe that there are many beautiful corners that you have to discover by yourself.</html>");
		lblData.setBounds(57, 463, 648, 148);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Yamaguchi.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPic.setBounds(47, 87, 648, 365);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(392, 622, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(584, 622, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowYamaguchi
	
	public void ShowTokushima() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 701);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Tokushima");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(233, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Senba Cliffs");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(224, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>A cliff-top observation deck of more than 200 meters. If you like looking at the sea from a high altitude, you should come here as the area has 2 km long cliffs on the Minami Awa Sunline Route. "
						+"Chic and beautiful, we recommend coming here as a beautiful viewpoint. In the midst of the sea atmosphere, extremely romantic.</html>");
		lblData.setBounds(57, 463, 648, 116);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Tokushima.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setBounds(57, 87, 637, 365);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(392, 604, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(584, 604, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowTokushima
	
	public void ShowKagawa() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Kagawa");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(212, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Seto Ohashi Bridge");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(201, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>The longest two-tiered bridge in the world, with a length of 13.1 kilometers across five islands, is also a cable suspension bridge. and the largest steel anchor bridge in the world as well. "
						+"The top is a road for cars and the bottom is a rail for JR trains. “Seto Ohashi Tower” will be illuminated on Saturdays and holidays, creating a very beautiful atmosphere.</html>");
		lblData.setBounds(53, 463, 616, 116);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Kagawa.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setBounds(36, 87, 637, 365);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(373, 590, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(562, 590, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowKagawa
	
	public void ShowEhime() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 657);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Ehime");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(212, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Botchan Train");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(201, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>It is an old train that has existed since the Meiji era and is now used as a tourist train that will take tourists along the city's famous attractions.</html>");
		lblData.setBounds(46, 463, 616, 116);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Ehime.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setBounds(36, 87, 637, 365);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(370, 563, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(562, 563, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowEhime
	
	public void ShowKochi() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 771);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Kochi");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(212, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Koji Castle");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(201, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>It is one of the twelve original castles that survived the catastrophe especially the aftermath of wars that occurred during the feudal age of Japan. The castle was built in the early 17th century ( 1601-1611), but the main building was completed in 1748 after some of the structures were damaged by a fire during the Edo period. Kochi Castle was once under the lordship of Yamauchi and is now registered as an Important Cultural Properties. "
						+"The uniqueness of Kochi Castle is its main tower, called Donjon, which was built not only to facilitate war but also to serve as a residence. too Different from other castles that usually built a noble residence separate from the castle. And the wooden furniture used for interior decoration is designed in the style of Edo art. If looking down from the top of the castle tower we can see The city's reputation has all been covered.</html>");
		lblData.setBounds(20, 463, 710, 171);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/Kochi.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setBounds(10, 87, 720, 365);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(409, 670, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(601, 670, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowKochi
	
	public void ShowFukuoka() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 725);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Fukuoka");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(212, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Gundam Park Fukuoka");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(199, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>It is a paradise for people who love Gundam who come and enjoy until forgetting the time. It will be located inside the shopping center Mitsui Shopping Park LalaPort Fukuoka, which here is divided into 3 zones together, whether it is GUNDAM SIDE- F that is fully distributed, various models, even limited editions that are rare to shop for, "
						+"followed by VS PARK WITH G, an area full of various bug-related activities. There is also Namco, an area full of arcades with exclusive games that are only available here. And yet there is still a great highlight, the newest 24.8 meters tall giant robot for you to take pictures with.</html>");
		lblData.setBounds(53, 463, 616, 133);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Fukuoka.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setBounds(36, 87, 637, 365);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(356, 627, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(548, 627, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowFukuoka
	
	public void ShowSaga() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 725);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Saga");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(212, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Niji No Matsubara Pine Grove");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(199, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>It's not just an ordinary pine forest, because the Nijino Matsubara black pine forest is ranked as one of the three largest black pine forests in Japan. It has a length of 4.5 kilometers along the coastline adjacent to Karatsu Bay. Nowadays, this black pine forest is still the lungs of Karatsu City because it is full of lush greenery that is very rich. The "
						+"top of the huge black pine tree has branches that curve and connect to form a natural tunnel that not only provides shade but is also very beautiful. Visiting the Nijino Matsubara Black Pine Forest, We recommended to rent a car to drive, enjoy the breeze, and enjoy the view and chill out will be the best thing.</html>");
		lblData.setBounds(36, 463, 633, 153);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Saga.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setBounds(36, 87, 637, 365);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(356, 627, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(548, 627, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowSaga
	
	public void ShowNagasaki() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 725);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Nagasaki");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(212, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Oura Church");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(199, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>Oura Church was built by a French priest in 1864 at the end of the Edo period. Used as a religious place for western merchants, this church is the most famous Catholic church in Japan. It commemorates the 26 Christians who were executed in 1597 and was also the first Christian church to be registered as a national treasure in Japan. "
						+"top of the huge black pine tree has branches that curve and connect to form a natural tunnel that not only provides shade but is also very beautiful. Visiting the Nijino Matsubara Black Pine Forest, We recommended to rent a car to drive, enjoy the breeze, and enjoy the view and chill out will be the best thing.</html>");
		lblData.setBounds(36, 463, 633, 153);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Nagasaki.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setBounds(36, 87, 637, 365);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(356, 627, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(548, 627, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowNagasaki
	
	public void ShowKumamoto() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 741);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Kumamoto");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(212, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Shimotori Shopping Arcade");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(199, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>Shimotori Shopping Arcade is known as the largest shopping district in Kumamoto Prefecture. Moreover, this shopping area can also attract local people as well as tourism to dissolve the property up to 50,000 people per day!! This Shimotori area is packed with shopping malls, boutiques, food and beverage outlets, especially if your friends are into drinking. There are also izakayas where everyone can enjoy excellent alcohol and delicious food "
						+"(izakaya, Japanese-style bars that usually serve alcohol and food eaten with alcoholic drinks. It is popular among working people who want to hang out and relax. The atmosphere of the restaurant is similar to a British pub or Irish pub) and if you are lucky, you will also see a great performance by many great musicians and bands.</html>");
		lblData.setBounds(46, 463, 668, 171);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Kumamoto.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setBounds(46, 87, 637, 365);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(402, 645, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(594, 645, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowKumamoto
	
	public void ShowOita() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 706);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Oita");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(212, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Mameda-machi, Hita City");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(199, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>The history of this area dates back to the Edo period around 1616. It is still preserved here, earning the nickname of one of Kyushu's Little Kyotos. The two main streets running from north to south are "
						+"Kamimachi Street and Miyuki Street, both sides of which are surrounded by old buildings and shops lined with traditional architecture.</html>");
		lblData.setBounds(46, 471, 668, 105);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Oita.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setBounds(46, 87, 637, 365);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(402, 605, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(594, 605, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowOita
	
	public void ShowMiyazaki() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Miyazaki");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(212, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Takachiho");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(199, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>The water flowing through the towering rock walls of Takachiho Gorge was created purely by nature rather than from the sharply cooled lava ash in the river. The eruption of Mt. Aso a long time ago will come just to take a walk and enjoy the view. But it would be good to recommend renting a rowing boat to see the splendor of the rock "
						+"cliff from the stream below. You will also be able to see the Manai Falls, one of the famous waterfalls in Japan that is 17 meters high up close. Boat rental service hours 8:30-17:00 Rental fee for 1 boat 30 minutes 2,000 yen.</html>");
		lblData.setBounds(46, 471, 668, 114);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Miyazaki.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setBounds(46, 87, 637, 365);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(402, 631, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(594, 631, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowMiyazaki
	
	public void ShowKagoshima() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Kagoshima");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(212, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Yakushima Island");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(199, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>Yakushima Island or what many people may be familiar with as Yaku Island. Let me tell you that anyone who wants to immerse themselves in nature, we highly recommend this place because it has been registered by UNESCO as a natural world heritage site. Therefore, "
						+"the matter of the abundance of forests and forests is definitely gone. The highlight of the island is the Cryptomeria tree, which is a thousand years old tree, especially the Jomonsugi tree, which is over 3,000 years old. You shouldn't miss this one.</html>");
		lblData.setBounds(33, 474, 704, 114);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/Kagoshima.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setBounds(51, 87, 659, 369);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(414, 631, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(606, 631, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowKagoshima
	
	public void ShowOkinawa() {
		setTitle("Travel Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("You want to go to Okinawa");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(212, 22, 299, 28);
		contentPane.add(lblHeader);
		
		JLabel lblSuggest = new JLabel("We suggested : Shuri Castle");
		lblSuggest.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuggest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSuggest.setBounds(199, 48, 326, 28);
		contentPane.add(lblSuggest);
		
		JLabel lblData = new JLabel();
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setVerticalAlignment(SwingConstants.TOP);
		lblData.setText("<html>Okinawa is home to 9 UNESCO World Heritage Sites, one of which you should not miss visiting is Shuri Castle. Built around the end of the 14th century, the bright red castle was a prominent symbol and center of politics, foreign affairs, and culture during the Ryukyu Kingdom era. "
						+"That castle was destroyed during the Battle of Okinawa until only the walls remained. After that, the main building was built. and a new Shuremon Gate with a mix of Japanese and Chinese architectural styles.</html>");
		lblData.setBounds(33, 474, 704, 114);
		contentPane.add(lblData);
		
		JLabel lblPic = new JLabel("");
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/Okinawa.jpg")).getImage();
		lblPic.setIcon(new ImageIcon(img));
		lblPic.setBounds(51, 87, 659, 369);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
				dispose(); //close current frame after return to TravelGuide class
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMenu.setBounds(414, 631, 182, 28);
		contentPane.add(btnReturnMenu);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(606, 631, 111, 28);
		contentPane.add(btnClose);
	}//end of ShowOkinawa
}