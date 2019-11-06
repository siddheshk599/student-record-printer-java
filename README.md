Project Title: 

Student Record Printer.

Getting Started: 

Setting up and installing this software is easy by just installing Java.

Prerequisites:

Softwares needed:
1.	Java.

Installation links of the required softwares:
1.	Java (JDK): https://www.oracle.com/technetwork/java/javase/downloads/jdk13-downloads-5672538.html . 

Installing required softwares:

For Windows users:
1.	Download Java SE Development Kit (JDK) v13.0.1 from the above given link and install it like any other Windows software (note the directory of installation of JDK).
2.  After successful installation of JDK (check the installation of JDK by typing 'javac' in the Command Prompt), right click on 'This PC' or 'My Computer' icon on your desktop (make sure that the 'This PC' or 'My Computer' icon is not a shortcut of another application).
3.  Select the option 'Properties'.
4.  Then in the left side of the opened window, select 'Advanced System Settings'.
5.  Then click on the 'Environment Variables' button.
6.  Under “System variables” click the “New…” button and enter JAVA_HOME as “Variable name” and the path to your Java JDK directory under “Variable value”. Now go back to the 'Environment Variables' window.
7.  In “Environment Variables” window under “System variables” select Path and click on 'Edit'.
8.  In “Edit environment variable” window click “New” and type in  '%JAVA_HOME%\bin' (without quotes).
9.  Now download the zip of the project from GitHub and then extract it.
10. Under the extracted contents, you will see a .jar file which is the archived (packed) file of the project which is ready to run.
11. To run the .jar file, open the Command Prompt and navigate to the extracted project content's directory and run the following command: 
        java -jar Student_Record_Printer.jar
    The above command will open the software.
12. The source code of the project is in the folder labelled as 'Student_Record_Printer'.

For Ubuntu/Debian users:
1.	Install Java (JDK) by running the following command in terminal: 
        sudo apt-get install default-jdk
    To check whether Java JDK has been installed correctly or not, run the following command in the terminal: 
        java -version.
2.  Now open the terminal and run the following command: 
        sudo update-alternatives --config java 
    Copy the path of the Java installation directory.
3.  Now run the following command in the terminal: 
        sudo nano /etc/environment
4.  Now type the following line in the file: 
        JAVA_HOME="/usr/lib/jvm/java-8-openjdk-amd64" [Java path might be different, so change accordingly] and save the file.
5.  Now run the following command in the terminal: 
      export PATH=$PATH:$JAVA_HOME/bin
6.  Now run the following command in the terminal:
      source /etc/environment
    Running the above command will source the variabl es that we just set.
7.  Now check Java installation by running the command:
      java -version
8.  Now download the zip of the project from GitHub and then extract it. Under the extracted contents, you will see a .jar file which is the archived (packed) file of the project which is ready to run.
9.  To run the .jar file, open the the terminal and navigate to the extracted project content's directory and run the following command: 
        java -jar Student_Record_Printer.jar
    The above command will open the software.

Following the above installation steps for required softwares will set up an environment to run the Student Record Printer without any hassle.

Running the software:
For Windows users:
Open your command prompt and navigate to the project's directory and run the following command:
        java -jar Student_Record_Printer.jar

For Ubuntu/Debian users:
Open your terminal and navigate to the project's directory and run the following command:
        java -jar Student_Record_Printer.jar

Built with:

    Java - GUI for the software.
    Java Swing - Java GUI library.

Author:

    Siddhesh Kudtarkar
