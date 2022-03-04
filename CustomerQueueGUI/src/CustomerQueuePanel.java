/*
 * CustomerQueuePanel -- Holds all the elements of the gui that you see
 * Jason Melnik
 * CSC - 121
 * 3/19/2019
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class CustomerQueuePanel extends JPanel{
	
	private final int WIDTH = 600, HEIGHT = 500;
	private JButton QueueButton, DequeueButton, createCustomerButton;
	private JTextField nameText, numberText, foodText;
	private JLabel name, number, food, name2, number2, food2, queue;
	private ArrayQueue<Customer> customers = new ArrayQueue<Customer>();
	private JLabel[] Jcustomers = new JLabel[20];
	private CustomerQueuePanel thisplace;
	
	public CustomerQueuePanel() {
		thisplace = this;
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.CYAN);
		
		for(int x = 0; x < Jcustomers.length - 1; x++) {
			Jcustomers[x] = new JLabel();
			Jcustomers[x].setBounds(250, x * 20 + 50, 400, 50);
			add(Jcustomers[x]);
		}
		
		QueueButton = new JButton("Add Customer");
		DequeueButton = new JButton("Serve Customer");
		createCustomerButton = new JButton("Create Customer");
		
		nameText = new JTextField();
		numberText = new JTextField();
		foodText = new JTextField();
		
		food = new JLabel("Food: ");
		name = new JLabel("Name: ");
		number = new JLabel("Order Number: ");
		queue = new JLabel();
		
		
		food2 = new JLabel("Food: ");
		name2 = new JLabel("Name: ");
		number2 = new JLabel("Order Number: ");
		
		QueueButton.setBounds(10, 10, QueueButton.getPreferredSize().width, QueueButton.getPreferredSize().height);
		DequeueButton.setBounds(10, 50, DequeueButton.getPreferredSize().width, DequeueButton.getPreferredSize().height);
		createCustomerButton.setBounds(10, 90, createCustomerButton.getPreferredSize().width, createCustomerButton.getPreferredSize().height);
		
		QueueButton.addActionListener(new ButtonListener());
		DequeueButton.addActionListener(new ButtonListener());
		createCustomerButton.addActionListener(new ButtonListener());
		
		name.setBounds(10, 130, name.getPreferredSize().width, name.getPreferredSize().height);
		number.setBounds(10, 170, number.getPreferredSize().width, number.getPreferredSize().height);
		food.setBounds(10, 210, food.getPreferredSize().width, food.getPreferredSize().height);
		queue.setBounds(250, 50, 400, 50);
		
		name2.setBounds(250, 10, name2.getPreferredSize().width, name2.getPreferredSize().height);
		number2.setBounds(350, 10, number2.getPreferredSize().width, number2.getPreferredSize().height);
		food2.setBounds(500, 10, food2.getPreferredSize().width, food2.getPreferredSize().height);
		
		nameText.setBounds(45, 130, 95, 20);
		numberText.setBounds(95, 170, 45, 20);
		foodText.setBounds(40, 210, 100, 20);
		
		setLayout(null);
		
		add(QueueButton);
		add(DequeueButton);
		add(createCustomerButton);
		
		add(name);
		add(food);
		add(number);
		add(queue);
		
		add(name2);
		add(food2);
		add(number2);
		
		add(nameText);
		add(numberText);
		add(foodText);
		
		setFocusable(true);
		
	}
	
	private void updateList() {
		System.out.println(customers.size());
		for(int x = 0; x < customers.size(); x++) {
			System.out.println(customers.get(x).toString());
			if(x < Jcustomers.length - 1)
				Jcustomers[x].setText(customers.get(x).toString());
		}
		
		if(Jcustomers.length > customers.size())
			Jcustomers[customers.size()-1].setText("");
		
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == createCustomerButton) {
				if(nameText.getText().equals("") || foodText.getText().equals("") || numberText.getText().equals("")) {
					Customer custom = new Customer();
					customers.enqueue(custom);
				}
				else {
					Customer custom = new Customer(nameText.getText(), Integer.parseInt(numberText.getText()), foodText.getText());
					customers.enqueue(custom);
				}
			}
			if(event.getSource() == QueueButton) {
				Customer custom = new Customer();
				customers.enqueue(custom);
			}
			if(event.getSource() == DequeueButton && !customers.isEmpty()) {
				customers.dequeue();
			}
			if(!customers.isEmpty())
				queue.setText(customers.first().toString());
			else
				queue.setText("");
			
			updateList();
		}
		
	}
}
	
	

