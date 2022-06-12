import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;





public class Calculator extends JFrame{

	Calculator(){
		
		setSize(400,400);
		
		Container c = getContentPane();
		
		c.setLayout(null);
		
		//계산과정이 출력될 필드 설정
		JTextField result = new JTextField(20);
		result.setBounds(40, 20, 300, 20);
		
		//숫자 및 계산 버튼
		
		//1행
		JButton num7 = new JButton("7");
		JButton num8 = new JButton("8");
		JButton num9 = new JButton("9");
		JButton div = new JButton("/");
		
		num7.setBounds(40, 65, 50, 30);
		num8.setBounds(120, 65, 50, 30);
		num9.setBounds(200, 65, 50, 30);
		div.setBounds(280, 65, 50, 30);
		
		num7.setBackground(Color.gray);
		num8.setBackground(Color.gray);
		num9.setBackground(Color.gray);
		div.setBackground(Color.yellow);
		
		//버튼 이벤트 설정
		num7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(result.getText().equals("0")) {
					result.setText("7");
				}else {
					result.setText(result.getText()+"7");
				}
			}
			
		});
		
		num8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(result.getText().equals("0")) {
					result.setText("8");
				}else {
					result.setText(result.getText()+"8");
				}
			}
			
		});
		
		num9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(result.getText().equals("0")) {
					result.setText("9");
				}else {
					result.setText(result.getText()+"9");
				}
			}
			
		});
		
		div.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+"/");
			}
			
		});
		
		
//------------------------------------------------
		
		//2행
		JButton num4 = new JButton("4");
		JButton num5 = new JButton("5");
		JButton num6 = new JButton("6");
		JButton mul = new JButton("*");
		
		num4.setBounds(40, 145, 50, 30);
		num5.setBounds(120, 145, 50, 30);
		num6.setBounds(200, 145, 50, 30);
		mul.setBounds(280, 145, 50, 30);
		
		num4.setBackground(Color.gray);
		num5.setBackground(Color.gray);
		num6.setBackground(Color.gray);
		mul.setBackground(Color.yellow);
		
		//버튼 이벤트 설정
		num4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(result.getText().equals("0")) {
					result.setText("4");
				}else {
					result.setText(result.getText()+"4");
				}
			}
			
		});
		
		num5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(result.getText().equals("0")) {
					result.setText("5");
				}else {
					result.setText(result.getText()+"5");
				}
			}
			
		});
		
		num6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(result.getText().equals("0")) {
					result.setText("6");
				}else {
					result.setText(result.getText()+"6");
				}
			}
			
		});
		
		mul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+"X");
			}
			
		});
//------------------------------------------------		
		
		//3행
		JButton num1 = new JButton("1");
		JButton num2 = new JButton("2");
		JButton num3 = new JButton("3");
		JButton sub = new JButton("-");
		
		num1.setBounds(40, 225, 50, 30);
		num2.setBounds(120, 225, 50, 30);
		num3.setBounds(200, 225, 50, 30);
		sub.setBounds(280, 225, 50, 30);
		
		num1.setBackground(Color.gray);
		num2.setBackground(Color.gray);
		num3.setBackground(Color.gray);
		sub.setBackground(Color.yellow);
		
		//버튼 이벤트 설정
		num1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(result.getText().equals("0")) {
					result.setText("1");
				}else {
					result.setText(result.getText()+"1");
				}
			}
			
		});
		
		num2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(result.getText().equals("0")) {
					result.setText("2");
				}else {
					result.setText(result.getText()+"2");
				}
			}
			
		});
		
		num3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(result.getText().equals("0")) {
					result.setText("3");
				}else {
					result.setText(result.getText()+"3");
				}
			}
			
		});
		
		sub.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+"-");
			}
			
		});
//------------------------------------------------		
		
		//4행
		JButton num0 = new JButton("0");
		JButton cancle = new JButton("C");
		JButton equal = new JButton("=");
		JButton col = new JButton("+");
		
		num0.setBounds(40, 305, 50, 30);
		cancle.setBounds(120, 305, 50, 30);
		equal.setBounds(200, 305, 50, 30);
		col.setBounds(280, 305, 50, 30);
		
		num0.setBackground(Color.gray);
		cancle.setBackground(Color.gray);
		equal.setBackground(Color.gray);
		col.setBackground(Color.yellow);
		
		num0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(result.getText().equals("0")) {
					result.setText("0");
				}else {
					result.setText(result.getText()+"0");
				}
			}
			
		});
		
		cancle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//텍스트 길이를 저장
				int a = result.getText().length();
				
				//인덱스 0번째부터 텍스트길이 -1만큼, 즉 마지막 한글자를 지움
				result.setText("0");
			}
			
		});
		
		col.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+ "+");
			}
			
		});
		
		equal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String dStr[] = result.getText().split("\\/");
				String mStr[] = result.getText().split("\\X");
				String sStr[] = result.getText().split("\\-");
				String cStr[] = result.getText().split("\\+");
				
				if(result.getText().contains("/")) {
					double dRes = Double.parseDouble(dStr[0]) / Double.parseDouble(dStr[1]);
					result.setText(result.getText() + " = " + dRes);
				}else if(result.getText().contains("*")) {
					int mRes = Integer.parseInt(mStr[0]) * Integer.parseInt(mStr[1]);
					result.setText(result.getText() + " = " + mRes);
				}else if(result.getText().contains("-")) {
					int sRes = Integer.parseInt(sStr[0]) - Integer.parseInt(sStr[1]);
					result.setText(result.getText() + " = " + sRes);
				}else if(result.getText().contains("+")) {
					int cRes = Integer.parseInt(cStr[0]) + Integer.parseInt(cStr[1]);
					result.setText(result.getText() + " = " + cRes);
				}
				
			}
			
		});
		
	
//------------------------------------------------		
		
		c.add(result);
		//1행
		c.add(num7);
		c.add(num8);
		c.add(num9);
		c.add(div);
		
		//2행
		c.add(num4);
		c.add(num5);
		c.add(num6);
		c.add(mul);
		
		//3행
		c.add(num1);
		c.add(num2);
		c.add(num3);
		c.add(sub);
		
		//4행
		c.add(num0);
		c.add(cancle);
		c.add(equal);
		c.add(col);
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();	
	}

}
