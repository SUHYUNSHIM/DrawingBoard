package SubFrame;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.imageio.ImageIO;
import javax.swing.JDialog;

import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Frame.MainDesktopPane;
import Frame.MainFrame;
import Frame.main;
import SubPanel.DrawPanel;
import SubFrame.CenterPanel;
import information.Information;

public class TopMenu extends JMenuBar{
	
	private JMenu fileMenu;
	private JMenuItem open,save,exit;
	private JMenu menu2;
	private JMenuItem inform;
	public static JLabel imageLabel =new JLabel();
	
	public TopMenu()
	{
		this.setBackground(Color.WHITE);
		
		fileMenu = new JMenu("File");
		fileMenu.setMnemonic('F');
		
		ImageIcon openfile = new ImageIcon("resource/open.png");
		open = new JMenuItem("Open",openfile);/////////////////////////////////////////////////////////OPEN
		open.setMnemonic('O');
		open.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JFileChooser jfilechooser = new JFileChooser();
				jfilechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				int judge = jfilechooser.showOpenDialog(null);
				
				String filePath = jfilechooser.getSelectedFile().getPath();
				imageLabel.setIcon(new ImageIcon(filePath));
				
				
			}
		});
		
		ImageIcon savefile = new ImageIcon("resource/save.png");
		save = new JMenuItem("Save",savefile);/////////////////////////////////////////////////////SAVE
		save.setMnemonic('S');
		save.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
					File x=null;
					JFileChooser jfilechooser = new JFileChooser();
					int judge = jfilechooser.showSaveDialog(null);
					ObjectOutputStream out = null;
				
					switch(judge)
					{
						case JFileChooser.APPROVE_OPTION : 
							x= jfilechooser.getSelectedFile();
							
							try {
							
								out = new ObjectOutputStream(new FileOutputStream(x));
								System.out.println(Information.getCurrentJPanel());
								out.writeObject(Information.getCurrentJPanel());
								out.flush();
								out.close();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}	
							break;
						case JFileChooser.CANCEL_OPTION : 
							return;	
					}
				
				
			}
				
			
		});
		
		
		ImageIcon exitfile = new ImageIcon("resource/exit.png");
		exit = new JMenuItem("Exit",exitfile); 
		exit.setMnemonic('E');
		exit.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		
		fileMenu.add(open);
		
		fileMenu.add(save);
		fileMenu.add(exit);
		this.add(fileMenu);
		//this.add(imageLabel);
		menu2 = new JMenu("Help");
		ImageIcon university = new ImageIcon("resource/university.png");
		inform = new JMenuItem("Information",university);
		inform.setMnemonic('H');
		
		inform.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e){
		
				JOptionPane.showMessageDialog(null,"             ������ ������ �̴��� �ɼ���","Made by", JOptionPane.CLOSED_OPTION); 		
			}
		});
		
		

		menu2.add(inform);
		this.add(menu2);
		
		
		
		
	}

}
