namespace DangerZoneLauncher
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.button_LaunchDZ = new System.Windows.Forms.Button();
            this.comboBox_DZVersion = new System.Windows.Forms.ComboBox();
            this.maskedTextBox_DZPassword = new System.Windows.Forms.MaskedTextBox();
            this.textBox_DZUsername = new System.Windows.Forms.TextBox();
            this.label_DZUsername = new System.Windows.Forms.Label();
            this.label_DZPassword = new System.Windows.Forms.Label();
            this.label_DZVersion = new System.Windows.Forms.Label();
            this.progressBar1 = new System.Windows.Forms.ProgressBar();
            this.label_ProgressBar = new System.Windows.Forms.Label();
            this.groupBox_ModSelection = new System.Windows.Forms.GroupBox();
            this.checkBox_ModMassiveExplosives = new System.Windows.Forms.CheckBox();
            this.label_ModsInstalled = new System.Windows.Forms.Label();
            this.checkBox_Modjtrent238HammerMod = new System.Windows.Forms.CheckBox();
            this.checkBox_ModCustomTextures = new System.Windows.Forms.CheckBox();
            this.checkBox_ModChaosAwakens = new System.Windows.Forms.CheckBox();
            this.checkBox_ModUtilityGolems = new System.Windows.Forms.CheckBox();
            this.checkBox_ModYouTubers = new System.Windows.Forms.CheckBox();
            this.checkBox_ModMutatedMonster = new System.Windows.Forms.CheckBox();
            this.checkBox_ModOrespawn = new System.Windows.Forms.CheckBox();
            this.label_LoggedInAs = new System.Windows.Forms.Label();
            this.label_CurrentLoggedIn = new System.Windows.Forms.Label();
            this.groupBox_Login = new System.Windows.Forms.GroupBox();
            this.groupBox_ModSelection.SuspendLayout();
            this.groupBox_Login.SuspendLayout();
            this.SuspendLayout();
            // 
            // button_LaunchDZ
            // 
            this.button_LaunchDZ.Location = new System.Drawing.Point(448, 171);
            this.button_LaunchDZ.Name = "button_LaunchDZ";
            this.button_LaunchDZ.Size = new System.Drawing.Size(75, 23);
            this.button_LaunchDZ.TabIndex = 0;
            this.button_LaunchDZ.Text = "Launch";
            this.button_LaunchDZ.UseVisualStyleBackColor = true;
            this.button_LaunchDZ.Click += new System.EventHandler(this.button_LaunchDZ_Click);
            // 
            // comboBox_DZVersion
            // 
            this.comboBox_DZVersion.FormattingEnabled = true;
            this.comboBox_DZVersion.Items.AddRange(new object[] {
            "Latest",
            "1.7b"});
            this.comboBox_DZVersion.Location = new System.Drawing.Point(321, 173);
            this.comboBox_DZVersion.Name = "comboBox_DZVersion";
            this.comboBox_DZVersion.Size = new System.Drawing.Size(121, 21);
            this.comboBox_DZVersion.TabIndex = 1;
            this.comboBox_DZVersion.Text = "Select Version";
            // 
            // maskedTextBox_DZPassword
            // 
            this.maskedTextBox_DZPassword.Location = new System.Drawing.Point(78, 68);
            this.maskedTextBox_DZPassword.Name = "maskedTextBox_DZPassword";
            this.maskedTextBox_DZPassword.Size = new System.Drawing.Size(122, 20);
            this.maskedTextBox_DZPassword.TabIndex = 2;
            // 
            // textBox_DZUsername
            // 
            this.textBox_DZUsername.Location = new System.Drawing.Point(78, 42);
            this.textBox_DZUsername.Name = "textBox_DZUsername";
            this.textBox_DZUsername.Size = new System.Drawing.Size(122, 20);
            this.textBox_DZUsername.TabIndex = 3;
            // 
            // label_DZUsername
            // 
            this.label_DZUsername.AutoSize = true;
            this.label_DZUsername.Location = new System.Drawing.Point(11, 45);
            this.label_DZUsername.Name = "label_DZUsername";
            this.label_DZUsername.Size = new System.Drawing.Size(61, 13);
            this.label_DZUsername.TabIndex = 4;
            this.label_DZUsername.Text = "Username: ";
            // 
            // label_DZPassword
            // 
            this.label_DZPassword.AutoSize = true;
            this.label_DZPassword.Location = new System.Drawing.Point(11, 71);
            this.label_DZPassword.Name = "label_DZPassword";
            this.label_DZPassword.Size = new System.Drawing.Size(59, 13);
            this.label_DZPassword.TabIndex = 4;
            this.label_DZPassword.Text = "Password: ";
            // 
            // label_DZVersion
            // 
            this.label_DZVersion.AutoSize = true;
            this.label_DZVersion.Location = new System.Drawing.Point(267, 178);
            this.label_DZVersion.Name = "label_DZVersion";
            this.label_DZVersion.Size = new System.Drawing.Size(48, 13);
            this.label_DZVersion.TabIndex = 5;
            this.label_DZVersion.Text = "Version: ";
            // 
            // progressBar1
            // 
            this.progressBar1.Location = new System.Drawing.Point(12, 218);
            this.progressBar1.Name = "progressBar1";
            this.progressBar1.Size = new System.Drawing.Size(505, 23);
            this.progressBar1.TabIndex = 6;
            // 
            // label_ProgressBar
            // 
            this.label_ProgressBar.AutoSize = true;
            this.label_ProgressBar.Location = new System.Drawing.Point(12, 202);
            this.label_ProgressBar.Name = "label_ProgressBar";
            this.label_ProgressBar.Size = new System.Drawing.Size(97, 13);
            this.label_ProgressBar.TabIndex = 7;
            this.label_ProgressBar.Text = "(ProgressBarLabel}";
            // 
            // groupBox_ModSelection
            // 
            this.groupBox_ModSelection.Controls.Add(this.checkBox_ModMassiveExplosives);
            this.groupBox_ModSelection.Controls.Add(this.label_ModsInstalled);
            this.groupBox_ModSelection.Controls.Add(this.checkBox_Modjtrent238HammerMod);
            this.groupBox_ModSelection.Controls.Add(this.checkBox_ModCustomTextures);
            this.groupBox_ModSelection.Controls.Add(this.checkBox_ModChaosAwakens);
            this.groupBox_ModSelection.Controls.Add(this.checkBox_ModUtilityGolems);
            this.groupBox_ModSelection.Controls.Add(this.checkBox_ModYouTubers);
            this.groupBox_ModSelection.Controls.Add(this.checkBox_ModMutatedMonster);
            this.groupBox_ModSelection.Controls.Add(this.checkBox_ModOrespawn);
            this.groupBox_ModSelection.Location = new System.Drawing.Point(12, 12);
            this.groupBox_ModSelection.Name = "groupBox_ModSelection";
            this.groupBox_ModSelection.Size = new System.Drawing.Size(232, 177);
            this.groupBox_ModSelection.TabIndex = 8;
            this.groupBox_ModSelection.TabStop = false;
            this.groupBox_ModSelection.Text = "Mod Selection";
            // 
            // checkBox_ModMassiveExplosives
            // 
            this.checkBox_ModMassiveExplosives.AutoSize = true;
            this.checkBox_ModMassiveExplosives.Location = new System.Drawing.Point(86, 19);
            this.checkBox_ModMassiveExplosives.Name = "checkBox_ModMassiveExplosives";
            this.checkBox_ModMassiveExplosives.Size = new System.Drawing.Size(118, 17);
            this.checkBox_ModMassiveExplosives.TabIndex = 0;
            this.checkBox_ModMassiveExplosives.Text = "Massive Explosives";
            this.checkBox_ModMassiveExplosives.UseVisualStyleBackColor = true;
            // 
            // label_ModsInstalled
            // 
            this.label_ModsInstalled.AutoSize = true;
            this.label_ModsInstalled.Location = new System.Drawing.Point(147, 161);
            this.label_ModsInstalled.Name = "label_ModsInstalled";
            this.label_ModsInstalled.Size = new System.Drawing.Size(80, 13);
            this.label_ModsInstalled.TabIndex = 7;
            this.label_ModsInstalled.Text = "{ModsInstalled}";
            // 
            // checkBox_Modjtrent238HammerMod
            // 
            this.checkBox_Modjtrent238HammerMod.AutoSize = true;
            this.checkBox_Modjtrent238HammerMod.Location = new System.Drawing.Point(6, 111);
            this.checkBox_Modjtrent238HammerMod.Name = "checkBox_Modjtrent238HammerMod";
            this.checkBox_Modjtrent238HammerMod.Size = new System.Drawing.Size(140, 17);
            this.checkBox_Modjtrent238HammerMod.TabIndex = 0;
            this.checkBox_Modjtrent238HammerMod.Text = "jtrent238\'s Hammer Mod";
            this.checkBox_Modjtrent238HammerMod.UseVisualStyleBackColor = true;
            // 
            // checkBox_ModCustomTextures
            // 
            this.checkBox_ModCustomTextures.AutoSize = true;
            this.checkBox_ModCustomTextures.Location = new System.Drawing.Point(114, 88);
            this.checkBox_ModCustomTextures.Name = "checkBox_ModCustomTextures";
            this.checkBox_ModCustomTextures.Size = new System.Drawing.Size(105, 17);
            this.checkBox_ModCustomTextures.TabIndex = 0;
            this.checkBox_ModCustomTextures.Text = "Custom Textures";
            this.checkBox_ModCustomTextures.UseVisualStyleBackColor = true;
            // 
            // checkBox_ModChaosAwakens
            // 
            this.checkBox_ModChaosAwakens.AutoSize = true;
            this.checkBox_ModChaosAwakens.Location = new System.Drawing.Point(6, 88);
            this.checkBox_ModChaosAwakens.Name = "checkBox_ModChaosAwakens";
            this.checkBox_ModChaosAwakens.Size = new System.Drawing.Size(103, 17);
            this.checkBox_ModChaosAwakens.TabIndex = 0;
            this.checkBox_ModChaosAwakens.Text = "Chaos Awakens";
            this.checkBox_ModChaosAwakens.UseVisualStyleBackColor = true;
            // 
            // checkBox_ModUtilityGolems
            // 
            this.checkBox_ModUtilityGolems.AutoSize = true;
            this.checkBox_ModUtilityGolems.Location = new System.Drawing.Point(114, 65);
            this.checkBox_ModUtilityGolems.Name = "checkBox_ModUtilityGolems";
            this.checkBox_ModUtilityGolems.Size = new System.Drawing.Size(113, 17);
            this.checkBox_ModUtilityGolems.TabIndex = 0;
            this.checkBox_ModUtilityGolems.Text = "Utility Golems Mod";
            this.checkBox_ModUtilityGolems.UseVisualStyleBackColor = true;
            // 
            // checkBox_ModYouTubers
            // 
            this.checkBox_ModYouTubers.AutoSize = true;
            this.checkBox_ModYouTubers.Location = new System.Drawing.Point(6, 65);
            this.checkBox_ModYouTubers.Name = "checkBox_ModYouTubers";
            this.checkBox_ModYouTubers.Size = new System.Drawing.Size(102, 17);
            this.checkBox_ModYouTubers.TabIndex = 0;
            this.checkBox_ModYouTubers.Text = "YouTubers Mod";
            this.checkBox_ModYouTubers.UseVisualStyleBackColor = true;
            // 
            // checkBox_ModMutatedMonster
            // 
            this.checkBox_ModMutatedMonster.AutoSize = true;
            this.checkBox_ModMutatedMonster.Location = new System.Drawing.Point(6, 42);
            this.checkBox_ModMutatedMonster.Name = "checkBox_ModMutatedMonster";
            this.checkBox_ModMutatedMonster.Size = new System.Drawing.Size(135, 17);
            this.checkBox_ModMutatedMonster.TabIndex = 0;
            this.checkBox_ModMutatedMonster.Text = "Mutated Monsters Mod";
            this.checkBox_ModMutatedMonster.UseVisualStyleBackColor = true;
            // 
            // checkBox_ModOrespawn
            // 
            this.checkBox_ModOrespawn.AutoSize = true;
            this.checkBox_ModOrespawn.Location = new System.Drawing.Point(6, 19);
            this.checkBox_ModOrespawn.Name = "checkBox_ModOrespawn";
            this.checkBox_ModOrespawn.Size = new System.Drawing.Size(74, 17);
            this.checkBox_ModOrespawn.TabIndex = 0;
            this.checkBox_ModOrespawn.Text = "Orespawn";
            this.checkBox_ModOrespawn.UseVisualStyleBackColor = true;
            // 
            // label_LoggedInAs
            // 
            this.label_LoggedInAs.AutoSize = true;
            this.label_LoggedInAs.Location = new System.Drawing.Point(11, 20);
            this.label_LoggedInAs.Name = "label_LoggedInAs";
            this.label_LoggedInAs.Size = new System.Drawing.Size(114, 13);
            this.label_LoggedInAs.TabIndex = 5;
            this.label_LoggedInAs.Text = "Currently loggen in as: ";
            // 
            // label_CurrentLoggedIn
            // 
            this.label_CurrentLoggedIn.AutoSize = true;
            this.label_CurrentLoggedIn.Location = new System.Drawing.Point(122, 20);
            this.label_CurrentLoggedIn.Name = "label_CurrentLoggedIn";
            this.label_CurrentLoggedIn.Size = new System.Drawing.Size(35, 13);
            this.label_CurrentLoggedIn.TabIndex = 5;
            this.label_CurrentLoggedIn.Text = "{user}";
            // 
            // groupBox_Login
            // 
            this.groupBox_Login.Controls.Add(this.textBox_DZUsername);
            this.groupBox_Login.Controls.Add(this.maskedTextBox_DZPassword);
            this.groupBox_Login.Controls.Add(this.label_DZUsername);
            this.groupBox_Login.Controls.Add(this.label_DZPassword);
            this.groupBox_Login.Controls.Add(this.label_CurrentLoggedIn);
            this.groupBox_Login.Controls.Add(this.label_LoggedInAs);
            this.groupBox_Login.Location = new System.Drawing.Point(317, 65);
            this.groupBox_Login.Name = "groupBox_Login";
            this.groupBox_Login.Size = new System.Drawing.Size(206, 100);
            this.groupBox_Login.TabIndex = 9;
            this.groupBox_Login.TabStop = false;
            this.groupBox_Login.Text = "Login";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(529, 253);
            this.Controls.Add(this.groupBox_Login);
            this.Controls.Add(this.groupBox_ModSelection);
            this.Controls.Add(this.label_ProgressBar);
            this.Controls.Add(this.progressBar1);
            this.Controls.Add(this.label_DZVersion);
            this.Controls.Add(this.comboBox_DZVersion);
            this.Controls.Add(this.button_LaunchDZ);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.groupBox_ModSelection.ResumeLayout(false);
            this.groupBox_ModSelection.PerformLayout();
            this.groupBox_Login.ResumeLayout(false);
            this.groupBox_Login.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button button_LaunchDZ;
        private System.Windows.Forms.ComboBox comboBox_DZVersion;
        private System.Windows.Forms.MaskedTextBox maskedTextBox_DZPassword;
        private System.Windows.Forms.TextBox textBox_DZUsername;
        private System.Windows.Forms.Label label_DZUsername;
        private System.Windows.Forms.Label label_DZPassword;
        private System.Windows.Forms.Label label_DZVersion;
        private System.Windows.Forms.ProgressBar progressBar1;
        private System.Windows.Forms.Label label_ProgressBar;
        private System.Windows.Forms.GroupBox groupBox_ModSelection;
        private System.Windows.Forms.CheckBox checkBox_ModMassiveExplosives;
        private System.Windows.Forms.CheckBox checkBox_ModUtilityGolems;
        private System.Windows.Forms.CheckBox checkBox_ModYouTubers;
        private System.Windows.Forms.CheckBox checkBox_ModMutatedMonster;
        private System.Windows.Forms.CheckBox checkBox_ModOrespawn;
        private System.Windows.Forms.CheckBox checkBox_Modjtrent238HammerMod;
        private System.Windows.Forms.CheckBox checkBox_ModCustomTextures;
        private System.Windows.Forms.CheckBox checkBox_ModChaosAwakens;
        private System.Windows.Forms.Label label_ModsInstalled;
        private System.Windows.Forms.Label label_LoggedInAs;
        private System.Windows.Forms.Label label_CurrentLoggedIn;
        private System.Windows.Forms.GroupBox groupBox_Login;
    }
}

