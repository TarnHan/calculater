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
		win.setTitle("计算器");
		win.setBounds(600,260,233,250);
		/*设置窗口图标*/
		Toolkit toolkit=win.getToolkit();
        Image topicon=toolkit.getImage("a.gif");
        win.setIconImage(topicon);
	}
}
