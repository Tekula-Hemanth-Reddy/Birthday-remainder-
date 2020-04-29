package BirthdayRemainder;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ui implements ActionListener
{
	JFrame jf;
	JLabel jl;
	String msg;
	JButton jb;
	Ui(String m)
	{
		msg=m;
		jf=new JFrame();
		jf.setSize(684,528);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		jl=new JLabel("wish "+msg+" happy Birthday");
		jl.setForeground(Color.ORANGE);
		jl.setFont(new Font("Tahoma", Font.PLAIN, 30));
		jl.setBounds(100, 100, 400, 62);
		jf.getContentPane().add(jl);
		jb=new JButton("Done");
		jb.setBounds(500,300,70,30);
		jb.addActionListener(this);
		jf.add(jb);
		jf.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		jf.dispose();
	}
}