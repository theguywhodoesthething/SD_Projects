package examples;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Notepad8 extends JFrame {
    private JButton closeButton;
    private JMenuItem openMenuItem;
    private JMenuItem saveMenuItem;
    private JMenuItem exitMenuItem;
    private JTextArea notesTextArea;

    public Notepad8() {
        super("Notepad");
        addComponents();
        addMenu();
        addEventHandlers();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void addComponents() {
        notesTextArea = new JTextArea(24, 60);
        notesTextArea.setLineWrap(true);
        notesTextArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(notesTextArea);
        closeButton = new JButton("Close");

        this.add(scrollPane, BorderLayout.CENTER);
        this.add(closeButton, BorderLayout.SOUTH);
    }

    private void addMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        openMenuItem = new JMenuItem("Open");
        saveMenuItem = new JMenuItem("Save");
        exitMenuItem = new JMenuItem("Exit");

        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);
        fileMenu.insertSeparator(2); // put a line between save and exit
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
    }

    private void addEventHandlers() {
        class CloseListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        }
        ActionListener closeListener = new CloseListener();
        closeButton.addActionListener(closeListener);
        exitMenuItem.addActionListener(closeListener);

        openMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("ToDo: Add open code");
            }
        });

        saveMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser(".");
                int result = fc.showSaveDialog(Notepad8.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File saveFile = fc.getSelectedFile();
                    try {
                        FileWriter fileOut = new FileWriter(saveFile);
                        fileOut.write(notesTextArea.getText());
                        fileOut.close();
                    }
                    catch (IOException ioe) {
                        System.err.println("I/O Error on Save.");
                    }
                }
            }
        });
    }

    public static void main(String[] arg) {
        new Notepad8();
    }
}
