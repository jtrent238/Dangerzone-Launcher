package com.jtrent238.dangerzone.launcher.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.jtrent238.dangerzone.launcher.Main;

public class InstallUtility {

	private static String dz_21 = "http://dzarchive.jtrent238.tk/dzversions/dangerzone_2.1.zip";
	private static String dz_193 = "http://dzarchive.jtrent238.tk/dzversions/dangerzone_1.9.3.zip";
	private static String dz_19 = "http://dzarchive.jtrent238.tk/dzversions/dangerzone_1.9.zip";
	private static String dz_18b = "http://dzarchive.jtrent238.tk/dzversions/dangerzone_1.8b.zip";
	private static String dz_18a = "http://dzarchive.jtrent238.tk/dzversions/dangerzone_1.8a.zip";
	private static String dz_17 = "https://www.dropbox.com/s/qzue8fvgfhio9ol/dangerzone_1.7.zip?dl=1";
	private static String dz_17b = "https://web.archive.org/web/20190209214509if_/http://server.jtrent238.tk:81/~jtrent238/DangerZoneFiles/DangerZone_1.7b.zip";
	private static String dz_16 = "https://www.dropbox.com/s/i9rdykz6q5pfjv3/dangerzone_1.6.zip?dl=1";
	private static String dz_10 = "http://dzarchive.jtrent238.tk/dzversions/dangerzone_1.0.zip";
	private static String dz_09 = "http://dzarchive.jtrent238.tk/dzversions/dangerzone_0.9.zip";
	private static String dz_08 = "http://dzarchive.jtrent238.tk/dzversions/dangerzone_0.8.zip";
	private static String dz_007 = "http://dzarchive.jtrent238.tk/dzversions/dangerzone_0.0.7.zip";
	private static String dz_0000003 = "http://dzarchive.jtrent238.tk/dzversions/dangerzone_0.0.0.0.0.0.3.zip";

	private static String dzdllink = null;
	private static String dzpath = Main.dzpath;
	
