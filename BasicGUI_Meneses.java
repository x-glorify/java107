package CCE107Activities;
import javax.swing.*;
public class BasicGUI_Meneses extends JFrame{
	

	public static void main(String[] args) {
	
		new BasicGUI_Meneses();
		
	}
	
	
	
	
	
	
	
	
	BasicGUI_Meneses() {
	
		setLayout(null);
		
		JLabel lblcustomer = new JLabel("Customer Type");
		add(lblcustomer).setBounds(10, 80, 100, 20);
		
		JTextField txtcustomer = new JTextField();
		add(txtcustomer).setBounds(140,80,200,25);
		
		
		
		JLabel lblconsumption = new JLabel("Consumption");
		add(lblconsumption).setBounds(10, 120, 100, 20);
		 
		JTextField txtconsumption = new JTextField();
		add(txtconsumption).setBounds(140, 120, 200, 25);
	
		
		
		JLabel lbltotal = new JLabel("Total Bill");
		add(lbltotal).setBounds(10, 160, 100, 20);
		
		JTextField txttotal = new JTextField();
		add(txttotal).setBounds(140, 160, 200, 25);
		
		
		//buttons
		
		JButton btn1 = new JButton("Add");
		add(btn1).setBounds(10, 200, 150, 25);
		
		JButton btn2 = new JButton("Delete");
		add(btn2).setBounds(170, 200, 150, 25);
		
		JButton btn3 = new JButton("Update");
		add(btn3).setBounds(330, 200, 150, 25);
		
		
		
		
		
	
		
		setTitle("MENESES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);
		
			
	
		
	}

}
