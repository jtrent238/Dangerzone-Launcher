using System;
using System.Windows.Forms;
using System.IO;
using System.IO.Compression;
using System.Net;
using System.Diagnostics;

namespace DangerZoneLauncher
{
    public partial class Form1 : Form
    {
       
        private static string dzPath = Environment.GetFolderPath(Environment.SpecialFolder.ApplicationData) + "/DangerZone/";
        private static string latestVersion = "1.7b";
        private static string selectedDZVersion = "";

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            // for reading the file
            using (StreamReader sr = new StreamReader(dzPath + "dangerzone.properties"))
            {
                
            }
            // for writing the file
            using (StreamWriter sw = new StreamWriter(dzPath + "dangerzone.properties"))
            {
                //...
            }
        }

        private void button_LaunchDZ_Click(object sender, EventArgs e)
        {
            if (comboBox_DZVersion.SelectedIndex.Equals(0))
            {
                selectedDZVersion = latestVersion;
            }
            if (selectedDZVersion == "1.7b")
            {
                string DangerZone_Zip = @"DangerZone_1.7b.zip";
                Console.WriteLine(File.Exists(DangerZone_Zip) ? "File exists." : "File does not exist.");
                if (File.Exists(DangerZone_Zip))
                {
                    Console.WriteLine("File exists.");
                }
                else
                {
                    WebClient webClient = new WebClient();
                    webClient.DownloadFile("http://server.jtrent238.tk:81/~jtrent238/DangerZoneFiles/DangerZone_1.7b.zip", dzPath + "DangerZone_1.7b.zip");
                    //Extract the files
                    System.IO.Compression.ZipFile.ExtractToDirectory("DangerZone_1.7b.zip", dzPath);
                    string zPath = "7za.exe"; //add to proj and set CopyToOuputDir
                    try
                    {
                        ProcessStartInfo pro = new ProcessStartInfo();
                        pro.WindowStyle = ProcessWindowStyle.Hidden;
                        pro.FileName = zPath;
                        pro.Arguments = string.Format("x \"{0}\" -y -o\"{1}\"", "DangerZone_1.7b.zip", dzPath);
                        Process x = Process.Start(pro);
                        x.WaitForExit();
                    }
                    catch (System.Exception Ex)
                    {
                        //handle error
                    }
                }
            }
            if (Directory.Exists("mods")) {
                Console.WriteLine("mods folder exists!");
            } else {
                
            }
        

            string Orespawn_File = "../mods/OreSpawn_2.0c_for_dz1.7.zip";
            if (checkBox_ModOrespawn.Checked) {
                if (File.Exists(Orespawn_File))
                {
                    Console.WriteLine("Orespawn Already Exists!");
                } else {
                    WebClient webclient = new WebClient();
                    webclient.DownloadFile("http://server.jtrent238.tk:81/~jtrent238/DangerZoneFiles/OreSpawn_2.0c_for_dz1.7.jar", dzPath + "/mods/OreSpawn_2.0c_for_dz1.7.jar");
                }
            }

            string MassiveExplosives_File = "../mods/MassiveExplosives_2.0_for_dz1.7.zip";
            if (checkBox_ModMassiveExplosives.Checked)
            {
                if (File.Exists(MassiveExplosives_File))
                {
                    Console.WriteLine("Orespawn Already Exists!");
                }
                else
                {
                    WebClient webclient = new WebClient();
                    webclient.DownloadFile("http://server.jtrent238.tk:81/~jtrent238/DangerZoneFiles/MassiveExplosives_2.0_for_dz1.7.jar", dzPath + "/mods/MassiveExplosives_2.0_for_dz1.7.jar");
                }
            }

            string CustomTextures_File = "../mods/CustomTextures_1.1_for_dz1.7.zip";
            if (checkBox_ModCustomTextures.Checked)
            {
                if (File.Exists(CustomTextures_File))
                {
                    Console.WriteLine("CustomTextures Already Exists!");
                }
                else
                {
                    WebClient webclient = new WebClient();
                    webclient.DownloadFile("http://server.jtrent238.tk:81/~jtrent238/DangerZoneFiles/CustomTextures_1.1_for_dz1.7.jar", dzPath + "/mods/CustomTextures_1.1_for_dz1.7.jar");
                }
            }

            string MutatedMonsters_File = "../mods/MutatedMonsters-1.0.1.jar";
            if (checkBox_ModMutatedMonster.Checked)
            {
                if (File.Exists(MutatedMonsters_File))
                {
                    Console.WriteLine("MutatedMonsters Already Exists!");
                }
                else
                {
                    WebClient webclient = new WebClient();
                    webclient.DownloadFile("http://server.jtrent238.tk:81/~jtrent238/DangerZoneFiles/CustomTextures_1.1_for_dz1.7.jar", dzPath + "/mods/MutatedMonsters-1.0.1.jar");
                }
            }

            string UtilityGolems_File = "../mods/utility_golemsV1.0.2.jar";
            if (checkBox_ModUtilityGolems.Checked)
            {
                if (File.Exists(UtilityGolems_File))
                {
                    Console.WriteLine("Utility Golems Already Exists!");
                }
                else
                {
                    WebClient webclient = new WebClient();
                    webclient.DownloadFile("http://server.jtrent238.tk:81/~jtrent238/DangerZoneFiles/CustomTextures_1.1_for_dz1.7.jar", dzPath + "/mods/utility_golemsV1.0.2.jar");
                }
            }

            string ChaosAwakens_File1 = "../mods/ChaosBlocks.jar";
            string ChaosAwakens_File2 = "../mods/DZ+.jar";
            string ChaosAwakens_File3 = "../mods/GodSpawn.jar";
            string ChaosAwakens_File4 = "../mods/MoApplesMod.jar";
            string ChaosAwakens_File5 = "../mods/NinjaMod.jar";
            string ChaosAwakens_File6 = "../mods/SoulBound.jar";
            string ChaosAwakens_File7 = "../mods/TechArmorMod.jar";
            string ChaosAwakens_File8 = "../mods/YouTuberMod.jar";
            string ChaosAwakens_File9 = "../ChaosAwakens.properties";
            if (checkBox_ModChaosAwakens.Checked) {
                if (File.Exists(ChaosAwakens_File1)) {
                    Console.WriteLine("ChaosAwakens ChaosBlocks.jar Already Exists!");
                } else {
                    WebClient webclient = new WebClient();
                    webclient.DownloadFile("http://server.jtrent238.tk:81/~jtrent238/DangerZoneFiles/Chaos_Awakens_0.6_for_DZ_1.6/mods/ChaosBlocks.jar", dzPath + "/mods/ChaosBlocks.jar");
                }
                if (File.Exists(ChaosAwakens_File2))
                {
                    Console.WriteLine("ChaosAwakens DZ+.jar Already Exists!");
                }
                else
                {
                    WebClient webclient = new WebClient();
                    webclient.DownloadFile("http://server.jtrent238.tk:81/~jtrent238/DangerZoneFiles/Chaos_Awakens_0.6_for_DZ_1.6/mods/DZ+.jar", dzPath + "/mods/DZ+.jar");
                }
                if (File.Exists(ChaosAwakens_File3))
                {
                    Console.WriteLine("ChaosAwakens GodSpawn.jar Already Exists!");
                }
                else
                {
                    WebClient webclient = new WebClient();
                    webclient.DownloadFile("http://server.jtrent238.tk:81/~jtrent238/DangerZoneFiles/Chaos_Awakens_0.6_for_DZ_1.6/mods/GodSpawn.jar", dzPath + "/mods/GodSpawn.jar");
                }
                if (File.Exists(ChaosAwakens_File4))
                {
                    Console.WriteLine("ChaosAwakens MoApplesMod.jar Already Exists!");
                }
                else
                {
                    WebClient webclient = new WebClient();
                    webclient.DownloadFile("http://server.jtrent238.tk:81/~jtrent238/DangerZoneFiles/Chaos_Awakens_0.6_for_DZ_1.6/mods/MoApplesMod.jar", dzPath + "/mods/MoApplesMod.jar");
                }
                if (File.Exists(ChaosAwakens_File5))
                {
                    Console.WriteLine("ChaosAwakens NinjaMod.jar Already Exists!");
                }
                else
                {
                    WebClient webclient = new WebClient();
                    webclient.DownloadFile("http://server.jtrent238.tk:81/~jtrent238/DangerZoneFiles/Chaos_Awakens_0.6_for_DZ_1.6/mods/NinjaMod.jar", dzPath + "/mods/NinjaMod.jar");
                }
                if (File.Exists(ChaosAwakens_File6))
                {
                    Console.WriteLine("ChaosAwakens SoulBound.jar Already Exists!");
                }
                else
                {
                    WebClient webclient = new WebClient();
                    webclient.DownloadFile("http://server.jtrent238.tk:81/~jtrent238/DangerZoneFiles/Chaos_Awakens_0.6_for_DZ_1.6/mods/SoulBound.jar", dzPath + "/mods/SoulBound.jar");
                }
                if (File.Exists(ChaosAwakens_File7))
                {
                    Console.WriteLine("ChaosAwakens TechArmorMod.jar Already Exists!");
                }
                else
                {
                    WebClient webclient = new WebClient();
                    webclient.DownloadFile("http://server.jtrent238.tk:81/~jtrent238/DangerZoneFiles/Chaos_Awakens_0.6_for_DZ_1.6/mods/TechArmorMod.jar", dzPath + "/mods/TechArmorMod.jar");
                }
                if (File.Exists(ChaosAwakens_File8))
                {
                    Console.WriteLine("ChaosAwakens YouTuberMod.jar Already Exists!");
                }
                else
                {
                    WebClient webclient = new WebClient();
                    webclient.DownloadFile("http://server.jtrent238.tk:81/~jtrent238/DangerZoneFiles/Chaos_Awakens_0.6_for_DZ_1.6/mods/ChaosBlocks.jar", dzPath + "/mods/YouTuberMod.jar");
                }
                if (File.Exists(ChaosAwakens_File9))
                {
                    Console.WriteLine("ChaosAwakens ChaosAwakens.properties Already Exists!");
                }
                else
                {
                    WebClient webclient = new WebClient();
                    webclient.DownloadFile("http://server.jtrent238.tk:81/~jtrent238/DangerZoneFiles/Chaos_Awakens_0.6_for_DZ_1.6/ChaosAwakens.properties", dzPath + "/ChaosAwakens.properties");
                }
            }
            //System.Diagnostics.Process.Start(dzPath + "java -jar GameRunner.jar singleplayer -singleplayer --singleplayer");
            System.Diagnostics.Process.Start(dzPath + "./DangerZone.jar");

            File.Delete(dzPath + "StartDangerZone.bat");
            File.Delete(dzPath + "DangerZone_1.7b.zip");
            

            string[] lines = { "@echo off", "cls", "java -jar %appdata%/DangerZone/DangerZone.jar", "pause"};
            System.IO.File.WriteAllLines(dzPath + "StartDangerZone.bat", lines);
            System.Diagnostics.Process.Start(dzPath + "StartDangerZone.bat");
        }
    }
}
