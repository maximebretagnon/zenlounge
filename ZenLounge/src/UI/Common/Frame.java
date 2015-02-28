package UI.Common;

import java.awt.Dimension;
import javax.swing.JFrame;

public class Frame extends JFrame {
	
	private static Frame f;
	
    private final Dimension defaultDimensions = new Dimension(720,480);
	
	private Frame() {
		super();
		super.setSize(defaultDimensions);
		super.setResizable(false);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static Frame getFrame(){
		if(f == null)
			f = new Frame();
		return f;
	}
	
	public void setView(View v){
		super.setTitle(v.getName());
		super.setContentPane(v);
	}
}