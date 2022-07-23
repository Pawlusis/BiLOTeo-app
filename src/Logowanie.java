package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.text.*;

public class Logowanie extends JFrame
{
	Container c = getContentPane();
	JPanel PFlightTypes = new JPanel(null);
	JPanel PLogin = new JPanel(null);
	JPanel PFlightDetails = new JPanel(null);

	public boolean bCheck=true;

	JLabel LDomesticFlight = new JLabel("Loty Wewnętrzne");
	JLabel LInternationalFlight = new JLabel("Loty Międzynarodowe");

	JLabel LUserName, LPassword;

	JLabel LDomesticFlight1 = new JLabel("Rezerwacja Lotów Wewnętrznych");
	JLabel LInternationalFlight1 = new JLabel("Rezerwacja Lotów Miedzynarodowych");

	JTextField TFUserName;
	JPasswordField TPPassword;

	JButton BLogin;

	final Object[] col1 ={ "Z","Do","Cena[PLN]","Godzina Odlotu" };
	final Object[] col2 = { "Z","Do","Cena[PLN]","Godzina Odlotu"  };
	final Object[] col3 = { "Z","Do","Cena[PLN]","Godzina Odlotu" };

	final Object[][] row1 = { { "Wroclaw", "Gdynia", "248", "16:30" }, { "Wroclaw", "Warszawa-Modlin ", "225", "19:00" }, { "Wroclaw", "Warszawa-Okecie", "245 ", "08:30" }, { "Wroclaw", "Bydgoszcz", "315 ", "09:50" }, { "Wroclaw", "Gdansk", "525", "11:00" }, { "Wroclaw", "Poznan", "325 ", "05:30" }, { "Wroclaw", "Krakow", "3025 ", "05:30" }, { "Wroclaw", "Katowice", "125", "12:00" }, { "Wroclaw", "Lublin", "125", "19:00" } };
	final Object[][] row2 = { { "Wroclaw", "Bali", "4485", "06:20" }, { "Wroclaw", "Bangkok", "9000", "20:45" }, { "Wroclaw", "Kair", "22975", "10:25" }, { "Wroclaw", "Kapsztad", "8500", "16:45" }, { "Wroclaw", "Chicago", "12000", "06:30" }, { "Wroclaw", "Dubai", "2000", "08:15" }, { "Wroclaw", "Frankfurt", "800", "06:50" }, { "Wroclaw", "HongKong", "6845", "12:00" }, { "Wroclaw", "Istanbul", "2000", "10:45" }, { "Wroclaw", "Londyn", "2600", "14:35" }, { "Wroclaw", "LosAngeles", "9000", "22:00" }, { "Wroclaw", "Melbourne", "7800", "21:15" }, { "Wroclaw", "New York", "32000", "08:50" }, { "Wroclaw", "Paryż", "1200", "18:45" }, { "Wroclaw", "Rome", "1900", "20:00"}, { "Wroclaw", "SanFrancisco", "5000", "12:00"}, { "Wroclaw", "shanghai", "4430", "10:15" }, { "Wroclaw", "Singapore", "9000", "21:10" }, { "Wroclaw", "Sydney", "27800", "12:00"}, { "Wroclaw", "Toronto", "9000", "17:00 " } };
	final Object[][] row3 = { { "Wroclaw", "Gdynia", "575", "16:30" }, { "Wroclaw", "Warszawa-Modlin ", "675", "19:00" }, { "Wroclaw", "Warszawa-Okecie", "975", "08:30" }, { "Wroclaw", "Bydgoszcz", "375", "09:50" }, { "Wroclaw", "Gdansk", "475", "11:00" }, { "Wroclaw", "Poznan", "175", "05:30" }, { "Wroclaw", "Krakow", "675", "05:30" }, { "Wroclaw", "Katowice", "575", "12:00" }, { "Wroclaw", "Lublin", "1175", "19:00" } };
	final Object[][] row4 = { { "Wroclaw", "Bali", "9455", "06:20" }, { "Wroclaw", "Bangkok", "27000", "20:45" }, { "Wroclaw", "Kair", "68925", "10:25" }, { "Wroclaw", "Kapsztad", "37500", "16:45" }, { "Wroclaw", "Chicago", "25000", "06:30" }, { "Wroclaw", "Dubai", "36000", "08:15" }, { "Wroclaw", "Frankfurt", "3500", "06:50" }, { "Wroclaw", "HongKong", "32535", "12:00" }, { "Wroclaw", "Istanbul", "6000", "10:45" }, { "Wroclaw", "Londyn", "7800", "14:35" }, { "Wroclaw", "LosAngeles", "15000", "22:00" }, { "Wroclaw", "Melbourne", "19400", "21:15" }, { "Wroclaw", "New York", "96000", "08:50" }, { "Wroclaw", "Paryż", "5500", "18:45" }, { "Wroclaw", "Rome", "5700", "20:00" }, { "Wroclaw", "SanFrancisco", "15000", "12:00" }, { "Wroclaw", "shanghai", "7290", "10:15" }, { "Wroclaw", "Singapore", "27000", "21:10"}, { "Wroclaw", "Sydney", "83400", "12:00"}, { "Wroclaw", "Toronto", "15000", "17:00" } };

