package com.jtrent238.dangerzone.launcher;

//Usually you will require both swing and awt packages
//even if you are working with just swings.
import javax.swing.*;

import com.jtrent238.dangerzone.launcher.util.InstallUtility;
import com.jtrent238.dangerzone.launcher.util.RunUtility;
import com.jtrent238.dangerzone.launcher.util.UnzipUtility;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
	
	//Get the operating system
	
	public static String launcher_version = "1.0.0.0";
	
	public static JEditorPane editor;
    public static URL url;
    public static String title = "DangerZone Launcher - By: jtrent238";
    public static String URL = "https://dzarchive.jtrent238.tk";
	//private static String dzpath = System.getenv("APPDATA") + "\\DangerZone\\";
	public static String dzpath = null;
	//private static String dzprop = dzpath + "\\" + "DangerZone.Properties";
	public static String dzprop = null;
	public static String playername = "Player";
	public static String playerpassword = "";
	public static String errstring = null;
	public static String crypted_password = null;
	public static String dzlatest = "2.1";
	

	private static String ver21 = "2.1";
	private static String ver193 = "1.9.3";
	private static String ver19 = "1.9";
	private static String ver18b = "1.8b";
	private static String ver18a = "1.8a";
	private static String ver17 = "1.7";
	private static String ver17b = "1.7b";
	private static String ver16 = "1.6";
	private static String ver10 = "1.0";
	private static String ver09 = "0.9";
	private static String ver08 = "0.8";
	private static String ver007 = "0.0.7";
	private static String ver0000003 = "0.0.0.0.0.0.3";
	
  	 
	public static UnzipUtility unzipper = new UnzipUtility();
	
	static String[] dz_versions = { "Latest", "2.1", "1.9.3", "1.9", "1.8b", "1.8a", "1.7", "1.7b", "1.6", "1.0", "0.9", "0.8", "0.0.7", "0.0.0.0.0.0.3"};

 public static void main(String args[]) throws IOException {

	 try {
		  System.out.println("Running: " + System.getProperty("os.name") + " " + System.getProperty("os.arch"));
		  } catch (Exception e) {
		    System.out.println(e.getMessage());
		  }
		  
	 try {
		 if(System.getProperty("os.name") != null) {
			 dzpath = System.getProperty("user.home")  + "/DangerZone/";
			 dzprop = dzpath + "DangerZone.Properties";
		 }
	 } catch (Exception e) {
		 System.out.println(e.getMessage());
	 }
	 
	 
	 System.out.println("DangerZone Path: " + dzpath);
	 System.out.println(dzprop);
	 
	 File dzpathDir = new File(dzpath);
	 if (!dzpathDir.exists()){
		 dzpathDir.mkdirs();
	 }

	 File dzpropf = new File(dzprop);
	 if (!dzpropf.exists()){
		 dzpropf.createNewFile();
		 dzpropf.setWritable(true);
		 
		 try {
		      FileWriter myWriter = new FileWriter(dzprop);
		      myWriter.write("#DangerZoneProperties Generated by DangerZoneLauncher");
		      myWriter.close();
		      //System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	 }
	 
	 
     //Creating the Frame
     JFrame frame = new JFrame(title);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(600, 75);

     //set the url
     try {
         url = new URL(URL);
     }
     catch(MalformedURLException mue) {
         JOptionPane.showMessageDialog(null,mue);
     }
     
   //create the JEditorPane
     try {
         editor = new JEditorPane(URL);
         
         //set the editor pane to false.
         editor.setEditable(false);
     }
     catch(IOException ioe) {
         JOptionPane.showMessageDialog(null,ioe);
     }
     //Creating the panel at bottom and adding components
     JPanel panel = new JPanel(); // the panel is not visible in output
     JProgressBar progressBar = new JProgressBar();
     JLabel dzversionsListLabel = new JLabel("Select Version:");
     JLabel labelUsername = new JLabel("Username:");
     JLabel labelPassword = new JLabel("Password:");
     JTextField textfieldUsername = new JTextField(10); // accepts upto 10 characters
     JTextField textfieldPassword = new JTextField(10); // accepts upto 10 characters
     JButton btnLogin = new JButton("Login");
     JButton btnInstall = new JButton("Install");
     JButton btnLaunch = new JButton("Launch");
     JComboBox<String> dzversionsList = new JComboBox<String>(dz_versions);
     
     panel.add(progressBar);
     panel.add(dzversionsListLabel);
     panel.add(dzversionsList);
     panel.add(btnInstall);
     panel.add(btnLaunch);
     //panel.add(labelUsername); // Components Added using Flow Layout
     //panel.add(textfieldUsername);
     //panel.add(labelPassword);
     //panel.add(textfieldPassword);
     //panel.add(btnLogin);

     new JTextArea();

     //Adding Components to the frame.
     frame.getContentPane().add(BorderLayout.SOUTH, panel);
     //frame.getContentPane().add(BorderLayout.CENTER, editor);
     frame.setVisible(true);
     
     btnInstall.addActionListener(new ActionListener() {
       	 private String dzversion;

		@Override
 	    public void actionPerformed(ActionEvent e) {
 	        //your actions
    		 dzversion = dzversionsList.getSelectedItem().toString();
    		 if(dzversion == "Latest") {
    			 dzversion = dzlatest;
    		 }
    		 
    		 File dzverfile = new File(dzpath + "dzversions.txt");
    		 if (!dzverfile.exists()){
    			 try {
					dzverfile.createNewFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    			 dzverfile.setWritable(true);
    			 
    			 
    		 }
    		 switch(dzversion) {
    		 case "2.1":
    			String casever21 = ver21;
    			InstallUtility.InstallDZ(casever21);
    			 break;
    		 case "1.9.3":
    			 String casever193 = ver193;
    			 InstallUtility.InstallDZ(casever193);
    			 break;
    		 case "1.9":
	    		String casever19 = ver19;	 
	    		InstallUtility.InstallDZ(casever19);
    			 break;
    		 case "1.8b":
	    		String casever18b = ver18b;	 
	    		InstallUtility.InstallDZ(casever18b);
    			 break;
    		 case "1.8a":
	    		String casever18a = ver18a;	 
	    		InstallUtility.InstallDZ(casever18a);
    			 break;
    		 case "1.7":
	    		String casever17 = ver17;	 
	    		InstallUtility.InstallDZ(casever17);
    			 break;
    		 case "1.7b":
	    		String casever17b = ver17b;	 
	    		InstallUtility.InstallDZ(casever17b);
    			 break;
    		 case "1.6":
	    		String casever16 = ver16;	 
	    		InstallUtility.InstallDZ(casever16);
    			 break;
    		 case "1.0":
	    		String casever10 = ver10;	 
	    		InstallUtility.InstallDZ(casever10);
    			 break;
    		 case "0.9":
	    		String casever09 = ver09;	 
	    		InstallUtility.InstallDZ(casever09);
    			 break;
    		 case "0.8":
	    		String casever08 = ver08;	 
	    		InstallUtility.InstallDZ(casever08);
    			 break;
    		 case "0.0.7":
    			String casever007 = ver007;	 
 	    		InstallUtility.InstallDZ(casever007);
    			 break;
    		 case "0.0.0.0.0.0.3":
    			String casever0000003 = ver0000003;	 
 	    		InstallUtility.InstallDZ(casever0000003);
    			 break;
			 default :
				 break;
    		 }
    	 }

     });
     
     btnLaunch.addActionListener(new ActionListener() {
       	 private String dzversion;

    	 @Override
 	    public void actionPerformed(ActionEvent e) {
 	        //your actions
    		 dzversion = dzversionsList.getSelectedItem().toString();
    		 if(dzversion == "Latest") {
    			 dzversion = dzlatest;
    		 }
		 switch(dzversion) {
		 case "2.1":
			 String casever21 = ver21;
			 RunUtility.RunDZ(casever21);
			 break;
		 case "1.9.3":
			 String casever193 = ver193;
			 RunUtility.RunDZ(casever193);
			 break;
		 case "1.9":
			 String casever19 = ver19;
			 RunUtility.RunDZ(casever19);
			 break;
		 case "1.8b":
			 String casever18b = ver18b;
			 RunUtility.RunDZ(casever18b);
			 break;
		 case "1.8a":
			 String casever18a = ver18a;
			 RunUtility.RunDZ(casever18a);
			 break;
		 case "1.7":
			 String casever17 = ver17;
			 RunUtility.RunDZ(casever17);
			 break;
		 case "1.7b":
			 String casever17b = ver17b;
			 RunUtility.RunDZ(casever17b);
			 break;
		 case "1.6":
			 String casever16 = ver16;
			 RunUtility.RunDZ(casever16);
			 break;
		 case "1.0":
			 String casever10 = ver10;
			 RunUtility.RunDZ(casever10);
			 break;
		 case "0.9":
			 String casever09 = ver09;
			 RunUtility.RunDZ(casever09);
			 break;
		 case "08":
			 String casever08 = ver08;
			 RunUtility.RunDZ(casever08);
			 break;
		 case "0.0.7":
			String casever007 = ver007;	 
			RunUtility.RunDZ(casever007);
			 break;
		 case "0.0.0.0.0.0.3":
			String casever0000003 = ver0000003;	 
			RunUtility.RunDZ(casever0000003);
			 break;
		 default :
			 break;
		 }}
     });
     btnLogin.addActionListener(new ActionListener() {

    	    @Override
    	    public void actionPerformed(ActionEvent e) {
    	        //your actions
    	    	if(textfieldUsername.getText().length() < 4 || textfieldPassword.getText().length() < 4 ) {
    	    		errstring = "Invalid Username and Password";
    	    		JOptionPane.showMessageDialog(null, errstring, "InfoBox: " + title, JOptionPane.ERROR_MESSAGE);
    	    	} else {
    	    		playername = textfieldUsername.getText();
        	    	playerpassword = textfieldPassword.getText();
        	    	doCryptPassword();
        	    	System.out.println("Crypted Password: " + crypted_password);
        	        JOptionPane.showMessageDialog(null, "Loggedin as: " + playername, "InfoBox: " + title, JOptionPane.INFORMATION_MESSAGE);
        	    labelUsername.remove(labelUsername);
        	    labelPassword.remove(labelPassword);
        	    textfieldUsername.remove(textfieldUsername);
    	    	textfieldPassword.remove(textfieldPassword);
    	    	//IMPORTANT
    	    	panel.revalidate();
    	    	panel.repaint();
    	    	}
    	    		
    	    }
    	});
 }
 
 public static void doCryptPassword() {
	    int namelen = playername.length();
	    int passlen = playerpassword.length();
	    String dzstring = "DangerZone is the best!";
	    int dzstlen = dzstring.length();
	    String hashbackstring = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    int hashbacklen = hashbackstring.length();
	    int[] nameint = new int[32];
	    int[] passint = new int[32];
	    int[] dzstint = new int[32];
	    int[] cryptint = new int[32];
	    if (namelen < 4 || passlen < 4) {
	      errstring = "password encryption failure";
	      return;
	    } 
	    String tstring = playername.toLowerCase();
	    byte[] asbytes = tstring.getBytes();
	    int i;
	    for (i = 0; i < 32; i++)
	      nameint[i] = asbytes[i % namelen]; 
	    asbytes = playerpassword.getBytes();
	    for (i = 0; i < 32; i++)
	      passint[i] = asbytes[i % passlen]; 
	    asbytes = dzstring.getBytes();
	    for (i = 0; i < 32; i++)
	      dzstint[i] = asbytes[i % dzstlen]; 
	    for (i = 0; i < 32; i++) {
	      cryptint[i] = nameint[i] * passint[31 - i];
	      cryptint[i] = cryptint[i] / 8;
	      cryptint[i] = cryptint[i] * dzstint[i];
	      cryptint[i] = cryptint[i] / 4;
	      cryptint[i] = cryptint[i] + (nameint[i] ^ passint[i] ^ dzstint[i]);
	    } 
	    for (i = 0; i < 32; i++) {
	      cryptint[i] = cryptint[i] & 0xFFF;
	      int j = cryptint[i];
	      cryptint[i] = cryptint[cryptint[i] % 32];
	      cryptint[cryptint[i] % 32] = j;
	    } 
	    crypted_password = "";
	    for (i = 0; i < 32; i++)
	      crypted_password = String.valueOf(crypted_password) + hashbackstring.charAt(cryptint[i] % hashbacklen); 
	  }
 
}