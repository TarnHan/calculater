package onetest;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ComputerListener implements ActionListener{
	JButton button;
	JTextField text;
	calculatorModel control=new calculatorModel();
	public void setJTextField(JTextField t){
		text=t;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try{
			control.BtnClick(e.getActionCommand());
			text.setText(control.showNewNum());
			//JOptionPane.showMessageDialog(text, text.getText());//(text, text.getText(), JOptionPane.WARNING_MESSAGE);
			//text.setText(e.getActionCommand());
		}
		catch(Exception exp){
			text.setText("³öÏÖÎ´Öª´íÎó£¡");
		}
	}
}
