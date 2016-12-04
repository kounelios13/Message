package com.Messages;
import java.awt.Component;
import javax.swing.JOptionPane;
public class Message{
	public static void error(Component panel,String msg,String title){
		JOptionPane.showMessageDialog(panel, msg,title,JOptionPane.ERROR_MESSAGE);
	}
	public static void error(Component p,String msg){
		error(p,msg,"Error");
	}
	public static void error(String msg,String title){
		error(null,msg,title);
	}
	public static void error(String msg){
		error((Component)null,msg);
	}
	public static void info(Component panel,String msg,String title){
		JOptionPane.showMessageDialog(panel, msg,title,JOptionPane.INFORMATION_MESSAGE);
	}
	public static void info(Component p,String msg){
		info(p,msg,"Status");
	}
	public static void info(String msg,String title){
		info(null,msg,title);
	}
	public static void info(String msg){
		info((Component)null,msg);
	}
	public static void warning(Component p,String msg,String title){
		JOptionPane.showMessageDialog(p,msg,title,JOptionPane.WARNING_MESSAGE);
	}
	public static void warning(Component p,String msg){
		warning(p,msg,"Warning");
	}	
	public static void warning(String msg,String title){
		warning(null,msg,title);
	}
	public static void warning(String msg){
		warning((Component)null,msg);
	}
	public static boolean confirm(String message){
		return JOptionPane.showConfirmDialog(null, message) == JOptionPane.OK_OPTION;
	}
	
}
