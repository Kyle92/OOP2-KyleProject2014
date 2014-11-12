import javax.swing.*;
import java.awt.event.*;

public class MyMenu1 extends JFrame {
	
	private JMenuBar menubar;
	MyHandler handler = new MyHandler();
	
	public MyMenu1(){
		setTitle("MyGUI");
		setSize(300,300);
		setLocation(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		menubar = new JMenuBar();
		setJMenuBar(menubar);
		createFileMenu();
		createCharacterMenu();
		
	}
	
	public void createFileMenu(){
		JMenu filemenu = new JMenu("File");
		menubar.add(filemenu);
		JMenuItem open = new JMenuItem("Open");
		filemenu.add(open);
		//MyHandler handler = new MyHandler();
		open.addActionListener(handler);
		JMenuItem save = new JMenuItem("Save");
		filemenu.add(save);
		save.addActionListener(handler);
		JMenuItem saveAs = new JMenuItem("Save As");
		filemenu.add(saveAs);
		saveAs.addActionListener(handler);
		filemenu.addSeparator();
		JMenuItem quit = new JMenuItem("Quit");
		filemenu.add(quit);
		quit.addActionListener(handler);
	
	}
	
	public void createCharacterMenu(){
		JMenu characterMenu = new JMenu("Character");
		menubar.add(characterMenu);
		JMenuItem add = new JMenuItem("Add");
		characterMenu.add(add);
		add.addActionListener(handler);
		JMenuItem edit = new JMenuItem("Edit");
		characterMenu.add(edit);
		edit.addActionListener(handler);
		JMenuItem overwrite = new JMenuItem("Overwrite");
		characterMenu.add(overwrite);
		overwrite.addActionListener(handler);
		characterMenu.addSeparator();
		JMenuItem quit = new JMenuItem("Quit");
		characterMenu.add(quit);
		quit.addActionListener(handler);	
	}
	
	public static void main(String args[]){
		
		MyMenu1 menu = new MyMenu1();
		menu.setVisible(true);
	
	}
	
	/*public void actionPerformed(ActionEvent e){
		
		if(e.getActionCommand().equals("Open"))
			JOptionPane.showMessageDialog(null,"You clicked open","Open",JOptionPane.INFORMATION_MESSAGE);
		else if(e.getActionCommand().equals("Save"))
			JOptionPane.showMessageDialog(null,"You clicked save","Save",JOptionPane.INFORMATION_MESSAGE);
		else if(e.getActionCommand().equals("Save As"))
			JOptionPane.showMessageDialog(null,"You clicked save as","Save As",JOptionPane.INFORMATION_MESSAGE);
		else if(e.getActionCommand().equals("Quit"))
			System.exit(0);
		else if(e.getActionCommand().equals("Add"))
			JOptionPane.showMessageDialog(null,"You clicked add","Add",JOptionPane.INFORMATION_MESSAGE);
		else if(e.getActionCommand().equals("Edit"))
			JOptionPane.showMessageDialog(null,"You clicked edit","Edit",JOptionPane.INFORMATION_MESSAGE);
		else if(e.getActionCommand().equals("Overwrite"))
			JOptionPane.showMessageDialog(null,"You clicked overwrite","Overwrite",JOptionPane.INFORMATION_MESSAGE);
		else if(e.getActionCommand().equals("Quit"))
			System.exit(0);
			
	}*/
	
	public class MyHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
		
		if(e.getActionCommand().equals("Open"))
			JOptionPane.showMessageDialog(null,"You clicked open","Open",JOptionPane.INFORMATION_MESSAGE);
		else if(e.getActionCommand().equals("Save"))
			JOptionPane.showMessageDialog(null,"You clicked save","Save",JOptionPane.INFORMATION_MESSAGE);
		else if(e.getActionCommand().equals("Save As"))
			JOptionPane.showMessageDialog(null,"You clicked save as","Save As",JOptionPane.INFORMATION_MESSAGE);
		else if(e.getActionCommand().equals("Quit"))
			System.exit(0);
		else if(e.getActionCommand().equals("Add"))
			JOptionPane.showMessageDialog(null,"You clicked add","Add",JOptionPane.INFORMATION_MESSAGE);
		else if(e.getActionCommand().equals("Edit"))
			JOptionPane.showMessageDialog(null,"You clicked edit","Edit",JOptionPane.INFORMATION_MESSAGE);
		else if(e.getActionCommand().equals("Overwrite"))
			JOptionPane.showMessageDialog(null,"You clicked overwrite","Overwrite",JOptionPane.INFORMATION_MESSAGE);
		else if(e.getActionCommand().equals("Quit"))
			System.exit(0);
			
	}	
	}
	
	
}