package com.messages;
import java.awt.Component;
import javax.swing.JOptionPane;
/**
 * 
 * @author Manos Kounelakis
 *
 * <h2>Message</h2>
 * <p>Message is a class that provides <strong>static</strong> methods
 *  that help you inform the user about an event that happened and ask a user to confirm an action
 *  .</p>
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
	 * 
	 * Display an error dialog
	 * 
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
	 * Show an error dialog which contains a message and a title
	 * 
	 * @param msg Message to be displayed
	 * @param title Title of the dialog
	 */
	public static void error(String msg,String title){
		error(null,msg,title);
	}
	/**
	 * Show an error dialog with default title of 'Error' and a message
	 * 
	 * @param msg the error message
	 */
	public static void error(String msg){
		error((Component)null,msg);
	}
	/**
	 * Show an info dialog
	 * 
	 * @param panel Where to display the dialog
	 * @param msg Message to be displayed
	 * @param title Title of the dialog window
	 */
	public static void info(Component panel,String msg,String title){
		JOptionPane.showMessageDialog(panel, msg,title,JOptionPane.INFORMATION_MESSAGE);
	}
	/**
	 * Display an info dialog with a message
	 * 
	 * Default title is Status
	 * 
	 * @param p Where to display the dialog
	 * @param msg Message to display
	 */
	public static void info(Component p,String msg){
		info(p,msg,"Status");
	}
	/**
	 * Display an info dialog with a text and a title
	 * 
	 * @param msg Message to display
	 * @param title  Title of the dialog
	 */
	public static void info(String msg,String title){
		info(null,msg,title);
	}
	/**
	 * Display an info dialog with a title
	 * 
	 * @param msg Message to display
	 */
	public static void info(String msg){
		info((Component)null,msg);
	}
	/**
	 * Display a warning with a message and a title
	 * 
	 * @param p Where to display the warning
	 * @param msg Warning message
	 * @param title Title to display
	 */
	public static void warning(Component p,String msg,String title){
		JOptionPane.showMessageDialog(p,msg,title,JOptionPane.WARNING_MESSAGE);
	}
	/**
	 * Display a warning with a message.Title defaults to Warning
	 * 
	 * @param p Where to display the warning
	 * @param msg Warning message
	 */
	public static void warning(Component p,String msg){
		warning(p,msg,"Warning");
	}
	/**
	 * Display a warning with a message and a title.
	 * @param msg Warning message
	 * @param title Warning title
	 */
	public static void warning(String msg,String title){
		warning(null,msg,title);
	}
	/**
	 * Display a warning with a message
	 * @param msg Warning message
	 */
	public static void warning(String msg){
		warning((Component)null,msg);
	}
	/**
	 * Display a confirmation dialog
	 * @param message Message to display
	 * @return Confirmation value(If the user pressed OK)
	 */
	public static boolean confirm(Object message){
		return JOptionPane.showConfirmDialog(null, message) 
				== JOptionPane.OK_OPTION;
	}
	/**
	 * Display a confirmation dialog
	 * @param parentComponent Where to display the confirmation dialog
	 * @param message Message  to display
	 * @return Confirmation value(If the user pressed OK)
	 */
	public static boolean confirm(Component parentComponent,Object message){
		return JOptionPane.showConfirmDialog(parentComponent, message) == JOptionPane.OK_OPTION;
	}
	/**
	 * Display a confirmation dialog
	 * @param parentComponent Where to display the dialog
	 * @param message Message to display
	 * @param title Title of the dialog
	 * @param optionType Choose the buttons to be displayed in the dialog(DEFAULT_OPTION,OK_CANCEL_OPTION,YES_NO_CANCEL_OPTION,YES_NO_OPTION)
	 * @see javax.swing.JOptionPane#showConfirmDialog(Component, Object, String, int)
	 * 
	 * optionType values refer to the JOptionPane constant fields
	 * @return Confirmation value(If the user pressed OK)
	 */
	public static boolean confirm(Component parentComponent,Object message,String title,int optionType){
		return JOptionPane.showConfirmDialog(parentComponent, message,title,optionType) == JOptionPane.OK_OPTION;
	}
	/**
	 * Display a confirmation dialog
	 * @param parentComponent Where to display the confirmation dialog 
	 * @param message Message to display
	 * @param title Title of the dialog
	 * @param optionType Choose the buttons to be displayed in the dialog(DEFAULT_OPTION,OK_CANCEL_OPTION,YES_NO_CANCEL_OPTION,YES_NO_OPTION)
	 * @param messageType Defines the style of the message. The Look and Feel manager may lay out the dialog differently depending on this value, and will often provide a default icon. The possible values are:
	 * <ul>
	 * 	<li>ERROR_MESSAGE</li>
	 *  <li>INFORMATION_MESSAGE</li>
	 *  <li>WARNING_MESSAGE</li>
	 *  <li>QUESTION_MESSAGE</li>
	 *  <li>PLAIN_MESSAGE</li>
	 * </ul>
	 * <br>
	 * The above values(optionType,messageType) refer to the JOptionPane constant fields
	 * @return Confirmation value(If the user pressed OK)
	 */
	public static boolean confirm(Component parentComponent,Object message,String title,int optionType,int messageType){
		return JOptionPane.showConfirmDialog(parentComponent, message,title,optionType,messageType) 
				== JOptionPane.OK_OPTION;
	}
}
