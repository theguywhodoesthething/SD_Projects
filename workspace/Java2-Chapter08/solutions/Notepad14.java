package solutions;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Notepad14 extends JFrame {
    private JButton closeButton;
    private JLabel fileNameLabel;
    private JMenuItem openMenuItem;
    private JMenuItem saveMenuItem;
    private JMenuItem exitMenuItem;
    private JTextArea notesTextArea;
    private JTextField fileNameTextField;

    public Notepad14() {
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

        // add label, textfield and button to the box
        fileNameLabel = new JLabel("Filename:");
        fileNameTextField = new JTextField("<Untitled>");
        fileNameTextField.setEditable(false); // read only
        closeButton = new JButton("Close");

        Box southBox = new Box(BoxLayout.X_AXIS);
        southBox.add(fileNameLabel);
        southBox.add(fileNameTextField);
        southBox.add(closeButton);

        this.add(southBox, BorderLayout.SOUTH);
        this.add(scrollPane, BorderLayout.CENTER);
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
                JFileChooser fc = new JFileChooser(".");
                int result = fc.showOpenDialog(Notepad14.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File openFile = fc.getSelectedFile();
                    try {
                        FileReader fileIn = new FileReader(openFile);
                        char[] readBuffer = new char[(int) openFile
                                .length()];
                        fileIn.read(readBuffer);
                        notesTextArea.setText(new String(readBuffer));
                        fileIn.close();
                        // update text field with file name
                        fileNameTextField.setText(openFile.getName());
                    }
                    catch (IOException ioe) {
                        System.err.println("I/O Error on Save.");
                    }
                }
            }
        });

        saveMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser(".");
                int result = fc.showSaveDialog(Notepad14.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File saveFile = fc.getSelectedFile();
                    try {
                        FileWriter fileOut = new FileWriter(saveFile);
                        fileOut.write(notesTextArea.getText());
                        fileOut.close();
                        // add the filename to the text field
                        fileNameTextField.setText(saveFile.getName());
                    }
                    catch (IOException ioe) {
                        System.err.println("I/O Error on Save.");
                    }
                }
            }
        });
    }

    public static void main(String[] arg) {
        new Notepad14();
    }
}
