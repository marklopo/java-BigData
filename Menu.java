package start;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Menu {
	/**
	 * @author mk
	 * @version 1.0.0
	 * 
	 *          The main task of the application is to collect large data sets on
	 *          the basis of which trends can be forecasted in the future. The
	 *          program is a proposal for a project supporting a security,
	 *          electricity and heating management system for a single-family house.
	 *          The system allows you to control roller shutters, lighting and
	 *          heating inside the building.
	 * @param poziom        = building level
	 * @param obiekt        = object in the building, e.g. lighting
	 * @param pobor         = consumption of a specific medium
	 * @param czasstart     = starting a given process
	 * @param czasstop      = termination of a given process
	 * @param identyfikacja = identification number assigned during entry into the
	 *                      database
	 * @param temp_a        = current room temperature
	 * @param temp_p        = temperature to be reached
	 * 
	 */

	private JFrame frame;
	public static JPanel panel_admin;
	public static JPanel panel_ustawienia;
	public static JPanel panel_wyloguj;
	public static JPanel panel_start;
	public static JPanel p_bazadanych;
	public static JLabel lblNewLabel;
	public static JLabel lblSql;
	public static JLabel lbl_start;
	public static JLabel lbl_admin;
	public static JLabel lbl_wyloguj;
	public static JLabel lbl_ustawienia;
	public static JPanel p_wyloguj;
	public static JPanel p_start;
	public static JPanel p_ustawienia;
	public static JPanel p_admin;
	private JPanel panel_4;
	private JPanel panel_3;
	private JPanel panel_5;
	public static JTable table;
	private JScrollPane scrollPane;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public static Connection polaczenie = null;
	static JButton btnNewButton;
	public static JLabel lbl_czas;
	public static JTable table_2;
	public static JTable table_ogrzewanie;
	private JPanel panel_8;
	private JPanel panel_9;
	public static JPanel front_okno01;
	public static JPanel front_okno11;
	public static JPanel front_okno12;
	public static JPanel front_drzwi11;
	private JPanel panel_14;
	private JPanel panel_15;
	private JPanel panel_7_1;
	private JPanel panel_17;
	static JPanel okno02;
	static JPanel okno13;
	private JPanel panel_24;
	private JPanel panel_7_2;
	private JPanel panel_26;
	private JPanel panel_27;
	static JPanel okno03;
	static JPanel okno15;
	static JPanel okno14;
	private JPanel panel_16;
	private JPanel panel_7_3;
	private JPanel panel_18;
	static JPanel okno05;
	static JPanel okno16;
	private JPanel panel_23;
	static JPanel drzwi01;
	static JPanel okno04;
	private JPanel panel_30;
	private JPanel panel_32;
	private JPanel panel_34;
	private JPanel panel_35;
	public static JComboBox obiekt;
	public static JComboBox status;
	public static JComboBox poziom;
	public static JComboBox widok;
	static JPanel s01;
	public static JTextField a_miesiac;
	public static JTextField a_rok;
	private JPanel panel_11;
	private JPanel panel_13;
	private JPanel panel_36;
	private JPanel panel_37;
	private JPanel s02;
	private JPanel s03;
	private JPanel panel_10;
	private JPanel s04;
	private JPanel s05;
	private JPanel s06;
	private JPanel panel_6_2;
	private JPanel panel_38;
	private JPanel s16;
	private JPanel panel_39;
	private JPanel s14;
	private JPanel panel_40;
	private JPanel s11;
	private JPanel panel_41;
	private JPanel s12;
	private JPanel panel_42;
	private JPanel s13;
	private JPanel panel_43;
	private JPanel s15;
	private JPanel g02;
	private JPanel g03;
	private JPanel g05;
	private JPanel g04;
	private JPanel g01;
	private JPanel g11;
	private JPanel g13;
	private JPanel g14;
	private JPanel g15;
	private JPanel g16;
	private JPanel g12;
	private JLabel lblNewLabel_4;
	static JTextField a_poziom01;
	static JTextField a_swiatlo01;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_3_1;
	static JTextField a_pobor01;
	static JTextField a_czasstart01;
	static JTextField a_czasstop01;
	static JTextField a_id01;
	private JTextField a_poziom02;
	private JTextField a_swiatlo02;
	private JTextField a_pobor02;
	private JTextField a_czasstart02;
	private JTextField a_czasstop02;
	private JTextField a_id02;
	private JTextField a_poziom03;
	private JTextField a_swiatlo03;
	private JTextField a_pobor03;
	private JTextField a_czasstart03;
	private JTextField a_czasstop03;
	private JTextField a_id03;
	private JTextField a_poziom04;
	private JTextField a_swiatlo04;
	private JTextField a_pobor04;
	private JTextField a_czasstart04;
	private JTextField a_czasstop04;
	private JTextField a_id04;
	private JTextField a_poziom05;
	private JTextField a_swiatlo05;
	private JTextField a_pobor05;
	private JTextField a_czasstart05;
	private JTextField a_czasstop05;
	private JTextField a_id05;
	private JTextField a_poziom06;
	private JTextField a_swiatlo06;
	private JTextField a_pobor06;
	private JTextField a_czasstart06;
	private JTextField a_czasstop06;
	public static JTextField a_id06;
	private JTextField a_id02g;
	private JTextField a_czasstop02g;
	private JTextField a_czasstart02g;
	private JTextField a_pobor02g;
	private JTextField a_swiatlo02g;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField a_swiatlo03g;
	private JTextField a_pobor03g;
	private JTextField a_czasstart03g;
	private JTextField a_czasstop03g;
	private JTextField a_id03g;
	private JTextField textField_16;
	private JTextField a_swiatlo04g;
	private JTextField a_pobor04g;
	private JTextField a_czasstart04g;
	private JTextField a_czasstop04g;
	private JTextField a_id04g;
	private JTextField textField_22;
	private JTextField a_swiatlo05g;
	private JTextField a_pobor05g;
	private JTextField a_czasstart05g;
	private JTextField a_czasstop05g;
	private JTextField a_id05g;
	private JTextField textField_28;
	private JTextField a_swiatlo01g;
	private JTextField a_pobor01g;
	private JTextField a_czasstart01g;
	private JTextField a_czasstop01g;
	private JTextField a_id01g;
	private JTextField a_poziom11;
	private JTextField a_swiatlo11;
	private JTextField a_pobor11;
	private JTextField a_czasstart11;
	private JTextField a_czasstop11;
	private JTextField a_id11;
	private JTextField txtPoziom_13;
	private JTextField a_swiatlo12;
	private JTextField a_pobor12;
	private JTextField a_czasstart12;
	private JTextField a_czasstop12;
	private JTextField a_id12;
	private JTextField a_id13;
	private JTextField a_czasstop13;
	private JTextField a_czasstart13;
	private JTextField a_pobor13;
	private JTextField a_swiatlo13;
	private JTextField txtPoziom_14;
	private JTextField txtPoziom_15;
	private JTextField a_swiatlo14;
	private JTextField a_pobor14;
	private JTextField a_czasstart14;
	private JTextField a_czasstop14;
	private JTextField a_id14;
	private JTextField a_id15;
	private JTextField a_czasstop15;
	private JTextField a_czasstart15;
	private JTextField a_pobor15;
	private JTextField a_swiatlo15;
	private JTextField txtPoziom_16;
	private JTextField txtPoziom_17;
	private JTextField a_swiatlo16;
	private JTextField a_pobor16;
	private JTextField a_czasstart16;
	private JTextField a_czasstop16;
	private JTextField a_id16;
	private JTextField txtPoziom_18;
	private JTextField a_swiatlo11g;
	private JTextField a_pobor11g;
	private JTextField a_czasstart11g;
	private JTextField a_czasstop11g;
	private JTextField a_id11g;
	private JTextField txtPoziom_19;
	private JTextField a_swiatlo12g;
	private JTextField a_pobor12g;
	private JTextField a_czasstart12g;
	private JTextField a_czasstop12g;
	private JTextField a_id12g;
	private JTextField a_id13g;
	private JTextField a_czasstop13g;
	private JTextField a_czasstart13g;
	private JTextField a_pobor13g;
	private JTextField a_swiatlo13g;
	private JTextField txtPoziom_20;
	private JTextField txtPoziom_21;
	private JTextField a_swiatlo14g;
	private JTextField a_pobor14g;
	private JTextField a_czasstart14g;
	private JTextField a_czasstop14g;
	private JTextField a_id14g;
	private JTextField a_id15g;
	private JTextField a_czasstop15g;
	private JTextField a_czasstart15g;
	private JTextField a_pobor15g;
	private JTextField a_swiatlo15g;
	private JTextField txtPoziom_22;
	private JTextField txtPoziom_23;
	private JTextField a_swiatlo16g;
	private JTextField a_pobor16g;
	private JTextField a_czasstart16g;
	private JTextField a_czasstop16g;
	private JTextField a_id16g;
	private JTextField a_poziom21;
	private JTextField a_swiatlo21;
	private JTextField a_pobor21;
	private JTextField a_czasstart21;
	private JTextField a_czasstop21;
	private JTextField a_id21;
	private JTextField txtPoziom_1;
	private JTextField a_swiatlo22;
	private JTextField a_pobor22;
	private JTextField a_czasstart22;
	private JTextField a_czasstop22;
	private JTextField a_id22;
	private JTextField a_id23;
	private JTextField a_czasstop23;
	private JTextField a_czasstart23;
	private JTextField a_pobor23;
	private JTextField a_swiatlo23;
	private JTextField txtPoziom_2;
	private JTextField txtPoziom_3;
	private JTextField a_swiatlo24;
	private JTextField a_pobor24;
	private JTextField a_czasstart24;
	private JTextField a_czasstop24;
	private JTextField a_id24;
	private JTextField a_id25;
	private JTextField a_czasstop25;
	private JTextField a_czasstart25;
	private JTextField a_pobor25;
	private JTextField a_swiatlo25;
	private JTextField txtPoziom_4;
	private JTextField txtPoziom_5;
	private JTextField a_swiatlo26;
	private JTextField a_pobor26;
	private JTextField a_czasstart26;
	private JTextField a_czasstop26;
	private JTextField a_id26;
	private JTextField txtPoziom_6;
	private JTextField a_swiatlo21g;
	private JTextField a_pobor21g;
	private JTextField a_czasstart21g;
	private JTextField a_czasstop21g;
	private JTextField a_id21g;
	private JTextField txtPoziom_7;
	private JTextField a_swiatlo22g;
	private JTextField a_pobor22g;
	private JTextField a_czasstart22g;
	private JTextField a_czasstop22g;
	private JTextField a_id22g;
	private JTextField a_id23g;
	private JTextField a_czasstop23g;
	private JTextField a_czasstart23g;
	private JTextField a_pobor23g;
	private JTextField a_swiatlo23g;
	private JTextField txtPoziom_8;
	private JTextField txtPoziom_9;
	private JTextField a_swiatlo24g;
	private JTextField a_pobor24g;
	private JTextField a_czasstart24g;
	private JTextField a_czasstop24g;
	private JTextField a_id24g;
	private JTextField a_id25g;
	private JTextField a_czasstop25g;
	private JTextField a_czasstart25g;
	private JTextField a_pobor25g;
	private JTextField a_swiatlo25g;
	private JTextField txtPoziom_10;
	private JTextField txtPoziom_11;
	private JTextField a_swiatlo26g;
	private JTextField a_pobor26g;
	private JTextField a_czasstart26g;
	private JTextField a_czasstop26g;
	private JTextField a_id26g;
	public static JComboBox comboBox;
	public static JTable table_raport_e;
	private JPanel panel_48;
	public static JComboBox rok_e;
	public static JComboBox miesiac_e;
	public static JComboBox obiekt_e;
	private JButton btnNewButton_2;
	private JPanel panel_6_3;
	private JPanel panel_49;
	private JPanel panel_50;
	private JPanel panel_51;
	private JPanel panel_52;
	private JPanel panel_54;
	private JPanel panel_55;
	static JPanel o01;
	private JPanel panel_6_4;
	private JPanel panel_57;
	private JPanel panel_58;
	private JPanel panel_59;
	private JPanel panel_60;
	private JPanel panel_61;
	private JPanel panel_62;
	static JPanel o02;
	static JPanel o03;
	static JPanel o04;
	static JPanel o12;
	static JPanel o11;
	static JPanel o15;
	static JPanel o16;
	static JPanel o14;
	static JPanel o13;
	private JPanel panel_6_5;
	private JPanel panel_53;
	static JPanel o25;
	private JPanel panel_63;
	private JPanel panel_64;
	static JPanel o22;
	private JPanel panel_65;
	static JPanel o23;
	private JPanel panel_66;
	static JPanel o21;
	static JPanel o24;
	private JPanel panel_67;
	private JTextField temp1;
	private JTextField temp2;
	static JTextField temp0;
	private JTextField a_o_poziom0;
	private JTextField a_o_01;
	private JTextField a_o_pobor01;
	private JTextField a_o_czass01;
	private JTextField a_o_czasst01;
	private JTextField a_o_id01;
	private JTextField a_o_id02;
	private JTextField a_o_czasst02;
	private JTextField a_o_czass02;
	private JTextField a_o_pobor02;
	private JTextField a_o_02;
	private JTextField txtPoziom_25;
	private JTextField txtPoziom_26;
	private JTextField a_o_03;
	private JTextField a_o_pobor03;
	private JTextField a_o_czass03;
	private JTextField a_o_czasst03;
	private JTextField a_o_id03;
	private JTextField txtPoziom_27;
	private JTextField a_o_04;
	private JTextField a_o_pobor04;
	private JTextField a_o_czass04;
	private JTextField a_o_czasst04;
	private JTextField a_o_id04;
	private JTextField a_o_poziom1;
	private JTextField a_o_11;
	private JTextField a_o_pobor11;
	private JTextField a_o_czass11;
	private JTextField a_o_czasst11;
	private JTextField a_o_id11;
	private JTextField a_o_id12;
	private JTextField a_o_czasst12;
	private JTextField a_o_czass12;
	private JTextField a_o_pobor12;
	private JTextField a_o_12;
	private JTextField txtPoziom_29;
	private JTextField txtPoziom_30;
	private JTextField a_o_13;
	private JTextField a_o_pobor13;
	private JTextField a_o_czass13;
	private JTextField a_o_czasst13;
	private JTextField a_o_id13;
	private JTextField a_o_id14;
	private JTextField a_o_czasst14;
	private JTextField a_o_czass14;
	private JTextField a_o_pobor14;
	private JTextField a_o_14;
	private JTextField txtPoziom_31;
	private JTextField txtPoziom_32;
	private JTextField a_o_15;
	private JTextField a_o_pobor15;
	private JTextField a_o_czass15;
	private JTextField a_o_czasst15;
	private JTextField a_o_id15;
	private JTextField txtPoziom_33;
	private JTextField a_o_16;
	private JTextField a_o_pobor16;
	private JTextField a_o_czass16;
	private JTextField a_o_czasst16;
	private JTextField a_o_id16;
	private JTextField a_o_id21;
	private JTextField a_o_czasst21;
	private JTextField a_o_czass21;
	private JTextField a_o_pobor21;
	private JTextField a_o_21;
	private JTextField a_o_poziom2;
	private JTextField textField_194;
	private JTextField a_o_22;
	private JTextField a_o_pobor22;
	private JTextField a_o_czass22;
	private JTextField a_o_czasst22;
	private JTextField a_o_id22;
	private JTextField a_o_id23;
	private JTextField a_o_czasst23;
	private JTextField a_o_czass23;
	private JTextField a_o_pobor23;
	private JTextField a_o_23;
	private JTextField textField_205;
	private JTextField textField_206;
	private JTextField a_o_24;
	private JTextField a_o_pobor24;
	private JTextField a_o_czass24;
	private JTextField a_o_czasst24;
	private JTextField a_o_id24;
	private JTextField textField_212;
	private JTextField a_o_25;
	private JTextField a_o_pobor25;
	private JTextField a_o_czass25;
	private JTextField a_o_czasst25;
	private JTextField a_o_id25;
	static JTable table_ogrzewanie_r;
	private JLabel lblNewLabel_7;
	private JPanel panel_71;
	public JLabel lblNewLabel_8;
	private JPanel panel_72;
	public JLabel lblNewLabel_9;
	private JPanel panel_73;
	static JLabel meteo_temp;
	static JLabel meteo_zachm;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	static JLabel meteo_wilg;
	private JLabel lblNewLabel_12;
	static JLabel meteo_opad;
	private JLabel lblNewLabel_13;
	static JLabel meteo_wiatr;
	private JLabel lblNewLabel_14;
	static JLabel meteo_cisn;
	protected static Object btnNewButton_1;
	private JLabel el_p0_1;
	private JLabel el_p0_2;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_24;
	private JLabel lblNewLabel_25;
	private JLabel lblNewLabel_26;
	private JLabel lblNewLabel_27;
	private JPanel panel_20;
	static JTable koszty_rok;
	static JTable koszty_miesiac;
	static JTable koszty_obiekt;
	private JScrollPane scrollPane_9;
	static JTable pomiary_o;
	static JTable koszty_rok_o;
	static JTable koszty_miesiac_o;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_28;
	static JTable pomiary;
	private JScrollPane scrollPane_10;
	static JTable koszty_obiekt_o;
	private JScrollPane scrollPane_11;
	private JScrollPane scrollPane_12;
	private JScrollPane scrollPane_13;
	private JScrollPane scrollPane_14;
	private JLabel lblNewLabel_29;
	static JTextField u_prad_koszt;
	private JLabel lblNewLabel_30;
	static JTextField u_cieplo_koszt;
	public static JComboBox rok_o;
	public static JComboBox miesiac_o;
	public static JComboBox obiekt_o;
	private JTextField a_o_temp0;
	private JTextField a_o_temp1;
	private JTextField a_o_temp2;
	private JLabel label0;
	private JLabel label1;
	private JLabel label2;
	private JPanel p_powitalny;
	private JTextField txtAdmin;
	private JPasswordField password;
	private JPanel p_danelogowania;
	private JLabel el_p0_3;
	private JLabel el_p0_4;
	private JLabel el_p0_5;
	static JButton btnNewButton_1_1;
	public static JComboBox comboBox_1;
	private JPanel panel_1;
	private JPanel panel_2;
	private JButton btnNewButton_1_3;
	private JButton btnNewButton_1_4;
	private JLabel lblNewLabel_6_2;
	private JLabel lblNewLabel_6_3;
	private JLabel lblNewLabel_6_5;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_32;
	private JLabel lblNewLabel_33;
	private JLabel lblNewLabel_34;
	static JComboBox combo_sym_wilg;
	static JComboBox combo_sym_temp2;
	static JComboBox combo_sym_temp1;
	private JLabel lblNewLabel_35_2;
	static JTextField sym;
	static JTextField sym_1;
	public JTextField lblNewLabel_2_1;
	private JLabel lblNewLabel_5_7;
	public JLabel lbl_administrator;
	private JLabel lblNewLabel_6_2_1;
	private JLabel lblNewLabel_6_4;
	private JLabel lblNewLabel_6_1_1;
	private JLabel lblNewLabel_4_3;
	private JLabel lblNewLabel_3_4;
	private JLabel lblNewLabel_3_1_3;
	private JLabel lblNewLabel_37;
	private JLabel lblNewLabel_38;
	private JLabel lblNewLabel_3_5;
	private JLabel lblNewLabel_4_4;
	private JLabel lblNewLabel_3_6;
	private JLabel lblNewLabel_3_1_4;

	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unchecked")
	private void initialize() {
		polaczenie = Polaczenie.database();
		AktualnyCzas.czas();

		Pogodynka.symulacjaPogody();

		frame = new JFrame();
		frame.setBounds(0, 0, 1550, 820);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		p_danelogowania = new JPanel();
		p_danelogowania.setBackground(new Color(47, 79, 79));
		p_danelogowania.setVisible(false);

		p_start = new JPanel();
		p_start.setBackground(Color.WHITE);
		p_start.setBounds(191, 76, 1345, 671);
		p_start.setVisible(false);

		p_powitalny = new JPanel();
		p_powitalny.setBackground(new Color(47, 79, 79));
		p_powitalny.setBounds(0, 0, 1536, 805);
		frame.getContentPane().add(p_powitalny);
		p_powitalny.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel(
				"System zarz\u0105dania energi\u0105 elektryczn\u0105, energi\u0105 ciepln\u0105 oraz zabezpieczeniem zewn\u0119trznym budynku.");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_6.setBackground(Color.WHITE);
		lblNewLabel_6.setBounds(10, 214, 1516, 53);
		p_powitalny.add(lblNewLabel_6);

		JLabel lblNewLabel_6_1 = new JLabel("Lokalizacja: Wroc\u0142aw, Dolno\u015Bl\u0105skie");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setForeground(Color.WHITE);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6_1.setBackground(Color.WHITE);
		lblNewLabel_6_1.setBounds(10, 277, 1516, 34);
		p_powitalny.add(lblNewLabel_6_1);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(47, 79, 79));
		panel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Logowanie do systemu", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(245, 255, 250)));
		panel.setBounds(503, 367, 508, 197);
		p_powitalny.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_31 = new JLabel("Login:");
		lblNewLabel_31.setForeground(new Color(248, 248, 255));
		lblNewLabel_31.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_31.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_31.setBounds(10, 34, 136, 30);
		panel.add(lblNewLabel_31);

		txtAdmin = new JTextField();
		txtAdmin.setText("admin");
		txtAdmin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAdmin.setBounds(156, 34, 200, 30);
		panel.add(txtAdmin);
		txtAdmin.setColumns(10);

		JLabel lblNewLabel_31_1 = new JLabel("Has\u0142o:");
		lblNewLabel_31_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_31_1.setForeground(new Color(248, 248, 255));
		lblNewLabel_31_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_31_1.setBounds(10, 74, 136, 30);
		panel.add(lblNewLabel_31_1);

		password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 14));
		password.setColumns(10);
		password.setBounds(156, 74, 200, 30);
		panel.add(password);

		JButton btnNewButton_3 = new JButton("Ok");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (password.getText().equals("111")) {
					p_powitalny.setVisible(false);
					p_danelogowania.setVisible(true);
					p_start.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Niepoprawny login lub has³o");

					p_powitalny.setVisible(true);
				}
			}
		});
		btnNewButton_3.setBounds(218, 139, 85, 21);
		panel.add(btnNewButton_3);

		p_admin = new JPanel();
		p_admin.setBackground(Color.WHITE);
		p_admin.setBounds(191, 75, 1345, 671);
		frame.getContentPane().add(p_admin);
		p_admin.setLayout(null);
		p_admin.setLayout(null);

		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(10, 10, 1325, 661);
		p_admin.add(tabbedPane_1);

		JPanel panel_44 = new JPanel();
		panel_44.setBackground(Color.WHITE);
		tabbedPane_1.addTab("Ustawienia", null, panel_44, null);
		panel_44.setLayout(null);

		JPanel panel_21 = new JPanel();
		panel_21.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Koszty",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_21.setBounds(29, 23, 275, 164);
		panel_44.add(panel_21);
		panel_21.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Koszt zu\u017Cycia pr\u0105du (z\u0142/kWh): ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(10, 41, 173, 19);
		panel_21.add(lblNewLabel_2);

		u_prad_koszt = new JTextField();
		u_prad_koszt.setText("0.59");
		u_prad_koszt.setColumns(10);
		u_prad_koszt.setBounds(193, 41, 46, 19);
		panel_21.add(u_prad_koszt);

		lblNewLabel_30 = new JLabel("Koszt zu\u017Cycia ciep\u0142a (z\u0142/kWh): ");
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_30.setBounds(10, 68, 173, 19);
		panel_21.add(lblNewLabel_30);

		u_cieplo_koszt = new JTextField();
		u_cieplo_koszt.setText("0.22");
		u_cieplo_koszt.setColumns(10);
		u_cieplo_koszt.setBounds(193, 68, 46, 19);
		panel_21.add(u_cieplo_koszt);

		JPanel panel_69_1 = new JPanel();
		panel_69_1.setBorder(new TitledBorder(null, "Temperatura", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_69_1.setLayout(null);
		panel_69_1.setBounds(314, 23, 307, 164);
		panel_44.add(panel_69_1);

		lblNewLabel_6_4 = new JLabel("Temperatura dla Poziomu 0:");
		lblNewLabel_6_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6_4.setBounds(23, 30, 173, 13);
		panel_69_1.add(lblNewLabel_6_4);

		a_o_temp0 = new JTextField();
		a_o_temp0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label0.setText("Temperatura dla Poziomu 0: " + a_o_temp0.getText());
			}
		});
		a_o_temp0.setText("20");
		a_o_temp0.setColumns(10);
		a_o_temp0.setBounds(206, 26, 32, 19);
		panel_69_1.add(a_o_temp0);

		lblNewLabel_6_1_1 = new JLabel("Temperatura dla Poziomu 1:");
		lblNewLabel_6_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6_1_1.setBounds(23, 56, 173, 13);
		panel_69_1.add(lblNewLabel_6_1_1);

		a_o_temp1 = new JTextField();
		a_o_temp1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label1.setText("Temperatura dla Poziomu 1: " + a_o_temp1.getText());
			}
		});
		a_o_temp1.setText("21");
		a_o_temp1.setColumns(10);
		a_o_temp1.setBounds(206, 53, 32, 19);
		panel_69_1.add(a_o_temp1);

		lblNewLabel_6_2_1 = new JLabel("Temperatura dla Poziomu 2:");
		lblNewLabel_6_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6_2_1.setBounds(23, 83, 173, 13);
		panel_69_1.add(lblNewLabel_6_2_1);

		a_o_temp2 = new JTextField();
		a_o_temp2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label2.setText("Temperatura dla Poziomu 2: " + a_o_temp2.getText());
			}
		});
		a_o_temp2.setText("22");
		a_o_temp2.setColumns(10);
		a_o_temp2.setBounds(206, 80, 32, 19);
		panel_69_1.add(a_o_temp2);

		lblNewLabel_6_2 = new JLabel("st. C");
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6_2.setBounds(248, 30, 49, 13);
		panel_69_1.add(lblNewLabel_6_2);

		lblNewLabel_6_3 = new JLabel("st. C");
		lblNewLabel_6_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6_3.setBounds(248, 56, 49, 13);
		panel_69_1.add(lblNewLabel_6_3);

		lblNewLabel_6_5 = new JLabel("st. C");
		lblNewLabel_6_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6_5.setBounds(248, 83, 49, 13);
		panel_69_1.add(lblNewLabel_6_5);

		JPanel panel_45 = new JPanel();
		panel_45.setBackground(new Color(255, 255, 255));
		tabbedPane_1.addTab("Elektryczno\u015B\u0107", null, panel_45, null);
		panel_45.setLayout(null);

		lblNewLabel_3_4 = new JLabel("Czas Stop");
		lblNewLabel_3_4.setBounds(970, 18, 81, 13);
		panel_45.add(lblNewLabel_3_4);

		lblNewLabel_4 = new JLabel("Poziom");
		lblNewLabel_4.setBounds(38, 18, 45, 13);
		panel_45.add(lblNewLabel_4);

		a_poziom01 = new JTextField();
		a_poziom01.setBackground(new Color(220, 220, 220));
		a_poziom01.setEnabled(false);
		a_poziom01.setText("Poziom 0");
		a_poziom01.setColumns(10);
		a_poziom01.setBounds(24, 41, 59, 19);
		panel_45.add(a_poziom01);

		a_swiatlo01 = new JTextField();
		a_swiatlo01.setBackground(new Color(255, 255, 204));
		a_swiatlo01.setText("\u015Awiat\u0142o 01");
		a_swiatlo01.setColumns(10);
		a_swiatlo01.setBounds(93, 41, 93, 19);
		panel_45.add(a_swiatlo01);

		lblNewLabel_3 = new JLabel("Obiekt");
		lblNewLabel_3.setBounds(130, 18, 45, 13);
		panel_45.add(lblNewLabel_3);

		lblNewLabel_3_1 = new JLabel("Pob\u00F3r");
		lblNewLabel_3_1.setBounds(212, 18, 45, 13);
		panel_45.add(lblNewLabel_3_1);

		a_pobor01 = new JTextField();
		a_pobor01.setBackground(new Color(255, 255, 204));
		a_pobor01.setText("10");
		a_pobor01.setColumns(10);
		a_pobor01.setBounds(196, 41, 61, 19);
		panel_45.add(a_pobor01);

		a_czasstart01 = new JTextField();
		a_czasstart01.setBackground(new Color(220, 220, 220));
		a_czasstart01.setEnabled(false);
		a_czasstart01.setColumns(10);
		a_czasstart01.setBounds(267, 41, 114, 19);
		panel_45.add(a_czasstart01);

		a_czasstop01 = new JTextField();
		a_czasstop01.setBackground(new Color(220, 220, 220));
		a_czasstop01.setEnabled(false);
		a_czasstop01.setColumns(10);
		a_czasstop01.setBounds(391, 41, 120, 19);
		panel_45.add(a_czasstop01);

		a_id01 = new JTextField();
		a_id01.setBackground(new Color(220, 220, 220));
		a_id01.setEnabled(false);
		a_id01.setColumns(10);
		a_id01.setBounds(521, 41, 50, 19);
		panel_45.add(a_id01);

		a_poziom02 = new JTextField();
		a_poziom02.setBackground(new Color(220, 220, 220));
		a_poziom02.setEnabled(false);
		a_poziom02.setText("Poziom 0");
		a_poziom02.setColumns(10);
		a_poziom02.setBounds(24, 70, 59, 19);
		panel_45.add(a_poziom02);

		a_swiatlo02 = new JTextField();
		a_swiatlo02.setBackground(new Color(255, 255, 204));
		a_swiatlo02.setText("\u015Awiat\u0142o 02");
		a_swiatlo02.setColumns(10);
		a_swiatlo02.setBounds(93, 70, 93, 19);
		panel_45.add(a_swiatlo02);

		a_pobor02 = new JTextField();
		a_pobor02.setBackground(new Color(255, 255, 204));
		a_pobor02.setText("10");
		a_pobor02.setColumns(10);
		a_pobor02.setBounds(196, 70, 61, 19);
		panel_45.add(a_pobor02);

		a_czasstart02 = new JTextField();
		a_czasstart02.setBackground(new Color(220, 220, 220));
		a_czasstart02.setEnabled(false);
		a_czasstart02.setColumns(10);
		a_czasstart02.setBounds(267, 70, 114, 19);
		panel_45.add(a_czasstart02);

		a_czasstop02 = new JTextField();
		a_czasstop02.setBackground(new Color(220, 220, 220));
		a_czasstop02.setEnabled(false);
		a_czasstop02.setColumns(10);
		a_czasstop02.setBounds(391, 70, 120, 19);
		panel_45.add(a_czasstop02);

		a_id02 = new JTextField();
		a_id02.setBackground(new Color(220, 220, 220));
		a_id02.setEnabled(false);
		a_id02.setColumns(10);
		a_id02.setBounds(521, 70, 50, 19);
		panel_45.add(a_id02);

		a_poziom03 = new JTextField();
		a_poziom03.setBackground(new Color(220, 220, 220));
		a_poziom03.setEnabled(false);
		a_poziom03.setText("Poziom 0");
		a_poziom03.setColumns(10);
		a_poziom03.setBounds(24, 99, 59, 19);
		panel_45.add(a_poziom03);

		a_swiatlo03 = new JTextField();
		a_swiatlo03.setBackground(new Color(255, 255, 204));
		a_swiatlo03.setText("\u015Awiat\u0142o 03");
		a_swiatlo03.setColumns(10);
		a_swiatlo03.setBounds(93, 99, 93, 19);
		panel_45.add(a_swiatlo03);

		a_pobor03 = new JTextField();
		a_pobor03.setBackground(new Color(255, 255, 204));
		a_pobor03.setText("10");
		a_pobor03.setColumns(10);
		a_pobor03.setBounds(196, 99, 61, 19);
		panel_45.add(a_pobor03);

		a_czasstart03 = new JTextField();
		a_czasstart03.setBackground(new Color(220, 220, 220));
		a_czasstart03.setEnabled(false);
		a_czasstart03.setColumns(10);
		a_czasstart03.setBounds(267, 99, 114, 19);
		panel_45.add(a_czasstart03);

		a_czasstop03 = new JTextField();
		a_czasstop03.setBackground(new Color(220, 220, 220));
		a_czasstop03.setEnabled(false);
		a_czasstop03.setColumns(10);
		a_czasstop03.setBounds(391, 99, 120, 19);
		panel_45.add(a_czasstop03);

		a_id03 = new JTextField();
		a_id03.setBackground(new Color(220, 220, 220));
		a_id03.setEnabled(false);
		a_id03.setColumns(10);
		a_id03.setBounds(521, 99, 50, 19);
		panel_45.add(a_id03);

		a_poziom04 = new JTextField();
		a_poziom04.setBackground(new Color(220, 220, 220));
		a_poziom04.setEnabled(false);
		a_poziom04.setText("Poziom 0");
		a_poziom04.setColumns(10);
		a_poziom04.setBounds(24, 128, 59, 19);
		panel_45.add(a_poziom04);

		a_swiatlo04 = new JTextField();
		a_swiatlo04.setBackground(new Color(255, 255, 204));
		a_swiatlo04.setText("\u015Awiat\u0142o 04");
		a_swiatlo04.setColumns(10);
		a_swiatlo04.setBounds(93, 128, 93, 19);
		panel_45.add(a_swiatlo04);

		a_pobor04 = new JTextField();
		a_pobor04.setBackground(new Color(255, 255, 204));
		a_pobor04.setText("10");
		a_pobor04.setColumns(10);
		a_pobor04.setBounds(196, 128, 61, 19);
		panel_45.add(a_pobor04);

		a_czasstart04 = new JTextField();
		a_czasstart04.setBackground(new Color(220, 220, 220));
		a_czasstart04.setEnabled(false);
		a_czasstart04.setColumns(10);
		a_czasstart04.setBounds(267, 128, 114, 19);
		panel_45.add(a_czasstart04);

		a_czasstop04 = new JTextField();
		a_czasstop04.setBackground(new Color(220, 220, 220));
		a_czasstop04.setEnabled(false);
		a_czasstop04.setColumns(10);
		a_czasstop04.setBounds(391, 128, 120, 19);
		panel_45.add(a_czasstop04);

		a_id04 = new JTextField();
		a_id04.setBackground(new Color(220, 220, 220));
		a_id04.setEnabled(false);
		a_id04.setColumns(10);
		a_id04.setBounds(521, 128, 50, 19);
		panel_45.add(a_id04);

		a_poziom05 = new JTextField();
		a_poziom05.setBackground(new Color(220, 220, 220));
		a_poziom05.setEnabled(false);
		a_poziom05.setText("Poziom 0");
		a_poziom05.setColumns(10);
		a_poziom05.setBounds(24, 157, 59, 19);
		panel_45.add(a_poziom05);

		a_swiatlo05 = new JTextField();
		a_swiatlo05.setBackground(new Color(255, 255, 204));
		a_swiatlo05.setText("\u015Awiat\u0142o 05");
		a_swiatlo05.setColumns(10);
		a_swiatlo05.setBounds(93, 157, 93, 19);
		panel_45.add(a_swiatlo05);

		a_pobor05 = new JTextField();
		a_pobor05.setBackground(new Color(255, 255, 204));
		a_pobor05.setText("10");
		a_pobor05.setColumns(10);
		a_pobor05.setBounds(196, 157, 61, 19);
		panel_45.add(a_pobor05);

		a_czasstart05 = new JTextField();
		a_czasstart05.setBackground(new Color(220, 220, 220));
		a_czasstart05.setEnabled(false);
		a_czasstart05.setColumns(10);
		a_czasstart05.setBounds(267, 157, 114, 19);
		panel_45.add(a_czasstart05);

		a_czasstop05 = new JTextField();
		a_czasstop05.setBackground(new Color(220, 220, 220));
		a_czasstop05.setEnabled(false);
		a_czasstop05.setColumns(10);
		a_czasstop05.setBounds(391, 157, 120, 19);
		panel_45.add(a_czasstop05);

		a_id05 = new JTextField();
		a_id05.setBackground(new Color(220, 220, 220));
		a_id05.setEnabled(false);
		a_id05.setColumns(10);
		a_id05.setBounds(521, 157, 50, 19);
		panel_45.add(a_id05);

		a_poziom06 = new JTextField();
		a_poziom06.setBackground(new Color(220, 220, 220));
		a_poziom06.setEnabled(false);
		a_poziom06.setText("Poziom 0");
		a_poziom06.setColumns(10);
		a_poziom06.setBounds(24, 186, 59, 19);
		panel_45.add(a_poziom06);

		a_swiatlo06 = new JTextField();
		a_swiatlo06.setBackground(new Color(255, 255, 204));
		a_swiatlo06.setText("\u015Awiat\u0142o 06");
		a_swiatlo06.setColumns(10);
		a_swiatlo06.setBounds(93, 186, 93, 19);
		panel_45.add(a_swiatlo06);

		a_pobor06 = new JTextField();
		a_pobor06.setBackground(new Color(255, 255, 204));
		a_pobor06.setText("10");
		a_pobor06.setColumns(10);
		a_pobor06.setBounds(196, 186, 61, 19);
		panel_45.add(a_pobor06);

		a_czasstart06 = new JTextField();
		a_czasstart06.setBackground(new Color(220, 220, 220));
		a_czasstart06.setEnabled(false);
		a_czasstart06.setColumns(10);
		a_czasstart06.setBounds(267, 186, 114, 19);
		panel_45.add(a_czasstart06);

		a_czasstop06 = new JTextField();
		a_czasstop06.setBackground(new Color(220, 220, 220));
		a_czasstop06.setEnabled(false);
		a_czasstop06.setColumns(10);
		a_czasstop06.setBounds(391, 186, 120, 19);
		panel_45.add(a_czasstop06);

		a_id06 = new JTextField();
		a_id06.setBackground(new Color(220, 220, 220));
		a_id06.setEnabled(false);
		a_id06.setColumns(10);
		a_id06.setBounds(521, 186, 50, 19);
		panel_45.add(a_id06);

		a_id02g = new JTextField();
		a_id02g.setBackground(new Color(220, 220, 220));
		a_id02g.setEnabled(false);
		a_id02g.setColumns(10);
		a_id02g.setBounds(1078, 70, 50, 19);
		panel_45.add(a_id02g);

		a_czasstop02g = new JTextField();
		a_czasstop02g.setBackground(new Color(220, 220, 220));
		a_czasstop02g.setEnabled(false);
		a_czasstop02g.setColumns(10);
		a_czasstop02g.setBounds(948, 70, 120, 19);
		panel_45.add(a_czasstop02g);

		a_czasstart02g = new JTextField();
		a_czasstart02g.setBackground(new Color(220, 220, 220));
		a_czasstart02g.setEnabled(false);
		a_czasstart02g.setColumns(10);
		a_czasstart02g.setBounds(824, 70, 114, 19);
		panel_45.add(a_czasstart02g);

		a_pobor02g = new JTextField();
		a_pobor02g.setBackground(new Color(255, 255, 224));
		a_pobor02g.setText("20");
		a_pobor02g.setColumns(10);
		a_pobor02g.setBounds(753, 70, 61, 19);
		panel_45.add(a_pobor02g);

		a_swiatlo02g = new JTextField();
		a_swiatlo02g.setBackground(new Color(255, 255, 224));
		a_swiatlo02g.setText("Gniazdo 02");
		a_swiatlo02g.setColumns(10);
		a_swiatlo02g.setBounds(650, 70, 93, 19);
		panel_45.add(a_swiatlo02g);

		textField_9 = new JTextField();
		textField_9.setBackground(new Color(220, 220, 220));
		textField_9.setText("Poziom 0");
		textField_9.setEnabled(false);
		textField_9.setColumns(10);
		textField_9.setBounds(581, 70, 59, 19);
		panel_45.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setBackground(new Color(220, 220, 220));
		textField_10.setText("Poziom 0");
		textField_10.setEnabled(false);
		textField_10.setColumns(10);
		textField_10.setBounds(581, 99, 59, 19);
		panel_45.add(textField_10);

		a_swiatlo03g = new JTextField();
		a_swiatlo03g.setBackground(new Color(255, 255, 224));
		a_swiatlo03g.setText("Gniazdo 03");
		a_swiatlo03g.setColumns(10);
		a_swiatlo03g.setBounds(650, 99, 93, 19);
		panel_45.add(a_swiatlo03g);

		a_pobor03g = new JTextField();
		a_pobor03g.setBackground(new Color(255, 255, 224));
		a_pobor03g.setText("20");
		a_pobor03g.setColumns(10);
		a_pobor03g.setBounds(753, 99, 61, 19);
		panel_45.add(a_pobor03g);

		a_czasstart03g = new JTextField();
		a_czasstart03g.setBackground(new Color(220, 220, 220));
		a_czasstart03g.setEnabled(false);
		a_czasstart03g.setColumns(10);
		a_czasstart03g.setBounds(824, 99, 114, 19);
		panel_45.add(a_czasstart03g);

		a_czasstop03g = new JTextField();
		a_czasstop03g.setBackground(new Color(220, 220, 220));
		a_czasstop03g.setEnabled(false);
		a_czasstop03g.setColumns(10);
		a_czasstop03g.setBounds(948, 99, 120, 19);
		panel_45.add(a_czasstop03g);

		a_id03g = new JTextField();
		a_id03g.setBackground(new Color(220, 220, 220));
		a_id03g.setEnabled(false);
		a_id03g.setColumns(10);
		a_id03g.setBounds(1078, 99, 50, 19);
		panel_45.add(a_id03g);

		textField_16 = new JTextField();
		textField_16.setBackground(new Color(220, 220, 220));
		textField_16.setText("Poziom 0");
		textField_16.setEnabled(false);
		textField_16.setColumns(10);
		textField_16.setBounds(581, 128, 59, 19);
		panel_45.add(textField_16);

		a_swiatlo04g = new JTextField();
		a_swiatlo04g.setBackground(new Color(255, 255, 224));
		a_swiatlo04g.setText("Gniazdo 04");
		a_swiatlo04g.setColumns(10);
		a_swiatlo04g.setBounds(650, 128, 93, 19);
		panel_45.add(a_swiatlo04g);

		a_pobor04g = new JTextField();
		a_pobor04g.setBackground(new Color(255, 255, 224));
		a_pobor04g.setText("20");
		a_pobor04g.setColumns(10);
		a_pobor04g.setBounds(753, 128, 61, 19);
		panel_45.add(a_pobor04g);

		a_czasstart04g = new JTextField();
		a_czasstart04g.setBackground(new Color(220, 220, 220));
		a_czasstart04g.setEnabled(false);
		a_czasstart04g.setColumns(10);
		a_czasstart04g.setBounds(824, 128, 114, 19);
		panel_45.add(a_czasstart04g);

		a_czasstop04g = new JTextField();
		a_czasstop04g.setBackground(new Color(220, 220, 220));
		a_czasstop04g.setEnabled(false);
		a_czasstop04g.setColumns(10);
		a_czasstop04g.setBounds(948, 128, 120, 19);
		panel_45.add(a_czasstop04g);

		a_id04g = new JTextField();
		a_id04g.setBackground(new Color(220, 220, 220));
		a_id04g.setEnabled(false);
		a_id04g.setColumns(10);
		a_id04g.setBounds(1078, 128, 50, 19);
		panel_45.add(a_id04g);

		textField_22 = new JTextField();
		textField_22.setBackground(new Color(220, 220, 220));
		textField_22.setText("Poziom 0");
		textField_22.setEnabled(false);
		textField_22.setColumns(10);
		textField_22.setBounds(581, 157, 59, 19);
		panel_45.add(textField_22);

		a_swiatlo05g = new JTextField();
		a_swiatlo05g.setBackground(new Color(255, 255, 224));
		a_swiatlo05g.setText("Gniazdo 05");
		a_swiatlo05g.setColumns(10);
		a_swiatlo05g.setBounds(650, 157, 93, 19);
		panel_45.add(a_swiatlo05g);

		a_pobor05g = new JTextField();
		a_pobor05g.setBackground(new Color(255, 255, 224));
		a_pobor05g.setText("20");
		a_pobor05g.setColumns(10);
		a_pobor05g.setBounds(753, 157, 61, 19);
		panel_45.add(a_pobor05g);

		a_czasstart05g = new JTextField();
		a_czasstart05g.setBackground(new Color(220, 220, 220));
		a_czasstart05g.setEnabled(false);
		a_czasstart05g.setColumns(10);
		a_czasstart05g.setBounds(824, 157, 114, 19);
		panel_45.add(a_czasstart05g);

		a_czasstop05g = new JTextField();
		a_czasstop05g.setBackground(new Color(220, 220, 220));
		a_czasstop05g.setEnabled(false);
		a_czasstop05g.setColumns(10);
		a_czasstop05g.setBounds(948, 157, 120, 19);
		panel_45.add(a_czasstop05g);

		a_id05g = new JTextField();
		a_id05g.setBackground(new Color(220, 220, 220));
		a_id05g.setEnabled(false);
		a_id05g.setColumns(10);
		a_id05g.setBounds(1078, 157, 50, 19);
		panel_45.add(a_id05g);

		textField_28 = new JTextField();
		textField_28.setBackground(new Color(220, 220, 220));
		textField_28.setText("Poziom 0");
		textField_28.setEnabled(false);
		textField_28.setColumns(10);
		textField_28.setBounds(581, 41, 59, 19);
		panel_45.add(textField_28);

		a_swiatlo01g = new JTextField();
		a_swiatlo01g.setBackground(new Color(255, 255, 224));
		a_swiatlo01g.setText("Gniazdo 01");
		a_swiatlo01g.setColumns(10);
		a_swiatlo01g.setBounds(650, 41, 93, 19);
		panel_45.add(a_swiatlo01g);

		a_pobor01g = new JTextField();
		a_pobor01g.setBackground(new Color(255, 255, 224));
		a_pobor01g.setText("20");
		a_pobor01g.setColumns(10);
		a_pobor01g.setBounds(753, 41, 61, 19);
		panel_45.add(a_pobor01g);

		a_czasstart01g = new JTextField();
		a_czasstart01g.setBackground(new Color(220, 220, 220));
		a_czasstart01g.setEnabled(false);
		a_czasstart01g.setColumns(10);
		a_czasstart01g.setBounds(824, 41, 114, 19);
		panel_45.add(a_czasstart01g);

		a_czasstop01g = new JTextField();
		a_czasstop01g.setBackground(new Color(220, 220, 220));
		a_czasstop01g.setEnabled(false);
		a_czasstop01g.setColumns(10);
		a_czasstop01g.setBounds(948, 41, 120, 19);
		panel_45.add(a_czasstop01g);

		a_id01g = new JTextField();
		a_id01g.setBackground(new Color(220, 220, 220));
		a_id01g.setEnabled(false);
		a_id01g.setColumns(10);
		a_id01g.setBounds(1078, 41, 50, 19);
		panel_45.add(a_id01g);

		a_poziom11 = new JTextField();
		a_poziom11.setEditable(false);
		a_poziom11.setBackground(new Color(211, 211, 211));
		a_poziom11.setText("Poziom 1");
		a_poziom11.setColumns(10);
		a_poziom11.setBounds(24, 215, 59, 19);
		panel_45.add(a_poziom11);

		a_swiatlo11 = new JTextField();
		a_swiatlo11.setBackground(new Color(255, 255, 224));
		a_swiatlo11.setText("\u015Awiat\u0142o 11");
		a_swiatlo11.setColumns(10);
		a_swiatlo11.setBounds(93, 215, 93, 19);
		panel_45.add(a_swiatlo11);

		a_pobor11 = new JTextField();
		a_pobor11.setBackground(new Color(255, 255, 224));
		a_pobor11.setText("10");
		a_pobor11.setColumns(10);
		a_pobor11.setBounds(196, 215, 61, 19);
		panel_45.add(a_pobor11);

		a_czasstart11 = new JTextField();
		a_czasstart11.setBackground(new Color(211, 211, 211));
		a_czasstart11.setEnabled(false);
		a_czasstart11.setColumns(10);
		a_czasstart11.setBounds(267, 215, 114, 19);
		panel_45.add(a_czasstart11);

		a_czasstop11 = new JTextField();
		a_czasstop11.setBackground(new Color(211, 211, 211));
		a_czasstop11.setEnabled(false);
		a_czasstop11.setColumns(10);
		a_czasstop11.setBounds(391, 215, 120, 19);
		panel_45.add(a_czasstop11);

		a_id11 = new JTextField();
		a_id11.setBackground(new Color(211, 211, 211));
		a_id11.setEnabled(false);
		a_id11.setColumns(10);
		a_id11.setBounds(521, 215, 50, 19);
		panel_45.add(a_id11);

		txtPoziom_13 = new JTextField();
		txtPoziom_13.setBackground(new Color(211, 211, 211));
		txtPoziom_13.setText("Poziom 1");
		txtPoziom_13.setEnabled(false);
		txtPoziom_13.setColumns(10);
		txtPoziom_13.setBounds(24, 244, 59, 19);
		panel_45.add(txtPoziom_13);

		a_swiatlo12 = new JTextField();
		a_swiatlo12.setBackground(new Color(255, 255, 224));
		a_swiatlo12.setText("\u015Awiat\u0142o 12");
		a_swiatlo12.setColumns(10);
		a_swiatlo12.setBounds(93, 244, 93, 19);
		panel_45.add(a_swiatlo12);

		a_pobor12 = new JTextField();
		a_pobor12.setBackground(new Color(255, 255, 224));
		a_pobor12.setText("10");
		a_pobor12.setColumns(10);
		a_pobor12.setBounds(196, 244, 61, 19);
		panel_45.add(a_pobor12);

		a_czasstart12 = new JTextField();
		a_czasstart12.setBackground(new Color(211, 211, 211));
		a_czasstart12.setEnabled(false);
		a_czasstart12.setColumns(10);
		a_czasstart12.setBounds(267, 244, 114, 19);
		panel_45.add(a_czasstart12);

		a_czasstop12 = new JTextField();
		a_czasstop12.setBackground(new Color(211, 211, 211));
		a_czasstop12.setEnabled(false);
		a_czasstop12.setColumns(10);
		a_czasstop12.setBounds(391, 244, 120, 19);
		panel_45.add(a_czasstop12);

		a_id12 = new JTextField();
		a_id12.setBackground(new Color(211, 211, 211));
		a_id12.setEnabled(false);
		a_id12.setColumns(10);
		a_id12.setBounds(521, 244, 50, 19);
		panel_45.add(a_id12);

		a_id13 = new JTextField();
		a_id13.setBackground(new Color(211, 211, 211));
		a_id13.setEnabled(false);
		a_id13.setColumns(10);
		a_id13.setBounds(521, 273, 50, 19);
		panel_45.add(a_id13);

		a_czasstop13 = new JTextField();
		a_czasstop13.setBackground(new Color(211, 211, 211));
		a_czasstop13.setEnabled(false);
		a_czasstop13.setColumns(10);
		a_czasstop13.setBounds(391, 273, 120, 19);
		panel_45.add(a_czasstop13);

		a_czasstart13 = new JTextField();
		a_czasstart13.setBackground(new Color(211, 211, 211));
		a_czasstart13.setEnabled(false);
		a_czasstart13.setColumns(10);
		a_czasstart13.setBounds(267, 273, 114, 19);
		panel_45.add(a_czasstart13);

		a_pobor13 = new JTextField();
		a_pobor13.setBackground(new Color(255, 255, 224));
		a_pobor13.setText("10");
		a_pobor13.setColumns(10);
		a_pobor13.setBounds(196, 273, 61, 19);
		panel_45.add(a_pobor13);

		a_swiatlo13 = new JTextField();
		a_swiatlo13.setBackground(new Color(255, 255, 224));
		a_swiatlo13.setText("\u015Awiat\u0142o 13");
		a_swiatlo13.setColumns(10);
		a_swiatlo13.setBounds(93, 273, 93, 19);
		panel_45.add(a_swiatlo13);

		txtPoziom_14 = new JTextField();
		txtPoziom_14.setBackground(new Color(211, 211, 211));
		txtPoziom_14.setText("Poziom 1");
		txtPoziom_14.setEnabled(false);
		txtPoziom_14.setColumns(10);
		txtPoziom_14.setBounds(24, 273, 59, 19);
		panel_45.add(txtPoziom_14);

		txtPoziom_15 = new JTextField();
		txtPoziom_15.setBackground(new Color(211, 211, 211));
		txtPoziom_15.setText("Poziom 1");
		txtPoziom_15.setEnabled(false);
		txtPoziom_15.setColumns(10);
		txtPoziom_15.setBounds(24, 302, 59, 19);
		panel_45.add(txtPoziom_15);

		a_swiatlo14 = new JTextField();
		a_swiatlo14.setBackground(new Color(255, 255, 224));
		a_swiatlo14.setText("\u015Awiat\u0142o 14");
		a_swiatlo14.setColumns(10);
		a_swiatlo14.setBounds(93, 302, 93, 19);
		panel_45.add(a_swiatlo14);

		a_pobor14 = new JTextField();
		a_pobor14.setBackground(new Color(255, 255, 224));
		a_pobor14.setText("10");
		a_pobor14.setColumns(10);
		a_pobor14.setBounds(196, 302, 61, 19);
		panel_45.add(a_pobor14);

		a_czasstart14 = new JTextField();
		a_czasstart14.setBackground(new Color(211, 211, 211));
		a_czasstart14.setEnabled(false);
		a_czasstart14.setColumns(10);
		a_czasstart14.setBounds(267, 302, 114, 19);
		panel_45.add(a_czasstart14);

		a_czasstop14 = new JTextField();
		a_czasstop14.setBackground(new Color(211, 211, 211));
		a_czasstop14.setEnabled(false);
		a_czasstop14.setColumns(10);
		a_czasstop14.setBounds(391, 302, 120, 19);
		panel_45.add(a_czasstop14);

		a_id14 = new JTextField();
		a_id14.setBackground(new Color(211, 211, 211));
		a_id14.setEnabled(false);
		a_id14.setColumns(10);
		a_id14.setBounds(521, 302, 50, 19);
		panel_45.add(a_id14);

		a_id15 = new JTextField();
		a_id15.setBackground(new Color(211, 211, 211));
		a_id15.setEnabled(false);
		a_id15.setColumns(10);
		a_id15.setBounds(521, 331, 50, 19);
		panel_45.add(a_id15);

		a_czasstop15 = new JTextField();
		a_czasstop15.setBackground(new Color(211, 211, 211));
		a_czasstop15.setEnabled(false);
		a_czasstop15.setColumns(10);
		a_czasstop15.setBounds(391, 331, 120, 19);
		panel_45.add(a_czasstop15);

		a_czasstart15 = new JTextField();
		a_czasstart15.setBackground(new Color(211, 211, 211));
		a_czasstart15.setEnabled(false);
		a_czasstart15.setColumns(10);
		a_czasstart15.setBounds(267, 331, 114, 19);
		panel_45.add(a_czasstart15);

		a_pobor15 = new JTextField();
		a_pobor15.setBackground(new Color(255, 255, 224));
		a_pobor15.setText("10");
		a_pobor15.setColumns(10);
		a_pobor15.setBounds(196, 331, 61, 19);
		panel_45.add(a_pobor15);

		a_swiatlo15 = new JTextField();
		a_swiatlo15.setBackground(new Color(255, 255, 224));
		a_swiatlo15.setText("\u015Awiat\u0142o 15");
		a_swiatlo15.setColumns(10);
		a_swiatlo15.setBounds(93, 331, 93, 19);
		panel_45.add(a_swiatlo15);

		txtPoziom_16 = new JTextField();
		txtPoziom_16.setBackground(new Color(211, 211, 211));
		txtPoziom_16.setText("Poziom 1");
		txtPoziom_16.setEnabled(false);
		txtPoziom_16.setColumns(10);
		txtPoziom_16.setBounds(24, 331, 59, 19);
		panel_45.add(txtPoziom_16);

		txtPoziom_17 = new JTextField();
		txtPoziom_17.setBackground(new Color(211, 211, 211));
		txtPoziom_17.setText("Poziom 1");
		txtPoziom_17.setEnabled(false);
		txtPoziom_17.setColumns(10);
		txtPoziom_17.setBounds(24, 360, 59, 19);
		panel_45.add(txtPoziom_17);

		a_swiatlo16 = new JTextField();
		a_swiatlo16.setBackground(new Color(255, 255, 224));
		a_swiatlo16.setText("\u015Awiat\u0142o 16");
		a_swiatlo16.setColumns(10);
		a_swiatlo16.setBounds(93, 360, 93, 19);
		panel_45.add(a_swiatlo16);

		a_pobor16 = new JTextField();
		a_pobor16.setBackground(new Color(255, 255, 224));
		a_pobor16.setText("10");
		a_pobor16.setColumns(10);
		a_pobor16.setBounds(196, 360, 61, 19);
		panel_45.add(a_pobor16);

		a_czasstart16 = new JTextField();
		a_czasstart16.setBackground(new Color(211, 211, 211));
		a_czasstart16.setEnabled(false);
		a_czasstart16.setColumns(10);
		a_czasstart16.setBounds(267, 360, 114, 19);
		panel_45.add(a_czasstart16);

		a_czasstop16 = new JTextField();
		a_czasstop16.setBackground(new Color(211, 211, 211));
		a_czasstop16.setEnabled(false);
		a_czasstop16.setColumns(10);
		a_czasstop16.setBounds(391, 360, 120, 19);
		panel_45.add(a_czasstop16);

		a_id16 = new JTextField();
		a_id16.setBackground(new Color(211, 211, 211));
		a_id16.setEnabled(false);
		a_id16.setColumns(10);
		a_id16.setBounds(521, 360, 50, 19);
		panel_45.add(a_id16);

		txtPoziom_18 = new JTextField();
		txtPoziom_18.setBackground(new Color(211, 211, 211));
		txtPoziom_18.setText("Poziom 1");
		txtPoziom_18.setEnabled(false);
		txtPoziom_18.setColumns(10);
		txtPoziom_18.setBounds(581, 215, 59, 19);
		panel_45.add(txtPoziom_18);

		a_swiatlo11g = new JTextField();
		a_swiatlo11g.setBackground(new Color(255, 255, 224));
		a_swiatlo11g.setText("Gniazdo 11");
		a_swiatlo11g.setColumns(10);
		a_swiatlo11g.setBounds(650, 215, 93, 19);
		panel_45.add(a_swiatlo11g);

		a_pobor11g = new JTextField();
		a_pobor11g.setBackground(new Color(255, 255, 224));
		a_pobor11g.setText("10");
		a_pobor11g.setColumns(10);
		a_pobor11g.setBounds(753, 215, 61, 19);
		panel_45.add(a_pobor11g);

		a_czasstart11g = new JTextField();
		a_czasstart11g.setBackground(new Color(211, 211, 211));
		a_czasstart11g.setEnabled(false);
		a_czasstart11g.setColumns(10);
		a_czasstart11g.setBounds(824, 215, 114, 19);
		panel_45.add(a_czasstart11g);

		a_czasstop11g = new JTextField();
		a_czasstop11g.setBackground(new Color(211, 211, 211));
		a_czasstop11g.setEnabled(false);
		a_czasstop11g.setColumns(10);
		a_czasstop11g.setBounds(948, 215, 120, 19);
		panel_45.add(a_czasstop11g);

		a_id11g = new JTextField();
		a_id11g.setBackground(new Color(211, 211, 211));
		a_id11g.setEnabled(false);
		a_id11g.setColumns(10);
		a_id11g.setBounds(1078, 215, 50, 19);
		panel_45.add(a_id11g);

		txtPoziom_19 = new JTextField();
		txtPoziom_19.setBackground(new Color(211, 211, 211));
		txtPoziom_19.setText("Poziom 1");
		txtPoziom_19.setEnabled(false);
		txtPoziom_19.setColumns(10);
		txtPoziom_19.setBounds(581, 244, 59, 19);
		panel_45.add(txtPoziom_19);

		a_swiatlo12g = new JTextField();
		a_swiatlo12g.setBackground(new Color(255, 255, 224));
		a_swiatlo12g.setText("Gniazdo 12");
		a_swiatlo12g.setColumns(10);
		a_swiatlo12g.setBounds(650, 244, 93, 19);
		panel_45.add(a_swiatlo12g);

		a_pobor12g = new JTextField();
		a_pobor12g.setBackground(new Color(255, 255, 224));
		a_pobor12g.setText("10");
		a_pobor12g.setColumns(10);
		a_pobor12g.setBounds(753, 244, 61, 19);
		panel_45.add(a_pobor12g);

		a_czasstart12g = new JTextField();
		a_czasstart12g.setBackground(new Color(211, 211, 211));
		a_czasstart12g.setEnabled(false);
		a_czasstart12g.setColumns(10);
		a_czasstart12g.setBounds(824, 244, 114, 19);
		panel_45.add(a_czasstart12g);

		a_czasstop12g = new JTextField();
		a_czasstop12g.setBackground(new Color(211, 211, 211));
		a_czasstop12g.setEnabled(false);
		a_czasstop12g.setColumns(10);
		a_czasstop12g.setBounds(948, 244, 120, 19);
		panel_45.add(a_czasstop12g);

		a_id12g = new JTextField();
		a_id12g.setBackground(new Color(211, 211, 211));
		a_id12g.setEnabled(false);
		a_id12g.setColumns(10);
		a_id12g.setBounds(1078, 244, 50, 19);
		panel_45.add(a_id12g);

		a_id13g = new JTextField();
		a_id13g.setBackground(new Color(211, 211, 211));
		a_id13g.setEnabled(false);
		a_id13g.setColumns(10);
		a_id13g.setBounds(1078, 273, 50, 19);
		panel_45.add(a_id13g);

		a_czasstop13g = new JTextField();
		a_czasstop13g.setBackground(new Color(211, 211, 211));
		a_czasstop13g.setEnabled(false);
		a_czasstop13g.setColumns(10);
		a_czasstop13g.setBounds(948, 273, 120, 19);
		panel_45.add(a_czasstop13g);

		a_czasstart13g = new JTextField();
		a_czasstart13g.setBackground(new Color(211, 211, 211));
		a_czasstart13g.setEnabled(false);
		a_czasstart13g.setColumns(10);
		a_czasstart13g.setBounds(824, 273, 114, 19);
		panel_45.add(a_czasstart13g);

		a_pobor13g = new JTextField();
		a_pobor13g.setBackground(new Color(255, 255, 224));
		a_pobor13g.setText("10");
		a_pobor13g.setColumns(10);
		a_pobor13g.setBounds(753, 273, 61, 19);
		panel_45.add(a_pobor13g);

		a_swiatlo13g = new JTextField();
		a_swiatlo13g.setBackground(new Color(255, 255, 224));
		a_swiatlo13g.setText("Gniazdo 13");
		a_swiatlo13g.setColumns(10);
		a_swiatlo13g.setBounds(650, 273, 93, 19);
		panel_45.add(a_swiatlo13g);

		txtPoziom_20 = new JTextField();
		txtPoziom_20.setBackground(new Color(211, 211, 211));
		txtPoziom_20.setText("Poziom 1");
		txtPoziom_20.setEnabled(false);
		txtPoziom_20.setColumns(10);
		txtPoziom_20.setBounds(581, 273, 59, 19);
		panel_45.add(txtPoziom_20);

		txtPoziom_21 = new JTextField();
		txtPoziom_21.setBackground(new Color(211, 211, 211));
		txtPoziom_21.setText("Poziom 1");
		txtPoziom_21.setEnabled(false);
		txtPoziom_21.setColumns(10);
		txtPoziom_21.setBounds(581, 302, 59, 19);
		panel_45.add(txtPoziom_21);

		a_swiatlo14g = new JTextField();
		a_swiatlo14g.setBackground(new Color(255, 255, 224));
		a_swiatlo14g.setText("Gniazdo 14");
		a_swiatlo14g.setColumns(10);
		a_swiatlo14g.setBounds(650, 302, 93, 19);
		panel_45.add(a_swiatlo14g);

		a_pobor14g = new JTextField();
		a_pobor14g.setBackground(new Color(255, 255, 224));
		a_pobor14g.setText("10");
		a_pobor14g.setColumns(10);
		a_pobor14g.setBounds(753, 302, 61, 19);
		panel_45.add(a_pobor14g);

		a_czasstart14g = new JTextField();
		a_czasstart14g.setBackground(new Color(211, 211, 211));
		a_czasstart14g.setEnabled(false);
		a_czasstart14g.setColumns(10);
		a_czasstart14g.setBounds(824, 302, 114, 19);
		panel_45.add(a_czasstart14g);

		a_czasstop14g = new JTextField();
		a_czasstop14g.setBackground(new Color(211, 211, 211));
		a_czasstop14g.setEnabled(false);
		a_czasstop14g.setColumns(10);
		a_czasstop14g.setBounds(948, 302, 120, 19);
		panel_45.add(a_czasstop14g);

		a_id14g = new JTextField();
		a_id14g.setBackground(new Color(211, 211, 211));
		a_id14g.setEnabled(false);
		a_id14g.setColumns(10);
		a_id14g.setBounds(1078, 302, 50, 19);
		panel_45.add(a_id14g);

		a_id15g = new JTextField();
		a_id15g.setBackground(new Color(211, 211, 211));
		a_id15g.setEnabled(false);
		a_id15g.setColumns(10);
		a_id15g.setBounds(1078, 331, 50, 19);
		panel_45.add(a_id15g);

		a_czasstop15g = new JTextField();
		a_czasstop15g.setBackground(new Color(211, 211, 211));
		a_czasstop15g.setEnabled(false);
		a_czasstop15g.setColumns(10);
		a_czasstop15g.setBounds(948, 331, 120, 19);
		panel_45.add(a_czasstop15g);

		a_czasstart15g = new JTextField();
		a_czasstart15g.setBackground(new Color(211, 211, 211));
		a_czasstart15g.setEnabled(false);
		a_czasstart15g.setColumns(10);
		a_czasstart15g.setBounds(824, 331, 114, 19);
		panel_45.add(a_czasstart15g);

		a_pobor15g = new JTextField();
		a_pobor15g.setBackground(new Color(255, 255, 224));
		a_pobor15g.setText("10");
		a_pobor15g.setColumns(10);
		a_pobor15g.setBounds(753, 331, 61, 19);
		panel_45.add(a_pobor15g);

		a_swiatlo15g = new JTextField();
		a_swiatlo15g.setBackground(new Color(255, 255, 224));
		a_swiatlo15g.setText("Gniazdo 15");
		a_swiatlo15g.setColumns(10);
		a_swiatlo15g.setBounds(650, 331, 93, 19);
		panel_45.add(a_swiatlo15g);

		txtPoziom_22 = new JTextField();
		txtPoziom_22.setBackground(new Color(211, 211, 211));
		txtPoziom_22.setText("Poziom 1");
		txtPoziom_22.setEnabled(false);
		txtPoziom_22.setColumns(10);
		txtPoziom_22.setBounds(581, 331, 59, 19);
		panel_45.add(txtPoziom_22);

		txtPoziom_23 = new JTextField();
		txtPoziom_23.setBackground(new Color(211, 211, 211));
		txtPoziom_23.setText("Poziom 1");
		txtPoziom_23.setEnabled(false);
		txtPoziom_23.setColumns(10);
		txtPoziom_23.setBounds(581, 360, 59, 19);
		panel_45.add(txtPoziom_23);

		a_swiatlo16g = new JTextField();
		a_swiatlo16g.setBackground(new Color(255, 255, 224));
		a_swiatlo16g.setText("Gniazdo 16");
		a_swiatlo16g.setColumns(10);
		a_swiatlo16g.setBounds(650, 360, 93, 19);
		panel_45.add(a_swiatlo16g);

		a_pobor16g = new JTextField();
		a_pobor16g.setBackground(new Color(255, 255, 224));
		a_pobor16g.setText("10");
		a_pobor16g.setColumns(10);
		a_pobor16g.setBounds(753, 360, 61, 19);
		panel_45.add(a_pobor16g);

		a_czasstart16g = new JTextField();
		a_czasstart16g.setBackground(new Color(211, 211, 211));
		a_czasstart16g.setEnabled(false);
		a_czasstart16g.setColumns(10);
		a_czasstart16g.setBounds(824, 360, 114, 19);
		panel_45.add(a_czasstart16g);

		a_czasstop16g = new JTextField();
		a_czasstop16g.setBackground(new Color(211, 211, 211));
		a_czasstop16g.setEnabled(false);
		a_czasstop16g.setColumns(10);
		a_czasstop16g.setBounds(948, 360, 120, 19);
		panel_45.add(a_czasstop16g);

		a_id16g = new JTextField();
		a_id16g.setBackground(new Color(211, 211, 211));
		a_id16g.setEnabled(false);
		a_id16g.setColumns(10);
		a_id16g.setBounds(1078, 360, 50, 19);
		panel_45.add(a_id16g);

		a_poziom21 = new JTextField();
		a_poziom21.setBackground(new Color(192, 192, 192));
		a_poziom21.setText("Poziom 2");
		a_poziom21.setEnabled(false);
		a_poziom21.setColumns(10);
		a_poziom21.setBounds(24, 389, 59, 19);
		panel_45.add(a_poziom21);

		a_swiatlo21 = new JTextField();
		a_swiatlo21.setBackground(new Color(255, 250, 205));
		a_swiatlo21.setText("\u015Awiat\u0142o 21");
		a_swiatlo21.setColumns(10);
		a_swiatlo21.setBounds(93, 389, 93, 19);
		panel_45.add(a_swiatlo21);

		a_pobor21 = new JTextField();
		a_pobor21.setBackground(new Color(255, 250, 205));
		a_pobor21.setText("10");
		a_pobor21.setColumns(10);
		a_pobor21.setBounds(196, 389, 61, 19);
		panel_45.add(a_pobor21);

		a_czasstart21 = new JTextField();
		a_czasstart21.setBackground(new Color(192, 192, 192));
		a_czasstart21.setEnabled(false);
		a_czasstart21.setColumns(10);
		a_czasstart21.setBounds(267, 389, 114, 19);
		panel_45.add(a_czasstart21);

		a_czasstop21 = new JTextField();
		a_czasstop21.setBackground(new Color(192, 192, 192));
		a_czasstop21.setEnabled(false);
		a_czasstop21.setColumns(10);
		a_czasstop21.setBounds(391, 389, 120, 19);
		panel_45.add(a_czasstop21);

		a_id21 = new JTextField();
		a_id21.setBackground(new Color(192, 192, 192));
		a_id21.setEnabled(false);
		a_id21.setColumns(10);
		a_id21.setBounds(521, 389, 50, 19);
		panel_45.add(a_id21);

		txtPoziom_1 = new JTextField();
		txtPoziom_1.setBackground(new Color(192, 192, 192));
		txtPoziom_1.setText("Poziom 2");
		txtPoziom_1.setEnabled(false);
		txtPoziom_1.setColumns(10);
		txtPoziom_1.setBounds(24, 418, 59, 19);
		panel_45.add(txtPoziom_1);

		a_swiatlo22 = new JTextField();
		a_swiatlo22.setBackground(new Color(255, 250, 205));
		a_swiatlo22.setText("\u015Awiat\u0142o 22");
		a_swiatlo22.setColumns(10);
		a_swiatlo22.setBounds(93, 418, 93, 19);
		panel_45.add(a_swiatlo22);

		a_pobor22 = new JTextField();
		a_pobor22.setBackground(new Color(255, 250, 205));
		a_pobor22.setText("10");
		a_pobor22.setColumns(10);
		a_pobor22.setBounds(196, 418, 61, 19);
		panel_45.add(a_pobor22);

		a_czasstart22 = new JTextField();
		a_czasstart22.setBackground(new Color(192, 192, 192));
		a_czasstart22.setEnabled(false);
		a_czasstart22.setColumns(10);
		a_czasstart22.setBounds(267, 418, 114, 19);
		panel_45.add(a_czasstart22);

		a_czasstop22 = new JTextField();
		a_czasstop22.setBackground(new Color(192, 192, 192));
		a_czasstop22.setEnabled(false);
		a_czasstop22.setColumns(10);
		a_czasstop22.setBounds(391, 418, 120, 19);
		panel_45.add(a_czasstop22);

		a_id22 = new JTextField();
		a_id22.setBackground(new Color(192, 192, 192));
		a_id22.setEnabled(false);
		a_id22.setColumns(10);
		a_id22.setBounds(521, 418, 50, 19);
		panel_45.add(a_id22);

		a_id23 = new JTextField();
		a_id23.setBackground(new Color(192, 192, 192));
		a_id23.setEnabled(false);
		a_id23.setColumns(10);
		a_id23.setBounds(521, 447, 50, 19);
		panel_45.add(a_id23);

		a_czasstop23 = new JTextField();
		a_czasstop23.setBackground(new Color(192, 192, 192));
		a_czasstop23.setEnabled(false);
		a_czasstop23.setColumns(10);
		a_czasstop23.setBounds(391, 447, 120, 19);
		panel_45.add(a_czasstop23);

		a_czasstart23 = new JTextField();
		a_czasstart23.setBackground(new Color(192, 192, 192));
		a_czasstart23.setEnabled(false);
		a_czasstart23.setColumns(10);
		a_czasstart23.setBounds(267, 447, 114, 19);
		panel_45.add(a_czasstart23);

		a_pobor23 = new JTextField();
		a_pobor23.setBackground(new Color(255, 250, 205));
		a_pobor23.setText("10");
		a_pobor23.setColumns(10);
		a_pobor23.setBounds(196, 447, 61, 19);
		panel_45.add(a_pobor23);

		a_swiatlo23 = new JTextField();
		a_swiatlo23.setBackground(new Color(255, 250, 205));
		a_swiatlo23.setText("\u015Awiat\u0142o 23");
		a_swiatlo23.setColumns(10);
		a_swiatlo23.setBounds(93, 447, 93, 19);
		panel_45.add(a_swiatlo23);

		txtPoziom_2 = new JTextField();
		txtPoziom_2.setBackground(new Color(192, 192, 192));
		txtPoziom_2.setText("Poziom 2");
		txtPoziom_2.setEnabled(false);
		txtPoziom_2.setColumns(10);
		txtPoziom_2.setBounds(24, 447, 59, 19);
		panel_45.add(txtPoziom_2);

		txtPoziom_3 = new JTextField();
		txtPoziom_3.setBackground(new Color(192, 192, 192));
		txtPoziom_3.setText("Poziom 2");
		txtPoziom_3.setEnabled(false);
		txtPoziom_3.setColumns(10);
		txtPoziom_3.setBounds(24, 476, 59, 19);
		panel_45.add(txtPoziom_3);

		a_swiatlo24 = new JTextField();
		a_swiatlo24.setBackground(new Color(255, 250, 205));
		a_swiatlo24.setText("\u015Awiat\u0142o 24");
		a_swiatlo24.setColumns(10);
		a_swiatlo24.setBounds(93, 476, 93, 19);
		panel_45.add(a_swiatlo24);

		a_pobor24 = new JTextField();
		a_pobor24.setBackground(new Color(255, 250, 205));
		a_pobor24.setText("10");
		a_pobor24.setColumns(10);
		a_pobor24.setBounds(196, 476, 61, 19);
		panel_45.add(a_pobor24);

		a_czasstart24 = new JTextField();
		a_czasstart24.setBackground(new Color(192, 192, 192));
		a_czasstart24.setEnabled(false);
		a_czasstart24.setColumns(10);
		a_czasstart24.setBounds(267, 476, 114, 19);
		panel_45.add(a_czasstart24);

		a_czasstop24 = new JTextField();
		a_czasstop24.setBackground(new Color(192, 192, 192));
		a_czasstop24.setEnabled(false);
		a_czasstop24.setColumns(10);
		a_czasstop24.setBounds(391, 476, 120, 19);
		panel_45.add(a_czasstop24);

		a_id24 = new JTextField();
		a_id24.setBackground(new Color(192, 192, 192));
		a_id24.setEnabled(false);
		a_id24.setColumns(10);
		a_id24.setBounds(521, 476, 50, 19);
		panel_45.add(a_id24);

		a_id25 = new JTextField();
		a_id25.setBackground(new Color(192, 192, 192));
		a_id25.setEnabled(false);
		a_id25.setColumns(10);
		a_id25.setBounds(521, 505, 50, 19);
		panel_45.add(a_id25);

		a_czasstop25 = new JTextField();
		a_czasstop25.setBackground(new Color(192, 192, 192));
		a_czasstop25.setEnabled(false);
		a_czasstop25.setColumns(10);
		a_czasstop25.setBounds(391, 505, 120, 19);
		panel_45.add(a_czasstop25);

		a_czasstart25 = new JTextField();
		a_czasstart25.setBackground(new Color(192, 192, 192));
		a_czasstart25.setEnabled(false);
		a_czasstart25.setColumns(10);
		a_czasstart25.setBounds(267, 505, 114, 19);
		panel_45.add(a_czasstart25);

		a_pobor25 = new JTextField();
		a_pobor25.setBackground(new Color(255, 250, 205));
		a_pobor25.setText("10");
		a_pobor25.setColumns(10);
		a_pobor25.setBounds(196, 505, 61, 19);
		panel_45.add(a_pobor25);

		a_swiatlo25 = new JTextField();
		a_swiatlo25.setBackground(new Color(255, 250, 205));
		a_swiatlo25.setText("\u015Awiat\u0142o 25");
		a_swiatlo25.setColumns(10);
		a_swiatlo25.setBounds(93, 505, 93, 19);
		panel_45.add(a_swiatlo25);

		txtPoziom_4 = new JTextField();
		txtPoziom_4.setBackground(new Color(192, 192, 192));
		txtPoziom_4.setText("Poziom 2");
		txtPoziom_4.setEnabled(false);
		txtPoziom_4.setColumns(10);
		txtPoziom_4.setBounds(24, 505, 59, 19);
		panel_45.add(txtPoziom_4);

		txtPoziom_5 = new JTextField();
		txtPoziom_5.setBackground(new Color(192, 192, 192));
		txtPoziom_5.setText("Poziom 2");
		txtPoziom_5.setEnabled(false);
		txtPoziom_5.setColumns(10);
		txtPoziom_5.setBounds(24, 534, 59, 19);
		panel_45.add(txtPoziom_5);

		a_swiatlo26 = new JTextField();
		a_swiatlo26.setBackground(new Color(255, 250, 205));
		a_swiatlo26.setText("\u015Awiat\u0142o 26");
		a_swiatlo26.setColumns(10);
		a_swiatlo26.setBounds(93, 534, 93, 19);
		panel_45.add(a_swiatlo26);

		a_pobor26 = new JTextField();
		a_pobor26.setBackground(new Color(255, 250, 205));
		a_pobor26.setText("10");
		a_pobor26.setColumns(10);
		a_pobor26.setBounds(196, 534, 61, 19);
		panel_45.add(a_pobor26);

		a_czasstart26 = new JTextField();
		a_czasstart26.setBackground(new Color(192, 192, 192));
		a_czasstart26.setEnabled(false);
		a_czasstart26.setColumns(10);
		a_czasstart26.setBounds(267, 534, 114, 19);
		panel_45.add(a_czasstart26);

		a_czasstop26 = new JTextField();
		a_czasstop26.setBackground(new Color(192, 192, 192));
		a_czasstop26.setEnabled(false);
		a_czasstop26.setColumns(10);
		a_czasstop26.setBounds(391, 534, 120, 19);
		panel_45.add(a_czasstop26);

		a_id26 = new JTextField();
		a_id26.setBackground(new Color(192, 192, 192));
		a_id26.setEnabled(false);
		a_id26.setColumns(10);
		a_id26.setBounds(521, 534, 50, 19);
		panel_45.add(a_id26);

		txtPoziom_6 = new JTextField();
		txtPoziom_6.setBackground(new Color(192, 192, 192));
		txtPoziom_6.setText("Poziom 2");
		txtPoziom_6.setEnabled(false);
		txtPoziom_6.setColumns(10);
		txtPoziom_6.setBounds(581, 389, 59, 19);
		panel_45.add(txtPoziom_6);

		a_swiatlo21g = new JTextField();
		a_swiatlo21g.setBackground(new Color(255, 255, 224));
		a_swiatlo21g.setText("Gniazdo 21");
		a_swiatlo21g.setColumns(10);
		a_swiatlo21g.setBounds(650, 389, 93, 19);
		panel_45.add(a_swiatlo21g);

		a_pobor21g = new JTextField();
		a_pobor21g.setBackground(new Color(255, 255, 224));
		a_pobor21g.setText("10");
		a_pobor21g.setColumns(10);
		a_pobor21g.setBounds(753, 389, 61, 19);
		panel_45.add(a_pobor21g);

		a_czasstart21g = new JTextField();
		a_czasstart21g.setBackground(new Color(192, 192, 192));
		a_czasstart21g.setEnabled(false);
		a_czasstart21g.setColumns(10);
		a_czasstart21g.setBounds(824, 389, 114, 19);
		panel_45.add(a_czasstart21g);

		a_czasstop21g = new JTextField();
		a_czasstop21g.setBackground(new Color(192, 192, 192));
		a_czasstop21g.setEnabled(false);
		a_czasstop21g.setColumns(10);
		a_czasstop21g.setBounds(948, 389, 120, 19);
		panel_45.add(a_czasstop21g);

		a_id21g = new JTextField();
		a_id21g.setBackground(new Color(192, 192, 192));
		a_id21g.setEnabled(false);
		a_id21g.setColumns(10);
		a_id21g.setBounds(1078, 389, 50, 19);
		panel_45.add(a_id21g);

		txtPoziom_7 = new JTextField();
		txtPoziom_7.setBackground(new Color(192, 192, 192));
		txtPoziom_7.setText("Poziom 2");
		txtPoziom_7.setEnabled(false);
		txtPoziom_7.setColumns(10);
		txtPoziom_7.setBounds(581, 418, 59, 19);
		panel_45.add(txtPoziom_7);

		a_swiatlo22g = new JTextField();
		a_swiatlo22g.setBackground(new Color(255, 255, 224));
		a_swiatlo22g.setText("Gniazdo 22");
		a_swiatlo22g.setColumns(10);
		a_swiatlo22g.setBounds(650, 418, 93, 19);
		panel_45.add(a_swiatlo22g);

		a_pobor22g = new JTextField();
		a_pobor22g.setBackground(new Color(255, 255, 224));
		a_pobor22g.setText("10");
		a_pobor22g.setColumns(10);
		a_pobor22g.setBounds(753, 418, 61, 19);
		panel_45.add(a_pobor22g);

		a_czasstart22g = new JTextField();
		a_czasstart22g.setBackground(new Color(192, 192, 192));
		a_czasstart22g.setEnabled(false);
		a_czasstart22g.setColumns(10);
		a_czasstart22g.setBounds(824, 418, 114, 19);
		panel_45.add(a_czasstart22g);

		a_czasstop22g = new JTextField();
		a_czasstop22g.setBackground(new Color(192, 192, 192));
		a_czasstop22g.setEnabled(false);
		a_czasstop22g.setColumns(10);
		a_czasstop22g.setBounds(948, 418, 120, 19);
		panel_45.add(a_czasstop22g);

		a_id22g = new JTextField();
		a_id22g.setBackground(new Color(192, 192, 192));
		a_id22g.setEnabled(false);
		a_id22g.setColumns(10);
		a_id22g.setBounds(1078, 418, 50, 19);
		panel_45.add(a_id22g);

		a_id23g = new JTextField();
		a_id23g.setBackground(new Color(192, 192, 192));
		a_id23g.setEnabled(false);
		a_id23g.setColumns(10);
		a_id23g.setBounds(1078, 447, 50, 19);
		panel_45.add(a_id23g);

		a_czasstop23g = new JTextField();
		a_czasstop23g.setBackground(new Color(192, 192, 192));
		a_czasstop23g.setEnabled(false);
		a_czasstop23g.setColumns(10);
		a_czasstop23g.setBounds(948, 447, 120, 19);
		panel_45.add(a_czasstop23g);

		a_czasstart23g = new JTextField();
		a_czasstart23g.setBackground(new Color(192, 192, 192));
		a_czasstart23g.setEnabled(false);
		a_czasstart23g.setColumns(10);
		a_czasstart23g.setBounds(824, 447, 114, 19);
		panel_45.add(a_czasstart23g);

		a_pobor23g = new JTextField();
		a_pobor23g.setBackground(new Color(255, 255, 224));
		a_pobor23g.setText("10");
		a_pobor23g.setColumns(10);
		a_pobor23g.setBounds(753, 447, 61, 19);
		panel_45.add(a_pobor23g);

		a_swiatlo23g = new JTextField();
		a_swiatlo23g.setBackground(new Color(255, 255, 224));
		a_swiatlo23g.setText("Gniazdo 23");
		a_swiatlo23g.setColumns(10);
		a_swiatlo23g.setBounds(650, 447, 93, 19);
		panel_45.add(a_swiatlo23g);

		txtPoziom_8 = new JTextField();
		txtPoziom_8.setBackground(new Color(192, 192, 192));
		txtPoziom_8.setText("Poziom 2");
		txtPoziom_8.setEnabled(false);
		txtPoziom_8.setColumns(10);
		txtPoziom_8.setBounds(581, 447, 59, 19);
		panel_45.add(txtPoziom_8);

		txtPoziom_9 = new JTextField();
		txtPoziom_9.setBackground(new Color(192, 192, 192));
		txtPoziom_9.setText("Poziom 2");
		txtPoziom_9.setEnabled(false);
		txtPoziom_9.setColumns(10);
		txtPoziom_9.setBounds(581, 476, 59, 19);
		panel_45.add(txtPoziom_9);

		a_swiatlo24g = new JTextField();
		a_swiatlo24g.setBackground(new Color(255, 255, 224));
		a_swiatlo24g.setText("Gniazdo 24");
		a_swiatlo24g.setColumns(10);
		a_swiatlo24g.setBounds(650, 476, 93, 19);
		panel_45.add(a_swiatlo24g);

		a_pobor24g = new JTextField();
		a_pobor24g.setBackground(new Color(255, 255, 224));
		a_pobor24g.setText("10");
		a_pobor24g.setColumns(10);
		a_pobor24g.setBounds(753, 476, 61, 19);
		panel_45.add(a_pobor24g);

		a_czasstart24g = new JTextField();
		a_czasstart24g.setBackground(new Color(192, 192, 192));
		a_czasstart24g.setEnabled(false);
		a_czasstart24g.setColumns(10);
		a_czasstart24g.setBounds(824, 476, 114, 19);
		panel_45.add(a_czasstart24g);

		a_czasstop24g = new JTextField();
		a_czasstop24g.setBackground(new Color(192, 192, 192));
		a_czasstop24g.setEnabled(false);
		a_czasstop24g.setColumns(10);
		a_czasstop24g.setBounds(948, 476, 120, 19);
		panel_45.add(a_czasstop24g);

		a_id24g = new JTextField();
		a_id24g.setBackground(new Color(192, 192, 192));
		a_id24g.setEnabled(false);
		a_id24g.setColumns(10);
		a_id24g.setBounds(1078, 476, 50, 19);
		panel_45.add(a_id24g);

		a_id25g = new JTextField();
		a_id25g.setBackground(new Color(192, 192, 192));
		a_id25g.setEnabled(false);
		a_id25g.setColumns(10);
		a_id25g.setBounds(1078, 505, 50, 19);
		panel_45.add(a_id25g);

		a_czasstop25g = new JTextField();
		a_czasstop25g.setBackground(new Color(192, 192, 192));
		a_czasstop25g.setEnabled(false);
		a_czasstop25g.setColumns(10);
		a_czasstop25g.setBounds(948, 505, 120, 19);
		panel_45.add(a_czasstop25g);

		a_czasstart25g = new JTextField();
		a_czasstart25g.setBackground(new Color(192, 192, 192));
		a_czasstart25g.setEnabled(false);
		a_czasstart25g.setColumns(10);
		a_czasstart25g.setBounds(824, 505, 114, 19);
		panel_45.add(a_czasstart25g);

		a_pobor25g = new JTextField();
		a_pobor25g.setBackground(new Color(255, 255, 224));
		a_pobor25g.setText("10");
		a_pobor25g.setColumns(10);
		a_pobor25g.setBounds(753, 505, 61, 19);
		panel_45.add(a_pobor25g);

		a_swiatlo25g = new JTextField();
		a_swiatlo25g.setBackground(new Color(255, 255, 224));
		a_swiatlo25g.setText("Gniazdo 25");
		a_swiatlo25g.setColumns(10);
		a_swiatlo25g.setBounds(650, 505, 93, 19);
		panel_45.add(a_swiatlo25g);

		txtPoziom_10 = new JTextField();
		txtPoziom_10.setBackground(new Color(192, 192, 192));
		txtPoziom_10.setText("Poziom 2");
		txtPoziom_10.setEnabled(false);
		txtPoziom_10.setColumns(10);
		txtPoziom_10.setBounds(581, 505, 59, 19);
		panel_45.add(txtPoziom_10);

		txtPoziom_11 = new JTextField();
		txtPoziom_11.setBackground(new Color(192, 192, 192));
		txtPoziom_11.setText("Poziom 2");
		txtPoziom_11.setEnabled(false);
		txtPoziom_11.setColumns(10);
		txtPoziom_11.setBounds(581, 534, 59, 19);
		panel_45.add(txtPoziom_11);

		a_swiatlo26g = new JTextField();
		a_swiatlo26g.setBackground(new Color(255, 255, 224));
		a_swiatlo26g.setText("Gniazdo 26");
		a_swiatlo26g.setColumns(10);
		a_swiatlo26g.setBounds(650, 534, 93, 19);
		panel_45.add(a_swiatlo26g);

		a_pobor26g = new JTextField();
		a_pobor26g.setBackground(new Color(255, 255, 224));
		a_pobor26g.setText("10");
		a_pobor26g.setColumns(10);
		a_pobor26g.setBounds(753, 534, 61, 19);
		panel_45.add(a_pobor26g);

		a_czasstart26g = new JTextField();
		a_czasstart26g.setBackground(new Color(192, 192, 192));
		a_czasstart26g.setEnabled(false);
		a_czasstart26g.setColumns(10);
		a_czasstart26g.setBounds(824, 534, 114, 19);
		panel_45.add(a_czasstart26g);

		a_czasstop26g = new JTextField();
		a_czasstop26g.setBackground(new Color(192, 192, 192));
		a_czasstop26g.setEnabled(false);
		a_czasstop26g.setColumns(10);
		a_czasstop26g.setBounds(948, 534, 120, 19);
		panel_45.add(a_czasstop26g);

		a_id26g = new JTextField();
		a_id26g.setBackground(new Color(192, 192, 192));
		a_id26g.setEnabled(false);
		a_id26g.setColumns(10);
		a_id26g.setBounds(1078, 534, 50, 19);
		panel_45.add(a_id26g);

		JLabel lblNewLabel_4_1 = new JLabel("Poziom");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(585, 18, 45, 13);
		panel_45.add(lblNewLabel_4_1);

		JLabel lblNewLabel_3_2 = new JLabel("Obiekt");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setBounds(670, 18, 45, 13);
		panel_45.add(lblNewLabel_3_2);

		JLabel lblNewLabel_3_1_1 = new JLabel("Pob\u00F3r");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setBounds(758, 18, 45, 13);
		panel_45.add(lblNewLabel_3_1_1);

		JLabel lblNewLabel_4_2 = new JLabel("Czas Start");
		lblNewLabel_4_2.setBounds(299, 18, 69, 13);
		panel_45.add(lblNewLabel_4_2);

		JLabel lblNewLabel_3_3 = new JLabel("Czas Stop");
		lblNewLabel_3_3.setBounds(413, 18, 81, 13);
		panel_45.add(lblNewLabel_3_3);

		JLabel lblNewLabel_3_1_2 = new JLabel("Id");
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2.setBounds(526, 18, 45, 13);
		panel_45.add(lblNewLabel_3_1_2);

		lblNewLabel_4_3 = new JLabel("Czas Start");
		lblNewLabel_4_3.setBounds(856, 18, 69, 13);
		panel_45.add(lblNewLabel_4_3);

		lblNewLabel_3_1_3 = new JLabel("Id");
		lblNewLabel_3_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_3.setBounds(1083, 18, 45, 13);
		panel_45.add(lblNewLabel_3_1_3);

		JPanel panel_68 = new JPanel();
		panel_68.setBackground(new Color(255, 255, 255));
		tabbedPane_1.addTab("Ogrzewanie", null, panel_68, null);
		panel_68.setLayout(null);

		a_o_poziom0 = new JTextField();
		a_o_poziom0.setText("Poziom 0");
		a_o_poziom0.setEnabled(false);
		a_o_poziom0.setColumns(10);
		a_o_poziom0.setBackground(new Color(255, 204, 0));
		a_o_poziom0.setBounds(10, 45, 59, 19);
		panel_68.add(a_o_poziom0);

		a_o_01 = new JTextField();
		a_o_01.setText("Grzejnik 01");
		a_o_01.setColumns(10);
		a_o_01.setBackground(new Color(255, 255, 224));
		a_o_01.setBounds(79, 45, 93, 19);
		panel_68.add(a_o_01);

		a_o_pobor01 = new JTextField();
		a_o_pobor01.setText("10");
		a_o_pobor01.setColumns(10);
		a_o_pobor01.setBackground(new Color(255, 255, 224));
		a_o_pobor01.setBounds(182, 45, 61, 19);
		panel_68.add(a_o_pobor01);

		a_o_czass01 = new JTextField();
		a_o_czass01.setEnabled(false);
		a_o_czass01.setColumns(10);
		a_o_czass01.setBackground(new Color(255, 204, 0));
		a_o_czass01.setBounds(253, 45, 114, 19);
		panel_68.add(a_o_czass01);

		a_o_czasst01 = new JTextField();
		a_o_czasst01.setEnabled(false);
		a_o_czasst01.setColumns(10);
		a_o_czasst01.setBackground(new Color(255, 204, 0));
		a_o_czasst01.setBounds(377, 45, 120, 19);
		panel_68.add(a_o_czasst01);

		a_o_id01 = new JTextField();
		a_o_id01.setEnabled(false);
		a_o_id01.setColumns(10);
		a_o_id01.setBackground(new Color(255, 204, 0));
		a_o_id01.setBounds(507, 45, 50, 19);
		panel_68.add(a_o_id01);

		a_o_id02 = new JTextField();
		a_o_id02.setEnabled(false);
		a_o_id02.setColumns(10);
		a_o_id02.setBackground(new Color(255, 204, 0));
		a_o_id02.setBounds(507, 74, 50, 19);
		panel_68.add(a_o_id02);

		a_o_czasst02 = new JTextField();
		a_o_czasst02.setEnabled(false);
		a_o_czasst02.setColumns(10);
		a_o_czasst02.setBackground(new Color(255, 204, 0));
		a_o_czasst02.setBounds(377, 74, 120, 19);
		panel_68.add(a_o_czasst02);

		a_o_czass02 = new JTextField();
		a_o_czass02.setEnabled(false);
		a_o_czass02.setColumns(10);
		a_o_czass02.setBackground(new Color(255, 204, 0));
		a_o_czass02.setBounds(253, 74, 114, 19);
		panel_68.add(a_o_czass02);

		a_o_pobor02 = new JTextField();
		a_o_pobor02.setText("10");
		a_o_pobor02.setColumns(10);
		a_o_pobor02.setBackground(new Color(255, 255, 224));
		a_o_pobor02.setBounds(182, 74, 61, 19);
		panel_68.add(a_o_pobor02);

		a_o_02 = new JTextField();
		a_o_02.setText("Grzejnik 02");
		a_o_02.setColumns(10);
		a_o_02.setBackground(new Color(255, 255, 224));
		a_o_02.setBounds(79, 74, 93, 19);
		panel_68.add(a_o_02);

		txtPoziom_25 = new JTextField();
		txtPoziom_25.setText("Poziom 0");
		txtPoziom_25.setEnabled(false);
		txtPoziom_25.setColumns(10);
		txtPoziom_25.setBackground(new Color(255, 204, 0));
		txtPoziom_25.setBounds(10, 74, 59, 19);
		panel_68.add(txtPoziom_25);

		txtPoziom_26 = new JTextField();
		txtPoziom_26.setText("Poziom 0");
		txtPoziom_26.setEnabled(false);
		txtPoziom_26.setColumns(10);
		txtPoziom_26.setBackground(new Color(255, 204, 0));
		txtPoziom_26.setBounds(10, 103, 59, 19);
		panel_68.add(txtPoziom_26);

		a_o_03 = new JTextField();
		a_o_03.setText("Grzejnik 03");
		a_o_03.setColumns(10);
		a_o_03.setBackground(new Color(255, 255, 224));
		a_o_03.setBounds(79, 103, 93, 19);
		panel_68.add(a_o_03);

		a_o_pobor03 = new JTextField();
		a_o_pobor03.setText("10");
		a_o_pobor03.setColumns(10);
		a_o_pobor03.setBackground(new Color(255, 255, 224));
		a_o_pobor03.setBounds(182, 103, 61, 19);
		panel_68.add(a_o_pobor03);

		a_o_czass03 = new JTextField();
		a_o_czass03.setEnabled(false);
		a_o_czass03.setColumns(10);
		a_o_czass03.setBackground(new Color(255, 204, 0));
		a_o_czass03.setBounds(253, 103, 114, 19);
		panel_68.add(a_o_czass03);

		a_o_czasst03 = new JTextField();
		a_o_czasst03.setEnabled(false);
		a_o_czasst03.setColumns(10);
		a_o_czasst03.setBackground(new Color(255, 204, 0));
		a_o_czasst03.setBounds(377, 103, 120, 19);
		panel_68.add(a_o_czasst03);

		a_o_id03 = new JTextField();
		a_o_id03.setEnabled(false);
		a_o_id03.setColumns(10);
		a_o_id03.setBackground(new Color(255, 204, 0));
		a_o_id03.setBounds(507, 103, 50, 19);
		panel_68.add(a_o_id03);

		txtPoziom_27 = new JTextField();
		txtPoziom_27.setText("Poziom 0");
		txtPoziom_27.setEnabled(false);
		txtPoziom_27.setColumns(10);
		txtPoziom_27.setBackground(new Color(255, 153, 0));
		txtPoziom_27.setBounds(10, 132, 59, 19);
		panel_68.add(txtPoziom_27);

		a_o_04 = new JTextField();
		a_o_04.setText("Grzejnik 04");
		a_o_04.setColumns(10);
		a_o_04.setBackground(new Color(255, 255, 224));
		a_o_04.setBounds(79, 132, 93, 19);
		panel_68.add(a_o_04);

		a_o_pobor04 = new JTextField();
		a_o_pobor04.setText("10");
		a_o_pobor04.setColumns(10);
		a_o_pobor04.setBackground(new Color(255, 255, 224));
		a_o_pobor04.setBounds(182, 132, 61, 19);
		panel_68.add(a_o_pobor04);

		a_o_czass04 = new JTextField();
		a_o_czass04.setEnabled(false);
		a_o_czass04.setColumns(10);
		a_o_czass04.setBackground(new Color(255, 153, 0));
		a_o_czass04.setBounds(253, 132, 114, 19);
		panel_68.add(a_o_czass04);

		a_o_czasst04 = new JTextField();
		a_o_czasst04.setEnabled(false);
		a_o_czasst04.setColumns(10);
		a_o_czasst04.setBackground(new Color(255, 153, 0));
		a_o_czasst04.setBounds(377, 132, 120, 19);
		panel_68.add(a_o_czasst04);

		a_o_id04 = new JTextField();
		a_o_id04.setEnabled(false);
		a_o_id04.setColumns(10);
		a_o_id04.setBackground(new Color(255, 153, 0));
		a_o_id04.setBounds(507, 132, 50, 19);
		panel_68.add(a_o_id04);

		a_o_poziom1 = new JTextField();
		a_o_poziom1.setText("Poziom 1");
		a_o_poziom1.setEnabled(false);
		a_o_poziom1.setColumns(10);
		a_o_poziom1.setBackground(new Color(255, 153, 0));
		a_o_poziom1.setBounds(10, 161, 59, 19);
		panel_68.add(a_o_poziom1);

		a_o_11 = new JTextField();
		a_o_11.setText("Grzejnik 11");
		a_o_11.setColumns(10);
		a_o_11.setBackground(new Color(255, 255, 224));
		a_o_11.setBounds(79, 161, 93, 19);
		panel_68.add(a_o_11);

		a_o_pobor11 = new JTextField();
		a_o_pobor11.setText("10");
		a_o_pobor11.setColumns(10);
		a_o_pobor11.setBackground(new Color(255, 255, 224));
		a_o_pobor11.setBounds(182, 161, 61, 19);
		panel_68.add(a_o_pobor11);

		a_o_czass11 = new JTextField();
		a_o_czass11.setEnabled(false);
		a_o_czass11.setColumns(10);
		a_o_czass11.setBackground(new Color(255, 153, 0));
		a_o_czass11.setBounds(253, 161, 114, 19);
		panel_68.add(a_o_czass11);

		a_o_czasst11 = new JTextField();
		a_o_czasst11.setEnabled(false);
		a_o_czasst11.setColumns(10);
		a_o_czasst11.setBackground(new Color(255, 153, 0));
		a_o_czasst11.setBounds(377, 161, 120, 19);
		panel_68.add(a_o_czasst11);

		a_o_id11 = new JTextField();
		a_o_id11.setEnabled(false);
		a_o_id11.setColumns(10);
		a_o_id11.setBackground(new Color(255, 153, 0));
		a_o_id11.setBounds(507, 161, 50, 19);
		panel_68.add(a_o_id11);

		a_o_id12 = new JTextField();
		a_o_id12.setEnabled(false);
		a_o_id12.setColumns(10);
		a_o_id12.setBackground(new Color(255, 153, 0));
		a_o_id12.setBounds(507, 190, 50, 19);
		panel_68.add(a_o_id12);

		a_o_czasst12 = new JTextField();
		a_o_czasst12.setEnabled(false);
		a_o_czasst12.setColumns(10);
		a_o_czasst12.setBackground(new Color(255, 153, 0));
		a_o_czasst12.setBounds(377, 190, 120, 19);
		panel_68.add(a_o_czasst12);

		a_o_czass12 = new JTextField();
		a_o_czass12.setEnabled(false);
		a_o_czass12.setColumns(10);
		a_o_czass12.setBackground(new Color(255, 153, 0));
		a_o_czass12.setBounds(253, 190, 114, 19);
		panel_68.add(a_o_czass12);

		a_o_pobor12 = new JTextField();
		a_o_pobor12.setText("10");
		a_o_pobor12.setColumns(10);
		a_o_pobor12.setBackground(new Color(255, 255, 224));
		a_o_pobor12.setBounds(182, 190, 61, 19);
		panel_68.add(a_o_pobor12);

		a_o_12 = new JTextField();
		a_o_12.setText("Grzejnik 12");
		a_o_12.setColumns(10);
		a_o_12.setBackground(new Color(255, 255, 224));
		a_o_12.setBounds(79, 190, 93, 19);
		panel_68.add(a_o_12);

		txtPoziom_29 = new JTextField();
		txtPoziom_29.setText("Poziom 1");
		txtPoziom_29.setEnabled(false);
		txtPoziom_29.setColumns(10);
		txtPoziom_29.setBackground(new Color(255, 153, 0));
		txtPoziom_29.setBounds(10, 190, 59, 19);
		panel_68.add(txtPoziom_29);

		txtPoziom_30 = new JTextField();
		txtPoziom_30.setText("Poziom 1");
		txtPoziom_30.setEnabled(false);
		txtPoziom_30.setColumns(10);
		txtPoziom_30.setBackground(new Color(255, 153, 0));
		txtPoziom_30.setBounds(10, 219, 59, 19);
		panel_68.add(txtPoziom_30);

		a_o_13 = new JTextField();
		a_o_13.setText("Grzejnik 13");
		a_o_13.setColumns(10);
		a_o_13.setBackground(new Color(255, 255, 224));
		a_o_13.setBounds(79, 219, 93, 19);
		panel_68.add(a_o_13);

		a_o_pobor13 = new JTextField();
		a_o_pobor13.setText("10");
		a_o_pobor13.setColumns(10);
		a_o_pobor13.setBackground(new Color(255, 255, 224));
		a_o_pobor13.setBounds(182, 219, 61, 19);
		panel_68.add(a_o_pobor13);

		a_o_czass13 = new JTextField();
		a_o_czass13.setEnabled(false);
		a_o_czass13.setColumns(10);
		a_o_czass13.setBackground(new Color(255, 153, 0));
		a_o_czass13.setBounds(253, 219, 114, 19);
		panel_68.add(a_o_czass13);

		a_o_czasst13 = new JTextField();
		a_o_czasst13.setEnabled(false);
		a_o_czasst13.setColumns(10);
		a_o_czasst13.setBackground(new Color(255, 153, 0));
		a_o_czasst13.setBounds(377, 219, 120, 19);
		panel_68.add(a_o_czasst13);

		a_o_id13 = new JTextField();
		a_o_id13.setEnabled(false);
		a_o_id13.setColumns(10);
		a_o_id13.setBackground(new Color(255, 153, 0));
		a_o_id13.setBounds(507, 219, 50, 19);
		panel_68.add(a_o_id13);

		a_o_id14 = new JTextField();
		a_o_id14.setEnabled(false);
		a_o_id14.setColumns(10);
		a_o_id14.setBackground(new Color(255, 153, 0));
		a_o_id14.setBounds(507, 248, 50, 19);
		panel_68.add(a_o_id14);

		a_o_czasst14 = new JTextField();
		a_o_czasst14.setEnabled(false);
		a_o_czasst14.setColumns(10);
		a_o_czasst14.setBackground(new Color(255, 153, 0));
		a_o_czasst14.setBounds(377, 248, 120, 19);
		panel_68.add(a_o_czasst14);

		a_o_czass14 = new JTextField();
		a_o_czass14.setEnabled(false);
		a_o_czass14.setColumns(10);
		a_o_czass14.setBackground(new Color(255, 153, 0));
		a_o_czass14.setBounds(253, 248, 114, 19);
		panel_68.add(a_o_czass14);

		a_o_pobor14 = new JTextField();
		a_o_pobor14.setText("10");
		a_o_pobor14.setColumns(10);
		a_o_pobor14.setBackground(new Color(255, 255, 224));
		a_o_pobor14.setBounds(182, 248, 61, 19);
		panel_68.add(a_o_pobor14);

		a_o_14 = new JTextField();
		a_o_14.setText("Grzejnik 14");
		a_o_14.setColumns(10);
		a_o_14.setBackground(new Color(255, 255, 224));
		a_o_14.setBounds(79, 248, 93, 19);
		panel_68.add(a_o_14);

		txtPoziom_31 = new JTextField();
		txtPoziom_31.setText("Poziom 1");
		txtPoziom_31.setEnabled(false);
		txtPoziom_31.setColumns(10);
		txtPoziom_31.setBackground(new Color(255, 153, 0));
		txtPoziom_31.setBounds(10, 248, 59, 19);
		panel_68.add(txtPoziom_31);

		txtPoziom_32 = new JTextField();
		txtPoziom_32.setText("Poziom 1");
		txtPoziom_32.setEnabled(false);
		txtPoziom_32.setColumns(10);
		txtPoziom_32.setBackground(new Color(255, 153, 0));
		txtPoziom_32.setBounds(10, 277, 59, 19);
		panel_68.add(txtPoziom_32);

		a_o_15 = new JTextField();
		a_o_15.setText("Grzejnik 15");
		a_o_15.setColumns(10);
		a_o_15.setBackground(new Color(255, 255, 224));
		a_o_15.setBounds(79, 277, 93, 19);
		panel_68.add(a_o_15);

		a_o_pobor15 = new JTextField();
		a_o_pobor15.setText("10");
		a_o_pobor15.setColumns(10);
		a_o_pobor15.setBackground(new Color(255, 255, 224));
		a_o_pobor15.setBounds(182, 277, 61, 19);
		panel_68.add(a_o_pobor15);

		a_o_czass15 = new JTextField();
		a_o_czass15.setEnabled(false);
		a_o_czass15.setColumns(10);
		a_o_czass15.setBackground(new Color(255, 153, 0));
		a_o_czass15.setBounds(253, 277, 114, 19);
		panel_68.add(a_o_czass15);

		a_o_czasst15 = new JTextField();
		a_o_czasst15.setEnabled(false);
		a_o_czasst15.setColumns(10);
		a_o_czasst15.setBackground(new Color(255, 153, 0));
		a_o_czasst15.setBounds(377, 277, 120, 19);
		panel_68.add(a_o_czasst15);

		a_o_id15 = new JTextField();
		a_o_id15.setEnabled(false);
		a_o_id15.setColumns(10);
		a_o_id15.setBackground(new Color(255, 153, 0));
		a_o_id15.setBounds(507, 277, 50, 19);
		panel_68.add(a_o_id15);

		txtPoziom_33 = new JTextField();
		txtPoziom_33.setText("Poziom 1");
		txtPoziom_33.setEnabled(false);
		txtPoziom_33.setColumns(10);
		txtPoziom_33.setBackground(new Color(255, 153, 0));
		txtPoziom_33.setBounds(10, 306, 59, 19);
		panel_68.add(txtPoziom_33);

		a_o_16 = new JTextField();
		a_o_16.setText("Grzejnik 16");
		a_o_16.setColumns(10);
		a_o_16.setBackground(new Color(255, 255, 224));
		a_o_16.setBounds(79, 306, 93, 19);
		panel_68.add(a_o_16);

		a_o_pobor16 = new JTextField();
		a_o_pobor16.setText("10");
		a_o_pobor16.setColumns(10);
		a_o_pobor16.setBackground(new Color(255, 255, 224));
		a_o_pobor16.setBounds(182, 306, 61, 19);
		panel_68.add(a_o_pobor16);

		a_o_czass16 = new JTextField();
		a_o_czass16.setEnabled(false);
		a_o_czass16.setColumns(10);
		a_o_czass16.setBackground(new Color(255, 153, 0));
		a_o_czass16.setBounds(253, 306, 114, 19);
		panel_68.add(a_o_czass16);

		a_o_czasst16 = new JTextField();
		a_o_czasst16.setEnabled(false);
		a_o_czasst16.setColumns(10);
		a_o_czasst16.setBackground(new Color(255, 153, 0));
		a_o_czasst16.setBounds(377, 306, 120, 19);
		panel_68.add(a_o_czasst16);

		a_o_id16 = new JTextField();
		a_o_id16.setEnabled(false);
		a_o_id16.setColumns(10);
		a_o_id16.setBackground(new Color(255, 153, 0));
		a_o_id16.setBounds(507, 306, 50, 19);
		panel_68.add(a_o_id16);

		a_o_id21 = new JTextField();
		a_o_id21.setEnabled(false);
		a_o_id21.setColumns(10);
		a_o_id21.setBackground(new Color(218, 165, 32));
		a_o_id21.setBounds(507, 335, 50, 19);
		panel_68.add(a_o_id21);

		a_o_czasst21 = new JTextField();
		a_o_czasst21.setEnabled(false);
		a_o_czasst21.setColumns(10);
		a_o_czasst21.setBackground(new Color(218, 165, 32));
		a_o_czasst21.setBounds(377, 335, 120, 19);
		panel_68.add(a_o_czasst21);

		a_o_czass21 = new JTextField();
		a_o_czass21.setEnabled(false);
		a_o_czass21.setColumns(10);
		a_o_czass21.setBackground(new Color(218, 165, 32));
		a_o_czass21.setBounds(253, 335, 114, 19);
		panel_68.add(a_o_czass21);

		a_o_pobor21 = new JTextField();
		a_o_pobor21.setText("10");
		a_o_pobor21.setColumns(10);
		a_o_pobor21.setBackground(new Color(255, 255, 224));
		a_o_pobor21.setBounds(182, 335, 61, 19);
		panel_68.add(a_o_pobor21);

		a_o_21 = new JTextField();
		a_o_21.setText("Grzejnik 21");
		a_o_21.setColumns(10);
		a_o_21.setBackground(new Color(255, 255, 224));
		a_o_21.setBounds(79, 335, 93, 19);
		panel_68.add(a_o_21);

		a_o_poziom2 = new JTextField();
		a_o_poziom2.setText("Poziom 2");
		a_o_poziom2.setEnabled(false);
		a_o_poziom2.setColumns(10);
		a_o_poziom2.setBackground(new Color(218, 165, 32));
		a_o_poziom2.setBounds(10, 335, 59, 19);
		panel_68.add(a_o_poziom2);

		textField_194 = new JTextField();
		textField_194.setText("Poziom 2");
		textField_194.setEnabled(false);
		textField_194.setColumns(10);
		textField_194.setBackground(new Color(218, 165, 32));
		textField_194.setBounds(10, 364, 59, 19);
		panel_68.add(textField_194);

		a_o_22 = new JTextField();
		a_o_22.setText("Grzejnik 22");
		a_o_22.setColumns(10);
		a_o_22.setBackground(new Color(255, 255, 224));
		a_o_22.setBounds(79, 364, 93, 19);
		panel_68.add(a_o_22);

		a_o_pobor22 = new JTextField();
		a_o_pobor22.setText("10");
		a_o_pobor22.setColumns(10);
		a_o_pobor22.setBackground(new Color(255, 255, 224));
		a_o_pobor22.setBounds(182, 364, 61, 19);
		panel_68.add(a_o_pobor22);

		a_o_czass22 = new JTextField();
		a_o_czass22.setEnabled(false);
		a_o_czass22.setColumns(10);
		a_o_czass22.setBackground(new Color(218, 165, 32));
		a_o_czass22.setBounds(253, 364, 114, 19);
		panel_68.add(a_o_czass22);

		a_o_czasst22 = new JTextField();
		a_o_czasst22.setEnabled(false);
		a_o_czasst22.setColumns(10);
		a_o_czasst22.setBackground(new Color(218, 165, 32));
		a_o_czasst22.setBounds(377, 364, 120, 19);
		panel_68.add(a_o_czasst22);

		a_o_id22 = new JTextField();
		a_o_id22.setEnabled(false);
		a_o_id22.setColumns(10);
		a_o_id22.setBackground(new Color(218, 165, 32));
		a_o_id22.setBounds(507, 364, 50, 19);
		panel_68.add(a_o_id22);

		a_o_id23 = new JTextField();
		a_o_id23.setEnabled(false);
		a_o_id23.setColumns(10);
		a_o_id23.setBackground(new Color(218, 165, 32));
		a_o_id23.setBounds(507, 393, 50, 19);
		panel_68.add(a_o_id23);

		a_o_czasst23 = new JTextField();
		a_o_czasst23.setEnabled(false);
		a_o_czasst23.setColumns(10);
		a_o_czasst23.setBackground(new Color(218, 165, 32));
		a_o_czasst23.setBounds(377, 393, 120, 19);
		panel_68.add(a_o_czasst23);

		a_o_czass23 = new JTextField();
		a_o_czass23.setEnabled(false);
		a_o_czass23.setColumns(10);
		a_o_czass23.setBackground(new Color(218, 165, 32));
		a_o_czass23.setBounds(253, 393, 114, 19);
		panel_68.add(a_o_czass23);

		a_o_pobor23 = new JTextField();
		a_o_pobor23.setText("10");
		a_o_pobor23.setColumns(10);
		a_o_pobor23.setBackground(new Color(255, 255, 224));
		a_o_pobor23.setBounds(182, 393, 61, 19);
		panel_68.add(a_o_pobor23);

		a_o_23 = new JTextField();
		a_o_23.setText("Grzejnik 23");
		a_o_23.setColumns(10);
		a_o_23.setBackground(new Color(255, 255, 224));
		a_o_23.setBounds(79, 393, 93, 19);
		panel_68.add(a_o_23);

		textField_205 = new JTextField();
		textField_205.setText("Poziom 2");
		textField_205.setEnabled(false);
		textField_205.setColumns(10);
		textField_205.setBackground(new Color(218, 165, 32));
		textField_205.setBounds(10, 393, 59, 19);
		panel_68.add(textField_205);

		textField_206 = new JTextField();
		textField_206.setText("Poziom 2");
		textField_206.setEnabled(false);
		textField_206.setColumns(10);
		textField_206.setBackground(new Color(218, 165, 32));
		textField_206.setBounds(10, 422, 59, 19);
		panel_68.add(textField_206);

		a_o_24 = new JTextField();
		a_o_24.setText("Grzejnik 24");
		a_o_24.setColumns(10);
		a_o_24.setBackground(new Color(255, 255, 224));
		a_o_24.setBounds(79, 422, 93, 19);
		panel_68.add(a_o_24);

		a_o_pobor24 = new JTextField();
		a_o_pobor24.setText("10");
		a_o_pobor24.setColumns(10);
		a_o_pobor24.setBackground(new Color(255, 255, 224));
		a_o_pobor24.setBounds(182, 422, 61, 19);
		panel_68.add(a_o_pobor24);

		a_o_czass24 = new JTextField();
		a_o_czass24.setEnabled(false);
		a_o_czass24.setColumns(10);
		a_o_czass24.setBackground(new Color(218, 165, 32));
		a_o_czass24.setBounds(253, 422, 114, 19);
		panel_68.add(a_o_czass24);

		a_o_czasst24 = new JTextField();
		a_o_czasst24.setEnabled(false);
		a_o_czasst24.setColumns(10);
		a_o_czasst24.setBackground(new Color(218, 165, 32));
		a_o_czasst24.setBounds(377, 422, 120, 19);
		panel_68.add(a_o_czasst24);

		a_o_id24 = new JTextField();
		a_o_id24.setEnabled(false);
		a_o_id24.setColumns(10);
		a_o_id24.setBackground(new Color(218, 165, 32));
		a_o_id24.setBounds(507, 422, 50, 19);
		panel_68.add(a_o_id24);

		textField_212 = new JTextField();
		textField_212.setText("Poziom 2");
		textField_212.setEnabled(false);
		textField_212.setColumns(10);
		textField_212.setBackground(new Color(218, 165, 32));
		textField_212.setBounds(10, 451, 59, 19);
		panel_68.add(textField_212);

		a_o_25 = new JTextField();
		a_o_25.setText("Grzejnik 25");
		a_o_25.setColumns(10);
		a_o_25.setBackground(new Color(255, 255, 224));
		a_o_25.setBounds(79, 451, 93, 19);
		panel_68.add(a_o_25);

		a_o_pobor25 = new JTextField();
		a_o_pobor25.setText("10");
		a_o_pobor25.setColumns(10);
		a_o_pobor25.setBackground(new Color(255, 255, 224));
		a_o_pobor25.setBounds(182, 451, 61, 19);
		panel_68.add(a_o_pobor25);

		a_o_czass25 = new JTextField();
		a_o_czass25.setEnabled(false);
		a_o_czass25.setColumns(10);
		a_o_czass25.setBackground(new Color(218, 165, 32));
		a_o_czass25.setBounds(253, 451, 114, 19);
		panel_68.add(a_o_czass25);

		a_o_czasst25 = new JTextField();
		a_o_czasst25.setEnabled(false);
		a_o_czasst25.setColumns(10);
		a_o_czasst25.setBackground(new Color(218, 165, 32));
		a_o_czasst25.setBounds(377, 451, 120, 19);
		panel_68.add(a_o_czasst25);

		a_o_id25 = new JTextField();
		a_o_id25.setEnabled(false);
		a_o_id25.setColumns(10);
		a_o_id25.setBackground(new Color(218, 165, 32));
		a_o_id25.setBounds(507, 451, 50, 19);
		panel_68.add(a_o_id25);

		lblNewLabel_37 = new JLabel("Poziom");
		lblNewLabel_37.setBounds(24, 22, 45, 13);
		panel_68.add(lblNewLabel_37);

		lblNewLabel_38 = new JLabel("Obiekt");
		lblNewLabel_38.setBounds(116, 22, 45, 13);
		panel_68.add(lblNewLabel_38);

		lblNewLabel_3_5 = new JLabel("Pob\u00F3r");
		lblNewLabel_3_5.setBounds(198, 22, 45, 13);
		panel_68.add(lblNewLabel_3_5);

		lblNewLabel_4_4 = new JLabel("Czas Start");
		lblNewLabel_4_4.setBounds(285, 22, 69, 13);
		panel_68.add(lblNewLabel_4_4);

		lblNewLabel_3_6 = new JLabel("Czas Stop");
		lblNewLabel_3_6.setBounds(399, 22, 81, 13);
		panel_68.add(lblNewLabel_3_6);

		lblNewLabel_3_1_4 = new JLabel("Id");
		lblNewLabel_3_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_4.setBounds(512, 22, 45, 13);
		panel_68.add(lblNewLabel_3_1_4);

		a_miesiac = new JTextField();
		a_miesiac.setBounds(996, 41, 96, 19);
		p_admin.add(a_miesiac);
		a_miesiac.setColumns(10);

		a_rok = new JTextField();
		a_rok.setColumns(10);
		a_rok.setBounds(1105, 41, 96, 19);
		a_rok.setVisible(false);
		p_admin.add(a_rok);
		a_miesiac.setVisible(false);
		frame.getContentPane().add(p_start);
		p_start.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(SystemColor.menu);
		tabbedPane.setBounds(10, 10, 1325, 655);
		p_start.add(tabbedPane);

		panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		tabbedPane.addTab("Zabezpieczenia", null, panel_3, null);
		panel_3.setLayout(null);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(220, 220, 220));
		panel_6.setBounds(32, 22, 225, 224);
		panel_3.add(panel_6);
		panel_6.setLayout(null);

		panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(153, 51, 0), 2));
		panel_8.setBackground(new Color(153, 51, 0));
		panel_8.setBounds(48, 173, 102, 51);
		panel_6.add(panel_8);

		JPanel panel_7_4 = new JPanel();
		panel_7_4.setBackground(new Color(51, 51, 51));
		panel_7_4.setBounds(0, 0, 244, 17);
		panel_6.add(panel_7_4);
		panel_7_4.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Widok - FRONT");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 0, 210, 18);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		panel_7_4.add(lblNewLabel_1);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(51, 51, 51));
		panel_7.setBounds(0, 193, 244, 31);
		panel_6.add(panel_7);

		panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(153, 51, 0), 2));
		panel_9.setBackground(new Color(153, 51, 0));
		panel_9.setBounds(179, 142, 30, 51);
		panel_6.add(panel_9);

		front_okno01 = new JPanel();
		front_okno01.setBorder(new LineBorder(new Color(153, 51, 0), 2));
		front_okno01.setBackground(new Color(102, 204, 255));
		front_okno01.setBounds(63, 117, 74, 31);
		panel_6.add(front_okno01);

		front_okno11 = new JPanel();
		front_okno11.setBorder(new LineBorder(new Color(153, 51, 0), 2));
		front_okno11.setBackground(new Color(102, 204, 255));
		front_okno11.setBounds(88, 37, 74, 31);
		panel_6.add(front_okno11);

		front_okno12 = new JPanel();
		front_okno12.setBorder(new LineBorder(new Color(153, 51, 0), 2));
		front_okno12.setBackground(new Color(102, 204, 255));
		front_okno12.setBounds(184, 65, 25, 40);
		panel_6.add(front_okno12);

		front_drzwi11 = new JPanel();
		front_drzwi11.setBorder(new LineBorder(new Color(153, 51, 0), 2));
		front_drzwi11.setBackground(new Color(102, 204, 255));
		front_drzwi11.setBounds(48, 37, 30, 51);
		panel_6.add(front_drzwi11);

		panel_14 = new JPanel();
		panel_14.setBackground(new Color(153, 153, 153));
		panel_14.setBounds(42, 87, 120, 4);
		panel_6.add(panel_14);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(183, 266, 924, 165);
		panel_3.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Menu.sym.getText().equals("START")) {
					ZamykanieAutomatyczne az = new ZamykanieAutomatyczne();
					az.automatyczneZamykanie();
					ZabezpieczeniaOtwarte.pokarzOtwarte();
					Menu.sym.setText("");
					sym.setVisible(false);
					Menu.sym_1.setText("STOP ");
					sym_1.setVisible(true);
					lblNewLabel_8.setText("Auto");
				} else {
					Menu.sym_1.setText("STOP");
					lblNewLabel_8.setText("Manualny");

				}
			}
		});
		btnNewButton.setBounds(1054, 498, 97, 21);
		panel_3.add(btnNewButton);

		panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBackground(new Color(220, 220, 220));
		panel_15.setBounds(385, 22, 225, 224);
		panel_3.add(panel_15);

		panel_7_1 = new JPanel();
		panel_7_1.setBackground(new Color(51, 51, 51));
		panel_7_1.setBounds(0, 0, 244, 17);
		panel_15.add(panel_7_1);
		panel_7_1.setLayout(null);

		JLabel lblNewLabel_1_1 = new JLabel("Widok - PO\u0141UDNIE");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(10, 0, 210, 18);
		panel_7_1.add(lblNewLabel_1_1);

		panel_17 = new JPanel();
		panel_17.setBackground(new Color(51, 51, 51));
		panel_17.setBounds(0, 193, 244, 31);
		panel_15.add(panel_17);

		okno02 = new JPanel();
		okno02.setBorder(new LineBorder(new Color(153, 51, 0), 2));
		okno02.setBackground(new Color(102, 204, 255));
		okno02.setBounds(86, 117, 51, 31);
		panel_15.add(okno02);

		okno13 = new JPanel();
		okno13.setBorder(new LineBorder(new Color(153, 51, 0), 2));
		okno13.setBackground(new Color(102, 204, 255));
		okno13.setBounds(88, 37, 51, 31);
		panel_15.add(okno13);

		panel_24 = new JPanel();
		panel_24.setLayout(null);
		panel_24.setBackground(new Color(220, 220, 220));
		panel_24.setBounds(727, 22, 225, 224);
		panel_3.add(panel_24);

		panel_23 = new JPanel();
		panel_23.setBackground(new Color(153, 153, 153));
		panel_23.setBounds(0, 169, 225, 4);
		panel_24.add(panel_23);

		panel_27 = new JPanel();
		panel_27.setBackground(new Color(153, 51, 0));
		panel_27.setBounds(187, 173, 30, 51);
		panel_24.add(panel_27);

		panel_7_2 = new JPanel();
		panel_7_2.setBackground(new Color(51, 51, 51));
		panel_7_2.setBounds(0, 0, 244, 17);
		panel_24.add(panel_7_2);
		panel_7_2.setLayout(null);

		JLabel lblNewLabel_1_2 = new JLabel("Widok - TY\u0141");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setBounds(10, 0, 210, 18);
		panel_7_2.add(lblNewLabel_1_2);

		panel_26 = new JPanel();
		panel_26.setBackground(new Color(51, 51, 51));
		panel_26.setBounds(0, 193, 244, 31);
		panel_24.add(panel_26);

		okno03 = new JPanel();
		okno03.setBorder(new LineBorder(new Color(153, 51, 0), 2));
		okno03.setBackground(new Color(102, 204, 255));
		okno03.setBounds(40, 117, 51, 31);
		panel_24.add(okno03);

		okno15 = new JPanel();
		okno15.setBorder(new LineBorder(new Color(153, 51, 0), 2));
		okno15.setBackground(new Color(102, 204, 255));
		okno15.setBounds(119, 37, 80, 31);
		panel_24.add(okno15);

		okno14 = new JPanel();
		okno14.setBorder(new LineBorder(new Color(153, 51, 0), 2));
		okno14.setBackground(new Color(102, 204, 255));
		okno14.setBounds(40, 37, 51, 31);
		panel_24.add(okno14);

		drzwi01 = new JPanel();
		drzwi01.setBorder(new LineBorder(new Color(153, 51, 0), 2));
		drzwi01.setBackground(new Color(102, 204, 255));
		drzwi01.setBounds(187, 117, 30, 51);
		panel_24.add(drzwi01);

		okno04 = new JPanel();
		okno04.setBorder(new LineBorder(new Color(153, 51, 0), 2));
		okno04.setBackground(new Color(102, 204, 255));
		okno04.setBounds(119, 117, 58, 31);
		panel_24.add(okno04);

		panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setBackground(new Color(220, 220, 220));
		panel_16.setBounds(1051, 22, 225, 224);
		panel_3.add(panel_16);

		panel_7_3 = new JPanel();
		panel_7_3.setBackground(new Color(51, 51, 51));
		panel_7_3.setBounds(0, 0, 244, 17);
		panel_16.add(panel_7_3);
		panel_7_3.setLayout(null);

		JLabel lblNewLabel_1_3 = new JLabel("Widok - P\u00D3\u0141NOC");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setBounds(10, 0, 210, 18);
		panel_7_3.add(lblNewLabel_1_3);

		panel_18 = new JPanel();
		panel_18.setBackground(new Color(51, 51, 51));
		panel_18.setBounds(0, 193, 244, 31);
		panel_16.add(panel_18);

		okno05 = new JPanel();
		okno05.setBorder(new LineBorder(new Color(153, 51, 0), 2));
		okno05.setBackground(new Color(102, 204, 255));
		okno05.setBounds(86, 117, 51, 31);
		panel_16.add(okno05);

		okno16 = new JPanel();
		okno16.setBorder(new LineBorder(new Color(153, 51, 0), 2));
		okno16.setBackground(new Color(102, 204, 255));
		okno16.setBounds(88, 37, 51, 31);
		panel_16.add(okno16);

		panel_30 = new JPanel();
		panel_30.setBackground(new Color(153, 153, 153));
		panel_30.setBounds(352, 103, 35, 4);
		panel_3.add(panel_30);

		panel_32 = new JPanel();
		panel_32.setBackground(new Color(153, 153, 153));
		panel_32.setBounds(607, 192, 35, 4);
		panel_3.add(panel_32);

		panel_34 = new JPanel();
		panel_34.setBackground(new Color(153, 153, 153));
		panel_34.setBounds(1016, 192, 35, 4);
		panel_3.add(panel_34);

		panel_35 = new JPanel();
		panel_35.setBackground(new Color(153, 153, 153));
		panel_35.setBounds(1275, 103, 35, 4);
		panel_3.add(panel_35);

		obiekt = new JComboBox();
		obiekt.setModel(new DefaultComboBoxModel(new String[] { "--Obiekt--" }));
		obiekt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		obiekt.setBounds(310, 478, 113, 21);
		panel_3.add(obiekt);

		status = new JComboBox();
		status.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ZamykanieReczne rz = new ZamykanieReczne();
				rz.reczneZamykanie();
				StatusZabezpieczenia s = new StatusZabezpieczenia();
				s.status();
			}
		});
		status.setModel(new DefaultComboBoxModel<Object>(new String[] { "--Status--", "OTWARTE", "Zamkni\u0119te" }));
		status.setBounds(433, 478, 113, 21);
		panel_3.add(status);

		poziom = new JComboBox();
		poziom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KomponentCombo.wyznacz();
			}
		});
		poziom.setModel(new DefaultComboBoxModel(new String[] { "--Poziom--", "0", "1", "2" }));
		poziom.setBounds(181, 478, 113, 21);
		panel_3.add(poziom);

		widok = new JComboBox();
		widok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KomponentCombo.wyznacz();
			}
		});
		widok.setModel(new DefaultComboBoxModel(
				new String[] { "--Widok--", "FRONT", "PO\u0141UDNIE", "TY\u0141", "P\u00D3\u0141NOC" }));
		widok.setBounds(58, 478, 113, 21);
		panel_3.add(widok);

		JPanel panel_19 = new JPanel();
		panel_19.setBackground(Color.WHITE);
		panel_19.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"R\u0119czne sterowanie roletami", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_19.setBounds(32, 441, 541, 109);
		panel_3.add(panel_19);

		JLabel lblNewLabel_15 = new JLabel("Poziom 0");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_15.setBounds(620, 206, 97, 27);
		panel_3.add(lblNewLabel_15);

		JLabel lblNewLabel_15_1 = new JLabel("Poziom 1");
		lblNewLabel_15_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_15_1.setBounds(620, 138, 97, 27);
		panel_3.add(lblNewLabel_15_1);

		JLabel lblNewLabel_15_2 = new JLabel("Poziom 2");
		lblNewLabel_15_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_15_2.setBounds(620, 69, 97, 27);
		panel_3.add(lblNewLabel_15_2);

		combo_sym_wilg = new JComboBox();
		combo_sym_wilg
				.setModel(new DefaultComboBoxModel(new String[] { "65", "70", "75", "80", "85", "90", "95", "100" }));
		combo_sym_wilg.setBounds(888, 467, 48, 21);
		panel_3.add(combo_sym_wilg);

		combo_sym_temp2 = new JComboBox();
		combo_sym_temp2.setModel(new DefaultComboBoxModel(
				new String[] { "10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30" }));
		combo_sym_temp2.setBounds(1193, 467, 48, 21);
		panel_3.add(combo_sym_temp2);

		combo_sym_temp1 = new JComboBox();
		combo_sym_temp1.setModel(new DefaultComboBoxModel(
				new String[] { "10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30" }));
		combo_sym_temp1.setBounds(1037, 467, 48, 21);
		panel_3.add(combo_sym_temp1);

		JLabel lblNewLabel_35 = new JLabel("Wilgotno\u015B\u0107 (%):");
		lblNewLabel_35.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_35.setBounds(781, 471, 97, 13);
		panel_3.add(lblNewLabel_35);

		JLabel lblNewLabel_35_1 = new JLabel("Temp. 1. poz.:");
		lblNewLabel_35_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_35_1.setBounds(921, 471, 106, 13);
		panel_3.add(lblNewLabel_35_1);

		lblNewLabel_35_2 = new JLabel("Temp. 2. poz.:");
		lblNewLabel_35_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_35_2.setBounds(1089, 471, 97, 13);
		panel_3.add(lblNewLabel_35_2);

		sym = new JTextField("START");
		sym.setFont(new Font("Tahoma", Font.BOLD, 11));
		sym.setEditable(false);
		sym.setHorizontalAlignment(SwingConstants.CENTER);
		sym.setBackground(Color.GREEN);
		sym.setBounds(919, 498, 60, 21);
		panel_3.add(sym);

		sym_1 = new JTextField("");
		sym_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		sym_1.setEditable(false);
		sym_1.setVisible(false);
		sym_1.setBackground(Color.RED);
		sym_1.setHorizontalAlignment(SwingConstants.CENTER);
		sym_1.setBounds(984, 498, 60, 21);
		panel_3.add(sym_1);

		JPanel panel_19_1 = new JPanel();
		panel_19_1.setBackground(Color.WHITE);
		panel_19_1.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Automatyczne sterowanie roletami", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_19_1.setBounds(752, 441, 541, 109);
		panel_3.add(panel_19_1);
		tabbedPane.setForegroundAt(0, new Color(0, 0, 0));

		panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		tabbedPane.addTab("Elektrycznoœæ", null, panel_4, null);
		panel_4.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(228, 351, 905, 253);
		panel_4.add(scrollPane_1);

		table_2 = new JTable();
		scrollPane_1.setViewportView(table_2);

		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(Color.DARK_GRAY);
		panel_6_1.setBounds(99, 57, 225, 224);
		panel_4.add(panel_6_1);
		panel_6_1.setLayout(null);

		panel_36 = new JPanel();
		panel_36.setBounds(47, 101, 132, 42);
		panel_6_1.add(panel_36);
		panel_36.setLayout(null);

		s02 = new JPanel();
		s02.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom02.getText();
				String obiekt = a_swiatlo02.getText();
				String p = a_pobor02.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart02;
				JTextField czasstop = a_czasstop02;
				JTextField identyfikacja = a_id02;

				ZrodloSwiatlo z = new ZrodloSwiatlo();
				z.zrodlo_swiatlo(s02, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		s02.setBackground(Color.GRAY);
		s02.setBounds(54, 10, 21, 24);
		panel_36.add(s02);

		lblNewLabel_18 = new JLabel("S02");
		s02.add(lblNewLabel_18);

		g02 = new JPanel();
		g02.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom06.getText();
				String obiekt = a_swiatlo02g.getText();
				String p = a_pobor02g.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart02g;
				JTextField czasstop = a_czasstop02g;
				JTextField identyfikacja = a_id02g;
				ZrodloGniazdo z = new ZrodloGniazdo();
				z.zrodlo_gniazdo(g02, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);

			}
		});
		g02.setBackground(Color.LIGHT_GRAY);
		g02.setBounds(25, 0, 10, 10);
		panel_36.add(g02);

		lblNewLabel_24 = new JLabel("G02");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_24.setBounds(0, 0, 21, 13);
		panel_36.add(lblNewLabel_24);

		panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBounds(87, 153, 78, 61);
		panel_6_1.add(panel_10);

		s05 = new JPanel();
		s05.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom05.getText();
				String obiekt = a_swiatlo05.getText();
				String p = a_pobor05.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart05;
				JTextField czasstop = a_czasstop05;
				JTextField identyfikacja = a_id05;
				ZrodloSwiatlo z = new ZrodloSwiatlo();
				z.zrodlo_swiatlo(s05, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		s05.setBackground(Color.GRAY);
		s05.setBounds(25, 22, 21, 24);
		panel_10.add(s05);

		lblNewLabel_20 = new JLabel("S05");
		s05.add(lblNewLabel_20);

		g05 = new JPanel();
		g05.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom06.getText();
				String obiekt = a_swiatlo05g.getText();
				String p = a_pobor05g.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart05g;
				JTextField czasstop = a_czasstop05g;
				JTextField identyfikacja = a_id05g;
				ZrodloGniazdo z = new ZrodloGniazdo();
				z.zrodlo_gniazdo(g05, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		g05.setBackground(Color.LIGHT_GRAY);
		g05.setBounds(68, 22, 10, 10);
		panel_10.add(g05);

		lblNewLabel_26 = new JLabel("G05");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_26.setBounds(56, 10, 21, 13);
		panel_10.add(lblNewLabel_26);

		g03 = new JPanel();
		g03.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom06.getText();
				String obiekt = a_swiatlo03g.getText();
				String p = a_pobor03g.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart03g;
				JTextField czasstop = a_czasstop03g;
				JTextField identyfikacja = a_id03g;
				ZrodloGniazdo z = new ZrodloGniazdo();
				z.zrodlo_gniazdo(g03, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		g03.setBackground(Color.LIGHT_GRAY);
		g03.setBounds(205, 125, 10, 10);
		panel_6_1.add(g03);

		panel_37 = new JPanel();
		panel_37.setBounds(176, 101, 39, 113);
		panel_6_1.add(panel_37);
		panel_37.setLayout(null);

		s03 = new JPanel();
		s03.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom03.getText();
				String obiekt = a_swiatlo03.getText();
				String p = a_pobor03.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart03;
				JTextField czasstop = a_czasstop03;
				JTextField identyfikacja = a_id03;
				ZrodloSwiatlo z = new ZrodloSwiatlo();
				z.zrodlo_swiatlo(s03, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		s03.setBackground(Color.GRAY);
		s03.setBounds(10, 47, 21, 24);
		panel_37.add(s03);

		lblNewLabel_19 = new JLabel("S03");
		s03.add(lblNewLabel_19);

		lblNewLabel_25 = new JLabel("G03");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_25.setBounds(10, 22, 21, 13);
		panel_37.add(lblNewLabel_25);

		JPanel panel_12 = new JPanel();
		panel_12.setBounds(60, 10, 155, 81);
		panel_6_1.add(panel_12);
		panel_12.setLayout(null);

		s06 = new JPanel();
		s06.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// a_id06.setText("");
				String poziom = a_poziom06.getText();
				String obiekt = a_swiatlo06.getText();
				String p = a_pobor06.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart06;
				JTextField czasstop = a_czasstop06;
				JTextField identyfikacja = a_id06;
				ZrodloSwiatlo z = new ZrodloSwiatlo();
				z.zrodlo_swiatlo(s06, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);

			}
		});
		s06.setBackground(Color.GRAY);
		s06.setBounds(65, 32, 21, 24);
		panel_12.add(s06);

		lblNewLabel_16 = new JLabel("S06");
		s06.add(lblNewLabel_16);

		g01 = new JPanel();
		g01.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom06.getText();
				String obiekt = a_swiatlo01g.getText();
				String p = a_pobor01g.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart01g;
				JTextField czasstop = a_czasstop01g;
				JTextField identyfikacja = a_id01g;
				ZrodloGniazdo z = new ZrodloGniazdo();
				z.zrodlo_gniazdo(g01, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		g01.setBackground(Color.LIGHT_GRAY);
		g01.setBounds(145, 46, 10, 10);
		panel_12.add(g01);

		lblNewLabel_22 = new JLabel("G01");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_22.setBounds(124, 43, 21, 13);
		panel_12.add(lblNewLabel_22);

		panel_11 = new JPanel();
		panel_11.setBounds(10, 153, 67, 61);
		panel_6_1.add(panel_11);
		panel_11.setLayout(null);

		s04 = new JPanel();
		s04.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom04.getText();
				String obiekt = a_swiatlo04.getText();
				String p = a_pobor04.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart04;
				JTextField czasstop = a_czasstop04;
				JTextField identyfikacja = a_id04;
				ZrodloSwiatlo z = new ZrodloSwiatlo();
				z.zrodlo_swiatlo(s04, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		s04.setBackground(Color.GRAY);
		s04.setBounds(21, 17, 21, 24);
		panel_11.add(s04);

		lblNewLabel_21 = new JLabel("S04");
		s04.add(lblNewLabel_21);

		g04 = new JPanel();
		g04.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom06.getText();
				String obiekt = a_swiatlo04g.getText();
				String p = a_pobor04g.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart04g;
				JTextField czasstop = a_czasstop04g;
				JTextField identyfikacja = a_id04g;
				ZrodloGniazdo z = new ZrodloGniazdo();
				z.zrodlo_gniazdo(g04, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		g04.setBackground(Color.LIGHT_GRAY);
		g04.setBounds(32, 51, 10, 10);
		panel_11.add(g04);

		lblNewLabel_27 = new JLabel("G04");
		lblNewLabel_27.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_27.setBounds(10, 48, 21, 13);
		panel_11.add(lblNewLabel_27);

		panel_13 = new JPanel();
		panel_13.setBounds(10, 10, 39, 133);
		panel_6_1.add(panel_13);
		panel_13.setLayout(null);

		s01 = new JPanel();
		s01.setBounds(10, 56, 21, 24);
		panel_13.add(s01);
		s01.setBackground(Color.GRAY);

		lblNewLabel_17 = new JLabel("S01");
		s01.add(lblNewLabel_17);
		s01.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom01.getText();
				String obiekt = a_swiatlo01.getText();
				String p = a_pobor01.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart01;
				JTextField czasstop = a_czasstop01;
				JTextField identyfikacja = a_id01;
				ZrodloSwiatlo z = new ZrodloSwiatlo();
				z.zrodlo_swiatlo(s01, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);

			}
		});

		JLabel el_p0 = new JLabel("Poziom 0  ");
		el_p0.setFont(new Font("Tahoma", Font.BOLD, 12));
		el_p0.setBounds(99, 35, 225, 13);
		panel_4.add(el_p0);

		panel_6_2 = new JPanel();
		panel_6_2.setLayout(null);
		panel_6_2.setBackground(Color.DARK_GRAY);
		panel_6_2.setBounds(517, 57, 225, 224);
		panel_4.add(panel_6_2);

		g12 = new JPanel();
		g12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom11.getText();
				String obiekt = a_swiatlo12g.getText();
				String p = a_pobor12g.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart12g;
				JTextField czasstop = a_czasstop12g;
				JTextField identyfikacja = a_id12g;
				ZrodloGniazdo z = new ZrodloGniazdo();
				z.zrodlo_gniazdo(g12, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		g12.setBackground(Color.LIGHT_GRAY);
		g12.setBounds(136, 177, 10, 10);
		panel_6_2.add(g12);

		panel_43 = new JPanel();
		panel_43.setLayout(null);
		panel_43.setBounds(136, 153, 79, 61);
		panel_6_2.add(panel_43);

		s15 = new JPanel();
		s15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom01.getText();
				String obiekt = a_swiatlo15.getText();
				String p = a_pobor15.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart15;
				JTextField czasstop = a_czasstop15;
				JTextField identyfikacja = a_id15;
				ZrodloSwiatlo z = new ZrodloSwiatlo();
				z.zrodlo_swiatlo(s15, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		s15.setBackground(Color.GRAY);
		s15.setBounds(30, 10, 21, 24);
		panel_43.add(s15);

		JLabel lblNewLabel_17_5 = new JLabel("S15");
		s15.add(lblNewLabel_17_5);

		JLabel lblNewLabel_22_6 = new JLabel("G12");
		lblNewLabel_22_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_22_6.setBounds(1, 38, 21, 13);
		panel_43.add(lblNewLabel_22_6);

		panel_40 = new JPanel();
		panel_40.setLayout(null);
		panel_40.setBounds(10, 10, 67, 81);
		panel_6_2.add(panel_40);

		s11 = new JPanel();
		s11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom11.getText();
				String obiekt = a_swiatlo11.getText();
				String p = a_pobor11.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart11;
				JTextField czasstop = a_czasstop11;
				JTextField identyfikacja = a_id11;
				ZrodloSwiatlo z = new ZrodloSwiatlo();
				z.zrodlo_swiatlo(s11, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		s11.setBackground(Color.GRAY);
		s11.setBounds(10, 36, 21, 24);
		panel_40.add(s11);

		lblNewLabel_29 = new JLabel("S11");
		s11.add(lblNewLabel_29);

		g11 = new JPanel();
		g11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom11.getText();
				String obiekt = a_swiatlo11g.getText();
				String p = a_pobor11g.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart11g;
				JTextField czasstop = a_czasstop11g;
				JTextField identyfikacja = a_id11g;
				ZrodloGniazdo z = new ZrodloGniazdo();
				z.zrodlo_gniazdo(g11, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		g11.setBackground(Color.LIGHT_GRAY);
		g11.setBounds(57, 34, 10, 10);
		panel_40.add(g11);

		JLabel lblNewLabel_22_1 = new JLabel("G11");
		lblNewLabel_22_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_22_1.setBounds(46, 20, 21, 13);
		panel_40.add(lblNewLabel_22_1);

		panel_41 = new JPanel();
		panel_41.setLayout(null);
		panel_41.setBounds(10, 101, 143, 42);
		panel_6_2.add(panel_41);

		s12 = new JPanel();
		s12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom01.getText();
				String obiekt = a_swiatlo12.getText();
				String p = a_pobor12.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart12;
				JTextField czasstop = a_czasstop12;
				JTextField identyfikacja = a_id12;
				ZrodloSwiatlo z = new ZrodloSwiatlo();
				z.zrodlo_swiatlo(s12, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		s12.setBackground(Color.GRAY);
		s12.setBounds(65, 10, 21, 24);
		panel_41.add(s12);

		JLabel lblNewLabel_17_2 = new JLabel("S12");
		s12.add(lblNewLabel_17_2);

		g14 = new JPanel();
		g14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom11.getText();
				String obiekt = a_swiatlo14g.getText();
				String p = a_pobor14g.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart14g;
				JTextField czasstop = a_czasstop14g;
				JTextField identyfikacja = a_id14g;
				ZrodloGniazdo z = new ZrodloGniazdo();
				z.zrodlo_gniazdo(g14, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		g14.setBackground(Color.LIGHT_GRAY);
		g14.setBounds(93, 0, 10, 10);
		panel_41.add(g14);

		JLabel lblNewLabel_22_3 = new JLabel("G14");
		lblNewLabel_22_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_22_3.setBounds(108, 0, 21, 13);
		panel_41.add(lblNewLabel_22_3);

		panel_42 = new JPanel();
		panel_42.setLayout(null);
		panel_42.setBounds(163, 101, 52, 42);
		panel_6_2.add(panel_42);

		s13 = new JPanel();
		s13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom01.getText();
				String obiekt = a_swiatlo13.getText();
				String p = a_pobor13.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart13;
				JTextField czasstop = a_czasstop13;
				JTextField identyfikacja = a_id13;
				ZrodloSwiatlo z = new ZrodloSwiatlo();
				z.zrodlo_swiatlo(s13, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		s13.setBackground(Color.GRAY);
		s13.setBounds(10, 10, 21, 24);
		panel_42.add(s13);

		JLabel lblNewLabel_17_3 = new JLabel("S13");
		s13.add(lblNewLabel_17_3);

		g15 = new JPanel();
		g15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom11.getText();
				String obiekt = a_swiatlo15g.getText();
				String p = a_pobor15g.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart15g;
				JTextField czasstop = a_czasstop15g;
				JTextField identyfikacja = a_id15g;
				ZrodloGniazdo z = new ZrodloGniazdo();
				z.zrodlo_gniazdo(g15, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		g15.setBackground(Color.LIGHT_GRAY);
		g15.setBounds(42, 10, 10, 10);
		panel_42.add(g15);

		JLabel lblNewLabel_22_4 = new JLabel("G15");
		lblNewLabel_22_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_22_4.setBounds(31, 21, 21, 13);
		panel_42.add(lblNewLabel_22_4);

		panel_38 = new JPanel();
		panel_38.setLayout(null);
		panel_38.setBounds(87, 10, 128, 81);
		panel_6_2.add(panel_38);

		s16 = new JPanel();
		s16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom11.getText();
				String obiekt = a_swiatlo16.getText();
				String p = a_pobor16.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart16;
				JTextField czasstop = a_czasstop16;
				JTextField identyfikacja = a_id16;
				ZrodloSwiatlo z = new ZrodloSwiatlo();
				z.zrodlo_swiatlo(s16, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		s16.setBackground(Color.GRAY);
		s16.setBounds(50, 32, 21, 24);
		panel_38.add(s16);

		JLabel lblNewLabel_17_1 = new JLabel("S16");
		s16.add(lblNewLabel_17_1);

		g13 = new JPanel();
		g13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom11.getText();
				String obiekt = a_swiatlo13g.getText();
				String p = a_pobor13g.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart13g;
				JTextField czasstop = a_czasstop13g;
				JTextField identyfikacja = a_id13g;
				ZrodloGniazdo z = new ZrodloGniazdo();
				z.zrodlo_gniazdo(g13, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		g13.setBackground(Color.LIGHT_GRAY);
		g13.setBounds(118, 61, 10, 10);
		panel_38.add(g13);

		JLabel lblNewLabel_22_2 = new JLabel("G13");
		lblNewLabel_22_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_22_2.setBounds(97, 58, 21, 13);
		panel_38.add(lblNewLabel_22_2);

		panel_39 = new JPanel();
		panel_39.setLayout(null);
		panel_39.setBounds(10, 153, 116, 61);
		panel_6_2.add(panel_39);

		s14 = new JPanel();
		s14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom01.getText();
				String obiekt = a_swiatlo14.getText();
				String p = a_pobor14.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart14;
				JTextField czasstop = a_czasstop14;
				JTextField identyfikacja = a_id14;
				ZrodloSwiatlo z = new ZrodloSwiatlo();
				z.zrodlo_swiatlo(s14, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		s14.setBackground(Color.GRAY);
		s14.setBounds(52, 22, 21, 24);
		panel_39.add(s14);

		JLabel lblNewLabel_17_4 = new JLabel("S14");
		s14.add(lblNewLabel_17_4);

		g16 = new JPanel();
		g16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom11.getText();
				String obiekt = a_swiatlo16g.getText();
				String p = a_pobor16g.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart16g;
				JTextField czasstop = a_czasstop16g;
				JTextField identyfikacja = a_id16g;
				ZrodloGniazdo z = new ZrodloGniazdo();
				z.zrodlo_gniazdo(g16, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		g16.setBackground(Color.LIGHT_GRAY);
		g16.setBounds(0, 22, 10, 10);
		panel_39.add(g16);

		JLabel lblNewLabel_22_5 = new JLabel("G16");
		lblNewLabel_22_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_22_5.setBounds(11, 22, 21, 13);
		panel_39.add(lblNewLabel_22_5);

		el_p0_1 = new JLabel("Poziom 1");
		el_p0_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		el_p0_1.setBounds(517, 36, 225, 13);
		panel_4.add(el_p0_1);

		el_p0_2 = new JLabel("Poziom 2");
		el_p0_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		el_p0_2.setBounds(974, 36, 225, 13);
		panel_4.add(el_p0_2);

		JPanel panel_6_2_1 = new JPanel();
		panel_6_2_1.setLayout(null);
		panel_6_2_1.setBackground(Color.DARK_GRAY);
		panel_6_2_1.setBounds(974, 57, 225, 224);
		panel_4.add(panel_6_2_1);

		JPanel g22 = new JPanel();
		g22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom21.getText();
				String obiekt = a_swiatlo22g.getText();
				String p = a_pobor22g.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart22g;
				JTextField czasstop = a_czasstop22g;
				JTextField identyfikacja = a_id22g;
				ZrodloGniazdo z = new ZrodloGniazdo();
				z.zrodlo_gniazdo(g22, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		g22.setBackground(Color.LIGHT_GRAY);
		g22.setBounds(136, 177, 10, 10);
		panel_6_2_1.add(g22);

		JPanel panel_43_1 = new JPanel();
		panel_43_1.setLayout(null);
		panel_43_1.setBounds(136, 153, 79, 61);
		panel_6_2_1.add(panel_43_1);

		JPanel s25 = new JPanel();
		s25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom21.getText();
				String obiekt = a_swiatlo25.getText();
				String p = a_pobor25.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart25;
				JTextField czasstop = a_czasstop25;
				JTextField identyfikacja = a_id25;
				ZrodloSwiatlo z = new ZrodloSwiatlo();
				z.zrodlo_swiatlo(s25, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		s25.setBackground(Color.GRAY);
		s25.setBounds(30, 10, 21, 24);
		panel_43_1.add(s25);

		JLabel lblNewLabel_17_5_1 = new JLabel("S25");
		s25.add(lblNewLabel_17_5_1);

		JLabel lblNewLabel_22_6_1 = new JLabel("G22");
		lblNewLabel_22_6_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_22_6_1.setBounds(1, 38, 21, 13);
		panel_43_1.add(lblNewLabel_22_6_1);

		JPanel panel_40_1 = new JPanel();
		panel_40_1.setLayout(null);
		panel_40_1.setBounds(10, 10, 67, 81);
		panel_6_2_1.add(panel_40_1);

		JPanel s21 = new JPanel();
		s21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom21.getText();
				String obiekt = a_swiatlo21.getText();
				String p = a_pobor21.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart21;
				JTextField czasstop = a_czasstop21;
				JTextField identyfikacja = a_id21;
				ZrodloSwiatlo z = new ZrodloSwiatlo();
				z.zrodlo_swiatlo(s21, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);

			}
		});
		s21.setBackground(Color.GRAY);
		s21.setBounds(10, 36, 21, 24);
		panel_40_1.add(s21);

		JLabel lblNewLabel_29_1 = new JLabel("S21");
		s21.add(lblNewLabel_29_1);

		JPanel g21 = new JPanel();
		g21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom21.getText();
				String obiekt = a_swiatlo21g.getText();
				String p = a_pobor21g.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart21g;
				JTextField czasstop = a_czasstop21g;
				JTextField identyfikacja = a_id21g;
				ZrodloGniazdo z = new ZrodloGniazdo();
				z.zrodlo_gniazdo(g21, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		g21.setBackground(Color.LIGHT_GRAY);
		g21.setBounds(57, 34, 10, 10);
		panel_40_1.add(g21);

		JLabel lblNewLabel_22_1_1 = new JLabel("G21");
		lblNewLabel_22_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_22_1_1.setBounds(46, 20, 21, 13);
		panel_40_1.add(lblNewLabel_22_1_1);

		JPanel panel_41_1 = new JPanel();
		panel_41_1.setLayout(null);
		panel_41_1.setBounds(10, 101, 143, 42);
		panel_6_2_1.add(panel_41_1);

		JPanel s22 = new JPanel();
		s22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom21.getText();
				String obiekt = a_swiatlo22.getText();
				String p = a_pobor22.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart22;
				JTextField czasstop = a_czasstop22;
				JTextField identyfikacja = a_id22;
				ZrodloSwiatlo z = new ZrodloSwiatlo();
				z.zrodlo_swiatlo(s22, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		s22.setBackground(Color.GRAY);
		s22.setBounds(65, 10, 21, 24);
		panel_41_1.add(s22);

		JLabel lblNewLabel_17_2_1 = new JLabel("S22");
		s22.add(lblNewLabel_17_2_1);

		JPanel g24 = new JPanel();
		g24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom21.getText();
				String obiekt = a_swiatlo24g.getText();
				String p = a_pobor24g.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart24g;
				JTextField czasstop = a_czasstop24g;
				JTextField identyfikacja = a_id24g;
				ZrodloGniazdo z = new ZrodloGniazdo();
				z.zrodlo_gniazdo(g24, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		g24.setBackground(Color.LIGHT_GRAY);
		g24.setBounds(93, 0, 10, 10);
		panel_41_1.add(g24);

		JLabel lblNewLabel_22_3_1 = new JLabel("G24");
		lblNewLabel_22_3_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_22_3_1.setBounds(108, 0, 21, 13);
		panel_41_1.add(lblNewLabel_22_3_1);

		JPanel panel_42_1 = new JPanel();
		panel_42_1.setLayout(null);
		panel_42_1.setBounds(163, 101, 52, 42);
		panel_6_2_1.add(panel_42_1);

		JPanel s23 = new JPanel();
		s23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom21.getText();
				String obiekt = a_swiatlo23.getText();
				String p = a_pobor23.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart23;
				JTextField czasstop = a_czasstop23;
				JTextField identyfikacja = a_id23;
				ZrodloSwiatlo z = new ZrodloSwiatlo();
				z.zrodlo_swiatlo(s23, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		s23.setBackground(Color.GRAY);
		s23.setBounds(10, 10, 21, 24);
		panel_42_1.add(s23);

		JLabel lblNewLabel_17_3_1 = new JLabel("S23");
		s23.add(lblNewLabel_17_3_1);

		JPanel g25 = new JPanel();
		g25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom21.getText();
				String obiekt = a_swiatlo25g.getText();
				String p = a_pobor25g.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart25g;
				JTextField czasstop = a_czasstop25g;
				JTextField identyfikacja = a_id25g;
				ZrodloGniazdo z = new ZrodloGniazdo();
				z.zrodlo_gniazdo(g25, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		g25.setBackground(Color.LIGHT_GRAY);
		g25.setBounds(42, 10, 10, 10);
		panel_42_1.add(g25);

		JLabel lblNewLabel_22_4_1 = new JLabel("G25");
		lblNewLabel_22_4_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_22_4_1.setBounds(31, 21, 21, 13);
		panel_42_1.add(lblNewLabel_22_4_1);

		JPanel panel_38_1 = new JPanel();
		panel_38_1.setLayout(null);
		panel_38_1.setBounds(87, 10, 128, 81);
		panel_6_2_1.add(panel_38_1);

		JPanel s26 = new JPanel();
		s26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom21.getText();
				String obiekt = a_swiatlo26.getText();
				String p = a_pobor26.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart26;
				JTextField czasstop = a_czasstop26;
				JTextField identyfikacja = a_id26;
				ZrodloSwiatlo z = new ZrodloSwiatlo();
				z.zrodlo_swiatlo(s26, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		s26.setBackground(Color.GRAY);
		s26.setBounds(50, 32, 21, 24);
		panel_38_1.add(s26);

		JLabel lblNewLabel_17_1_1 = new JLabel("S26");
		s26.add(lblNewLabel_17_1_1);

		JPanel g23 = new JPanel();
		g23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom21.getText();
				String obiekt = a_swiatlo23g.getText();
				String p = a_pobor23g.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart23g;
				JTextField czasstop = a_czasstop23g;
				JTextField identyfikacja = a_id23g;
				ZrodloGniazdo z = new ZrodloGniazdo();
				z.zrodlo_gniazdo(g23, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		g23.setBackground(Color.LIGHT_GRAY);
		g23.setBounds(118, 61, 10, 10);
		panel_38_1.add(g23);

		JLabel lblNewLabel_22_2_1 = new JLabel("G23");
		lblNewLabel_22_2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_22_2_1.setBounds(97, 58, 21, 13);
		panel_38_1.add(lblNewLabel_22_2_1);

		JPanel panel_39_1 = new JPanel();
		panel_39_1.setLayout(null);
		panel_39_1.setBounds(10, 153, 116, 61);
		panel_6_2_1.add(panel_39_1);

		JPanel s24 = new JPanel();
		s24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom21.getText();
				String obiekt = a_swiatlo24.getText();
				String p = a_pobor24.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart24;
				JTextField czasstop = a_czasstop24;
				JTextField identyfikacja = a_id24;
				ZrodloSwiatlo z = new ZrodloSwiatlo();
				z.zrodlo_swiatlo(s24, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		s24.setBackground(Color.GRAY);
		s24.setBounds(52, 22, 21, 24);
		panel_39_1.add(s24);

		JLabel lblNewLabel_17_4_1 = new JLabel("S24");
		s24.add(lblNewLabel_17_4_1);

		JPanel g26 = new JPanel();
		g26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_poziom21.getText();
				String obiekt = a_swiatlo26g.getText();
				String p = a_pobor26g.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_czasstart26g;
				JTextField czasstop = a_czasstop26g;
				JTextField identyfikacja = a_id26g;

				ZrodloGniazdo z = new ZrodloGniazdo();
				z.zrodlo_gniazdo(g26, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop);
			}
		});
		g26.setBackground(Color.LIGHT_GRAY);
		g26.setBounds(0, 22, 10, 10);
		panel_39_1.add(g26);

		JLabel lblNewLabel_22_5_1 = new JLabel("G26");
		lblNewLabel_22_5_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_22_5_1.setBounds(11, 22, 21, 13);
		panel_39_1.add(lblNewLabel_22_5_1);

		panel_5 = new JPanel();
		panel_5.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				String zero = a_o_temp0.getText();
				String jeden = a_o_temp1.getText();
				String dwa = a_o_temp2.getText();

				label0.setText("Temperatura dla Poziomu 0: " + zero);
				label1.setText("Temperatura dla Poziomu 1: " + jeden);
				label2.setText("Temperatura dla Poziomu 2: " + dwa);

			}
		});
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		panel_5.setBackground(Color.WHITE);
		tabbedPane.addTab("Ogrzewanie", null, panel_5, null);
		panel_5.setLayout(null);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(228, 351, 835, 254);
		panel_5.add(scrollPane_2);

		table_ogrzewanie = new JTable();
		scrollPane_2.setViewportView(table_ogrzewanie);

		panel_6_3 = new JPanel();
		panel_6_3.setLayout(null);
		panel_6_3.setBackground(Color.DARK_GRAY);
		panel_6_3.setBounds(99, 57, 225, 224);
		panel_5.add(panel_6_3);

		panel_49 = new JPanel();
		panel_49.setLayout(null);
		panel_49.setBounds(10, 153, 67, 61);
		panel_6_3.add(panel_49);

		o03 = new JPanel();
		o03.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_o_poziom0.getText();
				String obiekt = a_o_03.getText();
				String p = a_o_pobor03.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_o_czass03;
				JTextField czasstop = a_o_czasst03;
				JTextField identyfikacja = a_o_id03;
				JTextField temp_a = temp0;
				JTextField temp_p = a_o_temp0;
				OgrzewaniePoziom0 o0 = new OgrzewaniePoziom0();
				o0.ogrzewaj0(o03, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop, temp_a, temp_p);
			}
		});
		o03.setBackground(Color.GRAY);
		o03.setBounds(21, 51, 36, 10);
		panel_49.add(o03);

		lblNewLabel_33 = new JLabel("O03");
		lblNewLabel_33.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_33.setBounds(22, 38, 45, 13);
		panel_49.add(lblNewLabel_33);

		panel_50 = new JPanel();
		panel_50.setLayout(null);
		panel_50.setBounds(10, 10, 39, 134);
		panel_6_3.add(panel_50);

		panel_52 = new JPanel();
		panel_52.setLayout(null);
		panel_52.setBounds(87, 153, 78, 61);
		panel_6_3.add(panel_52);

		o04 = new JPanel();
		o04.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_o_poziom0.getText();
				String obiekt = a_o_04.getText();
				String p = a_o_pobor04.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_o_czass04;
				JTextField czasstop = a_o_czasst04;
				JTextField identyfikacja = a_o_id04;
				JTextField temp_a = temp0;
				JTextField temp_p = a_o_temp0;

				OgrzewaniePoziom0 o0 = new OgrzewaniePoziom0();
				o0.ogrzewaj0(o04, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop, temp_a, temp_p);
			}
		});
		o04.setBackground(Color.GRAY);
		o04.setBounds(32, 51, 36, 10);
		panel_52.add(o04);

		lblNewLabel_34 = new JLabel("O04");
		lblNewLabel_34.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_34.setBounds(32, 38, 45, 13);
		panel_52.add(lblNewLabel_34);

		panel_55 = new JPanel();
		panel_55.setLayout(null);
		panel_55.setBounds(60, 10, 155, 81);
		panel_6_3.add(panel_55);

		o01 = new JPanel();
		o01.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_o_poziom0.getText();
				String obiekt = a_o_01.getText();
				String p = a_o_pobor01.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_o_czass01;
				JTextField czasstop = a_o_czasst01;
				JTextField identyfikacja = a_o_id01;
				JTextField temp_a = temp0;
				JTextField temp_p = a_o_temp0;
				OgrzewaniePoziom0 o0 = new OgrzewaniePoziom0();
				o0.ogrzewaj0(o01, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop, temp_a, temp_p);
			}
		});
		o01.setBackground(Color.GRAY);
		o01.setBounds(109, 71, 36, 10);
		panel_55.add(o01);

		lblNewLabel_5 = new JLabel("O01");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(110, 58, 45, 13);
		panel_55.add(lblNewLabel_5);

		o02 = new JPanel();
		o02.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_o_poziom0.getText();
				String obiekt = a_o_02.getText();
				String p = a_o_pobor02.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_o_czass02;
				JTextField czasstop = a_o_czasst02;
				JTextField identyfikacja = a_o_id02;
				JTextField temp_a = temp0;
				JTextField temp_p = a_o_temp0;
				OgrzewaniePoziom0 o0 = new OgrzewaniePoziom0();
				o0.ogrzewaj0(o02, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop, temp_a, temp_p);
			}
		});
		o02.setBounds(59, 101, 36, 10);
		panel_6_3.add(o02);
		o02.setBackground(Color.GRAY);

		panel_54 = new JPanel();
		panel_54.setLayout(null);
		panel_54.setBounds(176, 101, 39, 113);
		panel_6_3.add(panel_54);

		panel_51 = new JPanel();
		panel_51.setLayout(null);
		panel_51.setBounds(47, 101, 132, 42);
		panel_6_3.add(panel_51);

		temp0 = new JTextField();
		temp0.setText("15");
		temp0.setHorizontalAlignment(SwingConstants.CENTER);
		temp0.setFont(new Font("Tahoma", Font.BOLD, 14));
		temp0.setBounds(62, 10, 36, 22);
		panel_51.add(temp0);

		lblNewLabel_32 = new JLabel("O02");
		lblNewLabel_32.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_32.setBounds(10, 10, 45, 13);
		panel_51.add(lblNewLabel_32);

		panel_6_4 = new JPanel();
		panel_6_4.setLayout(null);
		panel_6_4.setBackground(Color.DARK_GRAY);
		panel_6_4.setBounds(517, 57, 225, 224);
		panel_5.add(panel_6_4);

		panel_57 = new JPanel();
		panel_57.setLayout(null);
		panel_57.setBounds(136, 153, 79, 61);
		panel_6_4.add(panel_57);

		o16 = new JPanel();
		o16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_o_poziom1.getText();
				String obiekt = a_o_16.getText();
				String p = a_o_pobor16.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_o_czass16;
				JTextField czasstop = a_o_czasst16;
				JTextField identyfikacja = a_o_id16;
				JTextField temp_a = temp1;
				JTextField temp_p = a_o_temp1;
				OgrzewaniePoziom1 o1 = new OgrzewaniePoziom1();
				o1.ogrzewaj1(o16, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop, temp_a, temp_p);
			}
		});
		o16.setBackground(Color.GRAY);
		o16.setBounds(24, 51, 36, 10);
		panel_57.add(o16);

		JLabel lblNewLabel_5_6 = new JLabel("O16");
		lblNewLabel_5_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_6.setBounds(15, 38, 45, 13);
		panel_57.add(lblNewLabel_5_6);

		panel_58 = new JPanel();
		panel_58.setLayout(null);
		panel_58.setBounds(10, 10, 67, 81);
		panel_6_4.add(panel_58);

		o11 = new JPanel();
		o11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_o_poziom1.getText();
				String obiekt = a_o_11.getText();
				String p = a_o_pobor11.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_o_czass11;
				JTextField czasstop = a_o_czasst11;
				JTextField identyfikacja = a_o_id11;
				JTextField temp_a = temp1;
				JTextField temp_p = a_o_temp1;
				OgrzewaniePoziom1 o1 = new OgrzewaniePoziom1();
				o1.ogrzewaj1(o11, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop, temp_a, temp_p);
			}
		});
		o11.setBackground(Color.GRAY);
		o11.setBounds(10, 0, 36, 10);
		panel_58.add(o11);

		JLabel lblNewLabel_5_1 = new JLabel("O11");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setBounds(1, 10, 45, 13);
		panel_58.add(lblNewLabel_5_1);

		panel_59 = new JPanel();
		panel_59.setLayout(null);
		panel_59.setBounds(10, 101, 143, 42);
		panel_6_4.add(panel_59);

		o13 = new JPanel();
		o13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_o_poziom1.getText();
				String obiekt = a_o_13.getText();
				String p = a_o_pobor13.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_o_czass13;
				JTextField czasstop = a_o_czasst13;
				JTextField identyfikacja = a_o_id13;
				JTextField temp_a = temp1;
				JTextField temp_p = a_o_temp1;
				OgrzewaniePoziom1 o1 = new OgrzewaniePoziom1();
				o1.ogrzewaj1(o13, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop, temp_a, temp_p);
			}
		});
		o13.setBackground(Color.GRAY);
		o13.setBounds(23, 32, 36, 10);
		panel_59.add(o13);

		temp1 = new JTextField();
		temp1.setText("18");
		temp1.setHorizontalAlignment(SwingConstants.CENTER);
		temp1.setFont(new Font("Tahoma", Font.BOLD, 14));
		temp1.setColumns(10);
		temp1.setBounds(85, 10, 36, 22);
		panel_59.add(temp1);

		JLabel lblNewLabel_5_3 = new JLabel("O13");
		lblNewLabel_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3.setBounds(23, 17, 45, 13);
		panel_59.add(lblNewLabel_5_3);

		panel_60 = new JPanel();
		panel_60.setLayout(null);
		panel_60.setBounds(163, 101, 52, 42);
		panel_6_4.add(panel_60);

		o14 = new JPanel();
		o14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_o_poziom1.getText();
				String obiekt = a_o_14.getText();
				String p = a_o_pobor14.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_o_czass14;
				JTextField czasstop = a_o_czasst14;
				JTextField identyfikacja = a_o_id14;
				JTextField temp_a = temp1;
				JTextField temp_p = a_o_temp1;
				OgrzewaniePoziom1 o1 = new OgrzewaniePoziom1();
				o1.ogrzewaj1(o14, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop, temp_a, temp_p);
			}
		});
		o14.setBackground(Color.GRAY);
		o14.setBounds(10, 32, 36, 10);
		panel_60.add(o14);

		JLabel lblNewLabel_5_4 = new JLabel("O14");
		lblNewLabel_5_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_4.setBounds(10, 19, 45, 13);
		panel_60.add(lblNewLabel_5_4);

		panel_61 = new JPanel();
		panel_61.setLayout(null);
		panel_61.setBounds(87, 10, 128, 81);
		panel_6_4.add(panel_61);

		o12 = new JPanel();
		o12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_o_poziom1.getText();
				String obiekt = a_o_12.getText();
				String p = a_o_pobor12.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_o_czass12;
				JTextField czasstop = a_o_czasst12;
				JTextField identyfikacja = a_o_id12;
				JTextField temp_a = temp1;
				JTextField temp_p = a_o_temp1;
				OgrzewaniePoziom1 o1 = new OgrzewaniePoziom1();
				o1.ogrzewaj1(o12, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop, temp_a, temp_p);
			}
		});
		o12.setBackground(Color.GRAY);
		o12.setBounds(39, 0, 36, 10);
		panel_61.add(o12);

		JLabel lblNewLabel_5_2 = new JLabel("O12");
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2.setBounds(39, 10, 45, 13);
		panel_61.add(lblNewLabel_5_2);

		o15 = new JPanel();
		o15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_o_poziom1.getText();
				String obiekt = a_o_15.getText();
				String p = a_o_pobor15.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_o_czass15;
				JTextField czasstop = a_o_czasst15;
				JTextField identyfikacja = a_o_id15;
				JTextField temp_a = temp1;
				JTextField temp_p = a_o_temp1;
				OgrzewaniePoziom1 o1 = new OgrzewaniePoziom1();
				o1.ogrzewaj1(o15, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop, temp_a, temp_p);
			}
		});
		o15.setBackground(Color.GRAY);
		o15.setBounds(48, 204, 36, 10);
		panel_6_4.add(o15);

		panel_62 = new JPanel();
		panel_62.setLayout(null);
		panel_62.setBounds(10, 153, 116, 61);
		panel_6_4.add(panel_62);

		JLabel lblNewLabel_5_5 = new JLabel("O15");
		lblNewLabel_5_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5.setBounds(32, 38, 45, 13);
		panel_62.add(lblNewLabel_5_5);

		panel_6_5 = new JPanel();
		panel_6_5.setLayout(null);
		panel_6_5.setBackground(Color.DARK_GRAY);
		panel_6_5.setBounds(974, 57, 225, 224);
		panel_5.add(panel_6_5);

		panel_53 = new JPanel();
		panel_53.setLayout(null);
		panel_53.setBounds(136, 153, 79, 61);
		panel_6_5.add(panel_53);

		o25 = new JPanel();
		o25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_o_poziom2.getText();
				String obiekt = a_o_25.getText();
				String p = a_o_pobor25.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_o_czass25;
				JTextField czasstop = a_o_czasst25;
				JTextField identyfikacja = a_o_id25;
				JTextField temp_a = temp2;
				JTextField temp_p = a_o_temp2;
				OgrzewaniePoziom2 o2 = new OgrzewaniePoziom2();
				o2.ogrzewaj2(o25, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop, temp_a, temp_p);
			}
		});
		o25.setBackground(Color.GRAY);
		o25.setBounds(24, 51, 36, 10);
		panel_53.add(o25);

		JLabel lblNewLabel_5_7_4 = new JLabel("O25");
		lblNewLabel_5_7_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_7_4.setBounds(24, 38, 45, 13);
		panel_53.add(lblNewLabel_5_7_4);

		panel_63 = new JPanel();
		panel_63.setLayout(null);
		panel_63.setBounds(10, 10, 67, 81);
		panel_6_5.add(panel_63);

		panel_64 = new JPanel();
		panel_64.setLayout(null);
		panel_64.setBounds(10, 101, 143, 42);
		panel_6_5.add(panel_64);

		o22 = new JPanel();
		o22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_o_poziom2.getText();
				String obiekt = a_o_22.getText();
				String p = a_o_pobor22.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_o_czass22;
				JTextField czasstop = a_o_czasst22;
				JTextField identyfikacja = a_o_id22;
				JTextField temp_a = temp2;
				JTextField temp_p = a_o_temp2;
				OgrzewaniePoziom2 o2 = new OgrzewaniePoziom2();
				o2.ogrzewaj2(o22, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop, temp_a, temp_p);
			}
		});
		o22.setBackground(Color.GRAY);
		o22.setBounds(23, 32, 36, 10);
		panel_64.add(o22);

		temp2 = new JTextField();
		temp2.setText("17");
		temp2.setHorizontalAlignment(SwingConstants.CENTER);
		temp2.setFont(new Font("Tahoma", Font.BOLD, 14));
		temp2.setColumns(10);
		temp2.setBounds(84, 10, 36, 22);
		panel_64.add(temp2);

		JLabel lblNewLabel_5_7_1 = new JLabel("O22");
		lblNewLabel_5_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_7_1.setBounds(23, 17, 45, 13);
		panel_64.add(lblNewLabel_5_7_1);

		panel_65 = new JPanel();
		panel_65.setLayout(null);
		panel_65.setBounds(163, 101, 52, 42);
		panel_6_5.add(panel_65);

		o23 = new JPanel();
		o23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_o_poziom2.getText();
				String obiekt = a_o_23.getText();
				String p = a_o_pobor23.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_o_czass23;
				JTextField czasstop = a_o_czasst23;
				JTextField identyfikacja = a_o_id23;
				JTextField temp_a = temp2;
				JTextField temp_p = a_o_temp2;
				OgrzewaniePoziom2 o2 = new OgrzewaniePoziom2();
				o2.ogrzewaj2(o23, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop, temp_a, temp_p);
			}
		});
		o23.setBackground(Color.GRAY);
		o23.setBounds(10, 32, 36, 10);
		panel_65.add(o23);

		JLabel lblNewLabel_5_7_2 = new JLabel("O23");
		lblNewLabel_5_7_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_7_2.setBounds(10, 19, 45, 13);
		panel_65.add(lblNewLabel_5_7_2);

		panel_66 = new JPanel();
		panel_66.setLayout(null);
		panel_66.setBounds(87, 10, 128, 81);
		panel_6_5.add(panel_66);

		o21 = new JPanel();
		o21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_o_poziom2.getText();
				String obiekt = a_o_21.getText();
				String p = a_o_pobor21.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_o_czass21;
				JTextField czasstop = a_o_czasst21;
				JTextField identyfikacja = a_o_id21;
				JTextField temp_a = temp2;
				JTextField temp_p = a_o_temp2;
				OgrzewaniePoziom2 o2 = new OgrzewaniePoziom2();
				o2.ogrzewaj2(o21, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop, temp_a, temp_p);
			}
		});
		o21.setBackground(Color.GRAY);
		o21.setBounds(39, 0, 36, 10);
		panel_66.add(o21);

		lblNewLabel_5_7 = new JLabel("O21");
		lblNewLabel_5_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_7.setBounds(39, 10, 45, 13);
		panel_66.add(lblNewLabel_5_7);

		o24 = new JPanel();
		o24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String poziom = a_o_poziom2.getText();
				String obiekt = a_o_24.getText();
				String p = a_o_pobor24.getText();
				double pobor = Double.valueOf(p);
				JTextField czasstart = a_o_czass24;
				JTextField czasstop = a_o_czasst24;
				JTextField identyfikacja = a_o_id24;
				JTextField temp_a = temp2;
				JTextField temp_p = a_o_temp2;
				OgrzewaniePoziom2 o2 = new OgrzewaniePoziom2();
				o2.ogrzewaj2(o24, poziom, obiekt, identyfikacja, pobor, czasstart, czasstop, temp_a, temp_p);
			}
		});
		o24.setBackground(Color.GRAY);
		o24.setBounds(48, 204, 36, 10);
		panel_6_5.add(o24);

		panel_67 = new JPanel();
		panel_67.setLayout(null);
		panel_67.setBounds(10, 153, 116, 61);
		panel_6_5.add(panel_67);

		JLabel lblNewLabel_5_7_3 = new JLabel("O24");
		lblNewLabel_5_7_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_7_3.setBounds(36, 38, 45, 13);
		panel_67.add(lblNewLabel_5_7_3);

		label0 = new JLabel("Temperatura dla Poziomu 0:");
		label0.setFont(new Font("Tahoma", Font.BOLD, 14));
		label0.setHorizontalAlignment(SwingConstants.CENTER);
		label0.setBounds(68, 291, 281, 22);
		panel_5.add(label0);

		label1 = new JLabel("Temperatura dla Poziomu 1:");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label1.setBounds(492, 291, 281, 22);
		panel_5.add(label1);

		label2 = new JLabel("Temperatura dla Poziomu 2:");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label2.setBounds(950, 291, 281, 22);
		panel_5.add(label2);

		el_p0_3 = new JLabel("Poziom 0  ");
		el_p0_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		el_p0_3.setBounds(99, 33, 225, 13);
		panel_5.add(el_p0_3);

		el_p0_4 = new JLabel("Poziom 1");
		el_p0_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		el_p0_4.setBounds(517, 34, 225, 13);
		panel_5.add(el_p0_4);

		el_p0_5 = new JLabel("Poziom 2");
		el_p0_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		el_p0_5.setBounds(974, 34, 225, 13);
		panel_5.add(el_p0_5);

		p_ustawienia = new JPanel();
		p_ustawienia.setBackground(Color.WHITE);
		p_ustawienia.setBounds(191, 75, 1345, 671);
		frame.getContentPane().add(p_ustawienia);
		p_ustawienia.setLayout(null);

		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(25, 10, 1310, 633);
		p_ustawienia.add(tabbedPane_2);

		JPanel panel_46 = new JPanel();
		panel_46.setBackground(Color.WHITE);
		tabbedPane_2.addTab("Elektryczno\u015B\u0107", null, panel_46, null);
		panel_46.setLayout(null);

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(197, 10, 728, 532);
		panel_46.add(scrollPane_4);

		table_raport_e = new JTable();
		scrollPane_4.setViewportView(table_raport_e);

		JButton btnNewButton_1_2 = new JButton("Ok");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					WykresElektrycznosc.wykres();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_2.setBounds(1138, 421, 85, 21);
		panel_46.add(btnNewButton_1_2);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Rok", "Obiekt" }));
		comboBox.setBounds(1000, 421, 121, 21);
		panel_46.add(comboBox);

		panel_48 = new JPanel();
		panel_48.setBorder(new TitledBorder(null, "Generowanie wykresu koszt\u00F3w", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel_48.setBounds(935, 10, 360, 532);
		panel_46.add(panel_48);

		rok_e = new JComboBox();
		rok_e.setModel(new DefaultComboBoxModel(new String[] { "-- Rok --" }));
		rok_e.setBounds(23, 41, 112, 21);
		panel_46.add(rok_e);

		miesiac_e = new JComboBox();
		miesiac_e.setModel(new DefaultComboBoxModel(new String[] { "-- Miesi\u0105c --" }));
		miesiac_e.setBounds(23, 72, 112, 21);
		panel_46.add(miesiac_e);

		obiekt_e = new JComboBox();
		obiekt_e.setModel(new DefaultComboBoxModel(new String[] { "-- Obiekt --" }));
		obiekt_e.setBounds(23, 103, 112, 21);
		panel_46.add(obiekt_e);

		btnNewButton_2 = new JButton("Ok");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FiltrE.filtrowanie();
			}
		});
		btnNewButton_2.setBounds(38, 162, 85, 21);
		panel_46.add(btnNewButton_2);

		panel_1 = new JPanel();
		panel_1.setBorder(
				new TitledBorder(null, "Filtrowanie danych", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 10, 138, 189);
		panel_46.add(panel_1);

		btnNewButton_1_4 = new JButton("Reset danych tabeli");
		btnNewButton_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RaportOdswiezElektrycznosc.odswiezElektrycznoscRaport();
			}
		});
		btnNewButton_1_4.setBounds(490, 560, 161, 21);
		panel_46.add(btnNewButton_1_4);

		JPanel panel_47 = new JPanel();
		panel_47.setBackground(Color.WHITE);
		tabbedPane_2.addTab("Ogrzewanie", null, panel_47, null);
		panel_47.setLayout(null);

		JPanel panel_46_1 = new JPanel();
		panel_46_1.setBackground(Color.WHITE);
		panel_46_1.setLayout(null);
		panel_46_1.setBounds(0, 0, 1305, 552);
		panel_47.add(panel_46_1);

		btnNewButton_1_1 = new JButton("Ok");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				WykresOgrzewanie.wykres_o();
			}
		});
		btnNewButton_1_1.setBounds(1138, 421, 85, 21);
		panel_46_1.add(btnNewButton_1_1);

		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "Rok", "Obiekt" }));
		comboBox_1.setBounds(1000, 421, 121, 21);
		panel_46_1.add(comboBox_1);

		JPanel panel_48_1 = new JPanel();
		panel_48_1.setBorder(new TitledBorder(null, "Generowanie wykresu koszt\u00F3w", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel_48_1.setBounds(935, 10, 360, 532);
		panel_46_1.add(panel_48_1);

		rok_o = new JComboBox();
		rok_o.setModel(new DefaultComboBoxModel(new String[] { "--Rok--" }));
		rok_o.setBounds(23, 41, 112, 21);
		panel_46_1.add(rok_o);

		miesiac_o = new JComboBox();
		miesiac_o.setModel(new DefaultComboBoxModel(new String[] { "--Miesi\u0105c--" }));
		miesiac_o.setBounds(23, 72, 112, 21);
		panel_46_1.add(miesiac_o);

		obiekt_o = new JComboBox();
		obiekt_o.setModel(new DefaultComboBoxModel(new String[] { "--Obiekt--" }));
		obiekt_o.setBounds(23, 103, 112, 21);
		panel_46_1.add(obiekt_o);

		JButton btnNewButton_2_1 = new JButton("Ok");
		btnNewButton_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				FiltrO.filtrowanie();
			}
		});
		btnNewButton_2_1.setBounds(38, 162, 85, 21);
		panel_46_1.add(btnNewButton_2_1);

		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(197, 10, 728, 532);
		panel_46_1.add(scrollPane_6);

		table_ogrzewanie_r = new JTable();
		scrollPane_6.setViewportView(table_ogrzewanie_r);

		panel_2 = new JPanel();
		panel_2.setBorder(
				new TitledBorder(null, "Filtrowanie danych", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 10, 138, 189);
		panel_46_1.add(panel_2);

		btnNewButton_1_3 = new JButton("Reset danych tabeli");
		btnNewButton_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				RaportOdsiwezOgrzewanie.odsiwezOgrzewanieRaport();
			}
		});
		btnNewButton_1_3.setBounds(490, 560, 161, 21);
		panel_47.add(btnNewButton_1_3);

		panel_20 = new JPanel();
		panel_20.setBackground(Color.WHITE);
		tabbedPane_2.addTab("Zestawienie ", null, panel_20, null);
		panel_20.setLayout(null);

		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(27, 119, 387, 126);
		panel_20.add(scrollPane_7);

		koszty_rok = new JTable();
		scrollPane_7.setViewportView(koszty_rok);

		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(27, 268, 387, 126);
		panel_20.add(scrollPane_8);

		koszty_miesiac = new JTable();
		scrollPane_8.setViewportView(koszty_miesiac);

		scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(27, 416, 387, 126);
		panel_20.add(scrollPane_9);

		koszty_obiekt = new JTable();
		scrollPane_9.setViewportView(koszty_obiekt);

		scrollPane_11 = new JScrollPane();
		scrollPane_11.setBounds(453, 52, 387, 49);
		panel_20.add(scrollPane_11);

		pomiary_o = new JTable();
		scrollPane_11.setViewportView(pomiary_o);

		scrollPane_12 = new JScrollPane();
		scrollPane_12.setBounds(453, 120, 387, 126);
		panel_20.add(scrollPane_12);

		koszty_rok_o = new JTable();
		scrollPane_12.setViewportView(koszty_rok_o);

		scrollPane_13 = new JScrollPane();
		scrollPane_13.setBounds(453, 269, 387, 126);
		panel_20.add(scrollPane_13);

		koszty_miesiac_o = new JTable();
		scrollPane_13.setViewportView(koszty_miesiac_o);

		lblNewLabel_23 = new JLabel("Zestawienie koszt\u00F3w poboru pr\u0105du:");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_23.setBounds(27, 20, 387, 21);
		panel_20.add(lblNewLabel_23);

		lblNewLabel_28 = new JLabel("Zestawienie koszt\u00F3w poboru ciep\u0142a:");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_28.setBounds(453, 21, 387, 21);
		panel_20.add(lblNewLabel_28);

		scrollPane_10 = new JScrollPane();
		scrollPane_10.setBounds(27, 52, 387, 49);
		panel_20.add(scrollPane_10);

		pomiary = new JTable();
		scrollPane_10.setViewportView(pomiary);

		scrollPane_14 = new JScrollPane();
		scrollPane_14.setBounds(453, 417, 387, 126);
		panel_20.add(scrollPane_14);

		koszty_obiekt_o = new JTable();
		scrollPane_14.setViewportView(koszty_obiekt_o);

		p_bazadanych = new JPanel();
		p_bazadanych.setBackground(new Color(119, 136, 153));
		p_bazadanych.setBounds(191, 744, 1362, 76);
		frame.getContentPane().add(p_bazadanych);
		p_bazadanych.setLayout(null);

		lblNewLabel = new JLabel("PL");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(1268, 10, 62, 26);
		p_bazadanych.add(lblNewLabel);

		lblSql = new JLabel("SQL");
		lblSql.setBackground(Color.WHITE);
		lblSql.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSql.setForeground(new Color(0, 255, 0));
		lblSql.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSql.setBounds(1196, 10, 62, 26);
		p_bazadanych.add(lblSql);

		p_wyloguj = new JPanel();
		p_wyloguj.setBackground(Color.WHITE);
		p_wyloguj.setBounds(191, 75, 1345, 671);
		frame.getContentPane().add(p_wyloguj);
		p_wyloguj.setLayout(null);

		JPanel panel_22 = new JPanel();
		panel_22.setBounds(268, 188, 566, 214);
		p_wyloguj.add(panel_22);
		panel_22.setLayout(null);

		JLabel lblNewLabel_36 = new JLabel("Czy chcesz zamkn\u0105\u0107 aplikacj\u0119?");
		lblNewLabel_36.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_36.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_36.setBounds(33, 54, 512, 25);
		panel_22.add(lblNewLabel_36);

		JButton btnNewButton_4 = new JButton("Anuluj");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuStart menuStart = new MenuStart();
				menuStart.menuStart();
			}
		});
		btnNewButton_4.setBounds(300, 124, 85, 21);
		panel_22.add(btnNewButton_4);

		JButton btnNewButton_4_1 = new JButton("Ok");
		btnNewButton_4_1.setBounds(205, 124, 85, 21);
		panel_22.add(btnNewButton_4_1);
		p_danelogowania.setBounds(0, 0, 1553, 76);
		frame.getContentPane().add(p_danelogowania);
		p_danelogowania.setLayout(null);

		lbl_czas = new JLabel("03-04-2022 14:45:12");
		lbl_czas.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_czas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_czas.setForeground(Color.WHITE);
		lbl_czas.setBounds(1205, 10, 176, 56);
		p_danelogowania.add(lbl_czas);

		lbl_administrator = new JLabel("Administrator");
		lbl_administrator.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_administrator.setForeground(Color.WHITE);
		lbl_administrator.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_administrator.setBounds(1391, 10, 127, 56);
		p_danelogowania.add(lbl_administrator);

		JPanel panel_70 = new JPanel();
		panel_70.setBorder(new TitledBorder(null, "Odczyt ze stacji meteorologicznej", TitledBorder.LEADING,
				TitledBorder.TOP, null, Color.WHITE));
		panel_70.setBounds(10, 10, 951, 56);
		panel_70.setBackground(new Color(47, 79, 79));
		p_danelogowania.add(panel_70);
		panel_70.setLayout(null);

		lblNewLabel_7 = new JLabel("Temp. (st. C):");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(10, 10, 90, 36);
		panel_70.add(lblNewLabel_7);

		meteo_temp = new JLabel();
		meteo_temp.setHorizontalAlignment(SwingConstants.LEFT);
		meteo_temp.setText("---");
		meteo_temp.setForeground(Color.WHITE);
		meteo_temp.setFont(new Font("Tahoma", Font.BOLD, 14));
		meteo_temp.setBounds(110, 14, 29, 28);
		meteo_temp.setBackground(new Color(47, 79, 79));
		panel_70.add(meteo_temp);

		meteo_zachm = new JLabel();
		meteo_zachm.setText("---");
		meteo_zachm.setHorizontalAlignment(SwingConstants.LEFT);
		meteo_zachm.setForeground(Color.WHITE);
		meteo_zachm.setFont(new Font("Tahoma", Font.BOLD, 14));
		meteo_zachm.setBackground(new Color(47, 79, 79));
		meteo_zachm.setBounds(270, 14, 29, 28);
		panel_70.add(meteo_zachm);

		lblNewLabel_10 = new JLabel("|  Zachm.:(%):");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(149, 10, 111, 36);
		panel_70.add(lblNewLabel_10);

		lblNewLabel_11 = new JLabel("|  Wilg.:(%):");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(309, 10, 90, 36);
		panel_70.add(lblNewLabel_11);

		meteo_wilg = new JLabel();
		meteo_wilg.setText("---");
		meteo_wilg.setHorizontalAlignment(SwingConstants.LEFT);
		meteo_wilg.setForeground(Color.WHITE);
		meteo_wilg.setFont(new Font("Tahoma", Font.BOLD, 14));
		meteo_wilg.setBackground(new Color(47, 79, 79));
		meteo_wilg.setBounds(409, 14, 29, 28);
		panel_70.add(meteo_wilg);

		lblNewLabel_12 = new JLabel("|  Opady (mm):");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_12.setForeground(Color.WHITE);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(448, 10, 111, 36);
		panel_70.add(lblNewLabel_12);

		meteo_opad = new JLabel();
		meteo_opad.setText("---");
		meteo_opad.setHorizontalAlignment(SwingConstants.LEFT);
		meteo_opad.setForeground(Color.WHITE);
		meteo_opad.setFont(new Font("Tahoma", Font.BOLD, 14));
		meteo_opad.setBackground(new Color(47, 79, 79));
		meteo_opad.setBounds(569, 14, 29, 28);
		panel_70.add(meteo_opad);

		lblNewLabel_13 = new JLabel("|  Wiatr (km/h):");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_13.setBounds(608, 10, 102, 36);
		panel_70.add(lblNewLabel_13);

		meteo_wiatr = new JLabel();
		meteo_wiatr.setText("---");
		meteo_wiatr.setHorizontalAlignment(SwingConstants.LEFT);
		meteo_wiatr.setForeground(Color.WHITE);
		meteo_wiatr.setFont(new Font("Tahoma", Font.BOLD, 14));
		meteo_wiatr.setBackground(new Color(47, 79, 79));
		meteo_wiatr.setBounds(720, 14, 29, 28);
		panel_70.add(meteo_wiatr);

		lblNewLabel_14 = new JLabel("|  Ci\u015B. atm. (hPa):");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_14.setForeground(Color.WHITE);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_14.setBounds(759, 10, 117, 36);
		panel_70.add(lblNewLabel_14);

		meteo_cisn = new JLabel();
		meteo_cisn.setText("---");
		meteo_cisn.setHorizontalAlignment(SwingConstants.LEFT);
		meteo_cisn.setForeground(Color.WHITE);
		meteo_cisn.setFont(new Font("Tahoma", Font.BOLD, 14));
		meteo_cisn.setBackground(new Color(47, 79, 79));
		meteo_cisn.setBounds(886, 14, 55, 28);
		panel_70.add(meteo_cisn);

		panel_71 = new JPanel();
		panel_71.setLayout(null);
		panel_71.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Tryb pracy", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_71.setBackground(new Color(47, 79, 79));
		panel_71.setBounds(971, 10, 107, 56);
		p_danelogowania.add(panel_71);

		lblNewLabel_8 = new JLabel("Manualny");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(10, 10, 87, 36);
		panel_71.add(lblNewLabel_8);

		panel_72 = new JPanel();
		panel_72.setLayout(null);
		panel_72.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Lokalizacja", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_72.setBackground(new Color(47, 79, 79));
		panel_72.setBounds(1088, 10, 107, 56);
		p_danelogowania.add(panel_72);

		lblNewLabel_9 = new JLabel("Wroc\u0142aw");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(10, 10, 87, 36);
		panel_72.add(lblNewLabel_9);

		panel_73 = new JPanel();
		panel_73.setLayout(null);
		panel_73.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Dane logowania", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_73.setBackground(new Color(47, 79, 79));
		panel_73.setBounds(1205, 10, 313, 56);
		p_danelogowania.add(panel_73);

		JPanel p_menu = new JPanel();
		p_menu.setBackground(new Color(47, 79, 79));
		p_menu.setBounds(0, 75, 192, 730);
		frame.getContentPane().add(p_menu);
		p_menu.setLayout(null);

		panel_ustawienia = new JPanel();
		panel_ustawienia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuUstawienia m = new MenuUstawienia();
				m.menuUstawienia();
			}
		});

		panel_ustawienia.setBackground(new Color(47, 79, 79));
		panel_ustawienia.setBounds(0, 57, 192, 56);
		p_menu.add(panel_ustawienia);
		panel_ustawienia.setLayout(null);

		lbl_ustawienia = new JLabel("Raport");
		lbl_ustawienia.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_ustawienia.setForeground(Color.WHITE);
		lbl_ustawienia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_ustawienia.setBounds(10, 10, 172, 36);
		panel_ustawienia.add(lbl_ustawienia);

		panel_wyloguj = new JPanel();
		panel_wyloguj.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuWyloguj.menuWyloguj();
			}
		});
		panel_wyloguj.setBackground(new Color(47, 79, 79));
		panel_wyloguj.setBounds(0, 173, 192, 56);
		p_menu.add(panel_wyloguj);
		panel_wyloguj.setLayout(null);

		lbl_wyloguj = new JLabel("Wyloguj");
		lbl_wyloguj.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_wyloguj.setForeground(Color.WHITE);
		lbl_wyloguj.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_wyloguj.setBounds(10, 10, 172, 36);
		panel_wyloguj.add(lbl_wyloguj);

		panel_admin = new JPanel();
		panel_admin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuAdmin a = new MenuAdmin();
				a.menuAdmin();
			}
		});
		panel_admin.setLayout(null);
		panel_admin.setBackground(new Color(47, 79, 79));
		panel_admin.setBounds(0, 114, 192, 56);
		p_menu.add(panel_admin);

		lbl_admin = new JLabel("Admin");
		lbl_admin.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_admin.setForeground(Color.WHITE);
		lbl_admin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_admin.setBounds(10, 10, 172, 36);
		panel_admin.add(lbl_admin);

		panel_start = new JPanel();
		panel_start.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuStart menuStart = new MenuStart();
				menuStart.menuStart();

			}
		});

		panel_start.setBounds(0, 0, 205, 56);
		p_menu.add(panel_start);
		panel_start.setBackground(Color.WHITE);
		panel_start.setLayout(null);

		lbl_start = new JLabel("START");
		lbl_start.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_start.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_start.setForeground(new Color(47, 79, 79));
		lbl_start.setBounds(10, 10, 172, 36);
		panel_start.add(lbl_start);

		MenuStart menuStart = new MenuStart();
		menuStart.menuStart();

	}
}
