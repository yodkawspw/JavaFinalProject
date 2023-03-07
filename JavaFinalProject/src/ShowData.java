import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
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
		
		JLabel lblPic = new JLabel("Input Picture here");
		lblPic.setIcon(new ImageIcon(""));
		lblPic.setBounds(38, 88, 572, 266);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
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
		
		JLabel lblPic = new JLabel("New label");
		lblPic.setIcon(new ImageIcon("D:\\FinalProject\\Attraction\\Hokkaido.jpeg"));
		lblPic.setBounds(22, 88, 605, 266);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
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
		
		JLabel lblPic = new JLabel("New label");
		lblPic.setIcon(new ImageIcon("D:\\FinalProject\\Attraction\\Aomori.jpg"));
		lblPic.setBounds(32, 88, 580, 282);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
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
		
		JLabel lblPic = new JLabel("New label");
		lblPic.setIcon(new ImageIcon("D:\\FinalProject\\Attraction\\Iwate.jpg"));
		lblPic.setBounds(57, 88, 535, 282);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
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
		
		JLabel lblPic = new JLabel("New label");
		lblPic.setIcon(new ImageIcon("D:\\FinalProject\\Attraction\\Akita.jpg"));
		lblPic.setBounds(57, 88, 535, 282);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
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
		
		JLabel lblPic = new JLabel("New label");
		lblPic.setIcon(new ImageIcon("D:\\FinalProject\\Attraction\\Yamagata.jpg"));
		lblPic.setBounds(57, 88, 535, 282);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
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
		
		JLabel lblPic = new JLabel("New label");
		lblPic.setIcon(new ImageIcon("D:\\FinalProject\\Attraction\\Fukushima.png"));
		lblPic.setBounds(57, 88, 535, 282);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
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
		
		JLabel lblPic = new JLabel("New label");
		lblPic.setIcon(new ImageIcon("D:\\FinalProject\\Attraction\\Ibaraki.jpg"));
		lblPic.setBounds(57, 88, 535, 282);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
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
		
		JLabel lblPic = new JLabel("New label");
		lblPic.setIcon(new ImageIcon("D:\\FinalProject\\Attraction\\Tochigi.jpg"));
		lblPic.setBounds(57, 88, 535, 282);
		contentPane.add(lblPic);
		
		JButton btnReturnMenu = new JButton("Return to Main Menu");
		btnReturnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TravelGuide tg = new TravelGuide();
				tg.setVisible(true);
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
	
	
}
