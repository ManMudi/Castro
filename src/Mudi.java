import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.poi.hslf.blip.Metafile.Header;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.Border;


import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.layout.element.Text;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.Barcode;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.lowagie.text.Element;
import net.proteanit.sql.DbUtils;

public class Mudi extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel p,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,pana,pana1,pana2,pana3,pana4,p11,panel,panel1,panel2,pana5,pana6,pana7,pana8,pana9,pana10,pana11,pana12,pana13,pana14,pana15,panel4;
	private JLabel label7,label77,le,lc,la,l67,l68,l69,l70,ll,ll1,ll2,ll3,label2,label3,ll7,ll17;
	private JLabel label,l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l17,l18,l19,l20,l21,l22,l23,l27,l28,l29,l30,l31,l32,l33,l37,l38,l39,l40,l41,l42,l43,l50,l51,l52,l53,l54,l55,l56;
	private JTextField field,t0,t1,t2,t7,t8,t9,t10,t11,t12,t13,t17,t18,t19,t20,t21,t22,t23,t27,t28,t29,t30,t31,t32,t33,t37,t38,t39,t40,t41,t42,t43,t50,t51,t52;
	@SuppressWarnings("rawtypes")
	private JLabel la1,la2,la3,la4,la5,la6,la7,la8,la9,la10,la11,la12,la13,la14,la15,la16,la17,la18,la19,la20,la21,la22,la23,la24,la25,la26,la27,la28,la29,la30;
	private JTextField ta1,ta2,ta3,ta4,ta5,ta6,ta7,ta8,ta9,ta10,ta11,ta12,ta13,ta14,ta15,ta16,ta17,ta18,ta19,ta20,ta21,ta22,ta23,ta24,ta25,ta26,ta27,ta28,ta29,ta30; 
	private JLabel la31,la32,la33,la34,la35,la36,la37,la38,la39,la40,la41,la42,la43,la44,la45,la46,lan1;
	private JTextField ta31,ta32,ta33,ta34,ta35,ta36,ta37,ta38,ta39,ta40,ta41,ta42,ta43,ta44,ta45,ta46;
	private JComboBox<String> t3,t4,t5,t6,t56,t54,t55,t53,box5,box55,et,ct,ac,box67,box68,box69,box70,box71,box72,box73,box74,box75,box76,box2,sch,tt7,tt17,boxn;
	private JPanel panel3,pa1,pa2,pa3,pa4,pa5;
	private Double grade1,grade2,grade3,grade4,grade5,grade6,grade7,grade8,grade9,grade10,grade11,grade12,grade13,grade14;
	private String grad1,grad2,grad3,grad4,grad5,grad6,grad7,grad8,grad9,grad10,grad11,grad12,grad13,grad14;
	private Double grd1,grd2,grd3,grd4,grd5,grd6,grd7,grd8,grd9,grd10,grd11,grd12,grd13,grd14;
	private String[]name1={"M","F"};
	private String[]name2={"FORM V","FORM VI"};
	private String[]name7={"FIRST TERM","SECOND TERM"};
	private String[]name3={"PCM","PCB","PGM","CBG"};
	private String[]name4={"WEEKLY","MONTHLY","MID-TERM","TERMINAL","ANNUAL ","MOCK","PRE-NECTA","FINAL","SUPPLEMENTARY"}; 
	private String[]name6={"FIDEL CASTRO","MADUNGU","SHAMIANI","MOH'D PINDUA","UTAANI","CHASASA","UWELENI","CCK","MCH..MDOGO"};
	private JButton b1,b2,b3,b4,b5,b6,b7,ba1,ba2,ban,ban1;
	private JTextArea area,area1;
	private JTable table,table2;
	private JScrollPane pane,pane1,pane2;
	private JLabel lab1,lab3,lab4,lab5,lab7,lab9,lab10,lab11,lab13,lab15,lab16,lab17,lab19,lab21,lab22,lab23,lab25,lab27,lab28,lab29,lab30,lab31,lab32,lab33,lab34,lab35,lab36,lab37;
	private JTextField text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14;
	private Connection con=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private static JLabel date;
	private static JLabel empty;
	private static JLabel time;  
	private static JLabel kappa;
	private static JLabel hash;
	private String school="FIDEL CASTRO";
	private JTabbedPane tab;
	
	
	
	public Mudi() {
		super("Result System FORM 5&6");
		
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {

		}
		
		
		try {
			Class.forName("org.sqlite.JDBC");
			con=DriverManager.getConnection("jdbc:sqlite:credit.sqlite");
			//OptionPane.showMessageDialog(null,"Connected !");
		} catch (Exception e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		Calendar timer=Calendar.getInstance();
		 timer.getTime();
		 SimpleDateFormat dt=new SimpleDateFormat("MMMM");
		 SimpleDateFormat yy=new SimpleDateFormat("yyyy");
		
		 Integer year=Integer.parseInt(yy.format(timer.getTime()));
		 int y01=year-3; 
		 int y0=year-2; 
		 int y1=year-1;  // String yy1=;
	     int y2=year;
		 int y3=year+1;
		 
		 String  ss01=Integer.toString(y01);
		 String  ss0=Integer.toString(y0);
		 String  ss1=Integer.toString(y1);
		 String  sss1=Integer.toString(y2);
		 String  ssss1=Integer.toString(y3);
		 
		 String s01=ss01+"-"+ss0;String s=ss0+"-"+ss1;String ss=ss1+"-"+sss1;String sss=sss1+"-"+ssss1;
		
	p1=new JPanel()	;
	p2=new JPanel()	;
	p3=new JPanel()	;
	p4=new JPanel()	;
	p5=new JPanel()	;
	p6=new JPanel()	;
	p7=new JPanel()	;
	p8=new JPanel()	;
	p9=new JPanel()	;
	p10=new JPanel();
	p11=new JPanel();
	p=new JPanel();	
	pana=new JPanel();
	pana1=new JPanel();
	pana2=new JPanel();
	pana3=new JPanel();
	pana4=new JPanel();
	panel=new JPanel();
	panel1=new JPanel();
	panel2=new JPanel();
	pana5=new JPanel();
	pana6=new JPanel();
	pana7=new JPanel();
	pana8=new JPanel();
	pana9=new JPanel();
	pana10=new JPanel();
	pana11=new JPanel();
	pana12=new JPanel();
	pana13=new JPanel();
	pana14=new JPanel();
	pana15=new JPanel();
	panel4=new JPanel();
	panel3=new JPanel();
	pa1=new JPanel();
	pa2=new JPanel();
	pa3=new JPanel();
	pa4=new JPanel();
	pa5=new JPanel();
	
	

	
	area=new JTextArea(7,21);//area.setBackground(Color.pink);
	area.setEditable(false);
	area.setFont(new Font("aerial",Font.PLAIN+Font.BOLD,12));
	
	table=new JTable();
	pane=new JScrollPane(table);
	
	
	area1=new JTextArea(22,56);
	area1.setEditable(true);
	area1.setFont(new Font("verdana",Font.PLAIN,12));
	area1.setLineWrap(true);
	area1.setWrapStyleWord(true);
	
	pane1=new JScrollPane(area1);
	panel4.add(pane1);
	
	tab=new JTabbedPane();add(tab);
	tab.addTab("Student Information",null, p,"Student Information");
	tab.addTab("Update Marks",null, pa3,"Update Marks");
	
	pa3.setLayout(new BorderLayout());
	pa3.add(pa4,BorderLayout.NORTH);
	pa3.add(pa5,BorderLayout.CENTER);
	
	//add(p,BorderLayout.CENTER);
	p.setLayout(new BorderLayout());
	Border in=BorderFactory.createEmptyBorder(1,5,1,5);//p6.setBackground(Color.BLACK);
	Border ou=BorderFactory.createTitledBorder("");
	p6.setBorder(BorderFactory.createCompoundBorder(in, ou));
	p7.setBorder(BorderFactory.createCompoundBorder(in, ou));
	p3.setBorder(BorderFactory.createCompoundBorder(in, ou));
	p4.setBorder(BorderFactory.createCompoundBorder(in, ou));
	p8.setBorder(BorderFactory.createCompoundBorder(in, ou));
	p9.setBorder(BorderFactory.createCompoundBorder(in, ou));
	//p11.setBorder(BorderFactory.createCompoundBorder(in, ou));
	pa2.setBorder(BorderFactory.createCompoundBorder(in, ou));
	pa4.setBorder(BorderFactory.createCompoundBorder(in, ou));
	pa5.setBorder(BorderFactory.createCompoundBorder(in, ou));
	
	
	p.add(p1,BorderLayout.WEST);
	p.add(p2,BorderLayout.CENTER);
	p1.setLayout(new BorderLayout());
	p1.add(p3,BorderLayout.NORTH);
	p1.add(p4,BorderLayout.CENTER);
	p1.add(p5,BorderLayout.SOUTH);
	
	p5.setLayout(new BorderLayout());
	p5.add(p8,BorderLayout.NORTH);
	p5.add(p10,BorderLayout.SOUTH);
	
	p2.setLayout(new BorderLayout());
	//p2.add(p6,BorderLayout.NORTH);
	p2.add(pa1,BorderLayout.NORTH);
	p2.add(p7,BorderLayout.CENTER);
	
	pa1.setLayout(new BorderLayout());
	pa1.add(p6,BorderLayout.NORTH);
	pa1.add(pa2,BorderLayout.SOUTH);
	
	p7.setLayout(new BorderLayout());
	p7.add(pane);//p7.setBackground(Color.pink);
	p10.setLayout(new BorderLayout());
	p10.add(p9,BorderLayout.NORTH);
	p10.add(p11,BorderLayout.SOUTH);
	
	Icon save=new ImageIcon(this.getClass().getResource("/save.png"));
	Icon search=new ImageIcon(this.getClass().getResource("/search.png"));
	Icon edit=new ImageIcon(this.getClass().getResource("/edit.png"));
	Icon delete=new ImageIcon(this.getClass().getResource("/delete.png"));
	Icon show=new ImageIcon(this.getClass().getResource("/show.png"));
	Icon print=new ImageIcon(this.getClass().getResource("/print.png"));
	Icon refresh=new ImageIcon(this.getClass().getResource("/refresh.png"));
	Icon z=new ImageIcon(this.getClass().getResource("/z.png"));
	
	b1=new JButton("Save");b1.setIcon(save);
	b2=new JButton("Show");b2.setIcon(show);
	b3=new JButton("Update");b3.setIcon(edit);
	b4=new JButton("Delete");b4.setIcon(delete);
	b5=new JButton("Refresh");b5.setIcon(refresh);
	b6=new JButton("Print Report");b6.setIcon(null);b6.setFont(new Font("serif",Font.BOLD,12));b6.setForeground(Color.BLUE);
	b7=new JButton("Update Marks");b7.setFont(new Font("serif",Font.BOLD,15));b7.setForeground(Color.BLUE);
	//b1.setBackground(Color.PINK);b5.setBackground(Color.PINK);b3.setBackground(Color.PINK);b4.setBackground(Color.PINK);
	

	ba1=new JButton("Form V");ba1.setFont(new Font("verdana",Font.BOLD,12));ba1.setBackground(Color.PINK);ba1.setForeground(Color.BLUE);
	ba2=new JButton("Form VI");ba2.setFont(new Font("verdana",Font.BOLD,12));ba2.setBackground(Color.PINK);ba2.setForeground(Color.BLUE);
	
	lan1=new JLabel("Select Class");lan1.setFont(new Font("georgia",Font.BOLD,13));lan1.setForeground(new Color(46,139,87));
	boxn=new JComboBox<String>(name2);boxn.setToolTipText("Select Class");
	boxn.setMaximumRowCount(10);boxn.setSelectedItem(null);
	

	ban=new JButton("Save Marks");ban.setFont(new Font("verdana",Font.BOLD,12));ban.setBackground(Color.PINK);ban.setForeground(Color.BLUE);
	ban1=new JButton("Refresh");ban1.setFont(new Font("verdana",Font.BOLD,12));ban1.setBackground(Color.BLACK);ban1.setForeground(Color.WHITE);
	
	ba1=new JButton("Kidato cha V");ba1.setFont(new Font("verdana",Font.BOLD,12));ba1.setBackground(Color.PINK);ba1.setForeground(Color.BLUE);
	ba2=new JButton("Kidato cha VI");ba2.setFont(new Font("verdana",Font.BOLD,12));ba2.setBackground(Color.PINK);ba2.setForeground(Color.BLUE);
	
	    pa4.setLayout(new GridBagLayout());
		GridBagConstraints c44=new GridBagConstraints();
		c44.insets=new Insets(0,5,0,5);
		c44.gridx=1;c44.gridy=1;
		pa4.add(lan1, c44);
		c44.gridx=2;c44.gridy=1;
		pa4.add(boxn, c44);//pa4.setBackground(Color.red);
		
		c44.gridx=5;c44.gridy=1;
	    pa4.add(ban1, c44);

		c44.gridx=4;c44.gridy=1;
		pa4.add(ban, c44);
		
		table2=new JTable();
		pane2=new JScrollPane(table2);
		pa5.setLayout(new BorderLayout());
		pa5.add(pane2);
		
		
	
	pa2.setLayout(new GridBagLayout());
	GridBagConstraints c3=new GridBagConstraints();
	c3.insets=new Insets(0,1,0,1);
	c3.gridx=1;c3.gridy=1;
	pa2.add(ba1, c3);
	c3.gridx=2;c3.gridy=1;
	pa2.add(ba2, c3);


		
	
	field=new JTextField("",14);   
	field.setToolTipText("Enter First Name or Last Name");
	label=new JLabel();label.setIcon(search);
	
	JLabel n=new JLabel("STUDENT'S  RESULT  MANAGEMENT  SYSTEM");//n.setFont(new Font("Poor Richard",Font.TRUETYPE_FONT+Font.PLAIN+Font.BOLD,45));
	n.setFont(new Font("Segoe UI",+Font.BOLD,48));
	n.setForeground(new Color(128,128,0));
    p6.add(n);
		
	p3.setLayout(new GridBagLayout());
	c3.insets=new Insets(0,1,0,1);
	c3.gridx=1;c3.gridy=1;
	p3.add(field, c3);
	c3.gridx=2;c3.gridy=1;
	p3.add(label, c3);

		
	l0=new JLabel("User_ID");l0.setFont(new Font("georgia",Font.BOLD,13));l0.setForeground(new Color(46,139,87));
	t0=new JTextField(12);t0.setToolTipText("Enter User ID");
	l1=new JLabel("F & M Name");l1.setFont(new Font("georgia",Font.BOLD,13));l1.setForeground(new Color(46,139,87));
	t1=new JTextField(10);t1.setToolTipText("Enter First Name");
	l2=new JLabel("Last Name");l2.setFont(new Font("georgia",Font.BOLD,13));l2.setForeground(new Color(46,139,87));
	t2=new JTextField(10);t2.setToolTipText("Enter Last Name");
	l3=new JLabel("Gender");l3.setFont(new Font("georgia",Font.BOLD,13));l3.setForeground(new Color(46,139,87));
	t3=new JComboBox<String>(name1);t3.setToolTipText("Select Gender");t3.setSelectedItem(null);
	l4=new JLabel("Class Level");l4.setFont(new Font("georgia",Font.BOLD,13));l4.setForeground(new Color(46,139,87));
	t4=new JComboBox<String>(name2);t4.setMaximumRowCount(4);t4.setToolTipText("Select Class Level");
	t4.setSelectedItem(null);t4.setMaximumRowCount(5);
	l5=new JLabel("Combi");l5.setFont(new Font("georgia",Font.BOLD,13));l5.setForeground(new Color(46,139,87));
	t5=new JComboBox<String>(name3);t5.setMaximumRowCount(20);t5.setToolTipText("Select Combination");
	t5.setSelectedItem(null);
	l6=new JLabel("Exam Type");l6.setFont(new Font("georgia",Font.BOLD,13));l6.setForeground(new Color(46,139,87));
	t6=new JComboBox<String>(name4);t6.setMaximumRowCount(10);t6.setToolTipText("Select Exam Type");
	t6.setSelectedItem(null);
	ll7=new JLabel("Term");ll7.setFont(new Font("georgia",Font.BOLD,13));ll7.setForeground(new Color(46,139,87));
	tt7=new JComboBox<String>(name7);t6.setMaximumRowCount(10);tt7.setToolTipText("Select Term");
	tt7.setSelectedItem(null);
	 
	 
	label7=new JLabel("Acad..Year");label7.setFont(new Font("georgia",Font.BOLD,13));label7.setForeground(new Color(46,139,87));
	String name5[]= {s01,s,ss,sss};
    box5=new JComboBox<String>(name5);box5.setMaximumRowCount(10);box5.setToolTipText("Select Year");box5.setSelectedItem(null);
    
    l67=new JLabel("School");l67.setFont(new Font("georgia",Font.BOLD,13));l67.setForeground(new Color(46,139,87));
    l68=new JLabel("School");l68.setFont(new Font("georgia",Font.BOLD,13));l68.setForeground(new Color(46,139,87));
	box67=new JComboBox<String>(name6);box67.setMaximumRowCount(20);box67.setToolTipText("Select School");
	box67.setSelectedItem(null);
	box68=new JComboBox<String>(name6);box68.setMaximumRowCount(20);box68.setToolTipText("Select School");
	box68.setSelectedItem(null);
	 
	 
	
	l50=new JLabel("User_ID");l50.setFont(new Font("georgia",Font.BOLD,13));l50.setForeground(new Color(46,139,87));
	t50=new JTextField(12);t50.setToolTipText("Enter User ID");
	l51=new JLabel("F & M Name");l51.setFont(new Font("georgia",Font.BOLD,13));l51.setForeground(new Color(46,139,87));
	t51=new JTextField(10);t51.setToolTipText("Enter First Name");
	l52=new JLabel("Last Name");l52.setFont(new Font("georgia",Font.BOLD,13));l52.setForeground(new Color(46,139,87));
	t52=new JTextField(10);t52.setToolTipText("Enter Last Name");
	l53=new JLabel("Gender");l53.setFont(new Font("georgia",Font.BOLD,13));l53.setForeground(new Color(46,139,87));
	t53=new JComboBox<String>(name1);t53.setToolTipText("Select Gender");t53.setSelectedItem(null);
	l54=new JLabel("Class Level");l54.setFont(new Font("georgia",Font.BOLD,13));l54.setForeground(new Color(46,139,87));
	t54=new JComboBox<String>(name2);t54.setMaximumRowCount(20);t54.setToolTipText("Select Class Level");
	t54.setSelectedItem(null);
	l55=new JLabel("Combi");l55.setFont(new Font("georgia",Font.BOLD,13));l55.setForeground(new Color(46,139,87));
	t55=new JComboBox<String>(name3);t55.setMaximumRowCount(20);t55.setToolTipText("Select Combination");
	t55.setSelectedItem(null);
	l56=new JLabel("Exam Type");l56.setFont(new Font("georgia",Font.BOLD,13));l56.setForeground(new Color(46,139,87));
	t56=new JComboBox<String>(name4);t56.setMaximumRowCount(20);t56.setToolTipText("Select Exam Type");
	t56.setSelectedItem(null);
	label77=new JLabel("Acad..Year");label77.setFont(new Font("georgia",Font.BOLD,13));label77.setForeground(new Color(46,139,87));
	box55=new JComboBox<String>(name5);box5.setMaximumRowCount(20);box55.setToolTipText("Select Year");box55.setSelectedItem(null);
	ll17=new JLabel("Term");ll17.setFont(new Font("georgia",Font.BOLD,13));ll17.setForeground(new Color(46,139,87));
	tt17=new JComboBox<String>(name7);tt17.setMaximumRowCount(20);tt17.setToolTipText("Select Termr");tt17.setSelectedItem(null);
		 
		
    
	l7=new JLabel("PHYSICS");l7.setFont(new Font("georgia",Font.BOLD,13));l7.setForeground(new Color(46,139,87));
	t7=new JTextField(5);t7.setToolTipText("Enter Physics Marks");
	l8=new JLabel("CHEMISTRY");l8.setFont(new Font("georgia",Font.BOLD,13));l8.setForeground(new Color(46,139,87));
	t8=new JTextField(5);t8.setToolTipText("Enter Chemistry Marks");
	l9=new JLabel("BIOLOGY");l9.setFont(new Font("georgia",Font.BOLD,13));l9.setForeground(new Color(46,139,87));
	t9=new JTextField(5);t9.setToolTipText("Enter Biology Marks");
	l10=new JLabel("ADV/MATH");l10.setFont(new Font("georgia",Font.BOLD,13));l10.setForeground(new Color(46,139,87));
	t10=new JTextField(5);t10.setToolTipText("Enter A/Math Marks");
	l11=new JLabel("GEOGRAPHY");l11.setFont(new Font("georgia",Font.BOLD,13));l11.setForeground(new Color(46,139,87));
	t11=new JTextField(5);t11.setToolTipText("Enter Geography Marks");
	l12=new JLabel("BAM");l12.setFont(new Font("georgia",Font.BOLD,13));l12.setForeground(new Color(46,139,87));
	t12=new JTextField(5);t12.setToolTipText("Enter BAM Marks");
	l13=new JLabel("G.STUDIES");l13.setFont(new Font("georgia",Font.BOLD,13));l13.setForeground(new Color(46,139,87));
	t13=new JTextField(5);t13.setToolTipText("Enter GS Marks");
	
	l17=new JLabel("PHYSICS");l17.setFont(new Font("georgia",Font.BOLD,13));l17.setForeground(new Color(46,139,87));
	t17=new JTextField(5);t7.setToolTipText("Enter Physics Marks");
	l18=new JLabel("CHEMISTRY");l18.setFont(new Font("georgia",Font.BOLD,13));l18.setForeground(new Color(46,139,87));
	t18=new JTextField(5);t8.setToolTipText("Enter Chemistry Marks");
	l19=new JLabel("BIOLOGY");l19.setFont(new Font("georgia",Font.BOLD,13));l19.setForeground(new Color(46,139,87));
	t19=new JTextField(5);t9.setToolTipText("Enter Biology Marks");
	l20=new JLabel("ADV/MATH");l20.setFont(new Font("georgia",Font.BOLD,13));l20.setForeground(new Color(46,139,87));
	t20=new JTextField(5);t10.setToolTipText("Enter A/Math Marks");
	l21=new JLabel("GEOGRAPHY");l21.setFont(new Font("georgia",Font.BOLD,13));l21.setForeground(new Color(46,139,87));
	t21=new JTextField(5);t21.setToolTipText("Enter Geography Marks");
	l22=new JLabel("BAM");l22.setFont(new Font("georgia",Font.BOLD,13));l22.setForeground(new Color(46,139,87));
	t22=new JTextField(5);t22.setToolTipText("Enter BAM Marks");
	l23=new JLabel("G.STUDIES");l23.setFont(new Font("georgia",Font.BOLD,13));l23.setForeground(new Color(46,139,87));
	t23=new JTextField(5);t23.setToolTipText("Enter GS Marks");

	l27=new JLabel("PHYSICS");l27.setFont(new Font("georgia",Font.BOLD,13));l27.setForeground(new Color(46,139,87));
	t27=new JTextField(5);t27.setToolTipText("Enter Physics Marks");
	l28=new JLabel("CHEMISTRY");l28.setFont(new Font("georgia",Font.BOLD,13));l28.setForeground(new Color(46,139,87));
	t28=new JTextField(5);t28.setToolTipText("Enter Chemistry Marks");
	l29=new JLabel("BIOLOGY");l29.setFont(new Font("georgia",Font.BOLD,13));l29.setForeground(new Color(46,139,87));
	t29=new JTextField(5);t29.setToolTipText("Enter Biology Marks");
	l30=new JLabel("ADV/MATH");l30.setFont(new Font("georgia",Font.BOLD,13));l30.setForeground(new Color(46,139,87));
	t30=new JTextField(5);t30.setToolTipText("Enter A/Math Marks");
	l31=new JLabel("GEOGRAPHY");l31.setFont(new Font("georgia",Font.BOLD,13));l31.setForeground(new Color(46,139,87));
	t31=new JTextField(5);t31.setToolTipText("Enter Geography Marks");
	l32=new JLabel("BAM");l32.setFont(new Font("georgia",Font.BOLD,13));l32.setForeground(new Color(46,139,87));
	t32=new JTextField(5);t32.setToolTipText("Enter BAM Marks");
	l33=new JLabel("G.STUDIES");l33.setFont(new Font("georgia",Font.BOLD,13));l33.setForeground(new Color(46,139,87));
	t33=new JTextField(5);t33.setToolTipText("Enter GS Marks");

	
	l37=new JLabel("PHYSICS");l37.setFont(new Font("georgia",Font.BOLD,13));l37.setForeground(new Color(46,139,87));
	t37=new JTextField(5);t37.setToolTipText("Enter Physics Marks");
	l38=new JLabel("CHEMISTRY");l38.setFont(new Font("georgia",Font.BOLD,13));l38.setForeground(new Color(46,139,87));
	t38=new JTextField(5);t38.setToolTipText("Enter Chemistry Marks");
	l39=new JLabel("BIOLOGY");l39.setFont(new Font("georgia",Font.BOLD,13));l39.setForeground(new Color(46,139,87));
	t39=new JTextField(5);t39.setToolTipText("Enter Biology Marks");
	l40=new JLabel("ADV/MATH");l40.setFont(new Font("georgia",Font.BOLD,13));l40.setForeground(new Color(46,139,87));
	t40=new JTextField(5);t40.setToolTipText("Enter A/Math Marks");
	l41=new JLabel("GEOGRAPHY");l41.setFont(new Font("georgia",Font.BOLD,13));l41.setForeground(new Color(46,139,87));
	t41=new JTextField(5);t41.setToolTipText("Enter Geography Marks");
	l42=new JLabel("BAM");l42.setFont(new Font("georgia",Font.BOLD,13));l42.setForeground(new Color(46,139,87));
	t42=new JTextField(5);t42.setToolTipText("Enter BAM Marks");
	l43=new JLabel("G.STUDIES");l43.setFont(new Font("georgia",Font.BOLD,13));l43.setForeground(new Color(46,139,87));
	t43=new JTextField(5);t43.setToolTipText("Enter GS Marks");
	
	la1=new JLabel("ECONOMICS");la1.setFont(new Font("georgia",Font.BOLD,13));la1.setForeground(new Color(46,139,87));
	ta1=new JTextField(5);ta1.setToolTipText("Enter Economics Marks");
	la2=new JLabel("GEOGRAPHY");la2.setFont(new Font("georgia",Font.BOLD,13));la2.setForeground(new Color(46,139,87));
	ta2=new JTextField(5);ta2.setToolTipText("Enter Geography Marks");
	la3=new JLabel("ADV/MATH");la3.setFont(new Font("georgia",Font.BOLD,13));la3.setForeground(new Color(46,139,87));
	ta3=new JTextField(5);ta3.setToolTipText("Enter A/Math Marks");
	la4=new JLabel("G.STUDIES");la4.setFont(new Font("georgia",Font.BOLD,13));la4.setForeground(new Color(46,139,87));
	ta4=new JTextField(5);ta4.setToolTipText("Enter GS Marks");
	
	
	la5=new JLabel("HISTORY");la5.setFont(new Font("georgia",Font.BOLD,13));la5.setForeground(new Color(46,139,87));
	ta5=new JTextField(5);ta5.setToolTipText("Enter History Marks");
	la6=new JLabel("GEOGRAPHY");la6.setFont(new Font("georgia",Font.BOLD,13));la6.setForeground(new Color(46,139,87));
	ta6=new JTextField(5);ta6.setToolTipText("Enter Geography Marks");
	la7=new JLabel("ECONOMICS");la7.setFont(new Font("georgia",Font.BOLD,13));la7.setForeground(new Color(46,139,87));
	ta7=new JTextField(5);ta7.setToolTipText("Enter Economics Marks");
	la8=new JLabel("BAM");la8.setFont(new Font("georgia",Font.BOLD,13));la8.setForeground(new Color(46,139,87));
	ta8=new JTextField(5);ta8.setToolTipText("Enter BAM Marks");
	la9=new JLabel("G.STUDIES");la9.setFont(new Font("georgia",Font.BOLD,13));la9.setForeground(new Color(46,139,87));
	ta9=new JTextField(5);ta9.setToolTipText("Enter GS Marks");



	la10=new JLabel("ECONOMICS");la10.setFont(new Font("georgia",Font.BOLD,13));la10.setForeground(new Color(46,139,87));
	ta10=new JTextField(5);ta10.setToolTipText("Enter Economics Marks");
	la11=new JLabel("COMMERCE");la11.setFont(new Font("georgia",Font.BOLD,13));la11.setForeground(new Color(46,139,87));
	ta11=new JTextField(5);ta11.setToolTipText("Enter Commerce Marks");
	la12=new JLabel("ACCOUNTANCY");la12.setFont(new Font("georgia",Font.BOLD,13));la12.setForeground(new Color(46,139,87));
	ta12=new JTextField(5);ta12.setToolTipText("Enter Accountancy Marks");
	la13=new JLabel("BAM");la13.setFont(new Font("georgia",Font.BOLD,13));la13.setForeground(new Color(46,139,87));
	ta13=new JTextField(5);ta13.setToolTipText("Enter BAM Marks");
	la14=new JLabel("G.STUDIES");la14.setFont(new Font("georgia",Font.BOLD,13));la14.setForeground(new Color(46,139,87));
	ta14=new JTextField(5);ta14.setToolTipText("Enter GS Marks");
	
	la15=new JLabel("HISTORY");la15.setFont(new Font("georgia",Font.BOLD,13));la15.setForeground(new Color(46,139,87));
	ta15=new JTextField(5);ta15.setToolTipText("Enter History Marks");
	la16=new JLabel("KISWAHILI");la16.setFont(new Font("georgia",Font.BOLD,13));la16.setForeground(new Color(46,139,87));
	ta16=new JTextField(5);ta16.setToolTipText("Enter Kiswahili Marks");
	la17=new JLabel("LANGUAGE");la17.setFont(new Font("georgia",Font.BOLD,13));la17.setForeground(new Color(46,139,87));
	ta17=new JTextField(5);ta17.setToolTipText("Enter English Marks");
	la18=new JLabel("G.STUDIES");la18.setFont(new Font("georgia",Font.BOLD,13));la18.setForeground(new Color(46,139,87));
	ta18=new JTextField(5);ta18.setToolTipText("Enter GS Marks");
	
	la19=new JLabel("HISTORY");la19.setFont(new Font("georgia",Font.BOLD,13));la19.setForeground(new Color(46,139,87));
	ta19=new JTextField(5);ta19.setToolTipText("Enter History Marks");
	la20=new JLabel("GEOGRAPHY");la20.setFont(new Font("georgia",Font.BOLD,13));la20.setForeground(new Color(46,139,87));
	ta20=new JTextField(5);ta20.setToolTipText("Enter Geography Marks");
	la21=new JLabel("LANGUAGE");la21.setFont(new Font("georgia",Font.BOLD,13));la21.setForeground(new Color(46,139,87));
	ta21=new JTextField(5);ta21.setToolTipText("Enter English Marks");
	la22=new JLabel("G.STUDIES");la22.setFont(new Font("georgia",Font.BOLD,13));la22.setForeground(new Color(46,139,87));
	ta22=new JTextField(5);ta22.setToolTipText("Enter GS Marks");
	
	la23=new JLabel("HISTORY");la23.setFont(new Font("georgia",Font.BOLD,13));la23.setForeground(new Color(46,139,87));
	ta23=new JTextField(5);ta23.setToolTipText("Enter History Marks");
	la24=new JLabel("GEOGRAPHY");la24.setFont(new Font("georgia",Font.BOLD,13));la24.setForeground(new Color(46,139,87));
	ta24=new JTextField(5);ta24.setToolTipText("Enter Geography Marks");
	la25=new JLabel("KISWAHILI");la25.setFont(new Font("georgia",Font.BOLD,13));la25.setForeground(new Color(46,139,87));
	ta25=new JTextField(5);ta25.setToolTipText("Enter Kiswahili Marks");
	la26=new JLabel("G.STUDIES");la26.setFont(new Font("georgia",Font.BOLD,13));la26.setForeground(new Color(46,139,87));
	ta26=new JTextField(5);ta26.setToolTipText("Enter GS Marks");
	
	
	la27=new JLabel("GEOGRAPHY");la27.setFont(new Font("georgia",Font.BOLD,13));la27.setForeground(new Color(46,139,87));
	ta27=new JTextField(5);ta27.setToolTipText("Enter Geography Marks");
	la28=new JLabel("KISWAHILI");la28.setFont(new Font("georgia",Font.BOLD,13));la28.setForeground(new Color(46,139,87));
	ta28=new JTextField(5);ta28.setToolTipText("Enter Kiswahili Marks");
	la29=new JLabel("LANGUAGE");la29.setFont(new Font("georgia",Font.BOLD,13));la29.setForeground(new Color(46,139,87));
	ta29=new JTextField(5);ta29.setToolTipText("Enter Language Marks");
	la30=new JLabel("G.STUDIES");la30.setFont(new Font("georgia",Font.BOLD,13));la30.setForeground(new Color(46,139,87));
	ta30=new JTextField(5);ta30.setToolTipText("Enter GS Marks");
	
	
	la31=new JLabel("KISWAHILI");la31.setFont(new Font("georgia",Font.BOLD,13));la31.setForeground(new Color(46,139,87));
	ta31=new JTextField(5);ta31.setToolTipText("Enter Kiswahili Marks");
	la32=new JLabel("LANGUAGE");la32.setFont(new Font("georgia",Font.BOLD,13));la32.setForeground(new Color(46,139,87));
	ta32=new JTextField(5);ta32.setToolTipText("Enter Language Marks");
	la33=new JLabel("ARABIC");la33.setFont(new Font("georgia",Font.BOLD,13));la33.setForeground(new Color(46,139,87));
	ta33=new JTextField(5);ta33.setToolTipText("Enter Arabic Marks");
	la34=new JLabel("G.STUDIES");la34.setFont(new Font("georgia",Font.BOLD,13));la34.setForeground(new Color(46,139,87));
	ta34=new JTextField(5);ta34.setToolTipText("Enter GS Marks");
	
	la35=new JLabel("IS/KNOWLEDGE");la35.setFont(new Font("georgia",Font.BOLD,13));la35.setForeground(new Color(46,139,87));
	ta35=new JTextField(5);ta35.setToolTipText("Enter IS/Knowledge Marks");
	la36=new JLabel("KISWAHILI");la36.setFont(new Font("georgia",Font.BOLD,13));la36.setForeground(new Color(46,139,87));
	ta36=new JTextField(5);ta36.setToolTipText("Enter Kiswahili Marks");
	la37=new JLabel("ARABIC");la37.setFont(new Font("georgia",Font.BOLD,13));la37.setForeground(new Color(46,139,87));
	ta37=new JTextField(5);ta37.setToolTipText("Enter Arabic Marks");
	la38=new JLabel("G.STUDIES");la38.setFont(new Font("georgia",Font.BOLD,13));la38.setForeground(new Color(46,139,87));
	ta38=new JTextField(5);ta38.setToolTipText("Enter GS Marks");
	
	la39=new JLabel("HISTORY");la39.setFont(new Font("georgia",Font.BOLD,13));la39.setForeground(new Color(46,139,87));
	ta39=new JTextField(5);ta39.setToolTipText("Enter History Marks");
	la40=new JLabel("KISWAHILI");la40.setFont(new Font("georgia",Font.BOLD,13));la40.setForeground(new Color(46,139,87));
	ta40=new JTextField(5);ta40.setToolTipText("Enter Kiswahili Marks");
	la41=new JLabel("ARABIC");la41.setFont(new Font("georgia",Font.BOLD,13));la41.setForeground(new Color(46,139,87));
	ta41=new JTextField(5);ta41.setToolTipText("Enter Arabic Marks");
	la42=new JLabel("G.STUDIES");la42.setFont(new Font("georgia",Font.BOLD,13));la42.setForeground(new Color(46,139,87));
	ta42=new JTextField(5);ta42.setToolTipText("Enter GS Marks");
	
	la43=new JLabel("IS/KNOWLEDGE");la43.setFont(new Font("georgia",Font.BOLD,13));la43.setForeground(new Color(46,139,87));
	ta43=new JTextField(5);ta43.setToolTipText("Enter IS/Knowledge Marks");
	la44=new JLabel("KISWAHILI");la44.setFont(new Font("georgia",Font.BOLD,13));la44.setForeground(new Color(46,139,87));
	ta44=new JTextField(5);ta44.setToolTipText("Enter Kiswahili Marks");
	la45=new JLabel("LANGUAGE");la45.setFont(new Font("georgia",Font.BOLD,13));la45.setForeground(new Color(46,139,87));
	ta45=new JTextField(5);ta45.setToolTipText("Enter Language Marks");
	la46=new JLabel("G.STUDIES");la46.setFont(new Font("georgia",Font.BOLD,13));la46.setForeground(new Color(46,139,87));
	ta46=new JTextField(5);ta46.setToolTipText("Enter GS Marks");
	
	box2=new JComboBox<String>(name2);box2.setMaximumRowCount(4);box2.setToolTipText("Select Class ");box2.setSelectedItem(null);
	label2=new JLabel("Select Class To Resert Marks");label2.setFont(new Font("georgia",Font.BOLD,13));label2.setForeground(new Color(46,139,87));
	
	panel2.setLayout(new GridBagLayout());
	c3.insets=new Insets(0,1,0,1);
	c3.gridx=1;c3.gridy=1;
	panel2.add(label2, c3);
	c3.gridx=2;c3.gridy=1;
	panel2.add(box2, c3);
	
	
	
	
	    box69=new JComboBox<String>(name2);box69.setToolTipText("Select Class");box69.setSelectedItem(null);box69.setMaximumRowCount(5);
		box70=new JComboBox<String>(name2);box70.setToolTipText("Select Class ");box70.setSelectedItem(null);box70.setMaximumRowCount(5);
		l69=new JLabel("Replace");l69.setFont(new Font("georgia",Font.BOLD,13));l69.setForeground(new Color(46,139,87));
		l70=new JLabel("With");l70.setFont(new Font("georgia",Font.BOLD,13));l70.setForeground(new Color(46,139,87));
		ll=new JLabel("Class");ll.setFont(new Font("georgia",Font.BOLD,13));ll.setForeground(new Color(46,139,87));
		
		
		ll1=new JLabel("Acd.. Year");ll1.setFont(new Font("georgia",Font.BOLD,13));ll1.setForeground(new Color(46,139,87));
		box71=new JComboBox<String>(name5);box71.setMaximumRowCount(4);box71.setToolTipText("Select Year ");box71.setSelectedItem(null);box71.setMaximumRowCount(5);
		box72=new JComboBox<String>(name5);box72.setMaximumRowCount(4);box72.setToolTipText("Select Year ");box72.setSelectedItem(null);box72.setMaximumRowCount(5);
		
		ll2=new JLabel("Exam Type");ll2.setFont(new Font("georgia",Font.BOLD,13));ll2.setForeground(new Color(46,139,87));
		box73=new JComboBox<String>(name4);box73.setMaximumRowCount(9);box73.setToolTipText("Select Year ");box73.setSelectedItem(null);
		box74=new JComboBox<String>(name4);box74.setMaximumRowCount(9);box74.setToolTipText("Select Year ");box74.setSelectedItem(null);
		
		ll3=new JLabel("Term");ll3.setFont(new Font("georgia",Font.BOLD,13));ll3.setForeground(new Color(46,139,87));
		box75=new JComboBox<String>(name7);box75.setMaximumRowCount(20);box75.setToolTipText("Select School ");box75.setSelectedItem(null);
		box76=new JComboBox<String>(name7);box76.setMaximumRowCount(20);box76.setToolTipText("Select School ");box76.setSelectedItem(null);
		
		
		lab1=new JLabel("A");lab1.setFont(new Font("georgia",Font.BOLD,13));lab1.setForeground(Color.BLUE);
		text1=new JTextField(3);text1.setFont(new Font("georgia",Font.BOLD,13));
		lab3=new JLabel("???");lab3.setFont(new Font("georgia",Font.BOLD,13));lab3.setForeground(new Color(46,139,87));
		lab4=new JLabel("mark");lab4.setFont(new Font("verdana",Font.BOLD,13));lab4.setForeground(new Color(46,139,87));
		lab5=new JLabel("???");lab5.setFont(new Font("georgia",Font.BOLD,13));lab5.setForeground(new Color(46,139,87));
		text2=new JTextField(3);text2.setFont(new Font("georgia",Font.BOLD,13));
		
		lab7=new JLabel("B");lab7.setFont(new Font("georgia",Font.BOLD,13));lab7.setForeground(Color.BLUE);
		text3=new JTextField(3);text3.setFont(new Font("georgia",Font.BOLD,13));
		lab9=new JLabel("???");lab9.setFont(new Font("georgia",Font.BOLD,13));lab9.setForeground(new Color(46,139,87));
		lab10=new JLabel("mark");lab10.setFont(new Font("verdana",Font.BOLD,13));lab10.setForeground(new Color(46,139,87));
		lab11=new JLabel("<");lab11.setFont(new Font("georgia",Font.BOLD,13));lab11.setForeground(new Color(46,139,87));
		text4=new JTextField(3);text4.setFont(new Font("georgia",Font.BOLD,13));
		
		lab13=new JLabel("C");lab13.setFont(new Font("georgia",Font.BOLD,13));lab13.setForeground(Color.BLUE);
		text5=new JTextField(3);text5.setFont(new Font("georgia",Font.BOLD,13));
		lab15=new JLabel("???");lab15.setFont(new Font("georgia",Font.BOLD,13));lab15.setForeground(new Color(46,139,87));
		lab16=new JLabel("mark");lab16.setFont(new Font("verdana",Font.BOLD,13));lab16.setForeground(new Color(46,139,87));
		lab17=new JLabel("<");lab17.setFont(new Font("georgia",Font.BOLD,13));lab17.setForeground(new Color(46,139,87));
		text6=new JTextField(3);text6.setFont(new Font("georgia",Font.BOLD,13));
		
		lab19=new JLabel("D");lab19.setFont(new Font("georgia",Font.BOLD,13));lab19.setForeground(Color.BLUE);
		text7=new JTextField(3);text7.setFont(new Font("georgia",Font.BOLD,13));
		lab21=new JLabel("???");lab21.setFont(new Font("georgia",Font.BOLD,13));lab21.setForeground(new Color(46,139,87));
		lab22=new JLabel("mark");lab22.setFont(new Font("verdana",Font.BOLD,13));lab22.setForeground(new Color(46,139,87));
		lab23=new JLabel("<");lab23.setFont(new Font("georgia",Font.BOLD,13));lab23.setForeground(new Color(46,139,87));
		text8=new JTextField(3);text8.setFont(new Font("georgia",Font.BOLD,13));
		
		lab25=new JLabel("E");lab25.setFont(new Font("georgia",Font.BOLD,13));lab25.setForeground(Color.BLUE);
		text9=new JTextField(3);text9.setFont(new Font("georgia",Font.BOLD,13));
		lab27=new JLabel("???");lab27.setFont(new Font("georgia",Font.BOLD,13));lab27.setForeground(new Color(46,139,87));
		lab28=new JLabel("mark");lab28.setFont(new Font("verdana",Font.BOLD,13));lab28.setForeground(new Color(46,139,87));
		lab29=new JLabel("<");lab29.setFont(new Font("georgia",Font.BOLD,13));lab29.setForeground(new Color(46,139,87));
		text10=new JTextField(3);text10.setFont(new Font("georgia",Font.BOLD,13));
		
		
		lab30=new JLabel("S");lab30.setFont(new Font("georgia",Font.BOLD,13));lab30.setForeground(Color.BLUE);
		text11=new JTextField(3);text11.setFont(new Font("georgia",Font.BOLD,13));
		lab31=new JLabel("???");lab31.setFont(new Font("georgia",Font.BOLD,13));lab31.setForeground(new Color(46,139,87));
		lab32=new JLabel("mark");lab32.setFont(new Font("verdana",Font.BOLD,13));lab32.setForeground(new Color(46,139,87));
		lab33=new JLabel("<");lab33.setFont(new Font("georgia",Font.BOLD,13));lab33.setForeground(new Color(46,139,87));
		text12=new JTextField(3);text12.setFont(new Font("georgia",Font.BOLD,13));
		
		lab34=new JLabel("F");lab34.setFont(new Font("georgia",Font.BOLD,13));lab34.setForeground(Color.BLUE);
		text13=new JTextField(3);text13.setFont(new Font("georgia",Font.BOLD,13));
		lab35=new JLabel("???");lab35.setFont(new Font("georgia",Font.BOLD,13));lab35.setForeground(new Color(46,139,87));
		lab36=new JLabel("mark");lab36.setFont(new Font("verdana",Font.BOLD,13));lab36.setForeground(new Color(46,139,87));
		lab37=new JLabel("<");lab37.setFont(new Font("georgia",Font.BOLD,13));lab37.setForeground(new Color(46,139,87));
		text14=new JTextField(3);text14.setFont(new Font("georgia",Font.BOLD,13));
		
		panel3.setLayout(new GridBagLayout());
		GridBagConstraints cc3=new GridBagConstraints();
		cc3.insets=new Insets(2,10,1,10);
		
		cc3.gridx=1;cc3.gridy=1;
		panel3.add(lab1, cc3);
		cc3.gridx=2;cc3.gridy=1;
		panel3.add(text1, cc3);
		cc3.gridx=3;cc3.gridy=1;
		panel3.add(lab3, cc3);
		cc3.gridx=4;cc3.gridy=1;
		panel3.add(lab4, cc3);
		cc3.gridx=5;cc3.gridy=1;
		panel3.add(lab5, cc3);
		cc3.gridx=6;cc3.gridy=1;
		panel3.add(text2, cc3);
		
		cc3.gridx=1;cc3.gridy=2;
		panel3.add(lab7, cc3);
		cc3.gridx=2;cc3.gridy=2;
		panel3.add(text3, cc3);
		cc3.gridx=3;cc3.gridy=2;
		panel3.add(lab9, cc3);
		cc3.gridx=4;cc3.gridy=2;
		panel3.add(lab10, cc3);
		cc3.gridx=5;cc3.gridy=2;
		panel3.add(lab11, cc3);
		cc3.gridx=6;cc3.gridy=2;
		panel3.add(text4, cc3);
		
		cc3.gridx=1;cc3.gridy=3;
		panel3.add(lab13, cc3);
		cc3.gridx=2;cc3.gridy=3;
		panel3.add(text5, cc3);
		cc3.gridx=3;cc3.gridy=3;
		panel3.add(lab15, cc3);
		cc3.gridx=4;cc3.gridy=3;
		panel3.add(lab16, cc3);
		cc3.gridx=5;cc3.gridy=3;
		panel3.add(lab17, cc3);
		cc3.gridx=6;cc3.gridy=3;
		panel3.add(text6, cc3);
		
		cc3.gridx=1;cc3.gridy=4;
		panel3.add(lab19, cc3);
		cc3.gridx=2;cc3.gridy=4;
		panel3.add(text7, cc3);
		cc3.gridx=3;cc3.gridy=4;
		panel3.add(lab21, cc3);
		cc3.gridx=4;cc3.gridy=4;
		panel3.add(lab22, cc3);
		cc3.gridx=5;cc3.gridy=4;
		panel3.add(lab23, cc3);
		cc3.gridx=6;cc3.gridy=4;
		panel3.add(text8, cc3);
		
		cc3.gridx=1;cc3.gridy=5;
		panel3.add(lab25, cc3);
		cc3.gridx=2;cc3.gridy=5;
		panel3.add(text9, cc3);
		cc3.gridx=3;cc3.gridy=5;
		panel3.add(lab27, cc3);
		cc3.gridx=4;cc3.gridy=5;
		panel3.add(lab28, cc3);
		cc3.gridx=5;cc3.gridy=5;
		panel3.add(lab29, cc3);
		cc3.gridx=6;cc3.gridy=5;
		panel3.add(text10, cc3);
		
		cc3.gridx=1;cc3.gridy=6;
		panel3.add(lab30, cc3);
		cc3.gridx=2;cc3.gridy=6;
		panel3.add(text11, cc3);
		cc3.gridx=3;cc3.gridy=6;
		panel3.add(lab31, cc3);
		cc3.gridx=4;cc3.gridy=6;
		panel3.add(lab32, cc3);
		cc3.gridx=5;cc3.gridy=6;
		panel3.add(lab33, cc3);
		cc3.gridx=6;cc3.gridy=6;
		panel3.add(text12, cc3);
		
		cc3.gridx=1;cc3.gridy=7;
		panel3.add(lab34, cc3);
		cc3.gridx=2;cc3.gridy=7;
		panel3.add(text13, cc3);
		cc3.gridx=3;cc3.gridy=7;
		panel3.add(lab35, cc3);
		cc3.gridx=4;cc3.gridy=7;
		panel3.add(lab36, cc3);
		cc3.gridx=5;cc3.gridy=7;
		panel3.add(lab37, cc3);
		cc3.gridx=6;cc3.gridy=7;
		panel3.add(text14, cc3);
		
		
		panel1.setLayout(new GridBagLayout());
		GridBagConstraints ccna1=new GridBagConstraints();
		ccna1.fill=GridBagConstraints.HORIZONTAL;
		ccna1.weightx=1;ccna1.weighty=1;
		ccna1.insets=new Insets(2,2,2,3);

		
		ccna1.gridx=2;ccna1.gridy=1;
		ccna1.anchor=GridBagConstraints.LINE_END;
		panel1.add(l69,ccna1);
		ccna1.gridx=1;ccna1.gridy=2;
		ccna1.anchor=GridBagConstraints.LINE_START;
		panel1.add(ll,ccna1);
		ccna1.gridx=2;ccna1.gridy=2;
		ccna1.anchor=GridBagConstraints.LINE_START;
		panel1.add(box69,ccna1);
		
		ccna1.gridx=3;ccna1.gridy=1;
		ccna1.anchor=GridBagConstraints.LINE_END;
		panel1.add(l70,ccna1);
		ccna1.gridx=3;ccna1.gridy=2;
		ccna1.anchor=GridBagConstraints.LINE_START;
		panel1.add(box70,ccna1);
	
		ccna1.gridx=1;ccna1.gridy=3;
		ccna1.anchor=GridBagConstraints.LINE_END;
		panel1.add(ll2,ccna1);
		ccna1.gridx=2;ccna1.gridy=3;
		ccna1.anchor=GridBagConstraints.LINE_END;
		panel1.add(box73,ccna1);
		ccna1.gridx=3;ccna1.gridy=3;
		ccna1.anchor=GridBagConstraints.LINE_START;
		panel1.add(box74,ccna1);
		
		ccna1.gridx=1;ccna1.gridy=4;
		ccna1.anchor=GridBagConstraints.LINE_END;
		panel1.add(ll1,ccna1);
		ccna1.gridx=2;ccna1.gridy=4;
		ccna1.anchor=GridBagConstraints.LINE_END;
		panel1.add(box71,ccna1);
		ccna1.gridx=3;ccna1.gridy=4;
		ccna1.anchor=GridBagConstraints.LINE_START;
		panel1.add(box72,ccna1);
		
		ccna1.gridx=1;ccna1.gridy=5;
		ccna1.anchor=GridBagConstraints.LINE_END;
		panel1.add(ll3,ccna1);
		ccna1.gridx=2;ccna1.gridy=5;
		ccna1.anchor=GridBagConstraints.LINE_END;
		panel1.add(box75,ccna1);
		ccna1.gridx=3;ccna1.gridy=5;
		ccna1.anchor=GridBagConstraints.LINE_START;
		panel1.add(box76,ccna1);
			
	

	
	le=new JLabel("Exam Type");le.setFont(new Font("georgia",Font.BOLD,13));le.setForeground(new Color(46,139,87));
	lc=new JLabel("Class");lc.setFont(new Font("georgia",Font.BOLD,13));lc.setForeground(new Color(46,139,87));
	la=new JLabel("Academic Year");la.setFont(new Font("georgia",Font.BOLD,13));la.setForeground(new Color(46,139,87));
	label3=new JLabel("Term");label3.setFont(new Font("georgia",Font.BOLD,13));label3.setForeground(new Color(46,139,87));
	
	
	et=new JComboBox<String>(name4);et.setMaximumRowCount(20);et.setToolTipText("Select Exam Type");et.setSelectedItem(null);
	ct=new JComboBox<String>(name2);ct.setMaximumRowCount(20);ct.setToolTipText("Select Class Level");ct.setSelectedItem(null);
	ac=new JComboBox<String>(name5);box5.setMaximumRowCount(20);ac.setToolTipText("Select Academic Year");ac.setSelectedItem(null);
	sch=new JComboBox<String>(name7);sch.setMaximumRowCount(20);sch.setToolTipText("Select Term");sch.setSelectedItem(null);

	
	panel.setLayout(new GridBagLayout());
	GridBagConstraints ccna=new GridBagConstraints();
	ccna.fill=GridBagConstraints.HORIZONTAL;
	ccna.weightx=1;ccna.weighty=1;
	ccna.insets=new Insets(2,2,2,3);

	
	ccna.gridx=1;ccna.gridy=1;
	ccna.anchor=GridBagConstraints.LINE_END;
	panel.add(le,ccna);
	ccna.gridx=1;ccna.gridy=2;
	ccna.anchor=GridBagConstraints.LINE_START;
	panel.add(et,ccna);
	
	ccna.gridx=2;ccna.gridy=1;
	ccna.anchor=GridBagConstraints.LINE_END;
	panel.add(lc,ccna);
	ccna.gridx=2;ccna.gridy=2;
	ccna.anchor=GridBagConstraints.LINE_START;
	panel.add(ct,ccna);
	
	ccna.gridx=3;ccna.gridy=1;
	ccna.anchor=GridBagConstraints.LINE_END;
	panel.add(la,ccna);
	ccna.gridx=3;ccna.gridy=2;
	ccna.anchor=GridBagConstraints.LINE_START;
	panel.add(ac,ccna);
	
	
	ccna.gridx=4;ccna.gridy=1;
	ccna.anchor=GridBagConstraints.LINE_END;
    panel.add(label3,ccna);
	ccna.gridx=4;ccna.gridy=2;
	ccna.anchor=GridBagConstraints.LINE_START;
	panel.add(sch,ccna);
	
	
	
	
	
	    pana.setLayout(new GridBagLayout());
		ccna.fill=GridBagConstraints.HORIZONTAL;
		ccna.weightx=1;ccna.weighty=1;
		ccna.insets=new Insets(2,2,2,3);

		
		ccna.gridx=1;ccna.gridy=1;
		ccna.anchor=GridBagConstraints.LINE_END;
		pana.add(l7,ccna);
		ccna.gridx=2;ccna.gridy=1;
		ccna.anchor=GridBagConstraints.LINE_START;
		pana.add(t7,ccna);
		
		ccna.gridx=1;ccna.gridy=2;
		ccna.anchor=GridBagConstraints.LINE_END;
		pana.add(l8,ccna);
		ccna.gridx=2;ccna.gridy=2;
		ccna.anchor=GridBagConstraints.LINE_START;
		pana.add(t8,ccna);
		
		ccna.gridx=1;ccna.gridy=3;
		ccna.anchor=GridBagConstraints.LINE_END;
		//pana.add(l9,ccna);
		ccna.gridx=2;ccna.gridy=3;
		ccna.anchor=GridBagConstraints.LINE_START;
		//pana.add(t9,ccna);
		
		ccna.gridx=1;ccna.gridy=4;
		ccna.anchor=GridBagConstraints.LINE_END;
		pana.add(l10,ccna);
		ccna.gridx=2;ccna.gridy=4;
		ccna.anchor=GridBagConstraints.LINE_START;
		pana.add(t10,ccna);
		
		ccna.gridx=1;ccna.gridy=5;
		ccna.anchor=GridBagConstraints.LINE_END;
		//pana.add(l11,ccna);
		ccna.gridx=2;ccna.gridy=5;
		ccna.anchor=GridBagConstraints.LINE_START;
		//pana.add(t11,ccna);
		
		ccna.gridx=1;ccna.gridy=6;
		ccna.anchor=GridBagConstraints.LINE_END;
		//pana.add(l12,ccna);
		ccna.gridx=2;ccna.gridy=6;
		ccna.anchor=GridBagConstraints.LINE_START;
		//pana.add(t12,ccna);
		
		ccna.gridx=1;ccna.gridy=7;
		ccna.anchor=GridBagConstraints.LINE_END;
		pana.add(l13,ccna);
		ccna.gridx=2;ccna.gridy=7;
		ccna.anchor=GridBagConstraints.LINE_START;
		pana.add(t13,ccna);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		pana1.setLayout(new GridBagLayout());
		ccna.fill=GridBagConstraints.HORIZONTAL;
		ccna.weightx=1;ccna.weighty=1;
		ccna.insets=new Insets(2,2,2,3);

		
		ccna.gridx=1;ccna.gridy=1;
		ccna.anchor=GridBagConstraints.LINE_END;
		pana1.add(l17,ccna);
		ccna.gridx=2;ccna.gridy=1;
		ccna.anchor=GridBagConstraints.LINE_START;
		pana1.add(t17,ccna);
		
		ccna.gridx=1;ccna.gridy=2;
		ccna.anchor=GridBagConstraints.LINE_END;
		pana1.add(l18,ccna);
		ccna.gridx=2;ccna.gridy=2;
		ccna.anchor=GridBagConstraints.LINE_START;
		pana1.add(t18,ccna);
		
		ccna.gridx=1;ccna.gridy=3;
		ccna.anchor=GridBagConstraints.LINE_END;
		pana1.add(l19,ccna);
		ccna.gridx=2;ccna.gridy=3;
		ccna.anchor=GridBagConstraints.LINE_START;
		pana1.add(t19,ccna);
		
		ccna.gridx=1;ccna.gridy=4;
		ccna.anchor=GridBagConstraints.LINE_END;
		//pana1.add(l20,ccna);
		ccna.gridx=2;ccna.gridy=4;
		ccna.anchor=GridBagConstraints.LINE_START;
		//pana1.add(t20,ccna);
		
		ccna.gridx=1;ccna.gridy=5;
		ccna.anchor=GridBagConstraints.LINE_END;
		//pana1.add(l21,ccna);
		ccna.gridx=2;ccna.gridy=5;
		ccna.anchor=GridBagConstraints.LINE_START;
		//pana1.add(t21,ccna);
		
		ccna.gridx=1;ccna.gridy=6;
		ccna.anchor=GridBagConstraints.LINE_END;
		pana1.add(l22,ccna);
		ccna.gridx=2;ccna.gridy=6;
		ccna.anchor=GridBagConstraints.LINE_START;
		pana1.add(t22,ccna);
		
		ccna.gridx=1;ccna.gridy=7;
		ccna.anchor=GridBagConstraints.LINE_END;
		pana1.add(l23,ccna);
		ccna.gridx=2;ccna.gridy=7;
		ccna.anchor=GridBagConstraints.LINE_START;
		pana1.add(t23,ccna);
		
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	     	 pana2.setLayout(new GridBagLayout());
			//GridBagConstraints ccna=new GridBagConstraints();
			ccna.fill=GridBagConstraints.HORIZONTAL;
			ccna.weightx=1;ccna.weighty=1;
			ccna.insets=new Insets(2,2,2,3);

			
			ccna.gridx=1;ccna.gridy=1;
			ccna.anchor=GridBagConstraints.LINE_END;
			pana2.add(l27,ccna);
			ccna.gridx=2;ccna.gridy=1;
			ccna.anchor=GridBagConstraints.LINE_START;
			pana2.add(t27,ccna);
			
			ccna.gridx=1;ccna.gridy=2;
			ccna.anchor=GridBagConstraints.LINE_END;
			pana2.add(l31,ccna);
			ccna.gridx=2;ccna.gridy=2;
			ccna.anchor=GridBagConstraints.LINE_START;
			pana2.add(t31,ccna);
			
			ccna.gridx=1;ccna.gridy=3;
			ccna.anchor=GridBagConstraints.LINE_END;
			//pana2.add(l29,ccna);
			ccna.gridx=2;ccna.gridy=3;
			ccna.anchor=GridBagConstraints.LINE_START;
			//pana2.add(t29,ccna);
			
			ccna.gridx=1;ccna.gridy=4;
			ccna.anchor=GridBagConstraints.LINE_END;
			pana2.add(l30,ccna);
			ccna.gridx=2;ccna.gridy=4;
			ccna.anchor=GridBagConstraints.LINE_START;
			pana2.add(t30,ccna);
			
			ccna.gridx=1;ccna.gridy=5;
			ccna.anchor=GridBagConstraints.LINE_END;
			//pana2.add(l31,ccna);
			ccna.gridx=2;ccna.gridy=5;
			ccna.anchor=GridBagConstraints.LINE_START;
			//pana2.add(t31,ccna);
			
			ccna.gridx=1;ccna.gridy=6;
			ccna.anchor=GridBagConstraints.LINE_END;
			//pana2.add(l32,ccna);
			ccna.gridx=2;ccna.gridy=6;
			ccna.anchor=GridBagConstraints.LINE_START;
			//pana2.add(t32,ccna);
			
			ccna.gridx=1;ccna.gridy=7;
			ccna.anchor=GridBagConstraints.LINE_END;
			pana2.add(l33,ccna);
			ccna.gridx=2;ccna.gridy=7;
			ccna.anchor=GridBagConstraints.LINE_START;
			pana2.add(t33,ccna);
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			    pana3.setLayout(new GridBagLayout());
				ccna.fill=GridBagConstraints.HORIZONTAL;
				ccna.weightx=1;ccna.weighty=1;
				ccna.insets=new Insets(2,2,2,3);

				
				ccna.gridx=1;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_END;
				//pana3.add(l37,ccna);
				ccna.gridx=2;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_START;
				//pana3.add(t37,ccna);
				
				ccna.gridx=1;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana3.add(l38,ccna);
				ccna.gridx=2;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana3.add(t38,ccna);
				
				ccna.gridx=1;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana3.add(l39,ccna);
				ccna.gridx=2;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana3.add(t39,ccna);
				
				ccna.gridx=1;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_END;
				//pana3.add(l40,ccna);
				ccna.gridx=2;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_START;
				//pana3.add(t40,ccna);
				
				ccna.gridx=1;ccna.gridy=5;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana3.add(l41,ccna);
				ccna.gridx=2;ccna.gridy=5;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana3.add(t41,ccna);
				
				ccna.gridx=1;ccna.gridy=6;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana3.add(l42,ccna);
				ccna.gridx=2;ccna.gridy=6;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana3.add(t42,ccna);
				
				ccna.gridx=1;ccna.gridy=7;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana3.add(l43,ccna);
				ccna.gridx=2;ccna.gridy=7;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana3.add(t43,ccna);
				
			/////////////////////////////////////////////////////////////////////////////////////////
				pana5.setLayout(new GridBagLayout());
				ccna.fill=GridBagConstraints.HORIZONTAL;
				ccna.weightx=1;ccna.weighty=1;
				ccna.insets=new Insets(2,2,2,3);

				
				ccna.gridx=1;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana5.add(la1,ccna);
				ccna.gridx=2;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana5.add(ta1,ccna);
				
				ccna.gridx=1;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana5.add(la2,ccna);
				ccna.gridx=2;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana5.add(ta2,ccna);
				
				ccna.gridx=1;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana5.add(la3,ccna);
				ccna.gridx=2;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana5.add(ta3,ccna);
				
				ccna.gridx=1;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana5.add(la4,ccna);
				ccna.gridx=2;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana5.add(ta4,ccna);
				
				
				
				
				pana6.setLayout(new GridBagLayout());
				ccna.fill=GridBagConstraints.HORIZONTAL;
				ccna.weightx=1;ccna.weighty=1;
				ccna.insets=new Insets(2,2,2,3);

				
				ccna.gridx=1;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana6.add(la5,ccna);
				ccna.gridx=2;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana6.add(ta5,ccna);
				
				ccna.gridx=1;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana6.add(la6,ccna);
				ccna.gridx=2;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana6.add(ta6,ccna);
				
				ccna.gridx=1;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana6.add(la7,ccna);
				ccna.gridx=2;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana6.add(ta7,ccna);
				
				ccna.gridx=1;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana6.add(la8,ccna);
				ccna.gridx=2;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana6.add(ta8,ccna);
				
				ccna.gridx=1;ccna.gridy=5;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana6.add(la9,ccna);
				ccna.gridx=2;ccna.gridy=5;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana6.add(ta9,ccna);
				
				
				
				pana7.setLayout(new GridBagLayout());
				ccna.fill=GridBagConstraints.HORIZONTAL;
				ccna.weightx=1;ccna.weighty=1;
				ccna.insets=new Insets(2,2,2,3);
				ccna.gridx=1;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana7.add(la10,ccna);
				ccna.gridx=2;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana7.add(ta10,ccna);
				
				ccna.gridx=1;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana7.add(la11,ccna);
				ccna.gridx=2;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana7.add(ta11,ccna);
				
				ccna.gridx=1;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana7.add(la12,ccna);
				ccna.gridx=2;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana7.add(ta12,ccna);
				
				ccna.gridx=1;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana7.add(la13,ccna);
				ccna.gridx=2;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana7.add(ta13,ccna);
				
				ccna.gridx=1;ccna.gridy=5;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana7.add(la14,ccna);
				ccna.gridx=2;ccna.gridy=5;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana7.add(ta14,ccna);
				
				
				pana8.setLayout(new GridBagLayout());
				ccna.fill=GridBagConstraints.HORIZONTAL;
				ccna.weightx=1;ccna.weighty=1;
				ccna.insets=new Insets(2,2,2,3);
				ccna.gridx=1;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana8.add(la15,ccna);
				ccna.gridx=2;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana8.add(ta15,ccna);
				
				ccna.gridx=1;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana8.add(la16,ccna);
				ccna.gridx=2;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana8.add(ta16,ccna);
				
				ccna.gridx=1;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana8.add(la17,ccna);
				ccna.gridx=2;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana8.add(ta17,ccna);
				
				ccna.gridx=1;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana8.add(la18,ccna);
				ccna.gridx=2;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana8.add(ta18,ccna);
				
				
				pana9.setLayout(new GridBagLayout());
				ccna.fill=GridBagConstraints.HORIZONTAL;
				ccna.weightx=1;ccna.weighty=1;
				ccna.insets=new Insets(2,2,2,3);
				ccna.gridx=1;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana9.add(la19,ccna);
				ccna.gridx=2;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana9.add(ta19,ccna);
				
				ccna.gridx=1;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana9.add(la20,ccna);
				ccna.gridx=2;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana9.add(ta20,ccna);
				
				ccna.gridx=1;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana9.add(la21,ccna);
				ccna.gridx=2;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana9.add(ta21,ccna);
				
				ccna.gridx=1;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana9.add(la22,ccna);
				ccna.gridx=2;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana9.add(ta22,ccna);
				
				
				pana10.setLayout(new GridBagLayout());
				ccna.fill=GridBagConstraints.HORIZONTAL;
				ccna.weightx=1;ccna.weighty=1;
				ccna.insets=new Insets(2,2,2,3);
				ccna.gridx=1;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana10.add(la23,ccna);
				ccna.gridx=2;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana10.add(ta23,ccna);
				
				ccna.gridx=1;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana10.add(la24,ccna);
				ccna.gridx=2;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana10.add(ta24,ccna);
				
				ccna.gridx=1;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana10.add(la25,ccna);
				ccna.gridx=2;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana10.add(ta25,ccna);
				
				ccna.gridx=1;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana10.add(la26,ccna);
				ccna.gridx=2;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana10.add(ta26,ccna);
				
				
				
				pana11.setLayout(new GridBagLayout());
				ccna.fill=GridBagConstraints.HORIZONTAL;
				ccna.weightx=1;ccna.weighty=1;
				ccna.insets=new Insets(2,2,2,3);
				ccna.gridx=1;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana11.add(la27,ccna);
				ccna.gridx=2;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana11.add(ta27,ccna);
				
				ccna.gridx=1;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana11.add(la28,ccna);
				ccna.gridx=2;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana11.add(ta28,ccna);
				
				ccna.gridx=1;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana11.add(la29,ccna);
				ccna.gridx=2;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana11.add(ta29,ccna);
				
				ccna.gridx=1;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana11.add(la30,ccna);
				ccna.gridx=2;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana11.add(ta30,ccna);
				
				pana12.setLayout(new GridBagLayout());
				ccna.fill=GridBagConstraints.HORIZONTAL;
				ccna.weightx=1;ccna.weighty=1;
				ccna.insets=new Insets(2,2,2,3);
				ccna.gridx=1;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana12.add(la31,ccna);
				ccna.gridx=2;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana12.add(ta31,ccna);
				
				ccna.gridx=1;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana12.add(la32,ccna);
				ccna.gridx=2;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana12.add(ta32,ccna);
				
				ccna.gridx=1;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana12.add(la33,ccna);
				ccna.gridx=2;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana12.add(ta33,ccna);
				
				ccna.gridx=1;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana12.add(la34,ccna);
				ccna.gridx=2;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana12.add(ta34,ccna);

				pana13.setLayout(new GridBagLayout());
				ccna.fill=GridBagConstraints.HORIZONTAL;
				ccna.weightx=1;ccna.weighty=1;
				ccna.insets=new Insets(2,2,2,3);
				ccna.gridx=1;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana13.add(la35,ccna);
				ccna.gridx=2;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana13.add(ta35,ccna);
				
				ccna.gridx=1;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana13.add(la36,ccna);
				ccna.gridx=2;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana13.add(ta36,ccna);
				
				ccna.gridx=1;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana13.add(la37,ccna);
				ccna.gridx=2;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana13.add(ta37,ccna);
				
				ccna.gridx=1;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana13.add(la38,ccna);
				ccna.gridx=2;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana13.add(ta38,ccna);

				pana14.setLayout(new GridBagLayout());
				ccna.fill=GridBagConstraints.HORIZONTAL;
				ccna.weightx=1;ccna.weighty=1;
				ccna.insets=new Insets(2,2,2,3);
				ccna.gridx=1;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana14.add(la39,ccna);
				ccna.gridx=2;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana14.add(ta39,ccna);
				
				ccna.gridx=1;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana14.add(la40,ccna);
				ccna.gridx=2;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana14.add(ta40,ccna);
				
				ccna.gridx=1;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana14.add(la41,ccna);
				ccna.gridx=2;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana14.add(ta41,ccna);
				
				ccna.gridx=1;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana14.add(la42,ccna);
				ccna.gridx=2;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana14.add(ta42,ccna);
				
				pana15.setLayout(new GridBagLayout());
				ccna.fill=GridBagConstraints.HORIZONTAL;
				ccna.weightx=1;ccna.weighty=1;
				ccna.insets=new Insets(2,2,2,3);
				ccna.gridx=1;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana15.add(la43,ccna);
				ccna.gridx=2;ccna.gridy=1;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana15.add(ta43,ccna);
				
				ccna.gridx=1;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana15.add(la44,ccna);
				ccna.gridx=2;ccna.gridy=2;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana15.add(ta44,ccna);
				
				ccna.gridx=1;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana15.add(la45,ccna);
				ccna.gridx=2;ccna.gridy=3;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana15.add(ta45,ccna);
				
				ccna.gridx=1;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_END;
				pana15.add(la46,ccna);
				ccna.gridx=2;ccna.gridy=4;
				ccna.anchor=GridBagConstraints.LINE_START;
				pana15.add(ta46,ccna);

				//////////////////////////////////////////////////
	
	p4.setLayout(new GridBagLayout());
	GridBagConstraints c=new GridBagConstraints();
	c.fill=GridBagConstraints.HORIZONTAL;
	c.weightx=1;c.weighty=0.2;
	c.insets=new Insets(5,5,5,5);

	c.gridx=1;c.gridy=1;
	c.anchor=GridBagConstraints.LINE_END;
	p4.add(l0,c);
	c.gridx=2;c.gridy=1;
	c.anchor=GridBagConstraints.LINE_START;
	p4.add(t0,c);

	c.gridx=1;c.gridy=2;
	c.anchor=GridBagConstraints.LINE_END;
	p4.add(l1,c);
	c.gridx=2;c.gridy=2;
	c.anchor=GridBagConstraints.LINE_START;
	p4.add(t1,c);

	c.gridx=1;c.gridy=3;
	c.anchor=GridBagConstraints.LINE_END;
	p4.add(l2,c);
	c.gridx=2;c.gridy=3;
	c.anchor=GridBagConstraints.LINE_START;
	p4.add(t2,c);

	c.gridx=1;c.gridy=4;
	c.anchor=GridBagConstraints.LINE_END;
	p4.add(l3,c);
	c.gridx=2;c.gridy=4;
	c.anchor=GridBagConstraints.LINE_START;
	p4.add(t3,c);

	c.gridx=1;c.gridy=5;
	c.anchor=GridBagConstraints.LINE_END;
	p4.add(l4,c);
	c.gridx=2;c.gridy=5;
	c.anchor=GridBagConstraints.LINE_START;
	p4.add(t4,c);

	c.gridx=1;c.gridy=6;
	c.anchor=GridBagConstraints.LINE_END;
	p4.add(l5,c);
	c.gridx=2;c.gridy=6;
	c.anchor=GridBagConstraints.LINE_START;
	p4.add(t5,c);

	c.gridx=1;c.gridy=7;
	c.anchor=GridBagConstraints.LINE_END;
	p4.add(l6,c);
	c.gridx=2;c.gridy=7;
	c.anchor=GridBagConstraints.LINE_START;
	p4.add(t6,c);
	
	c.gridx=1;c.gridy=8;
	c.anchor=GridBagConstraints.LINE_END;
	p4.add(label7,c);
	c.gridx=2;c.gridy=8;
	c.anchor=GridBagConstraints.LINE_START;
	p4.add(box5,c);
	
	c.gridx=1;c.gridy=9;
	c.anchor=GridBagConstraints.LINE_END;
	p4.add(ll7,c);
	c.gridx=2;c.gridy=9;
	c.anchor=GridBagConstraints.LINE_START;
	p4.add(tt7,c);
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	pana4.setLayout(new GridBagLayout());
	c.fill=GridBagConstraints.HORIZONTAL;
	c.weightx=1;c.weighty=0.2;
	c.insets=new Insets(5,5,5,5);

	c.gridx=1;c.gridy=1;
	c.anchor=GridBagConstraints.LINE_END;
	pana4.add(l50,c);
	c.gridx=2;c.gridy=1;
	c.anchor=GridBagConstraints.LINE_START;
	pana4.add(t50,c);

	c.gridx=1;c.gridy=2;
	c.anchor=GridBagConstraints.LINE_END;
	pana4.add(l51,c);
	c.gridx=2;c.gridy=2;
	c.anchor=GridBagConstraints.LINE_START;
	pana4.add(t51,c);

	c.gridx=1;c.gridy=3;
	c.anchor=GridBagConstraints.LINE_END;
	pana4.add(l52,c);
	c.gridx=2;c.gridy=3;
	c.anchor=GridBagConstraints.LINE_START;
	pana4.add(t52,c);

	c.gridx=1;c.gridy=4;
	c.anchor=GridBagConstraints.LINE_END;
	pana4.add(l53,c);
	c.gridx=2;c.gridy=4;
	c.anchor=GridBagConstraints.LINE_START;
	pana4.add(t53,c);

	c.gridx=1;c.gridy=5;
	c.anchor=GridBagConstraints.LINE_END;
	pana4.add(l54,c);
	c.gridx=2;c.gridy=5;
	c.anchor=GridBagConstraints.LINE_START;
	pana4.add(t54,c);

	c.gridx=1;c.gridy=6;
	c.anchor=GridBagConstraints.LINE_END;
	pana4.add(l55,c);
	c.gridx=2;c.gridy=6;
	c.anchor=GridBagConstraints.LINE_START;
	pana4.add(t55,c);

	c.gridx=1;c.gridy=7;
	c.anchor=GridBagConstraints.LINE_END;
	pana4.add(l56,c);
	c.gridx=2;c.gridy=7;
	c.anchor=GridBagConstraints.LINE_START;
	pana4.add(t56,c);
	
	c.gridx=1;c.gridy=8;
	c.anchor=GridBagConstraints.LINE_END;
	pana4.add(label77,c);
	c.gridx=2;c.gridy=8;
	c.anchor=GridBagConstraints.LINE_START;
	pana4.add(box55,c);
	
	c.gridx=1;c.gridy=9;
	c.anchor=GridBagConstraints.LINE_END;
	pana4.add(ll17,c);
	c.gridx=2;c.gridy=9;
	c.anchor=GridBagConstraints.LINE_START;
	pana4.add(tt17,c);

	p8.setLayout(new GridBagLayout());
	GridBagConstraints c8=new GridBagConstraints();
	c8.fill=GridBagConstraints.HORIZONTAL;
	c8.weightx=1;c8.weighty=1;
	c8.insets=new Insets(5,5,5,5);
	c8.gridwidth=GridBagConstraints.RELATIVE;
	c8.fill=GridBagConstraints.HORIZONTAL;
	c8.gridwidth=GridBagConstraints.BOTH;
	
	c8.gridx=1;c8.gridy=2;
	p8.add(b1, c8);

	c8.gridx=2;c8.gridy=2;
	p8.add(b3, c8);

	c8.gridx=1;c8.gridy=3;
	p8.add(b5, c8);

	c8.gridx=2;c8.gridy=3;
	p8.add(b4, c8);

	c8.gridx=1;c8.gridy=4;
	//p8.add(b5, c8);

	c8.gridx=2;c8.gridy=4;
	//p8.add(b6, c8);
	

	p9.setLayout(new GridBagLayout());
	c3.insets=new Insets(0,1,0,1);
	c3.gridx=1;c3.gridy=1;
	p9.add(area, c3);
	
	
	p11.setLayout(new GridBagLayout());
	c8.fill=GridBagConstraints.HORIZONTAL;
	c8.weightx=1;c8.weighty=1;
	c8.insets=new Insets(5,5,5,5);
	c8.gridwidth=GridBagConstraints.RELATIVE;
	c8.fill=GridBagConstraints.HORIZONTAL;
	c8.gridwidth=GridBagConstraints.BOTH;
	
	c8.gridx=1;c8.gridy=2;
	p11.add(b7, c8);//b7.setBackground(Color.pink);

	c8.gridx=2;c8.gridy=2;
	//p11.add(b6, c8);
	     
	
	    validatey();
		bar();
		button();
		table();
		//area();
	//	update();
		resert();
		field();
		text();
	    grade();
	    table2();
	    table3();
	}
	
	private void table3() {
		
		 try {
			   

				String sql="Select id as 'USER ID',first as 'FIRSTNAME',last as 'LASTNAME',combi as 'COMBI',gs as 'GS' ,phy as 'PHYSICS',che as 'CHEMISTRY',math as 'MATH',bio as 'BIOLOGY',geo as 'GEOGRAPHY',bam as 'BAM'  from mark where class='"+boxn.getSelectedItem().toString()+"'   ORDER BY gender ASC,first ASC,last ASC ";
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
				table2.setModel(DbUtils.resultSetToTableModel(rs));
				table2.setFont(new Font("serif",Font.PLAIN,11));
				table2.setForeground(new Color(0,0,139));
				
		   }catch(Exception ex) {
			   
		   }
		
	}

	private void table2() {


		
		boxn.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(boxn.getSelectedItem().equals("FORM V") || boxn.getSelectedItem().equals("FORM VI")) {
					
					try {
						
						String sql="Select id as 'USER ID',first as 'FIRSTNAME',last as 'LASTNAME',combi as 'COMBI',gs as 'GS' ,phy as 'PHYSICS',che as 'CHEMISTRY',math as 'MATH',bio as 'BIOLOGY',geo as 'GEOGRAPHY',bam as 'BAM'  from mark where class='"+boxn.getSelectedItem().toString()+"'   ORDER BY gender ASC,first ASC,last ASC  ";
						ps=con.prepareStatement(sql);
						rs=ps.executeQuery();
						table2.setModel(DbUtils.resultSetToTableModel(rs));
						table2.setFont(new Font("serif",Font.PLAIN,11));
						table2.setForeground(new Color(0,0,139));
						
						ban.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								
								int rows = table2.getRowCount();
			    				for(int row = 0;row <rows; row++) {
			    					try {
			    						
			    					
			    					String id = (String) table2.getValueAt(row, 0);
			    					String combi = (String) table2.getValueAt(row, 3);
			    					String general = (String) table2.getValueAt(row, 4);
			    					String physics = (String) table2.getValueAt(row, 5);
			    					String chemistry = (String) table2.getValueAt(row, 6);
			    					String mathe = (String) table2.getValueAt(row, 7);
			    					String biology = (String) table2.getValueAt(row, 8);
			    					String geography = (String) table2.getValueAt(row, 9);
			    					String bamm = (String) table2.getValueAt(row, 10);
			    					
			    		          
			    				if(combi.matches("PCM")) {
			    				
			    					String gp="",gc = "",gm = "",gg,g1="",g2 = "",g3 = "",g4 ="",sm;
			    					String m1;
			    	    			String m2;
			    	    			String m3;
			    	    			String m4;
			    	    			double phy=0.0;double che=0.0;double math=0.0;double gs=0.0;
			    					
			    	            	
			    		            try {
			    		            	
			    		            	
			    		    			if(physics.matches("-") ||physics.isEmpty()) {
			    		    				 g1="";gp="Inc";m1="";
			    		    			}else  {
			    		    				m1=physics;
			    	    				  phy=Double.parseDouble(physics);
			    	    	    			
			    	    				
			    	    						if(phy>=grd1 && phy<=grd2){
			    	    	    	    		       g1="A";gp="1";
			    	    	    	    		      }else if(phy>=grd3 && phy<grd4){
			    	    	    	    		    	  g1="B";gp="2";
			    	    	    	    		      }
			    	    	    	    		      else if(phy>=grd5 && phy<grd6){
			    	    	    	    		    	  g1="C";gp="3";
			    	    	    	    		      }
			    	    	    	    		      else if(phy>=grd7 && phy<grd8){
			    	    	    	    		    	  g1= "D";gp="4";
			    	    	    	    			      }
			    	    	    	    			  else if(phy>=grd9 && phy<grd10){
			    	    	    	    				  g1="E";gp="5";
			    	    	    	    			      }
			    	    	    	    			  else if(phy>=grd11 && phy<grd12){
			    	    	    	    				  g1= "S";gp="6";
			    	    	    	    			      } 
			    	    	    	    			      else if(phy>=grd13 && phy<grd14) {
			    	    	    	    			    	  g1="F";gp="7";
			    	    	    	    			    
			    	    	    	    			      }
			    	    					
			    	    	    			
			    		    				}
			    		    					
			    		    				
			    		    			
			    		    			if(chemistry.isEmpty() ||chemistry.matches("-")) {
			    		    				m2="";g2="";gc="Inc";
			    		    			}else {
			    		    				
			    		    				m2= chemistry;
			    		    				che=Double.parseDouble(chemistry);
			    		    			     if(che>=grd1 && che<=grd2){
			    		    			       g2= "A";gc="1";
			    		    			      }else if(che>=grd3 && che<grd4){
			    		    			    	  g2= "B";gc="2";
			    		    			      }
			    		    			      else if(che>=grd5 && che<grd6){
			    		    			    	  g2= "C";gc="3";
			    		    			      }
			    		    			      else if(che>=grd7 && che<grd8){
			    		    			    	  g2= "D";gc="4";
			    		    				      }
			    		    				  else if(che>=grd9 && che<grd10){
			    		    					  g2= "E";gc="5";
			    		    				      }
			    		    				  else if(che>=grd11 && che<grd12){
			    		    					  g2= "S";gc="6";
			    		    				      }
			    		    				      else if(che>=grd13 && che<grd14) {
			    		    				    	  g2= "F";gc="7";
			    		    				      }}
			    		            
			    		    			
			    		    			
			    		    			
			    		    			
			    		    			if(mathe.isEmpty() || mathe.matches("-")) {
			    		    				m3="";g3="";gm="Inc";
			    		    			}else {
			    		    		        m3= mathe;
			    		    		        
			    		    		        math=Double.parseDouble(mathe);
			    		    		       	if(math>=grd1 && math<=grd2){
			    		    			       g3="A";gm="1";
			    		    			      }else if(math>=grd3 && math<grd4){
			    		    			    	  g3= "B";gm="2";
			    		    			      }
			    		    			      else if(math>=grd5 && math<grd6){
			    		    			    	  g3="C";gm="3";
			    		    			      }
			    		    			      else if(math>=grd7 && math<grd8){
			    		    			    	  g3="D";gm="4";
			    		    				      }
			    		    				  else if(math>=grd9 && math<grd10){
			    		    					  g3="E";gm="5";
			    		    				      }
			    		    				  else if(math>=grd11 && math<grd12){
			    		    					  g3= "S";gm="6";
			    		    				      }
			    		    				      else if(math>=grd13 && math<grd14) {
			    		    				    	  g3="F";gm="7";
			    		    				      }
			    		    				      }
			    		    			
			    		    			
			    		    			
			    		    			if(general.isEmpty() || general.matches("-")) {
			    		    				m4="";g4="";gg="Inc";
			    		    			}else {
			    		    				m4= general;
			    		    				 gs=Double.parseDouble(general);
			    		    			     if(gs>=grd1 && gs<=grd2){
			    		    			       g4="A";gg="1";
			    		    			      }else if(gs>=grd3 && gs<grd4){
			    		    			    	  g4= "B";gg="2";
			    		    			      }
			    		    			      else if(gs>=grd5 && gs<grd6){
			    		    			    	  g4="C";gg="3";
			    		    			      }
			    		    			      else if(gs>=grd7 && gs<grd8){
			    		    			    	  g4="D";gg="4";
			    		    				      }
			    		    				  else if(gs>=grd9 && gs<grd10){
			    		    					  g4= "E";gg="5";
			    		    				      }
			    		    				  else if(gs>=grd11 && gs<grd12){
			    		    					  g4="S";gg="6";
			    		    				      }
			    		    				      else if(gs>=grd13 && gs<grd14) {
			    		    				    	  g4="F";gg="7";
			    		    				      }
			    		    			}
			    		    			
			    		    			if(!physics.isEmpty() &&!mathe.matches("-")&&!chemistry.isEmpty() &&!mathe.isEmpty() &&!physics.matches("-")&&!chemistry.matches("-"))
			    		    			{
			    		    				int pp=Integer.parseInt(gp);
			    		    				int pc=Integer.parseInt(gc);
			    		    				int pm=Integer.parseInt(gm);
			    		    				
			    		    				
			    		    				int sum=pp+pc+pm;
			    		    				sm=Integer.toString(sum);
			    		    				
			    		    				
			    		    			}
			    		    			else {
			    		    				 sm="Inc";
			    		    			}
			    		    			if(((phy>=0 &&phy<=100) ||physics.isEmpty()) && ((che>=0 &&che<=100) ||chemistry.isEmpty()) && ((math>=0 &&math<=100) ||mathe.isEmpty()) && ((gs>=0 &&gs<=100) ||general.isEmpty()) ) {
			    		    				 String sq="update mark set phy='"+m1+"',gphy='"+g1+"',che='"+m2+"',gche='"+g2+"',math='"+m3+"',gmath='"+g3+"',gs='"+m4+"',ggs='"+g4+"',point='"+sm+"' where id='"+id+"' ";
			    		    					ps=con.prepareStatement(sq);
			    		    					ps.execute();
			    		    					ps.addBatch();
			    		    					ps.executeBatch();
			    		    					
			    		    			}else {
			    		    				
			    		    				 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
			    		    			}
			    		    				      
			    		    	   
			    		    			
			    		             }catch(Exception ex) {
			    			                JOptionPane.showMessageDialog(null,ex.getStackTrace());
			    		                }
			    	                        finally {
			    						
			    						try {
			    							rs.close();
			    							ps.close();
			    							
			    							
			    						}catch(Exception e) {
			    							
			    						}
			    						
			    					}
			    		           
			    		            
			    		            
			    				
			    				}
			    			      	
			    				
			    				else if(combi.matches("PCB")) {
			    					

			    						 String gp = "",gc = null,gm,gg,g1 = null,g2 = null,g3 = null,g4 = null,g5 = null,gb = null,sm;
			    				            try {
			    				            	
			    				            
			    				            	String m1;
			    				    			String m2;
			    				    			String m3;
			    				    			String m4;
			    				    			String m5;
			    				    			double phy=0.0,bio=0.0,che=0.0,bam=0.0,gs=0.0;
			    				    			
			    				    			if(physics.isEmpty() || physics.matches("-")) {
			    				    				m1="";g1="";gp="Inc";
			    				    			}else {
			    				    				m1=physics;
			    				    				 phy=Double.parseDouble(physics);
			    					    			
			    					    			if(phy>=grd1 && phy<=grd2){
			    					    		       g1="A";gp="1";
			    					    		      }else if(phy>=grd3 && phy<grd4){
			    					    		    	  g1="B";gp="2";
			    					    		      }
			    					    		      else if(phy>=grd5 && phy<grd6){
			    					    		    	  g1="C";gp="3";
			    					    		      }
			    					    		      else if(phy>=grd7 && phy<grd8){
			    					    		    	  g1= "D";gp="4";
			    					    			      }
			    					    			  else if(phy>=grd9 && phy<grd10){
			    					    				  g1="E";gp="5";
			    					    			      }
			    					    			  else if(phy>=grd11 && phy<grd12){
			    					    				  g1= "S";gp="6";
			    					    			      }
			    					    			  else if(phy>=grd13 && phy<grd14){
			    					    				  g1="F";gp="7";
			    					    			  }
			    				    			}
			    				    			
			    				    			
			    				    			
			    				    			
			    				    			if(chemistry.isEmpty()|| chemistry.matches("-")) {
			    				    				m2="";g2="";gc="Inc";
			    				    			}else {
			    				    				m2= chemistry;
			    				    				 che=Double.parseDouble(chemistry);
			    				    			     if(che>=grd1 && che<=grd2){
			    				    			       g2= "A";gc="1";
			    				    			      }else if(che>=grd3 && che<grd4){
			    				    			    	  g2= "B";gc="2";
			    				    			      }
			    				    			      else if(che>=grd5 && che<grd6){
			    				    			    	  g2= "C";gc="3";
			    				    			      }
			    				    			      else if(che>=grd7 && che<grd8){
			    				    			    	  g2= "D";gc="4";
			    				    				      }
			    				    				  else if(che>=grd9 && che<grd10){
			    				    					  g2= "E";gc="5";
			    				    				      }
			    				    				  else if(che>=grd11 && che<grd12){
			    				    					  g2= "S";gc="6";
			    				    				      }
			    				    				      else if(che>=grd13 && che<grd14){
			    				    				    	  g2= "F";gc="7";
			    				    				      }
			    				    			}
			    				    			
			    				    			
			    				    			if(biology.isEmpty() || biology.matches("-")) {
			    				    				m3="";g3="";gb="Inc";
			    				    			}else {
			    				    		        m3= biology;
			    				    		        bio=Double.parseDouble(biology);
			    				    		        if(bio>=grd1 && bio<=grd2){
			    					    			       g3="A";gb="1";
			    					    			      }else if(bio>=grd3 && bio<grd4){
			    					    			    	  g3= "B";gb="2";
			    					    			      }
			    					    			      else if(bio>=grd5 && bio<grd6){
			    					    			    	  g3="C";gb="3";
			    					    			      }
			    					    			      else if(bio>=grd7 && bio<grd8){
			    					    			    	  g3="D";gb="4";
			    					    				      }
			    					    				  else if(bio>=grd9 && bio<grd10){
			    					    					  g3="E";gb="5";
			    					    				      }
			    					    				  else if(bio>=grd11 && bio<grd12){
			    					    					  g3= "S";gb="6";
			    					    				      }
			    					    				      else if(bio>=grd13 && bio<grd14)  {
			    					    				    	  g3="F";gb="7";
			    					    				      }
			    				    			}
			    				    			
			    				    			
			    				    			if(bamm.isEmpty() || bamm.matches("-")) {
			    				    				gm="Inc";m4="";g4="";
			    				    			}else {
			    				    				m4= bamm;
			    				    	           bam=Double.parseDouble(bamm);
			    				    			     if(bam>=grd1 && bam<=grd2){
			    				    			       g4="A";gm="1";
			    				    			      }else if(bam>=grd3 && bam<grd4){
			    				    			    	  g4= "B";gm="2";
			    				    			      }
			    				    			      else if(bam>=grd5 && bam<grd6){
			    				    			    	  g4="C";gm="3";
			    				    			      }
			    				    			      else if(bam>=grd7 && bam<grd8){
			    				    			    	  g4="D";gm="4";
			    				    				      }
			    				    				  else if(bam>=grd9 && bam<grd10){
			    				    					  g4= "E";gm="5";
			    				    				      }
			    				    				  else if(bam>=grd11 && bam<grd12){
			    				    					  g4="S";gm="6";
			    				    				      }
			    				    				      else if(bam>=grd13 && bam<grd14) {
			    				    				    	  g4="F";gm="7";
			    				    				      }
			    				    			}
			    				    			
			    				    			if(general.isEmpty() ||general.matches("-")) {
			    				    				gg="Inc";g5="";m5="";
			    				    			}else {
			    				    				m5= general;
			    				    				 gs=Double.parseDouble(general);
			    				    			     if(gs>=grd1 && gs<=grd2){
			    				    			       g5="A";gg="1";
			    				    			      }else if(gs>=grd3 && gs<grd4){
			    				    			    	  g5= "B";gg="2";
			    				    			      }
			    				    			      else if(gs>=grd5 && gs<grd6){
			    				    			    	  g5="C";gg="3";
			    				    			      }
			    				    			      else if(gs>=grd7 && gs<grd8){
			    				    			    	  g5="D";gg="4";
			    				    				      }
			    				    				  else if(gs>=grd9 && gs<grd10){
			    				    					  g5= "E";gg="5";
			    				    				      }
			    				    				  else if(gs>=grd11 && gs<grd12){
			    				    					  g5="S";gg="6";
			    				    				      }
			    				    				      else if(gs>=grd13 && gs<grd14) {
			    				    				    	  g5="F";gg="7";
			    				    				      }
			    				    			}
			    				    			
			    				    			
			    				    			if(!physics.isEmpty()&&!chemistry.isEmpty() &&!biology.isEmpty()&&!chemistry.matches("-")&&!biology.matches("-") && !physics.matches("-"))
			    				    			{
			    				    				int pp=Integer.parseInt(gp);
			    				    				int pc=Integer.parseInt(gc);
			    				    				int pb=Integer.parseInt(gb);
			    				    				
			    				    				
			    				    				int sum=pp+pc+pb;
			    				    				sm=Integer.toString(sum);
			    				    				
			    				    				
			    				    			}
			    				    			else {
			    				    				 sm="Inc";
			    				    			}
			    				    			
			    				    			if(((phy>=0 &&phy<=100) ||physics.isEmpty()) && ((che>=0 &&che<=100) ||chemistry.isEmpty()) && ((bio>=0 &&bio<=100) ||biology.isEmpty()) && ((gs>=0 &&gs<=100) ||general.isEmpty()) && ((bam>=0 &&bam<=100) ||bamm.isEmpty()) ) {
			    				    			      
			    						    	    String sq="update mark set phy='"+m1+"',gphy='"+g1+"',che='"+m2+"',gche='"+g2+"',bio='"+m3+"',gbio='"+g3+"',bam='"+m4+"',gbam='"+g4+"',gs='"+m5+"',ggs='"+g5+"',point='"+sm+"' where id='"+id+"' ";
			    									ps=con.prepareStatement(sq);
			    									ps.addBatch();
			    									ps.executeBatch();
			    									
			    									
			    				    			}else {
			    				    				
			    				    				 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
			    				    			}
			    				    				
			    				    			
			    				    		
			    					
			    				             }catch(Exception ex) {
			    				            	 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
			    				                } finally {
			    									
			    									try {
			    										rs.close();
			    										ps.close();
			    										
			    									}catch(Exception e) {
			    										
			    									}
			    									
			    								}
			    					           
			    				          
			    				}
			    					
			    				
			    				

			    				else if(combi.matches("PGM")) {
			    					

			    					
			    					 try {
			    			            	
			    			            	//String m1=t27.getText();String m2=t30.getText();String m3=t31.getText();String m4=t33.getText();
			    			    			
			    						 String gp = null,gc="",gm = null,gg,g1 = null,g2="",g3 = null,g4 = null,sm;
			    			            	String m1;
			    			    			String m2="";
			    			    			String m3;
			    			    			String m4;
			    			    			double phy=0.0,geo=0.0,math=0.0,gs=0.0;
			    			    			
			    			    			if(physics.isEmpty() ||physics.matches("-")) {
			    			    				gp="Inc";g1="";m1="";
			    			    			}else {
			    			    				m1=physics;
			    			    			  phy=Double.parseDouble(physics);
			    				    			
			    				    			if(phy>=grd1 && phy<=grd2){
			    				    		       g1="A";gp="1";
			    				    		      }else if(phy>=grd3 && phy<grd4){
			    				    		    	  g1="B";gp="2";
			    				    		      }
			    				    		      else if(phy>=grd5 && phy<grd6){
			    				    		    	  g1="C";gp="3";
			    				    		      }
			    				    		      else if(phy>=grd7 && phy<grd8){
			    				    		    	  g1= "D";gp="4";
			    				    			      }
			    				    			  else if(phy>=grd9 && phy<grd10){
			    				    				  g1="E";gp="5";
			    				    			      }
			    				    			  else if(phy>=grd11 && phy<grd12){
			    				    				  g1= "S";gp="6";
			    				    			      }
			    				    			      else if(phy>=grd13 && phy<grd14) {
			    				    			    	  g1="F";gp="7";
			    				    			      }
			    			    			}
			    			    			
			    			    			if(geography.isEmpty()|| geography.matches("-")) {
			    			    				
			    			    				gc="Inc";m2="";g2="";
			    			    			}
			    			    				
			    			    				else {
			    			    					m2=geography;
			    			    					geo=Double.parseDouble(geography);
			    				    			     if(geo>=grd1 && geo<=grd2){
			    				    			       g2= "A";gc="1";
			    				    			      }else if(geo>=grd3 && geo<grd4){
			    				    			    	  g2= "B";gc="2";
			    				    			      }
			    				    			      else if(geo>=grd5 && geo<grd6){
			    				    			    	  g2= "C";gc="3";
			    				    			      }
			    				    			      else if(geo>=grd7 && geo<grd8){
			    				    			    	  g2= "D";gc="4";
			    				    				      }
			    				    				  else if(geo>=grd9 && geo<grd10){
			    				    					  g2= "E";gc="5";
			    				    				      }
			    				    				  else if(geo>=grd11 && geo<grd12){
			    				    					  g2= "S";gc="6";
			    				    				      }
			    				    				      else if(geo>=grd13 && geo<grd14){
			    				    				    	  g2= "F";gc="7";
			    				    				      }	
			    			    				}
			    			    				
			    			    				
			    			    			
			    			    			if(mathe.isEmpty()|| mathe.matches("-")) {
			    			    				gm="Inc";m3="";g3="";
			    			    			}else {
			    			    		        m3= mathe;
			    			    		        math=Double.parseDouble(mathe);
			    			    		       	if(math>=grd1 && math<=grd2){
			    			    			       g3="A";gm="1";
			    			    			      }else if(math>=grd3 && math<grd4){
			    			    			    	  g3= "B";gm="2";
			    			    			      }
			    			    			      else if(math>=grd5 && math<grd6){
			    			    			    	  g3="C";gm="3";
			    			    			      }
			    			    			      else if(math>=grd7 && math<grd8){
			    			    			    	  g3="D";gm="4";
			    			    				      }
			    			    				  else if(math>=grd9 && math<grd10){
			    			    					  g3="E";gm="5";
			    			    				      }
			    			    				  else if(math>=grd11 && math<grd12){
			    			    					  g3= "S";gm="6";
			    			    				      }
			    			    				      else if(math>=grd13 && math<grd14) {
			    			    				    	  g3="F";gm="7";
			    			    				      }
			    			    			}
			    			    			
			    			    			if(general.isEmpty() ||general.matches("-")) {
			    			    				gg="Inc";m4="";g4="";
			    			    			}else {
			    			    				m4= general;
			    			    				gs=Double.parseDouble(general);
			    			    			     if(gs>=grd1 && gs<=grd2){
			    			    			       g4="A";gg="1";
			    			    			      }else if(gs>=grd3 && gs<grd4){
			    			    			    	  g4= "B";gg="2";
			    			    			      }
			    			    			      else if(gs>=grd5 && gs<grd6){
			    			    			    	  g4="C";gg="3";
			    			    			      }
			    			    			      else if(gs>=grd7 && gs<grd8){
			    			    			    	  g4="D";gg="4";
			    			    				      }
			    			    				  else if(gs>=grd9 && gs<grd10){
			    			    					  g4= "E";gg="5";
			    			    				      }
			    			    				  else if(gs>=grd11 && gs<grd12){
			    			    					  g4="S";gg="6";
			    			    				      }
			    			    				      else if(gs>=grd13 && gs<grd14) {
			    			    				    	  g4="F";gg="7";
			    			    				      }
			    			    			}
			    			    			
			    			    			
			    			    			if(!physics.isEmpty() && !mathe.matches("-")&&!geography.isEmpty()&&!mathe.isEmpty()&&!geography.isEmpty()&& !physics.matches("-")&&!geography.matches("-") )
			    			    			{
			    			    				int pp=Integer.parseInt(gp);
			    			    				int pc=Integer.parseInt(gc);
			    			    				int pm=Integer.parseInt(gm);
			    			    				
			    			    				
			    			    				int sum=pp+pc+pm;
			    			    				sm=Integer.toString(sum);
			    			    				
			    			    				
			    			    			}
			    			    			else {
			    			    				 sm="Inc";
			    			    			}
			    			    			
			    			    			if(((phy>=0 &&phy<=100) ||physics.isEmpty()) && ((geo>=0 && geo<=100) ||geography.isEmpty()) && ((math>=0 &&math<=100) ||t30.getText().isEmpty()) && ((gs>=0 &&gs<=100) ||general.isEmpty()) ) {
			    			    				
			    			    				String sq="update mark set phy='"+m1+"',gphy='"+g1+"',geo='"+m2+"',ggeo='"+g2+"',math='"+m3+"',gmath='"+g3+"',gs='"+m4+"',ggs='"+g4+"',point='"+sm+"' where id='"+id+"' ";
			    			 					ps=con.prepareStatement(sq);
			    			 					ps.addBatch();
			    			 					ps.executeBatch();
			    			 					
			    			 			
			    			    				
			    			    			}else {
			    			    				
			    			    				 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
			    			    			}
			    			    				
			    			    			
			    			             }catch(Exception ex) {
			    			            	 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
			    			                }  finally {
			    								
			    								try {
			    									rs.close();
			    									ps.close();
			    									
			    									
			    								}catch(Exception e) {
			    									
			    								}
			    								
			    							}
			    				           
			    						
			    				}
			    					
			    			
			    		
			    				
			    				else	if(combi.matches("CBG")) {
			    					
			    					
			    					 try {
			    			           
			    			    		
			    						 String gp,gc = null,gm = null,gg,g1 = null,g2="",g3 = null,g4 = null,g5 = null,gb="",sm;
			    			            	String m1;
			    			    			String m2="";
			    			    			String m3="";
			    			    			String m4;
			    			    			String m5;
			    			    			double che=0.0,bio=0.0,geo=0.0,bam=0.0,gs=0.0;
			    			    			
			    			    			if(chemistry.isEmpty()|| chemistry.matches("-")) {
			    			    				m1="";g1="";gc="Inc";
			    			    			}else {
			    			    				m1= chemistry;
			    			    				che=Double.parseDouble(chemistry);
			    			    			     if(che>=grd1 && che<=grd2){
			    			    			       g1= "A";gc="1";
			    			    			      }else if(che>=grd3 && che<grd4){
			    			    			    	  g1= "B";gc="2";
			    			    			      }
			    			    			      else if(che>=grd5 && che<grd6){
			    			    			    	  g1= "C";gc="3";
			    			    			      }
			    			    			      else if(che>=grd7 && che<grd8){
			    			    			    	  g1= "D";gc="4";
			    			    				      }
			    			    				  else if(che>=grd9 && che<grd10){
			    			    					  g1= "E";gc="5";
			    			    				      }
			    			    				  else if(che>=grd11 && che<grd12){
			    			    					  g1= "S";gc="6";
			    			    				      }
			    			    				      else if(che>=grd13 && che<grd14){
			    			    				    	  g1= "F";gc="7";
			    			    				      }
			    			    			}
			    			    			
			    			    			
			    			    			if(biology.isEmpty() ||biology.matches("-")) {
			    			    				gb="Inc";m2="";g2="";
			    			    			}
			    			    				else {
			    			    					m2=biology;
			    			    				 bio=Double.parseDouble(biology);
			    			    		       	if(bio>=grd1 && bio<=grd2){
			    			    			       g2="A";gb="1";
			    			    			      }else if(bio>=grd3 && bio<grd4){
			    			    			    	  g2= "B";gb="2";
			    			    			      }
			    			    			      else if(bio>=grd5 && bio<grd6){
			    			    			    	  g2="C";gb="3";
			    			    			      }
			    			    			      else if(bio>=grd7 && bio<grd8){
			    			    			    	  g2="D";gb="4";
			    			    				      }
			    			    				  else if(bio>=grd9 && bio<grd10){
			    			    					  g2="E";gb="5";
			    			    				      }
			    			    				  else if(bio>=grd11 && bio<grd12){
			    			    					  g2= "S";gb="6";
			    			    				      }
			    			    				      else if(bio>=grd13 && bio<grd14) {
			    			    				    	  g2="F";gb="7";
			    			    				      }
			    			    				}
			    			    			
			    			    			
			    			    			if(geography.isEmpty()||geography.matches("-")) {
			    			    				gm="Inc";m3="";g3="";
			    			    			}else {
			    			    				
			    	                              m3=geography;
			    			    				 geo=Double.parseDouble(geography);
			    			    			     if(geo>=grd1 && geo<=grd2){
			    			    			       g3= "A";gm="1";
			    			    			      }else if(geo>=grd3 && geo<grd4){
			    			    			    	  g3= "B";gm="2";
			    			    			      }
			    			    			      else if(geo>=grd5 && geo<grd6){
			    			    			    	  g3= "C";gm="3";
			    			    			      }
			    			    			      else if(geo>=grd7 && geo<grd8){
			    			    			    	  g3= "D";gm="4";
			    			    				      }
			    			    				  else if(geo>=grd9 && geo<grd10){
			    			    					  g3= "E";gm="5";
			    			    				      }
			    			    				  else if(geo>=grd11 && geo<grd12){
			    			    					  g3= "S";gm="6";
			    			    				      }
			    			    				      else if(geo>=grd13 && geo<grd14){
			    			    				    	  g3= "F";gm="7";
			    			    				      }
			    			    			
			    			    			}
			    			    				
			    			    			
			    			    			
			    			    			if(bamm.isEmpty()||bamm.matches("-")) {
			    			    				gp="Inc";m4="";g4="";
			    			    			}else {
			    			    				m4= bamm;
			    			    				 bam=Double.parseDouble(bamm);
			    			    			     if(bam>=grd1 && bam<=grd2){
			    			    			       g4="A";gp="1";
			    			    			      }else if(bam>=grd3 && bam<grd4){
			    			    			    	  g4= "B";gp="2";
			    			    			      }
			    			    			      else if(bam>=grd5 && bam<grd6){
			    			    			    	  g4="C";gp="3";
			    			    			      }
			    			    			      else if(bam>=grd7 && bam<grd8){
			    			    			    	  g4="D";gp="4";
			    			    				      }
			    			    				  else if(bam>=grd9 && bam<grd10){
			    			    					  g4= "E";gp="5";
			    			    				      }
			    			    				  else if(bam>=grd11 && bam<grd12){
			    			    					  g4="S";gp="6";
			    			    				      }
			    			    				      else  if(bam>=grd13 && bam<grd14){
			    			    				    	  g4="F";gp="7";
			    			    				      }
			    			    			}
			    			    			
			    			    			
			    			    			if(general.isEmpty()||general.matches("-")) {
			    			    				gg="Inc";m5="";g5="";
			    			    			}else {
			    			    				m5= general;
			    			    			   gs=Double.parseDouble(general);
			    			    			     if(gs>=grd1 && gs<=grd2){
			    			    			       g5="A";gg="1";
			    			    			      }else if(gs>=grd3 && gs<grd4){
			    			    			    	  g5= "B";gg="2";
			    			    			      }
			    			    			      else if(gs>=grd5 && gs<grd6){
			    			    			    	  g5="C";gg="3";
			    			    			      }
			    			    			      else if(gs>=grd7 && gs<grd8){
			    			    			    	  g5="D";gg="4";
			    			    				      }
			    			    				  else if(gs>=grd9 && gs<grd10){
			    			    					  g5= "E";gg="5";
			    			    				      }
			    			    				  else if(gs>=grd11 && gs<grd12){
			    			    					  g5="S";gg="6";
			    			    				      }
			    			    				      else  if(gs>=grd13 && gs<grd14){
			    			    				    	  g5="F";gg="7";
			    			    				      }
			    			    			}
			    			    			
			    			    			
			    			    			
			    			    			if(!geography.matches("-")&&!chemistry.isEmpty()&&!chemistry.matches("-")&&!biology.matches("-") &&!biology.isEmpty() &&!geography.isEmpty() )
			    			    			{
			    			    				int pp=Integer.parseInt(gc);
			    			    				int pc=Integer.parseInt(gb);
			    			    				int pb=Integer.parseInt(gm);
			    			    				
			    			    				
			    			    				int sum=pp+pc+pb;
			    			    				sm=Integer.toString(sum);
			    			    				
			    			    				
			    			    			}
			    			    			else {
			    			    				 sm="Inc";
			    			    			}
			    			    			
			    			    			if(((geo>=0 &&geo<=100) ||geography.isEmpty()) && ((che>=0 &&che<=100) ||chemistry.isEmpty()) && ((bio>=0 &&bio<=100) ||biology.isEmpty()) && ((gs>=0 &&gs<=100) ||general.isEmpty()) && ((bam>=0 &&bam<=100) ||bamm.isEmpty()) ) {
			    			    			      
			    			    				 String sq="update mark set che='"+m1+"',gche='"+g1+"',bio='"+m2+"',gbio='"+g2+"',geo='"+m3+"',ggeo='"+g3+"',bam='"+m4+"',gbam='"+g4+"',gs='"+m5+"',ggs='"+g5+"',point='"+sm+"' where id='"+id+"' ";
			    			 					ps=con.prepareStatement(sq);
			    			 					ps.addBatch();
			    			 					ps.executeBatch();
			    			    				
			    			    			}else {
			    			    				
			    			    				 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
			    			    			}
			    			    				      
			    			    	   
			    				
			    			             }catch(Exception ex) {
			    			            	 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
			    			                
			    			                }  finally {
			    								
			    								try {
			    									rs.close();
			    									ps.close();
			    									
			    									
			    								}catch(Exception e) {
			    									
			    								}
			    								
			    							}
			    				           
			    				}
			    					
			    				
			    			
			    					
			    				}catch(Exception ex) {
			    					
			    				}
									}
							}
			    				});
                          	}catch(Exception ex) {
						
					}
					
					
				}
			}
		});
		
	
		
		
	}

	private void grade() {
		try {
			String sql="select * from grade where rowid ='"+3+"'  ";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			//JOptionPane.showMessageDialog(null, rs.getDouble("grade1"));\
		    grad1=rs.getString("grade1");grad2=rs.getString("grade2");grad3= rs.getString("grade3");grad4= rs.getString("grade4");grad5=rs.getString("grade5");
		    grad6=rs.getString("grade6");grad7=rs.getString("grade7");grad8=rs.getString("grade8");grad9=rs.getString("grade9");grad10=rs.getString("grade10");
		    grad11=rs.getString("grade11");grad12=rs.getString("grade12");grad13=rs.getString("grade13");grad14=rs.getString("grade14");
		    
		    
			text1.setText( grad1);text2.setText( grad2);text3.setText( grad3);text4.setText(grad4);text5.setText(grad5 );text6.setText( grad6);text7.setText(grad7 );
			text8.setText(grad8 );text9.setText(grad9 );text10.setText( grad10);text11.setText(grad11 );text12.setText(grad12 );text13.setText( grad13);
			text14.setText( grad14);
			
			grd1=Double.parseDouble(grad1);grd2=Double.parseDouble(grad2);grd3=Double.parseDouble(grad3);grd4=Double.parseDouble(grad4);grd5=Double.parseDouble(grad5);
			grd6=Double.parseDouble(grad6);grd7=Double.parseDouble(grad7);grd8=Double.parseDouble(grad8);grd9=Double.parseDouble(grad9);grd10=Double.parseDouble(grad10);
			grd11=Double.parseDouble(grad11);grd12=Double.parseDouble(grad12);grd13=Double.parseDouble(grad13);grd14=Double.parseDouble(grad14);
			
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getStackTrace());
		}
		finally{
	             try{
	                 rs.close();
	                 ps.close();
	             }catch(Exception ex){
	                 ex.getMessage();
	             }}
		
	}
	
	private void text() {
		try {
			
			String ptext="select * from text  where rowid='"+3+"'  ";
			 ps=con.prepareStatement(ptext);
			 ResultSet pt=ps.executeQuery();
			 
			 area1.setText(pt.getString("atext"));
			 
			
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}finally{
            try{
                rs.close();
                ps.close();
            }catch(Exception ex){
                ex.getMessage();
            }}
	
	}
	private void validatey() {
		text1.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
		    }}});text2.addKeyListener(new KeyAdapter()
			{
			      public void keyTyped(KeyEvent ke)
			{
			    	  char c = ke.getKeyChar();
		                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
		                    getToolkit().beep();
		                    ke.consume();
		                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
			    }}});text3.addKeyListener(new KeyAdapter()
				{
				      public void keyTyped(KeyEvent ke)
				{
				    	  char c = ke.getKeyChar();
			                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
			                    getToolkit().beep();
			                    ke.consume();
			                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
				    }}});text4.addKeyListener(new KeyAdapter()
					{
					      public void keyTyped(KeyEvent ke)
					{
					    	  char c = ke.getKeyChar();
				                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
				                    getToolkit().beep();
				                    ke.consume();
				                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
					    }}});text5.addKeyListener(new KeyAdapter()
						{
						      public void keyTyped(KeyEvent ke)
						{
						    	  char c = ke.getKeyChar();
					                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
					                    getToolkit().beep();
					                    ke.consume();
					                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
						    }}});text6.addKeyListener(new KeyAdapter()
							{
							      public void keyTyped(KeyEvent ke)
							{
							    	  char c = ke.getKeyChar();
						                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
						                    getToolkit().beep();
						                    ke.consume();
						                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
							    }}});text7.addKeyListener(new KeyAdapter()
								{
								      public void keyTyped(KeyEvent ke)
								{
								    	  char c = ke.getKeyChar();
							                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
							                    getToolkit().beep();
							                    ke.consume();
							                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
								    }}});text8.addKeyListener(new KeyAdapter()
									{
									      public void keyTyped(KeyEvent ke)
									{
									    	  char c = ke.getKeyChar();
								                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
								                    getToolkit().beep();
								                    ke.consume();
								                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
									    }}});text9.addKeyListener(new KeyAdapter()
										{
										      public void keyTyped(KeyEvent ke)
										{
										    	  char c = ke.getKeyChar();
									                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
									                    getToolkit().beep();
									                    ke.consume();
									                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
										    }}});text10.addKeyListener(new KeyAdapter()
											{
											      public void keyTyped(KeyEvent ke)
											{
											    	  char c = ke.getKeyChar();
										                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
										                    getToolkit().beep();
										                    ke.consume();
										                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
											    }}});
										    text11.addKeyListener(new KeyAdapter()
											{
											      public void keyTyped(KeyEvent ke)
											{
											    	  char c = ke.getKeyChar();
										                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
										                    getToolkit().beep();
										                    ke.consume();
										                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
											    }}});text12.addKeyListener(new KeyAdapter()
												{
												      public void keyTyped(KeyEvent ke)
												{
												    	  char c = ke.getKeyChar();
											                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
											                    getToolkit().beep();
											                    ke.consume();
											                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
												    }}});
											    text13.addKeyListener(new KeyAdapter()
												{
												      public void keyTyped(KeyEvent ke)
												{
												    	  char c = ke.getKeyChar();
											                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
											                    getToolkit().beep();
											                    ke.consume();
											                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
												    }}});text14.addKeyListener(new KeyAdapter()
													{
													      public void keyTyped(KeyEvent ke)
													{
													    	  char c = ke.getKeyChar();
												                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)   )){
												                    getToolkit().beep();
												                    ke.consume();
												                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
													    }}});
		
		t7.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		t8.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		t10.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		t13.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});

		
		t17.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		t18.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		t19.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		t22.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		t23.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		t27.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		t30.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		t31.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		t33.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		
		t38.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		t39.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		t41.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		t42.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		t43.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta1.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta2.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta3.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta4.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		
		ta5.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta6.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta7.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta8.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		ta9.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta15.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta16.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta17.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta18.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta31.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta32.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta33.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta34.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta35.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta36.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta37.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		ta38.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta27.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta28.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta29.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta30.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta19.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta20.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta21.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta22.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta23.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta24.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta25.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		ta26.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta10.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta11.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta12.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta13.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta14.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta39.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta40.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		
		ta41.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta42.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta43.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta44.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		ta45.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE) || (c == '-')   )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		ta46.addKeyListener(new KeyAdapter()
		{
		      public void keyTyped(KeyEvent ke)
		{
		    	  char c = ke.getKeyChar();
	                if (!( (c == KeyEvent.VK_PERIOD ) ||  (Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)|| (c == '-')    )){
	                    getToolkit().beep();
	                    ke.consume();
	                    JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    }}});
		
		
		
		
		

		
	}
	

	private void field() {
		field.addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent argo){
				
				try{	
				
				String mudi=field.getText();
				
				String s="Select id as 'STUDENT ID',first as 'FIRST NAME',last as 'LAST NAME',gender as 'GENDER',class as 'CLASS',combi as 'COMBINATION',exam as 'EXAM TYPE',year as 'ACADEMIC YEAR',sch as 'SCHOOL' from user  where first LIKE ? or last LIKE ? or gender LIKE ? or class LIKE ? or combi LIKE ? or sch LIKE ? or id LIKE ? or exam LIKE ? or year LIKE ? order by sch ";                                    
			try {
				
				ps=con.prepareStatement(s);
				ps.setString(1, "%" +  mudi.replaceAll("^\\s+|\\s+$", "")+ "%");
				ps.setString(2, "%" +  mudi.replaceAll("^\\s+|\\s+$", "")+ "%");
				ps.setString(3, "%" +  mudi.replaceAll("^\\s+|\\s+$", "")+ "%");
				ps.setString(4, "%" +  mudi.replaceAll("^\\s+|\\s+$", "")+ "%");
				ps.setString(5, "%" +  mudi.replaceAll("^\\s+|\\s+$", "")+ "%");
				ps.setString(6, "%" +  mudi.replaceAll("^\\s+|\\s+$", "")+ "%");
				ps.setString(7, "%" +  mudi.replaceAll("^\\s+|\\s+$", "")+ "%");
				ps.setString(8, "%" +  mudi.replaceAll("^\\s+|\\s+$", "")+ "%");
				ps.setString(9, "%" +  mudi.replaceAll("^\\s+|\\s+$", "")+ "%");
				rs=ps.executeQuery();
				table.setModel(DbUtils.resultSetToTableModel(rs));
				table.setFont(new Font("serif",Font.PLAIN,11));
				table.setForeground(new Color(0,0,139));
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			} 
				}catch(Exception ess){
					JOptionPane.showMessageDialog(null, ess.getMessage());
				}finally {
					
					try {
						rs.close();
						ps.close();
						
						
					}catch(Exception e) {
						
					}
					
				}
			}
			
		});
		
	}



	private void resert() {
		tt7.setSelectedItem(null);t0.setText("");t1.setText("");t2.setText("");t3.setSelectedItem(null);t4.setSelectedItem(null);t5.setSelectedItem(null);t6.setSelectedItem(null);area.setText("");field.setText("");box5.setSelectedItem(null);box67.setSelectedItem(null);
		
	}

	private void area() {
		
	
	try {
		String id=t0.getText();
		String gg="";
		String combi=t5.getSelectedItem().toString();
		

 	
		
		String sql1="select * from mark where id='"+id+"' ";
        ps=con.prepareStatement(sql1);
    	rs=ps.executeQuery();
    	String pt=rs.getString("point");
    	
    	if(combi.matches("")) {
    
    	
    	if(pt.matches("Inc")) {
    		area.setText("SUBJECTS\tMARKS\tGRADES\nPysics\t"+rs.getString("phy")+"\t"+rs.getString("gphy")+"\nChemistry\t"+rs.getString("che")+"\t"+rs.getString("gche")+"\nAdv/Math\t"+rs.getString("math")+"\t"+rs.getString("gmath")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\nDIVISION\tInc        "+"POINTS"+"          "+"Inc");
    		
    		
    	}else {
    		
    		int gs=Integer.parseInt(pt);
   	     if(gs>=3 && gs<=9){
   	       gg="I";
   	      }else if(gs>=10 && gs<=12){
   	    	  gg="II";
   	      }
   	      else if(gs>=13 && gs<=17){
   	    	  gg="III";
   	      }
   	      else if(gs>=18 && gs<=19){
   	    	  gg="IV";
   		      }
   		  else if(gs>=20 && gs<=21){
   			  gg="0";
   		      }
   	     
   	  area.setText("SUBJECTS\tMARKS\tGRADES\nPysics\t"+rs.getString("phy")+"\t"+rs.getString("gphy")+"\nChemistry\t"+rs.getString("che")+"\t"+rs.getString("gche")+"\nAdv/Math\t"+rs.getString("math")+"\t"+rs.getString("gmath")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\nDIVISION\t"+gg+"        "+"POINTS"+"          "+pt);
   	     
   	     
   	     
   		  }
    	}else if(combi.matches("PCB")) {
    		


    		if(pt.matches("Inc")) {
    			 area.setText("SUBJECTS\tMARKS\tGRADES\nPysics\t"+rs.getString("phy")+"\t"+rs.getString("gphy")+"\nChemistry\t"+rs.getString("che")+"\t"+rs.getString("gche")+"\nBiology\t"+rs.getString("bio")+"\t"+rs.getString("gbio")+"\nBAM\t"+rs.getString("bam")+"\t"+rs.getString("gbam")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\tInc        "+"POINTS"+"          "+"Inc");
        		
        		
        	}else {
        		
        		int gs=Integer.parseInt(pt);
       	     if(gs>=3 && gs<=9){
       	       gg="I";
       	      }else if(gs>=10 && gs<=12){
       	    	  gg="II";
       	      }
       	      else if(gs>=13 && gs<=17){
       	    	  gg="III";
       	      }
       	      else if(gs>=18 && gs<=19){
       	    	  gg="IV";
       		      }
       		  else if(gs>=20&& gs<=21){
       			  gg="0";
       		      }
       	     
       	  area.setText("SUBJECTS\tMARKS\tGRADES\nPysics\t"+rs.getString("phy")+"\t"+rs.getString("gphy")+"\nChemistry\t"+rs.getString("che")+"\t"+rs.getString("gche")+"\nBiology\t"+rs.getString("bio")+"\t"+rs.getString("gbio")+"\nBAM\t"+rs.getString("bam")+"\t"+rs.getString("gbam")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\t"+gg+"        "+"POINTS"+"          "+pt);
        	}
       	     
        	}	
    		
    		else if(combi.matches("PGM")) {
    		    
    	    	
    	    	if(pt.matches("Inc")) {
    	    		area.setText("SUBJECTS\tMARKS\tGRADES\nPysics\t"+rs.getString("phy")+"\t"+rs.getString("gphy")+"\nGeography\t"+rs.getString("geo")+"\t"+rs.getString("ggeo")+"\nAdv/Math\t"+rs.getString("math")+"\t"+rs.getString("gmath")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\tInc        "+"POINTS"+"          "+"Inc");
    	    		
    	    		
    	    	}else {
    	    		
    	    		int gs=Integer.parseInt(pt);
    	   	     if(gs>=3 && gs<=9){
    	   	       gg="I";
    	   	      }else if(gs>=10 && gs<=12){
    	   	    	  gg="II";
    	   	      }
    	   	      else if(gs>=13 && gs<=17){
    	   	    	  gg="III";
    	   	      }
    	   	      else if(gs>=18 && gs<=19){
    	   	    	  gg="IV";
    	   		      }
    	   		  else if(gs>=20&&gs<=21){
    	   			  gg="0";
    	   		      }
    	   	     
    	   	  area.setText("SUBJECTS\tMARKS\tGRADES\nPysics\t"+rs.getString("phy")+"\t"+rs.getString("gphy")+"\nGeography\t"+rs.getString("geo")+"\t"+rs.getString("ggeo")+"\nAdv/Math\t"+rs.getString("math")+"\t"+rs.getString("gmath")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\t"+gg+"        "+"POINTS"+"          "+pt);
    	   	     
    	   	     
    	   	     
    	   		  }
    		
    		
    		
    	}
    	
else if(combi.matches("PCM")) {
    		    
    	    	
    	    	if(pt.matches("Inc")) {
    	    		area.setText("SUBJECTS\tMARKS\tGRADES\nPysics\t"+rs.getString("phy")+"\t"+rs.getString("gphy")+"\nChemistry\t"+rs.getString("che")+"\t"+rs.getString("gche")+"\nAdv/Math\t"+rs.getString("math")+"\t"+rs.getString("gmath")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\tInc        "+"POINTS"+"          "+"Inc");
    	    		
    	    		
    	    	}else {
    	    		
    	    		int gs=Integer.parseInt(pt);
    	   	     if(gs>=3 && gs<=9){
    	   	       gg="I";
    	   	      }else if(gs>=10 && gs<=12){
    	   	    	  gg="II";
    	   	      }
    	   	      else if(gs>=13 && gs<=17){
    	   	    	  gg="III";
    	   	      }
    	   	      else if(gs>=18 && gs<=19){
    	   	    	  gg="IV";
    	   		      }
    	   		  else if(gs>=20&&gs<=21){
    	   			  gg="0";
    	   		      }
    	   	     
    	   	  area.setText("SUBJECTS\tMARKS\tGRADES\nPysics\t"+rs.getString("phy")+"\t"+rs.getString("gphy")+"\nChemistry\t"+rs.getString("che")+"\t"+rs.getString("gche")+"\nAdv/Math\t"+rs.getString("math")+"\t"+rs.getString("gmath")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\t"+gg+"        "+"POINTS"+"          "+pt);
    	   	     
    	   	     
    	   	     
    	   		  }
    		
    		
    		
    	}
    	
         else if(combi.matches("EGM")) {
    		    
    	    	
    	    	if(pt.matches("Inc")) {
    	    		area.setText("SUBJECTS\tMARKS\tGRADES\nEconomics\t"+rs.getString("ec")+"\t"+rs.getString("gec")+"\nGeography\t"+rs.getString("geo")+"\t"+rs.getString("ggeo")+"\nAdv/Math\t"+rs.getString("math")+"\t"+rs.getString("gmath")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\tInc        "+"POINTS"+"          "+"Inc");
    	    		
    	    		
    	    	}else {
    	    		
    	    		int gs=Integer.parseInt(pt);
    	   	     if(gs>=3 && gs<=9){
    	   	       gg="I";
    	   	      }else if(gs>=10 && gs<=12){
    	   	    	  gg="II";
    	   	      }
    	   	      else if(gs>=13 && gs<=17){
    	   	    	  gg="III";
    	   	      }
    	   	      else if(gs>=18 && gs<=19){
    	   	    	  gg="IV";
    	   		      }
    	   		  else if(gs>=20&&gs<=21){
    	   			  gg="0";
    	   		      }
    	   	     
    	   	  area.setText("SUBJECTS\tMARKS\tGRADES\nEconomics\t"+rs.getString("ec")+"\t"+rs.getString("gec")+"\nGeography\t"+rs.getString("geo")+"\t"+rs.getString("ggeo")+"\nAdv/Math\t"+rs.getString("math")+"\t"+rs.getString("gmath")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\t"+gg+"        "+"POINTS"+"          "+pt);
    	   	     
    	   	     
    	   	     
    	   		  }
    		
    		
    		
    	}
    	
    	
    	
    	
    	
         else if(combi.matches("HGE")) {
 		    
 	    	
 	    	if(pt.matches("Inc")) {
 	    		area.setText("SUBJECTS\tMARKS\tGRADES\nHistory\t"+rs.getString("his")+"\t"+rs.getString("ghis")+"\nGeography\t"+rs.getString("geo")+"\t"+rs.getString("ggeo")+"\nEconomics\t"+rs.getString("ec")+"\t"+rs.getString("gec")+"\nBAM\t"+rs.getString("bam")+"\t"+rs.getString("gbam")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\tInc        "+"POINTS"+"          "+"Inc");
 	    		
 	    		
 	    	}else {
 	    		
 	    		int gs=Integer.parseInt(pt);
 	   	     if(gs>=3 && gs<=9){
 	   	       gg="I";
 	   	      }else if(gs>=10 && gs<=12){
 	   	    	  gg="II";
 	   	      }
 	   	      else if(gs>=13 && gs<=17){
 	   	    	  gg="III";
 	   	      }
 	   	      else if(gs>=18 && gs<=19){
 	   	    	  gg="IV";
 	   		      }
 	   		  else if(gs>=20&&gs<=21){
 	   			  gg="0";
 	   		      }
 	   	     
 	   	 area.setText("SUBJECTS\tMARKS\tGRADES\nHistory\t"+rs.getString("his")+"\t"+rs.getString("ghis")+"\nGeography\t"+rs.getString("geo")+"\t"+rs.getString("ggeo")+"\nEconomics\t"+rs.getString("ec")+"\t"+rs.getString("gec")+"\nBAM\t"+rs.getString("bam")+"\t"+rs.getString("gbam")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\t"+gg+"        "+"POINTS"+"          "+pt);
 	   	     
 	   	     
 	   	     
 	   		  }
 		
 	}
         else if(combi.matches("HKL")) {
  		    
  	    	
  	    	if(pt.matches("Inc")) {
  	    		area.setText("SUBJECTS\tMARKS\tGRADES\nHistory\t"+rs.getString("his")+"\t"+rs.getString("ghis")+"\nKiswahili\t"+rs.getString("kis")+"\t"+rs.getString("gkis")+"\nLanguage\t"+rs.getString("lan")+"\t"+rs.getString("glan")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\tInc        "+"POINTS"+"          "+"Inc");
  	    		
  	    		
  	    	}else {
  	    		
  	    		int gs=Integer.parseInt(pt);
  	   	     if(gs>=3 && gs<=9){
  	   	       gg="I";
  	   	      }else if(gs>=10 && gs<=12){
  	   	    	  gg="II";
  	   	      }
  	   	      else if(gs>=13 && gs<=17){
  	   	    	  gg="III";
  	   	      }
  	   	      else if(gs>=18 && gs<=19){
  	   	    	  gg="IV";
  	   		      }
  	   		  else if(gs>=20&&gs<=21){
  	   			  gg="0";
  	   		      }
  	   	     
  	   	 area.setText("SUBJECTS\tMARKS\tGRADES\nHistory\t"+rs.getString("his")+"\t"+rs.getString("ghis")+"\nKiswahili\t"+rs.getString("kis")+"\t"+rs.getString("gkis")+"\nLanguage\t"+rs.getString("lan")+"\t"+rs.getString("glan")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\t"+gg+"        "+"POINTS"+"          "+pt);
  	   	     
  	   	     
  	   	     
  	   		  }
  		
  	}
         else if(combi.matches("KLA")) {
   		    
   	    	
   	    	if(pt.matches("Inc")) {
   	    		area.setText("SUBJECTS\tMARKS\tGRADES\nKiswahili\t"+rs.getString("kis")+"\t"+rs.getString("gkis")+"\nLanguage\t"+rs.getString("lan")+"\t"+rs.getString("glan")+"\nArabic\t"+rs.getString("ara")+"\t"+rs.getString("gara")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\tInc        "+"POINTS"+"          "+"Inc");
   	    		
   	    		
   	    	}else {
   	    		
   	    		int gs=Integer.parseInt(pt);
   	   	     if(gs>=3 && gs<=9){
   	   	       gg="I";
   	   	      }else if(gs>=10 && gs<=12){
   	   	    	  gg="II";
   	   	      }
   	   	      else if(gs>=13 && gs<=17){
   	   	    	  gg="III";
   	   	      }
   	   	      else if(gs>=18 && gs<=19){
   	   	    	  gg="IV";
   	   		      }
   	   		  else if(gs>=20&&gs<=21){
   	   			  gg="0";
   	   		      }
   	   	     
   	   	 area.setText("SUBJECTS\tMARKS\tGRADES\nKiswahili\t"+rs.getString("kis")+"\t"+rs.getString("gkis")+"\nLanguage\t"+rs.getString("lan")+"\t"+rs.getString("glan")+"\nArabic\t"+rs.getString("ara")+"\t"+rs.getString("gara")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\t"+gg+"        "+"POINTS"+"          "+pt);
   	   	     
   	   	     
   	   	     
   	   		  }
   		
   	}
    	
         else if(combi.matches("IKA")) {
    		    
    	    	
    	    	if(pt.matches("Inc")) {
    	    		area.setText("SUBJECTS\tMARKS\tGRADES\nIS/Knowledge\t"+rs.getString("dini")+"\t"+rs.getString("gdini")+"\nKiswahili\t"+rs.getString("kis")+"\t"+rs.getString("gkis")+"\nArabic\t"+rs.getString("ara")+"\t"+rs.getString("gara")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\tInc        "+"POINTS"+"          "+"Inc");
    	    		
    	    		
    	    	}else {
    	    		
    	    		int gs=Integer.parseInt(pt);
    	   	     if(gs>=3 && gs<=9){
    	   	       gg="I";
    	   	      }else if(gs>=10 && gs<=12){
    	   	    	  gg="II";
    	   	      }
    	   	      else if(gs>=13 && gs<=17){
    	   	    	  gg="III";
    	   	      }
    	   	      else if(gs>=18 && gs<=19){
    	   	    	  gg="IV";
    	   		      }
    	   		  else if(gs>=20&&gs<=21){
    	   			  gg="0";
    	   		      }
    	   	     
    	   	 area.setText("SUBJECTS\tMARKS\tGRADES\nIS/Knowledge\t"+rs.getString("dini")+"\t"+rs.getString("gdini")+"\nKiswahili\t"+rs.getString("kis")+"\t"+rs.getString("gkis")+"\nArabic\t"+rs.getString("ara")+"\t"+rs.getString("gara")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\t"+gg+"        "+"POINTS"+"          "+pt);
    	   	     
    	   	     
    	   	     
    	   		  }
    		
    	}
    	
         else if(combi.matches("IKL")) {
 		    
 	    	
 	    	if(pt.matches("Inc")) {
 	    		area.setText("SUBJECTS\tMARKS\tGRADES\nIS/Knowledge\t"+rs.getString("dini")+"\t"+rs.getString("gdini")+"\nKiswahili\t"+rs.getString("kis")+"\t"+rs.getString("gkis")+"\nLanguage\t"+rs.getString("lan")+"\t"+rs.getString("glan")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\tInc        "+"POINTS"+"          "+"Inc");
 	    		
 	    		
 	    	}else {
 	    		
 	    		int gs=Integer.parseInt(pt);
 	   	     if(gs>=3 && gs<=9){
 	   	       gg="I";
 	   	      }else if(gs>=10 && gs<=12){
 	   	    	  gg="II";
 	   	      }
 	   	      else if(gs>=13 && gs<=17){
 	   	    	  gg="III";
 	   	      }
 	   	      else if(gs>=18 && gs<=19){
 	   	    	  gg="IV";
 	   		      }
 	   		  else if(gs>=20&&gs<=21){
 	   			  gg="0";
 	   		      }
 	   	     
 	   	 area.setText("SUBJECTS\tMARKS\tGRADES\nIS/Knowledge\t"+rs.getString("dini")+"\t"+rs.getString("gdini")+"\nKiswahili\t"+rs.getString("kis")+"\t"+rs.getString("gkis")+"\nLanguage\t"+rs.getString("lan")+"\t"+rs.getString("glan")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\t"+gg+"        "+"POINTS"+"          "+pt);
 	   	     
 	   	     
 	   	     
 	   		  }
 		
 	}
         else if(combi.matches("HKA")) {
 		    
 	    	
 	    	if(pt.matches("Inc")) {
 	    		area.setText("SUBJECTS\tMARKS\tGRADES\nHistory\t"+rs.getString("his")+"\t"+rs.getString("ghis")+"\nKiswahili\t"+rs.getString("kis")+"\t"+rs.getString("gkis")+"\nArabic\t"+rs.getString("ara")+"\t"+rs.getString("gara")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\tInc        "+"POINTS"+"          "+"Inc");
 	    		
 	    		
 	    	}else {
 	    		
 	    		int gs=Integer.parseInt(pt);
 	   	     if(gs>=3 && gs<=9){
 	   	       gg="I";
 	   	      }else if(gs>=10 && gs<=12){
 	   	    	  gg="II";
 	   	      }
 	   	      else if(gs>=13 && gs<=17){
 	   	    	  gg="III";
 	   	      }
 	   	      else if(gs>=18 && gs<=19){
 	   	    	  gg="IV";
 	   		      }
 	   		  else if(gs>=20&&gs<=21){
 	   			  gg="0";
 	   		      }
 	   	     
 	   	 area.setText("SUBJECTS\tMARKS\tGRADES\nHistory\t"+rs.getString("his")+"\t"+rs.getString("ghis")+"\nKiswahili\t"+rs.getString("kis")+"\t"+rs.getString("gkis")+"\nArabic\t"+rs.getString("ara")+"\t"+rs.getString("gara")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\t"+gg+"        "+"POINTS"+"          "+pt);
 	   	     
 	   	     
 	   	     
 	   		  }
 		
 	}
         else if(combi.matches("GKL")) {
   		    
   	    	
   	    	if(pt.matches("Inc")) {
   	    		area.setText("SUBJECTS\tMARKS\tGRADES\nGeography\t"+rs.getString("geo")+"\t"+rs.getString("ggeo")+"\nKiswahili\t"+rs.getString("kis")+"\t"+rs.getString("gkis")+"\nLanguage\t"+rs.getString("lan")+"\t"+rs.getString("glan")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\tInc        "+"POINTS"+"          "+"Inc");
   	    		
   	    		
   	    	}else {
   	    		
   	    		int gs=Integer.parseInt(pt);
   	   	     if(gs>=3 && gs<=9){
   	   	       gg="I";
   	   	      }else if(gs>=10 && gs<=12){
   	   	    	  gg="II";
   	   	      }
   	   	      else if(gs>=13 && gs<=17){
   	   	    	  gg="III";
   	   	      }
   	   	      else if(gs>=18 && gs<=19){
   	   	    	  gg="IV";
   	   		      }
   	   		  else if(gs>=20&&gs<=21){
   	   			  gg="0";
   	   		      }
   	   	     
   	   	 area.setText("SUBJECTS\tMARKS\tGRADES\nGeography\t"+rs.getString("geo")+"\t"+rs.getString("ggeo")+"\nKiswahili\t"+rs.getString("kis")+"\t"+rs.getString("gkis")+"\nLanguage\t"+rs.getString("lan")+"\t"+rs.getString("glan")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\t"+gg+"        "+"POINTS"+"          "+pt);
   	   	     
   	   	     
   	   	     
   	   		  }
   		
   	}
    	
         else if(combi.matches("HGL")) {
   		    
   	    	
   	    	if(pt.matches("Inc")) {
   	    		area.setText("SUBJECTS\tMARKS\tGRADES\nHistory\t"+rs.getString("his")+"\t"+rs.getString("ghis")+"\nGeography\t"+rs.getString("geo")+"\t"+rs.getString("ggeo")+"\nLanguage\t"+rs.getString("lan")+"\t"+rs.getString("glan")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\tInc        "+"POINTS"+"          "+"Inc");
   	    		
   	    		
   	    	}else {
   	    		
   	    		int gs=Integer.parseInt(pt);
   	   	     if(gs>=3 && gs<=9){
   	   	       gg="I";
   	   	      }else if(gs>=10 && gs<=12){
   	   	    	  gg="II";
   	   	      }
   	   	      else if(gs>=13 && gs<=17){
   	   	    	  gg="III";
   	   	      }
   	   	      else if(gs>=18 && gs<=19){
   	   	    	  gg="IV";
   	   		      }
   	   		  else if(gs>=20&&gs<=21){
   	   			  gg="0";
   	   		      }
   	   	     
   	   	 area.setText("SUBJECTS\tMARKS\tGRADES\nHistory\t"+rs.getString("his")+"\t"+rs.getString("ghis")+"\nGeography\t"+rs.getString("geo")+"\t"+rs.getString("ggeo")+"\nLanguage\t"+rs.getString("lan")+"\t"+rs.getString("glan")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\t"+gg+"        "+"POINTS"+"          "+pt);
   	   	     
   	   	     
   	   	     
   	   		  }
   		
   	}
    	
    	
         else if(combi.matches("HGK")) {
    		    
    	    	
    	    	if(pt.matches("Inc")) {
    	    		area.setText("SUBJECTS\tMARKS\tGRADES\nHistory\t"+rs.getString("his")+"\t"+rs.getString("ghis")+"\nGeography\t"+rs.getString("geo")+"\t"+rs.getString("ggeo")+"\nKiswahili\t"+rs.getString("kis")+"\t"+rs.getString("gkis")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\tInc        "+"POINTS"+"          "+"Inc");
    	    		
    	    		
    	    	}else {
    	    		
    	    		int gs=Integer.parseInt(pt);
    	   	     if(gs>=3 && gs<=9){
    	   	       gg="I";
    	   	      }else if(gs>=10 && gs<=12){
    	   	    	  gg="II";
    	   	      }
    	   	      else if(gs>=13 && gs<=17){
    	   	    	  gg="III";
    	   	      }
    	   	      else if(gs>=18 && gs<=19){
    	   	    	  gg="IV";
    	   		      }
    	   		  else if(gs>=20&&gs<=21){
    	   			  gg="0";
    	   		      }
    	   	     
    	   	 area.setText("SUBJECTS\tMARKS\tGRADES\nHistory\t"+rs.getString("his")+"\t"+rs.getString("ghis")+"\nGeography\t"+rs.getString("geo")+"\t"+rs.getString("ggeo")+"\nKiswahili\t"+rs.getString("kis")+"\t"+rs.getString("gkis")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\t"+gg+"        "+"POINTS"+"          "+pt);
    	   	     
    	   	     
    	   	     
    	   		  }
    		
    	}
     	
    	
    	
         else if(combi.matches("ECA")) {
  		    
  	    	
  	    	if(pt.matches("Inc")) {
  	    		area.setText("SUBJECTS\tMARKS\tGRADES\nEconomics\t"+rs.getString("ec")+"\t"+rs.getString("gec")+"\nCommerce\t"+rs.getString("co")+"\t"+rs.getString("gco")+"\nAccountancy\t"+rs.getString("aco")+"\t"+rs.getString("gaco")+"\nBAM\t"+rs.getString("bam")+"\t"+rs.getString("gbam")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\tInc        "+"POINTS"+"          "+"Inc");
  	    		
  	    		
  	    	}else {
  	    		
  	    		int gs=Integer.parseInt(pt);
  	   	     if(gs>=3 && gs<=9){
  	   	       gg="I";
  	   	      }else if(gs>=10 && gs<=12){
  	   	    	  gg="II";
  	   	      }
  	   	      else if(gs>=13 && gs<=17){
  	   	    	  gg="III";
  	   	      }
  	   	      else if(gs>=18 && gs<=19){
  	   	    	  gg="IV";
  	   		      }
  	   		  else if(gs>=20&&gs<=21){
  	   			  gg="0";
  	   		      }
  	   	     
  	   	 area.setText("SUBJECTS\tMARKS\tGRADES\nEconomics\t"+rs.getString("ec")+"\t"+rs.getString("gec")+"\nCommerce\t"+rs.getString("co")+"\t"+rs.getString("gco")+"\nAccountancy\t"+rs.getString("aco")+"\t"+rs.getString("gaco")+"\nBAM\t"+rs.getString("bam")+"\t"+rs.getString("gbam")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\t"+gg+"        "+"POINTS"+"          "+pt);
  	   	     
  	   	     
  	   	     
  	   		  }
  		
  		
  		
  	}


    		else if(combi.matches("CBG")) {
        		


        		if(pt.matches("Inc")) {
        			 area.setText("SUBJECTS\tMARKS\tGRADES\nChemistry\t"+rs.getString("che")+"\t"+rs.getString("gche")+"\nBiology\t"+rs.getString("bio")+"\t"+rs.getString("gbio")+"\nGeography\t"+rs.getString("geo")+"\t"+rs.getString("ggeo")+"\nBAM\t"+rs.getString("bam")+"\t"+rs.getString("gbam")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\tInc        "+"POINTS"+"          "+"Inc");
            		
            		
            	}else {
            		
            		int gs=Integer.parseInt(pt);
           	     if(gs>=3 && gs<=9){
           	       gg="I";
           	      }else if(gs>=10 && gs<=12){
           	    	  gg="II";
           	      }
           	      else if(gs>=13 && gs<=17){
           	    	  gg="III";
           	      }
           	      else if(gs>=18 && gs<=19){
           	    	  gg="IV";
           		      }
           		  else if(gs>=20&&gs<=21){
           			  gg="0";
           		      }
           	     
           	  area.setText("SUBJECTS\tMARKS\tGRADES\nChemistry\t"+rs.getString("che")+"\t"+rs.getString("gche")+"\nBiology\t"+rs.getString("bio")+"\t"+rs.getString("gbio")+"\nGeography\t"+rs.getString("geo")+"\t"+rs.getString("ggeo")+"\nBAM\t"+rs.getString("bam")+"\t"+rs.getString("gbam")+"\nGen/Study\t"+rs.getString("gs")+"\t"+rs.getString("ggs")+"\n\nDIVISION\t"+gg+"        "+"POINTS"+"          "+pt);
            	}
    		}
    	
		
	}catch(Exception ex) {
		
		JOptionPane.showMessageDialog(null, ex.getMessage());
	}
	finally {
		
		try {
			
			rs.close();
			ps.close();
			
			
		}catch(Exception e) {
			
		}
		
	}

	
	
		
	}

	private void update1() {
		try {
			
		String sql="select count(id) from mark where id='"+t0.getText()+"' ";
		ps=con.prepareStatement(sql);
		rs=ps.executeQuery();
		
		int namba=Integer.parseInt(rs.getString("count(id)"));
		if(namba==1) {
			
			
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			try {
				String id=t0.getText().toUpperCase();t50.setText(id);t50.setEditable(false);
				String fn=t1.getText().toUpperCase();t51.setText(fn);
				String ln=t2.getText().toUpperCase();t52.setText(ln);
				String gn=t3.getSelectedItem().toString();t53.setSelectedItem(gn);
				String cl=t4.getSelectedItem().toString();t54.setSelectedItem(cl);
				String co=t5.getSelectedItem().toString();t55.setSelectedItem(co);
				String exam=t6.getSelectedItem().toString();t56.setSelectedItem(exam);

				
				
	        
		
	         if(co.matches("HKA")) {
			
			String sql1="select * from mark where id='"+id+"' ";
	       	ps=con.prepareStatement(sql1);
	       	rs=ps.executeQuery();
	    
	    	ta39.setText(rs.getString("his"));
	       	ta40.setText(rs.getString("kis"));
	       	ta41.setText(rs.getString("ara"));
	       	ta42.setText(rs.getString("gs"));
	       	
	       	
	       	
				int result = JOptionPane.showConfirmDialog(null, pana14, "Insert Marks",
			            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				
			
			if(result==JOptionPane.OK_OPTION) {
				
				 try {
		            
		    			
					 String gp = null,gh = null,gc="",gm,gg,g1 = null,g2="",g3 = null,g4,sm;
		            	String m1;
		    			String m2="";
		    			String m3;
		    			String m4,m5,g5 = null;
		    			double lan=0.0,kisw=0.0,hist=0.0,gs=0.0;
		    			
		    			if(ta39.getText().isEmpty() ||ta39.getText().matches("-")) {
		    				gp="Inc";g1="-";m1="-";
		    			}else {
		    				m1=ta39.getText();
		    				lan=Double.parseDouble(ta39.getText());
			    			
			    			if(lan>=grd1 && lan<=grd2){
			    		       g1="A";gp="1";
			    		      }else if(lan>=grd3 && lan<grd4){
			    		    	  g1="B";gp="2";
			    		      }
			    		      else if(lan>=grd5 && lan<grd6){
			    		    	  g1="C";gp="3";
			    		      }
			    		      else if(lan>=grd7 && lan<grd8){
			    		    	  g1= "D";gp="4";
			    			      }
			    			  else if(lan>=grd9 && lan<grd10){
			    				  g1="E";gp="5";
			    			      }
			    			  else if(lan>=grd11 && lan<grd12){
			    				  g1= "S";gp="6";
			    			      }
			    			      else  if(lan>=grd13 && lan<grd14){
			    			    	  g1="F";gp="7";
			    			      }
		    			}
		    			
		    			if(ta40.getText().isEmpty()|| ta40.getText().matches("-")) {
		    				
		    				gc="Inc";m2="-";g2="-";
		    			}
		    				
		    				else {
		    					m2=ta40.getText();
		    					kisw=Double.parseDouble(ta40.getText());
			    			     if(kisw>=grd1 && kisw<=grd2){
			    			       g2= "A";gc="1";
			    			      }else if(kisw>=grd3 && kisw<grd4){
			    			    	  g2= "B";gc="2";
			    			      }
			    			      else if(kisw>=grd5 && kisw<grd6){
			    			    	  g2= "C";gc="3";
			    			      }
			    			      else if(kisw>=grd7 && kisw<grd8){
			    			    	  g2= "D";gc="4";
			    				      }
			    				  else if(kisw>=grd9 && kisw<grd10){
			    					  g2= "E";gc="5";
			    				      }
			    				  else if(kisw>=grd11 && kisw<grd12){
			    					  g2= "S";gc="6";
			    				      }
			    				      else if(kisw>=grd13 && kisw<grd14){
			    				    	  g2= "F";gc="7";
			    				      }	
		    				}
		    				
		    				
		    			
		    			if(ta41.getText().isEmpty()|| ta41.getText().matches("-")) {
		    				gh="Inc";m3="-";g3="-";
		    			}else {
		    		        m3= ta41.getText();
		    		         hist=Double.parseDouble(ta41.getText());
		    		       	if(hist>=grd1 && hist<=grd2){
		    			       g3="A";gh="1";
		    			      }else if(hist>=grd3 && hist<grd4){
		    			    	  g3= "B";gh="2";
		    			      }
		    			      else if(hist>=grd5 && hist<grd6){
		    			    	  g3="C";gh="3";
		    			      }
		    			      else if(hist>=grd7 && hist<grd8){
		    			    	  g3="D";gh="4";
		    				      }
		    				  else if(hist>=grd9 && hist<grd10){
		    					  g3="E";gh="5";
		    				      }
		    				  else if(hist>=grd11 && hist<grd12){
		    					  g3= "S";gh="6";
		    				      }
		    				      else if(hist>=grd13 && hist<grd14) {
		    				    	  g3="F";gh="7";
		    				      }
		    			}
		    			
		    			
		    		
						
		    			if(ta42.getText().isEmpty() ||ta42.getText().matches("-")) {
		    				gg="Inc";m5="-";g5="-";
		    			}else {
		    				m5= ta42.getText();
		    				 gs=Double.parseDouble(ta42.getText());
		    			     if(gs>=grd1 && gs<=grd2){
		    			       g5="A";gg="1";
		    			      }else if(gs>=grd3 && gs<grd4){
		    			    	  g5= "B";gg="2";
		    			      }
		    			      else if(gs>=grd5 && gs<grd6){
		    			    	  g5="C";gg="3";
		    			      }
		    			      else if(gs>=grd7 && gs<grd8){
		    			    	  g5="D";gg="4";
		    				      }
		    				  else if(gs>=grd9 && gs<grd10){
		    					  g5= "E";gg="5";
		    				      }
		    				  else if(gs>=grd11 && gs<grd12){
		    					  g5="S";gg="6";
		    				      }
		    				      else  if(gs>=grd13 && gs<grd14){
		    				    	  g5="F";gg="7";
		    				      }
		    			}
		    			
		    			
		    			if(!ta41.getText().isEmpty() && !ta39.getText().matches("-")&&!ta40.getText().isEmpty()&&!ta39.getText().isEmpty()&&!ta40.getText().isEmpty()&& !ta41.getText().matches("-"))
		    			{
		    				int pp=Integer.parseInt(gp);
		    				int pc=Integer.parseInt(gc);
		    				int pm=Integer.parseInt(gh);
		    				
		    				
		    				int sum=pp+pc+pm;
		    				sm=Integer.toString(sum);
		    				
		    				
		    			}
		    			else {
		    				 sm="Inc";
		    			}
		    			

		    			if(((lan>=0 &&lan<=100) ||ta39.getText().isEmpty()) && ((kisw>=0 &&kisw<=100) ||ta40.getText().isEmpty()) && ((hist>=0 &&hist<=100) ||ta41.getText().isEmpty()) && ((gs>=0 &&gs<=100) ||ta42.getText().isEmpty()) ) {
		    				
		    				 String sq="update mark set ara='"+m3+"',gara='"+g3+"',kis='"+m2+"',gkis='"+g2+"',his='"+m1+"',ghis='"+g1+"',gs='"+m5+"',ggs='"+g5+"',point='"+sm+"' where id='"+id+"' ";
		 					ps=con.prepareStatement(sq);
		 					ps.execute();
		 					
		 					JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
		 					ta42.setText("");ta39.setText("");ta40.setText("");ta41.setText("");
		 					area();

		    			}else {
		    				
		    				 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    			}
		    			
		    			
		    			    
		    	   
			
		             }catch(Exception ex) {
		            	 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		                }finally {
							
							try {
								rs.close();
								ps.close();
								
								
							}catch(Exception e) {
								
							}
							
						}
				
	  	           
			}}
		
	         else if(co.matches("IKL")) {
	 			
	 			String sql1="select * from mark where id='"+id+"' ";
	 	       	ps=con.prepareStatement(sql1);
	 	       	rs=ps.executeQuery();
	 	    
	 	    	ta43.setText(rs.getString("dini"));
	 	       	ta44.setText(rs.getString("kis"));
	 	       	ta45.setText(rs.getString("lan"));
	 	       	ta46.setText(rs.getString("gs"));
	 	       	
	 	       	
	 	       	
	 				int result = JOptionPane.showConfirmDialog(null, pana15, "Insert Marks",
	 			            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
	 				
	 			
	 			if(result==JOptionPane.OK_OPTION) {
	 				
	 				 try {
	 		            
	 		    			
	 					 String gp = null,gh = null,gc="",gm,gg,g1 = null,g2="",g3 = null,g4,sm;
	 		            	String m1;
	 		    			String m2="";
	 		    			String m3;
	 		    			String m4,m5,g5 = null;
	 		    			double lan=0.0,kisw=0.0,hist=0.0,gs=0.0;
	 		    			
	 		    			if(ta43.getText().isEmpty() ||ta43.getText().matches("-")) {
	 		    				gp="Inc";g1="-";m1="-";
	 		    			}else {
	 		    				m1=ta43.getText();
	 		    				 lan=Double.parseDouble(ta43.getText());
	 			    			
	 			    			if(lan>=grd1 && lan<=grd2){
	 			    		       g1="A";gp="1";
	 			    		      }else if(lan>=grd3 && lan<grd4){
	 			    		    	  g1="B";gp="2";
	 			    		      }
	 			    		      else if(lan>=grd5 && lan<grd6){
	 			    		    	  g1="C";gp="3";
	 			    		      }
	 			    		      else if(lan>=grd7 && lan<grd8){
	 			    		    	  g1= "D";gp="4";
	 			    			      }
	 			    			  else if(lan>=grd9 && lan<grd10){
	 			    				  g1="E";gp="5";
	 			    			      }
	 			    			  else if(lan>=grd11 && lan<grd12){
	 			    				  g1= "S";gp="6";
	 			    			      }
	 			    			      else if(lan>=grd13 && lan<grd14) {
	 			    			    	  g1="F";gp="7";
	 			    			      }
	 		    			}
	 		    			
	 		    			if(ta44.getText().isEmpty()|| ta44.getText().matches("-")) {
	 		    				
	 		    				gc="Inc";m2="-";g2="-";
	 		    			}
	 		    				
	 		    				else {
	 		    					m2=ta44.getText();
	 		    					kisw=Double.parseDouble(ta44.getText());
	 			    			     if(kisw>=grd1 && kisw<=grd2){
	 			    			       g2= "A";gc="1";
	 			    			      }else if(kisw>=grd3 && kisw<grd4){
	 			    			    	  g2= "B";gc="2";
	 			    			      }
	 			    			      else if(kisw>=grd5 && kisw<grd6){
	 			    			    	  g2= "C";gc="3";
	 			    			      }
	 			    			      else if(kisw>=grd7 && kisw<grd8){
	 			    			    	  g2= "D";gc="4";
	 			    				      }
	 			    				  else if(kisw>=grd9 && kisw<grd10){
	 			    					  g2= "E";gc="5";
	 			    				      }
	 			    				  else if(kisw>=grd11 && kisw<grd12){
	 			    					  g2= "S";gc="6";
	 			    				      }
	 			    				      else if(kisw>=grd13 && kisw<grd14){
	 			    				    	  g2= "F";gc="7";
	 			    				      }	
	 		    				}
	 		    				
	 		    				
	 		    			
	 		    			if(ta45.getText().isEmpty()|| ta45.getText().matches("-")) {
	 		    				gh="Inc";m3="-";g3="-";
	 		    			}else {
	 		    		        m3= ta45.getText();
	 		    		      hist=Double.parseDouble(ta45.getText());
	 		    		       	if(hist>=grd1 && hist<=grd2){
	 		    			       g3="A";gh="1";
	 		    			      }else if(hist>=grd3 && hist<grd4){
	 		    			    	  g3= "B";gh="2";
	 		    			      }
	 		    			      else if(hist>=grd5 && hist<grd6){
	 		    			    	  g3="C";gh="3";
	 		    			      }
	 		    			      else if(hist>=grd7 && hist<grd8){
	 		    			    	  g3="D";gh="4";
	 		    				      }
	 		    				  else if(hist>=grd9 && hist<grd10){
	 		    					  g3="E";gh="5";
	 		    				      }
	 		    				  else if(hist>=grd11 && hist<grd12){
	 		    					  g3= "S";gh="6";
	 		    				      }
	 		    				      else  if(hist>=grd13 && hist<grd14){
	 		    				    	  g3="F";gh="7";
	 		    				      }
	 		    			}
	 		    			
	 		    			
	 		    		
	 						
	 		    			if(ta46.getText().isEmpty() ||ta46.getText().matches("-")) {
	 		    				gg="Inc";m5="-";g5="-";
	 		    			}else {
	 		    				m5= ta46.getText();
	 		    				 gs=Double.parseDouble(ta46.getText());
	 		    			     if(gs>=grd1 && gs<=grd2){
	 		    			       g5="A";gg="1";
	 		    			      }else if(gs>=grd3 && gs<grd4){
	 		    			    	  g5= "B";gg="2";
	 		    			      }
	 		    			      else if(gs>=grd5 && gs<grd6){
	 		    			    	  g5="C";gg="3";
	 		    			      }
	 		    			      else if(gs>=grd7 && gs<grd8){
	 		    			    	  g5="D";gg="4";
	 		    				      }
	 		    				  else if(gs>=grd9 && gs<grd10){
	 		    					  g5= "E";gg="5";
	 		    				      }
	 		    				  else if(gs>=grd11 && gs<grd12){
	 		    					  g5="S";gg="6";
	 		    				      }
	 		    				      else  if(gs>=grd13 && gs<grd14){
	 		    				    	  g5="F";gg="7";
	 		    				      }
	 		    			}
	 		    			
	 		    			
	 		    			if(!ta45.getText().isEmpty() && !ta43.getText().matches("-")&&!ta44.getText().isEmpty()&&!ta43.getText().isEmpty()&&!ta44.getText().isEmpty()&& !ta45.getText().matches("-"))
	 		    			{
	 		    				int pp=Integer.parseInt(gp);
	 		    				int pc=Integer.parseInt(gc);
	 		    				int pm=Integer.parseInt(gh);
	 		    				
	 		    				
	 		    				int sum=pp+pc+pm;
	 		    				sm=Integer.toString(sum);
	 		    				
	 		    				
	 		    			}
	 		    			else {
	 		    				 sm="Inc";
	 		    			}
	 		    			

	 		    			if(((lan>=0 &&lan<=100) ||ta43.getText().isEmpty()) && ((kisw>=0 &&kisw<=100) ||ta44.getText().isEmpty()) && ((hist>=0 &&hist<=100) ||ta45.getText().isEmpty()) && ((gs>=0 &&gs<=100) ||ta46.getText().isEmpty()) ) {
	 		    				
	 		    				
	 		 		    	    String sq="update mark set lan='"+m3+"',glan='"+g3+"',kis='"+m2+"',gkis='"+g2+"',dini='"+m1+"',gdini='"+g1+"',gs='"+m5+"',ggs='"+g5+"',point='"+sm+"' where id='"+id+"' ";
	 		 					ps=con.prepareStatement(sq);
	 		 					ps.execute();
	 		 					
	 		 					JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
	 		 					ta43.setText("");ta44.setText("");ta45.setText("");ta46.setText("");
	 		 					
	 		 					area();

	 		    			}else {
	 		    				
	 		    				 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
	 		    			}
	 		    			
	 		    			
	 		    		
	 			
	 		             }catch(Exception ex) {
	 		            	 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
	 		                } finally {
	 							
	 							try {
	 								
	 								rs.close();
	 								ps.close();
	 								
	 								
	 							}catch(Exception e) {
	 								
	 							}
	 							
	 						}
	 					
	 			}}
			
					
			
			}catch(Exception e1) {
				 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
			}finally {
				
				try {
					
					rs.close();
					ps.close();
					
					
				}catch(Exception e) {
					
				}
				
			}
			
		}
		else
		{
			
			try {
				
				
				
				
				
				
				
				
				
				
				
			}catch(Exception e1) {
				JOptionPane.showMessageDialog(null,e1.getStackTrace());
			}finally {
				
				try {
					
					rs.close();
					ps.close();
			
					
				}catch(Exception e) {
					
				}
				
			}
			
			
			
		}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} 
		finally {
			
			try {
				
				rs.close();
				ps.close();
			
				
			}catch(Exception e) {
				
			}
			
		}
		
	}

	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	private void update() {
		try {
			grade();
		String sql="select count(id) from mark where id='"+t0.getText()+"' ";
		ps=con.prepareStatement(sql);
		rs=ps.executeQuery();
		
		int namba=Integer.parseInt(rs.getString("count(id)"));
		if(namba==1) {
			
			
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			try {
				String id=t0.getText().toUpperCase();t50.setText(id);t50.setEditable(false);
				String fn=t1.getText().toUpperCase();t51.setText(fn);
				String ln=t2.getText().toUpperCase();t52.setText(ln);
				String gn=t3.getSelectedItem().toString();t53.setSelectedItem(gn);
				String cl=t4.getSelectedItem().toString();t54.setSelectedItem(cl);
				String co=t5.getSelectedItem().toString();t55.setSelectedItem(co);
				String exam=t6.getSelectedItem().toString();t56.setSelectedItem(exam);

				
				
	          
			if(co.matches("PCM")) {

            	String sql1="select * from mark where id='"+id+"' ";
            	ps=con.prepareStatement(sql1);
            	rs=ps.executeQuery();
            	t7.setText(rs.getString("phy"));
            	t8.setText(rs.getString("che"));
            	t10.setText(rs.getString("math"));
            	t13.setText(rs.getString("gs"));
            	
            	
            	
				int result = JOptionPane.showConfirmDialog(null, pana, "Insert Marks",
			            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				
			if(result==JOptionPane.OK_OPTION) {
				
				
				String gp="",gc = "",gm = "",gg,g1="",g2 = "",g3 = "",g4 ="",sm;
				String m1;
    			String m2;
    			String m3;
    			String m4;
    			double phy=0.0;double che=0.0;double math=0.0;double gs=0.0;
				
            	
	            try {
	            	
	            	
	    			if(t7.getText().matches("-") ||t7.getText().isEmpty()) {
	    				 g1="";gp="Inc";m1="";
	    			}else  {
	    				m1=t7.getText();
    				  phy=Double.parseDouble(t7.getText());
    	    			
    				
    						if(phy>=grd1 && phy<=grd2){
    	    	    		       g1="A";gp="1";
    	    	    		      }else if(phy>=grd3 && phy<grd4){
    	    	    		    	  g1="B";gp="2";
    	    	    		      }
    	    	    		      else if(phy>=grd5 && phy<grd6){
    	    	    		    	  g1="C";gp="3";
    	    	    		      }
    	    	    		      else if(phy>=grd7 && phy<grd8){
    	    	    		    	  g1= "D";gp="4";
    	    	    			      }
    	    	    			  else if(phy>=grd9 && phy<grd10){
    	    	    				  g1="E";gp="5";
    	    	    			      }
    	    	    			  else if(phy>=grd11 && phy<grd12){
    	    	    				  g1= "S";gp="6";
    	    	    			      } 
    	    	    			      else if(phy>=grd13 && phy<grd14) {
    	    	    			    	  g1="F";gp="7";
    	    	    			    
    	    	    			      }
    					
    	    			
	    				}
	    					
	    				
	    			
	    			if(t8.getText().isEmpty() ||t8.getText().matches("-")) {
	    				m2="";g2="";gc="Inc";
	    			}else {
	    				
	    				m2= t8.getText();
	    				che=Double.parseDouble(t8.getText());
	    			     if(che>=grd1 && che<=grd2){
	    			       g2= "A";gc="1";
	    			      }else if(che>=grd3 && che<grd4){
	    			    	  g2= "B";gc="2";
	    			      }
	    			      else if(che>=grd5 && che<grd6){
	    			    	  g2= "C";gc="3";
	    			      }
	    			      else if(che>=grd7 && che<grd8){
	    			    	  g2= "D";gc="4";
	    				      }
	    				  else if(che>=grd9 && che<grd10){
	    					  g2= "E";gc="5";
	    				      }
	    				  else if(che>=grd11 && che<grd12){
	    					  g2= "S";gc="6";
	    				      }
	    				      else if(che>=grd13 && che<grd14) {
	    				    	  g2= "F";gc="7";
	    				      }}
	            
	    			
	    			
	    			
	    			
	    			if(t10.getText().isEmpty() || t10.getText().matches("-")) {
	    				m3="";g3="";gm="Inc";
	    			}else {
	    		        m3= t10.getText();
	    		        
	    		        math=Double.parseDouble(t10.getText());
	    		       	if(math>=grd1 && math<=grd2){
	    			       g3="A";gm="1";
	    			      }else if(math>=grd3 && math<grd4){
	    			    	  g3= "B";gm="2";
	    			      }
	    			      else if(math>=grd5 && math<grd6){
	    			    	  g3="C";gm="3";
	    			      }
	    			      else if(math>=grd7 && math<grd8){
	    			    	  g3="D";gm="4";
	    				      }
	    				  else if(math>=grd9 && math<grd10){
	    					  g3="E";gm="5";
	    				      }
	    				  else if(math>=grd11 && math<grd12){
	    					  g3= "S";gm="6";
	    				      }
	    				      else if(math>=grd13 && math<grd14) {
	    				    	  g3="F";gm="7";
	    				      }
	    				      }
	    			
	    			
	    			
	    			if(t13.getText().isEmpty() || t13.getText().matches("-")) {
	    				m4="";g4="";gg="Inc";
	    			}else {
	    				m4= t13.getText();
	    				 gs=Double.parseDouble(t13.getText());
	    			     if(gs>=grd1 && gs<=grd2){
	    			       g4="A";gg="1";
	    			      }else if(gs>=grd3 && gs<grd4){
	    			    	  g4= "B";gg="2";
	    			      }
	    			      else if(gs>=grd5 && gs<grd6){
	    			    	  g4="C";gg="3";
	    			      }
	    			      else if(gs>=grd7 && gs<grd8){
	    			    	  g4="D";gg="4";
	    				      }
	    				  else if(gs>=grd9 && gs<grd10){
	    					  g4= "E";gg="5";
	    				      }
	    				  else if(gs>=grd11 && gs<grd12){
	    					  g4="S";gg="6";
	    				      }
	    				      else if(gs>=grd13 && gs<grd14) {
	    				    	  g4="F";gg="7";
	    				      }
	    			}
	    			
	    			if(!t7.getText().isEmpty() &&!t10.getText().matches("-")&&!t8.getText().isEmpty() &&!t10.getText().isEmpty() &&!t7.getText().matches("-")&&!t8.getText().matches("-"))
	    			{
	    				int pp=Integer.parseInt(gp);
	    				int pc=Integer.parseInt(gc);
	    				int pm=Integer.parseInt(gm);
	    				
	    				
	    				int sum=pp+pc+pm;
	    				sm=Integer.toString(sum);
	    				
	    				
	    			}
	    			else {
	    				 sm="Inc";
	    			}
	    			if(((phy>=0 &&phy<=100) ||t7.getText().isEmpty()) && ((che>=0 &&che<=100) ||t8.getText().isEmpty()) && ((math>=0 &&math<=100) ||t10.getText().isEmpty()) && ((gs>=0 &&gs<=100) ||t13.getText().isEmpty()) ) {
	    				 String sq="update mark set phy='"+m1+"',gphy='"+g1+"',che='"+m2+"',gche='"+g2+"',math='"+m3+"',gmath='"+g3+"',gs='"+m4+"',ggs='"+g4+"',point='"+sm+"' where id='"+id+"' ";
	    					ps=con.prepareStatement(sq);
	    					ps.execute();
	    					
	    					JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
	    					t7.setText("");t8.setText("");t10.setText("");t13.setText("");
	    				    area();
	    				
	    			}else {
	    				
	    				 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
	    			}
	    				      
	    	   
	    			
	             }catch(Exception ex) {
		                JOptionPane.showMessageDialog(null,ex.getStackTrace());
	                }
                        finally {
					
					try {
						rs.close();
						ps.close();
						
						
					}catch(Exception e) {
						
					}
					
				}
	           
	            
	            
			
			}
		      	}
			
			
			else if(co.matches("PCB")) {
			
				String sql11="select * from mark where id='"+id+"' ";
            	ps=con.prepareStatement(sql11);
            	rs=ps.executeQuery();
            	
            	t17.setText(rs.getString("phy"));
            	t18.setText(rs.getString("che"));
            	t19.setText(rs.getString("bio"));
            	t22.setText(rs.getString("bam"));
            	t23.setText(rs.getString("gs"));
            	
				int result = JOptionPane.showConfirmDialog(null, pana1, "Insert Marks",
			            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				
			
				 if(result==JOptionPane.OK_OPTION) {
				
					 String gp = "",gc = null,gm,gg,g1 = null,g2 = null,g3 = null,g4 = null,g5 = null,gb = null,sm;
			            try {
			            	
			            
			            	String m1;
			    			String m2;
			    			String m3;
			    			String m4;
			    			String m5;
			    			double phy=0.0,bio=0.0,che=0.0,bam=0.0,gs=0.0;
			    			
			    			if(t17.getText().isEmpty() || t17.getText().matches("-")) {
			    				m1="";g1="";gp="Inc";
			    			}else {
			    				m1=t17.getText();
			    				 phy=Double.parseDouble(t17.getText());
				    			
				    			if(phy>=grd1 && phy<=grd2){
				    		       g1="A";gp="1";
				    		      }else if(phy>=grd3 && phy<grd4){
				    		    	  g1="B";gp="2";
				    		      }
				    		      else if(phy>=grd5 && phy<grd6){
				    		    	  g1="C";gp="3";
				    		      }
				    		      else if(phy>=grd7 && phy<grd8){
				    		    	  g1= "D";gp="4";
				    			      }
				    			  else if(phy>=grd9 && phy<grd10){
				    				  g1="E";gp="5";
				    			      }
				    			  else if(phy>=grd11 && phy<grd12){
				    				  g1= "S";gp="6";
				    			      }
				    			  else if(phy>=grd13 && phy<grd14){
				    				  g1="F";gp="7";
				    			  }
			    			}
			    			
			    			
			    			
			    			
			    			if(t18.getText().isEmpty()|| t18.getText().matches("-")) {
			    				m2="";g2="";gc="Inc";
			    			}else {
			    				m2= t18.getText();
			    				 che=Double.parseDouble(t18.getText());
			    			     if(che>=grd1 && che<=grd2){
			    			       g2= "A";gc="1";
			    			      }else if(che>=grd3 && che<grd4){
			    			    	  g2= "B";gc="2";
			    			      }
			    			      else if(che>=grd5 && che<grd6){
			    			    	  g2= "C";gc="3";
			    			      }
			    			      else if(che>=grd7 && che<grd8){
			    			    	  g2= "D";gc="4";
			    				      }
			    				  else if(che>=grd9 && che<grd10){
			    					  g2= "E";gc="5";
			    				      }
			    				  else if(che>=grd11 && che<grd12){
			    					  g2= "S";gc="6";
			    				      }
			    				      else if(che>=grd13 && che<grd14){
			    				    	  g2= "F";gc="7";
			    				      }
			    			}
			    			
			    			
			    			if(t19.getText().isEmpty() || t19.getText().matches("-")) {
			    				m3="";g3="";gb="Inc";
			    			}else {
			    		        m3= t19.getText();
			    		        bio=Double.parseDouble(t19.getText());
			    		        if(bio>=grd1 && bio<=grd2){
				    			       g3="A";gb="1";
				    			      }else if(bio>=grd3 && bio<grd4){
				    			    	  g3= "B";gb="2";
				    			      }
				    			      else if(bio>=grd5 && bio<grd6){
				    			    	  g3="C";gb="3";
				    			      }
				    			      else if(bio>=grd7 && bio<grd8){
				    			    	  g3="D";gb="4";
				    				      }
				    				  else if(bio>=grd9 && bio<grd10){
				    					  g3="E";gb="5";
				    				      }
				    				  else if(bio>=grd11 && bio<grd12){
				    					  g3= "S";gb="6";
				    				      }
				    				      else if(bio>=grd13 && bio<grd14)  {
				    				    	  g3="F";gb="7";
				    				      }
			    			}
			    			
			    			
			    			if(t22.getText().isEmpty() || t22.getText().matches("-")) {
			    				gm="Inc";m4="";g4="";
			    			}else {
			    				m4= t22.getText();
			    	           bam=Double.parseDouble(t22.getText());
			    			     if(bam>=grd1 && bam<=grd2){
			    			       g4="A";gm="1";
			    			      }else if(bam>=grd3 && bam<grd4){
			    			    	  g4= "B";gm="2";
			    			      }
			    			      else if(bam>=grd5 && bam<grd6){
			    			    	  g4="C";gm="3";
			    			      }
			    			      else if(bam>=grd7 && bam<grd8){
			    			    	  g4="D";gm="4";
			    				      }
			    				  else if(bam>=grd9 && bam<grd10){
			    					  g4= "E";gm="5";
			    				      }
			    				  else if(bam>=grd11 && bam<grd12){
			    					  g4="S";gm="6";
			    				      }
			    				      else if(bam>=grd13 && bam<grd14) {
			    				    	  g4="F";gm="7";
			    				      }
			    			}
			    			
			    			if(t23.getText().isEmpty() ||t23.getText().matches("-")) {
			    				gg="Inc";g5="";m5="";
			    			}else {
			    				m5= t23.getText();
			    				 gs=Double.parseDouble(t23.getText());
			    			     if(gs>=grd1 && gs<=grd2){
			    			       g5="A";gg="1";
			    			      }else if(gs>=grd3 && gs<grd4){
			    			    	  g5= "B";gg="2";
			    			      }
			    			      else if(gs>=grd5 && gs<grd6){
			    			    	  g5="C";gg="3";
			    			      }
			    			      else if(gs>=grd7 && gs<grd8){
			    			    	  g5="D";gg="4";
			    				      }
			    				  else if(gs>=grd9 && gs<grd10){
			    					  g5= "E";gg="5";
			    				      }
			    				  else if(gs>=grd11 && gs<grd12){
			    					  g5="S";gg="6";
			    				      }
			    				      else if(gs>=grd13 && gs<grd14) {
			    				    	  g5="F";gg="7";
			    				      }
			    			}
			    			
			    			
			    			if(!t17.getText().isEmpty()&&!t18.getText().isEmpty() &&!t19.getText().isEmpty()&&!t18.getText().matches("-")&&!t19.getText().matches("-") && !t17.getText().matches("-"))
			    			{
			    				int pp=Integer.parseInt(gp);
			    				int pc=Integer.parseInt(gc);
			    				int pb=Integer.parseInt(gb);
			    				
			    				
			    				int sum=pp+pc+pb;
			    				sm=Integer.toString(sum);
			    				
			    				
			    			}
			    			else {
			    				 sm="Inc";
			    			}
			    			
			    			if(((phy>=0 &&phy<=100) ||t17.getText().isEmpty()) && ((che>=0 &&che<=100) ||t18.getText().isEmpty()) && ((bio>=0 &&bio<=100) ||t19.getText().isEmpty()) && ((gs>=0 &&gs<=100) ||t23.getText().isEmpty()) && ((bam>=0 &&bam<=100) ||t22.getText().isEmpty()) ) {
			    			      
					    	    String sq="update mark set phy='"+m1+"',gphy='"+g1+"',che='"+m2+"',gche='"+g2+"',bio='"+m3+"',gbio='"+g3+"',bam='"+m4+"',gbam='"+g4+"',gs='"+m5+"',ggs='"+g5+"',point='"+sm+"' where id='"+id+"' ";
								ps=con.prepareStatement(sq);
								ps.execute();
								
								JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
								t17.setText("");t18.setText("");t19.setText("");t22.setText("");t23.setText("");
								area();
			    				
			    			}else {
			    				
			    				 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
			    			}
			    				
			    			
			    		
				
			             }catch(Exception ex) {
			            	 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
			                } finally {
								
								try {
									rs.close();
									ps.close();
									
								}catch(Exception e) {
									
								}
								
							}
				           
			          
			}}
			

			else if(co.matches("PGM")) {
				
				String sql1="select * from mark where id='"+id+"' ";
            	ps=con.prepareStatement(sql1);
            	rs=ps.executeQuery();
            	t27.setText(rs.getString("phy"));
            	t30.setText(rs.getString("math"));
            	t31.setText(rs.getString("geo"));
            	t33.setText(rs.getString("gs"));
            	
				
				int result = JOptionPane.showConfirmDialog(null, pana2, "Insert Marks",
			            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				
			
			if(result==JOptionPane.OK_OPTION) {
				
				 try {
		            	
		            	//String m1=t27.getText();String m2=t30.getText();String m3=t31.getText();String m4=t33.getText();
		    			
					 String gp = null,gc="",gm = null,gg,g1 = null,g2="",g3 = null,g4 = null,sm;
		            	String m1;
		    			String m2="";
		    			String m3;
		    			String m4;
		    			double phy=0.0,geo=0.0,math=0.0,gs=0.0;
		    			
		    			if(t27.getText().isEmpty() ||t27.getText().matches("-")) {
		    				gp="Inc";g1="";m1="";
		    			}else {
		    				m1=t27.getText();
		    			  phy=Double.parseDouble(t27.getText());
			    			
			    			if(phy>=grd1 && phy<=grd2){
			    		       g1="A";gp="1";
			    		      }else if(phy>=grd3 && phy<grd4){
			    		    	  g1="B";gp="2";
			    		      }
			    		      else if(phy>=grd5 && phy<grd6){
			    		    	  g1="C";gp="3";
			    		      }
			    		      else if(phy>=grd7 && phy<grd8){
			    		    	  g1= "D";gp="4";
			    			      }
			    			  else if(phy>=grd9 && phy<grd10){
			    				  g1="E";gp="5";
			    			      }
			    			  else if(phy>=grd11 && phy<grd12){
			    				  g1= "S";gp="6";
			    			      }
			    			      else if(phy>=grd13 && phy<grd14) {
			    			    	  g1="F";gp="7";
			    			      }
		    			}
		    			
		    			if(t31.getText().isEmpty()|| t31.getText().matches("-")) {
		    				
		    				gc="Inc";m2="";g2="";
		    			}
		    				
		    				else {
		    					m2=t31.getText();
		    					geo=Double.parseDouble(t31.getText());
			    			     if(geo>=grd1 && geo<=grd2){
			    			       g2= "A";gc="1";
			    			      }else if(geo>=grd3 && geo<grd4){
			    			    	  g2= "B";gc="2";
			    			      }
			    			      else if(geo>=grd5 && geo<grd6){
			    			    	  g2= "C";gc="3";
			    			      }
			    			      else if(geo>=grd7 && geo<grd8){
			    			    	  g2= "D";gc="4";
			    				      }
			    				  else if(geo>=grd9 && geo<grd10){
			    					  g2= "E";gc="5";
			    				      }
			    				  else if(geo>=grd11 && geo<grd12){
			    					  g2= "S";gc="6";
			    				      }
			    				      else if(geo>=grd13 && geo<grd14){
			    				    	  g2= "F";gc="7";
			    				      }	
		    				}
		    				
		    				
		    			
		    			if(t30.getText().isEmpty()|| t30.getText().matches("-")) {
		    				gm="Inc";m3="";g3="";
		    			}else {
		    		        m3= t30.getText();
		    		        math=Double.parseDouble(t30.getText());
		    		       	if(math>=grd1 && math<=grd2){
		    			       g3="A";gm="1";
		    			      }else if(math>=grd3 && math<grd4){
		    			    	  g3= "B";gm="2";
		    			      }
		    			      else if(math>=grd5 && math<grd6){
		    			    	  g3="C";gm="3";
		    			      }
		    			      else if(math>=grd7 && math<grd8){
		    			    	  g3="D";gm="4";
		    				      }
		    				  else if(math>=grd9 && math<grd10){
		    					  g3="E";gm="5";
		    				      }
		    				  else if(math>=grd11 && math<grd12){
		    					  g3= "S";gm="6";
		    				      }
		    				      else if(math>=grd13 && math<grd14) {
		    				    	  g3="F";gm="7";
		    				      }
		    			}
		    			
		    			if(t33.getText().isEmpty() ||t33.getText().matches("-")) {
		    				gg="Inc";m4="";g4="";
		    			}else {
		    				m4= t33.getText();
		    				gs=Double.parseDouble(t33.getText());
		    			     if(gs>=grd1 && gs<=grd2){
		    			       g4="A";gg="1";
		    			      }else if(gs>=grd3 && gs<grd4){
		    			    	  g4= "B";gg="2";
		    			      }
		    			      else if(gs>=grd5 && gs<grd6){
		    			    	  g4="C";gg="3";
		    			      }
		    			      else if(gs>=grd7 && gs<grd8){
		    			    	  g4="D";gg="4";
		    				      }
		    				  else if(gs>=grd9 && gs<grd10){
		    					  g4= "E";gg="5";
		    				      }
		    				  else if(gs>=grd11 && gs<grd12){
		    					  g4="S";gg="6";
		    				      }
		    				      else if(gs>=grd13 && gs<grd14) {
		    				    	  g4="F";gg="7";
		    				      }
		    			}
		    			
		    			
		    			if(!t27.getText().isEmpty() && !t30.getText().matches("-")&&!t31.getText().isEmpty()&&!t30.getText().isEmpty()&&!t31.getText().isEmpty()&& !t27.getText().matches("-")&&!t31.getText().matches("-") )
		    			{
		    				int pp=Integer.parseInt(gp);
		    				int pc=Integer.parseInt(gc);
		    				int pm=Integer.parseInt(gm);
		    				
		    				
		    				int sum=pp+pc+pm;
		    				sm=Integer.toString(sum);
		    				
		    				
		    			}
		    			else {
		    				 sm="Inc";
		    			}
		    			
		    			if(((phy>=0 &&phy<=100) ||t27.getText().isEmpty()) && ((geo>=0 && geo<=100) ||t31.getText().isEmpty()) && ((math>=0 &&math<=100) ||t30.getText().isEmpty()) && ((gs>=0 &&gs<=100) ||t33.getText().isEmpty()) ) {
		    				
		    				String sq="update mark set phy='"+m1+"',gphy='"+g1+"',geo='"+m2+"',ggeo='"+g2+"',math='"+m3+"',gmath='"+g3+"',gs='"+m4+"',ggs='"+g4+"',point='"+sm+"' where id='"+id+"' ";
		 					ps=con.prepareStatement(sq);
		 					ps.execute();
		 					
		 					JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
		 					 t27.setText("");t30.setText("");t31.setText("");t33.setText("");
		 					area();
		 			
		    				
		    			}else {
		    				
		    				 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    			}
		    				
		    			
		             }catch(Exception ex) {
		            	 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		                }  finally {
							
							try {
								rs.close();
								ps.close();
								
								
							}catch(Exception e) {
								
							}
							
						}
			           
					
			}}
			
	      else if(co.matches("EGM")) {
				
				String sql1="select * from mark where id='"+id+"' ";
            	ps=con.prepareStatement(sql1);
            	rs=ps.executeQuery();
            	ta1.setText(rs.getString("ec"));
            	ta3.setText(rs.getString("math"));
            	ta2.setText(rs.getString("geo"));
            	ta4.setText(rs.getString("gs"));
            	
				
				int result = JOptionPane.showConfirmDialog(null, pana5, "Insert Marks",
			            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				
			
			if(result==JOptionPane.OK_OPTION) {
				
				 try {
		            
		    			
					 String gp = null,gc="",gm = null,gg,g1 = null,g2="",g3 = null,g4 = null,sm;
		            	String m1;
		    			String m2="";
		    			String m3;
		    			String m4;
		    			double phy=0.0;double geo=0.0;double math=0.0;double gs=0.0;
		    			
		    			if(ta1.getText().isEmpty() ||ta1.getText().matches("-")) {
		    				gp="Inc";g1="-";m1="-";
		    			}else {
		    				m1=ta1.getText();
		    			    phy=Double.parseDouble(ta1.getText());
			    			
			    			if(phy>=grd1 && phy<=grd2){
			    		       g1="A";gp="1";
			    		      }else if(phy>=grd3 && phy<grd4){
			    		    	  g1="B";gp="2";
			    		      }
			    		      else if(phy>=grd5 && phy<grd6){
			    		    	  g1="C";gp="3";
			    		      }
			    		      else if(phy>=grd7 && phy<grd8){
			    		    	  g1= "D";gp="4";
			    			      }
			    			  else if(phy>=grd9 && phy<grd10){
			    				  g1="E";gp="5";
			    			      }
			    			  else if(phy>=grd11 && phy<grd12){
			    				  g1= "S";gp="6";
			    			      }
			    			      else if(phy>=grd13 && phy<grd14) {
			    			    	  g1="F";gp="7";
			    			      }
		    			}
		    			
		    			if(ta2.getText().isEmpty()|| ta2.getText().matches("-")) {
		    				
		    				gc="Inc";m2="-";g2="-";
		    			}
		    				
		    				else {
		    					m2=ta2.getText();
		    					 geo=Double.parseDouble(ta2.getText());
			    			     if(geo>=grd1 && geo<=grd2){
			    			       g2= "A";gc="1";
			    			      }else if(geo>=grd3 && geo<grd4){
			    			    	  g2= "B";gc="2";
			    			      }
			    			      else if(geo>=grd5 && geo<grd6){
			    			    	  g2= "C";gc="3";
			    			      }
			    			      else if(geo>=grd7 && geo<grd8){
			    			    	  g2= "D";gc="4";
			    				      }
			    				  else if(geo>=grd9 && geo<grd10){
			    					  g2= "E";gc="5";
			    				      }
			    				  else if(geo>=grd11 && geo<grd12){
			    					  g2= "S";gc="6";
			    				      }
			    				      else if(geo>=grd13 && geo<grd14) {
			    				    	  g2= "F";gc="7";
			    				      }	
		    				}
		    				
		    				
		    			
		    			if(ta3.getText().isEmpty()|| ta3.getText().matches("-")) {
		    				gm="Inc";m3="-";g3="-";
		    			}else {
		    		        m3= ta3.getText();
		    		         math=Double.parseDouble(ta3.getText());
		    		       	if(math>=grd1 && math<=grd2){
		    			       g3="A";gm="1";
		    			      }else if(math>=grd3 && math<grd4){
		    			    	  g3= "B";gm="2";
		    			      }
		    			      else if(math>=grd5 && math<grd6){
		    			    	  g3="C";gm="3";
		    			      }
		    			      else if(math>=grd7 && math<grd8){
		    			    	  g3="D";gm="4";
		    				      }
		    				  else if(math>=grd9 && math<grd10){
		    					  g3="E";gm="5";
		    				      }
		    				  else if(math>=grd11 && math<grd12){
		    					  g3= "S";gm="6";
		    				      }
		    				      else if(math>=grd13 && math<grd14) {
		    				    	  g3="F";gm="7";
		    				      }
		    			}
		    			
		    			if(ta4.getText().isEmpty() ||ta4.getText().matches("-")) {
		    				gg="Inc";m4="-";g4="-";
		    			}else {
		    				m4= ta4.getText();
		    			    gs=Double.parseDouble(ta4.getText());
		    			     if(gs>=grd1 && gs<=grd2){
		    			       g4="A";gg="1";
		    			      }else if(gs>=grd3 && gs<grd4){
		    			    	  g4= "B";gg="2";
		    			      }
		    			      else if(gs>=grd5 && gs<grd6){
		    			    	  g4="C";gg="3";
		    			      }
		    			      else if(gs>=grd7 && gs<grd8){
		    			    	  g4="D";gg="4";
		    				      }
		    				  else if(gs>=grd9 && gs<grd10){
		    					  g4= "E";gg="5";
		    				      }
		    				  else if(gs>=grd11 && gs<grd12){
		    					  g4="S";gg="6";
		    				      }
		    				      else   if(gs>=grd13 && gs<grd14){
		    				    	  g4="F";gg="7";
		    				      }
		    			}
		    			
		    			
		    			if(!ta1.getText().isEmpty() && !ta3.getText().matches("-")&&!ta2.getText().isEmpty()&&!ta3.getText().isEmpty()&&!ta2.getText().isEmpty()&& !ta1.getText().matches("-"))
		    			{
		    				int pp=Integer.parseInt(gp);
		    				int pc=Integer.parseInt(gc);
		    				int pm=Integer.parseInt(gm);
		    				
		    				
		    				int sum=pp+pc+pm;
		    				sm=Integer.toString(sum);
		    				
		    				
		    			}
		    			else {
		    				 sm="Inc";
		    			}
		    			if(((phy>=0 &&phy<=100) ||ta1.getText().isEmpty()) && ((geo>=0 &&geo<=100) ||ta2.getText().isEmpty()) && ((math>=0 &&math<=100) ||ta3.getText().isEmpty()) && ((gs>=0 &&gs<=100) ||ta4.getText().isEmpty()) ) {
		    				
		    			      
				    	    String sq="update mark set ec='"+m1+"',gec='"+g1+"',geo='"+m2+"',ggeo='"+g2+"',math='"+m3+"',gmath='"+g3+"',gs='"+m4+"',ggs='"+g4+"',point='"+sm+"' where id='"+id+"' ";
							ps=con.prepareStatement(sq);
							ps.execute();
							
							JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
							ta1.setText("");ta2.setText("");ta3.setText("");ta4.setText("");
							area();
		    			}else {
		    				
		    				 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    			}
		    				
		    			
		    		
			
		             }catch(Exception ex) {
		            	 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		                }
				 finally {
						
						try {
							rs.close();
							ps.close();
							
							
						}catch(Exception e) {
							
						}
						
					}
		           
			}}
			
			
	      else if(co.matches("ECA")) {
				
				String sql1="select * from mark where id='"+id+"' ";
          	ps=con.prepareStatement(sql1);
          	rs=ps.executeQuery();
          	ta10.setText(rs.getString("ec"));
          	ta11.setText(rs.getString("co"));
          	ta12.setText(rs.getString("aco"));
          	ta13.setText(rs.getString("bam"));
          	ta14.setText(rs.getString("gs"));
          	
				
				int result = JOptionPane.showConfirmDialog(null, pana7, "Insert Marks",
			            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				
			
			if(result==JOptionPane.OK_OPTION) {
				
				 try {
					 
					 

			            
		    			
					 String gp = null,gh = null,gc="",gm,gg,g1 = null,g2="",g3 = null,g4 = null,sm;
		            	String m1;
		    			String m2="";
		    			String m3;
		    			String m4,m5,g5 = null;
		    			double eco=0.0,com=0.0,aco=0.0,bam=0.0,gs=0.0;
		    			
		    			if(ta10.getText().isEmpty() ||ta10.getText().matches("-")) {
		    				gp="Inc";g1="-";m1="-";
		    			}else {
		    				m1=ta10.getText();
		    			    eco=Double.parseDouble(ta10.getText());
			    			
			    			if(eco>=grd1 && eco<=grd2){
			    		       g1="A";gp="1";
			    		      }else if(eco>=grd3 && eco<grd4){
			    		    	  g1="B";gp="2";
			    		      }
			    		      else if(eco>=grd5 && eco<grd6){
			    		    	  g1="C";gp="3";
			    		      }
			    		      else if(eco>=grd7 && eco<grd8){
			    		    	  g1= "D";gp="4";
			    			      }
			    			  else if(eco>=grd9 && eco<grd10){
			    				  g1="E";gp="5";
			    			      }
			    			  else if(eco>=grd11 && eco<grd12){
			    				  g1= "S";gp="6";
			    			      }
			    			      else  if(eco>=grd13 && eco<grd14) {
			    			    	  g1="F";gp="7";
			    			      }
		    			}
		    			
		    			if(ta11.getText().isEmpty()|| ta11.getText().matches("-")) {
		    				
		    				gc="Inc";m2="-";g2="-";
		    			}
		    				
		    				else {
		    					m2=ta11.getText();
		    					com=Double.parseDouble(ta11.getText());
			    			     if(com>=grd1 && com<=grd2){
			    			       g2= "A";gc="1";
			    			      }else if(com>=grd3 && com<grd4){
			    			    	  g2= "B";gc="2";
			    			      }
			    			      else if(com>=grd5 && com<grd6){
			    			    	  g2= "C";gc="3";
			    			      }
			    			      else if(com>=grd7 && com<grd8){
			    			    	  g2= "D";gc="4";
			    				      }
			    				  else if(com>=grd9 && com<grd10){
			    					  g2= "E";gc="5";
			    				      }
			    				  else if(com>=grd11 && com<grd12){
			    					  g2= "S";gc="6";
			    				      }
			    				      else if(com>=grd13 && com<grd14){
			    				    	  g2= "F";gc="7";
			    				      }	
		    				}
		    				
		    				
		    			
		    			if(ta12.getText().isEmpty()|| ta12.getText().matches("-")) {
		    				gh="Inc";m3="-";g3="-";
		    			}else {
		    		        m3= ta12.getText();
		    		        aco=Double.parseDouble(ta12.getText());
		    		       	if(aco>=grd1 && aco<=grd2){
		    			       g3="A";gh="1";
		    			      }else if(aco>=grd3 && aco<grd4){
		    			    	  g3= "B";gh="2";
		    			      }
		    			      else if(aco>=grd5 && aco<grd6){
		    			    	  g3="C";gh="3";
		    			      }
		    			      else if(aco>=grd7 && aco<grd8){
		    			    	  g3="D";gh="4";
		    				      }
		    				  else if(aco>=grd9 && aco<grd10){
		    					  g3="E";gh="5";
		    				      }
		    				  else if(aco>=grd11 && aco<grd12){
		    					  g3= "S";gh="6";
		    				      }
		    				      else if(aco>=grd13 && aco<grd14) {
		    				    	  g3="F";gh="7";
		    				      }
		    			}
		    			
		    			
		    			if(ta13.getText().isEmpty()|| ta13.getText().matches("-")) {
		    				gm="Inc";m4="-";g4="-";
		    			}else {
		    		        m4= ta13.getText();
		    		        bam=Double.parseDouble(ta13.getText());
		    		       	if(bam>=grd1 && bam<=grd2){
		    			       g4="A";gm="1";
		    			      }else if(bam>=grd3 && bam<grd4){
		    			    	  g4= "B";gm="2";
		    			      }
		    			      else if(bam>=grd5 && bam<grd6){
		    			    	  g4="C";gm="3";
		    			      }
		    			      else if(bam>=grd7 && bam<grd8){
		    			    	  g4="D";gm="4";
		    				      }
		    				  else if(bam>=grd9 && bam<grd10){
		    					  g4="E";gm="5";
		    				      }
		    				  else if(bam>=grd11 && bam<grd12){
		    					  g4= "S";gm="6";
		    				      }
		    				      else if(bam>=grd13 && bam<grd14) {
		    				    	  g4="F";gm="7";
		    				      }
		    			}
		    			
						
		    			if(ta14.getText().isEmpty() ||ta14.getText().matches("-")) {
		    				gg="Inc";m5="-";g5="-";
		    			}else {
		    				m5= ta14.getText();
		    				gs=Double.parseDouble(ta14.getText());
		    			     if(gs>=grd1 && gs<=grd2){
		    			       g5="A";gg="1";
		    			      }else if(gs>=grd3 && gs<grd4){
		    			    	  g5= "B";gg="2";
		    			      }
		    			      else if(gs>=grd5 && gs<grd6){
		    			    	  g5="C";gg="3";
		    			      }
		    			      else if(gs>=grd7 && gs<grd8){
		    			    	  g5="D";gg="4";
		    				      }
		    				  else if(gs>=grd9 && gs<grd10){
		    					  g5= "E";gg="5";
		    				      }
		    				  else if(gs>=grd11 && gs<grd12){
		    					  g5="S";gg="6";
		    				      }
		    				      else if(gs>=grd13 && gs<grd14) {
		    				    	  g5="F";gg="7";
		    				      }
		    			}
		    			
		    			
		    			if(!ta12.getText().isEmpty() && !ta10.getText().matches("-")&&!ta11.getText().isEmpty()&&!ta10.getText().isEmpty()&&!ta11.getText().isEmpty()&& !ta12.getText().matches("-"))
		    			{
		    				int pp=Integer.parseInt(gp);
		    				int pc=Integer.parseInt(gc);
		    				int pm=Integer.parseInt(gh);
		    				
		    				
		    				int sum=pp+pc+pm;
		    				sm=Integer.toString(sum);
		    				
		    				
		    			}
		    			else {
		    				 sm="Inc";
		    			}

		    			if(((eco>=0 && eco<=100) ||ta10.getText().isEmpty()) && ((com>=0 &&com<=100) ||ta11.getText().isEmpty()) && ((aco>=0 &&aco<=100) ||ta12.getText().isEmpty()) && ((gs>=0 &&gs<=100) ||ta14.getText().isEmpty())&& ((bam>=0 &&bam<=100) ||ta13.getText().isEmpty()) ) {
		    				
		    				String sq="update mark set aco='"+m3+"',gaco='"+g3+"',co='"+m2+"',gco='"+g2+"',ec='"+m1+"',gec='"+g1+"',bam='"+m4+"',gbam='"+g4+"',gs='"+m5+"',ggs='"+g5+"',point='"+sm+"' where id='"+id+"' ";
		 					ps=con.prepareStatement(sq);
		 					ps.execute();
		 					
		 					JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
		 					ta10.setText("");ta11.setText("");ta12.setText("");ta13.setText("");
		 					area();
		 		
		    			}else {
		    				
		    				 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    			}
		    			
		    				      
		    	   
					 
					 
				 }catch(Exception ex) {
		            	 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		                }  finally {
							
							try {
								rs.close();
								ps.close();
								
								
							}catch(Exception e) {
								
							}
							
						}
			           
			}}
			
	   else if(co.matches("HGE")) {
			
		String sql1="select * from mark where id='"+id+"' ";
       	ps=con.prepareStatement(sql1);
       	rs=ps.executeQuery();
       	ta5.setText(rs.getString("his"));
       	ta6.setText(rs.getString("geo"));
       	ta7.setText(rs.getString("ec"));
       	ta8.setText(rs.getString("bam"));
       	ta9.setText(rs.getString("gs"));
       	
			int result = JOptionPane.showConfirmDialog(null, pana6, "Insert Marks",
		            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
			
		
		if(result==JOptionPane.OK_OPTION) {
			
			 try {
	            
	    			
				 String gp = null,gh = null,gc="",gm,gg,g1 = null,g2="",g3 = null,g4 = null,sm;
	            	String m1;
	    			String m2="";
	    			String m3;
	    			String m4,m5,g5 = null;
	    			double eco=0.0,geo=0.0,hist=0.0,bam=0.0,gs=0.0;
	    			
	    			if(ta7.getText().isEmpty() ||ta7.getText().matches("-")) {
	    				gp="Inc";g1="-";m1="-";
	    			}else {
	    				m1=ta7.getText();
	    				 eco=Double.parseDouble(ta7.getText());
		    			
		    			if(eco>=grd1 && eco<=grd2){
		    		       g1="A";gp="1";
		    		      }else if(eco>=grd3 && eco<grd4){
		    		    	  g1="B";gp="2";
		    		      }
		    		      else if(eco>=grd5 && eco<grd6){
		    		    	  g1="C";gp="3";
		    		      }
		    		      else if(eco>=grd7 && eco<grd8){
		    		    	  g1= "D";gp="4";
		    			      }
		    			  else if(eco>=grd9 && eco<grd10){
		    				  g1="E";gp="5";
		    			      }
		    			  else if(eco>=grd11 && eco<grd12){
		    				  g1= "S";gp="6";
		    			      }
		    			      else  if(eco>=grd13 && eco<grd14) {
		    			    	  g1="F";gp="7";
		    			      }
	    			}
	    			
	    			if(ta6.getText().isEmpty()|| ta6.getText().matches("-")) {
	    				
	    				gc="Inc";m2="-";g2="-";
	    			}
	    				
	    				else {
	    					m2=ta6.getText();
	    					geo=Double.parseDouble(ta6.getText());
		    			     if(geo>=grd1 && geo<=grd2){
		    			       g2= "A";gc="1";
		    			      }else if(geo>=grd3 && geo<grd4){
		    			    	  g2= "B";gc="2";
		    			      }
		    			      else if(geo>=grd5 && geo<grd6){
		    			    	  g2= "C";gc="3";
		    			      }
		    			      else if(geo>=grd7 && geo<grd8){
		    			    	  g2= "D";gc="4";
		    				      }
		    				  else if(geo>=grd9 && geo<grd10){
		    					  g2= "E";gc="5";
		    				      }
		    				  else if(geo>=grd11 && geo<grd12){
		    					  g2= "S";gc="6";
		    				      }
		    				      else if(geo>=grd13 && geo<grd14){
		    				    	  g2= "F";gc="7";
		    				      }	
	    				}
	    				
	    				
	    			
	    			if(ta5.getText().isEmpty()|| ta5.getText().matches("-")) {
	    				gh="Inc";m3="-";g3="-";
	    			}else {
	    		        m3= ta5.getText();
	    		        hist=Double.parseDouble(ta5.getText());
	    		       	if(hist>=grd1 && hist<=grd2){
	    			       g3="A";gh="1";
	    			      }else if(hist>=grd3 && hist<grd4){
	    			    	  g3= "B";gh="2";
	    			      }
	    			      else if(hist>=grd5 && hist<grd6){
	    			    	  g3="C";gh="3";
	    			      }
	    			      else if(hist>=grd7 && hist<grd8){
	    			    	  g3="D";gh="4";
	    				      }
	    				  else if(hist>=grd9 && hist<grd10){
	    					  g3="E";gh="5";
	    				      }
	    				  else if(hist>=grd11 && hist<grd12){
	    					  g3= "S";gh="6";
	    				      }
	    				      else if(hist>=grd13 && hist<grd14) {
	    				    	  g3="F";gh="7";
	    				      }
	    			}
	    			
	    			
	    			if(ta8.getText().isEmpty()|| ta8.getText().matches("-")) {
	    				gm="Inc";m4="-";g4="-";
	    			}else {
	    		        m4= ta8.getText();
	    		        bam=Double.parseDouble(ta8.getText());
	    		       	if(bam>=grd1 && bam<=grd2){
	    			       g4="A";gm="1";
	    			      }else if(bam>=grd3 && bam<grd4){
	    			    	  g4= "B";gm="2";
	    			      }
	    			      else if(bam>=grd5 && bam<grd6){
	    			    	  g4="C";gm="3";
	    			      }
	    			      else if(bam>=grd7 && bam<grd8){
	    			    	  g4="D";gm="4";
	    				      }
	    				  else if(bam>=grd9 && bam<grd10){
	    					  g4="E";gm="5";
	    				      }
	    				  else if(bam>=grd11 && bam<grd12){
	    					  g4= "S";gm="6";
	    				      }
	    				      else if(bam>=grd13 && bam<grd14) {
	    				    	  g4="F";gm="7";
	    				      }
	    			}
	    			
					
	    			if(ta9.getText().isEmpty() ||ta9.getText().matches("-")) {
	    				gg="Inc";m5="-";g5="-";
	    			}else {
	    				m5= ta9.getText();
	    				gs=Double.parseDouble(ta9.getText());
	    			     if(gs>=grd1 && gs<=grd2){
	    			       g5="A";gg="1";
	    			      }else if(gs>=grd3 && gs<grd4){
	    			    	  g5= "B";gg="2";
	    			      }
	    			      else if(gs>=grd5 && gs<grd6){
	    			    	  g5="C";gg="3";
	    			      }
	    			      else if(gs>=grd7 && gs<grd8){
	    			    	  g5="D";gg="4";
	    				      }
	    				  else if(gs>=grd9 && gs<grd10){
	    					  g5= "E";gg="5";
	    				      }
	    				  else if(gs>=grd11 && gs<grd12){
	    					  g5="S";gg="6";
	    				      }
	    				      else if(gs>=grd13 && gs<grd14) {
	    				    	  g5="F";gg="7";
	    				      }
	    			}
	    			
	    			
	    			if(!ta5.getText().isEmpty() && !ta7.getText().matches("-")&&!ta6.getText().isEmpty()&&!ta7.getText().isEmpty()&&!ta6.getText().isEmpty()&& !ta5.getText().matches("-"))
	    			{
	    				int pp=Integer.parseInt(gp);
	    				int pc=Integer.parseInt(gc);
	    				int pm=Integer.parseInt(gh);
	    				
	    				
	    				int sum=pp+pc+pm;
	    				sm=Integer.toString(sum);
	    				
	    				
	    			}
	    			else {
	    				 sm="Inc";
	    			}
	    			

	    			if(((eco>=0 &&eco<=100) ||ta7.getText().isEmpty()) && ((geo>=0 &&geo<=100) ||ta6.getText().isEmpty()) && ((hist>=0 &&hist<=100) ||ta5.getText().isEmpty()) && ((gs>=0 &&gs<=100) ||ta9.getText().isEmpty())&& ((bam>=0 &&bam<=100) ||ta8.getText().isEmpty())  ) {
	    				
	  			      
	    	    	    String sq="update mark set his='"+m3+"',ghis='"+g3+"',geo='"+m2+"',ggeo='"+g2+"',ec='"+m1+"',gec='"+g1+"',bam='"+m4+"',gbam='"+g4+"',gs='"+m5+"',ggs='"+g5+"',point='"+sm+"' where id='"+id+"' ";
	    				ps=con.prepareStatement(sq);
	    				ps.execute();
	    				
	    				JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
	    				ta5.setText("");ta6.setText("");ta7.setText("");ta8.setText("");
	    				area();
	    		
	    			}else {
	    				
	    				 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
	    			}
	    			
	    	
	             }catch(Exception ex) {
	            	 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
	                } finally {
						
						try {
							rs.close();
							ps.close();
							
							
						}catch(Exception e) {
							
						}
						
					}
		           
			
		}}
			
	   else if(co.matches("HKL")) {
			
			String sql1="select * from mark where id='"+id+"' ";
	       	ps=con.prepareStatement(sql1);
	       	rs=ps.executeQuery();
	       	ta15.setText(rs.getString("his"));
	       	ta16.setText(rs.getString("kis"));
	       	ta17.setText(rs.getString("lan"));
	       	ta18.setText(rs.getString("gs"));
	       	
	       	
				int result = JOptionPane.showConfirmDialog(null, pana8, "Insert Marks",
			            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				
			
			if(result==JOptionPane.OK_OPTION) {
				
				 try {
		            
		    			
					 String gp = null,gh = null,gc="",gm,g1 = null,g2="",g3 = null,sm;
		            	String m1;
		    			String m2="";
		    			String m3;
		    			String m5,g5 = null;
		    			double lan=0.0,kisw=0.0,gs=0.0,hist=0.0;
		    			
		    			if(ta17.getText().isEmpty() ||ta17.getText().matches("-")) {
		    				gp="Inc";g1="-";m1="-";
		    			}else {
		    				m1=ta17.getText();
		    				lan=Double.parseDouble(ta17.getText());
			    			
			    			if(lan>=grd1 && lan<=grd2){
			    		       g1="A";gp="1";
			    		      }else if(lan>=grd2 && lan<grd4){
			    		    	  g1="B";gp="2";
			    		      }
			    		      else if(lan>=grd5 && lan<grd6){
			    		    	  g1="C";gp="3";
			    		      }
			    		      else if(lan>=grd7 && lan<grd8){
			    		    	  g1= "D";gp="4";
			    			      }
			    			  else if(lan>=grd9 && lan<grd10){
			    				  g1="E";gp="5";
			    			      }
			    			  else if(lan>=grd11 && lan<grd12){
			    				  g1= "S";gp="6";
			    			      }
			    			      else  if(lan>=grd13 && lan<grd14){
			    			    	  g1="F";gp="7";
			    			      }
		    			}
		    			
		    			if(ta16.getText().isEmpty()|| ta16.getText().matches("-")) {
		    				
		    				gc="Inc";m2="-";g2="-";
		    			}
		    				
		    				else {
		    					m2=ta16.getText();
		    					kisw=Double.parseDouble(ta16.getText());
			    			     if(kisw>=grd1 && kisw<=grd2){
			    			       g2= "A";gc="1";
			    			      }else if(kisw>=grd3 && kisw<grd4){
			    			    	  g2= "B";gc="2";
			    			      }
			    			      else if(kisw>=grd5 && kisw<grd6){
			    			    	  g2= "C";gc="3";
			    			      }
			    			      else if(kisw>=grd7 && kisw<grd8){
			    			    	  g2= "D";gc="4";
			    				      }
			    				  else if(kisw>=grd9 && kisw<grd10){
			    					  g2= "E";gc="5";
			    				      }
			    				  else if(kisw>=grd11 && kisw<grd12){
			    					  g2= "S";gc="6";
			    				      }
			    				      else if(kisw>=grd13 && kisw<grd14) {
			    				    	  g2= "F";gc="7";
			    				      }	
		    				}
		    				
		    				
		    			
		    			if(ta15.getText().isEmpty()|| ta15.getText().matches("-")) {
		    				gh="Inc";m3="-";g3="-";
		    			}else {
		    		        m3= ta15.getText();
		    		         hist=Double.parseDouble(ta15.getText());
		    		       	if(hist>=grd1 && hist<=grd2){
		    			       g3="A";gh="1";
		    			      }else if(hist>=grd3 && hist<grd4){
		    			    	  g3= "B";gh="2";
		    			      }
		    			      else if(hist>=grd5 && hist<grd6){
		    			    	  g3="C";gh="3";
		    			      }
		    			      else if(hist>=grd7 && hist<grd8){
		    			    	  g3="D";gh="4";
		    				      }
		    				  else if(hist>=grd9 && hist<grd10){
		    					  g3="E";gh="5";
		    				      }
		    				  else if(hist>=grd11 && hist<grd12){
		    					  g3= "S";gh="6";
		    				      }
		    				      else  if(hist>=grd13 && hist<grd14){
		    				    	  g3="F";gh="7";
		    				      }
		    			}
		    			
		    			
		    		
						
		    			if(ta18.getText().isEmpty() ||ta18.getText().matches("-")) {
		    				m5="-";g5="-";
		    			}else {
		    				m5= ta18.getText();
		    				gs=Double.parseDouble(ta18.getText());
		    			     if(gs>=grd1 && gs<=grd2){
		    			       g5="A";
		    			      }else if(gs>=grd3 && gs<grd4){
		    			    	  g5= "B";
		    			      }
		    			      else if(gs>=grd5 && gs<grd6){
		    			    	  g5="C";
		    			      }
		    			      else if(gs>=grd7 && gs<grd8){
		    			    	  g5="D";
		    				      }
		    				  else if(gs>=grd9 && gs<grd10){
		    					  g5= "E";
		    				      }
		    				  else if(gs>=grd11 && gs<grd12){
		    					  g5="S";
		    				      }
		    				      else if(gs>=grd13 && gs<grd14) {
		    				    	  g5="F";
		    				      }
		    			}
		    			
		    			
		    			if(!ta15.getText().isEmpty() && !ta17.getText().matches("-")&&!ta16.getText().isEmpty()&&!ta17.getText().isEmpty()&&!ta16.getText().isEmpty()&& !ta15.getText().matches("-"))
		    			{
		    				int pp=Integer.parseInt(gp);
		    				int pc=Integer.parseInt(gc);
		    				int pm=Integer.parseInt(gh);
		    				
		    				
		    				int sum=pp+pc+pm;
		    				sm=Integer.toString(sum);
		    				
		    				
		    			}
		    			else {
		    				 sm="Inc";
		    			}
		    			

		    			if(((lan>=0 &&lan<=100) ||ta17.getText().isEmpty()) && ((kisw>=0 &&kisw<=100) ||ta16.getText().isEmpty()) && ((hist>=0 &&hist<=100) ||ta15.getText().isEmpty()) && ((gs>=0 &&gs<=100) ||ta18.getText().isEmpty()) ) {
		    				
		    				String sq="update mark set his='"+m3+"',ghis='"+g3+"',kis='"+m2+"',gkis='"+g2+"',lan='"+m1+"',glan='"+g1+"',gs='"+m5+"',ggs='"+g5+"',point='"+sm+"' where id='"+id+"' ";
							ps=con.prepareStatement(sq);
							ps.execute();
							
							JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
							ta15.setText("");ta16.setText("");ta17.setText("");ta18.setText("");
							area();
							
		    			}else {
		    				
		    				 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    			}
		    			      
		    	    
			
		             }catch(Exception ex) {
		            	 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		                }  finally {
							
							try {
								rs.close();
								ps.close();
								
								
							}catch(Exception e) {
								
							}
							
						}
			           
			}}
			
	   else if(co.matches("KLA")) {
			
			String sql1="select * from mark where id='"+id+"' ";
	       	ps=con.prepareStatement(sql1);
	       	rs=ps.executeQuery();
	    
	       	ta31.setText(rs.getString("kis"));
	       	ta32.setText(rs.getString("lan"));
	       	ta33.setText(rs.getString("ara"));
	       	ta34.setText(rs.getString("gs"));
	       	
	       	
	       	
				int result = JOptionPane.showConfirmDialog(null, pana12, "Insert Marks",
			            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				
			
			if(result==JOptionPane.OK_OPTION) {
				
				 try {
		            
		    			
					 String gp = null,gh = null,gc="",gm,gg,g1 = null,g2="",g3 = null,g4,sm;
		            	String m1;
		    			String m2="";
		    			String m3;
		    			String m4,m5,g5 = null;
		    			double lan=0.0,kisw=0.0,hist=0.0,gs=0.0;
		    			
		    			if(ta32.getText().isEmpty() ||ta32.getText().matches("-")) {
		    				gp="Inc";g1="-";m1="-";
		    			}else {
		    				m1=ta32.getText();
		    				lan=Double.parseDouble(ta32.getText());
			    			
			    			if(lan>=grd1 && lan<=grd2){
			    		       g1="A";gp="1";
			    		      }else if(lan>=grd3 && lan<grd4){
			    		    	  g1="B";gp="2";
			    		      }
			    		      else if(lan>=grd5 && lan<grd6){
			    		    	  g1="C";gp="3";
			    		      }
			    		      else if(lan>=grd7 && lan<grd8){
			    		    	  g1= "D";gp="4";
			    			      }
			    			  else if(lan>=grd9 && lan<grd10){
			    				  g1="E";gp="5";
			    			      }
			    			  else if(lan>=grd11 && lan<grd12){
			    				  g1= "S";gp="6";
			    			      }
			    			      else if(lan>=grd13 && lan<grd14) {
			    			    	  g1="F";gp="7";
			    			      }
		    			}
		    			
		    			if(ta31.getText().isEmpty()|| ta31.getText().matches("-")) {
		    				
		    				gc="Inc";m2="-";g2="-";
		    			}
		    				
		    				else {
		    					m2=ta31.getText();
		    					 kisw=Double.parseDouble(ta31.getText());
			    			     if(kisw>=grd1 && kisw<=grd2){
			    			       g2= "A";gc="1";
			    			      }else if(kisw>=grd3 && kisw<grd4){
			    			    	  g2= "B";gc="2";
			    			      }
			    			      else if(kisw>=grd5 && kisw<grd6){
			    			    	  g2= "C";gc="3";
			    			      }
			    			      else if(kisw>=grd7 && kisw<grd8){
			    			    	  g2= "D";gc="4";
			    				      }
			    				  else if(kisw>=grd9 && kisw<grd10){
			    					  g2= "E";gc="5";
			    				      }
			    				  else if(kisw>=grd11 && kisw<grd12){
			    					  g2= "S";gc="6";
			    				      }
			    				      else  if(kisw>=grd13 && kisw<grd14){
			    				    	  g2= "F";gc="7";
			    				      }	
		    				}
		    				
		    				
		    			
		    			if(ta33.getText().isEmpty()|| ta33.getText().matches("-")) {
		    				gh="Inc";m3="-";g3="-";
		    			}else {
		    		        m3= ta33.getText();
		    		        hist=Double.parseDouble(ta33.getText());
		    		       	if(hist>=grd1 && hist<=grd2){
		    			       g3="A";gh="1";
		    			      }else if(hist>=grd3 && hist<grd4){
		    			    	  g3= "B";gh="2";
		    			      }
		    			      else if(hist>=grd5 && hist<grd6){
		    			    	  g3="C";gh="3";
		    			      }
		    			      else if(hist>=grd7 && hist<grd8){
		    			    	  g3="D";gh="4";
		    				      }
		    				  else if(hist>=grd9 && hist<grd10){
		    					  g3="E";gh="5";
		    				      }
		    				  else if(hist>=grd11 && hist<grd12){
		    					  g3= "S";gh="6";
		    				      }
		    				      else  if(hist>=grd13 && hist<grd14) {
		    				    	  g3="F";gh="7";
		    				      }
		    			}
		    			
		    			
		    		
						
		    			if(ta34.getText().isEmpty() ||ta34.getText().matches("-")) {
		    				gg="Inc";m5="-";g5="-";
		    			}else {
		    				m5= ta34.getText();
		    				gs=Double.parseDouble(ta34.getText());
		    			     if(gs>=grd1 && gs<=grd2){
		    			       g5="A";gg="1";
		    			      }else if(gs>=grd3 && gs<grd4){
		    			    	  g5= "B";gg="2";
		    			      }
		    			      else if(gs>=grd5 && gs<grd6){
		    			    	  g5="C";gg="3";
		    			      }
		    			      else if(gs>=grd7 && gs<grd8){
		    			    	  g5="D";gg="4";
		    				      }
		    				  else if(gs>=grd9 && gs<grd10){
		    					  g5= "E";gg="5";
		    				      }
		    				  else if(gs>=grd11 && gs<grd12){
		    					  g5="S";gg="6";
		    				      }
		    				      else  if(gs>=grd13 && gs<grd14){
		    				    	  g5="F";gg="7";
		    				      }
		    			}
		    			
		    			
		    			if(!ta33.getText().isEmpty() && !ta32.getText().matches("-")&&!ta31.getText().isEmpty()&&!ta32.getText().isEmpty()&&!ta31.getText().isEmpty()&& !ta33.getText().matches("-"))
		    			{
		    				int pp=Integer.parseInt(gp);
		    				int pc=Integer.parseInt(gc);
		    				int pm=Integer.parseInt(gh);
		    				
		    				
		    				int sum=pp+pc+pm;
		    				sm=Integer.toString(sum);
		    				
		    				
		    			}
		    			else {
		    				 sm="Inc";
		    			}
		    			

		    			if(((lan>=0 &&lan<=100) ||ta32.getText().isEmpty()) && ((kisw>=0 &&kisw<=100) ||ta31.getText().isEmpty()) && ((hist>=0 &&hist<=100) ||ta33.getText().isEmpty()) && ((gs>=0 &&gs<=100) ||ta34.getText().isEmpty()) ) {
		    				
		    			      
				    	    String sq="update mark set ara='"+m3+"',gara='"+g3+"',kis='"+m2+"',gkis='"+g2+"',lan='"+m1+"',glan='"+g1+"',gs='"+m5+"',ggs='"+g5+"',point='"+sm+"' where id='"+id+"' ";
							ps=con.prepareStatement(sq);
							ps.execute();
							
							JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
							ta31.setText("");ta32.setText("");ta33.setText("");ta34.setText("");
							area();
					
		    			}else {
		    				
		    				 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    			}
		    		
		             }catch(Exception ex) {
		            	 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		                }  finally {
							
							try {
								rs.close();
								ps.close();
								
								
							}catch(Exception e) {
								
							}
							
						}
			           
					
			}}
	   else if(co.matches("IKA")) {
			
			String sql1="select * from mark where id='"+id+"' ";
	       	ps=con.prepareStatement(sql1);
	       	rs=ps.executeQuery();
	    
	    	ta35.setText(rs.getString("dini"));
	       	ta36.setText(rs.getString("kis"));
	       	ta37.setText(rs.getString("ara"));
	       	ta38.setText(rs.getString("gs"));
	       	
	       	
	       	
				int result = JOptionPane.showConfirmDialog(null, pana13, "Insert Marks",
			            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				
			
			if(result==JOptionPane.OK_OPTION) {
				
				 try {
		            
		    			
					 String gp = null,gh = null,gc="",gm,gg,g1 = null,g2="",g3 = null,g4,sm;
		            	String m1;
		    			String m2="";
		    			String m3;
		    			String m4,m5,g5 = null;
		    			double lan=0.0,kisw=0.0,hist=0.0,gs=0.0;
		    			
		    			if(ta35.getText().isEmpty() ||ta35.getText().matches("-")) {
		    				gp="Inc";g1="-";m1="-";
		    			}else {
		    				m1=ta35.getText();
		    				lan=Double.parseDouble(ta35.getText());
			    			
			    			if(lan>=grd1 && lan<=grd2){
			    		       g1="A";gp="1";
			    		      }else if(lan>=grd3 && lan<grd4){
			    		    	  g1="B";gp="2";
			    		      }
			    		      else if(lan>=grd5 && lan<grd6){
			    		    	  g1="C";gp="3";
			    		      }
			    		      else if(lan>=grd7 && lan<grd8){
			    		    	  g1= "D";gp="4";
			    			      }
			    			  else if(lan>=grd9 && lan<grd10){
			    				  g1="E";gp="5";
			    			      }
			    			  else if(lan>=grd11 && lan<grd12){
			    				  g1= "S";gp="6";
			    			      }
			    			      else if(lan>=grd13 && lan<grd14) {
			    			    	  g1="F";gp="7";
			    			      }
		    			}
		    			
		    			if(ta36.getText().isEmpty()|| ta36.getText().matches("-")) {
		    				
		    				gc="Inc";m2="-";g2="-";
		    			}
		    				
		    				else {
		    					m2=ta36.getText();
		    				  kisw=Double.parseDouble(ta36.getText());
			    			     if(kisw>=grd1 && kisw<=grd2){
			    			       g2= "A";gc="1";
			    			      }else if(kisw>=grd3 && kisw<grd4){
			    			    	  g2= "B";gc="2";
			    			      }
			    			      else if(kisw>=grd5 && kisw<grd6){
			    			    	  g2= "C";gc="3";
			    			      }
			    			      else if(kisw>=grd7 && kisw<grd8){
			    			    	  g2= "D";gc="4";
			    				      }
			    				  else if(kisw>=grd9 && kisw<grd10){
			    					  g2= "E";gc="5";
			    				      }
			    				  else if(kisw>=grd11 && kisw<grd12){
			    					  g2= "S";gc="6";
			    				      }
			    				      else  if(kisw>=grd13 && kisw<grd14) {
			    				    	  g2= "F";gc="7";
			    				      }	
		    				}
		    				
		    				
		    			
		    			if(ta37.getText().isEmpty()|| ta37.getText().matches("-")) {
		    				gh="Inc";m3="-";g3="-";
		    			}else {
		    		        m3= ta37.getText();
		    		         hist=Double.parseDouble(ta37.getText());
		    		       	if(hist>=grd1 && hist<=grd2){
		    			       g3="A";gh="1";
		    			      }else if(hist>=grd3 && hist<grd4){
		    			    	  g3= "B";gh="2";
		    			      }
		    			      else if(hist>=grd5 && hist<grd6){
		    			    	  g3="C";gh="3";
		    			      }
		    			      else if(hist>=grd7 && hist<grd8){
		    			    	  g3="D";gh="4";
		    				      }
		    				  else if(hist>=grd9 && hist<grd10){
		    					  g3="E";gh="5";
		    				      }
		    				  else if(hist>=grd11 && hist<grd12){
		    					  g3= "S";gh="6";
		    				      }
		    				      else if(hist>=grd13 && hist<grd14) {
		    				    	  g3="F";gh="7";
		    				      }
		    			}
		    			
		    			
		    		
						
		    			if(ta38.getText().isEmpty() ||ta38.getText().matches("-")) {
		    				gg="Inc";m5="-";g5="-";
		    			}else {
		    				m5= ta38.getText();
		    				 gs=Double.parseDouble(ta38.getText());
		    			     if(gs>=grd1 && gs<=grd2){
		    			       g5="A";gg="1";
		    			      }else if(gs>=grd3 && gs<grd4){
		    			    	  g5= "B";gg="2";
		    			      }
		    			      else if(gs>=grd5 && gs<grd6){
		    			    	  g5="C";gg="3";
		    			      }
		    			      else if(gs>=grd7 && gs<grd8){
		    			    	  g5="D";gg="4";
		    				      }
		    				  else if(gs>=grd9 && gs<grd10){
		    					  g5= "E";gg="5";
		    				      }
		    				  else if(gs>=grd11 && gs<grd12){
		    					  g5="S";gg="6";
		    				      }
		    				      else if(gs>=grd13 && gs<grd14) {
		    				    	  g5="F";gg="7";
		    				      }
		    			}
		    			
		    			
		    			if(!ta37.getText().isEmpty() && !ta35.getText().matches("-")&&!ta36.getText().isEmpty()&&!ta35.getText().isEmpty()&&!ta36.getText().isEmpty()&& !ta37.getText().matches("-"))
		    			{
		    				int pp=Integer.parseInt(gp);
		    				int pc=Integer.parseInt(gc);
		    				int pm=Integer.parseInt(gh);
		    				
		    				
		    				int sum=pp+pc+pm;
		    				sm=Integer.toString(sum);
		    				
		    				
		    			}
		    			else {
		    				 sm="Inc";
		    			}
		    			

		    			if(((lan>=0 &&lan<=100) ||ta35.getText().isEmpty()) && ((kisw>=0 &&kisw<=100) ||ta36.getText().isEmpty()) && ((hist>=0 &&hist<=100) ||ta37.getText().isEmpty()) && ((gs>=0 &&gs<=100) ||ta38.getText().isEmpty()) ) {
		    				
		    			   String sq="update mark set ara='"+m3+"',gara='"+g3+"',kis='"+m2+"',gkis='"+g2+"',dini='"+m1+"',gdini='"+g1+"',gs='"+m5+"',ggs='"+g5+"',point='"+sm+"' where id='"+id+"' ";
		 					ps=con.prepareStatement(sq);
		 					ps.execute();
		 					
		 					JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
		 					ta35.setText("");ta36.setText("");ta37.setText("");ta38.setText("");
		 					area();

		    			}else {
		    				
		    				 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    			}
		    				      
		    	   
			
		             }catch(Exception ex) {
		            	 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		                }  finally {
							
							try {
								rs.close();
								ps.close();
								
								
							}catch(Exception e) {
								
							}
							
						}
			           
			}}
		
	   else if(co.matches("GKL")) {
			
			String sql1="select * from mark where id='"+id+"' ";
	       	ps=con.prepareStatement(sql1);
	       	rs=ps.executeQuery();
	       	ta27.setText(rs.getString("geo"));
	       	ta28.setText(rs.getString("kis"));
	       	ta29.setText(rs.getString("lan"));
	       	ta30.setText(rs.getString("gs"));
	       	
	       	
				int result = JOptionPane.showConfirmDialog(null, pana11, "Insert Marks",
			            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				
			
			if(result==JOptionPane.OK_OPTION) {
				
				 try {
		            
		    			
					 String gp = null,gh = null,gc="",gm,gg,g1 = null,g2="",g3 = null,g4,sm;
		            	String m1;
		    			String m2="";
		    			String m3;
		    			String m4,m5,g5 = null;
		    			double lan=0.0,kisw=0.0,hist=0.0,gs=0.0;
		    			
		    			if(ta29.getText().isEmpty() ||ta29.getText().matches("-")) {
		    				gp="Inc";g1="-";m1="-";
		    			}else {
		    				m1=ta29.getText();
		    				lan=Double.parseDouble(ta29.getText());
			    			
			    			if(lan>=grd1 && lan<=grd2){
			    		       g1="A";gp="1";
			    		      }else if(lan>=grd3 && lan<grd4){
			    		    	  g1="B";gp="2";
			    		      }
			    		      else if(lan>=grd5 && lan<grd6){
			    		    	  g1="C";gp="3";
			    		      }
			    		      else if(lan>=grd7 && lan<grd8){
			    		    	  g1= "D";gp="4";
			    			      }
			    			  else if(lan>=grd9 && lan<grd10){
			    				  g1="E";gp="5";
			    			      }
			    			  else if(lan>=grd11 && lan<grd12){
			    				  g1= "S";gp="6";
			    			      }
			    			      else if(lan>=grd13 && lan<grd14) {
			    			    	  g1="F";gp="7";
			    			      }
		    			}
		    			
		    			if(ta28.getText().isEmpty()|| ta28.getText().matches("-")) {
		    				
		    				gc="Inc";m2="-";g2="-";
		    			}
		    				
		    				else {
		    					m2=ta28.getText();
		    					 kisw=Double.parseDouble(ta28.getText());
			    			     if(kisw>=grd1 && kisw<=grd2){
			    			       g2= "A";gc="1";
			    			      }else if(kisw>=grd3 && kisw<grd4){
			    			    	  g2= "B";gc="2";
			    			      }
			    			      else if(kisw>=grd5 && kisw<grd6){
			    			    	  g2= "C";gc="3";
			    			      }
			    			      else if(kisw>=grd7 && kisw<grd8){
			    			    	  g2= "D";gc="4";
			    				      }
			    				  else if(kisw>=grd9 && kisw<grd10){
			    					  g2= "E";gc="5";
			    				      }
			    				  else if(kisw>=grd11 && kisw<grd12){
			    					  g2= "S";gc="6";
			    				      }
			    				      else if(kisw>=grd13 && kisw<grd14){
			    				    	  g2= "F";gc="7";
			    				      }	
		    				}
		    				
		    				
		    			
		    			if(ta27.getText().isEmpty()|| ta27.getText().matches("-")) {
		    				gh="Inc";m3="-";g3="-";
		    			}else {
		    		        m3= ta27.getText();
		    		        hist=Double.parseDouble(ta27.getText());
		    		       	if(hist>=grd1 && hist<=grd2){
		    			       g3="A";gh="1";
		    			      }else if(hist>=grd3 && hist<grd4){
		    			    	  g3= "B";gh="2";
		    			      }
		    			      else if(hist>=grd5 && hist<grd6){
		    			    	  g3="C";gh="3";
		    			      }
		    			      else if(hist>=grd7 && hist<grd8){
		    			    	  g3="D";gh="4";
		    				      }
		    				  else if(hist>=grd9 && hist<grd10){
		    					  g3="E";gh="5";
		    				      }
		    				  else if(hist>=grd11 && hist<grd12){
		    					  g3= "S";gh="6";
		    				      }
		    				      else  if(hist>=grd13 && hist<grd14){
		    				    	  g3="F";gh="7";
		    				      }
		    			}
		    			
		    			
		    		
						
		    			if(ta30.getText().isEmpty() ||ta30.getText().matches("-")) {
		    				gg="Inc";m5="-";g5="-";
		    			}else {
		    				m5= ta30.getText();
		    				gs=Double.parseDouble(ta30.getText());
		    			     if(gs>=grd1 && gs<=grd2){
		    			       g5="A";gg="1";
		    			      }else if(gs>=grd3 && gs<grd4){
		    			    	  g5= "B";gg="2";
		    			      }
		    			      else if(gs>=grd5 && gs<grd6){
		    			    	  g5="C";gg="3";
		    			      }
		    			      else if(gs>=grd7 && gs<grd8){
		    			    	  g5="D";gg="4";
		    				      }
		    				  else if(gs>=grd9 && gs<grd10){
		    					  g5= "E";gg="5";
		    				      }
		    				  else if(gs>=grd11 && gs<grd12){
		    					  g5="S";gg="6";
		    				      }
		    				      else if(gs>=grd13 && gs<grd14) {
		    				    	  g5="F";gg="7";
		    				      }
		    			}
		    			
		    			
		    			if(!ta27.getText().isEmpty() && !ta29.getText().matches("-")&&!ta28.getText().isEmpty()&&!ta29.getText().isEmpty()&&!ta28.getText().isEmpty()&& !ta27.getText().matches("-"))
		    			{
		    				int pp=Integer.parseInt(gp);
		    				int pc=Integer.parseInt(gc);
		    				int pm=Integer.parseInt(gh);
		    				
		    				
		    				int sum=pp+pc+pm;
		    				sm=Integer.toString(sum);
		    				
		    				
		    			}
		    			else {
		    				 sm="Inc";
		    			}
		    			

		    			if(((lan>=0 &&lan<=100) ||ta29.getText().isEmpty()) && ((kisw>=0 &&kisw<=100) ||ta28.getText().isEmpty()) && ((hist>=0 &&hist<=100) ||ta27.getText().isEmpty()) && ((gs>=0 &&gs<=100) ||ta30.getText().isEmpty()) ) {
		    				
		    			    String sq="update mark set geo='"+m3+"',ggeo='"+g3+"',kis='"+m2+"',gkis='"+g2+"',lan='"+m1+"',glan='"+g1+"',gs='"+m5+"',ggs='"+g5+"',point='"+sm+"' where id='"+id+"' ";
		 					ps=con.prepareStatement(sq);
		 					ps.execute();
		 					
		 					JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
		 					ta27.setText("");ta28.setText("");ta29.setText("");ta30.setText("");
		 					area();

		    			}else {
		    				
		    				 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    			}
		    				      
		    	   
			
		             }catch(Exception ex) {
		            	 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		                }  finally {
							
							try {
								rs.close();
								ps.close();
								
								
							}catch(Exception e) {
								
							}
							
						}
			           
			}}
		
			
	   else if(co.matches("HGL")) {
			
			String sql1="select * from mark where id='"+id+"' ";
	       	ps=con.prepareStatement(sql1);
	       	rs=ps.executeQuery();
	       	ta19.setText(rs.getString("his"));
	       	ta20.setText(rs.getString("geo"));
	       	ta21.setText(rs.getString("lan"));
	       	ta22.setText(rs.getString("gs"));
	       	
	       	
				int result = JOptionPane.showConfirmDialog(null, pana9, "Insert Marks",
			            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				
			
			if(result==JOptionPane.OK_OPTION) {
				
				 try {
		            
		    			
					 String gp = null,gh = null,gc="",gm,gg,g1 = null,g2="",g3 = null,g4,sm;
		            	String m1;
		    			String m2="";
		    			String m3;
		    			String m4,m5,g5 = null;
		    			double lan=0.0,kisw=0.0,hist=0.0,gs=0.0;
		    			
		    			if(ta21.getText().isEmpty() ||ta21.getText().matches("-")) {
		    				gp="Inc";g1="-";m1="-";
		    			}else {
		    				m1=ta21.getText();
		    			 lan=Double.parseDouble(ta21.getText());
			    			
			    			if(lan>=grd1 && lan<=grd2){
			    		       g1="A";gp="1";
			    		      }else if(lan>=grd3 && lan<grd4){
			    		    	  g1="B";gp="2";
			    		      }
			    		      else if(lan>=grd5 && lan<grd6){
			    		    	  g1="C";gp="3";
			    		      }
			    		      else if(lan>=grd7 && lan<grd8){
			    		    	  g1= "D";gp="4";
			    			      }
			    			  else if(lan>=grd9 && lan<grd10){
			    				  g1="E";gp="5";
			    			      }
			    			  else if(lan>=grd11 && lan<grd12){
			    				  g1= "S";gp="6";
			    			      }
			    			      else if(lan>=grd13 && lan<grd14) {
			    			    	  g1="F";gp="7";
			    			      }
		    			}
		    			
		    			if(ta20.getText().isEmpty()|| ta20.getText().matches("-")) {
		    				
		    				gc="Inc";m2="-";g2="-";
		    			}
		    				
		    				else {
		    					m2=ta20.getText();
		    					kisw=Double.parseDouble(ta20.getText());
			    			     if(kisw>=grd1 && kisw<=grd2){
			    			       g2= "A";gc="1";
			    			      }else if(kisw>=grd3 && kisw<grd4){
			    			    	  g2= "B";gc="2";
			    			      }
			    			      else if(kisw>=grd5 && kisw<grd6){
			    			    	  g2= "C";gc="3";
			    			      }
			    			      else if(kisw>=grd7 && kisw<grd8){
			    			    	  g2= "D";gc="4";
			    				      }
			    				  else if(kisw>=grd9 && kisw<grd10){
			    					  g2= "E";gc="5";
			    				      }
			    				  else if(kisw>=grd11 && kisw<grd12){
			    					  g2= "S";gc="6";
			    				      }
			    				      else  if(kisw>=grd13 && kisw<grd14){
			    				    	  g2= "F";gc="7";
			    				      }	
		    				}
		    				
		    				
		    			
		    			if(ta19.getText().isEmpty()|| ta19.getText().matches("-")) {
		    				gh="Inc";m3="-";g3="-";
		    			}else {
		    		        m3= ta19.getText();
		    		        hist=Double.parseDouble(ta19.getText());
		    		       	if(hist>=grd1 && hist<=grd2){
		    			       g3="A";gh="1";
		    			      }else if(hist>=grd3 && hist<grd4){
		    			    	  g3= "B";gh="2";
		    			      }
		    			      else if(hist>=grd5 && hist<grd6){
		    			    	  g3="C";gh="3";
		    			      }
		    			      else if(hist>=grd7 && hist<grd8){
		    			    	  g3="D";gh="4";
		    				      }
		    				  else if(hist>=grd9 && hist<grd10){
		    					  g3="E";gh="5";
		    				      }
		    				  else if(hist>=grd11 && hist<grd12){
		    					  g3= "S";gh="6";
		    				      }
		    				      else  if(hist>=grd13 && hist<grd14) {
		    				    	  g3="F";gh="7";
		    				      }
		    			}
		    			
		    			
		    		
						
		    			if(ta22.getText().isEmpty() ||ta22.getText().matches("-")) {
		    				gg="Inc";m5="-";g5="-";
		    			}else {
		    				m5= ta22.getText();
		    			 gs=Double.parseDouble(ta22.getText());
		    			     if(gs>=grd1 && gs<=grd2){
		    			       g5="A";gg="1";
		    			      }else if(gs>=grd3 && gs<grd4){
		    			    	  g5= "B";gg="2";
		    			      }
		    			      else if(gs>=grd5 && gs<grd6){
		    			    	  g5="C";gg="3";
		    			      }
		    			      else if(gs>=grd7 && gs<grd8){
		    			    	  g5="D";gg="4";
		    				      }
		    				  else if(gs>=grd9 && gs<grd10){
		    					  g5= "E";gg="5";
		    				      }
		    				  else if(gs>=grd11 && gs<grd12){
		    					  g5="S";gg="6";
		    				      }
		    				      else  if(gs>=grd13 && gs<grd14) {
		    				    	  g5="F";gg="7";
		    				      }
		    			}
		    			
		    			
		    			if(!ta19.getText().isEmpty() && !ta21.getText().matches("-")&&!ta20.getText().isEmpty()&&!ta21.getText().isEmpty()&&!ta20.getText().isEmpty()&& !ta19.getText().matches("-"))
		    			{
		    				int pp=Integer.parseInt(gp);
		    				int pc=Integer.parseInt(gc);
		    				int pm=Integer.parseInt(gh);
		    				
		    				
		    				int sum=pp+pc+pm;
		    				sm=Integer.toString(sum);
		    				
		    				
		    			}
		    			else {
		    				 sm="Inc";
		    			}
		    			

		    			if(((lan>=0 &&lan<=100) ||ta21.getText().isEmpty()) && ((kisw>=0 &&kisw<=100) ||ta20.getText().isEmpty()) && ((hist>=0 &&hist<=100) ||ta19.getText().isEmpty()) && ((gs>=0 &&gs<=100) ||ta22.getText().isEmpty()) ) {
		    				
		    			    String sq="update mark set his='"+m3+"',ghis='"+g3+"',geo='"+m2+"',ggeo='"+g2+"',lan='"+m1+"',glan='"+g1+"',gs='"+m5+"',ggs='"+g5+"',point='"+sm+"' where id='"+id+"' ";
		  					ps=con.prepareStatement(sq);
		  					ps.execute();
		  					
		  					JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
		  					ta19.setText("");ta20.setText("");ta21.setText("");ta22.setText("");
		  					area();

		    			}else {
		    				
		    				 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    			}
		    				      
		    	  
			
		             }catch(Exception ex) {
		            	 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		                } finally {
							
							try {
								rs.close();
								ps.close();
								
								
							}catch(Exception e) {
								
							}
							
						}
			           
					
			}}
		
			
			
	   else if(co.matches("HGK")) {
			
			String sql1="select * from mark where id='"+id+"' ";
	       	ps=con.prepareStatement(sql1);
	       	rs=ps.executeQuery();
	       	ta23.setText(rs.getString("his"));
	       	ta24.setText(rs.getString("geo"));
	       	ta25.setText(rs.getString("kis"));
	       	ta26.setText(rs.getString("gs"));
	       	
	       	
				int result = JOptionPane.showConfirmDialog(null, pana10, "Insert Marks",
			            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				
			
			if(result==JOptionPane.OK_OPTION) {
				
				 try {
		            
		    			
					 String gp = null,gh = null,gc="",gm,gg,g1 = null,g2="",g3 = null,g4,sm;
		            	String m1;
		    			String m2="";
		    			String m3;
		    			String m4,m5,g5 = null;
		    			double lan=0.0,kisw=0.0,hist=0.0,gs=0.0;
		    			
		    			if(ta25.getText().isEmpty() ||ta25.getText().matches("-")) {
		    				gp="Inc";g1="-";m1="-";
		    			}else {
		    				m1=ta25.getText();
		    				 lan=Double.parseDouble(ta25.getText());
			    			
			    			if(lan>=grd1 && lan<=grd2){
			    		       g1="A";gp="1";
			    		      }else if(lan>=grd3 && lan<grd4){
			    		    	  g1="B";gp="2";
			    		      }
			    		      else if(lan>=grd5 && lan<grd6){
			    		    	  g1="C";gp="3";
			    		      }
			    		      else if(lan>=grd7 && lan<grd8){
			    		    	  g1= "D";gp="4";
			    			      }
			    			  else if(lan>=grd9 && lan<grd10){
			    				  g1="E";gp="5";
			    			      }
			    			  else if(lan>=grd11 && lan<grd12){
			    				  g1= "S";gp="6";
			    			      }
			    			      else if(lan>=grd13 && lan<grd14) {
			    			    	  g1="F";gp="7";
			    			      }
		    			}
		    			
		    			if(ta24.getText().isEmpty()|| ta24.getText().matches("-")) {
		    				
		    				gc="Inc";m2="-";g2="-";
		    			}
		    				
		    				else {
		    					m2=ta24.getText();
		    					kisw=Double.parseDouble(ta24.getText());
			    			     if(kisw>=grd1 && kisw<=grd2){
			    			       g2= "A";gc="1";
			    			      }else if(kisw>=grd3 && kisw<grd4){
			    			    	  g2= "B";gc="2";
			    			      }
			    			      else if(kisw>=grd5 && kisw<grd6){
			    			    	  g2= "C";gc="3";
			    			      }
			    			      else if(kisw>=grd7 && kisw<grd8){
			    			    	  g2= "D";gc="4";
			    				      }
			    				  else if(kisw>=grd9 && kisw<grd10){
			    					  g2= "E";gc="5";
			    				      }
			    				  else if(kisw>=grd11 && kisw<grd12){
			    					  g2= "S";gc="6";
			    				      }
			    				      else if(kisw>=grd13 && kisw<grd14){
			    				    	  g2= "F";gc="7";
			    				      }	
		    				}
		    				
		    				
		    			
		    			if(ta23.getText().isEmpty()|| ta23.getText().matches("-")) {
		    				gh="Inc";m3="-";g3="-";
		    			}else {
		    		        m3= ta23.getText();
		    		        hist=Double.parseDouble(ta23.getText());
		    		       	if(hist>=grd1 && hist<=grd2){
		    			       g3="A";gh="1";
		    			      }else if(hist>=grd3 && hist<grd4){
		    			    	  g3= "B";gh="2";
		    			      }
		    			      else if(hist>=grd5 && hist<grd6){
		    			    	  g3="C";gh="3";
		    			      }
		    			      else if(hist>=grd7 && hist<grd8){
		    			    	  g3="D";gh="4";
		    				      }
		    				  else if(hist>=grd9 && hist<grd10){
		    					  g3="E";gh="5";
		    				      }
		    				  else if(hist>=grd11 && hist<grd12){
		    					  g3= "S";gh="6";
		    				      }
		    				      else if(hist>=grd13 && hist<grd14) {
		    				    	  g3="F";gh="7";
		    				      }
		    			}
		    			
		    			
		    		
						
		    			if(ta26.getText().isEmpty() ||ta26.getText().matches("-")) {
		    				gg="Inc";m5="-";g5="-";
		    			}else {
		    				m5= ta26.getText();
		    				 gs=Double.parseDouble(ta26.getText());
		    			     if(gs>=grd1 && gs<=grd2){
		    			       g5="A";gg="1";
		    			      }else if(gs>=grd3 && gs<grd4){
		    			    	  g5= "B";gg="2";
		    			      }
		    			      else if(gs>=grd5 && gs<grd6){
		    			    	  g5="C";gg="3";
		    			      }
		    			      else if(gs>=grd7 && gs<grd8){
		    			    	  g5="D";gg="4";
		    				      }
		    				  else if(gs>=grd9 && gs<grd10){
		    					  g5= "E";gg="5";
		    				      }
		    				  else if(gs>=grd11 && gs<grd12){
		    					  g5="S";gg="6";
		    				      }
		    				      else if(gs>=grd13 && gs<grd14)  {
		    				    	  g5="F";gg="7";
		    				      }
		    			}
		    			
		    			
		    			if(!ta23.getText().isEmpty() && !ta25.getText().matches("-")&&!ta24.getText().isEmpty()&&!ta25.getText().isEmpty()&&!ta24.getText().isEmpty()&& !ta23.getText().matches("-"))
		    			{
		    				int pp=Integer.parseInt(gp);
		    				int pc=Integer.parseInt(gc);
		    				int pm=Integer.parseInt(gh);
		    				
		    				
		    				int sum=pp+pc+pm;
		    				sm=Integer.toString(sum);
		    				
		    				
		    			}
		    			else {
		    				 sm="Inc";
		    			}

		    			if(((lan>=0 &&lan<=100) ||ta25.getText().isEmpty()) && ((kisw>=0 &&kisw<=100) ||ta24.getText().isEmpty()) && ((hist>=0 &&hist<=100) ||ta23.getText().isEmpty()) && ((gs>=0 &&gs<=100) ||ta26.getText().isEmpty()) ) {
		    				
		    				 String sq="update mark set his='"+m3+"',ghis='"+g3+"',geo='"+m2+"',ggeo='"+g2+"',kis='"+m1+"',gkis='"+g1+"',gs='"+m5+"',ggs='"+g5+"',point='"+sm+"' where id='"+id+"' ";
		 					ps=con.prepareStatement(sq);
		 					ps.execute();
		 					
		 					JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
		 					ta23.setText("");ta24.setText("");ta25.setText("");ta26.setText("");
		 					area();

		    			}else {
		    				
		    				 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    			}
		    				      
		    	   
			
		             }catch(Exception ex) {
		            	 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		                }  finally {
							
							try {
								rs.close();
								ps.close();
								
								
							}catch(Exception e) {
								
							}
							
						}
			           
					
			}}
		
			
			
			else	if(co.matches("CBG")) {
				String sql11="select * from mark where id='"+id+"' ";
            	ps=con.prepareStatement(sql11);
            	rs=ps.executeQuery();
            	
            	t38.setText(rs.getString("che"));
            	t39.setText(rs.getString("bio"));
            	t41.setText(rs.getString("geo"));
            	t42.setText(rs.getString("bam"));
            	t43.setText(rs.getString("gs"));
            	
				int result = JOptionPane.showConfirmDialog(null, pana3, "Insert Marks",
			            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				
			
			if(result==JOptionPane.OK_OPTION) {
				
				 try {
		           
		    		
					 String gp,gc = null,gm = null,gg,g1 = null,g2="",g3 = null,g4 = null,g5 = null,gb="",sm;
		            	String m1;
		    			String m2="";
		    			String m3="";
		    			String m4;
		    			String m5;
		    			double che=0.0,bio=0.0,geo=0.0,bam=0.0,gs=0.0;
		    			
		    			if(t38.getText().isEmpty()|| t38.getText().matches("-")) {
		    				m1="";g1="";gc="Inc";
		    			}else {
		    				m1= t38.getText();
		    				che=Double.parseDouble(t38.getText());
		    			     if(che>=grd1 && che<=grd2){
		    			       g1= "A";gc="1";
		    			      }else if(che>=grd3 && che<grd4){
		    			    	  g1= "B";gc="2";
		    			      }
		    			      else if(che>=grd5 && che<grd6){
		    			    	  g1= "C";gc="3";
		    			      }
		    			      else if(che>=grd7 && che<grd8){
		    			    	  g1= "D";gc="4";
		    				      }
		    				  else if(che>=grd9 && che<grd10){
		    					  g1= "E";gc="5";
		    				      }
		    				  else if(che>=grd11 && che<grd12){
		    					  g1= "S";gc="6";
		    				      }
		    				      else if(che>=grd13 && che<grd14){
		    				    	  g1= "F";gc="7";
		    				      }
		    			}
		    			
		    			
		    			if(t39.getText().isEmpty() ||t39.getText().matches("-")) {
		    				gb="Inc";m2="";g2="";
		    			}
		    				else {
		    					m2=t39.getText();
		    				 bio=Double.parseDouble(t39.getText());
		    		       	if(bio>=grd1 && bio<=grd2){
		    			       g2="A";gb="1";
		    			      }else if(bio>=grd3 && bio<grd4){
		    			    	  g2= "B";gb="2";
		    			      }
		    			      else if(bio>=grd5 && bio<grd6){
		    			    	  g2="C";gb="3";
		    			      }
		    			      else if(bio>=grd7 && bio<grd8){
		    			    	  g2="D";gb="4";
		    				      }
		    				  else if(bio>=grd9 && bio<grd10){
		    					  g2="E";gb="5";
		    				      }
		    				  else if(bio>=grd11 && bio<grd12){
		    					  g2= "S";gb="6";
		    				      }
		    				      else if(bio>=grd13 && bio<grd14) {
		    				    	  g2="F";gb="7";
		    				      }
		    				}
		    			
		    			
		    			if(t41.getText().isEmpty()||t41.getText().matches("-")) {
		    				gm="Inc";m3="";g3="";
		    			}else {
		    				
                              m3=t41.getText();
		    				 geo=Double.parseDouble(t41.getText());
		    			     if(geo>=grd1 && geo<=grd2){
		    			       g3= "A";gm="1";
		    			      }else if(geo>=grd3 && geo<grd4){
		    			    	  g3= "B";gm="2";
		    			      }
		    			      else if(geo>=grd5 && geo<grd6){
		    			    	  g3= "C";gm="3";
		    			      }
		    			      else if(geo>=grd7 && geo<grd8){
		    			    	  g3= "D";gm="4";
		    				      }
		    				  else if(geo>=grd9 && geo<grd10){
		    					  g3= "E";gm="5";
		    				      }
		    				  else if(geo>=grd11 && geo<grd12){
		    					  g3= "S";gm="6";
		    				      }
		    				      else if(geo>=grd13 && geo<grd14){
		    				    	  g3= "F";gm="7";
		    				      }
		    			
		    			}
		    				
		    			
		    			
		    			if(t42.getText().isEmpty()||t42.getText().matches("-")) {
		    				gp="Inc";m4="";g4="";
		    			}else {
		    				m4= t42.getText();
		    				 bam=Double.parseDouble(t42.getText());
		    			     if(bam>=grd1 && bam<=grd2){
		    			       g4="A";gp="1";
		    			      }else if(bam>=grd3 && bam<grd4){
		    			    	  g4= "B";gp="2";
		    			      }
		    			      else if(bam>=grd5 && bam<grd6){
		    			    	  g4="C";gp="3";
		    			      }
		    			      else if(bam>=grd7 && bam<grd8){
		    			    	  g4="D";gp="4";
		    				      }
		    				  else if(bam>=grd9 && bam<grd10){
		    					  g4= "E";gp="5";
		    				      }
		    				  else if(bam>=grd11 && bam<grd12){
		    					  g4="S";gp="6";
		    				      }
		    				      else  if(bam>=grd13 && bam<grd14){
		    				    	  g4="F";gp="7";
		    				      }
		    			}
		    			
		    			
		    			if(t43.getText().isEmpty()||t43.getText().matches("-")) {
		    				gg="Inc";m5="";g5="";
		    			}else {
		    				m5= t43.getText();
		    			   gs=Double.parseDouble(t43.getText());
		    			     if(gs>=grd1 && gs<=grd2){
		    			       g5="A";gg="1";
		    			      }else if(gs>=grd3 && gs<grd4){
		    			    	  g5= "B";gg="2";
		    			      }
		    			      else if(gs>=grd5 && gs<grd6){
		    			    	  g5="C";gg="3";
		    			      }
		    			      else if(gs>=grd7 && gs<grd8){
		    			    	  g5="D";gg="4";
		    				      }
		    				  else if(gs>=grd9 && gs<grd10){
		    					  g5= "E";gg="5";
		    				      }
		    				  else if(gs>=grd11 && gs<grd12){
		    					  g5="S";gg="6";
		    				      }
		    				      else  if(gs>=grd13 && gs<grd14){
		    				    	  g5="F";gg="7";
		    				      }
		    			}
		    			
		    			
		    			
		    			if(!t41.getText().matches("-")&&!t38.getText().isEmpty()&&!t38.getText().matches("-")&&!t39.getText().matches("-") &&!t39.getText().isEmpty() &&!t41.getText().isEmpty() )
		    			{
		    				int pp=Integer.parseInt(gc);
		    				int pc=Integer.parseInt(gb);
		    				int pb=Integer.parseInt(gm);
		    				
		    				
		    				int sum=pp+pc+pb;
		    				sm=Integer.toString(sum);
		    				
		    				
		    			}
		    			else {
		    				 sm="Inc";
		    			}
		    			
		    			if(((geo>=0 &&geo<=100) ||t41.getText().isEmpty()) && ((che>=0 &&che<=100) ||t38.getText().isEmpty()) && ((bio>=0 &&bio<=100) ||t39.getText().isEmpty()) && ((gs>=0 &&gs<=100) ||t43.getText().isEmpty()) && ((bam>=0 &&bam<=100) ||t42.getText().isEmpty()) ) {
		    			      
		    				 String sq="update mark set che='"+m1+"',gche='"+g1+"',bio='"+m2+"',gbio='"+g2+"',geo='"+m3+"',ggeo='"+g3+"',bam='"+m4+"',gbam='"+g4+"',gs='"+m5+"',ggs='"+g5+"',point='"+sm+"' where id='"+id+"' ";
		 					ps=con.prepareStatement(sq);
		 					ps.execute();
		 					
		 					JOptionPane.showMessageDialog(null, "Marks Updated Successfully !");
		 					 t38.setText("");t39.setText("");t41.setText("");t42.setText("");t43.setText("");
		 					area();
		    				
		    			}else {
		    				
		    				 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
		    			}
		    				      
		    	   
			
		             }catch(Exception ex) {
		            	 JOptionPane.showMessageDialog(null,ex.getStackTrace());
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			                
		                }  finally {
							
							try {
								rs.close();
								ps.close();
								
								
							}catch(Exception e) {
								
							}
							
						}
			           
			}}
			
			
			
			
					
			
			}catch(Exception e1) {
				 JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100\nOR\nInsert Empty Space");
			}  finally {
				
				try {
					rs.close();
					ps.close();
					
					
				}catch(Exception e) {
					
				}
				
			}
          
			
			
		}
		else
		{
			
			try {
				String id=t0.getText().toUpperCase();
				String fn=t1.getText().toUpperCase();
				String ln=t2.getText().toUpperCase();
				String gn=t3.getSelectedItem().toString();
				String cl=t4.getSelectedItem().toString();
				String co=t5.getSelectedItem().toString();
				String exam=t6.getSelectedItem().toString();
				String term=tt7.getSelectedItem().toString();
				

	    	    String sq= "insert into mark(id,phy,gphy,che,gche,bio,gbio,math,gmath,geo,ggeo,bam,gbam,gs,ggs,ec,gec,his,ghis,co,gco,aco,gaco,lan,glan,kis,gkis,ara,gara,dini,gdini,fre,gfre,point,year,class,exam,sch,combi,first,last,gender) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				ps=con.prepareStatement(sq);
				ps.setString(1,id);
				ps.setString(2,"");
				ps.setString(3,"");
				ps.setString(4,"");
				ps.setString(5,"");
				ps.setString(6,"");
				ps.setString(7,"");
				ps.setString(8,"");
				ps.setString(9,"");
				ps.setString(10,"");
				ps.setString(11,"");
				ps.setString(12,"");
				ps.setString(13,"");
				ps.setString(14,"");
				ps.setString(15,"");
				 ps.setString(16,"");
				 ps.setString(17,"");
				 ps.setString(18,"");
				 ps.setString(19,"");
				 ps.setString(20,"");
				 ps.setString(21,"");
				 ps.setString(22,"");
				 ps.setString(23,"");
				 ps.setString(24,"");
				 ps.setString(25,"");
				 ps.setString(26,"");
				 ps.setString(27,"");
				 ps.setString(28,"");
				 ps.setString(29,"");
				 ps.setString(30,"");
				 ps.setString(31,"");
				 ps.setString(32,"");
				 ps.setString(33,"");
				 ps.setString(34,"Inc");
				 ps.setString(35,box5.getSelectedItem().toString());
				 ps.setString(36,cl);
				 ps.setString(37,exam);
				 ps.setString(38,term);
				 ps.setString(39, co);
				 ps.setString(40,fn);
				 ps.setString(41,ln);
				 ps.setString(42, gn);
				 ps.execute();
				
				
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}
					
		}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} finally {
			
			try {
				rs.close();
				ps.close();
				
				
			}catch(Exception e) {
				
			}
			
		}
       
		

		
	}

	private void table() {
		
			String sql="Select id as 'STUDENT ID',first as 'FIRST NAME',last as 'LAST NAME',gender as 'GENDER',class as 'CLASS',combi as 'COMBINATION',exam as 'EXAM TYPE',year as 'ACADEMIC YEAR',sch as TERM from user order by class ";
			
			try {

				
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
				table.setModel(DbUtils.resultSetToTableModel(rs));
				table.setFont(new Font("serif",Font.PLAIN,11));
				table.setForeground(new Color(0,0,139));
				
			
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			} 
			 finally {
					
					try {
						rs.close();
						ps.close();
						
						
					}catch(Exception e) {
						
					}
				}
	           
			table.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent argo)	{
			    int row=table.getSelectedRow();

			    t0.setText(table.getModel().getValueAt(row,0).toString());
			    t1.setText(table.getModel().getValueAt(row,1).toString());
			    t2.setText(table.getModel().getValueAt(row,2).toString());
			    t3.setSelectedItem(table.getModel().getValueAt(row,3).toString());
			    t4.setSelectedItem(table.getModel().getValueAt(row,4).toString());
			    t5.setSelectedItem(table.getModel().getValueAt(row, 5).toString());
			    t6.setSelectedItem(table.getModel().getValueAt(row, 6).toString());
			    box5.setSelectedItem(table.getModel().getValueAt(row, 7).toString());
			    tt7.setSelectedItem(table.getModel().getValueAt(row, 8).toString());
				table.setForeground(new Color(0,0,139));
				
				area();
				
				
			    }});
			table.addKeyListener(new KeyAdapter(){
				public void keyReleased(KeyEvent e)	{

					try{
					int row=table.getSelectedRow();

					     t0.setText(table.getModel().getValueAt(row,0).toString());
					    t1.setText(table.getModel().getValueAt(row,1).toString());
					    t2.setText(table.getModel().getValueAt(row,2).toString());
					    t3.setSelectedItem(table.getModel().getValueAt(row,3).toString());
					    t4.setSelectedItem(table.getModel().getValueAt(row,4).toString());
					    t5.setSelectedItem(table.getModel().getValueAt(row, 5).toString());
					    t6.setSelectedItem(table.getModel().getValueAt(row, 6).toString());
					    box5.setSelectedItem(table.getModel().getValueAt(row, 7).toString());
					    tt7.setSelectedItem(table.getModel().getValueAt(row, 8).toString());
						table.setForeground(new Color(0,0,139));
						area();
	                 if(e.getKeyCode()==KeyEvent.VK_ENTER);
					
					
					}catch(Exception esss){
					//JOptionPane.showMessageDialog(null, esss.getMessage());
					}
					 
				}
					
				});
				
			
		}
	

	private void button() {
		
	
		ban1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(boxn.getSelectedItem() != null &&!((String) boxn.getSelectedItem()).trim().isEmpty()) {
					
					table3();
				}else {
					
					JOptionPane.showMessageDialog(null, "Select Class Please !");
				}
				
				
			}
			});
	
		
		ba1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                 try {
                	 
                        String da1="FORM V";
             		    String sql="Select id as 'STUDENT ID',first as 'FIRST NAME',last as 'LAST NAME',gender as 'GENDER',class as 'CLASS',combi as 'COMBINATION',exam as 'EXAM TYPE',year as 'ACADEMIC YEAR',sch as 'SCHOOL' from user where class= '"+da1+"' ";
             			ps=con.prepareStatement(sql);
             			rs=ps.executeQuery();
             			table.setModel(DbUtils.resultSetToTableModel(rs));
             			table.setFont(new Font("serif",Font.PLAIN,11));
             			table.setForeground(new Color(0,0,139));
             			
                 }catch(Exception ex) {
                	 JOptionPane.showMessageDialog(null, ex.getMessage());
                 }
				
			}
		});
		
		ba2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                 try {
                	 
                        String da1="FORM VI";
             		    String sql="Select id as 'STUDENT ID',first as 'FIRST NAME',last as 'LAST NAME',gender as 'GENDER',class as 'CLASS',combi as 'COMBINATION' ,exam as 'EXAM TYPE',year as 'ACADEMIC YEAR',sch as 'SCHOOL' from user where class= '"+da1+"' ";
             			ps=con.prepareStatement(sql);
             			rs=ps.executeQuery();
             			table.setModel(DbUtils.resultSetToTableModel(rs));
             			table.setFont(new Font("serif",Font.PLAIN,11));
             			table.setForeground(new Color(0,0,139));
             			
                 }catch(Exception ex) {
                	 JOptionPane.showMessageDialog(null, ex.getMessage());
                 }
				
			}
		});
		
		b5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			
				resert();
				table();
			}
			
			
		});
		
		
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id=t0.getText().toUpperCase();
				
				
				if(t0.getText() != null &&!t0.getText().trim().isEmpty()&&
						t1.getText() != null &&!t1.getText().trim().isEmpty() && t2.getText() != null &&!t2.getText().trim().isEmpty() &&
						t3.getSelectedItem() != null &&!((String) t3.getSelectedItem()).trim().isEmpty() && 	t4.getSelectedItem() != null
						&&!((String) t4.getSelectedItem()).trim().isEmpty() && 	t5.getSelectedItem() != null&&!((String) t5.getSelectedItem()).trim().isEmpty()
								 && 	tt7.getSelectedItem() != null &&!((String) tt7.getSelectedItem()).trim().isEmpty()		 && 	t6.getSelectedItem() != null &&!((String) t6.getSelectedItem()).trim().isEmpty()&&box5.getSelectedItem() != null &&!((String) box5.getSelectedItem()).trim().isEmpty()
										 
								){
					String fn=t1.getText().toUpperCase();
					String ln=t2.getText().toUpperCase();
					String gn=t3.getSelectedItem().toString();
					String cl=t4.getSelectedItem().toString();
					String co=t5.getSelectedItem().toString();
					String exam=t6.getSelectedItem().toString();
					String year=box5.getSelectedItem().toString();
					String term=tt7.getSelectedItem().toString();
				
				try {
					
				
					
					if(fn.matches("^[\\p{L} .'-]+$") && ln.matches("^[\\p{L} .'-]+$") )
		             {
						
						
					String sq="insert into user(id,first,last,gender,class,combi,exam,year,sch) values (?,?,?,?,?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(sq);
					ps.setString(1,id);
					ps.setString(2, fn);
				    ps.setString(3,ln);
					ps.setString(4,gn);
					ps.setString(5,cl);
					ps.setString(6,co);
					ps.setString(7,exam);
					ps.setString(8,year);
					ps.setString(9,term);
					ps.execute();
				
					String s=String.format("%s   %s",fn ,"Added Successfully !");
					JOptionPane.showMessageDialog(b1, s);
					

			 	    rs.close();
			        ps.close(); 
			        
					update();
					update1();
					table();
					//area();
						
		             }
					else {
						
						JOptionPane.showMessageDialog(null, "Enter Valid Names  !");
					}
					
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "User of that ID Already Registered !");
				} finally {
					
					try {
						rs.close();
						ps.close();
						
						
					}catch(Exception ee) {
						
					}
					
				}
	           
				 
			} else {
				JOptionPane.showMessageDialog(null, "Fills All fields Correctly  !");
			}
				
			}
			});
		
	
	b3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			
			
			
			if(t0.getText() != null &&!t0.getText().trim().isEmpty()&&
					t1.getText() != null &&!t1.getText().trim().isEmpty() && t2.getText() != null &&!t2.getText().trim().isEmpty() &&
					t3.getSelectedItem() != null &&!((String) t3.getSelectedItem()).trim().isEmpty() && 	t4.getSelectedItem() != null
					&&!((String) t4.getSelectedItem()).trim().isEmpty() && 	t5.getSelectedItem() != null&&!((String) t5.getSelectedItem()).trim().isEmpty()
							 && 	t6.getSelectedItem() != null &&!((String) t6.getSelectedItem()).trim().isEmpty()
									 && 	tt7.getSelectedItem() != null &&!((String) tt7.getSelectedItem()).trim().isEmpty()
							 
							){
				
				String id=t0.getText().toUpperCase();t50.setText(id);t50.setEditable(false);
				String fn=t1.getText().toUpperCase();t51.setText(fn);
				String ln=t2.getText().toUpperCase();t52.setText(ln);
				String gn=t3.getSelectedItem().toString();t53.setSelectedItem(gn);
				String cl=t4.getSelectedItem().toString();t54.setSelectedItem(cl);
				String co=t5.getSelectedItem().toString();t55.setSelectedItem(co);
				String exam=t6.getSelectedItem().toString();t56.setSelectedItem(exam);
				String year=box5.getSelectedItem().toString();box55.setSelectedItem(year);
				String term=tt7.getSelectedItem().toString();tt17.setSelectedItem(term);
				String mk="-";
				String mk2="Inc";
				
			int result = JOptionPane.showConfirmDialog(null, pana4, "Update Student Details",
		            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
			
			if(t50.getText() != null &&!t50.getText().trim().isEmpty()&&
					t51.getText() != null &&!t51.getText().trim().isEmpty() && t52.getText() != null &&!t52.getText().trim().isEmpty() &&
					t53.getSelectedItem() != null &&!((String) t53.getSelectedItem()).trim().isEmpty() && 	t54.getSelectedItem() != null
					&&!((String) t54.getSelectedItem()).trim().isEmpty() && 	t55.getSelectedItem() != null&&!((String) t55.getSelectedItem()).trim().isEmpty()
							 && 	t56.getSelectedItem() != null &&!((String) t56.getSelectedItem()).trim().isEmpty() && box55.getSelectedItem() != null &&!((String) box55.getSelectedItem()).trim().isEmpty()
									 && 	tt17.getSelectedItem() != null &&!((String) tt17.getSelectedItem()).trim().isEmpty()
							){
				if(t51.getText().matches("^[\\p{L} .'-]+$") && t52.getText().matches("^[\\p{L} .'-]+$")) {
					
			if( result==JOptionPane.OK_OPTION) {
				
				try {
					String mud= t51.getText();
					 mud=mud.replaceAll("'", "''");
					
					String sql="update  user set id='"+(t50.getText().toUpperCase()).replaceAll("'", "''")+"',  first='"+(t51.getText().toUpperCase()).replaceAll("'", "''")+"' ,last='"+(t52.getText().toUpperCase()).replaceAll("'", "''")+"',gender='"+t53.getSelectedItem().toString()+"',class='"+t54.getSelectedItem().toString()+"',combi='"+t55.getSelectedItem().toString()+"',exam='"+t56.getSelectedItem().toString()+"' ,year='"+box55.getSelectedItem().toString()+"',sch='"+tt17.getSelectedItem().toString()+"' where  id='"+t0.getText()+"' ";
					ps=con.prepareStatement(sql);
					ps.execute();
			
					    String sq1="update mark set id='"+(t50.getText().toUpperCase()).replaceAll("'", "''")+"', first='"+(t51.getText().toUpperCase()).replaceAll("'", "''")+"' ,last='"+(t52.getText().toUpperCase()).replaceAll("'", "''")+"',gender='"+t53.getSelectedItem().toString()+"', class='"+t54.getSelectedItem().toString()+"',exam='"+t56.getSelectedItem().toString()+"',year='"+box55.getSelectedItem().toString()+"',sch='"+tt17.getSelectedItem().toString()+"' ,combi='"+t55.getSelectedItem().toString()+"' where id='"+t0.getText()+"' "; 
					    ps=con.prepareStatement(sq1);
						ps.execute();
							
					
					if(!co.matches(t55.getSelectedItem().toString())) {
						 String sq="update mark set phy='"+mk+"',gphy='"+mk+"',che='"+mk+"',gche='"+mk+"',math='"+mk+"',gmath='"+mk+"',bio='"+mk+"',gbio='"+mk+"',geo='"+mk+"',ggeo='"+mk+"',bam='"+mk+"',gbam='"+mk+"',ec='"+mk+"',gec='"+mk+"',his='"+mk+"',ghis='"+mk+"',co='"+mk+"',gco='"+mk+"',aco='"+mk+"',gaco='"+mk+"',lan='"+mk+"',glan='"+mk+"',kis='"+mk+"',gkis='"+mk+"',ara='"+mk+"',gara='"+mk+"',dini='"+mk+"',gdini='"+mk+"',fre='"+mk+"',gfre='"+mk+"',gs='"+mk+"',ggs='"+mk+"',point='"+mk2+"' where id='"+t0.getText()+"' ";
						 ps=con.prepareStatement(sq);
						 ps.execute();
						
					}
					
					String s=String.format("%s   %s",fn , "Added Successfully !");
					JOptionPane.showMessageDialog(b1, s);
					area();
					table();
					resert();

				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}  finally {
					
					try {
						rs.close();
						ps.close();
						
						
					}catch(Exception ex) {
						
					}
					
				}
	           
				
			}else {}
				}else {
					JOptionPane.showMessageDialog(null, "Enter Valid Names !");
				}
			}else {
				JOptionPane.showMessageDialog(null, "Fills all Fields Correctly  !");
			}
			
		}else {
			JOptionPane.showMessageDialog(null, "Select User from the table !");
		}
		}	
		}
		);
	
	
b7.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		if(!t0.getText().isEmpty()&&!t0.getText().matches("")) {
			update();
			update1();
			//table();
		
			
		}else {
			JOptionPane.showMessageDialog(null, "Select User from the Table !");
		}
		
	}});
	
b4.addActionListener(new ActionListener() {
	
     String fn=t1.getText();
	
	public void actionPerformed(ActionEvent e) {

		if(t0.getText() != null &&!t0.getText().trim().isEmpty())
		{
try {
	
	String s1=String.format("%s   %s","Are you sure you want to Delete,",t1.getText());
	

	int mudi=JOptionPane.showConfirmDialog(b4, s1,"Delete", JOptionPane.YES_NO_OPTION);
	if(mudi==JOptionPane.YES_OPTION)
	{
	String sq1="delete  from user where id='"+t0.getText()+"' ";
	ps=con.prepareStatement(sq1);
	ps.execute();
	ps.close();
	
 
	String sq2="delete  from mark where id='"+t0.getText()+"' ";
	 ps=con.prepareStatement(sq2);
	ps.execute();
	ps.close();
     
     JOptionPane.showMessageDialog(null,t1.getText() +"   "+"Deleted Successfully !");
     table();resert();
	}
	
	
}catch(Exception ex) {
	
	JOptionPane.showMessageDialog(null, ex.getMessage());
}  finally {
	
	try {
		rs.close();
		ps.close();
		
		
	}catch(Exception ee) {
		
	}
	
}

	}else {
		                              JOptionPane.showMessageDialog(b1, "Select User from the Table !");
	}
	}
	
	
	
});
	
	
	}

	private void bar() {
		
		Icon alarm=new ImageIcon(this.getClass().getResource("/alarm.png"));
		Icon cale=new ImageIcon(this.getClass().getResource("/cale.png"));
		Icon ex=new ImageIcon(this.getClass().getResource("/exit.png"));
		Icon log=new ImageIcon(this.getClass().getResource("/log.png"));
		Icon r=new ImageIcon(this.getClass().getResource("/r.png"));
		Icon u=new ImageIcon(this.getClass().getResource("/us.png"));
		Icon ab=new ImageIcon(this.getClass().getResource("ab.png"));
		Icon cc=new ImageIcon(this.getClass().getResource("/cc.png"));
		Icon cpp=new ImageIcon(this.getClass().getResource("/pa.png"));
		Icon dell=new ImageIcon(this.getClass().getResource("/dell.png"));
		Icon show=new ImageIcon(this.getClass().getResource("/show.png"));
		Icon pdf=new ImageIcon(this.getClass().getResource("/pdf.png"));
		Icon excel=new ImageIcon(this.getClass().getResource("/excel.png"));
		Icon lev=new ImageIcon(this.getClass().getResource("/level.png"));
		Icon ad=new ImageIcon(this.getClass().getResource("/advance.png"));
		Icon clear=new ImageIcon(this.getClass().getResource("/clear.png"));
		Icon pr=new ImageIcon(this.getClass().getResource("/pri.png"));
		//Icon arc=new ImageIcon(this.getClass().getResource("/arc.png"));
		
		
		 Calendar timer=Calendar.getInstance();
		 timer.getTime();
		 SimpleDateFormat df= new SimpleDateFormat("hh:mm:ss a");
		 SimpleDateFormat dt=new SimpleDateFormat("MMM dd,  yyyy");

		
	
	JMenuBar bar=new JMenuBar();
	setJMenuBar(bar);
	
	JMenu file=new JMenu("File");
	bar.add(file);
	JMenuItem pri=new JMenuItem("Primary");
	//file.add(pri);pri.setIcon(pr);
	JMenuItem olevel=new JMenuItem("Form I-IV");
	file.add(olevel);olevel.setIcon(lev);
	
	JMenuItem del=new JMenuItem("Delete Class");
	file.add(del);del.setIcon(dell);
	JMenuItem up=new JMenuItem("Update Class");
	file.add(up);up.setIcon(show);
	JMenuItem res=new JMenuItem("Resert Marks");
	file.add(res);res.setIcon(clear);
	JMenuItem delete=new JMenuItem("Delete Archive");
	file.add(delete);//delete.setIcon(arc);
	JMenuItem cp=new JMenuItem("Change Password");
	file.add(cp);
	cp.setIcon(cpp);
	
	JMenuItem logo=new JMenuItem("Logout");
	file.add(logo);logo.setIcon(log);
	
	JMenu rep=new JMenu("Report");
	bar.add(rep);
	
	JMenu clas=new JMenu("Class Report(New)");
	JMenu dar=new JMenu("Class Report(Old)");

	JMenu set=new JMenu("Setting");
	bar.add(set);
	JMenuItem upd=new JMenuItem("Update Grade");
	set.add(upd);
	JMenu other=new JMenu("Other");
	bar.add(other);
	JMenuItem form=new JMenuItem("Attendance Form");
	other.add(form);
	
	JMenu help=new JMenu("Help");
	bar.add(help);
	
	JMenuItem about=new JMenuItem("About System");
	help.add(about);about.setIcon(ab);
	
	JMenuItem cla=new JMenuItem("Pdf");
	JMenuItem exp=new JMenuItem("Excel");
	
	JMenuItem clao=new JMenuItem("Pdf");
	JMenuItem expo=new JMenuItem("Excel");

	JMenu stu=new JMenu("Student's Report");
	rep.add(stu);stu.setIcon(show);
	JMenuItem nrep=new JMenuItem("New");
	JMenuItem orep=new JMenuItem("Old");
	stu.add(nrep);stu.add(orep);
	
	
	rep.add(clas);rep.add(dar);
	clas.add(cla);cla.setIcon(pdf);
	clas.add(exp);exp.setIcon(excel);
	
	dar.add(clao);clao.setIcon(pdf);
	dar.add(expo);expo.setIcon(excel);
	
	
	JMenuItem resu=new JMenuItem("Create Archieve");
	set.add(resu);
	
	
	
	
	form.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent arg0) {
			try {
				
				

				int result = JOptionPane.showConfirmDialog(null, panel, "Select ",
				        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				
				if(result==JOptionPane.OK_OPTION){
					if(et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty() ) {
						
						String sqqq="select * from user  where   class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  ORDER BY gender ASC,first ASC,last ASC  ";
				    	ps=con.prepareStatement(sqqq);
				    	rs=ps.executeQuery();
				    	
						
						PdfPTable mudi23 = new PdfPTable(1);
					     PdfPCell cell23=new PdfPCell(new Phrase(""));
					    
					     mudi23.setWidthPercentage(105);
					     Image im=Image.getInstance("other.png");
		  		    	 mudi23.addCell(cell23);
		 		    	 mudi23.addCell(im);
		 		    	 
		 		    	 PdfPTable mudi = new PdfPTable(36);
					     PdfPCell cell=new PdfPCell(new Phrase(""));
					     cell.setColspan(10);
					     cell.setHorizontalAlignment(Element.ALIGN_CENTER);
					     cell.setBackgroundColor(new BaseColor(240,230,140));
					     mudi.addCell(cell);
					     mudi.setWidths(new int[]{ 1, 1, 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
						    mudi.setWidthPercentage(100);					    
						    cell.setColspan(36);
						    cell.setHorizontalAlignment(1);
						    mudi.addCell(cell);
						    
						    cell = new PdfPCell(new Phrase("S/No",FontFactory.getFont("verdana", 14, Font.BOLD, BaseColor.BLACK)));
						    cell.setColspan(3);
						    cell.setHorizontalAlignment(1);
						    mudi.addCell(cell);
						    
						    
						    cell = new PdfPCell(new Phrase("FULL NAME",FontFactory.getFont("verdana", 14, Font.BOLD, BaseColor.BLACK)));
						    cell.setColspan(16);
						    cell.setHorizontalAlignment(1);
						    mudi.addCell(cell);
						    
						    cell = new PdfPCell(new Phrase("COMBI",FontFactory.getFont("verdana", 14, Font.BOLD, BaseColor.BLACK)));
						    cell.setColspan(4);
						    cell.setHorizontalAlignment(1);
						    mudi.addCell(cell);
						    

						    cell = new PdfPCell(new Phrase("MARKS",FontFactory.getFont("verdana", 14, Font.BOLD, BaseColor.BLACK)));
						    cell.setColspan(6);
						    cell.setHorizontalAlignment(1);
						    mudi.addCell(cell);
						    

						    cell = new PdfPCell(new Phrase("SIGN",FontFactory.getFont("verdana", 14, Font.BOLD, BaseColor.BLACK)));
						    cell.setColspan(7);
						    cell.setHorizontalAlignment(1);
						    mudi.addCell(cell);
						    
						    int a = 0;
						    while(rs.next()) {
						    	
						    	a++;

				    			String fn=rs.getString("first");
					    		String ln=rs.getString("last");
					    		String co=rs.getString("combi");
					    		
					    		
					    		  cell = new PdfPCell(new Phrase(""+a,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
								    cell.setColspan(3);
								   cell.setHorizontalAlignment(1);
								    mudi.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase(fn+"  "+ln,FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
								    cell.setColspan(16);
								    mudi.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase(co,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("",FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
								    cell.setColspan(6);
								    mudi.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("",FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
								    cell.setColspan(7);
								    mudi.addCell(cell);
								    mudi.setHeaderRows(2);
								    
						    }
						    
						    
						
						    Document document=new Document(PageSize.A4);
				            PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream("Form.pdf"));
							document.open();
							Image img=Image.getInstance("barcode.png");
							document.add(mudi23);
							document.add(new Paragraph("            "+school+"  SECONDARY SCHOOL",FontFactory.getFont(FontFactory.TIMES_ROMAN,20,Font.BOLD,new BaseColor(0,0,150))));
							document.add(new Paragraph("                                             ATTENDANCE FORM",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD,new BaseColor(0,0,150))));
							document.add(new Paragraph("                                              "+ct.getSelectedItem()+"  -  "+ac.getSelectedItem(),FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD,new BaseColor(0,0,150))));
							document.add(new Paragraph("\n"));
							document.add(new Paragraph("EXAM :       ................................. "+"                            "+"DATE :       ......./....../ 20............ "+" ",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD,new BaseColor(0,0,150))));
							document.add(new Paragraph("SUBJECT : .................................. ",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD,new BaseColor(0,0,150))));
							document.add(new Paragraph("\n"));
							document.add(mudi);
							document.add(new Paragraph("\n"));
							document.add(img);
							document.close();
							
							// JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
						      Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"Form.pdf");
						      
						
					}else {
						
						JOptionPane.showMessageDialog(null, "Can't Accept Empty Value !");
					}
				}

				
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}
		
   }});
	

	delete.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			
		     
		    
					
					try {
						 String p1=JOptionPane.showInputDialog(null, "Enter Current Username !", "Username", 1);
				    	  String p2=JOptionPane.showInputDialog(null, "Enter Current Password !", "Password", 1);
				    	 
				    	     String sql2 ="select count(username) from account where password = '"+p2+"' and username='"+p1+"'  ";
					    	 PreparedStatement pss=con.prepareStatement(sql2);
					    	 ResultSet rss=pss.executeQuery();
					    	 int count=Integer.parseInt(rss.getString("count(username)"));
					    	 rss.close();
					    	 pss.close();
					    	 
							if(count>0 )
							{
								
								
								
								int result = JOptionPane.showConfirmDialog(null, panel, "Select",
								        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
								if(result==JOptionPane.OK_OPTION) {
									
									if(et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty() ) {
										
										
										
										String sq1="delete  from mark00 where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  ";
										ps=con.prepareStatement(sq1);
										ps.execute();
										ps.close();
										
										
										JOptionPane.showMessageDialog(null, "Records ,Deleted Successfully !");
										
									}else {
										JOptionPane.showMessageDialog(null, "Cant't Accept Empty Value !");
										
									}
									
								}
								
								
							}
							else{
								JOptionPane.showMessageDialog(null, "Incorrect Username or Password.!   Try Again.....");
								
							
							
							}
				    	  
		      } catch(Exception exxx){
		    	  JOptionPane.showMessageDialog(null, exxx.getMessage());
		      }  finally {
					
					try {
						rs.close();
						ps.close();
						
						
					}catch(Exception e) {
						
					}
					
				}
	           
				
		     }
		      
	});
	
	
	
	
	resu.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent arg0) {

try {
	int result = JOptionPane.showConfirmDialog(null, panel, "Select",
	        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
	if(result==JOptionPane.OK_OPTION) {
	//	JOptionPane.showMessageDialog(null, et.getSelectedItem().toString());
		
		if(sch.getSelectedItem() != null &&!((String) sch.getSelectedItem()).trim().isEmpty()&&et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty() ) {
			
			
			try {
				
				 String sqq ="select count(id) from mark where exam = '"+et.getSelectedItem().toString()+"' and class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+sch.getSelectedItem().toString()+"' ";
		    	  ps=con.prepareStatement(sqq);
		    	 rs=ps.executeQuery();
		    	 int cou=Integer.parseInt(rs.getString("count(id)"));
		    	 
				if(cou>0) {
					

				    String sql2 ="select count(id) from mark00 where exam = '"+et.getSelectedItem().toString()+"' and class='"+ct.getSelectedItem().toString()+"' and sch='"+sch.getSelectedItem().toString()+"'  and year='"+ac.getSelectedItem().toString()+"'  ";
			    	  ps=con.prepareStatement(sql2);
			    	 rs=ps.executeQuery();
			    	 int count=Integer.parseInt(rs.getString("count(id)"));
			    	 
			    	 
					if(count>0 )
					{
						JOptionPane.showMessageDialog(null, "Data Already Present !");
					}
					else{
						 String sq="INSERT into mark00(id,phy,gphy,che,gche,bio,gbio,math,gmath,geo,ggeo,bam,gbam,gs,ggs,ec,gec,his,ghis,co,gco,aco,gaco,lan,glan,kis,gkis,ara,gara,dini,gdini,fre,gfre,point,year,class,exam,sch,combi,first,last,gender) SELECT id,phy,gphy,che,gche,bio,gbio,math,gmath,geo,ggeo,bam,gbam,gs,ggs,ec,gec,his,ghis,co,gco,aco,gaco,lan,glan,kis,gkis,ara,gara,dini,gdini,fre,gfre,point,year,class,exam,sch,combi,first,last,gender FROM mark WHERE exam='"+et.getSelectedItem().toString()+"' AND class='"+ct.getSelectedItem().toString()+"'  AND  year='"+ac.getSelectedItem().toString()+"'  and sch='"+sch.getSelectedItem().toString()+"'   ";
						 ps=con.prepareStatement(sq);
						 ps.execute();
						 JOptionPane.showMessageDialog(null, "Data Added Successfuly !");
					}
				}else {
					
					JOptionPane.showMessageDialog(null, "Data are not Available !");
				}
				

				
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}
			
			

			
			
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Can't Accept Empty Value !");
		}
			
		
		
				
	}
	
}catch(Exception ex) {
	JOptionPane.showMessageDialog(null, ex.getMessage());
}
			
			
			
		}	
	});
	
	
	
	
	upd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			grade();
			int result = JOptionPane.showConfirmDialog(null, panel3, "Update Grades",
			        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
			if(result==JOptionPane.OK_OPTION) {
				
				if(text13.getText() != null &&!text13.getText().trim().isEmpty() && text14.getText() != null &&!text14.getText().trim().isEmpty() && text3.getText() != null &&text11.getText() != null &&!text11.getText().trim().isEmpty() && text12.getText() != null &&!text12.getText().trim().isEmpty() &&text3.getText()!= null &&text1.getText() != null &&!text1.getText().trim().isEmpty() && text2.getText() != null &&!text2.getText().trim().isEmpty() &&text3.getText() != null &&!text3.getText().trim().isEmpty() && text4.getText() != null &&!text4.getText().trim().isEmpty() && text5.getText() != null &&!text5.getText().trim().isEmpty() && text6.getText() != null &&!text6.getText().trim().isEmpty() && text7.getText() != null &&!text7.getText().trim().isEmpty() && text8.getText() != null &&!text8.getText().trim().isEmpty() && text9.getText() != null &&!text9.getText().trim().isEmpty() && text10.getText() != null &&!text10.getText().trim().isEmpty() ) {
					
					grade1=Double.parseDouble(text1.getText());grade2=Double.parseDouble(text2.getText());grade3=Double.parseDouble(text3.getText());
					grade4=Double.parseDouble(text4.getText());grade5=Double.parseDouble(text5.getText());grade6=Double.parseDouble(text6.getText());
					grade7=Double.parseDouble(text7.getText());grade8=Double.parseDouble(text8.getText());
					grade9=Double.parseDouble(text9.getText());grade10=Double.parseDouble(text10.getText());
					grade11=Double.parseDouble(text11.getText());grade12=Double.parseDouble(text12.getText());
					grade13=Double.parseDouble(text13.getText());grade14=Double.parseDouble(text14.getText());
					
					if((grade11>=0 && grade11<=100)&&(grade12>=0 && grade12<=100)&&(grade13>=0 && grade13<=100)&&(grade14>=0 && grade14<=100)&& (grade1>=0 && grade1<=100)&&(grade2>=0 && grade2<=100)&&(grade3>=0 && grade3<=100)&&(grade4>=0 && grade4<=100)&&(grade5>=0 && grade5<=100)&&(grade6>=0 && grade6<=100)&&(grade7>=0 && grade7<=100)&&(grade8>=0 && grade8<=100)&&(grade9>=0 && grade9<=100)&&(grade10>=0 && grade10<=100) ) {
						
						try {
							String sql="update grade set grade1='"+grade1+"',grade2='"+grade2+"',grade3='"+grade3+"',grade4='"+grade4+"',grade5='"+grade5+"',grade6='"+grade6+"',grade7='"+grade7+"',grade8='"+grade8+"',grade9='"+grade9+"',grade10='"+grade10+"',grade11='"+grade11+"',grade12='"+grade12+"',grade13='"+grade13+"',grade14='"+grade14+"' where rowid='"+3+"'  ";
							ps=con.prepareStatement(sql);
							ps.execute();
							JOptionPane.showMessageDialog(null,"Grades Updared Successful !");
							
						}catch(Exception ex) {
							JOptionPane.showMessageDialog(null, ex.getMessage());
						}
						finally{
			  	             try{
			  	                 rs.close();
			  	                 ps.close();
			  	             }catch(Exception ex){
			  	                 ex.getMessage();
			  	             }}
						
					}else {
						  JOptionPane.showMessageDialog(null,"Enter Valid Marks from 0 to 100");
					}
					
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Can't Accept Empty Value !");
				}
				
			}}});
	cp.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			
		      try{
		    	  String p1=JOptionPane.showInputDialog(null, "Enter Current Username !", "Username", 1);
		    	  String p2=JOptionPane.showInputDialog(null, "Enter Current Password !", "Password", 1);
		    	 
		    	     String sql2 ="select count(username) from account where password = '"+p2+"' and username='"+p1+"'  ";
			    	 PreparedStatement pss=con.prepareStatement(sql2);
			    	 ResultSet rss=pss.executeQuery();
			    	 int count=Integer.parseInt(rss.getString("count(username)"));
			    	 rss.close();
			    	 pss.close();
			    	 
					if(count>0 )
					{
						
				    	  String p3=JOptionPane.showInputDialog(null, "Enter New Password !", "Password", 1);
				    	
						/*if(p2.equals(p3))
				    	{*/
				  				
								String sql="update  account set  password='"+p3+"' where username= '"+p1+"'  ";
								ps=con.prepareStatement(sql);
								ps.execute();	
								JOptionPane.showMessageDialog(bar, "Password Changed Successfully !");
				    	/*}else{
				    		JOptionPane.showMessageDialog(bar, "Your Passwords do not match !.Try Again..");
				    	}*/
				    	  
				    	
				    	
						
					}
					else{
						JOptionPane.showMessageDialog(null, "Incorrect Username or Password.!   Try Again.....");
						
					
					
					}
		    	  
		    	
		    	
	                     }catch(Exception e){	
			             e.getMessage();
			             
		    
		      }  finally{
	  	             try{
	  	                 rs.close();
	  	                 ps.close();
	  	             }catch(Exception ex){
	  	                 ex.getMessage();
	  	             }}
		     }
		      
	});
	
	
	
	
	res.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			
		     
		    	
					
					try {
						 String p1=JOptionPane.showInputDialog(null, "Enter Current Username !", "Username", 1);
				    	  String p2=JOptionPane.showInputDialog(null, "Enter Current Password !", "Password", 1);
				    	 
				    	     String sql2 ="select count(username) from account where password = '"+p2+"' and username='"+p1+"'  ";
					    	 PreparedStatement pss=con.prepareStatement(sql2);
					    	 ResultSet rss=pss.executeQuery();
					    	 int count=Integer.parseInt(rss.getString("count(username)"));
					    	 rss.close();
					    	 pss.close();
					    	 
							if(count>0 )
							{
								
								
								
								int result = JOptionPane.showConfirmDialog(null, panel2, "Resert Marks",
								        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
								if((box2.getSelectedItem() != null &&!((String) box2.getSelectedItem()).trim().isEmpty())  )    {
								
							        if(result==JOptionPane.OK_OPTION) {
							        	
							        	String s1=String.format("%s   %s  %s","Are you sure you want to Resert,",box2.getSelectedItem(),"Class");
							        	int mudi=JOptionPane.showConfirmDialog(b4, s1,"RESERT ALL Class", JOptionPane.YES_NO_OPTION);
										if(mudi==JOptionPane.YES_OPTION)
										{
											
											String mk="";
								        	String mk1="Inc";
											String sql11="update  mark set  phy='"+mk+"',gphy='"+mk+"',che='"+mk+"',gche='"+mk+"', bio='"+mk+"',gbio='"+mk+"',math='"+mk+"',gmath='"+mk+"', geo='"+mk+"',ggeo='"+mk+"',bam='"+mk+"',gbam='"+mk+"',gs='"+mk+"',ggs='"+mk+"',point='"+mk1+"'   where  class='"+box2.getSelectedItem().toString()+"' ";
											ps=con.prepareStatement(sql11);
											ps.execute();
											
											JOptionPane.showMessageDialog(null,"Marks Reserted Successfully !");
											table();
								        	resert();
								        	box2.setSelectedItem(null);
											
										}
							        	
							        	
							        	
							        }
								}
								else {
									JOptionPane.showMessageDialog(null, "Fill All Fields!   Try Again.....");
								}
								
							}
							else{
								JOptionPane.showMessageDialog(null, "Incorrect Username or Password.!   Try Again.....");
								
							
							
							}
				    	  
		      } catch(Exception exxx){
		    	  JOptionPane.showMessageDialog(null, exxx.getMessage());
		      }  finally {
					
					try {
						rs.close();
						ps.close();
						
						
					}catch(Exception e) {
						
					}
					
				}
	           
				
		     }
		      
	});
	
	
	
	del.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			
		     
		    	
					
					try {
						 String p1=JOptionPane.showInputDialog(null, "Enter Current Username !", "Username", 1);
				    	  String p2=JOptionPane.showInputDialog(null, "Enter Current Password !", "Password", 1);
				    	 
				    	     String sql2 ="select count(username) from account where password = '"+p2+"' and username='"+p1+"'  ";
					    	 PreparedStatement pss=con.prepareStatement(sql2);
					    	 ResultSet rss=pss.executeQuery();
					    	 int count=Integer.parseInt(rss.getString("count(username)"));
					    	 rss.close();
					    	 pss.close();
					    	 
							if(count>0 )
							{
								
								 String[] choices =  {"FORM V","FORM VI"};
								    String input1 = (String) JOptionPane.showInputDialog(null, "Select Class to DELETE","Select ", JOptionPane.QUESTION_MESSAGE, null,choices,choices[0]);
								     
								 
								String s1=String.format("%s   %s  %s","Are you sure you want to Delete,",input1,"Class");
								String s2=String.format("%s   %s  %s",input1,"Class","Deleted Successfully !");
								
								int mudi=JOptionPane.showConfirmDialog(b4, s1,"Delete ALL Class", JOptionPane.YES_NO_OPTION);
								if(mudi==JOptionPane.YES_OPTION)
								{
							
							String sq1="delete  from user where Class='"+input1+"' ";
							ps=con.prepareStatement(sq1);
							ps.execute();
							ps.close();
							
							String sq2="delete  from mark where Class='"+input1+"' ";
							ps=con.prepareStatement(sq2);
							ps.execute();
							ps.close();
							
							
							JOptionPane.showMessageDialog(b1,s2);
							resert();
							table();
							
								}

							}
							else{
								JOptionPane.showMessageDialog(null, "Incorrect Username or Password.!   Try Again.....");
								
							
							
							}
				    	  
		      } catch(Exception exxx){
		    	  JOptionPane.showMessageDialog(null, exxx.getMessage());
		      }  finally {
					
					try {
						rs.close();
						ps.close();
						
						
					}catch(Exception e) {
						
					}
					
				}
	           
				
		     }
		      
	});
	
	up.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			
					
					try {
						 String p1=JOptionPane.showInputDialog(null, "Enter Current Username !", "Username", 1);
				    	  String p2=JOptionPane.showInputDialog(null, "Enter Current Password !", "Password", 1);
				    	 
				    	 
				    	     String sql2 ="select count(username) from account where password = '"+p2+"' and username='"+p1+"'  ";
					    	 PreparedStatement pss=con.prepareStatement(sql2);
					    	 ResultSet rss=pss.executeQuery();
					    	 int count=Integer.parseInt(rss.getString("count(username)"));
					    	 rss.close();
					    	 pss.close();
					    	 
							if(count>0 )
							{
								
								
								
								int result = JOptionPane.showConfirmDialog(null, panel1, "Select ",
								        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
								 
					if(((box76.getSelectedItem() != null &&!((String) box76.getSelectedItem()).trim().isEmpty())&&(box75.getSelectedItem() != null &&!((String) box75.getSelectedItem()).trim().isEmpty())&&(box69.getSelectedItem() != null &&!((String) box69.getSelectedItem()).trim().isEmpty()) &&(box70.getSelectedItem() != null &&!((String) box70.getSelectedItem()).trim().isEmpty())) && ((box73.getSelectedItem() != null &&!((String) box73.getSelectedItem()).trim().isEmpty()) &&(box74.getSelectedItem() != null &&!((String) box74.getSelectedItem()).trim().isEmpty())) || ((box71.getSelectedItem() != null &&!((String) box71.getSelectedItem()).trim().isEmpty()) &&(box72.getSelectedItem() != null &&!((String) box72.getSelectedItem()).trim().isEmpty())) )    {
								
							        if(result==JOptionPane.OK_OPTION) {
							        	
							        
							        		
							        		String sql1="update  user set  class='"+box70.getSelectedItem().toString()+"',exam='"+box74.getSelectedItem().toString()+"' ,year='"+box72.getSelectedItem().toString()+"',sch='"+box76.getSelectedItem().toString()+"'  where  class='"+box69.getSelectedItem().toString()+"' ";
											ps=con.prepareStatement(sql1);
											ps.execute();
											String sql11="update  mark set  class='"+box70.getSelectedItem().toString()+"',exam='"+box74.getSelectedItem().toString()+"',year='"+box72.getSelectedItem().toString()+"',sch='"+box76.getSelectedItem().toString()+"'  where  class='"+box69.getSelectedItem().toString()+"' ";
											ps=con.prepareStatement(sql11);
											ps.execute();
								        	
							        
										JOptionPane.showMessageDialog(null,"Updated Successfully !");
										box69.setSelectedItem(null);box70.setSelectedItem(null);box71.setSelectedItem(null);box72.setSelectedItem(null);
										box73.setSelectedItem(null);box74.setSelectedItem(null);box75.setSelectedItem(null);box76.setSelectedItem(null);
										table();
							        	
							        }
							        
								}
								else {
									JOptionPane.showMessageDialog(null, "Fill All Fields!   Try Again.....");
								}
								
							}
							else{
								JOptionPane.showMessageDialog(null, "Incorrect Username or Password.!   Try Again.....");
								
							
							
							}
				    	  
		      } catch(Exception exxx){
		    	  JOptionPane.showMessageDialog(null, exxx.getMessage());
		      }  finally {
					
					try {
						rs.close();
						ps.close();
						
						
					}catch(Exception e) {
						
					}
					
				}
	           
				
		     }
		      
	});
	
	
	olevel.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			  {
					
					try {
						rs.close();
						ps.close();
						con.close();
						
					}catch(Exception e) {
						
					}
					
				}
	           
		dispose();
		Level level=new Level();
		level.setVisible(true);
		level.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		level.setSize(1365,765);
		level.setResizable(false);
		level.setIconImage(Toolkit.getDefaultToolkit().getImage(level.getClass().getResource("lo.png")));

		}});
	
	  logo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				  {
						
						try {
							rs.close();
							ps.close();
							con.close();
							
						}catch(Exception e) {
							
						}
						
					}
		           
			dispose();
			Login l=new Login();
			l.setSize(600,330);
		    l.setVisible(true);
			l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			l.setResizable(false);
			l.setLocation(350,200);
		    l.setIconImage(Toolkit.getDefaultToolkit().getImage(l.getClass().getResource("lo.png")));
		   
			}});
	
	exp.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				
				

int result = JOptionPane.showConfirmDialog(null, panel, "Select ",
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
	
if(result==JOptionPane.OK_OPTION){

	if(sch.getSelectedItem() != null &&!((String) sch.getSelectedItem()).trim().isEmpty() &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty()) {
		
	    	String count="select count(id) from mark  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+sch.getSelectedItem().toString()+"' ";
			ps=con.prepareStatement(count);
			ResultSet rss=ps.executeQuery();
			
			String sqqq="select point from mark  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+sch.getSelectedItem().toString()+"'";
	    	ps=con.prepareStatement(sqqq);
	    	rs=ps.executeQuery();
			

	    	    int count1=0,count2=0,count3=0,count4=0,count0=0,count5=0;
		
	    	
			
			int nam=Integer.parseInt(rss.getString("count(id)"));
			if(nam !=0) {
				
				
				while(rs.next()) {
		    		
		    		if(rs.getString("point").matches("Inc")) {
		    			count5++;
		    			
		    		}else {
		    			int mark=Integer.parseInt(rs.getString("point"));
			    		
			    		if(mark>=3 && mark<=9) {
			    			count1++;
			    		}else if(mark>=10 && mark<=12) {
			    			count2=count2+1;
			    		}else if(mark>=13 && mark<=17) {
			    			count3++;
			    		}
			    		else if(mark>=18 && mark<=19) {
			    			count4++;
			    		}else if(mark>=20 && mark<=21) {
			    			count0++;
			    			
			    		
			    		
			    		
			    		}
		    
			    		
		    		}
		    		}
				    String sqq="select count(id) from mark  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  and sch='"+sch.getSelectedItem().toString()+"'";
	     			ps=con.prepareStatement(sqq);
	     			rs=ps.executeQuery();
	     			
	     			
	     			
	     			String sum=rss.getString("count(id)");
	     			String s=String.format(" %s","TOTAL STUDENTS="+sum+":  DIV I="+count1+":  DIV II="+count2+":  DIV III="+count3+":  DIV IV="+count4+":  DIV O="+count0+":  INCOMPLETE="+count5);
	     			
				
				  String p="";
				  ps = con.prepareStatement("select * from mark where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'and sch='"+sch.getSelectedItem().toString()+"' ");
			      rs=ps.executeQuery(); 
			      XSSFWorkbook workbook = new XSSFWorkbook(); 
			      XSSFSheet spreadsheet = workbook.createSheet("STUDENT'S REPORT");
			      
			     
			      ps = con.prepareStatement("select * from user where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+sch.getSelectedItem().toString()+"'");
			      ResultSet rs1=ps.executeQuery(); 
			      
			      XSSFRow row = spreadsheet.createRow(1);
			      XSSFCell cell = (XSSFCell) row.createCell((short) 1);
			      
			     
			      XSSFCellStyle style3 = workbook.createCellStyle();
			      XSSFFont font = workbook.createFont();
			      font.setFontHeightInPoints((short) 20);
			      font.setFontName("VERDANA");
			      font.setBold(true);
			      XSSFCellStyle style = workbook.createCellStyle();
			      style.setFont(font);
			  
			      cell.setCellStyle(style3);
			      row = spreadsheet.createRow(1);
			      cell = (XSSFCell) row.createCell(1);
			      cell.setCellValue("             "+school+" SECONDARY SCHOOL");
			      cell.setCellStyle(style);
			   
			      
   
			      
			      XSSFFont font1 = workbook.createFont();
			      font1.setFontHeightInPoints((short) 12);
			      font1.setFontName("VERDANA");
			     // font1.setBold(true);
			      XSSFCellStyle style1 = workbook.createCellStyle();
			      style1.setFont(font1);
			  
			  
			     // cell.setCellStyle(style3);
			      row = spreadsheet.createRow(4);
			      cell = (XSSFCell) row.createCell(0);
			      cell.setCellValue(" "+et.getSelectedItem().toString()+"  EXAM RESULT"+"                               "+ct.getSelectedItem().toString()+" - "+ac.getSelectedItem().toString());
			      cell.setCellStyle(style1);
			      
			      XSSFFont font2 = workbook.createFont();
			      font2.setFontHeightInPoints((short) 10);
			      font2.setFontName("VERDANA");
			     // font1.setBold(true);
			      XSSFCellStyle style2 = workbook.createCellStyle();
			      style2.setFont(font2);
			  
			  
			     // cell.setCellStyle(style3);
			      row = spreadsheet.createRow(5);
			      cell = (XSSFCell) row.createCell(0);
			      cell.setCellValue(s);
			      cell.setCellStyle(style2);
			    
			     
			      
			    	        
			      row = spreadsheet.createRow(7);
			      cell = row.createCell(0);
			      cell.setCellValue("STU ID");
			      cell = row.createCell(1);
			      cell.setCellValue("FULL NAME");
			      cell = row.createCell(2);
			      cell.setCellValue("GENDER");
			      cell = row.createCell(3);
			      cell.setCellValue("SUBJECT DETAILS");
			      cell = row.createCell(4);
			      cell.setCellValue("POINT");
			      cell = row.createCell(5);
			      cell.setCellValue("DIVISION");
			     
			 
			      
			      int i = 8;

			      while(rs.next()&& rs1.next()) {
			         row = spreadsheet.createRow(i);
			         cell = row.createCell(0);
			         cell.setCellValue(rs.getString("id"));
			         cell = row.createCell(1);
			         cell.setCellValue(rs1.getString("first")+ "  " +rs1.getString("last"));
			         cell = row.createCell(2);
			         cell.setCellValue(rs1.getString("gender"));
			         cell = row.createCell(4);
			         cell.setCellValue(rs.getString("point"));
			         
			         if((rs1.getString("combi").matches("PCM"))){
			           	   String phy=rs.getString("phy");
			           	   String gphy=rs.getString("gphy");
			           	   String che=rs.getString("che");
			           	   String gche=rs.getString("gche");
			           	   String math=rs.getString("math");
			           	   String gmath=rs.getString("gmath");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" PHY:"+phy+" "+gphy+" CHE:"+che+" "+gche+" MATH:"+math+" "+gmath);
				         
			         i++;
			      }
			         
			         if((rs1.getString("combi").matches("PCB"))){
			           	   String phy=rs.getString("phy");
			           	   String gphy=rs.getString("gphy");
			           	   String che=rs.getString("che");
			           	   String gche=rs.getString("gche");
			           	   String bio=rs.getString("bio");
			           	   String gbio=rs.getString("gbio");
			             	String bam=rs.getString("bam");
			           	   String gbam=rs.getString("gbam");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" PHY:"+phy+" "+gphy+" CHE:"+che+" "+gche+" BIO:"+bio+" "+gbio+" BAM:"+bam+" "+gbam);
				         
			         i++;
			      }
			         if((rs1.getString("combi").matches("PGM"))){
			           	   String phy=rs.getString("phy");
			           	   String gphy=rs.getString("gphy");
			           	   String geo=rs.getString("geo");
			           	   String ggeo=rs.getString("ggeo");
			           	   String math=rs.getString("math");
			           	   String gmath=rs.getString("gmath");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" PHY:"+phy+" "+gphy+" GEO:"+geo+" "+ggeo+" MATH:"+math+" "+gmath);
				         
			         i++;
			      }
			         if((rs1.getString("combi").matches("EGM"))){
			           	   String ec=rs.getString("ec");
			           	   String gec=rs.getString("gec");
			           	   String geo=rs.getString("geo");
			           	   String ggeo=rs.getString("ggeo");
			           	   String math=rs.getString("math");
			           	   String gmath=rs.getString("gmath");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" ECO:"+ec+" "+gec+" GEO:"+geo+" "+ggeo+" MATH:"+math+" "+gmath);
				         
			         i++;
			      }
			         if((rs1.getString("combi").matches("ECA"))){
			           	   String ec=rs.getString("ec");
			           	   String gec=rs.getString("gec");
			           	   String co=rs.getString("co");
			           	   String gco=rs.getString("gco");
			           	   String aco=rs.getString("aco");
			           	   String gaco=rs.getString("gaco");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			             	String bam=rs.getString("bam");
			           	   String gbam=rs.getString("gbam");
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" ECO:"+ec+" "+gec+" COM:"+co+" "+gco+" ACC:"+aco+" "+gaco+" BAM:"+bam+" "+gbam);
				         
			         i++;
			      }
			         
			         if((rs1.getString("combi").matches("HGE"))){
			           	   String ec=rs.getString("ec");
			           	   String gec=rs.getString("gec");
			           	   String geo=rs.getString("geo");
			           	   String ggeo=rs.getString("ggeo");
			           	   String his=rs.getString("his");
			           	   String ghis=rs.getString("ghis");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			             	String bam=rs.getString("bam");
			           	   String gbam=rs.getString("gbam");
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" HIS:"+his+" "+ghis+" GEO:"+geo+" "+ggeo+" ECO:"+ec+" "+gec+" BAM:"+bam+" "+gbam);
				         
			         i++;
			      }
			         if((rs1.getString("combi").matches("HGL"))){
			           	   String lan=rs.getString("lan");
			           	   String glan=rs.getString("glan");
			           	   String geo=rs.getString("geo");
			           	   String ggeo=rs.getString("ggeo");
			           	   String his=rs.getString("his");
			           	   String ghis=rs.getString("ghis");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			             	
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" HIS:"+his+" "+ghis+" GEO:"+geo+" "+ggeo+" LAN:"+lan+" "+glan);
				         
			         i++;
			      }
			         if((rs1.getString("combi").matches("KLA"))){
			           	   String lan=rs.getString("lan");
			           	   String glan=rs.getString("glan");
			           	   String kis=rs.getString("kis");
			           	   String gkis=rs.getString("gkis");
			           	   String ara=rs.getString("ara");
			           	   String gara=rs.getString("gara");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			             	
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" KIS:"+kis+" "+gkis+" LAN:"+lan+" "+glan+" ARA:"+ara+" "+gara);
				         
			         i++;
			      }
			         if((rs1.getString("combi").matches("IKA"))){
			           	   String dini=rs.getString("dini");
			           	   String gdini=rs.getString("gdini");
			           	   String kis=rs.getString("kis");
			           	   String gkis=rs.getString("gkis");
			           	   String ara=rs.getString("ara");
			           	   String gara=rs.getString("gara");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			             	
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" ISL:"+dini+" "+gdini+" KIS:"+kis+" "+gkis+" ARA:"+ara+" "+gara);
				         
			         i++;
			      }
			         
			         if((rs1.getString("combi").matches("IKL"))){
			           	   String dini=rs.getString("dini");
			           	   String gdini=rs.getString("gdini");
			           	   String kis=rs.getString("kis");
			           	   String gkis=rs.getString("gkis");
			           	   String lan=rs.getString("lan");
			           	   String glan=rs.getString("glan");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			             	
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" ISL:"+dini+" "+gdini+" KIS:"+kis+" "+gkis+" LAN:"+lan+" "+glan);
				         
			         i++;
			      }
			         
			         
			         if((rs1.getString("combi").matches("HKA"))){
			           	   String dini=rs.getString("his");
			           	   String gdini=rs.getString("ghis");
			           	   String kis=rs.getString("kis");
			           	   String gkis=rs.getString("gkis");
			           	   String ara=rs.getString("ara");
			           	   String gara=rs.getString("gara");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			             	
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" HIS:"+dini+" "+gdini+" KIS:"+kis+" "+gkis+" ARA:"+ara+" "+gara);
				         
			         i++;
			      }
			         
			         
			         if((rs1.getString("combi").matches("HKL"))){
			           	   String lan=rs.getString("lan");
			           	   String glan=rs.getString("glan");
			           	   String kis=rs.getString("kis");
			           	   String gkis=rs.getString("gkis");
			           	   String his=rs.getString("his");
			           	   String ghis=rs.getString("ghis");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			             	
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" HIS:"+his+" "+ghis+" KIS:"+kis+" "+gkis+" LAN:"+lan+" "+glan);
				         
			         i++;
			      }  if((rs1.getString("combi").matches("GKL"))){
		           	   String lan=rs.getString("lan");
		           	   String glan=rs.getString("glan");
		           	   String kis=rs.getString("kis");
		           	   String gkis=rs.getString("gkis");
		           	   String geo=rs.getString("geo");
		           	   String ggeo=rs.getString("ggeo");
		           	   String gs=rs.getString("gs");
		           	   String ggs=rs.getString("ggs");
		             	
		              cell = row.createCell(3);
			          cell.setCellValue("GS:"+gs+" "+ggs+" GEO:"+geo+" "+ggeo+" KIS:"+kis+" "+gkis+" LAN:"+lan+" "+glan);
			         
		         i++;
		      }
			         if((rs1.getString("combi").matches("HGK"))){
			           	   String kis=rs.getString("kis");
			           	   String gkis=rs.getString("gkis");
			           	   String geo=rs.getString("geo");
			           	   String ggeo=rs.getString("ggeo");
			           	   String his=rs.getString("his");
			           	   String ghis=rs.getString("ghis");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			             	
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" HIS:"+his+" "+ghis+" GEO:"+geo+" "+ggeo+" KIS:"+kis+" "+gkis);
				         
			         i++;
			      }
			     
			         
			         

			         if((rs1.getString("combi").matches("CBG"))){
			           	   String geo=rs.getString("geo");
			           	   String ggeo=rs.getString("ggeo");
			           	   String che=rs.getString("che");
			           	   String gche=rs.getString("gche");
			           	   String bio=rs.getString("bio");
			           	   String gbio=rs.getString("gbio");
			             	String bam=rs.getString("bam");
			           	   String gbam=rs.getString("gbam");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" CHE:"+che+" "+gche+" BIO:"+bio+" "+gbio+" GEO:"+geo+" "+ggeo+" BAM:"+bam+" "+gbam);
				         
			         i++;
			      }
			         
			         if(rs.getString("point").matches("Inc")) {
			    			p="Inc";//count++;
			    		}else {
			    			int mark=Integer.parseInt(rs.getString("point"));
				    		
				    		if(mark>=3 && mark<=9) {
				    			p="I";//count1++;
				    		}else if(mark>=10 && mark<=12) {
				    			p="II";//count2++;
				    		}else if(mark>=13 && mark<=17) {
				    			p="III";//count3++;
				    		}
				    		else if(mark>=18 && mark<=19) {
				    			p="IV";//count4++;
				    		}else if(mark>=20 && mark<=21) {
				    			p="O";//count0++;
			    		}
			    		
			    		}
			          cell = row.createCell(5);
			          cell.setCellValue(p);
			          
			         
			    					
	              }
			      JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
			      FileOutputStream out = new FileOutputStream(new File(""+ct.getSelectedItem().toString().replaceAll("'", "''")+".xlsx"));
			      workbook.write(out);
			      Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+ct.getSelectedItem().toString().replaceAll("'", "''")+".xlsx");
			      out.close();
				
				
				
			}else {
				
				JOptionPane.showMessageDialog(null, "No user with that Record !");
			}
				
			
		      
	} else {
		JOptionPane.showMessageDialog(null, "Can't Accept Empty Value !");
	}
		      
}
		      
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}  finally {
				
				try {
					rs.close();
					ps.close();
					
					
				}catch(Exception ee) {
					
				}
				
			}
           

		}
		});
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	expo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				
				

int result = JOptionPane.showConfirmDialog(null, panel, "Select ",
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
	
if(result==JOptionPane.OK_OPTION){

	if(sch.getSelectedItem() != null &&!((String) sch.getSelectedItem()).trim().isEmpty() && !((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty()) {
		
	    	String count="select count(id) from mark00  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+sch.getSelectedItem().toString()+"' ";
			ps=con.prepareStatement(count);
			ResultSet rss=ps.executeQuery();
			
			String sqqq="select point from mark00  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+sch.getSelectedItem().toString()+"'";
	    	ps=con.prepareStatement(sqqq);
	    	rs=ps.executeQuery();
			

	    	    int count1=0,count2=0,count3=0,count4=0,count0=0,count5=0;
		
	    	
			
			int nam=Integer.parseInt(rss.getString("count(id)"));
			if(nam !=0) {
				
				
				while(rs.next()) {
		    		
		    		if(rs.getString("point").matches("Inc")) {
		    			count5++;
		    			
		    		}else {
		    			int mark=Integer.parseInt(rs.getString("point"));
			    		
			    		if(mark>=3 && mark<=9) {
			    			count1++;
			    		}else if(mark>=10 && mark<=12) {
			    			count2=count2+1;
			    		}else if(mark>=13 && mark<=17) {
			    			count3++;
			    		}
			    		else if(mark>=18 && mark<=19) {
			    			count4++;
			    		}else if(mark>=20 && mark<=21) {
			    			count0++;
			    			
			    		
			    		
			    		
			    		}
		    
			    		
		    		}
		    		}
				    String sqq="select count(id) from mark00  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  and sch='"+sch.getSelectedItem().toString()+"'";
	     			ps=con.prepareStatement(sqq);
	     			rs=ps.executeQuery();
	     			
	     			
	     			
	     			String sum=rss.getString("count(id)");
	     			String s=String.format(" %s","TOTAL STUDENTS="+sum+":  DIV I="+count1+":  DIV II="+count2+":  DIV III="+count3+":  DIV IV="+count4+":  DIV O="+count0+":  INCOMPLETE="+count5);
	     			
				
				  String p="";
				  ps = con.prepareStatement("select * from mark00 where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'and sch='"+sch.getSelectedItem().toString()+"' ");
			      rs=ps.executeQuery(); 
			      XSSFWorkbook workbook = new XSSFWorkbook(); 
			      XSSFSheet spreadsheet = workbook.createSheet("STUDENT'S REPORT");
			      
			     
			      ps = con.prepareStatement("select * from user where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+sch.getSelectedItem().toString()+"'");
			      ResultSet rs1=ps.executeQuery(); 
			      
			      XSSFRow row = spreadsheet.createRow(1);
			      XSSFCell cell = (XSSFCell) row.createCell((short) 1);
			      
			     
			      XSSFCellStyle style3 = workbook.createCellStyle();
			      XSSFFont font = workbook.createFont();
			      font.setFontHeightInPoints((short) 20);
			      font.setFontName("VERDANA");
			      font.setBold(true);
			      XSSFCellStyle style = workbook.createCellStyle();
			      style.setFont(font);
			  
			      cell.setCellStyle(style3);
			      row = spreadsheet.createRow(1);
			      cell = (XSSFCell) row.createCell(1);
			      cell.setCellValue("             "+school+" SECONDARY SCHOOL");
			      cell.setCellStyle(style);
			   
			      
   
			      
			      XSSFFont font1 = workbook.createFont();
			      font1.setFontHeightInPoints((short) 12);
			      font1.setFontName("VERDANA");
			     // font1.setBold(true);
			      XSSFCellStyle style1 = workbook.createCellStyle();
			      style1.setFont(font1);
			  
			  
			     // cell.setCellStyle(style3);
			      row = spreadsheet.createRow(4);
			      cell = (XSSFCell) row.createCell(0);
			      cell.setCellValue(" "+et.getSelectedItem().toString()+"  EXAM RESULT"+"                               "+ct.getSelectedItem().toString()+" - "+ac.getSelectedItem().toString());
			      cell.setCellStyle(style1);
			      
			      XSSFFont font2 = workbook.createFont();
			      font2.setFontHeightInPoints((short) 10);
			      font2.setFontName("VERDANA");
			     // font1.setBold(true);
			      XSSFCellStyle style2 = workbook.createCellStyle();
			      style2.setFont(font2);
			  
			  
			     // cell.setCellStyle(style3);
			      row = spreadsheet.createRow(5);
			      cell = (XSSFCell) row.createCell(0);
			      cell.setCellValue(s);
			      cell.setCellStyle(style2);
			    
			     
			      
			    	        
			      row = spreadsheet.createRow(7);
			      cell = row.createCell(0);
			      cell.setCellValue("STU ID");
			      cell = row.createCell(1);
			      cell.setCellValue("FULL NAME");
			      cell = row.createCell(2);
			      cell.setCellValue("GENDER");
			      cell = row.createCell(3);
			      cell.setCellValue("SUBJECT DETAILS");
			      cell = row.createCell(4);
			      cell.setCellValue("POINT");
			      cell = row.createCell(5);
			      cell.setCellValue("DIVISION");
			     
			 
			      
			      int i = 8;

			      while(rs.next()) {
			         row = spreadsheet.createRow(i);
			         cell = row.createCell(0);
			         cell.setCellValue(rs.getString("id"));
			         cell = row.createCell(1);
			         cell.setCellValue(rs.getString("first")+ "  " +rs.getString("last"));
			         cell = row.createCell(2);
			         cell.setCellValue(rs.getString("gender"));
			         cell = row.createCell(4);
			         cell.setCellValue(rs.getString("point"));
			         
			         if((rs.getString("combi").matches("PCM"))){
			           	   String phy=rs.getString("phy");
			           	   String gphy=rs.getString("gphy");
			           	   String che=rs.getString("che");
			           	   String gche=rs.getString("gche");
			           	   String math=rs.getString("math");
			           	   String gmath=rs.getString("gmath");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" PHY:"+phy+" "+gphy+" CHE:"+che+" "+gche+" MATH:"+math+" "+gmath);
				         
			         i++;
			      }
			         
			         if((rs.getString("combi").matches("PCB"))){
			           	   String phy=rs.getString("phy");
			           	   String gphy=rs.getString("gphy");
			           	   String che=rs.getString("che");
			           	   String gche=rs.getString("gche");
			           	   String bio=rs.getString("bio");
			           	   String gbio=rs.getString("gbio");
			             	String bam=rs.getString("bam");
			           	   String gbam=rs.getString("gbam");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" PHY:"+phy+" "+gphy+" CHE:"+che+" "+gche+" BIO:"+bio+" "+gbio+" BAM:"+bam+" "+gbam);
				         
			         i++;
			      }
			         if((rs.getString("combi").matches("PGM"))){
			           	   String phy=rs.getString("phy");
			           	   String gphy=rs.getString("gphy");
			           	   String geo=rs.getString("geo");
			           	   String ggeo=rs.getString("ggeo");
			           	   String math=rs.getString("math");
			           	   String gmath=rs.getString("gmath");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" PHY:"+phy+" "+gphy+" GEO:"+geo+" "+ggeo+" MATH:"+math+" "+gmath);
				         
			         i++;
			      }
			         if((rs.getString("combi").matches("EGM"))){
			           	   String ec=rs.getString("ec");
			           	   String gec=rs.getString("gec");
			           	   String geo=rs.getString("geo");
			           	   String ggeo=rs.getString("ggeo");
			           	   String math=rs.getString("math");
			           	   String gmath=rs.getString("gmath");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" ECO:"+ec+" "+gec+" GEO:"+geo+" "+ggeo+" MATH:"+math+" "+gmath);
				         
			         i++;
			      }
			         if((rs.getString("combi").matches("ECA"))){
			           	   String ec=rs.getString("ec");
			           	   String gec=rs.getString("gec");
			           	   String co=rs.getString("co");
			           	   String gco=rs.getString("gco");
			           	   String aco=rs.getString("aco");
			           	   String gaco=rs.getString("gaco");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			             	String bam=rs.getString("bam");
			           	   String gbam=rs.getString("gbam");
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" ECO:"+ec+" "+gec+" COM:"+co+" "+gco+" ACC:"+aco+" "+gaco+" BAM:"+bam+" "+gbam);
				         
			         i++;
			      }
			         
			         if((rs.getString("combi").matches("HGE"))){
			           	   String ec=rs.getString("ec");
			           	   String gec=rs.getString("gec");
			           	   String geo=rs.getString("geo");
			           	   String ggeo=rs.getString("ggeo");
			           	   String his=rs.getString("his");
			           	   String ghis=rs.getString("ghis");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			             	String bam=rs.getString("bam");
			           	   String gbam=rs.getString("gbam");
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" HIS:"+his+" "+ghis+" GEO:"+geo+" "+ggeo+" ECO:"+ec+" "+gec+" BAM:"+bam+" "+gbam);
				         
			         i++;
			      }
			         if((rs.getString("combi").matches("HGL"))){
			           	   String lan=rs.getString("lan");
			           	   String glan=rs.getString("glan");
			           	   String geo=rs.getString("geo");
			           	   String ggeo=rs.getString("ggeo");
			           	   String his=rs.getString("his");
			           	   String ghis=rs.getString("ghis");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			             	
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" HIS:"+his+" "+ghis+" GEO:"+geo+" "+ggeo+" LAN:"+lan+" "+glan);
				         
			         i++;
			      }
			         if((rs.getString("combi").matches("KLA"))){
			           	   String lan=rs.getString("lan");
			           	   String glan=rs.getString("glan");
			           	   String kis=rs.getString("kis");
			           	   String gkis=rs.getString("gkis");
			           	   String ara=rs.getString("ara");
			           	   String gara=rs.getString("gara");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			             	
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" KIS:"+kis+" "+gkis+" LAN:"+lan+" "+glan+" ARA:"+ara+" "+gara);
				         
			         i++;
			      }
			         if((rs.getString("combi").matches("IKA"))){
			           	   String dini=rs.getString("dini");
			           	   String gdini=rs.getString("gdini");
			           	   String kis=rs.getString("kis");
			           	   String gkis=rs.getString("gkis");
			           	   String ara=rs.getString("ara");
			           	   String gara=rs.getString("gara");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			             	
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" ISL:"+dini+" "+gdini+" KIS:"+kis+" "+gkis+" ARA:"+ara+" "+gara);
				         
			         i++;
			      }
			         
			         if((rs.getString("combi").matches("IKL"))){
			           	   String dini=rs.getString("dini");
			           	   String gdini=rs.getString("gdini");
			           	   String kis=rs.getString("kis");
			           	   String gkis=rs.getString("gkis");
			           	   String lan=rs.getString("lan");
			           	   String glan=rs.getString("glan");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			             	
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" ISL:"+dini+" "+gdini+" KIS:"+kis+" "+gkis+" LAN:"+lan+" "+glan);
				         
			         i++;
			      }
			         
			         
			         if((rs.getString("combi").matches("HKA"))){
			           	   String dini=rs.getString("his");
			           	   String gdini=rs.getString("ghis");
			           	   String kis=rs.getString("kis");
			           	   String gkis=rs.getString("gkis");
			           	   String ara=rs.getString("ara");
			           	   String gara=rs.getString("gara");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			             	
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" HIS:"+dini+" "+gdini+" KIS:"+kis+" "+gkis+" ARA:"+ara+" "+gara);
				         
			         i++;
			      }
			         
			         
			         if((rs.getString("combi").matches("HKL"))){
			           	   String lan=rs.getString("lan");
			           	   String glan=rs.getString("glan");
			           	   String kis=rs.getString("kis");
			           	   String gkis=rs.getString("gkis");
			           	   String his=rs.getString("his");
			           	   String ghis=rs.getString("ghis");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			             	
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" HIS:"+his+" "+ghis+" KIS:"+kis+" "+gkis+" LAN:"+lan+" "+glan);
				         
			         i++;
			      }  if((rs.getString("combi").matches("GKL"))){
		           	   String lan=rs.getString("lan");
		           	   String glan=rs.getString("glan");
		           	   String kis=rs.getString("kis");
		           	   String gkis=rs.getString("gkis");
		           	   String geo=rs.getString("geo");
		           	   String ggeo=rs.getString("ggeo");
		           	   String gs=rs.getString("gs");
		           	   String ggs=rs.getString("ggs");
		             	
		              cell = row.createCell(3);
			          cell.setCellValue("GS:"+gs+" "+ggs+" GEO:"+geo+" "+ggeo+" KIS:"+kis+" "+gkis+" LAN:"+lan+" "+glan);
			         
		         i++;
		      }
			         if((rs.getString("combi").matches("HGK"))){
			           	   String kis=rs.getString("kis");
			           	   String gkis=rs.getString("gkis");
			           	   String geo=rs.getString("geo");
			           	   String ggeo=rs.getString("ggeo");
			           	   String his=rs.getString("his");
			           	   String ghis=rs.getString("ghis");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			             	
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" HIS:"+his+" "+ghis+" GEO:"+geo+" "+ggeo+" KIS:"+kis+" "+gkis);
				         
			         i++;
			      }
			     
			         
			         

			         if((rs.getString("combi").matches("CBG"))){
			           	   String geo=rs.getString("geo");
			           	   String ggeo=rs.getString("ggeo");
			           	   String che=rs.getString("che");
			           	   String gche=rs.getString("gche");
			           	   String bio=rs.getString("bio");
			           	   String gbio=rs.getString("gbio");
			             	String bam=rs.getString("bam");
			           	   String gbam=rs.getString("gbam");
			           	   String gs=rs.getString("gs");
			           	   String ggs=rs.getString("ggs");
			              cell = row.createCell(3);
				          cell.setCellValue("GS:"+gs+" "+ggs+" CHE:"+che+" "+gche+" BIO:"+bio+" "+gbio+" GEO:"+geo+" "+ggeo+" BAM:"+bam+" "+gbam);
				         
			         i++;
			      }
			         
			         if(rs.getString("point").matches("Inc")) {
			    			p="Inc";//count++;
			    		}else {
			    			int mark=Integer.parseInt(rs.getString("point"));
				    		
				    		if(mark>=3 && mark<=9) {
				    			p="I";//count1++;
				    		}else if(mark>=10 && mark<=12) {
				    			p="II";//count2++;
				    		}else if(mark>=13 && mark<=17) {
				    			p="III";//count3++;
				    		}
				    		else if(mark>=18 && mark<=19) {
				    			p="IV";//count4++;
				    		}else if(mark>=20 && mark<=21) {
				    			p="O";//count0++;
			    		}
			    		
			    		}
			          cell = row.createCell(5);
			          cell.setCellValue(p);
			          
			         
			    					
	              }
			      JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
			      FileOutputStream out = new FileOutputStream(new File(""+ct.getSelectedItem().toString().replaceAll("'", "''")+".xlsx"));
			      workbook.write(out);
			      Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+ct.getSelectedItem().toString().replaceAll("'", "''")+".xlsx");
			      out.close();
				
				
				
			}else {
				
				JOptionPane.showMessageDialog(null, "No user with that Record !");
			}
				
			
		      
	} else {
		JOptionPane.showMessageDialog(null, "Can't Accept Empty Value !");
	}
		      
}
		      
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}  finally {
				
				try {
					rs.close();
					ps.close();
					
					
				}catch(Exception ee) {
					
				}
				
			}
           

		}
		});

	
	cla.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			
			
			int result = JOptionPane.showConfirmDialog(null, panel, "Select ",
			        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
			
			if(result==JOptionPane.OK_OPTION){
				
				if(sch.getSelectedItem() != null &&!((String) sch.getSelectedItem()).trim().isEmpty() &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty()) {
					
				

					Document document=new Document(PageSize.A4.rotate());
					 Calendar timer=Calendar.getInstance();
					 timer.getTime();
					 SimpleDateFormat df= new SimpleDateFormat("hh:mm:ss a");
					 SimpleDateFormat dt=new SimpleDateFormat("MMM dd,  yyyy");
					 
				
				 
				try {

					

     				int count1=0,count2=0,count3=0,count4=0,count0=0,count5=0;
			    	int ppa=0,ppb=0,ppc=0,ppd=0,ppe=0,pps=0,ppf=0;
					int ggga=0,gggb=0,gggc=0,gggd=0,ggge=0,gggs=0,gggf=0;
					int cca=0,ccb=0,ccc=0,ccd=0,cce=0,ccs=0,ccf=0;
					int bba=0,bbb=0,bbc=0,bbd=0,bbe=0,bbs=0,bbf=0;
					int mma=0,mmb=0,mmc=0,mmd=0,mme=0,mms=0,mmf=0;
					int dda=0,ddb=0,ddc=0,ddd=0,dde=0,dds=0,ddf=0;
					int kka=0,kkb=0,kkc=0,kkd=0,kke=0,kks=0,kkf=0;
					int ba=0,bb=0,bc=0,bd=0,be=0,bs=0,bf=0;
					int ca=0,cb=0,cc=0,cd=0,ce=0,cs=0,cf=0;
					int za=0,zb=0,zc=0,zd=0,ze=0,zs=0,zf=0;
					int wa=0,wb=0,wc=0,wd=0,we=0,ws=0,wf=0;
					int ya=0,yb=0,yc=0,yd=0,ye=0,ys=0,yf=0;
					int ua=0,ub=0,uc=0,ud=0,ue=0,us=0,uf=0;
					int sa=0,sb=0,sc=0,sd=0,se=0,ss=0,sf=0;
					int xa=0,xb=0,xc=0,xd=0,xe=0,xs=0,xf=0;
					
			    	String sql="select * from mark where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+sch.getSelectedItem().toString()+"' ";
			    	ps=con.prepareStatement(sql);
			    	ResultSet rs1=ps.executeQuery();
			    	
			    	String sq="select * from user where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+sch.getSelectedItem().toString()+"' ";
			    	ps=con.prepareStatement(sq);
			    	ResultSet rs2=ps.executeQuery();
			    	String p="";
			    	
			    	String sqqq="select point from mark  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+sch.getSelectedItem().toString()+"'";
			    	ps=con.prepareStatement(sqqq);
			    	rs=ps.executeQuery();
			    	
			    	String count="select count(id) from mark  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'   and sch='"+sch.getSelectedItem().toString()+"'";
	     			ps=con.prepareStatement(count);
	     			ResultSet rss=ps.executeQuery();
	     			
	     			String sg="select * from mark  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  and sch='"+sch.getSelectedItem().toString()+"'";
				    ps=con.prepareStatement(sg);
				    ResultSet grs=ps.executeQuery();
				    	

						
	     				
				    	
				    	
	     			int nam=Integer.parseInt(rss.getString("count(id)"));
	     			if(nam !=0) {
	     				
	     				 PdfPTable mudi = new PdfPTable(36);
					     PdfPCell cell=new PdfPCell(new Phrase(""));
					     cell.setColspan(10);
					     cell.setHorizontalAlignment(Element.ALIGN_CENTER);
					     cell.setBackgroundColor(new BaseColor(240,230,140));
					     mudi.addCell(cell);
					     mudi.setWidths(new int[]{ 1, 1, 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
						    mudi.setWidthPercentage(105);					    
						    cell.setColspan(36);
						    cell.setHorizontalAlignment(1);
						    mudi.addCell(cell);
						    
						    

						     
							   cell = new PdfPCell(new Phrase("FULL NAME",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(9);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("SEX",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("G/STUDIES",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(3);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("PHYSICS",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(3);cell.setBackgroundColor(new BaseColor(255,255,224));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("CHEMISTRY",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(3);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("ADV/MATH",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(3);cell.setBackgroundColor(new BaseColor(255,255,224));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("BIOLOGY",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(3);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("GEO",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(3);cell.setBackgroundColor(new BaseColor(255,255,224));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("BAM",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(3);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							   
							   
							    cell = new PdfPCell(new Phrase("POINT",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DIV",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    
							  
							    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 9,Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(255,255,224));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(255,255,224));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    

							    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(255,255,224));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							   
							   
					     
						     PdfPTable mudi1 = new PdfPTable(1);
						     PdfPCell cell1=new PdfPCell(new Phrase("."));
						     cell1.setColspan(4);
						     cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
						     cell1.setBackgroundColor(new BaseColor(255,250,205));
						     mudi1.addCell(cell1);
						     
						     
						     PdfPTable mudi2 = new PdfPTable(1);
						     PdfPCell cell2=new PdfPCell(new Phrase("."));
						     cell2.setColspan(4);
						     cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
						     cell2.setBackgroundColor(new BaseColor(240,230,140));
						     mudi2.addCell(cell2);
						     mudi2.setHorizontalAlignment(1);
						     
						     PdfPTable mudi23 = new PdfPTable(1);
						     PdfPCell cell23=new PdfPCell(new Phrase(""));
						     cell23.setColspan(4);
						     
						     mudi23.addCell(cell23);
						     mudi23.setWidthPercentage(100);
						     Image im=Image.getInstance("other.png");
		      		    	 cell.setBorder(0);
		       		    	 mudi23.addCell(cell23);
		      		    	 mudi23.addCell(im);
		      		    	 
		      		    	mudi1.setWidthPercentage(100);
		      		    	mudi2.setWidthPercentage(100);
		      		    	mudi.setWidthPercentage(100);
						     
                         try {
                        	
						    	 while (grs.next()) {
						    		 
						    		 if(grs.getString("ggs") != null) {
						    			
						                 String mg=grs.getString("ggs");
						   	    		
						   	    		if(mg.matches("A")) {
						   	    	         ggga++;
						   	    		}else if(mg.matches("B")) {
						   			    	   gggb++;
						   			    		}
						   	    		else if(mg.matches("C")) {
						   			    	   gggc++;
						   			    		}
						   	    		else if(mg.matches("D")) {
						   			    	   gggd++;
						   			    		}
						   	    		else if(mg.matches("E")) {
						   			    	   ggge++;
						   			    		}
						   	    		else if(mg.matches("S")) {
						   			    	   gggs++;
						   			    		}
						   	    		else if(mg.matches("F")) {
						   			    	   gggf++;
						   			    		}
							    		
						    		 }
						    		 
						    		 if(grs.getString("gphy") != null) {
							    			
						                 String mg1=grs.getString("gphy");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         ppa++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   ppb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   ppc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   ppd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   ppe++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   pps++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   ppf++;
						   			    		}
							    		
						    		 }
						    		 if(grs.getString("gche") != null) {
							    			
						                 String mg1=grs.getString("gche");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         cca++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   ccb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   ccc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   ccd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   cce++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   ccs++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   ccf++;
						   			    		}
							    		
						    		 }
						    		
						    		 if(grs.getString("gbio") != null) {
							    			
						                 String mg1=grs.getString("gbio");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         bba++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   bbb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   bbc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   bbd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   bbe++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   bbs++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   bbf++;
						   			    		}
							    		
						    		 }
						    		 
						    		 if(grs.getString("gmath") != null) {
							    			
						                 String mg1=grs.getString("gmath");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         mma++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   mmb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   mmc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   mmd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   mme++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   mms++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   mmf++;
						   			    		}
							    		
						    		 }
						    		 
						    		 
						    		 if(grs.getString("ggeo") != null) {
							    			
						                 String mg1=grs.getString("ggeo");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         dda++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   ddb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   ddc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   ddd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   dde++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   dds++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   ddf++;
						   			    		}
							    		
						    		 }
						    		 
						    		 if(grs.getString("gbam") != null) {
							    			
						                 String mg1=grs.getString("gbam");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         kka++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   kkb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   kkc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   kkd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   kke++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   kks++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   kkf++;
						   			    		}
							    		
						    		 }
						    		 
						    		 if(grs.getString("ghis") != null) {
							    			
						                 String mg1=grs.getString("ghis");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         ba++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   bb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   bc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   bd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   be++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   bs++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   bf++;
						   			    		}
							    		
						    		 }
						    		 
						    		 if(grs.getString("gkis") != null) {
							    			
						                 String mg1=grs.getString("gkis");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         ca++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   cb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   cc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   cd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   ce++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   cs++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   cf++;
						   			    		}
							    		
						    		 }
						    		
						    		 if(grs.getString("glan") != null) {
							    			
						                 String mg1=grs.getString("glan");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         za++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   zb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   zc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   zd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   ze++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   zs++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   zf++;
						   			    		}
							    		
						    		 }
						    		 
						    		 if(grs.getString("gara") != null) {
							    			
						                 String mg1=grs.getString("gara");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         wa++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   wb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   wc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   wd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   we++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   ws++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   wf++;
						   			    		}
							    		
						    		 }
						    		
						    		 if(grs.getString("gdini") != null) {
							    			
						                 String mg1=grs.getString("gdini");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         ya++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   yb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   yc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   yd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   ye++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   ys++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   yf++;
						   			    		}
							    		
						    		 }
						    		 if(grs.getString("gec") != null) {
							    			
						                 String mg1=grs.getString("gec");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         ua++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   ub++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   uc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   ud++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   ue++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   us++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   uf++;
						   			    		}
							    		
						    		 }
						    		 if(grs.getString("gco") != null) {
							    			
						                 String mg1=grs.getString("gco");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         sa++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   sb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   sc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   sd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   se++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   ss++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   sf++;
						   			    		}
							    		
						    		 }
						    		 
						    		 if(grs.getString("gaco") != null) {
							    			
						                 String mg1=grs.getString("gaco");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         xa++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   xb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   xc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   xd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   xe++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   xs++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   xf++;
						   			    		}
							    		
						    		 }
						    		
						    		
						    	 }
						    	   String sm=String.format("SUBJECT DETAILS");
									cell2=new PdfPCell(new Phrase(sm));
									cell2.setHorizontalAlignment(1);
									mudi2.setWidthPercentage(50);
						            mudi2.addCell(cell2);
						    	 
						            String s0="*****";
						            cell2=new PdfPCell(new Phrase(s0));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
						            mudi2.addCell(cell2);
						            
						        	 String s=String.format(" %s","G/STUDIES:  A="+ggga+"   B="+gggb+"   C="+gggc+"   D="+gggd+"   E="+ggge+"   S="+gggs+"   F="+gggf);
									cell2=new PdfPCell(new Phrase(s));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((ggga+gggb+gggc+gggd+ggge+gggs+gggf)>0) {
										 mudi2.addCell(cell2);
									}
						           
						            
						            String s1=String.format(" %s","PHYSICS:  A="+ppa+"   B="+ppb+"   C="+ppc+"   D="+ppd+"   E="+ppe+"   S="+pps+"   F="+ppf);
						    		cell2=new PdfPCell(new Phrase(s1));
						    		cell2.setHorizontalAlignment(1);
						    	    cell2.setBorder(0);
						    		mudi2.setWidthPercentage(50);
						    		if((ppa+ppb+ppc+ppd+ppe+pps+ppf)>0) {
						    			 mudi2.addCell(cell2);
						    		}
						          
						           
						           String s2=String.format(" %s","CHEMISTRY:  A="+cca+"   B="+ccb+"   C="+ccc+"   D="+ccd+"   E="+cce+"   S="+ccs+"   F="+ccf);
						    		cell2=new PdfPCell(new Phrase(s2));
						    		cell2.setHorizontalAlignment(1);
						    	   cell2.setBorder(0);
						    		mudi2.setWidthPercentage(50);
						    		if((cca+ccb+ccc+ccd+cce+ccs+ccf)>0) {
						    			  mudi2.addCell(cell2);
						    		}
						         
					    		
						           
						           String s3=String.format(" %s","BIOLOGY:  A="+bba+"   B="+bbb+"   C="+bbc+"   D="+bbd+"   E="+bbe+"   S="+bbs+"   F="+bbf);
						    		cell2=new PdfPCell(new Phrase(s3));
						    		cell2.setHorizontalAlignment(1);
						    	   cell2.setBorder(0);
						    		mudi2.setWidthPercentage(50);
						    		if((bba+bbb+bbc+bbd+bbe+bbs+bbf)>0) {
						    			 mudi2.addCell(cell2);
						    		}
						          
						           
						           String s4=String.format(" %s","ADV/MATH:  A="+mma+"   B="+mmb+"   C="+mmc+"   D="+mmd+"   E="+mme+"   S="+mms+"   F="+mmf);
						    		cell2=new PdfPCell(new Phrase(s4));
						    		cell2.setHorizontalAlignment(1);
						    	   cell2.setBorder(0);
						    		mudi2.setWidthPercentage(50);
						    		if((mma+mmb+mmc+mmd+mme+mms+mmf)>0) {
						    			 mudi2.addCell(cell2);
						    		}
						          
					    		
						           
						           String s5=String.format(" %s","GEOGRAPHY:  A="+dda+"   B="+ddb+"   C="+ddc+"   D="+ddd+"   E="+dde+"   S="+dds+"   F="+ddf);
						    		cell2=new PdfPCell(new Phrase(s5));
						    		cell2.setHorizontalAlignment(1);
						    	 cell2.setBorder(0);
						    		mudi2.setWidthPercentage(50);
						    		if((dda+ddb+ddc+ddd+dde+dds+ddf)>0) {
						    			 mudi2.addCell(cell2);
						    		}
						          
						           
						           String s6=String.format(" %s","BAM:  A="+kka+"   B="+kkb+"   C="+kkc+"   D="+kkd+"   E="+kke+"   S="+kks+"   F="+kkf);
						    		cell2=new PdfPCell(new Phrase(s6));
						    		cell2.setHorizontalAlignment(1);
						    	 cell2.setBorder(0);
						    		mudi2.setWidthPercentage(50);
						    		if((kka+kkb+kkc+kkd+kke+kks+kkf)>0) {
						    			 mudi2.addCell(cell2);
						    		}
						          
						    		
						    		 String s7=String.format(" %s","HISTORY:  A="+ba+"   B="+bb+"   C="+bc+"   D="+bd+"   E="+be+"   S="+bs+"   F="+bf);
							    		cell2=new PdfPCell(new Phrase(s7));
							    		cell2.setHorizontalAlignment(1);
							    	 cell2.setBorder(0);
							    		mudi2.setWidthPercentage(50);
							    		if((ba+bb+bc+bd+be+bs+bf)>0) {
							    			 mudi2.addCell(cell2);
							    		}
							    		
							    		 String s8=String.format(" %s","KISWAHILI:  A="+ca+"   B="+cb+"   C="+cc+"   D="+cd+"   E="+ce+"   S="+cs+"   F="+cf);
								    		cell2=new PdfPCell(new Phrase(s8));
								    		cell2.setHorizontalAlignment(1);
								    	 cell2.setBorder(0);
								    		mudi2.setWidthPercentage(50);
								    		if((ca+cb+cc+cd+ce+cs+cf)>0) {
								    			 mudi2.addCell(cell2);
								    		}
								    		
								    		String s9=String.format(" %s","LANGUAGE:  A="+za+"   B="+zb+"   C="+zc+"   D="+zd+"   E="+ze+"   S="+zs+"   F="+zf);
								    		cell2=new PdfPCell(new Phrase(s9));
								    		cell2.setHorizontalAlignment(1);
								    	 cell2.setBorder(0);
								    		mudi2.setWidthPercentage(50);
								    		if((za+zb+zc+zd+ze+zs+zf)>0) {
								    			 mudi2.addCell(cell2);
								    		}
							          
								    		String s10=String.format(" %s","ARABIC:  A="+wa+"   B="+wb+"   C="+wc+"   D="+wd+"   E="+we+"   S="+ws+"   F="+wf);
								    		cell2=new PdfPCell(new Phrase(s10));
								    		cell2.setHorizontalAlignment(1);
								    	 cell2.setBorder(0);
								    		mudi2.setWidthPercentage(50);
								    		if((wa+wb+wc+wd+we+ws+wf)>0) {
								    			 mudi2.addCell(cell2);
								    		}
								    		
								    		String s11=String.format(" %s","ISLAMIC:  A="+ya+"   B="+yb+"   C="+yc+"   D="+yd+"   E="+ye+"   S="+ys+"   F="+yf);
								    		cell2=new PdfPCell(new Phrase(s11));
								    		cell2.setHorizontalAlignment(1);
								    	    cell2.setBorder(0);
								    		mudi2.setWidthPercentage(50);
								    		if((ya+yb+yc+yd+ye+ys+yf)>0) {
								    			 mudi2.addCell(cell2);
								    		}
								    		
								    		String s12=String.format(" %s","ECONOMICS:  A="+ua+"   B="+ub+"   C="+uc+"   D="+ud+"   E="+ue+"   S="+us+"   F="+uf);
								    		cell2=new PdfPCell(new Phrase(s12));
								    		cell2.setHorizontalAlignment(1);
								    	    cell2.setBorder(0);
								    		mudi2.setWidthPercentage(50);
								    		if((ua+ub+uc+ud+ue+us+uf)>0) {
								    			 mudi2.addCell(cell2);
								    		}
								    		
								    		String s13=String.format(" %s","COMMERCE:  A="+sa+"   B="+sb+"   C="+sc+"   D="+sd+"   E="+se+"   S="+ss+"   F="+sf);
								    		cell2=new PdfPCell(new Phrase(s13));
								    		cell2.setHorizontalAlignment(1);
								    	    cell2.setBorder(0);
								    		mudi2.setWidthPercentage(50);
								    		if((sa+sb+sc+sd+se+ss+sf)>0) {
								    			 mudi2.addCell(cell2);
								    		}
							          
								    		String s14=String.format(" %s","ACCOUNTANCY:  A="+xa+"   B="+xb+"   C="+xc+"   D="+xd+"   E="+xe+"   S="+xs+"   F="+xf);
								    		cell2=new PdfPCell(new Phrase(s14));
								    		cell2.setHorizontalAlignment(1);
								    	    cell2.setBorder(0);
								    		mudi2.setWidthPercentage(50);
								    		if((xa+xb+xc+xd+xe+xs+xf)>0) {
								    			 mudi2.addCell(cell2);
								    		}
							          
					    		
						     }catch(Exception ex) {
						    	 JOptionPane.showMessageDialog(null, ex.getStackTrace());
						     }
							 
                       
						   
						    
						     
						   
						    try {
						    	
						    	try {
						    		
						    	
						    	while(rs.next()) {
						    		
						    		if(rs.getString("point").matches("Inc")) {
						    			count5++;
						    			
						    		}else {
						    			int mark=Integer.parseInt(rs.getString("point"));
							    		
							    		if(mark>=3 && mark<=9) {
							    			count1++;
							    		}else if(mark>=10 && mark<=12) {
							    			count2=count2+1;
							    		}else if(mark>=13 && mark<=17) {
							    			count3++;
							    		}
							    		else if(mark>=18 && mark<=19) {
							    			count4++;
							    		}else if(mark>=20 && mark<=21) {
							    			count0++;
							    			
							    		
							    		
							    		
							    		}
						    
							    		
						    		}
						    		}
						    	
						    	
						    	
						    	}catch(Exception ex){
						    		JOptionPane.showMessageDialog(null, ex.getMessage());
						    	} 
						    	
				   			 DefaultPieDataset pie=new DefaultPieDataset();
				   			 pie.setValue("DIVISION I", new Double(count1));
				   			 pie.setValue("DIVISION II", new Double(count2));
				   			 pie.setValue("DIVISION III", new Double(count3));
				   			 pie.setValue("DIVISION IV", new Double(count4));
				   			 pie.setValue("DIVISION O", new Double(count0));
						
				   			        JFreeChart chart=ChartFactory.createPieChart("Graph Report", pie, true, true,true);
									ChartFrame frame=new ChartFrame("Pie Chart",chart);
									//chart.setBackgroundPaint(new Color(250,250,210));
									chart.getTitle().setPaint(Color.blue);
									chart.getPlot().setBackgroundPaint(Color.WHITE);
									chart.getTitle().setPaint(new Color(50,205,50));
									frame.setSize(750,350);
									chart.setBackgroundPaint(Color.white);
									
									
									 try {
											final ChartRenderingInfo info=new ChartRenderingInfo(new StandardEntityCollection());
							                final File file1=new File("chart.png");
							              
							                ChartUtilities.saveChartAsPNG(file1, chart, 770, 400,info);
											} catch (IOException e) {
												e.printStackTrace();
											} 
						    
						    	
						    	
						    	 try {
						     			String sqq="select count(id) from mark  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+sch.getSelectedItem().toString()+"'  ";
						     			ps=con.prepareStatement(sqq);
						     			rs=ps.executeQuery();
						     			
						     			
						     			
						     			String sum=rs.getString("count(id)");
						     			String s=String.format(" %s"," TOTAL STUDENTS="+sum+":  DIV I="+count1+":  DIV II="+count2+":  DIV III="+count3+":  DIV IV="+count4+":  DIV O="+count0+":  INCOMPLETE="+count5);
						     			cell1=new PdfPCell(new Phrase(s));
						     			cell1.setHorizontalAlignment(1);
						     			mudi.setWidthPercentage(100);mudi1.setWidthPercentage(90);
						                 mudi1.addCell(cell1);
						     			
						     		}catch(Exception ex) {
						     			JOptionPane.showMessageDialog(null, ex.getMessage());
						     		} 

						    	
						    	    while(rs1.next() && rs2.next()) {
						    		
						    		String fn=rs2.getString("first");
						    		String ln=rs2.getString("last");
						    		//int count1=0,count2=0,count3=0,count4=0,count0=0;
						    		if(rs1.getString("point").matches("Inc")) {
						    			p="Inc";//count++;
						    		}else {
						    			int mark=Integer.parseInt(rs1.getString("point"));
							    		
							    		if(mark>=3 && mark<=9) {
							    			p="I";//count1++;
							    		}else if(mark>=10 && mark<=12) {
							    			p="II";//count2++;
							    		}else if(mark>=13 && mark<=17) {
							    			p="III";//count3++;
							    		}
							    		else if(mark>=18 && mark<=19) {
							    			p="IV";//count4++;
							    		}else if(mark>=20 && mark<=21) {
							    			p="O";//count0++;
						    		}
						    		
						    		}
						    							
						    		
						    		String id=rs1.getString("id");
									cell=new PdfPCell(new Phrase(id));
				                   // mudi.addCell(cell);
				                    
						
								   cell = new PdfPCell(new Phrase(fn+"  "+ln,FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
								    cell.setColspan(9);
								    mudi.addCell(cell);
								    
								    String gn=rs2.getString("gender");
								    cell = new PdfPCell(new Phrase(gn,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
								    cell.setColspan(2);
								   cell.setHorizontalAlignment(1);
								    mudi.addCell(cell);
						          	

				                  
				                   
				                   
				                   if((rs2.getString("combi").matches("PCM"))){
				                	   String phy=rs1.getString("phy");
				                	   String gphy=rs1.getString("gphy");
				                	   String che=rs1.getString("che");
				                	   String gche=rs1.getString("gche");
				                	   String math=rs1.getString("math");
				                	   String gmath=rs1.getString("gmath");
				                	   String gs=rs1.getString("gs");
				                	   String ggs=rs1.getString("ggs");
				                	   
				                	   cell = new PdfPCell(new Phrase(gs,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(ggs,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(phy,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gphy,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(che,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gche,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(math,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gmath,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									   
						                   
				                   }
				                   
				                   if((rs2.getString("combi").matches("PCB"))){
				                	   
				                	   
				                	   String phy=rs1.getString("phy");
				                	   String gphy=rs1.getString("gphy");
				                	   String che=rs1.getString("che");
				                	   String gche=rs1.getString("gche");
				                	   String bio=rs1.getString("bio");
				                	   String gbio=rs1.getString("gbio");
				                	   String gs=rs1.getString("gs");
				                	   String ggs=rs1.getString("ggs");
				                	   String bam=rs1.getString("bam");
				                	   String gbam=rs1.getString("gbam");
				                	   
				                	   cell = new PdfPCell(new Phrase(gs,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(ggs,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(phy,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gphy,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(che,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gche,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(bio,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gbio,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									   
									    
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(bam,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gbam,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    
									   
						                   
				                     
				                   }
				                   
				                   if((rs2.getString("combi").matches("PGM"))){
				                	   String phy=rs1.getString("phy");
				                	   String gphy=rs1.getString("gphy");
				                	   String geo=rs1.getString("geo");
				                	   String ggeo=rs1.getString("ggeo");
				                	   String math=rs1.getString("math");
				                	   String gmath=rs1.getString("gmath");
				                	   String gs=rs1.getString("gs");
				                	   String ggs=rs1.getString("ggs");
				                	   
				                	   
				                	   cell = new PdfPCell(new Phrase(gs,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(ggs,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(phy,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gphy,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									   
									    
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase(math,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gmath,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									   
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase(geo,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(ggeo,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									   
						                   
				                      
				                   }
				                  
				                   if((rs2.getString("combi").matches("CBG"))){
				                	   String geo=rs1.getString("geo");
				                	   String ggeo=rs1.getString("ggeo");
				                	   String che=rs1.getString("che");
				                	   String gche=rs1.getString("gche");
				                	   String bio=rs1.getString("bio");
				                	   String gbio=rs1.getString("gbio");
				                	   String gs=rs1.getString("gs");
				                	   String ggs=rs1.getString("ggs");
				                	   String bam=rs1.getString("bam");
				                	   String gbam=rs1.getString("gbam");
				                	   
				                	   cell = new PdfPCell(new Phrase(gs,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(ggs,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    
									    
									    cell = new PdfPCell(new Phrase(che,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gche,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(bio,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gbio,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(geo,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(ggeo,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									  
									    
									    cell = new PdfPCell(new Phrase(bam,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gbam,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    
									   
						                   
				                   }
				                   
				                  String po=rs1.getString("point");

								    cell = new PdfPCell(new Phrase(po,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
								    cell.setColspan(2);
								   cell.setHorizontalAlignment(1);
								    mudi.addCell(cell);

								    cell = new PdfPCell(new Phrase(p,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
								    cell.setColspan(2);
								   cell.setHorizontalAlignment(1);
								    mudi.addCell(cell);
								    mudi.setHeaderRows(4);
				                  
				                  cell=new PdfPCell(new Phrase(""));
			                      
						    		
						    	}
						    	
						    }catch(Exception ex) {
						    	JOptionPane.showMessageDialog(null, ex.getMessage());
						    } 

//sch.getSelectedItem().toString()
						 PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream(ct.getSelectedItem().toString().replaceAll("'", "''")+".pdf"));
						document.open();
						Image image=Image.getInstance("chart.png");
						Image img=Image.getInstance("barcode.png");
						document.add(mudi23);
						document.add(new Paragraph("                             "+school+" SECONDARY SCHOOL",FontFactory.getFont(FontFactory.TIMES_ROMAN,23,Font.BOLD,new BaseColor(0,0,150))));
						document.add(new Paragraph("                                                            "+et.getSelectedItem().toString()+"  EXAM RESULT",FontFactory.getFont(FontFactory.TIMES_ROMAN,18,Font.BOLD,new BaseColor(0,0,150))));
						document.add(new Paragraph(  "                                                                       " + ct.getSelectedItem().toString()+" - "+ac.getSelectedItem().toString()+"   "+sch.getSelectedItem().toString(),FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD,new BaseColor(0,0,150))));
					//	document.add(new Paragraph(  "                                                                                          " + sch.getSelectedItem().toString()+"",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD,new BaseColor(0,0,150))));
						//document.add(new Paragraph("DATE:              \t\t"+dt.format(timer.getTime())));
						//document.add(new Paragraph("TIME:               \t\t"+df.format(timer.getTime())));
						document.add(new Paragraph("\n"));
						document.add(mudi1);
						document.add(new Paragraph("\n"));
						document.add(mudi);
						document.add(new Paragraph("\n"));
						document.add(mudi2);
						document.add(new Paragraph("\n"));
						document.add(mudi1);
						document.add(new Paragraph("\n"));
						document.add(image);
						document.add(new Paragraph("\n"));
					    document.add(img);
					  //  document.add(new Paragraph("                                                                                                                              "+dt.format(timer.getTime())+"::"+df.format(timer.getTime() )) );
						//document.add(new Paragraph("FIDEL CASTRO SECONDARY SCHOOL                "+et.getSelectedItem().toString()+"  EXAM RESULT                "+ct.getSelectedItem().toString()+" "+ac.getSelectedItem().toString() +"\n"+dt.format(timer.getTime())+"::"+df.format(timer.getTime() )  ) );
						document.close();
						
						 JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
					      Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+ct.getSelectedItem().toString().replaceAll("'", "''")+".pdf");
					      
						
	     				
	     				
	     				
	     			}else {
	     				JOptionPane.showMessageDialog(null, "No user with that Record !");
	     			}
	     			
			
			 
				} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				} 
				finally{
	  	             try{
	  	            	 
	  	                 rs.close();
	  	                 ps.close();
	  	             }catch(Exception ex){
	  	                 ex.getMessage();
	  	             }}
				
				
				
			}else {
				JOptionPane.showMessageDialog(null, "Can't Accept Empty Value !");
			}
				
			}

	
		}

		});
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	clao.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			
			
			int result = JOptionPane.showConfirmDialog(null, panel, "Select ",
			        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
			
			if(result==JOptionPane.OK_OPTION){
				
				if(sch.getSelectedItem() != null &&!((String) sch.getSelectedItem()).trim().isEmpty() &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty()) {
					
				

					Document document=new Document(PageSize.A4.rotate());
					 Calendar timer=Calendar.getInstance();
					 timer.getTime();
					 SimpleDateFormat df= new SimpleDateFormat("hh:mm:ss a");
					 SimpleDateFormat dt=new SimpleDateFormat("MMM dd,  yyyy");
					 
				
				 
				try {

					

     				int count1=0,count2=0,count3=0,count4=0,count0=0,count5=0;
			    	int ppa=0,ppb=0,ppc=0,ppd=0,ppe=0,pps=0,ppf=0;
					int ggga=0,gggb=0,gggc=0,gggd=0,ggge=0,gggs=0,gggf=0;
					int cca=0,ccb=0,ccc=0,ccd=0,cce=0,ccs=0,ccf=0;
					int bba=0,bbb=0,bbc=0,bbd=0,bbe=0,bbs=0,bbf=0;
					int mma=0,mmb=0,mmc=0,mmd=0,mme=0,mms=0,mmf=0;
					int dda=0,ddb=0,ddc=0,ddd=0,dde=0,dds=0,ddf=0;
					int kka=0,kkb=0,kkc=0,kkd=0,kke=0,kks=0,kkf=0;
					int ba=0,bb=0,bc=0,bd=0,be=0,bs=0,bf=0;
					int ca=0,cb=0,cc=0,cd=0,ce=0,cs=0,cf=0;
					int za=0,zb=0,zc=0,zd=0,ze=0,zs=0,zf=0;
					int wa=0,wb=0,wc=0,wd=0,we=0,ws=0,wf=0;
					int ya=0,yb=0,yc=0,yd=0,ye=0,ys=0,yf=0;
					int ua=0,ub=0,uc=0,ud=0,ue=0,us=0,uf=0;
					int sa=0,sb=0,sc=0,sd=0,se=0,ss=0,sf=0;
					int xa=0,xb=0,xc=0,xd=0,xe=0,xs=0,xf=0;
					
			    	String sql="select * from mark00 where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+sch.getSelectedItem().toString()+"' ";
			    	ps=con.prepareStatement(sql);
			    	ResultSet rs1=ps.executeQuery();
			    	
			    	String sq="select * from user where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+sch.getSelectedItem().toString()+"' ";
			    	ps=con.prepareStatement(sq);
			    	ResultSet rs2=ps.executeQuery();
			    	String p="";
			    	
			    	String sqqq="select point from mark00  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+sch.getSelectedItem().toString()+"'";
			    	ps=con.prepareStatement(sqqq);
			    	rs=ps.executeQuery();
			    	
			    	String count="select count(id) from mark00  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'   and sch='"+sch.getSelectedItem().toString()+"'";
	     			ps=con.prepareStatement(count);
	     			ResultSet rss=ps.executeQuery();
	     			
	     			String sg="select * from mark00  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'  and sch='"+sch.getSelectedItem().toString()+"'";
				    ps=con.prepareStatement(sg);
				    ResultSet grs=ps.executeQuery();
				    	

						
	     				
				    	
				    	
	     			int nam=Integer.parseInt(rss.getString("count(id)"));
	     			if(nam !=0) {
	     				
	     				 PdfPTable mudi = new PdfPTable(36);
					     PdfPCell cell=new PdfPCell(new Phrase(""));
					     cell.setColspan(10);
					     cell.setHorizontalAlignment(Element.ALIGN_CENTER);
					     cell.setBackgroundColor(new BaseColor(240,230,140));
					     mudi.addCell(cell);
					     mudi.setWidths(new int[]{ 1, 1, 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
						    mudi.setWidthPercentage(105);					    
						    cell.setColspan(36);
						    cell.setHorizontalAlignment(1);
						    mudi.addCell(cell);
						    
						    

						     
							   cell = new PdfPCell(new Phrase("FULL NAME",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(9);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("SEX",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("G/STUDIES",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(3);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("PHYSICS",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(3);cell.setBackgroundColor(new BaseColor(255,255,224));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("CHEMISTRY",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(3);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("ADV/MATH",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(3);cell.setBackgroundColor(new BaseColor(255,255,224));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("BIOLOGY",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(3);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("GEO",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(3);cell.setBackgroundColor(new BaseColor(255,255,224));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("BAM",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(3);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setRowspan(2);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							   
							   
							    cell = new PdfPCell(new Phrase("POINT",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("DIV",FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
							    cell.setColspan(2);
							    cell.setRowspan(3);
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    
							  
							    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 9,Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(255,255,224));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(255,255,224));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    

							    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(255,255,224));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);cell.setBackgroundColor(new BaseColor(255,255,224));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("M",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(2);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							    cell = new PdfPCell(new Phrase("G",FontFactory.getFont("serif", 9, Font.PLAIN, BaseColor.BLACK)));
							    cell.setColspan(1);cell.setBackgroundColor(new BaseColor(135,206,235));
							    cell.setHorizontalAlignment(1);
							    mudi.addCell(cell);
							   
							   
					     
						     PdfPTable mudi1 = new PdfPTable(1);
						     PdfPCell cell1=new PdfPCell(new Phrase("."));
						     cell1.setColspan(4);
						     cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
						     cell1.setBackgroundColor(new BaseColor(255,250,205));
						     mudi1.addCell(cell1);
						     
						     
						     PdfPTable mudi2 = new PdfPTable(1);
						     PdfPCell cell2=new PdfPCell(new Phrase("."));
						     cell2.setColspan(4);
						     cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
						     cell2.setBackgroundColor(new BaseColor(240,230,140));
						     mudi2.addCell(cell2);
						     mudi2.setHorizontalAlignment(1);
						     
						     PdfPTable mudi23 = new PdfPTable(1);
						     PdfPCell cell23=new PdfPCell(new Phrase(""));
						     cell23.setColspan(4);
						     
						     mudi23.addCell(cell23);
						     mudi23.setWidthPercentage(100);
						     Image im=Image.getInstance("other.png");
		      		    	 cell.setBorder(0);
		       		    	 mudi23.addCell(cell23);
		      		    	 mudi23.addCell(im);
		      		    	 
		      		    	mudi1.setWidthPercentage(100);
		      		    	mudi2.setWidthPercentage(100);
		      		    	mudi.setWidthPercentage(100);
						     
                         try {
                        	
						    	 while (grs.next()) {
						    		 
						    		 if(grs.getString("ggs") != null) {
						    			
						                 String mg=grs.getString("ggs");
						   	    		
						   	    		if(mg.matches("A")) {
						   	    	         ggga++;
						   	    		}else if(mg.matches("B")) {
						   			    	   gggb++;
						   			    		}
						   	    		else if(mg.matches("C")) {
						   			    	   gggc++;
						   			    		}
						   	    		else if(mg.matches("D")) {
						   			    	   gggd++;
						   			    		}
						   	    		else if(mg.matches("E")) {
						   			    	   ggge++;
						   			    		}
						   	    		else if(mg.matches("S")) {
						   			    	   gggs++;
						   			    		}
						   	    		else if(mg.matches("F")) {
						   			    	   gggf++;
						   			    		}
							    		
						    		 }
						    		 
						    		 if(grs.getString("gphy") != null) {
							    			
						                 String mg1=grs.getString("gphy");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         ppa++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   ppb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   ppc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   ppd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   ppe++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   pps++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   ppf++;
						   			    		}
							    		
						    		 }
						    		 if(grs.getString("gche") != null) {
							    			
						                 String mg1=grs.getString("gche");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         cca++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   ccb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   ccc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   ccd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   cce++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   ccs++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   ccf++;
						   			    		}
							    		
						    		 }
						    		
						    		 if(grs.getString("gbio") != null) {
							    			
						                 String mg1=grs.getString("gbio");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         bba++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   bbb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   bbc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   bbd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   bbe++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   bbs++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   bbf++;
						   			    		}
							    		
						    		 }
						    		 
						    		 if(grs.getString("gmath") != null) {
							    			
						                 String mg1=grs.getString("gmath");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         mma++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   mmb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   mmc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   mmd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   mme++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   mms++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   mmf++;
						   			    		}
							    		
						    		 }
						    		 
						    		 
						    		 if(grs.getString("ggeo") != null) {
							    			
						                 String mg1=grs.getString("ggeo");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         dda++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   ddb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   ddc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   ddd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   dde++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   dds++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   ddf++;
						   			    		}
							    		
						    		 }
						    		 
						    		 if(grs.getString("gbam") != null) {
							    			
						                 String mg1=grs.getString("gbam");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         kka++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   kkb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   kkc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   kkd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   kke++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   kks++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   kkf++;
						   			    		}
							    		
						    		 }
						    		 
						    		 if(grs.getString("ghis") != null) {
							    			
						                 String mg1=grs.getString("ghis");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         ba++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   bb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   bc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   bd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   be++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   bs++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   bf++;
						   			    		}
							    		
						    		 }
						    		 
						    		 if(grs.getString("gkis") != null) {
							    			
						                 String mg1=grs.getString("gkis");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         ca++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   cb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   cc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   cd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   ce++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   cs++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   cf++;
						   			    		}
							    		
						    		 }
						    		
						    		 if(grs.getString("glan") != null) {
							    			
						                 String mg1=grs.getString("glan");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         za++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   zb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   zc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   zd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   ze++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   zs++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   zf++;
						   			    		}
							    		
						    		 }
						    		 
						    		 if(grs.getString("gara") != null) {
							    			
						                 String mg1=grs.getString("gara");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         wa++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   wb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   wc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   wd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   we++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   ws++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   wf++;
						   			    		}
							    		
						    		 }
						    		
						    		 if(grs.getString("gdini") != null) {
							    			
						                 String mg1=grs.getString("gdini");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         ya++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   yb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   yc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   yd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   ye++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   ys++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   yf++;
						   			    		}
							    		
						    		 }
						    		 if(grs.getString("gec") != null) {
							    			
						                 String mg1=grs.getString("gec");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         ua++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   ub++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   uc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   ud++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   ue++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   us++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   uf++;
						   			    		}
							    		
						    		 }
						    		 if(grs.getString("gco") != null) {
							    			
						                 String mg1=grs.getString("gco");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         sa++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   sb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   sc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   sd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   se++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   ss++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   sf++;
						   			    		}
							    		
						    		 }
						    		 
						    		 if(grs.getString("gaco") != null) {
							    			
						                 String mg1=grs.getString("gaco");
						   	    		
						   	    		if(mg1.matches("A")) {
						   	    	         xa++;
						   	    		}else if(mg1.matches("B")) {
						   			    	   xb++;
						   			    		}
						   	    		else if(mg1.matches("C")) {
						   			    	   xc++;
						   			    		}
						   	    		else if(mg1.matches("D")) {
						   			    	   xd++;
						   			    		}
						   	    		else if(mg1.matches("E")) {
						   			    	   xe++;
						   			    		}
						   	    		else if(mg1.matches("S")) {
						   			    	   xs++;
						   			    		}
						   	    		else if(mg1.matches("F")) {
						   			    	   xf++;
						   			    		}
							    		
						    		 }
						    		
						    		
						    	 }
						    	   String sm=String.format("SUBJECT DETAILS");
									cell2=new PdfPCell(new Phrase(sm));
									cell2.setHorizontalAlignment(1);
									mudi2.setWidthPercentage(50);
						            mudi2.addCell(cell2);
						    	 
						            String s0="*****";
						            cell2=new PdfPCell(new Phrase(s0));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
						            mudi2.addCell(cell2);
						            
						        	 String s=String.format(" %s","G/STUDIES:  A="+ggga+"   B="+gggb+"   C="+gggc+"   D="+gggd+"   E="+ggge+"   S="+gggs+"   F="+gggf);
									cell2=new PdfPCell(new Phrase(s));
									cell2.setHorizontalAlignment(1);
									 cell2.setBorder(0);
									mudi2.setWidthPercentage(50);
									if((ggga+gggb+gggc+gggd+ggge+gggs+gggf)>0) {
										 mudi2.addCell(cell2);
									}
						           
						            
						            String s1=String.format(" %s","PHYSICS:  A="+ppa+"   B="+ppb+"   C="+ppc+"   D="+ppd+"   E="+ppe+"   S="+pps+"   F="+ppf);
						    		cell2=new PdfPCell(new Phrase(s1));
						    		cell2.setHorizontalAlignment(1);
						    	    cell2.setBorder(0);
						    		mudi2.setWidthPercentage(50);
						    		if((ppa+ppb+ppc+ppd+ppe+pps+ppf)>0) {
						    			 mudi2.addCell(cell2);
						    		}
						          
						           
						           String s2=String.format(" %s","CHEMISTRY:  A="+cca+"   B="+ccb+"   C="+ccc+"   D="+ccd+"   E="+cce+"   S="+ccs+"   F="+ccf);
						    		cell2=new PdfPCell(new Phrase(s2));
						    		cell2.setHorizontalAlignment(1);
						    	   cell2.setBorder(0);
						    		mudi2.setWidthPercentage(50);
						    		if((cca+ccb+ccc+ccd+cce+ccs+ccf)>0) {
						    			  mudi2.addCell(cell2);
						    		}
						         
					    		
						           
						           String s3=String.format(" %s","BIOLOGY:  A="+bba+"   B="+bbb+"   C="+bbc+"   D="+bbd+"   E="+bbe+"   S="+bbs+"   F="+bbf);
						    		cell2=new PdfPCell(new Phrase(s3));
						    		cell2.setHorizontalAlignment(1);
						    	   cell2.setBorder(0);
						    		mudi2.setWidthPercentage(50);
						    		if((bba+bbb+bbc+bbd+bbe+bbs+bbf)>0) {
						    			 mudi2.addCell(cell2);
						    		}
						          
						           
						           String s4=String.format(" %s","ADV/MATH:  A="+mma+"   B="+mmb+"   C="+mmc+"   D="+mmd+"   E="+mme+"   S="+mms+"   F="+mmf);
						    		cell2=new PdfPCell(new Phrase(s4));
						    		cell2.setHorizontalAlignment(1);
						    	   cell2.setBorder(0);
						    		mudi2.setWidthPercentage(50);
						    		if((mma+mmb+mmc+mmd+mme+mms+mmf)>0) {
						    			 mudi2.addCell(cell2);
						    		}
						          
					    		
						           
						           String s5=String.format(" %s","GEOGRAPHY:  A="+dda+"   B="+ddb+"   C="+ddc+"   D="+ddd+"   E="+dde+"   S="+dds+"   F="+ddf);
						    		cell2=new PdfPCell(new Phrase(s5));
						    		cell2.setHorizontalAlignment(1);
						    	 cell2.setBorder(0);
						    		mudi2.setWidthPercentage(50);
						    		if((dda+ddb+ddc+ddd+dde+dds+ddf)>0) {
						    			 mudi2.addCell(cell2);
						    		}
						          
						           
						           String s6=String.format(" %s","BAM:  A="+kka+"   B="+kkb+"   C="+kkc+"   D="+kkd+"   E="+kke+"   S="+kks+"   F="+kkf);
						    		cell2=new PdfPCell(new Phrase(s6));
						    		cell2.setHorizontalAlignment(1);
						    	 cell2.setBorder(0);
						    		mudi2.setWidthPercentage(50);
						    		if((kka+kkb+kkc+kkd+kke+kks+kkf)>0) {
						    			 mudi2.addCell(cell2);
						    		}
						          
						    		
						    		 String s7=String.format(" %s","HISTORY:  A="+ba+"   B="+bb+"   C="+bc+"   D="+bd+"   E="+be+"   S="+bs+"   F="+bf);
							    		cell2=new PdfPCell(new Phrase(s7));
							    		cell2.setHorizontalAlignment(1);
							    	 cell2.setBorder(0);
							    		mudi2.setWidthPercentage(50);
							    		if((ba+bb+bc+bd+be+bs+bf)>0) {
							    			 mudi2.addCell(cell2);
							    		}
							    		
							    		 String s8=String.format(" %s","KISWAHILI:  A="+ca+"   B="+cb+"   C="+cc+"   D="+cd+"   E="+ce+"   S="+cs+"   F="+cf);
								    		cell2=new PdfPCell(new Phrase(s8));
								    		cell2.setHorizontalAlignment(1);
								    	 cell2.setBorder(0);
								    		mudi2.setWidthPercentage(50);
								    		if((ca+cb+cc+cd+ce+cs+cf)>0) {
								    			 mudi2.addCell(cell2);
								    		}
								    		
								    		String s9=String.format(" %s","LANGUAGE:  A="+za+"   B="+zb+"   C="+zc+"   D="+zd+"   E="+ze+"   S="+zs+"   F="+zf);
								    		cell2=new PdfPCell(new Phrase(s9));
								    		cell2.setHorizontalAlignment(1);
								    	 cell2.setBorder(0);
								    		mudi2.setWidthPercentage(50);
								    		if((za+zb+zc+zd+ze+zs+zf)>0) {
								    			 mudi2.addCell(cell2);
								    		}
							          
								    		String s10=String.format(" %s","ARABIC:  A="+wa+"   B="+wb+"   C="+wc+"   D="+wd+"   E="+we+"   S="+ws+"   F="+wf);
								    		cell2=new PdfPCell(new Phrase(s10));
								    		cell2.setHorizontalAlignment(1);
								    	 cell2.setBorder(0);
								    		mudi2.setWidthPercentage(50);
								    		if((wa+wb+wc+wd+we+ws+wf)>0) {
								    			 mudi2.addCell(cell2);
								    		}
								    		
								    		String s11=String.format(" %s","ISLAMIC:  A="+ya+"   B="+yb+"   C="+yc+"   D="+yd+"   E="+ye+"   S="+ys+"   F="+yf);
								    		cell2=new PdfPCell(new Phrase(s11));
								    		cell2.setHorizontalAlignment(1);
								    	    cell2.setBorder(0);
								    		mudi2.setWidthPercentage(50);
								    		if((ya+yb+yc+yd+ye+ys+yf)>0) {
								    			 mudi2.addCell(cell2);
								    		}
								    		
								    		String s12=String.format(" %s","ECONOMICS:  A="+ua+"   B="+ub+"   C="+uc+"   D="+ud+"   E="+ue+"   S="+us+"   F="+uf);
								    		cell2=new PdfPCell(new Phrase(s12));
								    		cell2.setHorizontalAlignment(1);
								    	    cell2.setBorder(0);
								    		mudi2.setWidthPercentage(50);
								    		if((ua+ub+uc+ud+ue+us+uf)>0) {
								    			 mudi2.addCell(cell2);
								    		}
								    		
								    		String s13=String.format(" %s","COMMERCE:  A="+sa+"   B="+sb+"   C="+sc+"   D="+sd+"   E="+se+"   S="+ss+"   F="+sf);
								    		cell2=new PdfPCell(new Phrase(s13));
								    		cell2.setHorizontalAlignment(1);
								    	    cell2.setBorder(0);
								    		mudi2.setWidthPercentage(50);
								    		if((sa+sb+sc+sd+se+ss+sf)>0) {
								    			 mudi2.addCell(cell2);
								    		}
							          
								    		String s14=String.format(" %s","ACCOUNTANCY:  A="+xa+"   B="+xb+"   C="+xc+"   D="+xd+"   E="+xe+"   S="+xs+"   F="+xf);
								    		cell2=new PdfPCell(new Phrase(s14));
								    		cell2.setHorizontalAlignment(1);
								    	    cell2.setBorder(0);
								    		mudi2.setWidthPercentage(50);
								    		if((xa+xb+xc+xd+xe+xs+xf)>0) {
								    			 mudi2.addCell(cell2);
								    		}
							          
					    		
						     }catch(Exception ex) {
						    	 JOptionPane.showMessageDialog(null, ex.getStackTrace());
						     }
							 
                       
						   
						    
						     
						   
						    try {
						    	
						    	try {
						    		
						    	
						    	while(rs.next()) {
						    		
						    		if(rs.getString("point").matches("Inc")) {
						    			count5++;
						    			
						    		}else {
						    			int mark=Integer.parseInt(rs.getString("point"));
							    		
							    		if(mark>=3 && mark<=9) {
							    			count1++;
							    		}else if(mark>=10 && mark<=12) {
							    			count2=count2+1;
							    		}else if(mark>=13 && mark<=17) {
							    			count3++;
							    		}
							    		else if(mark>=18 && mark<=19) {
							    			count4++;
							    		}else if(mark>=20 && mark<=21) {
							    			count0++;
							    			
							    		
							    		
							    		
							    		}
						    
							    		
						    		}
						    		}
						    	
						    	
						    	
						    	}catch(Exception ex){
						    		JOptionPane.showMessageDialog(null, ex.getMessage());
						    	} 
						    	
				   			 DefaultPieDataset pie=new DefaultPieDataset();
				   			 pie.setValue("DIVISION I", new Double(count1));
				   			 pie.setValue("DIVISION II", new Double(count2));
				   			 pie.setValue("DIVISION III", new Double(count3));
				   			 pie.setValue("DIVISION IV", new Double(count4));
				   			 pie.setValue("DIVISION O", new Double(count0));
						
				   			        JFreeChart chart=ChartFactory.createPieChart("Graph Report", pie, true, true,true);
									ChartFrame frame=new ChartFrame("Pie Chart",chart);
									//chart.setBackgroundPaint(new Color(250,250,210));
									chart.getTitle().setPaint(Color.blue);
									chart.getPlot().setBackgroundPaint(Color.WHITE);
									chart.getTitle().setPaint(new Color(50,205,50));
									frame.setSize(750,350);
									chart.setBackgroundPaint(Color.white);
									
									
									 try {
											final ChartRenderingInfo info=new ChartRenderingInfo(new StandardEntityCollection());
							                final File file1=new File("chart.png");
							              
							                ChartUtilities.saveChartAsPNG(file1, chart, 770, 400,info);
											} catch (IOException e) {
												e.printStackTrace();
											} 
						    
						    	
						    	
						    	 try {
						     			String sqq="select count(id) from mark00  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+sch.getSelectedItem().toString()+"'  ";
						     			ps=con.prepareStatement(sqq);
						     			rs=ps.executeQuery();
						     			
						     			
						     			
						     			String sum=rs.getString("count(id)");
						     			String s=String.format(" %s"," TOTAL STUDENTS="+sum+":  DIV I="+count1+":  DIV II="+count2+":  DIV III="+count3+":  DIV IV="+count4+":  DIV O="+count0+":  INCOMPLETE="+count5);
						     			cell1=new PdfPCell(new Phrase(s));
						     			cell1.setHorizontalAlignment(1);
						     			mudi.setWidthPercentage(100);mudi1.setWidthPercentage(90);
						                 mudi1.addCell(cell1);
						     			
						     		}catch(Exception ex) {
						     			JOptionPane.showMessageDialog(null, ex.getMessage());
						     		} 

						    	
						    	    while(rs1.next()) {
						    		
						    		String fn=rs1.getString("first");
						    		String ln=rs1.getString("last");
						    		//int count1=0,count2=0,count3=0,count4=0,count0=0;
						    		if(rs1.getString("point").matches("Inc")) {
						    			p="Inc";//count++;
						    		}else {
						    			int mark=Integer.parseInt(rs1.getString("point"));
							    		
							    		if(mark>=3 && mark<=9) {
							    			p="I";//count1++;
							    		}else if(mark>=10 && mark<=12) {
							    			p="II";//count2++;
							    		}else if(mark>=13 && mark<=17) {
							    			p="III";//count3++;
							    		}
							    		else if(mark>=18 && mark<=19) {
							    			p="IV";//count4++;
							    		}else if(mark>=20 && mark<=21) {
							    			p="O";//count0++;
						    		}
						    		
						    		}
						    							
						    		
						    		String id=rs1.getString("id");
									cell=new PdfPCell(new Phrase(id));
				                   // mudi.addCell(cell);
				                    
						
								   cell = new PdfPCell(new Phrase(fn+"  "+ln,FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
								    cell.setColspan(9);
								    mudi.addCell(cell);
								    
								    String gn=rs1.getString("gender");
								    cell = new PdfPCell(new Phrase(gn,FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK)));
								    cell.setColspan(2);
								   cell.setHorizontalAlignment(1);
								    mudi.addCell(cell);
						          	

				                  
				                   
				                   
				                   if((rs1.getString("combi").matches("PCM"))){
				                	   String phy=rs1.getString("phy");
				                	   String gphy=rs1.getString("gphy");
				                	   String che=rs1.getString("che");
				                	   String gche=rs1.getString("gche");
				                	   String math=rs1.getString("math");
				                	   String gmath=rs1.getString("gmath");
				                	   String gs=rs1.getString("gs");
				                	   String ggs=rs1.getString("ggs");
				                	   
				                	   cell = new PdfPCell(new Phrase(gs,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(ggs,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(phy,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gphy,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(che,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gche,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(math,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gmath,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									   
						                   
				                   }
				                   
				                   if((rs1.getString("combi").matches("PCB"))){
				                	   
				                	   
				                	   String phy=rs1.getString("phy");
				                	   String gphy=rs1.getString("gphy");
				                	   String che=rs1.getString("che");
				                	   String gche=rs1.getString("gche");
				                	   String bio=rs1.getString("bio");
				                	   String gbio=rs1.getString("gbio");
				                	   String gs=rs1.getString("gs");
				                	   String ggs=rs1.getString("ggs");
				                	   String bam=rs1.getString("bam");
				                	   String gbam=rs1.getString("gbam");
				                	   
				                	   cell = new PdfPCell(new Phrase(gs,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(ggs,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(phy,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gphy,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(che,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gche,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(bio,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gbio,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									   
									    
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(bam,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gbam,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    
									   
						                   
				                     
				                   }
				                   
				                   if((rs1.getString("combi").matches("PGM"))){
				                	   String phy=rs1.getString("phy");
				                	   String gphy=rs1.getString("gphy");
				                	   String geo=rs1.getString("geo");
				                	   String ggeo=rs1.getString("ggeo");
				                	   String math=rs1.getString("math");
				                	   String gmath=rs1.getString("gmath");
				                	   String gs=rs1.getString("gs");
				                	   String ggs=rs1.getString("ggs");
				                	   
				                	   
				                	   cell = new PdfPCell(new Phrase(gs,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(ggs,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(phy,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gphy,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									   
									    
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase(math,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gmath,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									   
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase(geo,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(ggeo,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									   
						                   
				                      
				                   }
				                  
				                   if((rs1.getString("combi").matches("CBG"))){
				                	   String geo=rs1.getString("geo");
				                	   String ggeo=rs1.getString("ggeo");
				                	   String che=rs1.getString("che");
				                	   String gche=rs1.getString("gche");
				                	   String bio=rs1.getString("bio");
				                	   String gbio=rs1.getString("gbio");
				                	   String gs=rs1.getString("gs");
				                	   String ggs=rs1.getString("ggs");
				                	   String bam=rs1.getString("bam");
				                	   String gbam=rs1.getString("gbam");
				                	   
				                	   cell = new PdfPCell(new Phrase(gs,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(ggs,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    
									    
									    cell = new PdfPCell(new Phrase(che,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gche,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(""));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(bio,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gbio,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase(geo,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(ggeo,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									  
									    
									    cell = new PdfPCell(new Phrase(bam,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
									    cell.setColspan(2);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gbam,FontFactory.getFont("Arial", 10, Font.PLAIN, BaseColor.BLACK)));
									    cell.setColspan(1);
									   cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    
									   
						                   
				                   }
				                   
				                  String po=rs1.getString("point");

								    cell = new PdfPCell(new Phrase(po,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
								    cell.setColspan(2);
								   cell.setHorizontalAlignment(1);
								    mudi.addCell(cell);

								    cell = new PdfPCell(new Phrase(p,FontFactory.getFont("serif", 10, Font.BOLD, BaseColor.BLACK)));
								    cell.setColspan(2);
								   cell.setHorizontalAlignment(1);
								    mudi.addCell(cell);
								    mudi.setHeaderRows(4);
				                  
				                  cell=new PdfPCell(new Phrase(""));
			                      
						    		
						    	}
						    	
						    }catch(Exception ex) {
						    	JOptionPane.showMessageDialog(null, ex.getMessage());
						    } 


						 PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream(ct.getSelectedItem().toString().replaceAll("'", "''")+".pdf"));
						document.open();
						Image image=Image.getInstance("chart.png");
						Image img=Image.getInstance("barcode.png");
						document.add(mudi23);
						document.add(new Paragraph("                             "+school+" SECONDARY SCHOOL",FontFactory.getFont(FontFactory.TIMES_ROMAN,23,Font.BOLD,new BaseColor(0,0,150))));
						document.add(new Paragraph("                                                            "+et.getSelectedItem().toString()+"  EXAM RESULT",FontFactory.getFont(FontFactory.TIMES_ROMAN,18,Font.BOLD,new BaseColor(0,0,150))));
						document.add(new Paragraph(  "                                                                                   " + ct.getSelectedItem().toString()+" - "+ac.getSelectedItem().toString(),FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD,new BaseColor(0,0,150))));
						//document.add(new Paragraph("DATE:              \t\t"+dt.format(timer.getTime())));
						//document.add(new Paragraph("TIME:               \t\t"+df.format(timer.getTime())));
						document.add(new Paragraph("\n"));
						document.add(mudi1);
						document.add(new Paragraph("\n"));
						document.add(mudi);
						document.add(new Paragraph("\n"));
						document.add(mudi2);
						document.add(new Paragraph("\n"));
						document.add(mudi1);
						document.add(new Paragraph("\n"));
						document.add(image);
						document.add(new Paragraph("\n"));
					    document.add(img);
						//document.add(new Paragraph("                                                                                                                             "+dt.format(timer.getTime())+"::"+df.format(timer.getTime() )) );
						//document.add(new Paragraph("FIDEL CASTRO SECONDARY SCHOOL                "+et.getSelectedItem().toString()+"  EXAM RESULT                "+ct.getSelectedItem().toString()+" "+ac.getSelectedItem().toString() +"\n"+dt.format(timer.getTime())+"::"+df.format(timer.getTime() )  ) );
						document.close();
						
						 JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
					      Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+ct.getSelectedItem().toString().replaceAll("'", "''")+".pdf");
					      
						
	     				
	     				
	     				
	     			}else {
	     				JOptionPane.showMessageDialog(null, "No user with that Record !");
	     			}
	     			
			
			 
				} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				} 
				finally{
	  	             try{
	  	            	 
	  	                 rs.close();
	  	                 ps.close();
	  	             }catch(Exception ex){
	  	                 ex.getMessage();
	  	             }}
				
				
				
			}else {
				JOptionPane.showMessageDialog(null, "Can't Accept Empty Value !");
			}
				
			}

	
		}

	});

	
	about.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent arg0) {
			
			Icon at=new ImageIcon(this.getClass().getResource("/z.png"));
		   JOptionPane.showMessageDialog(null, "\tSTUDENT???S RESULT MANAGEMENT SYSTEM\n**************************************************\nThis Software was Designed and Created by\n MOHAMED YUSUPH.This is not a free Software \nand you are not allowed to re-distribute it without\n the prior permission of the developer\n  \nDeveloper???s Contacts:\n************************\nPhone +255 778 939 544 / +255 675 785 592\nEmail: myusuph2@gmail.com\n \nCOPYRIGHT RESERVED ??2018-2019", "About Software", 0, at);
		
			
			
		}});
	
	b6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			
			    
			if(!t0.getText().isEmpty()||!t0.getText().matches("")) {
				
					Document document=new Document(PageSize.A4);
					
					 PdfPTable mudi = new PdfPTable(3);
				     PdfPCell cell=new PdfPCell(new Phrase(""));
				     cell.setColspan(3);
				     cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				     cell.setBackgroundColor(new BaseColor(255,250,205));
				     mudi.addCell(cell);
				     
				     PdfPTable mudi1 = new PdfPTable(1);
				     PdfPCell cell1=new PdfPCell(new Phrase(""));
				     cell1.setColspan(3);
				     cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
				     cell1.setBackgroundColor(new BaseColor(250,240,230));
				     mudi1.addCell(cell1);
				     
				       // mudi.addCell("SID");
					   
					    mudi.addCell("SUBJECTS");
					    mudi.addCell("MARKS");
					    mudi.addCell("GRADES");
					   
					    
					
					 try {
						 
						 
					 String sq="select * from user where id='"+t0.getText()+"' and exam='"+t6.getSelectedItem().toString()+"' and  class='"+t4.getSelectedItem().toString()+"' and year='"+box5.getSelectedItem().toString()+"' and sch='"+box67.getSelectedItem().toString()+"'  ";
					 ps=con.prepareStatement(sq);
					 rs=ps.executeQuery();
					 
					 
					 }catch(Exception ex) {
						 JOptionPane.showMessageDialog(null, ex.getMessage());
					 } 
					 try {
						 String sqq="select * from mark where id='"+t0.getText()+"'  and exam='"+t6.getSelectedItem().toString()+"' and  class='"+t4.getSelectedItem().toString()+"' and year='"+box5.getSelectedItem().toString()+"' and sch='"+box67.getSelectedItem().toString()+"'";
						 ps=con.prepareStatement(sqq);
						 ResultSet rs1=ps.executeQuery();
						 
							 String sqqq="select * from user where id='"+t0.getText()+"'  and exam='"+t6.getSelectedItem().toString()+"' and  class='"+t4.getSelectedItem().toString()+"' and year='"+box5.getSelectedItem().toString()+"' and sch='"+box67.getSelectedItem().toString()+"'";
							 ps=con.prepareStatement(sqqq);
							 ResultSet rs2=ps.executeQuery();
						 
						 String pt=rs1.getString("point");
						 String gg="";String p ="";
						 
						 
						 if(rs1.getString("point").matches("Inc")) {
				    			p="Inc";//count++;
				    		}else {
				    			int mark=Integer.parseInt(rs1.getString("point"));
					    		
					    		if(mark>=3 && mark<=9) {
					    			p="I";//count1++;
					    		}else if(mark>=10 && mark<=12) {
					    			p="II";//count2++;
					    		}else if(mark>=13 && mark<=17) {
					    			p="III";//count3++;
					    		}
					    		else if(mark>=18 && mark<=19) {
					    			p="IV";//count4++;
					    		}else if(mark>=20 && mark<=21) {
					    			p="O";//count0++;
				    		}
				    		
				    		}
				    							
				    		
				    		
		                   
		                   if((rs2.getString("combi").matches("PCM"))){
		                	   String phy=rs1.getString("phy");
		                	   String gphy=rs1.getString("gphy");
		                	   String che=rs1.getString("che");
		                	   String gche=rs1.getString("gche");
		                	   String math=rs1.getString("math");
		                	   String gmath=rs1.getString("gmath");
		                	   String gs=rs1.getString("gs");
		                	   String ggs=rs1.getString("ggs");
		                	   //JOptionPane.showMessageDialog(null, p);
		                	   cell=new PdfPCell(new Phrase("GEN/STUDIES"));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(gs));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(ggs));
			                      mudi.addCell(cell);
		   					  cell=new PdfPCell(new Phrase("PHYSICS"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(phy));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gphy));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("CHEMISTRY"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(che));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gche));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("ADV/MATHEMATICS"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(math));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gmath));
		                      mudi.addCell(cell);
		                      cell1=new PdfPCell(new Phrase("                          You scored DIVISION "+" "+p+"  "+"of POINT "+"  "+pt));
		                      mudi1.addCell(cell1);
		                      
		                      
		                      
		                   }
		                   if((rs2.getString("combi").matches("PCB"))){
		                	   String phy=rs1.getString("phy");
		                	   String gphy=rs1.getString("gphy");
		                	   String che=rs1.getString("che");
		                	   String gche=rs1.getString("gche");
		                	   String bio=rs1.getString("bio");
		                	   String gbio=rs1.getString("gbio");
		                	   String gs=rs1.getString("gs");
		                	   String ggs=rs1.getString("ggs");
		                	   String bam=rs1.getString("bam");
		                	   String gbam=rs1.getString("gbam");
		                	   //JOptionPane.showMessageDialog(null, p);
		                	   cell=new PdfPCell(new Phrase("GEN/STUDIES"));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(gs));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(ggs));
			                      mudi.addCell(cell);
		   					  cell=new PdfPCell(new Phrase("PHYSICS"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(phy));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gphy));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("CHEMISTRY"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(che));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gche));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("BIOLOGY"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(bio));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gbio));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("BAM"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(bam));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gbam));
		                      mudi.addCell(cell);
		                      cell1=new PdfPCell(new Phrase("                          You scored DIVISION "+" "+p+"  "+"of POINT "+"  "+pt));
		                      mudi1.addCell(cell1);
		                      
		                      
		                   }
		                   
		                   if((rs2.getString("combi").matches("PGM"))){
		                	   String phy=rs1.getString("phy");
		                	   String gphy=rs1.getString("gphy");
		                	   String geo=rs1.getString("geo");
		                	   String ggeo=rs1.getString("ggeo");
		                	   String math=rs1.getString("math");
		                	   String gmath=rs1.getString("gmath");
		                	   String gs=rs1.getString("gs");
		                	   String ggs=rs1.getString("ggs");
		                	   //JOptionPane.showMessageDialog(null, p);
		                	   cell=new PdfPCell(new Phrase("GEN/STUDIES"));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(gs));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(ggs));
			                      mudi.addCell(cell);
		   					  cell=new PdfPCell(new Phrase("PHYSICS"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(phy));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gphy));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("GEOGRAPHY"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(geo));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ggeo));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("ADV/MATHEMATICS"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(math));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gmath));
		                      mudi.addCell(cell);
		                      cell1=new PdfPCell(new Phrase("                          You scored DIVISION "+" "+p+"  "+"of POINT "+"  "+pt));
		                      mudi1.addCell(cell1);
		                      
		                      
		                      
		                   }
		                   if((rs2.getString("combi").matches("EGM"))){
		                	   String ec=rs1.getString("ec");
		                	   String gec=rs1.getString("gec");
		                	   String geo=rs1.getString("geo");
		                	   String ggeo=rs1.getString("ggeo");
		                	   String math=rs1.getString("math");
		                	   String gmath=rs1.getString("gmath");
		                	   String gs=rs1.getString("gs");
		                	   String ggs=rs1.getString("ggs");
		                	   //JOptionPane.showMessageDialog(null, p);
		                	   cell=new PdfPCell(new Phrase("GEN/STUDIES"));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(gs));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(ggs));
			                      mudi.addCell(cell);
		   					  cell=new PdfPCell(new Phrase("ECONOMICS"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ec));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gec));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("GEOGRAPHY"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(geo));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ggeo));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("ADV/MATHEMATICS"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(math));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gmath));
		                      mudi.addCell(cell);
		                      cell1=new PdfPCell(new Phrase("                          You scored DIVISION "+" "+p+"  "+"of POINT "+"  "+pt));
		                      mudi1.addCell(cell1);
		                      
		                      
		                      
		                   } if((rs2.getString("combi").matches("ECA"))){
		                	   String ec=rs1.getString("ec");
		                	   String gec=rs1.getString("gec");
		                	   String co=rs1.getString("co");
		                	   String gco=rs1.getString("gco");
		                	   String aco=rs1.getString("aco");
		                	   String gaco=rs1.getString("gaco");
		                	   String gs=rs1.getString("gs");
		                	   String ggs=rs1.getString("ggs");
		                	   String bam=rs1.getString("bam");
		                	   String gbam=rs1.getString("gbam");
		                	   //JOptionPane.showMessageDialog(null, p);
		                	   cell=new PdfPCell(new Phrase("GEN/STUDIES"));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(gs));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(ggs));
			                      mudi.addCell(cell);
		   					  cell=new PdfPCell(new Phrase("ECONOMICS"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ec));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gec));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("COMMERCE"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(co));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gco));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("ACCOUNTANCY"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(aco));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gaco));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("BAM"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(bam));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gbam));
		                      mudi.addCell(cell);
		                      cell1=new PdfPCell(new Phrase("                          You scored DIVISION "+" "+p+"  "+"of POINT "+"  "+pt));
		                      mudi1.addCell(cell1);
		                      
		                      
		                      
		                   }
		                   if((rs2.getString("combi").matches("HGE"))){
		                	   String ec=rs1.getString("ec");
		                	   String gec=rs1.getString("gec");
		                	   String geo=rs1.getString("geo");
		                	   String ggeo=rs1.getString("ggeo");
		                	   String his=rs1.getString("his");
		                	   String ghis=rs1.getString("ghis");
		                	   String gs=rs1.getString("gs");
		                	   String ggs=rs1.getString("ggs");
		                	   String bam=rs1.getString("bam");
		                	   String gbam=rs1.getString("gbam");
		                	   //JOptionPane.showMessageDialog(null, p);
		                	   cell=new PdfPCell(new Phrase("GEN/STUDIES"));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(gs));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(ggs));
			                      mudi.addCell(cell);
		   					  cell=new PdfPCell(new Phrase("HISTORY"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(his));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ghis));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("GEOGRAPHY"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(geo));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ggeo));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("ECONOMICS"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ec));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gec));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("BAM"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(bam));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gbam));
		                      mudi.addCell(cell);
		                      cell1=new PdfPCell(new Phrase("                          You scored DIVISION "+" "+p+"  "+"of POINT "+"  "+pt));
		                      mudi1.addCell(cell1);
		                      
		                      
		                      
		                   }
		                   if((rs2.getString("combi").matches("HGL"))){
		                	   String ec=rs1.getString("lan");
		                	   String gec=rs1.getString("glan");
		                	   String geo=rs1.getString("geo");
		                	   String ggeo=rs1.getString("ggeo");
		                	   String his=rs1.getString("his");
		                	   String ghis=rs1.getString("ghis");
		                	   String gs=rs1.getString("gs");
		                	   String ggs=rs1.getString("ggs");
		                	   //JOptionPane.showMessageDialog(null, p);
		                	   cell=new PdfPCell(new Phrase("GEN/STUDIES"));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(gs));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(ggs));
			                      mudi.addCell(cell);
		   					  cell=new PdfPCell(new Phrase("HISTORY"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(his));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ghis));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("GEOGRAPHY"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(geo));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ggeo));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("LANGUAGE"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ec));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gec));
		                      mudi.addCell(cell);
		                      cell1=new PdfPCell(new Phrase("                          You scored DIVISION "+" "+p+"  "+"of POINT "+"  "+pt));
		                      mudi1.addCell(cell1);
		                      
		                      
		                      
		                   } 
		                   if((rs2.getString("combi").matches("HKL"))){
		                	   String ec=rs1.getString("lan");
		                	   String gec=rs1.getString("glan");
		                	   String kis=rs1.getString("kis");
		                	   String gkis=rs1.getString("gkis");
		                	   String his=rs1.getString("his");
		                	   String ghis=rs1.getString("ghis");
		                	   String gs=rs1.getString("gs");
		                	   String ggs=rs1.getString("ggs");
		                	   //JOptionPane.showMessageDialog(null, p);
		                	   cell=new PdfPCell(new Phrase("GEN/STUDIES"));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(gs));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(ggs));
			                      mudi.addCell(cell);
		   					  cell=new PdfPCell(new Phrase("HISTORY"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(his));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ghis));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("KISWAHILI"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(kis));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gkis));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("LANGUAGE"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ec));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gec));
		                      mudi.addCell(cell);
		                      cell1=new PdfPCell(new Phrase("                          You scored DIVISION "+" "+p+"  "+"of POINT "+"  "+pt));
		                      mudi1.addCell(cell1);
		                      
		                      
		                      
		                   }  if((rs2.getString("combi").matches("KLA"))){
		                	   String ec=rs1.getString("lan");
		                	   String gec=rs1.getString("glan");
		                	   String kis=rs1.getString("kis");
		                	   String gkis=rs1.getString("gkis");
		                	   String ara=rs1.getString("ara");
		                	   String gara=rs1.getString("gara");
		                	   String gs=rs1.getString("gs");
		                	   String ggs=rs1.getString("ggs");
		                	   //JOptionPane.showMessageDialog(null, p);
		                	   cell=new PdfPCell(new Phrase("GEN/STUDIES"));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(gs));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(ggs));
			                      mudi.addCell(cell);
		   					 
		                      cell=new PdfPCell(new Phrase("KISWAHILI"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(kis));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gkis));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("LANGUAGE"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ec));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gec));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("ARABIC"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ara));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gara));
		                      mudi.addCell(cell);
		                      cell1=new PdfPCell(new Phrase("                          You scored DIVISION "+" "+p+"  "+"of POINT "+"  "+pt));
		                      mudi1.addCell(cell1);
		                      
		                      
		                      
		                   } 
		                   if((rs2.getString("combi").matches("IKL"))){
		                	   String ec=rs1.getString("lan");
		                	   String gec=rs1.getString("glan");
		                	   String kis=rs1.getString("kis");
		                	   String gkis=rs1.getString("gkis");
		                	   String dini=rs1.getString("dini");
		                	   String gdini=rs1.getString("gdini");
		                	   String gs=rs1.getString("gs");
		                	   String ggs=rs1.getString("ggs");
		                	   //JOptionPane.showMessageDialog(null, p);
		                	   cell=new PdfPCell(new Phrase("GEN/STUDIES"));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(gs));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(ggs));
			                      mudi.addCell(cell);
		   					 
		                      cell=new PdfPCell(new Phrase("KISWAHILI"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(kis));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gkis));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("LANGUAGE"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ec));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gec));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("IS/KNOWLEDGE"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(dini));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gdini));
		                      mudi.addCell(cell);
		                      cell1=new PdfPCell(new Phrase("                          You scored DIVISION "+" "+p+"  "+"of POINT "+"  "+pt));
		                      mudi1.addCell(cell1);
		                      
		                      
		                      
		                   } 
		                   if((rs2.getString("combi").matches("IKA"))){
		                	   String ara=rs1.getString("ara");
		                	   String gara=rs1.getString("gara");
		                	   String kis=rs1.getString("kis");
		                	   String gkis=rs1.getString("gkis");
		                	   String dini=rs1.getString("dini");
		                	   String gdini=rs1.getString("gdini");
		                	   String gs=rs1.getString("gs");
		                	   String ggs=rs1.getString("ggs");
		                	   //JOptionPane.showMessageDialog(null, p);
		                	   cell=new PdfPCell(new Phrase("GEN/STUDIES"));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(gs));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(ggs));
			                      mudi.addCell(cell);
		   					 
			                      cell=new PdfPCell(new Phrase("IS/KNOWLEDGE"));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(dini));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(gdini));
			                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("KISWAHILI"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(kis));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gkis));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("ARABIC"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ara));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gara));
		                      mudi.addCell(cell);
		                     
		                      cell1=new PdfPCell(new Phrase("                          You scored DIVISION "+" "+p+"  "+"of POINT "+"  "+pt));
		                      mudi1.addCell(cell1);
		                      
		                      
		                      
		                   } 
		                   if((rs2.getString("combi").matches("HKA"))){
		                	   String ara=rs1.getString("ara");
		                	   String gara=rs1.getString("gara");
		                	   String kis=rs1.getString("kis");
		                	   String gkis=rs1.getString("gkis");
		                	   String his=rs1.getString("his");
		                	   String ghis=rs1.getString("ghis");
		                	   String gs=rs1.getString("gs");
		                	   String ggs=rs1.getString("ggs");
		                	   //JOptionPane.showMessageDialog(null, p);
		                	   cell=new PdfPCell(new Phrase("GEN/STUDIES"));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(gs));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(ggs));
			                      mudi.addCell(cell);
		   					  cell=new PdfPCell(new Phrase("HISTORY"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(his));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ghis));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("KISWAHILI"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(kis));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gkis));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("ARABIC"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ara));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gara));
		                      mudi.addCell(cell);
		                      cell1=new PdfPCell(new Phrase("                          You scored DIVISION "+" "+p+"  "+"of POINT "+"  "+pt));
		                      mudi1.addCell(cell1);
		                      
		                      
		                      
		                   } 
		                   if((rs2.getString("combi").matches("HGK"))){
		                	   String ec=rs1.getString("kis");
		                	   String gec=rs1.getString("gkis");
		                	   String geo=rs1.getString("geo");
		                	   String ggeo=rs1.getString("ggeo");
		                	   String his=rs1.getString("his");
		                	   String ghis=rs1.getString("ghis");
		                	   String gs=rs1.getString("gs");
		                	   String ggs=rs1.getString("ggs");
		                	   //JOptionPane.showMessageDialog(null, p);
		                	   cell=new PdfPCell(new Phrase("GEN/STUDIES"));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(gs));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(ggs));
			                      mudi.addCell(cell);
		   					  cell=new PdfPCell(new Phrase("HISTORY"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(his));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ghis));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("GEOGRAPHY"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(geo));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ggeo));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("KISWAHILI"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ec));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gec));
		                      mudi.addCell(cell);
		                      cell1=new PdfPCell(new Phrase("                          You scored DIVISION "+" "+p+"  "+"of POINT "+"  "+pt));
		                      mudi1.addCell(cell1);
		                      
		                      
		                      
		                   }if((rs2.getString("combi").matches("GKL"))){
		                	   String ec=rs1.getString("kis");
		                	   String gec=rs1.getString("gkis");
		                	   String geo=rs1.getString("geo");
		                	   String ggeo=rs1.getString("ggeo");
		                	   String lan=rs1.getString("lan");
		                	   String glan=rs1.getString("glan");
		                	   String gs=rs1.getString("gs");
		                	   String ggs=rs1.getString("ggs");
		                	   //JOptionPane.showMessageDialog(null, p);
		                	   cell=new PdfPCell(new Phrase("GEN/STUDIES"));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(gs));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(ggs));
			                      mudi.addCell(cell);
		   					  
		                      cell=new PdfPCell(new Phrase("GEOGRAPHY"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(geo));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ggeo));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("KISWAHILI"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ec));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gec));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("LANGUAGE"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(lan));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(glan));
		                      mudi.addCell(cell);
		                      cell1=new PdfPCell(new Phrase("                          You scored DIVISION "+" "+p+"  "+"of POINT "+"  "+pt));
		                      mudi1.addCell(cell1);
		                      
		                      
		                      
		                   }
		                   if((rs2.getString("combi").matches("CBG"))){
		                	   String geo=rs1.getString("geo");
		                	   String ggeo=rs1.getString("ggeo");
		                	   String che=rs1.getString("che");
		                	   String gche=rs1.getString("gche");
		                	   String bio=rs1.getString("bio");
		                	   String gbio=rs1.getString("gbio");
		                	   String gs=rs1.getString("gs");
		                	   String ggs=rs1.getString("ggs");
		                	   String bam=rs1.getString("bam");
		                	   String gbam=rs1.getString("gbam");
		                	   //JOptionPane.showMessageDialog(null, p);
		                	   cell=new PdfPCell(new Phrase("GEN/STUDIES"));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(gs));
			                      mudi.addCell(cell);
			                      cell=new PdfPCell(new Phrase(ggs));
			                      mudi.addCell(cell);
		   					  
		                      cell=new PdfPCell(new Phrase("CHEMISTRY"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(che));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gche));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("BIOLOGY"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(bio));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gbio));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("GEOGRAPHY"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(geo));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(ggeo));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase("BAM"));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(bam));
		                      mudi.addCell(cell);
		                      cell=new PdfPCell(new Phrase(gbam));
		                      mudi.addCell(cell);
		                      cell1=new PdfPCell(new Phrase("                          You scored DIVISION "+" "+p+"  "+"of POINT "+"  "+pt));
		                      mudi1.addCell(cell1);
		                      
		                      
		                   }
		                   
		                   String po=rs1.getString("point");
						  cell=new PdfPCell(new Phrase("      "+p+"                "+po));
		                  mudi.addCell(cell);
		                  
		                   
				    		
				    	}
						 
				
						 
					 catch(Exception ex) {
						// JOptionPane.showMessageDialog(null, ex.getMessage());
					 } 
					
					try {
						PdfWriter.getInstance(document, new FileOutputStream("StuReport.pdf"));
						document.open();
						  Image im=Image.getInstance("fide2.png");
	                	 Image im2=Image.getInstance("other.png");
	      		    	
	       		    	 if((box67.getSelectedItem().toString().replaceAll("'", "''")).matches("FIDEL CASTRO")) {
	       		    		document .add(im);
	       		    	 }
	       		    	 else {
	       		    		document .add(im2);
	       		    	 }
						
					
						document.add(new Paragraph("\t\t\t                     "+box67.getSelectedItem().toString().replaceAll("'", "''")+"  SECONDARY SCHOOL",FontFactory.getFont(FontFactory.TIMES_ROMAN,19,Font.BOLD,new BaseColor(128,128,0))));
						document.add(new Paragraph("                                                 STUDENT'S REPORT",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD,new BaseColor(46,139,87))));
						document.add(new Paragraph("\n"));
						document.add(new Paragraph("                                                                  "+t6.getSelectedItem().toString()+"  TEST"));
						document.add(new Paragraph("                                                           "+t4.getSelectedItem().toString()+"    "+box5.getSelectedItem().toString()));
						//document.add(new Paragraph("DATE:              \t\t"+dt.format(timer.getTime())));
						//document.add(new Paragraph("TIME:               \t\t"+df.format(timer.getTime())));
						document.add(new Paragraph("\n\n"));
						document.add(new Paragraph("FULL NAME:  "+rs.getString("first")+"  "+rs.getString("last")));
						document.add(new Paragraph("GENDER:  "+rs.getString("gender")));
						document.add(new Paragraph("CLASS:  "+rs.getString("class")));
						document.add(new Paragraph("COMBINATION:  "+rs.getString("combi")));
						document.add(new Paragraph("\n\n"));
						document.add(mudi);
						document.add(new Paragraph("\n"));
						document.add(mudi1);
						document.add(new Paragraph("\n\n"));
						document.add(new Paragraph("Comment:.............................................                            Comment:............................................."));
						document.add(new Paragraph("Head Teacher                                                                   Class Teacher"));
						document.add(new Paragraph("Sign..........                                                                         Sign:.........."));
						//document.add(new Paragraph(dt.format(timer.getTime())+"::"+df.format(timer.getTime() )) );
						
						document.close();
						JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
						Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"StuReport.pdf");


					
						
					} catch (Exception e2) {
						 JOptionPane.showMessageDialog(null, "No User of that Records !");
					}
					 finally {
							
							try {
								rs.close();
								ps.close();
								
								
							}catch(Exception ex) {
								
							}
							
						}

				
			}else {
				JOptionPane.showMessageDialog(null, "Select User From the Table !");
			}
			
		}});
	
	nrep.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			int result1 = JOptionPane.showConfirmDialog(null, panel4, "Edit ",
			        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
			if(result1==JOptionPane.OK_OPTION) {
				
				
				int result = JOptionPane.showConfirmDialog(null, panel, "Select ",
			            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
					
				if(result==JOptionPane.OK_OPTION){
					
					if(sch.getSelectedItem() != null &&!((String) sch.getSelectedItem()).trim().isEmpty() && et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty()) {
					
						String sql="update  text set  atext='"+area1.getText()+"' where rowid= '"+3+"'  ";
						try {
							ps=con.prepareStatement(sql);
							ps.execute();	
							//JOptionPane.showMessageDialog(b1,"Success !");
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						
						
					Document document=new Document();
					 PdfPTable mudi = new PdfPTable(3);
				     PdfPCell cell=new PdfPCell(new Phrase(""));
				     
				     mudi.setWidthPercentage(105);

				     
				     
				     cell.setColspan(3);
				     cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				     cell.setBackgroundColor(new BaseColor(255,250,205));
				     
				  //   JOptionPane.showMessageDialog(null,et.getSelectedItem().toString()+" "+ct.getSelectedItem().toString()+" "+ac.getSelectedItem().toString() );
				     
				     try {
				    	
				    	 String sqq="select * from mark where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+sch.getSelectedItem().toString()+"' ";
						 ps=con.prepareStatement(sqq);
						 ResultSet rs1=ps.executeQuery();
						 
						 String sqqq="select * from user  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'and sch='"+sch.getSelectedItem().toString()+"' ";
						 ps=con.prepareStatement(sqqq);
						 ResultSet rs2=ps.executeQuery();
						 
						 String pt=rs1.getString("point");
						 String gg="";String p ="";
						 
						while(rs1.next() && rs2.next())		{
							
						    if((rs2.getString("combi").matches("PCM"))){
						    	
						    	if(rs1.getString("point").matches("Inc")) {
					    			p="--";//count++;
					    		}else {
					    			int mark=Integer.parseInt(rs1.getString("point"));
						    		
						    		if(mark>=3 && mark<=9) {
						    			p="I";//count1++;
						    		}else if(mark>=10 && mark<=12) {
						    			p="II";//count2++;
						    		}else if(mark>=13 && mark<=17) {
						    			p="III";//count3++;
						    		}
						    		else if(mark>=18 && mark<=19) {
						    			p="IV";//count4++;
						    		}else if(mark>=20 && mark<=21) {
						    			p="O";//count0++;
					    		}
					    		
					    		}
					    				
			                	   String phy=rs1.getString("phy");
			                	   String gphy=rs1.getString("gphy");
			                	   String che=rs1.getString("che");
			                	   String gche=rs1.getString("gche");
			                	   String math=rs1.getString("math");
			                	   String gmath=rs1.getString("gmath");
			                	   String gs=rs1.getString("gs");
			                	   String ggs=rs1.getString("ggs");
			                	   
			                	   Image im=Image.getInstance("other.png");
					         	    mudi.setWidthPercentage(105);
					         	    cell = new PdfPCell(im,false);
								    cell.setColspan(4);
								    cell.setHorizontalAlignment(1);
								    mudi.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
				                     
								    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+"       "+sch.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("\n\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
					                     cell=new PdfPCell(new Phrase("JINA:       "+rs2.getString("first")+" "+rs2.getString("last")+"\nJINSIA:    "+rs2.getString("gender")+"\nDARASA:"+rs2.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
					      		    	   cell.setBorder(0);
					      		    	    cell.setColspan(4);
					                       mudi.addCell(cell);
			      		    	 
			      		  
			                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs2.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
			      		    	   cell.setBorder(0);
			      		    	    cell.setColspan(4);
			                       mudi.addCell(cell);
			                       
			                       cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
			                       
			                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								   // cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
	     						    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("PHYSICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(phy, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gphy, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("CHEMISTRY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(che, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gche, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("ADV / MATHEMATICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(math, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(gmath, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
									    
				                  
				      		       cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
				      		       cell.setHorizontalAlignment(1);
				      	    	     cell.setColspan(3);
				                   mudi.addCell(cell);
				                   
				                   cell=new PdfPCell(new Phrase("\n"));
			                       cell.setBorder(0);
			                       cell.setColspan(3);
			                       mudi.addCell(cell);
			                       
				                  
				                   cell=new PdfPCell(new Phrase(area1.getText()));
				                   cell.setColspan(3);
				      		       cell.setBorder(0);
				      		      mudi.addCell(cell);
				                   
			                       cell=new PdfPCell(new Phrase(" "));
			                       cell.setBorder(0);
			                       cell.setColspan(3);
			                       mudi.addCell(cell);
			                       
			                	   
			                      
			                   }
						    
							
		                       if((rs2.getString("combi").matches("PCB"))){
						    	
						    	if(rs1.getString("point").matches("Inc")) {
					    			p="Inc";//count++;
					    		}else {
					    			int mark=Integer.parseInt(rs1.getString("point"));
						    		
						    		if(mark>=3 && mark<=9) {
						    			p="I";//count1++;
						    		}else if(mark>=10 && mark<=12) {
						    			p="II";//count2++;
						    		}else if(mark>=13 && mark<=17) {
						    			p="III";//count3++;
						    		}
						    		else if(mark>=18 && mark<=19) {
						    			p="IV";//count4++;
						    		}else if(mark>=20 && mark<=21) {
						    			p="O";//count0++;
					    		}
					    		
					    		}
					    				
			                	   String phy=rs1.getString("phy");
			                	   String gphy=rs1.getString("gphy");
			                	   String che=rs1.getString("che");
			                	   String gche=rs1.getString("gche");
			                	   String bio=rs1.getString("bio");
			                	   String gbio=rs1.getString("gbio");
			                	   String gs=rs1.getString("gs");
			                	   String ggs=rs1.getString("ggs");
			                	   String bam=rs1.getString("bam");
			                	   String gbam=rs1.getString("gbam");
			                	   
			                	   Image im=Image.getInstance("other.png");
					         	    mudi.setWidthPercentage(105);
					         	    cell = new PdfPCell(im,false);
								    cell.setColspan(4);
								    cell.setHorizontalAlignment(1);
								    mudi.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
				                     
								    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
					                     cell=new PdfPCell(new Phrase("JINA:       "+rs2.getString("first")+" "+rs2.getString("last")+"\nJINSIA:    "+rs2.getString("gender")+"\nDARASA:"+rs2.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
					      		    	   cell.setBorder(0);
					      		    	    cell.setColspan(4);
					                       mudi.addCell(cell);
			      		    	 
			      		  
			                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs2.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
			      		    	   cell.setBorder(0);
			      		    	    cell.setColspan(4);
			                       mudi.addCell(cell);
			                       
			                       cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
			                       
			                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								   // cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
	     						    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("PHYSICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(phy, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gphy, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("CHEMISTRY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(che, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gche, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("BIOLOGY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(bio, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(gbio, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
									    
												    cell = new PdfPCell(new Phrase("BAM", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(bam, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(gbam, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
										    
				                  
				      		       cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
				      		       cell.setHorizontalAlignment(1);
				      	    	     cell.setColspan(3);
				                   mudi.addCell(cell);
				                   
				                   cell=new PdfPCell(new Phrase(" "));
			                       cell.setBorder(0);
			                       cell.setColspan(3);
			                       mudi.addCell(cell);
			                       
				                  
				                   cell=new PdfPCell(new Phrase(area1.getText()));
				                   cell.setColspan(3);
				      		       cell.setBorder(0);
				      		      mudi.addCell(cell);
				                   
			                       cell=new PdfPCell(new Phrase(" "));
			                       cell.setBorder(0);
			                       cell.setColspan(3);
			                       mudi.addCell(cell);
			                	   
			                      
			                   }
		                       
		                       if((rs2.getString("combi").matches("PGM"))){
		   				    	
		   				    	if(rs1.getString("point").matches("Inc")) {
		   			    			p="Inc";//count++;
		   			    		}else {
		   			    			int mark=Integer.parseInt(rs1.getString("point"));
		   				    		
		   				    		if(mark>=3 && mark<=9) {
		   				    			p="I";//count1++;
		   				    		}else if(mark>=10 && mark<=12) {
		   				    			p="II";//count2++;
		   				    		}else if(mark>=13 && mark<=17) {
		   				    			p="III";//count3++;
		   				    		}
		   				    		else if(mark>=18 && mark<=19) {
		   				    			p="IV";//count4++;
		   				    		}else if(mark>=20 && mark<=21) {
		   				    			p="O";//count0++;
		   			    		}
		   			    		
		   			    		}
		   			    				
		   	                	   String phy=rs1.getString("phy");
		   	                	   String gphy=rs1.getString("gphy");
		   	                	   String geo=rs1.getString("geo");
		   	                	   String ggeo=rs1.getString("ggeo");
		   	                	   String math=rs1.getString("math");
		   	                	   String gmath=rs1.getString("gmath");
		   	                	   String gs=rs1.getString("gs");
		   	                	   String ggs=rs1.getString("ggs");
		   	                	   
		   	                	   Image im=Image.getInstance("other.png");
					         	    mudi.setWidthPercentage(105);
					         	    cell = new PdfPCell(im,false);
								    cell.setColspan(4);
								    cell.setHorizontalAlignment(1);
								    mudi.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
				                     
								    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("\n\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
					                     cell=new PdfPCell(new Phrase("JINA:       "+rs2.getString("first")+" "+rs2.getString("last")+"\nJINSIA:    "+rs2.getString("gender")+"\nDARASA:"+rs2.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
					      		    	   cell.setBorder(0);
					      		    	    cell.setColspan(4);
					                       mudi.addCell(cell);
			      		    	 
			      		  
			                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs2.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
			      		    	   cell.setBorder(0);
			      		    	    cell.setColspan(4);
			                       mudi.addCell(cell);
			                       
			                       cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
			                       
			                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								   // cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
	     						    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("PHYSICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(phy, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gphy, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("GEOGRAPHY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(geo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(ggeo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("ADV / MATHEMATICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(math, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(gmath, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
									    
				                  
				      		       cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
				      		       cell.setHorizontalAlignment(1);
				      	    	     cell.setColspan(3);
				                   mudi.addCell(cell);
				                   
				                   cell=new PdfPCell(new Phrase("\n"));
			                       cell.setBorder(0);
			                       cell.setColspan(3);
			                       mudi.addCell(cell);
			                       
				                  
				                   cell=new PdfPCell(new Phrase(area1.getText()));
				                   cell.setColspan(3);
				      		       cell.setBorder(0);
				      		      mudi.addCell(cell);
				                   
			                       cell=new PdfPCell(new Phrase(" "));
			                       cell.setBorder(0);
			                       cell.setColspan(3);
			                       mudi.addCell(cell);
		   	                      
		   	                   }
		                       if((rs2.getString("combi").matches("EGM"))){
			   				    	
			   				    	if(rs1.getString("point").matches("Inc")) {
			   			    			p="Inc";//count++;
			   			    		}else {
			   			    			int mark=Integer.parseInt(rs1.getString("point"));
			   				    		
			   				    		if(mark>=3 && mark<=9) {
			   				    			p="I";//count1++;
			   				    		}else if(mark>=10 && mark<=12) {
			   				    			p="II";//count2++;
			   				    		}else if(mark>=13 && mark<=17) {
			   				    			p="III";//count3++;
			   				    		}
			   				    		else if(mark>=18 && mark<=19) {
			   				    			p="IV";//count4++;
			   				    		}else if(mark>=20 && mark<=21) {
			   				    			p="O";//count0++;
			   			    		}
			   			    		
			   			    		}
			   			    				
			   	                	   String ec=rs1.getString("ec");
			   	                	   String gec=rs1.getString("gec");
			   	                	   String geo=rs1.getString("geo");
			   	                	   String ggeo=rs1.getString("ggeo");
			   	                	   String math=rs1.getString("math");
			   	                	   String gmath=rs1.getString("gmath");
			   	                	   String gs=rs1.getString("gs");
			   	                	   String ggs=rs1.getString("ggs");
			   	                	   
			   	                	   Image im=Image.getInstance("other.png");
						         	    mudi.setWidthPercentage(105);
						         	    cell = new PdfPCell(im,false);
									    cell.setColspan(4);
									    cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
					                     
									    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("\n\n\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
						                     cell=new PdfPCell(new Phrase("JINA:       "+rs2.getString("first")+" "+rs2.getString("last")+"\nJINSIA:    "+rs2.getString("gender")+"\nDARASA:"+rs2.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
						      		    	   cell.setBorder(0);
						      		    	    cell.setColspan(4);
						                       mudi.addCell(cell);
				      		    	 
				      		  
				                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs2.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
				      		    	   cell.setBorder(0);
				      		    	    cell.setColspan(4);
				                       mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("ECONOMICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(ec, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gec, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("GEOGRAPHY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(geo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(ggeo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("ADV / MATHEMATICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(math, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(gmath, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
										    
					                  
					      		       cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
					      		       cell.setHorizontalAlignment(1);
					      	    	     cell.setColspan(3);
					                   mudi.addCell(cell);
					                   
					                   cell=new PdfPCell(new Phrase("\n"));
				                       cell.setBorder(0);
				                       cell.setColspan(3);
				                       mudi.addCell(cell);
				                       
					                  
					                   cell=new PdfPCell(new Phrase(area1.getText()));
					                   cell.setColspan(3);
					      		       cell.setBorder(0);
					      		      mudi.addCell(cell);
					                   
				                       cell=new PdfPCell(new Phrase(" "));
				                       cell.setBorder(0);
				                       cell.setColspan(3);
				                       mudi.addCell(cell);
			   	                      
			   	                   }
		                       if((rs2.getString("combi").matches("ECA"))){
			   				    	
			   				    	if(rs1.getString("point").matches("Inc")) {
			   			    			p="Inc";//count++;
			   			    		}else {
			   			    			int mark=Integer.parseInt(rs1.getString("point"));
			   				    		
			   				    		if(mark>=3 && mark<=9) {
			   				    			p="I";//count1++;
			   				    		}else if(mark>=10 && mark<=12) {
			   				    			p="II";//count2++;
			   				    		}else if(mark>=13 && mark<=17) {
			   				    			p="III";//count3++;
			   				    		}
			   				    		else if(mark>=18 && mark<=19) {
			   				    			p="IV";//count4++;
			   				    		}else if(mark>=20 && mark<=21) {
			   				    			p="O";//count0++;
			   			    		}
			   			    		
			   			    		}
			   			    				
			   	                	   String ec=rs1.getString("ec");
			   	                	   String gec=rs1.getString("gec");
			   	                	   String co=rs1.getString("co");
			   	                	   String gco=rs1.getString("gco");
			   	                	   String aco=rs1.getString("aco");
			   	                	   String gaco=rs1.getString("gaco");
			   	                	   String gs=rs1.getString("gs");
			   	                	   String ggs=rs1.getString("ggs");
			   	                	   String bam=rs1.getString("bam");
			   	                	   String gbam=rs1.getString("gbam");
			   	                	   
			   	                	  
			   	                	   Image im=Image.getInstance("other.png");
						         	    mudi.setWidthPercentage(105);
						         	    cell = new PdfPCell(im,false);
									    cell.setColspan(4);
									    cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
					                     
									    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("\n\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
						                     cell=new PdfPCell(new Phrase("JINA:       "+rs2.getString("first")+" "+rs2.getString("last")+"\nJINSIA:    "+rs2.getString("gender")+"\nDARASA:"+rs2.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
						      		    	   cell.setBorder(0);
						      		    	    cell.setColspan(4);
						                       mudi.addCell(cell);
				      		    	 
				      		  
				                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs2.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
				      		    	   cell.setBorder(0);
				      		    	    cell.setColspan(4);
				                       mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("ECONOMICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(ec, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gec, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("COMMERCE", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(co, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(gco, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("ACCOUNTANCY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(aco, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(gaco, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    
													    cell = new PdfPCell(new Phrase("BAM", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
														   // cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
														    cell = new PdfPCell(new Phrase(bam, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
														    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
														    cell = new PdfPCell(new Phrase(gbam, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
							     						    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
											    
										    
					                  
					      		       cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
					      		       cell.setHorizontalAlignment(1);
					      	    	     cell.setColspan(3);
					                   mudi.addCell(cell);
					                   
					                   cell=new PdfPCell(new Phrase("\n"));
				                       cell.setBorder(0);
				                       cell.setColspan(3);
				                       mudi.addCell(cell);
				                       
					                  
					                   cell=new PdfPCell(new Phrase(area1.getText()));
					                   cell.setColspan(3);
					      		       cell.setBorder(0);
					      		      mudi.addCell(cell);
					                   
				                       cell=new PdfPCell(new Phrase(" "));
				                       cell.setBorder(0);
				                       cell.setColspan(3);
				                       mudi.addCell(cell);
			   	                   }
		                       if((rs2.getString("combi").matches("HGE"))){
			   				    	
			   				    	if(rs1.getString("point").matches("Inc")) {
			   			    			p="Inc";//count++;
			   			    		}else {
			   			    			int mark=Integer.parseInt(rs1.getString("point"));
			   				    		
			   				    		if(mark>=3 && mark<=9) {
			   				    			p="I";//count1++;
			   				    		}else if(mark>=10 && mark<=12) {
			   				    			p="II";//count2++;
			   				    		}else if(mark>=13 && mark<=17) {
			   				    			p="III";//count3++;
			   				    		}
			   				    		else if(mark>=18 && mark<=19) {
			   				    			p="IV";//count4++;
			   				    		}else if(mark>=20 && mark<=21) {
			   				    			p="O";//count0++;
			   			    		}
			   			    		
			   			    		}
			   			    				
			   	                	   String ec=rs1.getString("ec");
			   	                	   String gec=rs1.getString("gec");
			   	                	   String geo=rs1.getString("geo");
			   	                	   String ggeo=rs1.getString("ggeo");
			   	                	   String his=rs1.getString("his");
			   	                	   String ghis=rs1.getString("ghis");
			   	                	   String gs=rs1.getString("gs");
			   	                	   String ggs=rs1.getString("ggs");
			   	                	 String bam=rs1.getString("bam");
			   	                	   String gbam=rs1.getString("gbam");
			   	                	 
			   	                	   Image im=Image.getInstance("other.png");
						         	    mudi.setWidthPercentage(105);
						         	    cell = new PdfPCell(im,false);
									    cell.setColspan(4);
									    cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
					                     
									    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("\n\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
						                     cell=new PdfPCell(new Phrase("JINA:       "+rs2.getString("first")+" "+rs2.getString("last")+"\nJINSIA:    "+rs2.getString("gender")+"\nDARASA:"+rs2.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
						      		    	   cell.setBorder(0);
						      		    	    cell.setColspan(4);
						                       mudi.addCell(cell);
				      		    	 
				      		  
				                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs2.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
				      		    	   cell.setBorder(0);
				      		    	    cell.setColspan(4);
				                       mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("ECONOMICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(ec, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gec, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("GEOGRAPHY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(geo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(ggeo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("HISTORY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(his, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(ghis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
										    
													    
													    cell = new PdfPCell(new Phrase("BAM", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
														   // cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
														    cell = new PdfPCell(new Phrase(bam, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
														    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
														    cell = new PdfPCell(new Phrase(gbam, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
							     						    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
											    
					                  
					      		       cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
					      		       cell.setHorizontalAlignment(1);
					      	    	     cell.setColspan(3);
					                   mudi.addCell(cell);
					                   
					                   cell=new PdfPCell(new Phrase("\n"));
				                       cell.setBorder(0);
				                       cell.setColspan(3);
				                       mudi.addCell(cell);
				                       
					                  
					                   cell=new PdfPCell(new Phrase(area1.getText()));
					                   cell.setColspan(3);
					      		       cell.setBorder(0);
					      		      mudi.addCell(cell);
					                   
				                       cell=new PdfPCell(new Phrase(" "));
				                       cell.setBorder(0);
				                       cell.setColspan(3);
				                       mudi.addCell(cell);
			   	                      
			   	                      
			   	                   }
		                       if((rs2.getString("combi").matches("HGL"))){
			   				    	
			   				    	if(rs1.getString("point").matches("Inc")) {
			   			    			p="Inc";//count++;
			   			    		}else {
			   			    			int mark=Integer.parseInt(rs1.getString("point"));
			   				    		
			   				    		if(mark>=3 && mark<=9) {
			   				    			p="I";//count1++;
			   				    		}else if(mark>=10 && mark<=12) {
			   				    			p="II";//count2++;
			   				    		}else if(mark>=13 && mark<=17) {
			   				    			p="III";//count3++;
			   				    		}
			   				    		else if(mark>=18 && mark<=19) {
			   				    			p="IV";//count4++;
			   				    		}else if(mark>=20 && mark<=21) {
			   				    			p="O";//count0++;
			   			    		}
			   			    		
			   			    		}
			   			    				
			   	                	   String lan=rs1.getString("lan");
			   	                	   String glan=rs1.getString("glan");
			   	                	   String geo=rs1.getString("geo");
			   	                	   String ggeo=rs1.getString("ggeo");
			   	                	   String his=rs1.getString("his");
			   	                	   String ghis=rs1.getString("ghis");
			   	                	   String gs=rs1.getString("gs");
			   	                	   String ggs=rs1.getString("ggs");
			   	                	   
			   	                	 Image im=Image.getInstance("other.png");
						         	    mudi.setWidthPercentage(105);
						         	    cell = new PdfPCell(im,false);
									    cell.setColspan(4);
									    cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
					                     
									    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("\n\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
						                     cell=new PdfPCell(new Phrase("JINA:       "+rs2.getString("first")+" "+rs2.getString("last")+"\nJINSIA:    "+rs2.getString("gender")+"\nDARASA:"+rs2.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
						      		    	   cell.setBorder(0);
						      		    	    cell.setColspan(4);
						                       mudi.addCell(cell);
				      		    	 
				      		  
				                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs2.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
				      		    	   cell.setBorder(0);
				      		    	    cell.setColspan(4);
				                       mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("LANGUAGE", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(lan, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(glan, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("GEOGRAPHY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(geo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(ggeo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("HISTORY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(his, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(ghis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    
													    cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
										      		       cell.setHorizontalAlignment(1);
										      	    	     cell.setColspan(3);
										                   mudi.addCell(cell);
										                   
										                   cell=new PdfPCell(new Phrase("\n"));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
									                       
										                  
										                   cell=new PdfPCell(new Phrase(area1.getText()));
										                   cell.setColspan(3);
										      		       cell.setBorder(0);
										      		      mudi.addCell(cell);
										                   
									                       cell=new PdfPCell(new Phrase(" "));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
										    
			   	                      
			   	                   }
		                       if((rs2.getString("combi").matches("HGK"))){
			   				    	
			   				    	if(rs1.getString("point").matches("Inc")) {
			   			    			p="Inc";//count++;
			   			    		}else {
			   			    			int mark=Integer.parseInt(rs1.getString("point"));
			   				    		
			   				    		if(mark>=3 && mark<=9) {
			   				    			p="I";//count1++;
			   				    		}else if(mark>=10 && mark<=12) {
			   				    			p="II";//count2++;
			   				    		}else if(mark>=13 && mark<=17) {
			   				    			p="III";//count3++;
			   				    		}
			   				    		else if(mark>=18 && mark<=19) {
			   				    			p="IV";//count4++;
			   				    		}else if(mark>=20 && mark<=21) {
			   				    			p="O";//count0++;
			   			    		}
			   			    		
			   			    		}
			   			    				
			   	                	   String kis=rs1.getString("kis");
			   	                	   String gkis=rs1.getString("gkis");
			   	                	   String geo=rs1.getString("geo");
			   	                	   String ggeo=rs1.getString("ggeo");
			   	                	   String his=rs1.getString("his");
			   	                	   String ghis=rs1.getString("ghis");
			   	                	   String gs=rs1.getString("gs");
			   	                	   String ggs=rs1.getString("ggs");
			   	                	   
			   	                	   
			   	                	  
				   	                	 Image im=Image.getInstance("other.png");
							         	    mudi.setWidthPercentage(105);
							         	    cell = new PdfPCell(im,false);
										    cell.setColspan(4);
										    cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("\n"));
										    cell.setBorder(0);
										    cell.setColspan(4);
										    mudi.addCell(cell);
										    
										    
										    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
										    cell.setBorder(0);
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(4);
										    mudi.addCell(cell);
										    
										    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
										    cell.setBorder(0);
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(4);
										    mudi.addCell(cell);
						                     
										    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
										    cell.setBorder(0);
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(4);
										    mudi.addCell(cell);
										    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
										    cell.setBorder(0);
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(4);
										    mudi.addCell(cell);
										    
										    
										    cell = new PdfPCell(new Phrase("\n\n"));
										    cell.setBorder(0);
										    cell.setColspan(4);
										    mudi.addCell(cell);
										    
							                     cell=new PdfPCell(new Phrase("JINA:       "+rs2.getString("first")+" "+rs2.getString("last")+"\nJINSIA:    "+rs2.getString("gender")+"\nDARASA:"+rs2.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
							      		    	   cell.setBorder(0);
							      		    	    cell.setColspan(4);
							                       mudi.addCell(cell);
					      		    	 
					      		  
					                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs2.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
					      		    	   cell.setBorder(0);
					      		    	    cell.setColspan(4);
					                       mudi.addCell(cell);
					                       
					                       cell = new PdfPCell(new Phrase("\n"));
										    cell.setBorder(0);
										    cell.setColspan(4);
										    mudi.addCell(cell);
					                       
					                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    
										    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(kis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(gkis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("GEOGRAPHY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(geo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(ggeo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    
													    cell = new PdfPCell(new Phrase("HISTORY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
														   // cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
														    cell = new PdfPCell(new Phrase(his, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
														    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
														    cell = new PdfPCell(new Phrase(ghis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
							     						    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
														    
														    cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
											      		       cell.setHorizontalAlignment(1);
											      	    	     cell.setColspan(3);
											                   mudi.addCell(cell);
											                   
											                   cell=new PdfPCell(new Phrase("\n"));
										                       cell.setBorder(0);
										                       cell.setColspan(3);
										                       mudi.addCell(cell);
										                       
											                  
											                   cell=new PdfPCell(new Phrase(area1.getText()));
											                   cell.setColspan(3);
											      		       cell.setBorder(0);
											      		      mudi.addCell(cell);
											                   
										                       cell=new PdfPCell(new Phrase(" "));
										                       cell.setBorder(0);
										                       cell.setColspan(3);
										                       mudi.addCell(cell);
											    
			   	                      
			   	                   }
		                       if((rs2.getString("combi").matches("GKL"))){
			   				    	
			   				    	if(rs1.getString("point").matches("Inc")) {
			   			    			p="Inc";//count++;
			   			    		}else {
			   			    			int mark=Integer.parseInt(rs1.getString("point"));
			   				    		
			   				    		if(mark>=3 && mark<=9) {
			   				    			p="I";//count1++;
			   				    		}else if(mark>=10 && mark<=12) {
			   				    			p="II";//count2++;
			   				    		}else if(mark>=13 && mark<=17) {
			   				    			p="III";//count3++;
			   				    		}
			   				    		else if(mark>=18 && mark<=19) {
			   				    			p="IV";//count4++;
			   				    		}else if(mark>=20 && mark<=21) {
			   				    			p="O";//count0++;
			   			    		}
			   			    		
			   			    		}
			   			    				
			   	                	   String kis=rs1.getString("kis");
			   	                	   String gkis=rs1.getString("gkis");
			   	                	   String geo=rs1.getString("geo");
			   	                	   String ggeo=rs1.getString("ggeo");
			   	                	   String lan=rs1.getString("lan");
			   	                	   String glan=rs1.getString("glan");
			   	                	   String gs=rs1.getString("gs");
			   	                	   String ggs=rs1.getString("ggs");
			   	                	   
			   	                	   
			   	                	   
			   	                	 Image im=Image.getInstance("other.png");
						         	    mudi.setWidthPercentage(105);
						         	    cell = new PdfPCell(im,false);
									    cell.setColspan(4);
									    cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
					                     
									    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("\n\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
						                     cell=new PdfPCell(new Phrase("JINA:       "+rs2.getString("first")+" "+rs2.getString("last")+"\nJINSIA:    "+rs2.getString("gender")+"\nDARASA:"+rs2.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
						      		    	   cell.setBorder(0);
						      		    	    cell.setColspan(4);
						                       mudi.addCell(cell);
				      		    	 
				      		  
				                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs2.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
				      		    	   cell.setBorder(0);
				      		    	    cell.setColspan(4);
				                       mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(kis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gkis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("GEOGRAPHY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(geo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(ggeo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("LANGUAGE", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(lan, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(glan, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    
													    cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
										      		       cell.setHorizontalAlignment(1);
										      	    	     cell.setColspan(3);
										                   mudi.addCell(cell);
										                   
										                   cell=new PdfPCell(new Phrase("\n"));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
									                       
										                  
										                   cell=new PdfPCell(new Phrase(area1.getText()));
										                   cell.setColspan(3);
										      		       cell.setBorder(0);
										      		      mudi.addCell(cell);
										                   
									                       cell=new PdfPCell(new Phrase(" "));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
										    
			   	                      
			   	                   }
		                       if((rs2.getString("combi").matches("HKL"))){
			   				    	
			   				    	if(rs1.getString("point").matches("Inc")) {
			   			    			p="Inc";//count++;
			   			    		}else {
			   			    			int mark=Integer.parseInt(rs1.getString("point"));
			   				    		
			   				    		if(mark>=3 && mark<=9) {
			   				    			p="I";//count1++;
			   				    		}else if(mark>=10 && mark<=12) {
			   				    			p="II";//count2++;
			   				    		}else if(mark>=13 && mark<=17) {
			   				    			p="III";//count3++;
			   				    		}
			   				    		else if(mark>=18 && mark<=19) {
			   				    			p="IV";//count4++;
			   				    		}else if(mark>=20 && mark<=21) {
			   				    			p="O";//count0++;
			   			    		}
			   			    		
			   			    		}
			   			    				
			   	                	   String kis=rs1.getString("kis");
			   	                	   String gkis=rs1.getString("gkis");
			   	                	   String his=rs1.getString("his");
			   	                	   String ghis=rs1.getString("ghis");
			   	                	   String lan=rs1.getString("lan");
			   	                	   String glan=rs1.getString("glan");
			   	                	   String gs=rs1.getString("gs");
			   	                	   String ggs=rs1.getString("ggs");
			   	                	   
			   	                	 Image im=Image.getInstance("other.png");
						         	    mudi.setWidthPercentage(105);
						         	    cell = new PdfPCell(im,false);
									    cell.setColspan(4);
									    cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
					                     
									    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("\n\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
						                     cell=new PdfPCell(new Phrase("JINA:       "+rs2.getString("first")+" "+rs2.getString("last")+"\nJINSIA:    "+rs2.getString("gender")+"\nDARASA:"+rs2.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
						      		    	   cell.setBorder(0);
						      		    	    cell.setColspan(4);
						                       mudi.addCell(cell);
				      		    	 
				      		  
				                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs2.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
				      		    	   cell.setBorder(0);
				      		    	    cell.setColspan(4);
				                       mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("LANGUAGE", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(lan, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(glan, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(kis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(gkis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("HISTORY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(his, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(ghis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    
													    cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
										      		       cell.setHorizontalAlignment(1);
										      	    	     cell.setColspan(3);
										                   mudi.addCell(cell);
										                   
										                   cell=new PdfPCell(new Phrase("\n"));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
									                       
										                  
										                   cell=new PdfPCell(new Phrase(area1.getText()));
										                   cell.setColspan(3);
										      		       cell.setBorder(0);
										      		      mudi.addCell(cell);
										                   
									                       cell=new PdfPCell(new Phrase(" "));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
			   	                	   
			   	                      
			   	                   }
		                       
		                       
		                       if((rs2.getString("combi").matches("HKA"))){
			   				    	
			   				    	if(rs1.getString("point").matches("Inc")) {
			   			    			p="Inc";//count++;
			   			    		}else {
			   			    			int mark=Integer.parseInt(rs1.getString("point"));
			   				    		
			   				    		if(mark>=3 && mark<=9) {
			   				    			p="I";//count1++;
			   				    		}else if(mark>=10 && mark<=12) {
			   				    			p="II";//count2++;
			   				    		}else if(mark>=13 && mark<=17) {
			   				    			p="III";//count3++;
			   				    		}
			   				    		else if(mark>=18 && mark<=19) {
			   				    			p="IV";//count4++;
			   				    		}else if(mark>=20 && mark<=21) {
			   				    			p="O";//count0++;
			   			    		}
			   			    		
			   			    		}
			   			    				
			   	                	   String kis=rs1.getString("kis");
			   	                	   String gkis=rs1.getString("gkis");
			   	                	   String his=rs1.getString("his");
			   	                	   String ghis=rs1.getString("ghis");
			   	                	   String ara=rs1.getString("ara");
			   	                	   String gara=rs1.getString("gara");
			   	                	   String gs=rs1.getString("gs");
			   	                	   String ggs=rs1.getString("ggs");
			   	                	   
			   	                	 Image im=Image.getInstance("other.png");
						         	    mudi.setWidthPercentage(105);
						         	    cell = new PdfPCell(im,false);
									    cell.setColspan(4);
									    cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
					                     
									    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("\n\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
						                     cell=new PdfPCell(new Phrase("JINA:       "+rs2.getString("first")+" "+rs2.getString("last")+"\nJINSIA:    "+rs2.getString("gender")+"\nDARASA:"+rs2.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
						      		    	   cell.setBorder(0);
						      		    	    cell.setColspan(4);
						                       mudi.addCell(cell);
				      		    	 
				      		  
				                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs2.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
				      		    	   cell.setBorder(0);
				      		    	    cell.setColspan(4);
				                       mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("ARABIC", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(ara, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gara, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(kis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(gkis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("HISTORY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(his, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(ghis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    
													    cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
										      		       cell.setHorizontalAlignment(1);
										      	    	     cell.setColspan(3);
										                   mudi.addCell(cell);
										                   
										                   cell=new PdfPCell(new Phrase("\n"));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
									                       
										                  
										                   cell=new PdfPCell(new Phrase(area1.getText()));
										                   cell.setColspan(3);
										      		       cell.setBorder(0);
										      		      mudi.addCell(cell);
										                   
									                       cell=new PdfPCell(new Phrase(" "));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
			   	                	   
			   	                      
			   	                   }
		                       
		                       if((rs2.getString("combi").matches("IKA"))){
			   				    	
			   				    	if(rs1.getString("point").matches("Inc")) {
			   			    			p="Inc";//count++;
			   			    		}else {
			   			    			int mark=Integer.parseInt(rs1.getString("point"));
			   				    		
			   				    		if(mark>=3 && mark<=9) {
			   				    			p="I";//count1++;
			   				    		}else if(mark>=10 && mark<=12) {
			   				    			p="II";//count2++;
			   				    		}else if(mark>=13 && mark<=17) {
			   				    			p="III";//count3++;
			   				    		}
			   				    		else if(mark>=18 && mark<=19) {
			   				    			p="IV";//count4++;
			   				    		}else if(mark>=20 && mark<=21) {
			   				    			p="O";//count0++;
			   			    		}
			   			    		
			   			    		}
			   			    				
			   	                	   String kis=rs1.getString("kis");
			   	                	   String gkis=rs1.getString("gkis");
			   	                	   String dini=rs1.getString("dini");
			   	                	   String gdini=rs1.getString("gdini");
			   	                	   String ara=rs1.getString("ara");
			   	                	   String gara=rs1.getString("gara");
			   	                	   String gs=rs1.getString("gs");
			   	                	   String ggs=rs1.getString("ggs");
			   	                	   
			   	                	 Image im=Image.getInstance("other.png");
						         	    mudi.setWidthPercentage(105);
						         	    cell = new PdfPCell(im,false);
									    cell.setColspan(4);
									    cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
					                     
									    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("\n\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
						                     cell=new PdfPCell(new Phrase("JINA:       "+rs2.getString("first")+" "+rs2.getString("last")+"\nJINSIA:    "+rs2.getString("gender")+"\nDARASA:"+rs2.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
						      		    	   cell.setBorder(0);
						      		    	    cell.setColspan(4);
						                       mudi.addCell(cell);
				      		    	 
				      		  
				                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs2.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
				      		    	   cell.setBorder(0);
				      		    	    cell.setColspan(4);
				                       mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("I/KNOWLEDGE", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(dini, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gdini, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(kis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(gkis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("ARABIC", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(ara, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(gara, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    
													    cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
										      		       cell.setHorizontalAlignment(1);
										      	    	     cell.setColspan(3);
										                   mudi.addCell(cell);
										                   
										                   cell=new PdfPCell(new Phrase("\n"));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
									                       
										                  
										                   cell=new PdfPCell(new Phrase(area1.getText()));
										                   cell.setColspan(3);
										      		       cell.setBorder(0);
										      		      mudi.addCell(cell);
										                   
									                       cell=new PdfPCell(new Phrase(" "));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
			   	                	   
			   	                      
			   	                   }
		                       if((rs2.getString("combi").matches("IKL"))){
			   				    	
			   				    	if(rs1.getString("point").matches("Inc")) {
			   			    			p="Inc";//count++;
			   			    		}else {
			   			    			int mark=Integer.parseInt(rs1.getString("point"));
			   				    		
			   				    		if(mark>=3 && mark<=9) {
			   				    			p="I";//count1++;
			   				    		}else if(mark>=10 && mark<=12) {
			   				    			p="II";//count2++;
			   				    		}else if(mark>=13 && mark<=17) {
			   				    			p="III";//count3++;
			   				    		}
			   				    		else if(mark>=18 && mark<=19) {
			   				    			p="IV";//count4++;
			   				    		}else if(mark>=20 && mark<=21) {
			   				    			p="O";//count0++;
			   			    		}
			   			    		
			   			    		}
			   			    				
			   	                	   String kis=rs1.getString("kis");
			   	                	   String gkis=rs1.getString("gkis");
			   	                	   String dini=rs1.getString("dini");
			   	                	   String gdini=rs1.getString("gdini");
			   	                	   String lan=rs1.getString("lan");
			   	                	   String glan=rs1.getString("glan");
			   	                	   String gs=rs1.getString("gs");
			   	                	   String ggs=rs1.getString("ggs");
			   	                	   
			   	                	 Image im=Image.getInstance("other.png");
						         	    mudi.setWidthPercentage(105);
						         	    cell = new PdfPCell(im,false);
									    cell.setColspan(4);
									    cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
					                     
									    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("\n\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
						                     cell=new PdfPCell(new Phrase("JINA:       "+rs2.getString("first")+" "+rs2.getString("last")+"\nJINSIA:    "+rs2.getString("gender")+"\nDARASA:"+rs2.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
						      		    	   cell.setBorder(0);
						      		    	    cell.setColspan(4);
						                       mudi.addCell(cell);
				      		    	 
				      		  
				                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs2.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
				      		    	   cell.setBorder(0);
				      		    	    cell.setColspan(4);
				                       mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("I/KNOWLEDGE", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(dini, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gdini, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(kis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(gkis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("LANGUAGE", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(lan, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(glan, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    
													    cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
										      		       cell.setHorizontalAlignment(1);
										      	    	     cell.setColspan(3);
										                   mudi.addCell(cell);
										                   
										                   cell=new PdfPCell(new Phrase("\n"));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
									                       
										                  
										                   cell=new PdfPCell(new Phrase(area1.getText()));
										                   cell.setColspan(3);
										      		       cell.setBorder(0);
										      		      mudi.addCell(cell);
										                   
									                       cell=new PdfPCell(new Phrase(" "));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
			   	                	   
			   	                   }
		                       if((rs2.getString("combi").matches("KLA"))){
			   				    	
			   				    	if(rs1.getString("point").matches("Inc")) {
			   			    			p="Inc";//count++;
			   			    		}else {
			   			    			int mark=Integer.parseInt(rs1.getString("point"));
			   				    		
			   				    		if(mark>=3 && mark<=9) {
			   				    			p="I";//count1++;
			   				    		}else if(mark>=10 && mark<=12) {
			   				    			p="II";//count2++;
			   				    		}else if(mark>=13 && mark<=17) {
			   				    			p="III";//count3++;
			   				    		}
			   				    		else if(mark>=18 && mark<=19) {
			   				    			p="IV";//count4++;
			   				    		}else if(mark>=20 && mark<=21) {
			   				    			p="O";//count0++;
			   			    		}
			   			    		
			   			    		}
			   			    				
			   	                	   String kis=rs1.getString("kis");
			   	                	   String gkis=rs1.getString("gkis");
			   	                	   String ara=rs1.getString("ara");
			   	                	   String gara=rs1.getString("gara");
			   	                	   String lan=rs1.getString("lan");
			   	                	   String glan=rs1.getString("glan");
			   	                	   String gs=rs1.getString("gs");
			   	                	   String ggs=rs1.getString("ggs");
			   	                	   
			   	                	   
				   	                	 Image im=Image.getInstance("other.png");
							         	    mudi.setWidthPercentage(105);
							         	    cell = new PdfPCell(im,false);
										    cell.setColspan(4);
										    cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("\n"));
										    cell.setBorder(0);
										    cell.setColspan(4);
										    mudi.addCell(cell);
										    
										    
										    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
										    cell.setBorder(0);
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(4);
										    mudi.addCell(cell);
										    
										    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
										    cell.setBorder(0);
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(4);
										    mudi.addCell(cell);
						                     
										    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
										    cell.setBorder(0);
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(4);
										    mudi.addCell(cell);
										    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
										    cell.setBorder(0);
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(4);
										    mudi.addCell(cell);
										    
										    
										    cell = new PdfPCell(new Phrase("\n\n"));
										    cell.setBorder(0);
										    cell.setColspan(4);
										    mudi.addCell(cell);
										    
							                     cell=new PdfPCell(new Phrase("JINA:       "+rs2.getString("first")+" "+rs2.getString("last")+"\nJINSIA:    "+rs2.getString("gender")+"\nDARASA:"+rs2.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
							      		    	   cell.setBorder(0);
							      		    	    cell.setColspan(4);
							                       mudi.addCell(cell);
					      		    	 
					      		  
					                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs2.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
					      		    	   cell.setBorder(0);
					      		    	    cell.setColspan(4);
					                       mudi.addCell(cell);
					                       
					                       cell = new PdfPCell(new Phrase("\n"));
										    cell.setBorder(0);
										    cell.setColspan(4);
										    mudi.addCell(cell);
					                       
					                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    
										    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("ARABIC", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(ara, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(gara, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(kis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(gkis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    
													    cell = new PdfPCell(new Phrase("LANGUAGE", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
														   // cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
														    cell = new PdfPCell(new Phrase(lan, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
														    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
														    cell = new PdfPCell(new Phrase(glan, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
							     						    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
														    
														    cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
											      		       cell.setHorizontalAlignment(1);
											      	    	     cell.setColspan(3);
											                   mudi.addCell(cell);
											                   
											                   cell=new PdfPCell(new Phrase("\n"));
										                       cell.setBorder(0);
										                       cell.setColspan(3);
										                       mudi.addCell(cell);
										                       
											                  
											                   cell=new PdfPCell(new Phrase(area1.getText()));
											                   cell.setColspan(3);
											      		       cell.setBorder(0);
											      		      mudi.addCell(cell);
											                   
										                       cell=new PdfPCell(new Phrase(" "));
										                       cell.setBorder(0);
										                       cell.setColspan(3);
										                       mudi.addCell(cell);
				   	                	   
			   	                      
			   	                   }

		                       if((rs2.getString("combi").matches("CBG"))){
						    	
						    	if(rs1.getString("point").matches("Inc")) {
					    			p="Inc";//count++;
					    		}else {
					    			int mark=Integer.parseInt(rs1.getString("point"));
						    		
						    		if(mark>=3 && mark<=9) {
						    			p="I";//count1++;
						    		}else if(mark>=10 && mark<=12) {
						    			p="II";//count2++;
						    		}else if(mark>=13 && mark<=17) {
						    			p="III";//count3++;
						    		}
						    		else if(mark>=18 && mark<=19) {
						    			p="IV";//count4++;
						    		}else if(mark>=20 && mark<=21) {
						    			p="O";//count0++;
					    		}
					    		
					    		}
					    				
			                	   String geo=rs1.getString("geo");
			                	   String ggeo=rs1.getString("ggeo");
			                	   String che=rs1.getString("che");
			                	   String gche=rs1.getString("gche");
			                	   String bio=rs1.getString("bio");
			                	   String gbio=rs1.getString("gbio");
			                	   String gs=rs1.getString("gs");
			                	   String ggs=rs1.getString("ggs");
			                	   String bam=rs1.getString("bam");
			                	   String gbam=rs1.getString("gbam");
			                	   
			                	   Image im=Image.getInstance("other.png");
					         	    mudi.setWidthPercentage(105);
					         	    cell = new PdfPCell(im,false);
								    cell.setColspan(4);
								    cell.setHorizontalAlignment(1);
								    mudi.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
				                     
								    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
					                     cell=new PdfPCell(new Phrase("JINA:       "+rs2.getString("first")+" "+rs2.getString("last")+"\nJINSIA:    "+rs2.getString("gender")+"\nDARASA:"+rs2.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
					      		    	   cell.setBorder(0);
					      		    	    cell.setColspan(4);
					                       mudi.addCell(cell);
			      		    	 
			      		  
			                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs2.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
			      		    	   cell.setBorder(0);
			      		    	    cell.setColspan(4);
			                       mudi.addCell(cell);
			                       
			                       cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
			                       
			                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								   // cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
	     						    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("GEOGRAPHY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(geo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggeo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("CHEMISTRY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(che, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gche, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("BIOLOGY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(bio, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(gbio, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
									    
												    cell = new PdfPCell(new Phrase("BAM", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(bam, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(gbam, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
										    
				                  
				      		       cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
				      		       cell.setHorizontalAlignment(1);
				      	    	     cell.setColspan(3);
				                   mudi.addCell(cell);
				                   
				                   cell=new PdfPCell(new Phrase(" "));
			                       cell.setBorder(0);
			                       cell.setColspan(3);
			                       mudi.addCell(cell);
			                       
				                  
				                   cell=new PdfPCell(new Phrase(area1.getText()));
				                   cell.setColspan(3);
				      		       cell.setBorder(0);
				      		      mudi.addCell(cell);
				                   
			                       cell=new PdfPCell(new Phrase(" "));
			                       cell.setBorder(0);
			                       cell.setColspan(3);
			                       mudi.addCell(cell);
			                	   
			                      
			                      
			                   }
							
						}
				    		
						PdfWriter.getInstance(document, new FileOutputStream("Report.pdf"));
						document.open();
						
						
						document.add(mudi);
						//document.add(new Paragraph(dt.format(timer.getTime())+"::"+df.format(timer.getTime() )) );
						
						document.close();
						JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
						Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"Report.pdf");

						
				    	 
				    	 
				     }catch(Exception ex) {
				    	 JOptionPane.showMessageDialog(null, "No User of that Records !");
				     }
				     finally {
							
							try {
								rs.close();
								ps.close();
								
								
							}catch(Exception ex) {
								
							}
							
						}
				
					
				}else {
					JOptionPane.showMessageDialog(null, "Can't Accept Empty Value !");
				}
				
				}
				
				
				
			}
	
		
		}});
	
	//////////////////////////////////
	
	orep.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			int result1 = JOptionPane.showConfirmDialog(null, panel4, "Edit ",
			        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
			if(result1==JOptionPane.OK_OPTION) {
				
				
				int result = JOptionPane.showConfirmDialog(null, panel, "Select ",
			            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
					
				if(result==JOptionPane.OK_OPTION){
					
					if(sch.getSelectedItem() != null &&!((String) sch.getSelectedItem()).trim().isEmpty() &&et.getSelectedItem() != null &&!((String) et.getSelectedItem()).trim().isEmpty() &&ct.getSelectedItem() != null &&!((String) ct.getSelectedItem()).trim().isEmpty() && ac.getSelectedItem() != null &&!((String) ac.getSelectedItem()).trim().isEmpty()) {
					
						String sql="update  text set  atext='"+area1.getText()+"' where rowid= '"+3+"'  ";
						try {
							ps=con.prepareStatement(sql);
							ps.execute();	
							//JOptionPane.showMessageDialog(b1,"Success !");
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						
						
					Document document=new Document();
					 PdfPTable mudi = new PdfPTable(3);
				     PdfPCell cell=new PdfPCell(new Phrase(""));
				     
				     mudi.setWidthPercentage(105);

				     
				     
				     cell.setColspan(3);
				     cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				     cell.setBackgroundColor(new BaseColor(255,250,205));
				     
				  //   JOptionPane.showMessageDialog(null,et.getSelectedItem().toString()+" "+ct.getSelectedItem().toString()+" "+ac.getSelectedItem().toString() );
				     
				     try {
				    	
				    	 String sqq="select * from mark00 where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"' and sch='"+sch.getSelectedItem().toString()+"' ";
						 ps=con.prepareStatement(sqq);
						 ResultSet rs1=ps.executeQuery();
						 
						 String sqqq="select * from user  where exam='"+et.getSelectedItem().toString()+"' and  class='"+ct.getSelectedItem().toString()+"' and year='"+ac.getSelectedItem().toString()+"'and sch='"+sch.getSelectedItem().toString()+"' ";
						 ps=con.prepareStatement(sqqq);
						// ResultSet rs2=ps.executeQuery();
						 
						 String pt=rs1.getString("point");
						 String gg="";String p ="";
						 
						while(rs1.next())		{
							
						    if((rs1.getString("combi").matches("PCM"))){
						    	
						    	if(rs1.getString("point").matches("Inc")) {
					    			p="--";//count++;
					    		}else {
					    			int mark=Integer.parseInt(rs1.getString("point"));
						    		
						    		if(mark>=3 && mark<=9) {
						    			p="I";//count1++;
						    		}else if(mark>=10 && mark<=12) {
						    			p="II";//count2++;
						    		}else if(mark>=13 && mark<=17) {
						    			p="III";//count3++;
						    		}
						    		else if(mark>=18 && mark<=19) {
						    			p="IV";//count4++;
						    		}else if(mark>=20 && mark<=21) {
						    			p="O";//count0++;
					    		}
					    		
					    		}
					    				
			                	   String phy=rs1.getString("phy");
			                	   String gphy=rs1.getString("gphy");
			                	   String che=rs1.getString("che");
			                	   String gche=rs1.getString("gche");
			                	   String math=rs1.getString("math");
			                	   String gmath=rs1.getString("gmath");
			                	   String gs=rs1.getString("gs");
			                	   String ggs=rs1.getString("ggs");
			                	   
			                	   Image im=Image.getInstance("other.png");
					         	    mudi.setWidthPercentage(105);
					         	    cell = new PdfPCell(im,false);
								    cell.setColspan(4);
								    cell.setHorizontalAlignment(1);
								    mudi.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
				                     
								    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+"       "+sch.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("\n\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
					                     cell=new PdfPCell(new Phrase("JINA:       "+rs1.getString("first")+" "+rs1.getString("last")+"\nJINSIA:    "+rs1.getString("gender")+"\nDARASA:"+rs1.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
					      		    	   cell.setBorder(0);
					      		    	    cell.setColspan(4);
					                       mudi.addCell(cell);
			      		    	 
			      		  
			                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs1.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
			      		    	   cell.setBorder(0);
			      		    	    cell.setColspan(4);
			                       mudi.addCell(cell);
			                       
			                       cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
			                       
			                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								   // cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
	     						    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("PHYSICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(phy, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gphy, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("CHEMISTRY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(che, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gche, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("ADV / MATHEMATICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(math, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(gmath, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
									    
				                  
				      		       cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
				      		       cell.setHorizontalAlignment(1);
				      	    	     cell.setColspan(3);
				                   mudi.addCell(cell);
				                   
				                   cell=new PdfPCell(new Phrase("\n"));
			                       cell.setBorder(0);
			                       cell.setColspan(3);
			                       mudi.addCell(cell);
			                       
				                  
				                   cell=new PdfPCell(new Phrase(area1.getText()));
				                   cell.setColspan(3);
				      		       cell.setBorder(0);
				      		      mudi.addCell(cell);
				                   
			                       cell=new PdfPCell(new Phrase(" "));
			                       cell.setBorder(0);
			                       cell.setColspan(3);
			                       mudi.addCell(cell);
			                       
			                	   
			                      
			                   }
						    
							
		                       if((rs1.getString("combi").matches("PCB"))){
						    	
						    	if(rs1.getString("point").matches("Inc")) {
					    			p="Inc";//count++;
					    		}else {
					    			int mark=Integer.parseInt(rs1.getString("point"));
						    		
						    		if(mark>=3 && mark<=9) {
						    			p="I";//count1++;
						    		}else if(mark>=10 && mark<=12) {
						    			p="II";//count2++;
						    		}else if(mark>=13 && mark<=17) {
						    			p="III";//count3++;
						    		}
						    		else if(mark>=18 && mark<=19) {
						    			p="IV";//count4++;
						    		}else if(mark>=20 && mark<=21) {
						    			p="O";//count0++;
					    		}
					    		
					    		}
					    				
			                	   String phy=rs1.getString("phy");
			                	   String gphy=rs1.getString("gphy");
			                	   String che=rs1.getString("che");
			                	   String gche=rs1.getString("gche");
			                	   String bio=rs1.getString("bio");
			                	   String gbio=rs1.getString("gbio");
			                	   String gs=rs1.getString("gs");
			                	   String ggs=rs1.getString("ggs");
			                	   String bam=rs1.getString("bam");
			                	   String gbam=rs1.getString("gbam");
			                	   
			                	   Image im=Image.getInstance("other.png");
					         	    mudi.setWidthPercentage(105);
					         	    cell = new PdfPCell(im,false);
								    cell.setColspan(4);
								    cell.setHorizontalAlignment(1);
								    mudi.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
				                     
								    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
					                     cell=new PdfPCell(new Phrase("JINA:       "+rs1.getString("first")+" "+rs1.getString("last")+"\nJINSIA:    "+rs1.getString("gender")+"\nDARASA:"+rs1.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
					      		    	   cell.setBorder(0);
					      		    	    cell.setColspan(4);
					                       mudi.addCell(cell);
			      		    	 
			      		  
			                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs1.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
			      		    	   cell.setBorder(0);
			      		    	    cell.setColspan(4);
			                       mudi.addCell(cell);
			                       
			                       cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
			                       
			                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								   // cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
	     						    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("PHYSICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(phy, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gphy, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("CHEMISTRY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(che, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gche, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("BIOLOGY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(bio, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(gbio, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
									    
												    cell = new PdfPCell(new Phrase("BAM", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(bam, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(gbam, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
										    
				                  
				      		       cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
				      		       cell.setHorizontalAlignment(1);
				      	    	     cell.setColspan(3);
				                   mudi.addCell(cell);
				                   
				                   cell=new PdfPCell(new Phrase(" "));
			                       cell.setBorder(0);
			                       cell.setColspan(3);
			                       mudi.addCell(cell);
			                       
				                  
				                   cell=new PdfPCell(new Phrase(area1.getText()));
				                   cell.setColspan(3);
				      		       cell.setBorder(0);
				      		      mudi.addCell(cell);
				                   
			                       cell=new PdfPCell(new Phrase(" "));
			                       cell.setBorder(0);
			                       cell.setColspan(3);
			                       mudi.addCell(cell);
			                	   
			                      
			                   }
		                       
		                       if((rs1.getString("combi").matches("PGM"))){
		   				    	
		   				    	if(rs1.getString("point").matches("Inc")) {
		   			    			p="Inc";//count++;
		   			    		}else {
		   			    			int mark=Integer.parseInt(rs1.getString("point"));
		   				    		
		   				    		if(mark>=3 && mark<=9) {
		   				    			p="I";//count1++;
		   				    		}else if(mark>=10 && mark<=12) {
		   				    			p="II";//count2++;
		   				    		}else if(mark>=13 && mark<=17) {
		   				    			p="III";//count3++;
		   				    		}
		   				    		else if(mark>=18 && mark<=19) {
		   				    			p="IV";//count4++;
		   				    		}else if(mark>=20 && mark<=21) {
		   				    			p="O";//count0++;
		   			    		}
		   			    		
		   			    		}
		   			    				
		   	                	   String phy=rs1.getString("phy");
		   	                	   String gphy=rs1.getString("gphy");
		   	                	   String geo=rs1.getString("geo");
		   	                	   String ggeo=rs1.getString("ggeo");
		   	                	   String math=rs1.getString("math");
		   	                	   String gmath=rs1.getString("gmath");
		   	                	   String gs=rs1.getString("gs");
		   	                	   String ggs=rs1.getString("ggs");
		   	                	   
		   	                	   Image im=Image.getInstance("other.png");
					         	    mudi.setWidthPercentage(105);
					         	    cell = new PdfPCell(im,false);
								    cell.setColspan(4);
								    cell.setHorizontalAlignment(1);
								    mudi.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
				                     
								    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("\n\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
					                     cell=new PdfPCell(new Phrase("JINA:       "+rs1.getString("first")+" "+rs1.getString("last")+"\nJINSIA:    "+rs1.getString("gender")+"\nDARASA:"+rs1.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
					      		    	   cell.setBorder(0);
					      		    	    cell.setColspan(4);
					                       mudi.addCell(cell);
			      		    	 
			      		  
			                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs1.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
			      		    	   cell.setBorder(0);
			      		    	    cell.setColspan(4);
			                       mudi.addCell(cell);
			                       
			                       cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
			                       
			                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								   // cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
	     						    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("PHYSICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(phy, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gphy, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("GEOGRAPHY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(geo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(ggeo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("ADV / MATHEMATICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(math, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(gmath, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
									    
				                  
				      		       cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
				      		       cell.setHorizontalAlignment(1);
				      	    	     cell.setColspan(3);
				                   mudi.addCell(cell);
				                   
				                   cell=new PdfPCell(new Phrase("\n"));
			                       cell.setBorder(0);
			                       cell.setColspan(3);
			                       mudi.addCell(cell);
			                       
				                  
				                   cell=new PdfPCell(new Phrase(area1.getText()));
				                   cell.setColspan(3);
				      		       cell.setBorder(0);
				      		      mudi.addCell(cell);
				                   
			                       cell=new PdfPCell(new Phrase(" "));
			                       cell.setBorder(0);
			                       cell.setColspan(3);
			                       mudi.addCell(cell);
		   	                      
		   	                   }
		                       if((rs1.getString("combi").matches("EGM"))){
			   				    	
			   				    	if(rs1.getString("point").matches("Inc")) {
			   			    			p="Inc";//count++;
			   			    		}else {
			   			    			int mark=Integer.parseInt(rs1.getString("point"));
			   				    		
			   				    		if(mark>=3 && mark<=9) {
			   				    			p="I";//count1++;
			   				    		}else if(mark>=10 && mark<=12) {
			   				    			p="II";//count2++;
			   				    		}else if(mark>=13 && mark<=17) {
			   				    			p="III";//count3++;
			   				    		}
			   				    		else if(mark>=18 && mark<=19) {
			   				    			p="IV";//count4++;
			   				    		}else if(mark>=20 && mark<=21) {
			   				    			p="O";//count0++;
			   			    		}
			   			    		
			   			    		}
			   			    				
			   	                	   String ec=rs1.getString("ec");
			   	                	   String gec=rs1.getString("gec");
			   	                	   String geo=rs1.getString("geo");
			   	                	   String ggeo=rs1.getString("ggeo");
			   	                	   String math=rs1.getString("math");
			   	                	   String gmath=rs1.getString("gmath");
			   	                	   String gs=rs1.getString("gs");
			   	                	   String ggs=rs1.getString("ggs");
			   	                	   
			   	                	   Image im=Image.getInstance("other.png");
						         	    mudi.setWidthPercentage(105);
						         	    cell = new PdfPCell(im,false);
									    cell.setColspan(4);
									    cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
					                     
									    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("\n\n\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
						                     cell=new PdfPCell(new Phrase("JINA:       "+rs1.getString("first")+" "+rs1.getString("last")+"\nJINSIA:    "+rs1.getString("gender")+"\nDARASA:"+rs1.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
						      		    	   cell.setBorder(0);
						      		    	    cell.setColspan(4);
						                       mudi.addCell(cell);
				      		    	 
				      		  
				                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs1.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
				      		    	   cell.setBorder(0);
				      		    	    cell.setColspan(4);
				                       mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("ECONOMICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(ec, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gec, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("GEOGRAPHY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(geo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(ggeo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("ADV / MATHEMATICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(math, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(gmath, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
										    
					                  
					      		       cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
					      		       cell.setHorizontalAlignment(1);
					      	    	     cell.setColspan(3);
					                   mudi.addCell(cell);
					                   
					                   cell=new PdfPCell(new Phrase("\n"));
				                       cell.setBorder(0);
				                       cell.setColspan(3);
				                       mudi.addCell(cell);
				                       
					                  
					                   cell=new PdfPCell(new Phrase(area1.getText()));
					                   cell.setColspan(3);
					      		       cell.setBorder(0);
					      		      mudi.addCell(cell);
					                   
				                       cell=new PdfPCell(new Phrase(" "));
				                       cell.setBorder(0);
				                       cell.setColspan(3);
				                       mudi.addCell(cell);
			   	                      
			   	                   }
		                       if((rs1.getString("combi").matches("ECA"))){
			   				    	
			   				    	if(rs1.getString("point").matches("Inc")) {
			   			    			p="Inc";//count++;
			   			    		}else {
			   			    			int mark=Integer.parseInt(rs1.getString("point"));
			   				    		
			   				    		if(mark>=3 && mark<=9) {
			   				    			p="I";//count1++;
			   				    		}else if(mark>=10 && mark<=12) {
			   				    			p="II";//count2++;
			   				    		}else if(mark>=13 && mark<=17) {
			   				    			p="III";//count3++;
			   				    		}
			   				    		else if(mark>=18 && mark<=19) {
			   				    			p="IV";//count4++;
			   				    		}else if(mark>=20 && mark<=21) {
			   				    			p="O";//count0++;
			   			    		}
			   			    		
			   			    		}
			   			    				
			   	                	   String ec=rs1.getString("ec");
			   	                	   String gec=rs1.getString("gec");
			   	                	   String co=rs1.getString("co");
			   	                	   String gco=rs1.getString("gco");
			   	                	   String aco=rs1.getString("aco");
			   	                	   String gaco=rs1.getString("gaco");
			   	                	   String gs=rs1.getString("gs");
			   	                	   String ggs=rs1.getString("ggs");
			   	                	   String bam=rs1.getString("bam");
			   	                	   String gbam=rs1.getString("gbam");
			   	                	   
			   	                	  
			   	                	   Image im=Image.getInstance("other.png");
						         	    mudi.setWidthPercentage(105);
						         	    cell = new PdfPCell(im,false);
									    cell.setColspan(4);
									    cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
					                     
									    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("\n\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
						                     cell=new PdfPCell(new Phrase("JINA:       "+rs1.getString("first")+" "+rs1.getString("last")+"\nJINSIA:    "+rs1.getString("gender")+"\nDARASA:"+rs1.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
						      		    	   cell.setBorder(0);
						      		    	    cell.setColspan(4);
						                       mudi.addCell(cell);
				      		    	 
				      		  
				                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs1.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
				      		    	   cell.setBorder(0);
				      		    	    cell.setColspan(4);
				                       mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("ECONOMICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(ec, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gec, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("COMMERCE", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(co, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(gco, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("ACCOUNTANCY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(aco, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(gaco, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    
													    cell = new PdfPCell(new Phrase("BAM", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
														   // cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
														    cell = new PdfPCell(new Phrase(bam, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
														    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
														    cell = new PdfPCell(new Phrase(gbam, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
							     						    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
											    
										    
					                  
					      		       cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
					      		       cell.setHorizontalAlignment(1);
					      	    	     cell.setColspan(3);
					                   mudi.addCell(cell);
					                   
					                   cell=new PdfPCell(new Phrase("\n"));
				                       cell.setBorder(0);
				                       cell.setColspan(3);
				                       mudi.addCell(cell);
				                       
					                  
					                   cell=new PdfPCell(new Phrase(area1.getText()));
					                   cell.setColspan(3);
					      		       cell.setBorder(0);
					      		      mudi.addCell(cell);
					                   
				                       cell=new PdfPCell(new Phrase(" "));
				                       cell.setBorder(0);
				                       cell.setColspan(3);
				                       mudi.addCell(cell);
			   	                   }
		                       if((rs1.getString("combi").matches("HGE"))){
			   				    	
			   				    	if(rs1.getString("point").matches("Inc")) {
			   			    			p="Inc";//count++;
			   			    		}else {
			   			    			int mark=Integer.parseInt(rs1.getString("point"));
			   				    		
			   				    		if(mark>=3 && mark<=9) {
			   				    			p="I";//count1++;
			   				    		}else if(mark>=10 && mark<=12) {
			   				    			p="II";//count2++;
			   				    		}else if(mark>=13 && mark<=17) {
			   				    			p="III";//count3++;
			   				    		}
			   				    		else if(mark>=18 && mark<=19) {
			   				    			p="IV";//count4++;
			   				    		}else if(mark>=20 && mark<=21) {
			   				    			p="O";//count0++;
			   			    		}
			   			    		
			   			    		}
			   			    				
			   	                	   String ec=rs1.getString("ec");
			   	                	   String gec=rs1.getString("gec");
			   	                	   String geo=rs1.getString("geo");
			   	                	   String ggeo=rs1.getString("ggeo");
			   	                	   String his=rs1.getString("his");
			   	                	   String ghis=rs1.getString("ghis");
			   	                	   String gs=rs1.getString("gs");
			   	                	   String ggs=rs1.getString("ggs");
			   	                	 String bam=rs1.getString("bam");
			   	                	   String gbam=rs1.getString("gbam");
			   	                	 
			   	                	   Image im=Image.getInstance("other.png");
						         	    mudi.setWidthPercentage(105);
						         	    cell = new PdfPCell(im,false);
									    cell.setColspan(4);
									    cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
					                     
									    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("\n\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
						                     cell=new PdfPCell(new Phrase("JINA:       "+rs1.getString("first")+" "+rs1.getString("last")+"\nJINSIA:    "+rs1.getString("gender")+"\nDARASA:"+rs1.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
						      		    	   cell.setBorder(0);
						      		    	    cell.setColspan(4);
						                       mudi.addCell(cell);
				      		    	 
				      		  
				                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs1.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
				      		    	   cell.setBorder(0);
				      		    	    cell.setColspan(4);
				                       mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("ECONOMICS", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(ec, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gec, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("GEOGRAPHY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(geo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(ggeo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("HISTORY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(his, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(ghis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
										    
													    
													    cell = new PdfPCell(new Phrase("BAM", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
														   // cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
														    cell = new PdfPCell(new Phrase(bam, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
														    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
														    cell = new PdfPCell(new Phrase(gbam, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
							     						    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
											    
					                  
					      		       cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
					      		       cell.setHorizontalAlignment(1);
					      	    	     cell.setColspan(3);
					                   mudi.addCell(cell);
					                   
					                   cell=new PdfPCell(new Phrase("\n"));
				                       cell.setBorder(0);
				                       cell.setColspan(3);
				                       mudi.addCell(cell);
				                       
					                  
					                   cell=new PdfPCell(new Phrase(area1.getText()));
					                   cell.setColspan(3);
					      		       cell.setBorder(0);
					      		      mudi.addCell(cell);
					                   
				                       cell=new PdfPCell(new Phrase(" "));
				                       cell.setBorder(0);
				                       cell.setColspan(3);
				                       mudi.addCell(cell);
			   	                      
			   	                      
			   	                   }
		                       if((rs1.getString("combi").matches("HGL"))){
			   				    	
			   				    	if(rs1.getString("point").matches("Inc")) {
			   			    			p="Inc";//count++;
			   			    		}else {
			   			    			int mark=Integer.parseInt(rs1.getString("point"));
			   				    		
			   				    		if(mark>=3 && mark<=9) {
			   				    			p="I";//count1++;
			   				    		}else if(mark>=10 && mark<=12) {
			   				    			p="II";//count2++;
			   				    		}else if(mark>=13 && mark<=17) {
			   				    			p="III";//count3++;
			   				    		}
			   				    		else if(mark>=18 && mark<=19) {
			   				    			p="IV";//count4++;
			   				    		}else if(mark>=20 && mark<=21) {
			   				    			p="O";//count0++;
			   			    		}
			   			    		
			   			    		}
			   			    				
			   	                	   String lan=rs1.getString("lan");
			   	                	   String glan=rs1.getString("glan");
			   	                	   String geo=rs1.getString("geo");
			   	                	   String ggeo=rs1.getString("ggeo");
			   	                	   String his=rs1.getString("his");
			   	                	   String ghis=rs1.getString("ghis");
			   	                	   String gs=rs1.getString("gs");
			   	                	   String ggs=rs1.getString("ggs");
			   	                	   
			   	                	 Image im=Image.getInstance("other.png");
						         	    mudi.setWidthPercentage(105);
						         	    cell = new PdfPCell(im,false);
									    cell.setColspan(4);
									    cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
					                     
									    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("\n\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
						                     cell=new PdfPCell(new Phrase("JINA:       "+rs1.getString("first")+" "+rs1.getString("last")+"\nJINSIA:    "+rs1.getString("gender")+"\nDARASA:"+rs1.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
						      		    	   cell.setBorder(0);
						      		    	    cell.setColspan(4);
						                       mudi.addCell(cell);
				      		    	 
				      		  
				                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs1.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
				      		    	   cell.setBorder(0);
				      		    	    cell.setColspan(4);
				                       mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("LANGUAGE", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(lan, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(glan, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("GEOGRAPHY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(geo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(ggeo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("HISTORY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(his, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(ghis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    
													    cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
										      		       cell.setHorizontalAlignment(1);
										      	    	     cell.setColspan(3);
										                   mudi.addCell(cell);
										                   
										                   cell=new PdfPCell(new Phrase("\n"));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
									                       
										                  
										                   cell=new PdfPCell(new Phrase(area1.getText()));
										                   cell.setColspan(3);
										      		       cell.setBorder(0);
										      		      mudi.addCell(cell);
										                   
									                       cell=new PdfPCell(new Phrase(" "));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
										    
			   	                      
			   	                   }
		                       if((rs1.getString("combi").matches("HGK"))){
			   				    	
			   				    	if(rs1.getString("point").matches("Inc")) {
			   			    			p="Inc";//count++;
			   			    		}else {
			   			    			int mark=Integer.parseInt(rs1.getString("point"));
			   				    		
			   				    		if(mark>=3 && mark<=9) {
			   				    			p="I";//count1++;
			   				    		}else if(mark>=10 && mark<=12) {
			   				    			p="II";//count2++;
			   				    		}else if(mark>=13 && mark<=17) {
			   				    			p="III";//count3++;
			   				    		}
			   				    		else if(mark>=18 && mark<=19) {
			   				    			p="IV";//count4++;
			   				    		}else if(mark>=20 && mark<=21) {
			   				    			p="O";//count0++;
			   			    		}
			   			    		
			   			    		}
			   			    				
			   	                	   String kis=rs1.getString("kis");
			   	                	   String gkis=rs1.getString("gkis");
			   	                	   String geo=rs1.getString("geo");
			   	                	   String ggeo=rs1.getString("ggeo");
			   	                	   String his=rs1.getString("his");
			   	                	   String ghis=rs1.getString("ghis");
			   	                	   String gs=rs1.getString("gs");
			   	                	   String ggs=rs1.getString("ggs");
			   	                	   
			   	                	   
			   	                	  
				   	                	 Image im=Image.getInstance("other.png");
							         	    mudi.setWidthPercentage(105);
							         	    cell = new PdfPCell(im,false);
										    cell.setColspan(4);
										    cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("\n"));
										    cell.setBorder(0);
										    cell.setColspan(4);
										    mudi.addCell(cell);
										    
										    
										    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
										    cell.setBorder(0);
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(4);
										    mudi.addCell(cell);
										    
										    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
										    cell.setBorder(0);
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(4);
										    mudi.addCell(cell);
						                     
										    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
										    cell.setBorder(0);
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(4);
										    mudi.addCell(cell);
										    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
										    cell.setBorder(0);
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(4);
										    mudi.addCell(cell);
										    
										    
										    cell = new PdfPCell(new Phrase("\n\n"));
										    cell.setBorder(0);
										    cell.setColspan(4);
										    mudi.addCell(cell);
										    
							                     cell=new PdfPCell(new Phrase("JINA:       "+rs1.getString("first")+" "+rs1.getString("last")+"\nJINSIA:    "+rs1.getString("gender")+"\nDARASA:"+rs1.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
							      		    	   cell.setBorder(0);
							      		    	    cell.setColspan(4);
							                       mudi.addCell(cell);
					      		    	 
					      		  
					                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs1.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
					      		    	   cell.setBorder(0);
					      		    	    cell.setColspan(4);
					                       mudi.addCell(cell);
					                       
					                       cell = new PdfPCell(new Phrase("\n"));
										    cell.setBorder(0);
										    cell.setColspan(4);
										    mudi.addCell(cell);
					                       
					                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    
										    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(kis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(gkis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("GEOGRAPHY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(geo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(ggeo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    
													    cell = new PdfPCell(new Phrase("HISTORY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
														   // cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
														    cell = new PdfPCell(new Phrase(his, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
														    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
														    cell = new PdfPCell(new Phrase(ghis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
							     						    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
														    
														    cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
											      		       cell.setHorizontalAlignment(1);
											      	    	     cell.setColspan(3);
											                   mudi.addCell(cell);
											                   
											                   cell=new PdfPCell(new Phrase("\n"));
										                       cell.setBorder(0);
										                       cell.setColspan(3);
										                       mudi.addCell(cell);
										                       
											                  
											                   cell=new PdfPCell(new Phrase(area1.getText()));
											                   cell.setColspan(3);
											      		       cell.setBorder(0);
											      		      mudi.addCell(cell);
											                   
										                       cell=new PdfPCell(new Phrase(" "));
										                       cell.setBorder(0);
										                       cell.setColspan(3);
										                       mudi.addCell(cell);
											    
			   	                      
			   	                   }
		                       if((rs1.getString("combi").matches("GKL"))){
			   				    	
			   				    	if(rs1.getString("point").matches("Inc")) {
			   			    			p="Inc";//count++;
			   			    		}else {
			   			    			int mark=Integer.parseInt(rs1.getString("point"));
			   				    		
			   				    		if(mark>=3 && mark<=9) {
			   				    			p="I";//count1++;
			   				    		}else if(mark>=10 && mark<=12) {
			   				    			p="II";//count2++;
			   				    		}else if(mark>=13 && mark<=17) {
			   				    			p="III";//count3++;
			   				    		}
			   				    		else if(mark>=18 && mark<=19) {
			   				    			p="IV";//count4++;
			   				    		}else if(mark>=20 && mark<=21) {
			   				    			p="O";//count0++;
			   			    		}
			   			    		
			   			    		}
			   			    				
			   	                	   String kis=rs1.getString("kis");
			   	                	   String gkis=rs1.getString("gkis");
			   	                	   String geo=rs1.getString("geo");
			   	                	   String ggeo=rs1.getString("ggeo");
			   	                	   String lan=rs1.getString("lan");
			   	                	   String glan=rs1.getString("glan");
			   	                	   String gs=rs1.getString("gs");
			   	                	   String ggs=rs1.getString("ggs");
			   	                	   
			   	                	   
			   	                	   
			   	                	 Image im=Image.getInstance("other.png");
						         	    mudi.setWidthPercentage(105);
						         	    cell = new PdfPCell(im,false);
									    cell.setColspan(4);
									    cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
					                     
									    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("\n\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
						                     cell=new PdfPCell(new Phrase("JINA:       "+rs1.getString("first")+" "+rs1.getString("last")+"\nJINSIA:    "+rs1.getString("gender")+"\nDARASA:"+rs1.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
						      		    	   cell.setBorder(0);
						      		    	    cell.setColspan(4);
						                       mudi.addCell(cell);
				      		    	 
				      		  
				                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs1.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
				      		    	   cell.setBorder(0);
				      		    	    cell.setColspan(4);
				                       mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(kis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gkis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("GEOGRAPHY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(geo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(ggeo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("LANGUAGE", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(lan, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(glan, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    
													    cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
										      		       cell.setHorizontalAlignment(1);
										      	    	     cell.setColspan(3);
										                   mudi.addCell(cell);
										                   
										                   cell=new PdfPCell(new Phrase("\n"));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
									                       
										                  
										                   cell=new PdfPCell(new Phrase(area1.getText()));
										                   cell.setColspan(3);
										      		       cell.setBorder(0);
										      		      mudi.addCell(cell);
										                   
									                       cell=new PdfPCell(new Phrase(" "));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
										    
			   	                      
			   	                   }
		                       if((rs1.getString("combi").matches("HKL"))){
			   				    	
			   				    	if(rs1.getString("point").matches("Inc")) {
			   			    			p="Inc";//count++;
			   			    		}else {
			   			    			int mark=Integer.parseInt(rs1.getString("point"));
			   				    		
			   				    		if(mark>=3 && mark<=9) {
			   				    			p="I";//count1++;
			   				    		}else if(mark>=10 && mark<=12) {
			   				    			p="II";//count2++;
			   				    		}else if(mark>=13 && mark<=17) {
			   				    			p="III";//count3++;
			   				    		}
			   				    		else if(mark>=18 && mark<=19) {
			   				    			p="IV";//count4++;
			   				    		}else if(mark>=20 && mark<=21) {
			   				    			p="O";//count0++;
			   			    		}
			   			    		
			   			    		}
			   			    				
			   	                	   String kis=rs1.getString("kis");
			   	                	   String gkis=rs1.getString("gkis");
			   	                	   String his=rs1.getString("his");
			   	                	   String ghis=rs1.getString("ghis");
			   	                	   String lan=rs1.getString("lan");
			   	                	   String glan=rs1.getString("glan");
			   	                	   String gs=rs1.getString("gs");
			   	                	   String ggs=rs1.getString("ggs");
			   	                	   
			   	                	 Image im=Image.getInstance("other.png");
						         	    mudi.setWidthPercentage(105);
						         	    cell = new PdfPCell(im,false);
									    cell.setColspan(4);
									    cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
					                     
									    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("\n\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
						                     cell=new PdfPCell(new Phrase("JINA:       "+rs1.getString("first")+" "+rs1.getString("last")+"\nJINSIA:    "+rs1.getString("gender")+"\nDARASA:"+rs1.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
						      		    	   cell.setBorder(0);
						      		    	    cell.setColspan(4);
						                       mudi.addCell(cell);
				      		    	 
				      		  
				                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs1.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
				      		    	   cell.setBorder(0);
				      		    	    cell.setColspan(4);
				                       mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("LANGUAGE", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(lan, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(glan, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(kis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(gkis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("HISTORY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(his, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(ghis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    
													    cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
										      		       cell.setHorizontalAlignment(1);
										      	    	     cell.setColspan(3);
										                   mudi.addCell(cell);
										                   
										                   cell=new PdfPCell(new Phrase("\n"));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
									                       
										                  
										                   cell=new PdfPCell(new Phrase(area1.getText()));
										                   cell.setColspan(3);
										      		       cell.setBorder(0);
										      		      mudi.addCell(cell);
										                   
									                       cell=new PdfPCell(new Phrase(" "));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
			   	                	   
			   	                      
			   	                   }
		                       
		                       
		                       if((rs1.getString("combi").matches("HKA"))){
			   				    	
			   				    	if(rs1.getString("point").matches("Inc")) {
			   			    			p="Inc";//count++;
			   			    		}else {
			   			    			int mark=Integer.parseInt(rs1.getString("point"));
			   				    		
			   				    		if(mark>=3 && mark<=9) {
			   				    			p="I";//count1++;
			   				    		}else if(mark>=10 && mark<=12) {
			   				    			p="II";//count2++;
			   				    		}else if(mark>=13 && mark<=17) {
			   				    			p="III";//count3++;
			   				    		}
			   				    		else if(mark>=18 && mark<=19) {
			   				    			p="IV";//count4++;
			   				    		}else if(mark>=20 && mark<=21) {
			   				    			p="O";//count0++;
			   			    		}
			   			    		
			   			    		}
			   			    				
			   	                	   String kis=rs1.getString("kis");
			   	                	   String gkis=rs1.getString("gkis");
			   	                	   String his=rs1.getString("his");
			   	                	   String ghis=rs1.getString("ghis");
			   	                	   String ara=rs1.getString("ara");
			   	                	   String gara=rs1.getString("gara");
			   	                	   String gs=rs1.getString("gs");
			   	                	   String ggs=rs1.getString("ggs");
			   	                	   
			   	                	 Image im=Image.getInstance("other.png");
						         	    mudi.setWidthPercentage(105);
						         	    cell = new PdfPCell(im,false);
									    cell.setColspan(4);
									    cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
					                     
									    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("\n\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
						                     cell=new PdfPCell(new Phrase("JINA:       "+rs1.getString("first")+" "+rs1.getString("last")+"\nJINSIA:    "+rs1.getString("gender")+"\nDARASA:"+rs1.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
						      		    	   cell.setBorder(0);
						      		    	    cell.setColspan(4);
						                       mudi.addCell(cell);
				      		    	 
				      		  
				                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs1.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
				      		    	   cell.setBorder(0);
				      		    	    cell.setColspan(4);
				                       mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("ARABIC", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(ara, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gara, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(kis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(gkis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("HISTORY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(his, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(ghis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    
													    cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
										      		       cell.setHorizontalAlignment(1);
										      	    	     cell.setColspan(3);
										                   mudi.addCell(cell);
										                   
										                   cell=new PdfPCell(new Phrase("\n"));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
									                       
										                  
										                   cell=new PdfPCell(new Phrase(area1.getText()));
										                   cell.setColspan(3);
										      		       cell.setBorder(0);
										      		      mudi.addCell(cell);
										                   
									                       cell=new PdfPCell(new Phrase(" "));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
			   	                	   
			   	                      
			   	                   }
		                       
		                       if((rs1.getString("combi").matches("IKA"))){
			   				    	
			   				    	if(rs1.getString("point").matches("Inc")) {
			   			    			p="Inc";//count++;
			   			    		}else {
			   			    			int mark=Integer.parseInt(rs1.getString("point"));
			   				    		
			   				    		if(mark>=3 && mark<=9) {
			   				    			p="I";//count1++;
			   				    		}else if(mark>=10 && mark<=12) {
			   				    			p="II";//count2++;
			   				    		}else if(mark>=13 && mark<=17) {
			   				    			p="III";//count3++;
			   				    		}
			   				    		else if(mark>=18 && mark<=19) {
			   				    			p="IV";//count4++;
			   				    		}else if(mark>=20 && mark<=21) {
			   				    			p="O";//count0++;
			   			    		}
			   			    		
			   			    		}
			   			    				
			   	                	   String kis=rs1.getString("kis");
			   	                	   String gkis=rs1.getString("gkis");
			   	                	   String dini=rs1.getString("dini");
			   	                	   String gdini=rs1.getString("gdini");
			   	                	   String ara=rs1.getString("ara");
			   	                	   String gara=rs1.getString("gara");
			   	                	   String gs=rs1.getString("gs");
			   	                	   String ggs=rs1.getString("ggs");
			   	                	   
			   	                	 Image im=Image.getInstance("other.png");
						         	    mudi.setWidthPercentage(105);
						         	    cell = new PdfPCell(im,false);
									    cell.setColspan(4);
									    cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
					                     
									    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("\n\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
						                     cell=new PdfPCell(new Phrase("JINA:       "+rs1.getString("first")+" "+rs1.getString("last")+"\nJINSIA:    "+rs1.getString("gender")+"\nDARASA:"+rs1.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
						      		    	   cell.setBorder(0);
						      		    	    cell.setColspan(4);
						                       mudi.addCell(cell);
				      		    	 
				      		  
				                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs1.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
				      		    	   cell.setBorder(0);
				      		    	    cell.setColspan(4);
				                       mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("I/KNOWLEDGE", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(dini, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gdini, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(kis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(gkis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("ARABIC", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(ara, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(gara, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    
													    cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
										      		       cell.setHorizontalAlignment(1);
										      	    	     cell.setColspan(3);
										                   mudi.addCell(cell);
										                   
										                   cell=new PdfPCell(new Phrase("\n"));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
									                       
										                  
										                   cell=new PdfPCell(new Phrase(area1.getText()));
										                   cell.setColspan(3);
										      		       cell.setBorder(0);
										      		      mudi.addCell(cell);
										                   
									                       cell=new PdfPCell(new Phrase(" "));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
			   	                	   
			   	                      
			   	                   }
		                       if((rs1.getString("combi").matches("IKL"))){
			   				    	
			   				    	if(rs1.getString("point").matches("Inc")) {
			   			    			p="Inc";//count++;
			   			    		}else {
			   			    			int mark=Integer.parseInt(rs1.getString("point"));
			   				    		
			   				    		if(mark>=3 && mark<=9) {
			   				    			p="I";//count1++;
			   				    		}else if(mark>=10 && mark<=12) {
			   				    			p="II";//count2++;
			   				    		}else if(mark>=13 && mark<=17) {
			   				    			p="III";//count3++;
			   				    		}
			   				    		else if(mark>=18 && mark<=19) {
			   				    			p="IV";//count4++;
			   				    		}else if(mark>=20 && mark<=21) {
			   				    			p="O";//count0++;
			   			    		}
			   			    		
			   			    		}
			   			    				
			   	                	   String kis=rs1.getString("kis");
			   	                	   String gkis=rs1.getString("gkis");
			   	                	   String dini=rs1.getString("dini");
			   	                	   String gdini=rs1.getString("gdini");
			   	                	   String lan=rs1.getString("lan");
			   	                	   String glan=rs1.getString("glan");
			   	                	   String gs=rs1.getString("gs");
			   	                	   String ggs=rs1.getString("ggs");
			   	                	   
			   	                	 Image im=Image.getInstance("other.png");
						         	    mudi.setWidthPercentage(105);
						         	    cell = new PdfPCell(im,false);
									    cell.setColspan(4);
									    cell.setHorizontalAlignment(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
					                     
									    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									    cell.setBorder(0);
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("\n\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
									    
						                     cell=new PdfPCell(new Phrase("JINA:       "+rs1.getString("first")+" "+rs1.getString("last")+"\nJINSIA:    "+rs1.getString("gender")+"\nDARASA:"+rs1.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
						      		    	   cell.setBorder(0);
						      		    	    cell.setColspan(4);
						                       mudi.addCell(cell);
				      		    	 
				      		  
				                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs1.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
				      		    	   cell.setBorder(0);
				      		    	    cell.setColspan(4);
				                       mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("\n"));
									    cell.setBorder(0);
									    cell.setColspan(4);
									    mudi.addCell(cell);
				                       
				                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    
									    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("I/KNOWLEDGE", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(dini, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gdini, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(kis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(gkis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("LANGUAGE", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(lan, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(glan, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    
													    cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
										      		       cell.setHorizontalAlignment(1);
										      	    	     cell.setColspan(3);
										                   mudi.addCell(cell);
										                   
										                   cell=new PdfPCell(new Phrase("\n"));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
									                       
										                  
										                   cell=new PdfPCell(new Phrase(area1.getText()));
										                   cell.setColspan(3);
										      		       cell.setBorder(0);
										      		      mudi.addCell(cell);
										                   
									                       cell=new PdfPCell(new Phrase(" "));
									                       cell.setBorder(0);
									                       cell.setColspan(3);
									                       mudi.addCell(cell);
			   	                	   
			   	                   }
		                       if((rs1.getString("combi").matches("KLA"))){
			   				    	
			   				    	if(rs1.getString("point").matches("Inc")) {
			   			    			p="Inc";//count++;
			   			    		}else {
			   			    			int mark=Integer.parseInt(rs1.getString("point"));
			   				    		
			   				    		if(mark>=3 && mark<=9) {
			   				    			p="I";//count1++;
			   				    		}else if(mark>=10 && mark<=12) {
			   				    			p="II";//count2++;
			   				    		}else if(mark>=13 && mark<=17) {
			   				    			p="III";//count3++;
			   				    		}
			   				    		else if(mark>=18 && mark<=19) {
			   				    			p="IV";//count4++;
			   				    		}else if(mark>=20 && mark<=21) {
			   				    			p="O";//count0++;
			   			    		}
			   			    		
			   			    		}
			   			    				
			   	                	   String kis=rs1.getString("kis");
			   	                	   String gkis=rs1.getString("gkis");
			   	                	   String ara=rs1.getString("ara");
			   	                	   String gara=rs1.getString("gara");
			   	                	   String lan=rs1.getString("lan");
			   	                	   String glan=rs1.getString("glan");
			   	                	   String gs=rs1.getString("gs");
			   	                	   String ggs=rs1.getString("ggs");
			   	                	   
			   	                	   
				   	                	 Image im=Image.getInstance("other.png");
							         	    mudi.setWidthPercentage(105);
							         	    cell = new PdfPCell(im,false);
										    cell.setColspan(4);
										    cell.setHorizontalAlignment(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("\n"));
										    cell.setBorder(0);
										    cell.setColspan(4);
										    mudi.addCell(cell);
										    
										    
										    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
										    cell.setBorder(0);
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(4);
										    mudi.addCell(cell);
										    
										    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
										    cell.setBorder(0);
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(4);
										    mudi.addCell(cell);
						                     
										    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
										    cell.setBorder(0);
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(4);
										    mudi.addCell(cell);
										    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
										    cell.setBorder(0);
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(4);
										    mudi.addCell(cell);
										    
										    
										    cell = new PdfPCell(new Phrase("\n\n"));
										    cell.setBorder(0);
										    cell.setColspan(4);
										    mudi.addCell(cell);
										    
							                     cell=new PdfPCell(new Phrase("JINA:       "+rs1.getString("first")+" "+rs1.getString("last")+"\nJINSIA:    "+rs1.getString("gender")+"\nDARASA:"+rs1.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
							      		    	   cell.setBorder(0);
							      		    	    cell.setColspan(4);
							                       mudi.addCell(cell);
					      		    	 
					      		  
					                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs1.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
					      		    	   cell.setBorder(0);
					      		    	    cell.setColspan(4);
					                       mudi.addCell(cell);
					                       
					                       cell = new PdfPCell(new Phrase("\n"));
										    cell.setBorder(0);
										    cell.setColspan(4);
										    mudi.addCell(cell);
					                       
					                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    
										    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("ARABIC", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(ara, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(gara, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    
												    cell = new PdfPCell(new Phrase("KISWAHILI", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(kis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(gkis, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    
													    cell = new PdfPCell(new Phrase("LANGUAGE", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
														   // cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
														    cell = new PdfPCell(new Phrase(lan, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
														    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
														    cell = new PdfPCell(new Phrase(glan, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
							     						    cell.setHorizontalAlignment(1);
														    cell.setColspan(1);
														    mudi.addCell(cell);
														    
														    cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
											      		       cell.setHorizontalAlignment(1);
											      	    	     cell.setColspan(3);
											                   mudi.addCell(cell);
											                   
											                   cell=new PdfPCell(new Phrase("\n"));
										                       cell.setBorder(0);
										                       cell.setColspan(3);
										                       mudi.addCell(cell);
										                       
											                  
											                   cell=new PdfPCell(new Phrase(area1.getText()));
											                   cell.setColspan(3);
											      		       cell.setBorder(0);
											      		      mudi.addCell(cell);
											                   
										                       cell=new PdfPCell(new Phrase(" "));
										                       cell.setBorder(0);
										                       cell.setColspan(3);
										                       mudi.addCell(cell);
				   	                	   
			   	                      
			   	                   }

		                       if((rs1.getString("combi").matches("CBG"))){
						    	
						    	if(rs1.getString("point").matches("Inc")) {
					    			p="Inc";//count++;
					    		}else {
					    			int mark=Integer.parseInt(rs1.getString("point"));
						    		
						    		if(mark>=3 && mark<=9) {
						    			p="I";//count1++;
						    		}else if(mark>=10 && mark<=12) {
						    			p="II";//count2++;
						    		}else if(mark>=13 && mark<=17) {
						    			p="III";//count3++;
						    		}
						    		else if(mark>=18 && mark<=19) {
						    			p="IV";//count4++;
						    		}else if(mark>=20 && mark<=21) {
						    			p="O";//count0++;
					    		}
					    		
					    		}
					    				
			                	   String geo=rs1.getString("geo");
			                	   String ggeo=rs1.getString("ggeo");
			                	   String che=rs1.getString("che");
			                	   String gche=rs1.getString("gche");
			                	   String bio=rs1.getString("bio");
			                	   String gbio=rs1.getString("gbio");
			                	   String gs=rs1.getString("gs");
			                	   String ggs=rs1.getString("ggs");
			                	   String bam=rs1.getString("bam");
			                	   String gbam=rs1.getString("gbam");
			                	   
			                	   Image im=Image.getInstance("other.png");
					         	    mudi.setWidthPercentage(105);
					         	    cell = new PdfPCell(im,false);
								    cell.setColspan(4);
								    cell.setHorizontalAlignment(1);
								    mudi.addCell(cell);
								    
								    cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("WIZARA YA ELIMU NA MAFUNZO YA AMALI ZANZIBAR", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    cell=new PdfPCell(new Phrase("SHULE YA SEKONDARI "+school, FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));//jj.getSelectedItem().toString().replaceAll("'", "''")
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
				                     
								    cell = new PdfPCell(new Phrase("RIPOTI YA MAENDELEO YA MWANAFUNZI", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    cell=new PdfPCell(new Phrase(et.getSelectedItem().toString()+" - "+"  "+ac.getSelectedItem().toString(), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								    cell.setBorder(0);
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
								    
					                     cell=new PdfPCell(new Phrase("JINA:       "+rs1.getString("first")+" "+rs1.getString("last")+"\nJINSIA:    "+rs1.getString("gender")+"\nDARASA:"+rs1.getString("class"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
					      		    	   cell.setBorder(0);
					      		    	    cell.setColspan(4);
					                       mudi.addCell(cell);
			      		    	 
			      		  
			                       cell=new PdfPCell(new Phrase("KOMBI:   "+rs1.getString("combi"), FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
			      		    	   cell.setBorder(0);
			      		    	    cell.setColspan(4);
			                       mudi.addCell(cell);
			                       
			                       cell = new PdfPCell(new Phrase("\n"));
								    cell.setBorder(0);
								    cell.setColspan(4);
								    mudi.addCell(cell);
			                       
			                       cell = new PdfPCell(new Phrase("SOMO", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
								   // cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    cell = new PdfPCell(new Phrase("ALAMA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));							
								    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    cell = new PdfPCell(new Phrase("DARAJA", FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK)));
	     						    cell.setHorizontalAlignment(1);
								    cell.setColspan(1);
								    mudi.addCell(cell);
								    
								    
								    cell = new PdfPCell(new Phrase("GENERAL STUDIES", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
									   // cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(gs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
									    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    cell = new PdfPCell(new Phrase(ggs, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
		     						    cell.setHorizontalAlignment(1);
									    cell.setColspan(1);
									    mudi.addCell(cell);
									    
									    cell = new PdfPCell(new Phrase("GEOGRAPHY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
										   // cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(geo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
										    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    cell = new PdfPCell(new Phrase(ggeo, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
			     						    cell.setHorizontalAlignment(1);
										    cell.setColspan(1);
										    mudi.addCell(cell);
										    
										    cell = new PdfPCell(new Phrase("CHEMISTRY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
											   // cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(che, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
											    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    cell = new PdfPCell(new Phrase(gche, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
				     						    cell.setHorizontalAlignment(1);
											    cell.setColspan(1);
											    mudi.addCell(cell);
											    
											    cell = new PdfPCell(new Phrase("BIOLOGY", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
												   // cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(bio, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
												    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
												    cell = new PdfPCell(new Phrase(gbio, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
					     						    cell.setHorizontalAlignment(1);
												    cell.setColspan(1);
												    mudi.addCell(cell);
									    
												    cell = new PdfPCell(new Phrase("BAM", FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
													   // cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(bam, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));							
													    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
													    cell = new PdfPCell(new Phrase(gbam, FontFactory.getFont("Arial", 14, Font.PLAIN, BaseColor.BLACK)));
						     						    cell.setHorizontalAlignment(1);
													    cell.setColspan(1);
													    mudi.addCell(cell);
										    
				                  
				      		       cell=new PdfPCell(new Phrase("AMEPATA DIVISHENI "+"  "+p+"    "+"YA POINTI"+"    "+rs1.getString("point"), FontFactory.getFont("Arial", 14, Font.CENTER_BASELINE, BaseColor.BLACK)));
				      		       cell.setHorizontalAlignment(1);
				      	    	     cell.setColspan(3);
				                   mudi.addCell(cell);
				                   
				                   cell=new PdfPCell(new Phrase(" "));
			                       cell.setBorder(0);
			                       cell.setColspan(3);
			                       mudi.addCell(cell);
			                       
				                  
				                   cell=new PdfPCell(new Phrase(area1.getText()));
				                   cell.setColspan(3);
				      		       cell.setBorder(0);
				      		      mudi.addCell(cell);
				                   
			                       cell=new PdfPCell(new Phrase(" "));
			                       cell.setBorder(0);
			                       cell.setColspan(3);
			                       mudi.addCell(cell);
			                	   
			                      
			                      
			                   }
							
						}
				    		
						PdfWriter.getInstance(document, new FileOutputStream("Report.pdf"));
						document.open();
						
						
						document.add(mudi);
						//document.add(new Paragraph(dt.format(timer.getTime())+"::"+df.format(timer.getTime() )) );
						
						document.close();
						JOptionPane.showMessageDialog(null, "Loading...Please Wait !");
						Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"Report.pdf");

						
				    	 
				    	 
				     }catch(Exception ex) {
				    	 JOptionPane.showMessageDialog(null, "No User of that Records !");
				     }
				     finally {
							
							try {
								rs.close();
								ps.close();
								
								
							}catch(Exception ex) {
								
							}
							
						}
				
					
				}else {
					JOptionPane.showMessageDialog(null, "Can't Accept Empty Value !");
				}
				
				}
				
				
				
			}
	
		
		}});
	
	
	hash=new JLabel("                                                                                                " );
	bar.add(hash);
	//bar.add(sign);
	empty=new JLabel("                                                                                                 ");
	kappa=new JLabel("FORM   5 & 6                                                                ");
	bar.add(empty);
	kappa.setForeground(Color.BLUE);kappa.setFont(new Font("Segoe Script",Font.BOLD+Font.HANGING_BASELINE,11));
	
	time=new JLabel();time.setForeground(Color.BLACK);time.setFont(new Font("serif",Font.BOLD+Font.PLAIN,12));
	date=new JLabel();date.setForeground(Color.BLACK);date.setFont(new Font("serif",Font.BOLD+Font.PLAIN,12));
	bar.add(kappa);
	bar.add(date);
	bar.add(empty);
	bar.add(time);

      Thread th=new Thread(){
      public void run(){
    	  for(;;){
    		  Calendar timer=Calendar.getInstance();
    		  timer.getTime();
    		  SimpleDateFormat df= new SimpleDateFormat("hh:mm:ss a");
    		  time.setText(df.format(timer.getTime()));time.setIcon(alarm);
    		  SimpleDateFormat dt=new SimpleDateFormat("E dd MMM ,  yyyy");
    		  date.setText(dt.format(timer.getTime()));date.setIcon(cale);


    		try {
				sleep(1000);
			} catch (InterruptedException e) {

			} 
    	  }
      }};

      th.start();
		
	
		
	}
	
}
