package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener{

	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton button1=new JButton();
	JButton button2=new JButton();
	
	
public void run() {
	
	panel.add(button1);
	panel.add(button2);
	frame.add(panel);
	frame.setVisible(true);
	
	button1.setText("Trick");
	button2.setText("Treat");
	
	button1.addActionListener(this);
	button2.addActionListener(this);
	
	

	

	
	
	
}
	
private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button1) {
		showPictureFromTheInternet("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/dog-puppy-on-garden-royalty-free-image-1586966191.jpg?crop=1.00xw:0.669xh;0,0.190xh&resize=640:*");
	}
	
	if(e.getSource()==button2) {
		showPictureFromTheInternet("https://pbs.twimg.com/media/D4Suw6eUwAAHh63.jpg");
	}
	
	
}

}


