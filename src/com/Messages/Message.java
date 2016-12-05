package com.Messages;
import java.awt.Component;
import javax.swing.JOptionPane;
/**
 * @author Manos Kounelakis
 *
 */
public class Message{
	/**
	 * Display an error dialog
	 * 
	 * @param panel Where to show the dialog
	 * @param msg Message to be displayed in the dialog window
	 * @param title title of the dialog
	 */
	public static void error(Component panel,String msg,String title){
		JOptionPane.showMessageDialog(panel, msg,title,JOptionPane.ERROR_MESSAGE);
	}
	/**
	 * <h2>
	 * Display an error dialog
	 * </h2>
	 * <p>
	 * Create a dialog with a default title of <em>Error</em>
	 * </p>
	 * @param p Where to show the dialog
	 * @param msg Message to be displayed in the dialog window
	 */
	public static void error(Component p,String msg){
		error(p,msg,"Error");
	}
	/**
	 * Show a dialog which contains a message and a title
	 * 
	 * @param msg Message to be displayed
	 * @param title Title of the dialog
	 */
	public static void error(String msg,String title){
		error(null,msg,title);
	}
	/**
	 * Show a dialog with default title of 'Error' and a message
	 * 
	 * @param msg the error message
	 */
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
	public static boolean confirm(Component parentComponent,Object message){
		return JOptionPane.showConfirmDialog(parentComponent, message) == JOptionPane.OK_OPTION;
	}
	public static boolean confirm(Component parentComponent,Object message,String title,int optionType){
		return JOptionPane.showConfirmDialog(parentComponent, message,title,optionType) == JOptionPane.OK_OPTION;
	}
	public static boolean confirm(Component parentComponent,Object message,String title,int optionType,int messageType){
		return JOptionPane.showConfirmDialog(parentComponent, message,title,optionType,messageType) 
				== JOptionPane.OK_OPTION;
	}
}
