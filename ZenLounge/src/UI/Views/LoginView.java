package UI.Views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import BL.Facades.UserFacade;
import BL.Others.Utilitary;
import UI.Common.View;

public class LoginView extends View implements ActionListener{
	
    private JLabel loginLabel;
    private JLabel pwdLabel;
	
    private JTextField loginField;
    private JPasswordField pwdField;
    
    private JCheckBox rememberMe;

    private JButton loginButton;
    private JButton subscribeButton;
	
    public UserFacade userFacade;
    
    public LoginView(){
    	super("ZenLounge - Login");
    	
    	userFacade = new UserFacade(this);

    	loginLabel = new JLabel("Login");
    	pwdLabel = new JLabel("Password");

    	loginField = new JTextField(10);
    	pwdField = new JPasswordField(10);
    	
    	loginButton = new JButton(Action.NAME);
    	loginButton.setText("Connection");
    	loginButton.addActionListener(this);
    	
    	subscribeButton = new JButton(Action.NAME);
    	subscribeButton.setText("Subscribe");
    	subscribeButton.addActionListener(this);

    	super.add(loginLabel);
    	super.add(loginField);
    	super.add(pwdLabel);
    	super.add(pwdField);
    	super.add(loginButton);
    	super.add(subscribeButton);
    }

    private void login() {
    	String pwd = String.valueOf(pwdField.getPassword());
    	pwdField.setText("");
    	if(userFacade.handleLogin(loginField.getText(),pwd))
    		/*Frame.getFrame().setView(new ProfileView())*/
        	log("Login succeeded. Show Profile view");
    	else
    		error("Informations incorrectes. Veuillez réessayer");
    }

    private void subscribe() {
    	//Frame.getFrame().setView(new SubscribeView());
    	log("Show subscribe view");
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals(loginButton.getActionCommand()))
			login();
		else if(e.getActionCommand().equals(subscribeButton.getActionCommand()))
			subscribe();
	}
}