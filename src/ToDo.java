import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ToDo extends Account{
	JFrame todoFrame;
	 ArrayList<JLabel> label = new ArrayList<JLabel>(); 
		JLabel image;
		JPanel panToDo,panAdd,panDisplay;
		JButton btn1, btn2;
		JTextField txt1;
		String hi;
		JButton btnRemove;
		JLabel lbl1;
		 int int1;
	public ToDo(){
		todoFrame = new JFrame();
		todoFrame.setSize(450,650);
		todoFrame.setVisible(true);
		todoFrame.setResizable(false);
		//todoFrame.setVisible(true);
		todoFrame.setLocation((int) getToolkit().getDefaultToolkit().getScreenSize().getWidth()/2 - todoFrame.getWidth()/2,(int) getToolkit().getDefaultToolkit().getScreenSize().getHeight()/2 - todoFrame.getHeight()/2);
	}
	public void createGui(){
		panToDo = new JPanel();
		panToDo.setLayout(new BoxLayout(panToDo, BoxLayout.Y_AXIS));
		panAdd = new JPanel();
		txt1 = new JTextField("");
		
		panAdd.setLayout(new BoxLayout(panAdd, BoxLayout.Y_AXIS));
		btn2 = new JButton("Done");
		panAdd.add(btn2);
		panAdd.add(txt1);
		btn1 = new JButton("Add");
		btnRemove = new JButton("Remove");
		
		
		panToDo.add(btn1);
		panToDo.add(btnRemove);
		todoFrame.add(panToDo);
		
		todoFrame.setVisible(true);
		
	}
		
	public void Actions(){
	btn1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panToDo.setVisible(false);
				
				panAdd.setVisible(true);
				todoFrame.add(panAdd);
				btn2.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						panAdd.setVisible(false);
						//yay it works
						output();	
					}
						
			});
				
			}});	//}});
		//why is it not registering when this button is being pressed?
		btnRemove.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
			//	JLabel hi = new JLabel("hi!");
				//hi.setBounds(100,100,100,100);
				//panToDo.add(hi);
				//todoFrame.setVisible(true);
				// TODO Auto-generated method stub
				 String strRemove= JOptionPane.showInputDialog("Please input the number/index of the item you would like to delete");
			   
				  int1 = Integer.parseInt(strRemove);
				  //System.out.println(int1);
				 // removefromindex(int1);
				  label.remove(int1-1);
				 //why do we need to put in the background for it to work?
				  panToDo.removeAll();
				  //panToDo.setLayout(new BoxLayout(panToDo,BoxLayout.Y_AXIS));
				  panToDo.add(btn1);
				  panToDo.add(btnRemove);
				  //this is the problem, it's not outputting
				  output();
				panToDo.setVisible(true);
				//todoFrame.add(panToDo);
				 /* lbl1 = new JLabel("Click on the item you like to delete");
			    for (int i=0;i<label.size();i++){
			    final int temp = i;
			    label.get(i).addMouseListener(new java.awt.event.MouseAdapter() {
			        public void mouseClicked(java.awt.event.MouseEvent evt) {
			            //jLabelMouseClicked(evt,label.get(temp ));
			        	label.remove(label[i]);
			     */   // }
			    }});}
			   
		
	
	public void output() {
		// TODO Auto-generated method stub
				do { 
					 hi = txt1.getText();
					 System.out.println(hi);
			        image = new JLabel(); 
			        image.setText(hi);
			        image.setBounds(0,0,10,10); 
			        image.setBackground(Color.green); 
			        image.setOpaque(true); 
			        label.add(image);
			        txt1.setText("");
			    
					hi = null;
			   }while(hi!=null);
				
			for(JLabel j:label) { 
			  panToDo.add(j); 
			 } 
			 panToDo.setVisible(true);
		}

}
	
		
			