	JTable TDomesticFlight = new JTable(row1, col1);
	JTable TInternationalFlight = new JTable(row2, col2);
	JTable TDomesticFlight1 = new JTable(row3, col3);
	JTable TInternationalFlight1 = new JTable(row4, col2);

	JScrollPane JSP1 = new JScrollPane(TDomesticFlight, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP2 = new JScrollPane(TInternationalFlight, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP3 = new JScrollPane(TDomesticFlight1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP4 = new JScrollPane(TInternationalFlight1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	Icon img1 = new ImageIcon("img/economic.jpg");
	Icon img2 = new ImageIcon("img/business.jpg");
	Icon img3 = new ImageIcon("img/economic1.jpg");
	Icon img4 = new ImageIcon("img/business1.jpg");

	JLabel LEconomic = new JLabel("Economic", null, SwingConstants.LEFT);
	JLabel LBusiness = new JLabel("Business", null, SwingConstants.LEFT);
	JLabel LEconomic1 = new JLabel("Economic", null, SwingConstants.LEFT);
	JLabel LBusiness1 = new JLabel("Business", null, SwingConstants.LEFT);

	public Logowanie()
	{
		NarzedziaOkno.setNativeLookAndFeel();
		setPreferredSize(new Dimension(796,572));

		PFlightTypes.setBackground(Color.white);
		PLogin.setBackground(Color.white);
		PFlightDetails.setBackground(Color.white);

		JSP1.setBounds(0, 340, 790, 200);
		JSP2.setBounds(0, 340, 790, 200);
		JSP3.setBounds(0, 340, 790, 200);
		JSP4.setBounds(0, 340, 790, 200);

		PFlightTypes.setBounds(0,0,500, 340);
		PLogin.setBounds(500,0,350, 340);
		PFlightDetails.setBounds(0,340,790,200);


		LUserName = new JLabel("Login");
		LUserName.setHorizontalAlignment(SwingConstants.RIGHT);
		LPassword = new JLabel("Hasło");
		LPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		TFUserName = new JTextField(10);
		TPPassword = new JPasswordField(10);
		BLogin = new JButton("Zaloguj");

		LUserName.setBounds(40, 100, 100, 21);
		LPassword.setBounds(40, 140, 100, 21);
		TFUserName.setBounds(160, 100, 100, 21);
		TPPassword.setBounds(160, 140, 100, 21);
		BLogin.setBounds(160, 200, 100,25);

		LDomesticFlight1.setBounds(5, 60, 300, 20);
		LInternationalFlight1.setBounds(5, 100, 300, 20);

		PLogin.add(LUserName);
		PLogin.add(TFUserName);
		PLogin.add(LPassword);
		PLogin.add(TPPassword);
		PLogin.add(BLogin);

		PFlightDetails.add(JSP1);
		PFlightDetails.add(JSP2);
		PFlightDetails.add(JSP3);
		PFlightDetails.add(JSP4);

		JSP1.setVisible(true);
		JSP2.setVisible(false);
		JSP3.setVisible(false);
		JSP4.setVisible(false);
		LBusiness.setForeground(Color.BLUE);

		LBusiness.setBounds(340, 168, 300, 125);
		LEconomic.setForeground(Color.BLUE);
		LEconomic.setBounds(50, 168, 250, 125);
		LBusiness1.setBounds(340, 200, 135, 60);
		LEconomic1.setBounds(50, 200, 147, 60);

		PFlightTypes.add(LEconomic);
		PFlightTypes.add(LBusiness);
		PFlightTypes.add(LEconomic1);
		PFlightTypes.add(LBusiness1);

		LBusiness.setVisible(false);
		LEconomic1.setVisible(false);
		LBusiness1.setVisible(true);
		LEconomic.setVisible(true);


		LDomesticFlight.setBounds(60, 60, 147, 25);
		LInternationalFlight.setBounds(60, 100, 202, 25);

		c.add(PFlightTypes);
		c.add(PLogin);
		c.add(PFlightDetails);

		PFlightTypes.add(LDomesticFlight);
		PFlightTypes.add(LInternationalFlight);

		pack();
		setVisible(true);

		addWindowListener(new ZamkniecieList());

		LDomesticFlight.addMouseListener(new mouse1(this, true));
		LInternationalFlight.addMouseListener(new mouse1(this, false));

		LDomesticFlight1.addMouseListener(new mouse3(this, true));
		LInternationalFlight1.addMouseListener(new mouse3(this, false));

		LBusiness1.addMouseListener(new mouse2(this, true));
		LEconomic1.addMouseListener(new mouse2(this, false));

		BLogin.addActionListener(new button1(this));
	}

	public static void main(String args[])
	{
		new Logowanie();
	}
}


class button1 implements ActionListener
{
	Logowanie type;
	char[] cCheck, cPassword={'a','d','m','i','n','\0'};
	JFrame f;
	String sCheck,sCheck1="admin";

	public button1(Logowanie type)
	{
		this.type = type;
	}
	public void actionPerformed(ActionEvent e)
	{
		cCheck=type.TPPassword.getPassword();
		sCheck = type.TFUserName.getText();
		if ((sCheck1.equals(sCheck)) && check())
		{
			type.PLogin.add(type.LDomesticFlight1);
			type.PLogin.add(type.LInternationalFlight1);

			type.PLogin.remove(type.LUserName);
			type.PLogin.remove(type.TFUserName);
			type.PLogin.remove(type.LPassword);
			type.PLogin.remove(type.TPPassword);
			type.PLogin.remove(type.BLogin);

			type.c.repaint();
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid username or password. Try again");
		}
	}
	public boolean check()
	{
		if (cCheck.length >= 6 || cCheck.length < 4)
			return false;
		for(int i=0;i<=4;i++)
		{
			if(cCheck[i]!=cPassword[i])
				return false;
		}
		return true;
	}
}

class mouse1 extends MouseAdapter
{
	Logowanie type;
	boolean bCheck;

	public mouse1(Logowanie type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
		type.LDomesticFlight.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.LInternationalFlight.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseClicked(MouseEvent e)
	{
		if(bCheck)
			type.bCheck = true;
		else
			type.bCheck = false;
		type.LEconomic.setVisible(true);
		type.LBusiness1.setVisible(true);
		type.LEconomic1.setVisible(false);
		type.LBusiness.setVisible(false);

		type.JSP1.setVisible(false);
		type.JSP2.setVisible(false);
		type.JSP3.setVisible(false);
		type.JSP4.setVisible(false);
		if(bCheck)
			type.JSP1.setVisible(true);
		else
			type.JSP2.setVisible(true);
	}
}



class mouse3 extends MouseAdapter
{
	Logowanie type;
	boolean bCheck;

	public mouse3(Logowanie type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
		type.LDomesticFlight1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.LInternationalFlight1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseClicked(MouseEvent e)
	{
		if (bCheck)
			new LotyWewnetrzne(type);
		else
			new LotyMiedzynarodowe(type);
	}
}


class mouse2 extends MouseAdapter
{
	Logowanie type;
	boolean bCheck;

	public mouse2(Logowanie type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
		type.LEconomic1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.LBusiness1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseClicked(MouseEvent e)
	{
		if(type.bCheck)
		{
			if (bCheck)
			{
				type.LBusiness1.setVisible(false);
				type.LBusiness.setVisible(true);
				type.LEconomic.setVisible(false);
				type.LEconomic1.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(true);
				type.JSP4.setVisible(false);
			}
			else
			{
				type.LEconomic1.setVisible(false);
				type.LBusiness.setVisible(false);
				type.LBusiness1.setVisible(true);
				type.LEconomic.setVisible(true);
				type.JSP1.setVisible(true);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(true);
				type.JSP4.setVisible(false);
			}
		}
		else
		{
			if (bCheck)
			{
				type.LBusiness1.setVisible(false);
				type.LBusiness.setVisible(true);
				type.LEconomic.setVisible(false);
				type.LEconomic1.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(false);
				type.JSP4.setVisible(true);
			}
			else
			{
				type.LEconomic1.setVisible(false);
				type.LBusiness.setVisible(false);
				type.LBusiness1.setVisible(true);
				type.LEconomic.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(true);
				type.JSP3.setVisible(false);
				type.JSP4.setVisible(false);
			}
		}
	}
}

