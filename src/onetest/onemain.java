package onetest;

import java.awt.Image;
import java.awt.Toolkit;


public class onemain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowCalculator win=new WindowCalculator();
		win.setTitle("������");
		win.setBounds(600,260,233,250);
		/*���ô���ͼ��*/
		Toolkit toolkit=win.getToolkit();
        Image topicon=toolkit.getImage("a.gif");
        win.setIconImage(topicon);
	}
}
