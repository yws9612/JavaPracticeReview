import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Test02 extends JFrame {

	 Test02(){
			
			Container c=getContentPane();
			JPanel j1=new JPanel();
			JPanel j2=new JPanel();
			JPanel j3=new JPanel();
			
			j1.setBackground(Color.pink);
			j2.setLayout(new GridLayout(4,4));
			j3.setBackground(Color.yellow);
			
			c.add(j1, BorderLayout.NORTH); //프레임에 파넬부착
			c.add(j2);
			c.add(j3, BorderLayout.SOUTH);
			
			JLabel jl=new JLabel("입력");
			JTextField jf=new JTextField(10);
			
			j1.add(jl);
			j1.add(jf);
			
			JLabel ja=new JLabel("결과");
			JTextField jt=new JTextField(10);
			
			j3.add(ja);
			j3.add(jt);
			
			for(int i=0;i<16;i++) {
				JButton b=new JButton();
				String s[]= {"+","-","*","/","계산","CE"};
				j2.add(b);
				
				if(i<10) {
					b.setText(Integer.toString(i));
				}
				else { //10~15
					b.setText(s[i-10]);
				}
			}	
			setVisible(true);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test02();
	}

}
