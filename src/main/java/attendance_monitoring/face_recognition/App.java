package attendance_monitoring.face_recognition;

import javax.swing.*;

public class App {
	App() {
		JFrame f = new JFrame();

		JLabel eid = new JLabel(" ID ");
		eid.setBounds(20, 50, 80, 20);

		JLabel ename = new JLabel(" Name ");
		ename.setBounds(20, 80, 80, 20);

		JLabel mailId = new JLabel(" Email id ");
		mailId.setBounds(20, 110, 80, 20);
		
		JLabel phnNo = new JLabel(" Mobile Number ");
		phnNo.setBounds(20, 140, 110, 20);
		
		JLabel img = new JLabel(" Image ");
		img.setBounds(20, 170, 80, 20);

		JTextField eidTF = new JTextField();
		eidTF.setBounds(120, 50, 100, 20);

		JTextField enameTF = new JTextField();
		enameTF.setBounds(120, 80, 100, 20);

		JTextField mailIdTF = new JTextField();
		mailIdTF.setBounds(120, 110, 100, 20);
		
		JTextField phnNoTF = new JTextField();
		phnNoTF.setBounds(120, 140, 100, 20);
		
		JTextField imgTF = new JTextField();
		imgTF.setBounds(120, 170, 100, 20);

		JButton sbmt = new JButton("Submit");
		sbmt.setBounds(20, 200, 100, 30);

		JButton reset = new JButton("Reset");
		reset.setBounds(120, 200, 100, 30);

		f.add(eid);
		f.add(ename);
		f.add(mailId);
		f.add(phnNo);
		f.add(img);
		f.add(eidTF);
		f.add(enameTF);
		f.add(mailIdTF);
		f.add(phnNoTF);
		f.add(imgTF);
		f.add(sbmt);
		f.add(reset);

		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {  
		new App();
	}
}