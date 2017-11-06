package onetest;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class WindowCalculator extends JFrame{
	JMenuBar menubar;
	JMenu lookMenu,editMenu,helpMenu;
	JMenuItem lookItem1,lookItem2,lookItem3,editMenu1,editMenu2,helpMenu1,helpMenu2;
	JTextField text;//�൱��MVC�����View��������ʾ���
	JPanel topPanel;
	/*�����൱��MVC��controller����Щ��ťʱ�������������Ƽ�����Model*/
	//{�ӣ�btnAdd}��{����btnSub}��{�ˣ�btnMul}��{����btnDiv}��{���ڣ�btnEqu}��{С���㣺btnDon}��{������btnBack}��{������У�btnC}��{�����ǰ��btnCE}��{�����ţ�btnSorM}��{���ţ�btnRoot}��{�ٷֱȣ�btnPer}��{x��֮һ��btnX1}
	JButton btnMC,btnMR,btnMS,btnMadd,btnMSub,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnAdd,btnSub,btnMul,btnDiv,btnDon,btnEqu,btnBack,btnCE,btnC,btnSorM,btnRoot,btnPer,btnX1;
	ComputerListener computer;
	WindowCalculator(){
		//setSize(1000000, 100000000);
		System.out.println("succeed");
		init();
		setVisible(true);
		setResizable(false);
		//this.setBounds(100, 100, 250, 10000000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void init() {
		// TODO Auto-generated method stub
		
		setLayout(new FlowLayout());//����Ϊ�ղ���
		/**********************�˵�***********************/
		menubar=new JMenuBar();
		lookMenu=new JMenu("�鿴(V)");
		editMenu=new JMenu("�༭(E)");
		helpMenu=new JMenu("����(H)");
		//ÿ���˵�����
		/*�鿴�˵�*/
		lookItem1=new JMenuItem("��׼��(T)");
		lookItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,InputEvent.ALT_MASK));
		lookItem2=new JMenuItem("��ѧ��(S)");
		lookItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,InputEvent.ALT_MASK));
		lookItem3=new JMenuItem("�˳�(E)");
		lookItem3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4,InputEvent.ALT_MASK));
		/*�༭�˵�*/
		editMenu1=new JMenuItem("����(C)");
		editMenu1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.ALT_MASK));
		editMenu2=new JMenuItem("ճ��(P)");
		editMenu2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,InputEvent.ALT_MASK));
		/*�����˵�*/
		helpMenu1=new JMenuItem("�鿴����(V)");
		helpMenu2=new JMenuItem("���ڼ�����(A)");
		/*��Ӳ˵�*/
		lookMenu.add(lookItem1);
		lookMenu.add(lookItem2);
		lookMenu.addSeparator();//��ӷָ���
		lookMenu.add(lookItem3);
		editMenu.add(editMenu1);
		editMenu.add(editMenu2);
		helpMenu.add(helpMenu1);
		helpMenu.addSeparator();//��ӷָ���
		helpMenu.add(helpMenu2);
		menubar.add(lookMenu);
		menubar.add(editMenu);
		menubar.add(helpMenu);
		//setJMenuBar(menubar);
		
		computer=new ComputerListener();
		setLayout(null);
		/**********************�ı���**************************/
		text=new JTextField(18);
		text.setBounds(3, 3, 220, 50);
		text.setHorizontalAlignment(JTextField.RIGHT);//�ı��Ҷ���
		text.setFont(new Font("",Font.BOLD,20));
		text.setText("0");//��һ����ʾ0
		text.setEditable(false);//��ֹ��������
		text.setBackground(Color.white);
		computer.setJTextField(text);
		add(text);
		text.addActionListener(computer);
		
		
		topPanel=new JPanel();
		//grid=new GridLayout(1,5);
		//topPanel.setLayout(grid);
		
		
		/************************��ť**************************/
		/*
		btnMC=new JButton("MC");
		btnMC.setBounds(0, 0, 34, 27);
		btnMC.setMargin(new Insets(0,0,0,0));//���ð�ť��marginΪ0
		btnMC.addActionListener(computer);
		topPanel.add(btnMC);
		
		btnMR=new JButton("MR");
		btnMR.setBounds(42, 0, 34, 27);
		btnMR.setMargin(new Insets(0,0,0,0));
		btnMR.addActionListener(computer);
		topPanel.add(btnMR);
		
		btnMS=new JButton("MS");
		btnMS.setBounds(84, 0, 34, 27);
		btnMS.setMargin(new Insets(0,0,0,0));
		btnMS.addActionListener(computer);
		topPanel.add(btnMS);
		
		btnMadd=new JButton("M+");
		btnMadd.setBounds(126 ,0, 34, 27);
		btnMadd.setMargin(new Insets(0,0,0,0));
		btnMadd.addActionListener(computer);
		topPanel.add(btnMadd);
		
		btnMSub=new JButton("M-");
		btnMSub.setBounds(168, 0, 34, 27);
		btnMSub.setMargin(new Insets(0,0,0,0));
		btnMSub.addActionListener(computer);
		topPanel.add(btnMSub);
		
		btnBack=new JButton("��");
		btnBack.setBounds(0, 35, 34, 27);
		btnBack.setMargin(new Insets(0,0,0,0));
		btnBack.addActionListener(computer);
		topPanel.add(btnBack);
		
		btnCE=new JButton("CE");
		btnCE.setBounds(42, 35, 34, 27);
		btnCE.setMargin(new Insets(0,0,0,0));
		btnCE.addActionListener(computer);
		topPanel.add(btnCE);
		
		btnC=new JButton("C");
		btnC.setBounds(84, 35, 34, 27);
		btnC.setMargin(new Insets(0,0,0,0));
		btnC.addActionListener(computer);
		topPanel.add(btnC);
		
		btnSorM=new JButton("��");
		btnSorM.setBounds(126 ,35, 34, 27);
		btnSorM.setMargin(new Insets(0,0,0,0));
		btnSorM.addActionListener(computer);
		topPanel.add(btnSorM);
		
		btnRoot=new JButton("��");
		btnRoot.setBounds(168, 35, 34, 27);
		btnRoot.setMargin(new Insets(0,0,0,0));
		btnRoot.addActionListener(computer);
		topPanel.add(btnRoot);
		*/
		
		/*������*//////////////////////////////////////////////
		btn7=new JButton("7");
		btn7.setBounds(0, 70, 34, 27);
		btn7.setMargin(new Insets(0,0,0,0));
		btn7.addActionListener(computer);
		topPanel.add(btn7);
		
		btn8=new JButton("8");
		btn8.setBounds(42, 70, 34, 27);
		btn8.setMargin(new Insets(0,0,0,0));
		btn8.addActionListener(computer);
		topPanel.add(btn8);
		
		btn9=new JButton("9");
		btn9.setBounds(84, 70, 34, 27);
		btn9.setMargin(new Insets(0,0,0,0));
		btn9.addActionListener(computer);
		topPanel.add(btn9);
		
		btnDiv=new JButton("/");
		btnDiv.setBounds(126 ,70, 34, 27);
		btnDiv.setMargin(new Insets(0,0,0,0));
		btnDiv.addActionListener(computer);
		topPanel.add(btnDiv);
		
		btnPer=new JButton("%");
		btnPer.setBounds(168, 70, 34, 27);
		btnPer.setMargin(new Insets(0,0,0,0));
		btnPer.addActionListener(computer);
		topPanel.add(btnPer);
		
		/*������*//////////////////////////////////////////////
		btn4=new JButton("4");
		btn4.setBounds(0, 105, 34, 27);
		btn4.setMargin(new Insets(0,0,0,0));
		btn4.addActionListener(computer);
		topPanel.add(btn4);
		
		btn5=new JButton("5");
		btn5.setBounds(42, 105, 34, 27);
		btn5.setMargin(new Insets(0,0,0,0));
		btn5.addActionListener(computer);
		topPanel.add(btn5);
		
		btn6=new JButton("6");
		btn6.setBounds(84, 105, 34, 27);
		btn6.setMargin(new Insets(0,0,0,0));
		btn6.addActionListener(computer);
		topPanel.add(btn6);
		
		btnMul=new JButton("*");
		btnMul.setBounds(126 ,105, 34, 27);
		btnMul.setMargin(new Insets(0,0,0,0));
		btnMul.addActionListener(computer);
		topPanel.add(btnMul);
		
		btnX1=new JButton("1/x");
		btnX1.setBounds(168, 105, 34, 27);
		btnX1.setMargin(new Insets(0,0,0,0));
		btnX1.addActionListener(computer);
		topPanel.add(btnX1);
		
		/*������*//////////////////////////////////////////////
		btn1=new JButton("1");
		btn1.setBounds(0, 140, 34, 27);
		btn1.setMargin(new Insets(0,0,0,0));
		btn1.addActionListener(computer);
		topPanel.add(btn1);
		
		btn2=new JButton("2");
		btn2.setBounds(42, 140, 34, 27);
		btn2.setMargin(new Insets(0,0,0,0));
		btn2.addActionListener(computer);
		topPanel.add(btn2);
		
		btn3=new JButton("3");
		btn3.setBounds(84, 140, 34, 27);
		btn3.setMargin(new Insets(0,0,0,0));
		btn3.addActionListener(computer);
		topPanel.add(btn3);
		
		btnSub=new JButton("-");
		btnSub.setBounds(126 ,140, 34, 27);
		btnSub.setMargin(new Insets(0,0,0,0));
		btnSub.addActionListener(computer);
		topPanel.add(btnSub);
		
		/*������*//////////////////////////////////////////////
		btn0=new JButton("0");
		btn0.setBounds(0, 175, 76, 27);
		btn0.setMargin(new Insets(0,0,0,0));
		btn0.addActionListener(computer);
		topPanel.add(btn0);
		
		btnDon=new JButton(".");
		btnDon.setBounds(84, 175, 34, 27);
		btnDon.setMargin(new Insets(0,0,0,0));
		btnDon.addActionListener(computer);
		topPanel.add(btnDon);
		
		btnAdd=new JButton("+");
		btnAdd.setBounds(126, 175, 34, 27);
		btnAdd.setMargin(new Insets(0,0,0,0));
		btnAdd.addActionListener(computer);
		topPanel.add(btnAdd);
		
		btnEqu=new JButton("=");
		btnEqu.setBounds(168 ,140, 34, 62);
		btnEqu.setMargin(new Insets(0,0,0,0));
		btnEqu.addActionListener(computer);
		topPanel.add(btnEqu);
		
		add(topPanel);
		topPanel.setBounds(11, 0, 220, 220);
		topPanel.setLayout(null);
	}
}
