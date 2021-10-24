package test.serial01;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JList;

import com.fazecast.jSerialComm.SerialPort;

public class Test extends JFrame {

	public static void main(String[] args) {
		Arrays.stream(SerialPort.getCommPorts()).forEach(System.out::println);
		new Test();
	}
	
	public Test() {
		super("Serial Communication");
		init_ui();
	}
	
	private void init_ui() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.getContentPane().add(new JList<>(SerialPort.getCommPorts()));
		
		setVisible(true);
	}
}
