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
	boolean bReset = false;
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
			
			switch (action){
			case "C":
				prvNum = null;
				tf.setText(null);
				break;
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
			case "0":
			case ".":
				tf.setText(bReset ? action : tf.getText().toString() + action);
				bReset = false;
				break;
			case "+":
				prvNum = tf.getText();
				tf.setText(null);
				prvAction = "+";
				break;
			case "-":
				prvNum = tf.getText();
				tf.setText(null);
				prvAction = "-";
				break;
			case "*":
				prvNum = tf.getText();
				tf.setText(null);
				prvAction = "*";
				break;
			case "/":
				prvNum = tf.getText();
				tf.setText(null);
				prvAction = "/";
				break;
			case "<-":
				String a = tf.getText();
				a = a.substring(0, a.length() == 0 ? 0 : a.length()-1);
				tf.setText(a);
				break;
			case "Route":
				prvNum = tf.getText();
				double result = Math.sqrt(Double.parseDouble(prvNum)); 
				
				if (result - (int) result == 0.0)
					tf.setText(""+(int) result);
				else
					tf.setText(""+result);
				
				bReset = true;
				break;
			case "1/x":
				prvNum = tf.getText();
				double result1 = 1/ Double.parseDouble(prvNum); 
				
				if (result1 - (int) result1 == 0.0)
					tf.setText(""+(int) result1);
				else
					tf.setText(""+result1);
				
				bReset = true;
				break;
			case "=":
				double result11 = Double.parseDouble(tf.getText());
				
				if (prvAction.equals("+"))
					result11 += Double.parseDouble(prvNum);
				else if (prvAction.equals("-"))
					result11 -= Double.parseDouble(prvNum);
				else if (prvAction.equals("*"))
					result11 *= Double.parseDouble(prvNum);
				else if (prvAction.equals("/"))
					result11 = Double.parseDouble(prvNum) / result11;
				
				if (result11 - (int) result11 == 0.0)
					tf.setText(""+(int) result11);
				else
					tf.setText(""+result11);
				
				bReset = true;
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator ccl = new calculator();
		
	}

}
