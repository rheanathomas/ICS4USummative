import java.awt.Color;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ToDo extends Account{
	JFrame todoFrame;
	 ArrayList<JLabel> label = new ArrayList<JLabel>(); 
		JLabel image;
		JLayeredPane lpanTodo = new JLayeredPane();
		JPanel panToDo,panAdd,panDisplay;
		JButton btn1, btn2;
		JTextField txt1;
		String hi;
		JButton btnRemove;
		JLabel lbl1;
		 int int1;
		 JLabel lblImage3;
		 JLabel lblImage4;
	public ToDo(){
		todoFrame = new JFrame();
		todoFrame.setSize(450,650);
		todoFrame.setVisible(true);
		todoFrame.setResizable(false);
		todoFrame.setResizable(false);
		lpanTodo.setPreferredSize(new Dimension(550, 400));
		//todoFrame.setVisible(true);
		todoFrame.setLocation((int) getToolkit().getDefaultToolkit().getScreenSize().getWidth()/2 - todoFrame.getWidth()/2,(int) getToolkit().getDefaultToolkit().getScreenSize().getHeight()/2 - todoFrame.getHeight()/2);
	}
	public void createGui(){
		lblImage3 = new JLabel(); 
		ImageIcon img2g13 = new ImageIcon("C:\\Users\\Rhea\\summative\\todo.png");
		Image image3 = img2g13.getImage(); // transform it 
		Image newimg3 = image3.getScaledInstance(450,650, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon img2g3 = new ImageIcon(newimg3);
		lblImage3.setIcon(img2g3);
		lblImage3.setBounds(0,0,450,650);
	
		lblImage4 = new JLabel();
		ImageIcon img2g14 = new ImageIcon("C:\\Users\\Rhea\\summative\\input.png");
		Image image4 = img2g14.getImage(); // transform it 
		Image newimg4 = image4.getScaledInstance(450,650, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		ImageIcon img2g4 = new ImageIcon(newimg4);
		lblImage4.setIcon(img2g4);
		lblImage4.setBounds(0,0,450,650);
		panToDo = new JPanel();
		//if text goes out of bounds of panel....
		panToDo.setBounds(40,150,375,350);
		panToDo.setLayout(new BoxLayout(panToDo, BoxLayout.Y_AXIS));
		lpanTodo.setLayout(null);
		panDisplay = new JPanel();
		panDisplay.setLayout(null);
		lpanTodo.setBounds(200,0,500,500);
		panAdd = new JPanel();
		panAdd.setBounds(0,0,500,500);
		txt1 = new JTextField("");
		panAdd.setLayout(null);
		panAdd.setBounds(0, 0, 400, 400);
		btn2 = new JButton("Done");
		  JLabel lblAdd = new JLabel("Add your task in the textbox");
		  lblAdd.setForeground(Color.white);
          lblAdd.setBounds(140,50,300,75);
          txt1.setBounds(75,120,300,50);
          btn2.setBounds(192,200,75,30);
          btn2.setBackground(Color.white);
		//	lpanTodo.remove(lblImage3);
			//lpanTodo.remove(panDisplay);
          panAdd.add(lblAdd);
		panAdd.add(btn2);
		panAdd.add(txt1);
		//panDisplay.setOpaque(false);
		panAdd.setOpaque(false);
		panToDo.setOpaque(false);
		
		panAdd.setVisible(false);
		
		btn1 = new JButton("Add");
		btnRemove = new JButton("Remove");
		btn1.setBounds(40,550,100,40);
		btnRemove.setBounds(315,550,100,40);
		panDisplay.add(btn1);
		panDisplay.add(btnRemove);
	
		panDisplay.setBounds(0,0,450,600);
		panDisplay.setOpaque(false);
		
	//	lpanTodo.add(panAdd, new Integer(2));
		//lpanTodo.add(panDisplay, new Integer(2));
	lblImage4.setVisible(false);
		lpanTodo.add(panToDo,new Integer(2));
		lpanTodo.add(panDisplay,new Integer(2));
		lpanTodo.add(panAdd,new Integer(2));
		lpanTodo.add(lblImage3,new Integer(1));
  	lpanTodo.add(lblImage4,new Integer(1));
		lpanTodo.setVisible(true);
		
		
		todoFrame.add(lpanTodo);
		
		todoFrame.setVisible(true);
		
	//}
		
	//public void Actions(){
	btn1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panToDo.setVisible(false);
				panDisplay.setVisible(false);
	           lblImage3.setVisible(false);
	         
				panAdd.setVisible(true);
				lblImage4.setVisible(true);
			//	lpanTodo.add(panAdd, new Integer(2));
				//lpanTodo.add(lblImage4,new Integer(1));
				//lpanTodo.setVisible(true);
			   
			//	lblImage4.setVisible(true);
				//todoFrame.add(panAdd);
				
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
			   
				 remove(strRemove);
				  //int1 = Integer.parseInt(strRemove);
				  //System.out.println(int1);
				 // removefromindex(int1);
				 // label.remove(int1-1);
				 //why do we need to put in the background for it to work?
				  panToDo.removeAll();
				  //panToDo.setLayout(new BoxLayout(panToDo,BoxLayout.Y_AXIS));
				  btn1.setBounds(40,550,100,40);
				  btnRemove.setBounds(315,550,100,40);
				 // todoFrame.add(btn1);
				 // todoFrame.add(btnRemove);
				  //this is the problem, it's not outputting
				  output();
				panToDo.setVisible(true);
				panDisplay.setVisible(true);
				
				
				//todoFrame.add(panToDo);
				 /* lbl1 = new JLabel("Click on the item you like to delete");
			    for (int i=0;i<label.size();i++){
			    final int temp = i;
			    label.get(i).addMouseListener(new java.awt.event.MouseAdapter() {
			        public void mouseClicked(java.awt.event.MouseEvent evt) {
			            //jLabelMouseClicked(evt,label.get(temp ));
			        	label.remove(label[i]);
			     */   // }
			    }

			private void remove(String str) {
				// TODO Auto-generated method stub
				 int1 = Integer.parseInt(str);
				  //System.out.println(int1);
				 // removefromindex(int1);
				  label.remove(int1-1);
			}});}
			   
	
	
	public void output() {
		// TODO Auto-generated method stub
				do { 
					 hi = txt1.getText();
					 System.out.println(hi);
			        image = new JLabel(); 
			        image.setText(hi);
			        image.setBounds(0,0,10,10); 
			        //image.setBackground(Color.OPAQUE); 
			        image.setOpaque(true); 
			        label.add(image);
			        txt1.setText("");
			    
					hi = null;
			   }while(hi!=null);
				
			for(JLabel j:label) { 
			  panToDo.add(j); 
			 } 
		
			 panDisplay.setVisible(true);
			 lblImage3.setVisible(true);
			 //expain that this is not efficient but a solution
		
			 panToDo.setVisible(false);
			 panToDo.setVisible(true);
		}

}
	
		
			


