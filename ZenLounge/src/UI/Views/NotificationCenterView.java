package UI.Views;

import UI.Common.View;
import javax.swing.JTabbedPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

public class NotificationCenterView extends View {

	public NotificationCenterView(String name) {
		super(name,true);
		setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 719, 553);
		add(tabbedPane);
		
		JSplitPane splitPane = new JSplitPane();
		tabbedPane.addTab("Notification Center", null, splitPane, null);
		
		JTree tree = new JTree();
		splitPane.setLeftComponent(tree);
		
		JPanel panel = new JPanel();
		splitPane.setRightComponent(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lblOrderNumber = new JLabel("Order number");
		panel.add(lblOrderNumber);
		
		JLabel label = new JLabel("Submitted by :");
		sl_panel.putConstraint(SpringLayout.SOUTH, lblOrderNumber, -28, SpringLayout.NORTH, label);
		sl_panel.putConstraint(SpringLayout.NORTH, label, 263, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, label, -374, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblOrderNumber, 0, SpringLayout.WEST, label);
		panel.add(label);
		
		JLabel label_1 = new JLabel("1234578");
		sl_panel.putConstraint(SpringLayout.NORTH, label_1, 0, SpringLayout.NORTH, lblOrderNumber);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Jean Dupont");
		sl_panel.putConstraint(SpringLayout.WEST, label_2, 20, SpringLayout.EAST, label);
		sl_panel.putConstraint(SpringLayout.EAST, label_1, 0, SpringLayout.EAST, label_2);
		sl_panel.putConstraint(SpringLayout.NORTH, label_2, 0, SpringLayout.NORTH, label);
		panel.add(label_2);
		
		JButton btnConfirm = new JButton("Confirm");
		sl_panel.putConstraint(SpringLayout.NORTH, btnConfirm, 34, SpringLayout.SOUTH, label_2);
		sl_panel.putConstraint(SpringLayout.WEST, btnConfirm, 269, SpringLayout.WEST, panel);
		panel.add(btnConfirm);
		
		splitPane.setOneTouchExpandable(true);
		
	}
}