	public static void InstallDZ(String dzversion) {
		// TODO Auto-generated method stub
		
		System.out.println("Downloading Version: " + dzversion);

		switch(dzversion) {
		 case "2.1":
			 dzdllink = dz_21;
			 break;
		 case "1.9.3":
			 dzdllink = dz_193;
			 break;
		 case "1.9":
			 dzdllink = dz_19;	 
			 break;
		 case "1.8b":
			 dzdllink = dz_18b;	 
			 break;
		 case "1.8a":
			 dzdllink = dz_18a;	 
			 break;
		 case "1.7":
			 dzdllink = dz_17;	 
			 break;
		 case "1.7b":
			 dzdllink = dz_17b;	 
			 break;
		 case "1.6":
			 dzdllink = dz_16;	 
			 break;
		 case "1.0":
			 dzdllink = dz_10;	 
			 break;
		 case "0.9":
			 dzdllink = dz_09;	 
			 break;
		 case "0.8":
			 dzdllink = dz_08;	 
			 break;
		 case "0.0.7":
			 dzdllink = dz_007;	 
			 break;
		 case "0.0.0.0.0.0.3":
			 dzdllink = dz_0000003;	 
			 break;
		 default :
			 break;
		 }
   	 try (BufferedInputStream inputStream = new BufferedInputStream(new URL(dzdllink).openStream());
				  FileOutputStream fileOS = new FileOutputStream(dzpath + "/dangerzone_" + dzversion + ".zip")) {
       		 HttpURLConnection httpConnection = (HttpURLConnection) (Main.url.openConnection());
       		 long fileSize = httpConnection.getContentLength();
				    byte data[] = new byte[1024];
				    int byteContent;
				    int fs = 0;
				    //progressBar.setMaximum(42);
				    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
				        fileOS.write(data, 0, byteContent);
				        fs++;
				        
				        //progressBar.setValue((int) (fs/fileSize));
				        //progressBar.update(progressBar.getGraphics());
				        //System.out.println((int) (fs/fileSize));
				    }
				    System.out.println("Version: " + dzversion + " Downloaded!");
				} catch (IOException e1) {
				    // handles IO exceptions
				}
   	 
   	 
        try {
       	 System.out.println("Installing Version: " + dzversion);
            Main.unzipper.unzip(dzpath + "/dangerzone_" + dzversion + ".zip", dzpath + "/dangerzone_" + dzversion);
            //progressBar.setValue(progressBar.getValue() + 2);
		     //progressBar.update(progressBar.getGraphics());
        } catch (Exception ex) {
            // some errors occurred
            ex.printStackTrace();
        }
        if(System.getProperty("os.name") != "Windows") {
       	 try {
       		
       		String native_linux_libjinput = dzpath + "dangerzone_" + dzversion + "/DangerZone_lib/native/linux/libjinput-linux.so";
       		String native_linux_libjinput_newdir = dzpath + "dangerzone_" + dzversion + "/DangerZone_lib/native/libjinput-linux.so";
			File f = new File(native_linux_libjinput_newdir);
       		
       		if(f.exists() && !f.isDirectory()) { 
       		    System.out.println("File: " + native_linux_libjinput + " already exists SKIPPING!");
       		} else if(!f.exists() && !f.isDirectory()) {
       			Files.move (Paths.get(native_linux_libjinput), Paths.get(native_linux_libjinput_newdir));
       		}

       		String native_linux_liblwjgl = dzpath + "dangerzone_" + dzversion + "/DangerZone_lib/native/linux/liblwjgl.so";
       		String native_linux_liblwjgl_newdir = dzpath + "dangerzone_" + dzversion + "/DangerZone_lib/native/liblwjgl.so";
			File f1 = new File(native_linux_liblwjgl_newdir);
       		
       		if(f1.exists() && !f1.isDirectory()) { 
       		    System.out.println("File: " + native_linux_liblwjgl + " already exists SKIPPING!");
       		} else if(!f1.exists() && !f1.isDirectory()) {
       			Files.move (Paths.get(native_linux_liblwjgl), Paths.get(native_linux_liblwjgl_newdir));
       		}
				
       		String native_linux_liblwjgl64 = dzpath + "dangerzone_" + dzversion + "/DangerZone_lib/native/linux/liblwjgl64.so";
       		String native_linux_liblwjgl64_newdir = dzpath + "dangerzone_" + dzversion + "/DangerZone_lib/native/liblwjgl64.so";
			File f2 = new File(native_linux_liblwjgl64_newdir);
       		
       		if(f2.exists() && !f2.isDirectory()) { 
       		    System.out.println("File: " + native_linux_liblwjgl64 + " already exists SKIPPING!");
       		} else if(!f2.exists() && !f2.isDirectory()) {
       			Files.move (Paths.get(native_linux_liblwjgl64), Paths.get(native_linux_liblwjgl64_newdir));
       		}	
       		
       		String native_linux_libopenal = dzpath + "dangerzone_" + dzversion + "/DangerZone_lib/native/linux/libopenal.so";
       		String native_linux_libopenal_newdir = dzpath + "dangerzone_" + dzversion + "/DangerZone_lib/native/libopenal.so";
			File f3 = new File(native_linux_libopenal_newdir);
       		
       		if(f3.exists() && !f3.isDirectory()) { 
       		    System.out.println("File: " + native_linux_libopenal + " already exists SKIPPING!");
       		} else if(!f3.exists() && !f3.isDirectory()) {
       			Files.move (Paths.get(native_linux_libopenal), Paths.get(native_linux_libopenal_newdir));
       		}	
       		
       		String native_linux_libopenal64 = dzpath + "dangerzone_" + dzversion + "/DangerZone_lib/native/linux/libopenal64.so";
       		String native_linux_libopenal64_newdir = dzpath + "dangerzone_" + dzversion + "/DangerZone_lib/native/libopenal64.so";
			File f4 = new File(native_linux_libopenal64_newdir);
       		
       		if(f4.exists() && !f4.isDirectory()) { 
       		    System.out.println("File: " + native_linux_libopenal64 + " already exists SKIPPING!");
       		} else if(!f4.exists() && !f4.isDirectory()) {
       			Files.move (Paths.get(native_linux_libopenal64), Paths.get(native_linux_libopenal64_newdir));
       		}		
			
       		String native_linux_libjinput64 = dzpath + "dangerzone_" + dzversion + "/DangerZone_lib/native/linux/libjinput-linux64.so";
       		String native_linux_libjinput64_newdir = dzpath + "dangerzone_" + dzversion + "/DangerZone_lib/native/libjinput-linux64.so";
			File f5 = new File(native_linux_libjinput64_newdir);
       		
       		if(f5.exists() && !f5.isDirectory()) { 
       		    System.out.println("File: " + native_linux_libjinput64 + " already exists SKIPPING!");
       		} else if(!f5.exists() && !f5.isDirectory()) {
       			Files.move (Paths.get(native_linux_libjinput64), Paths.get(native_linux_libjinput64_newdir));
       		}	
       		
       		String native_linux_liblwjgl1 = dzpath + "dangerzone_" + dzversion + "/Launcher_lib/native/linux/liblwjgl.so";
       		String native_linux_liblwjgl_newdir1 = dzpath + "dangerzone_" + dzversion + "/Launcher_lib/native/liblwjgl.so";
			File f6 = new File(native_linux_liblwjgl_newdir1);
       		
       		if(f6.exists() && !f6.isDirectory()) { 
       		    System.out.println("File: " + native_linux_liblwjgl1 + " already exists SKIPPING!");
       		} else if(!f6.exists() && !f6.isDirectory()) {
       			Files.move (Paths.get(native_linux_liblwjgl1), Paths.get(native_linux_liblwjgl_newdir1));
       		}
       		
       		String native_linux_liblwjgl641 = dzpath + "dangerzone_" + dzversion + "/Launcher_lib/native/linux/liblwjgl64.so";
       		String native_linux_liblwjgl64_newdir1 = dzpath + "dangerzone_" + dzversion + "/Launcher_lib/native/liblwjgl64.so";
			File f7 = new File(native_linux_liblwjgl64_newdir1);
       		
       		if(f7.exists() && !f7.isDirectory()) { 
       		    System.out.println("File: " + native_linux_liblwjgl641 + " already exists SKIPPING!");
       		} else if(!f7.exists() && !f7.isDirectory()) {
       			Files.move (Paths.get(native_linux_liblwjgl641), Paths.get(native_linux_liblwjgl64_newdir1));
       		}
       		
       		String native_linux_libopenal1 = dzpath + "dangerzone_" + dzversion + "/Launcher_lib/native/linux/libopenal.so";
       		String native_linux_libopenal_newdir1 = dzpath + "dangerzone_" + dzversion + "/Launcher_lib/native/libopenal.so";
			File f8 = new File(native_linux_libopenal_newdir1);
       		
       		if(f8.exists() && !f8.isDirectory()) { 
       		    System.out.println("File: " + native_linux_libopenal1 + " already exists SKIPPING!");
       		} else if(!f8.exists() && !f8.isDirectory()) {
       			Files.move (Paths.get(native_linux_libopenal1), Paths.get(native_linux_libopenal_newdir1));
       		}
       		
       		String native_linux_libopenal641 = dzpath + "dangerzone_" + dzversion + "/Launcher_lib/native/linux/libopenal64.so";
       		String native_linux_libopenal64_newdir1 = dzpath + "dangerzone_" + dzversion + "/Launcher_lib/native/libopenal64.so";
			File f9 = new File(native_linux_libopenal64_newdir1);
       		
       		if(f9.exists() && !f9.isDirectory()) { 
       		    System.out.println("File: " + native_linux_libopenal641 + " already exists SKIPPING!");
       		} else if(!f9.exists() && !f9.isDirectory()) {
       			Files.move (Paths.get(native_linux_libopenal641), Paths.get(native_linux_libopenal64_newdir1));
       		}
       		
       		String native_linux_libjinput641 = dzpath + "dangerzone_" + dzversion + "/Launcher_lib/native/linux/libjinput-linux64.so";
       		String native_linux_libjinput64_newdir1 = dzpath + "dangerzone_" + dzversion + "/Launcher_lib/native/libjinput-linux64.so";
			File f10 = new File(native_linux_libjinput64_newdir1);
       		
       		if(f10.exists() && !f10.isDirectory()) { 
       		    System.out.println("File: " + native_linux_libjinput641 + " already exists SKIPPING!");
       		} else if(!f10.exists() && !f10.isDirectory()) {
       			Files.move (Paths.get(native_linux_libjinput641), Paths.get(native_linux_libjinput64_newdir1));
       		}
				
       		String native_linux_libjinput1 = dzpath + "dangerzone_" + dzversion + "/Launcher_lib/native/linux/libjinput-linux.so";
       		String native_linux_libjinput_newdir1 = dzpath + "dangerzone_" + dzversion + "/Launcher_lib/native/libjinput-linux.so";
			File f11 = new File(native_linux_libjinput_newdir1);
       		
       		if(f11.exists() && !f11.isDirectory()) { 
       		    System.out.println("File: " + native_linux_libjinput1 + " already exists SKIPPING!");
       		} else if(!f11.exists() && !f11.isDirectory()) {
       			Files.move (Paths.get(native_linux_libjinput1), Paths.get(native_linux_libjinput_newdir1));
       		}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
        System.out.println("Version: " + dzversion + " Installed!");
	}
        
	}
}
