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
		
		JLabel lblPic = new JLabel("New label");
		lblPic.setIcon(new ImageIcon("D:\\FinalProject\\Attraction\\Gunma.jpg"));
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
		
		JLabel lblPic = new JLabel("New label");
		lblPic.setIcon(new ImageIcon("D:\\FinalProject\\Attraction\\Saitama.jpg"));
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
		
		JLabel lblPic = new JLabel("New label");
		lblPic.setIcon(new ImageIcon("D:\\FinalProject\\Attraction\\Shiba.jpg"));
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
		
		JLabel lblPic = new JLabel("New label");
		lblPic.setIcon(new ImageIcon("D:\\FinalProject\\Attraction\\Tokyo.jpg"));
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
		
		JLabel lblPic = new JLabel("New label");
		lblPic.setIcon(new ImageIcon("D:\\FinalProject\\Attraction\\Kanagawa.jpg"));
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
		
		JLabel lblPic = new JLabel("New label");
		lblPic.setIcon(new ImageIcon("D:\\FinalProject\\Attraction\\Niigata.jpg"));
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
		
		JLabel lblPic = new JLabel("New label");
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setIcon(new ImageIcon("D:\\FinalProject\\Attraction\\Toyama.jpg"));
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
		
		JLabel lblPic = new JLabel("New label");
		lblPic.setIcon(new ImageIcon("D:\\FinalProject\\Attraction\\Ishikawa.jpg"));
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
		
		JLabel lblPic = new JLabel("New label");
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setIcon(new ImageIcon("D:\\FinalProject\\Attraction\\Fukui.jpg"));
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
}
