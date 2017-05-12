package solutions;

import java.awt.BorderLayout;
import java.awt.Container;
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
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Notepad15 extends JFrame {
    private Container contentPane;
    private JButton closeButton;
    private JLabel fileNameLabel;
    private JMenuBar menuBar;
    private JMenuItem openMenuItem;
    private JMenuItem saveMenuItem;
    private JMenuItem exitMenuItem;
    private JTextArea notesTextArea;
    private JTextField fileNameTextField;

    public Notepad15() {
        super("Notepad");
        addComponents();
        addMenu();
        addEventHandlers();
        addLookAndFeel();
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
        menuBar = new JMenuBar();
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
                int result = fc.showOpenDialog(Notepad15.this);
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
                int result = fc.showSaveDialog(Notepad15.this);
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

    private void addLookAndFeel() {
        JMenu lafMenu = new JMenu("Look and Feel");

        UIManager.LookAndFeelInfo[] laf = UIManager
                .getInstalledLookAndFeels();

        for (UIManager.LookAndFeelInfo info : laf) {
            String name = info.getName();
            final String className = info.getClassName();

            JMenuItem menuItem = new JMenuItem(name);

            class LookAndFeelListener implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    try {
                        UIManager.setLookAndFeel(className);
                        SwingUtilities
                                .updateComponentTreeUI(contentPane);
                        pack();
                    }
                    catch (Exception ex) {
                        System.err.println(ex);
                    }
                }
            }
            menuItem.addActionListener(new LookAndFeelListener());
            lafMenu.add(menuItem);
        }
        menuBar.add(lafMenu);
    }

    public static void main(String[] arg) {
        new Notepad15();
    }
}
