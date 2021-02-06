package com.jtrent238.dangerzone.launcher;

//Usually you will require both swing and awt packages
//even if you are working with just swings.
import javax.swing.*;

import com.jtrent238.dangerzone.launcher.util.UnzipUtility;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

class gui {
	
    private static JEditorPane editor;
    private static JScrollPane scroll;
    private static URL url;
    public static String title = "DangerZone Launcher - By: jtrent238";
	private static String URL = "https://dzarchive.jtrent238.tk";
	private static String dzpath = System.getenv("APPDATA") + "\\DangerZone\\";
	private static String dzprop = dzpath + "/" + "DangerZone.Properties";
	public static String playername = "Player";
	public static String playerpassword = "";
	public static String errstring = null;
	public static String crypted_password = null;
	public static String dzlatest = "2.1";
	
	private static String dz_21 = "http://www.dangerzonegame.net/uploads/2/5/3/5/25358181/dangerzone_2.1.zip";
	private static String dz_20 = "version_link";
	private static String dz_193 = "http://dzarchive.jtrent238.tk/dzversions/dangerzone_1.9.3.zip";
	private static String dz_19 = "http://dzarchive.jtrent238.tk/dzversions/dangerzone_1.9.zip";
	private static String dz_18 = "version_link";
	private static String dz_18b = "http://dzarchive.jtrent238.tk/dzversions/dangerzone_1.8b.zip";
	private static String dz_18a = "http://dzarchive.jtrent238.tk/dzversions/dangerzone_1.8a.zip";
	private static String dz_17 = "https://www.dropbox.com/s/qzue8fvgfhio9ol/dangerzone_1.7.zip?dl=1";
	private static String dz_17b = "https://web.archive.org/web/20190209214509if_/http://server.jtrent238.tk:81/~jtrent238/DangerZoneFiles/DangerZone_1.7b.zip";
	private static String dz_16 = "https://www.dropbox.com/s/i9rdykz6q5pfjv3/dangerzone_1.6.zip?dl=1";
	private static String dz_10 = "http://dzarchive.jtrent238.tk/dzversions/dangerzone_1.0.zip";
	private static String dz_09 = "http://dzarchive.jtrent238.tk/dzversions/dangerzone_0.9.zip";
	private static String dz_08 = "http://dzarchive.jtrent238.tk/dzversions/dangerzone_0.8.zip";

	static UnzipUtility unzipper = new UnzipUtility();
	
	static String[] dz_versions = { "Latest", "2.1"};
	
 public static void main(String args[]) throws IOException {

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
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	 }
	 
	 
     //Creating the Frame
     JFrame frame = new JFrame(title);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(600, 200);

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
     JLabel dzversionsListLabel = new JLabel("Select Version:");
     JLabel labelUsername = new JLabel("Username:");
     JLabel labelPassword = new JLabel("Password:");
     JTextField textfieldUsername = new JTextField(10); // accepts upto 10 characters
     JTextField textfieldPassword = new JTextField(10); // accepts upto 10 characters
     JButton btnLogin = new JButton("Login");
     JButton btnInstall = new JButton("Install");
     JButton btnLaunch = new JButton("Launch");
     JComboBox<String> dzversionsList = new JComboBox<String>(dz_versions);
     
     panel.add(dzversionsListLabel);
     panel.add(dzversionsList);
     panel.add(btnInstall);
     panel.add(btnLaunch);
     //panel.add(labelUsername); // Components Added using Flow Layout
     //panel.add(textfieldUsername);
     //panel.add(labelPassword);
     //panel.add(textfieldPassword);
     //panel.add(btnLogin);

     // Text Area at the Center
     JTextArea ta = new JTextArea();
     //add scroll pane to jframe center

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
    			 System.out.println("Downloading Version: " + dzversion);

	        	 try (BufferedInputStream inputStream = new BufferedInputStream(new URL(dz_21).openStream());
    					  FileOutputStream fileOS = new FileOutputStream(dzpath + "/dangerzone_2.1.zip")) {
    					    byte data[] = new byte[1024];
    					    int byteContent;
    					    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
    					        fileOS.write(data, 0, byteContent);
    					    }
    					    System.out.println("Version: " + dzversion + " Downloaded!");
    					} catch (IOException e1) {
    					    // handles IO exceptions
    					}
	        	 
	        	 
	             try {
	            	 System.out.println("Installing Version: " + dzversion);
	                 unzipper.unzip(dzpath + "/dangerzone_2.1.zip", dzpath + "\\dangerzone_2.1");
	             } catch (Exception ex) {
	                 // some errors occurred
	                 ex.printStackTrace();
	             }
	             System.out.println("Version: " + dzversion + " Installed!");
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
			 
			 
			 Runtime rt = Runtime.getRuntime();
			 try {
				 System.out.println("Launching Version: " + dzversion);
				 Runtime.getRuntime().exec(System.getProperty(dzpath + "dangerzone_2.1\\Win10Launcher.bat"));
				 System.out.println("java -jar " + dzpath + "dangerzone_2.1\\Launcher.jar");
				 
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 System.out.println("Version: " + dzversion + " Launched!");
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