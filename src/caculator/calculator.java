package caculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class calculator extends Frame{
	TextField tf = new TextField();
	String prvNum = new String();
	String prvAction = null;
	public calculator(){
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		setTitle("계산기");
		setSize(230, 320);
		setLayout(new BorderLayout(0,10));
		setBackground(new Color(217, 228, 241));
		
		Panel pMenu = new Panel();					//상위메뉴
		pMenu.setLayout(new GridLayout(1,3));
		pMenu.add(new Button("보기(V)"));
		pMenu.add(new Button("편집(E)"));
		pMenu.add(new Button("도움말(H)"));
		pMenu.setBackground(Color.LIGHT_GRAY);
		
		Panel pContents = new Panel();				//결과 화면, 버튼
		pContents.setLayout(new BorderLayout(0,10));
		
		pContents.add(tf, "North");
		
		Panel ppButton = new Panel();
		ppButton.setLayout(new GridLayout(6,5,5,5));
		
		Button MCBtn = new Button("MC");
		Button MRBtn = new Button("MR");
		Button MSBtn = new Button("MS");
		Button MPBtn = new Button("M+");
		Button MMBtn = new Button("M-");
		
		Button BackBtn = new Button("<-");
		Button CEBtn = new Button("CE");
		Button CBtn = new Button("C");
		Button PMBtn = new Button("+-");
		Button RTBtn = new Button("Route");
		
		Button SevenBtn = new Button("7");
		Button EightBtn = new Button("8");
		Button NineBtn = new Button("9");
		Button DivBtn = new Button("/");
		Button GbgBtn = new Button("%");
		
		Button FourBtn = new Button("4");
		Button FiveBtn = new Button("5");
		Button SixBtn = new Button("6");
		Button GopBtn = new Button("*");
		Button ExBtn = new Button("1/x");
		
		Button OneBtn = new Button("1");
		Button TwoBtn = new Button("2");
		Button ThreeBtn = new Button("3");
		Button MBtn = new Button("-");
		Button NBtn = new Button("=");
		
		Button Zero1Btn = new Button("0");
		Button Zero2Btn = new Button("0");
		Button DotBtn = new Button(".");
		Button PBtn = new Button("+");
		Button N2Btn = new Button("=");
		
		ppButton.add(MCBtn);
		ppButton.add(MRBtn);
		ppButton.add(MSBtn);
		ppButton.add(MPBtn);
		ppButton.add(MMBtn);
		
		ppButton.add(BackBtn);
		ppButton.add(CEBtn);
		ppButton.add(CBtn);
		ppButton.add(PMBtn);
		ppButton.add(RTBtn);
		
		ppButton.add(SevenBtn);
		ppButton.add(EightBtn);
		ppButton.add(NineBtn);
		ppButton.add(DivBtn);
		ppButton.add(GbgBtn);
		
		ppButton.add(FourBtn);
		ppButton.add(FiveBtn);
		ppButton.add(SixBtn);
		ppButton.add(GopBtn);
		ppButton.add(ExBtn);
		
		ppButton.add(OneBtn);
		ppButton.add(TwoBtn);
		ppButton.add(ThreeBtn);
		ppButton.add(MBtn);
		ppButton.add(NBtn);
		
		ppButton.add(Zero1Btn);
		ppButton.add(Zero2Btn);
		ppButton.add(DotBtn);
		ppButton.add(PBtn);
		ppButton.add(N2Btn);
		
		pContents.add(ppButton, "Center");
		
		add(pMenu,"North");
		add(pContents, "Center");
		setVisible(true);
		
		MCBtn.addActionListener(new MyActionListener());
		MRBtn.addActionListener(new MyActionListener());
		MSBtn.addActionListener(new MyActionListener());
		MPBtn.addActionListener(new MyActionListener());
		MMBtn.addActionListener(new MyActionListener());
		
		BackBtn.addActionListener(new MyActionListener());
		CEBtn.addActionListener(new MyActionListener());
		CBtn.addActionListener(new MyActionListener());
		PMBtn.addActionListener(new MyActionListener());
		RTBtn.addActionListener(new MyActionListener());
		
		SevenBtn.addActionListener(new MyActionListener());
		EightBtn.addActionListener(new MyActionListener());
		NineBtn.addActionListener(new MyActionListener());
		DivBtn.addActionListener(new MyActionListener());
		GbgBtn.addActionListener(new MyActionListener());
		
		FourBtn.addActionListener(new MyActionListener());
		FiveBtn.addActionListener(new MyActionListener());
		SixBtn.addActionListener(new MyActionListener());
		GopBtn.addActionListener(new MyActionListener());
		ExBtn.addActionListener(new MyActionListener());
		
		OneBtn.addActionListener(new MyActionListener());
		TwoBtn.addActionListener(new MyActionListener());
		ThreeBtn.addActionListener(new MyActionListener());
		MBtn.addActionListener(new MyActionListener());
		NBtn.addActionListener(new MyActionListener());
		
		Zero1Btn.addActionListener(new MyActionListener());
		Zero2Btn.addActionListener(new MyActionListener());
		DotBtn.addActionListener(new MyActionListener());
		PBtn.addActionListener(new MyActionListener());
		N2Btn.addActionListener(new MyActionListener());
		
	}
	
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String action = arg0.getActionCommand();
			
			if (action.equals("C")){
				prvNum = null;
				tf.setText(null);
			} else if (action.equals("1")){
				tf.setText(tf.getText().toString() + action);
			} else if (action.equals("2")){
				tf.setText(tf.getText().toString() + action);
			} else if (action.equals("3")){
				tf.setText(tf.getText().toString() + action);
			} else if (action.equals("4")){
				tf.setText(tf.getText().toString() + action);
			} else if (action.equals("5")){
				tf.setText(tf.getText().toString() + action);
			} else if (action.equals("6")){
				tf.setText(tf.getText().toString() + action);
			} else if (action.equals("7")){
				tf.setText(tf.getText().toString() + action);
			} else if (action.equals("8")){
				tf.setText(tf.getText().toString() + action);
			} else if (action.equals("9")){
				tf.setText(tf.getText().toString() + action);
			} else if (action.equals("0")){
				tf.setText(tf.getText().toString() + action);
			} else if (action.equals("1")){
				tf.setText(tf.getText().toString() + action);
			} else if (action.equals("+")){
				prvNum = tf.getText();
				tf.setText(null);
				prvAction = "+";
			} else if (action.equals("-")){
				prvNum = tf.getText();
				tf.setText(null);
				prvAction = "-";
			} else if (action.equals("*")){
				prvNum = tf.getText();
				tf.setText(null);
				prvAction = "*";
			} else if (action.equals("/")){
				prvNum = tf.getText();
				tf.setText(null);
				prvAction = "/";
			} else if (action.equals("=")){
				double result = Double.parseDouble(tf.getText());
				
				if (prvAction.equals("+"))
					result += Double.parseDouble(prvNum);
				if (prvAction.equals("-"))
					result -= Double.parseDouble(prvNum);
				if (prvAction.equals("*"))
					result *= Double.parseDouble(prvNum);
				if (prvAction.equals("/"))
					result = Double.parseDouble(prvNum) / result;
				
				if (result - (int) result == 0.0)
					tf.setText(""+(int) result);
				else
					tf.setText(""+result);
			} 
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator ccl = new calculator();
		
	}

}
