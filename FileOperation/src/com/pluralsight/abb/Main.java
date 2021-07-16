package com.pluralsight.abb;
import java.io.*;
import java.util.Date;
import java.awt.*;
import java.awt.Event;
import javax.swing.*;
import javax.swing.event.*;
public class Main {
    Notepad npd;
    boolean saved;
    boolean newFileFlag;
    String fileName;
    String applicationTitle = "note pad";

    File fileRef;
    JFileChooser chooser;


    void setSave(boolean saved) {
        this.saved = saved;
    }

    String getFileName() {
        return new String(fileName);
    }

    void setFileName(String fileName) {
        this.fileName = new String(fileName);
    }

    Main(Notepad npd) {
        this.npd = npd;

        saved = true;
        newFileFlag = true;
        fileName = new String("Untitled");
        fileRef = new File(fileName);
        this.npd.f.setTitle(fileName + " - " + applicationTitle);


        chooser = new JFileChooser();
        chooser.addChoosableFileFilter(new MyFileFilter(".java", "Java Source Files(*.java)"));
        chooser.addChoosableFileFilter(new MyFileFilter(".txt", "Text Files(*.txt)"));
        chooser.setCurrentDirectory(new File("."));

        boolean saveFile(File temp) {
            FileWriter fout = null;
            try {
                fout = new FileWriter(temp);
                fout.write(npd.ta.getText());
            } catch (IOException ioe) {
                updateStatus(temp, false);
                return false;
            } finally {
                try {
                    fout.close();
                } catch (IOException excp) {
                    updateStatus(temp, true);
                    return true;
                }

            }

        }


    }



    private void updateStatus(File temp, boolean b) {
    }


    public static void main(String[] args) {

    }
}
