package com.jtrent238.dangerzone.launcher.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

import com.jtrent238.dangerzone.launcher.Main;

public class RunUtility {

	private static String dzpath = Main.dzpath;
	
	public static void RunDZ(String dzversion) {
		//Runtime.getRuntime();
		
		 try {
			 
			 File f = new File(dzpath + "dangerzone_" + dzversion + "/Launcher.jar");
	       		
	       		if(f.exists() && !f.isDirectory()) { 
	       			System.out.println("Launching Version: " + dzversion);
	   			 
	   			 ProcessBuilder pb = new ProcessBuilder("java", "-jar", "Launcher.jar");
	   		        pb.redirectErrorStream(true);
	   		        pb.directory(new File(dzpath + "dangerzone_" + dzversion));

	   		        System.out.println("Directory: " + pb.directory().getAbsolutePath());
	   		        //System.out.println(pb.command()..toString());
	   		        Process p = pb.start();
	   		        System.out.println("Version: " + dzversion + " Launched!");
	   		        InputStream is = p.getInputStream();
	   		        BufferedReader br = new BufferedReader(new InputStreamReader(is));
	   		        for (String line = br.readLine(); line != null; line = br.readLine()) {
	   		                System.out.println( line ); // Or just ignore it
	   		        }
	   		        try {
	   		        	
	   					p.waitFor();
	   				} catch (InterruptedException e) {
	   					// TODO Auto-generated catch block
	   					e.printStackTrace();
	   				}      
	       		} else if(!f.exists() && !f.isDirectory()) {
	       			JOptionPane.showMessageDialog(null, "DangerZone Version: " + dzversion + " NOT Installed", "ERROR: " + Main.title, JOptionPane.ERROR_MESSAGE);
	       		}
			 
	       		
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, "DangerZone Version: " + dzversion + " NOT Installed", "ERROR: " + Main.title, JOptionPane.ERROR_MESSAGE);
		}
		 
	}

}
