import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class guipractice2 implements ActionListener{
	JFrame window;
	JFrame window2;
	JPanel panel2;
	JPanel panel;
	JButton submit;
	JTextField field;
	JTextField field2;
	
	public static void main(String[] args){
		guipractice2 g=new  guipractice2();
		
	}
	
	public guipractice2(){
		window=new JFrame();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel=new JPanel();
		submit=new JButton("submit");
		submit.addActionListener(this);
		panel.add(submit);
		field=new JTextField(5);
		field.addActionListener(this);
		panel.add(field);
		window.add(panel);
		window.setSize(500, 500);
		
		
		
		
		
		
	}
	
	
	String list="";
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==submit){
			String input=field.getText();
			int num=Integer.parseInt(input);
			int[] primelist=new int[num];
			int y=0;
			for(int x=1;x<=num;x++){
				if(num%x==0){
					list+=x+",";
					primelist[y]=x;
					y++;
				}
				}
				int answer;
				int higest;
				for(int z=0;z<num;z++){
				answer=primelist[z];
				if(answer)
				
				JOptionPane.showMessageDialog(null, answer);
				}
				
				
				
			
						
					
				
			for(int a=0;a<1;a++){
			JOptionPane.showMessageDialog(null, list);
			list= "";
			
		}
		
		
	}
	}
}



