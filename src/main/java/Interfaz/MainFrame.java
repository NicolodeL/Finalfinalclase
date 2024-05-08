package Interfaz;

import Usuario.UserAccount;
import org.example.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private UserAccount currentUser;

    public MainFrame() {
        // Configurar el JFrame
        setTitle("Twitter App");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear la barra de menú
        JMenuBar menuBar = new JMenuBar();

        // Crear los elementos del menú
        JMenuItem loadUserItem = new JMenuItem("Load User");
        JMenuItem publishTweetItem = new JMenuItem("Publish Tweet");
        JMenuItem sortUsersItem = new JMenuItem("Sort Users");

        // Añadir los elementos al menú
        menuBar.add(loadUserItem);
        menuBar.add(publishTweetItem);
        menuBar.add(sortUsersItem);

        // Añadir la barra de menú al JFrame
        setJMenuBar(menuBar);

        // Añadir los ActionListener a los elementos del menú
        loadUserItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String alias = JOptionPane.showInputDialog("Enter user alias:");
                if (alias != null && !alias.isEmpty()) {
                    try {
                        Main.loadUser(alias);
                        currentUser = Main.getCurrentUser();
                        JOptionPane.showMessageDialog(null, "User loaded: " + currentUser);
                    } catch (IllegalArgumentException ex) {
                        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
                    }
                }
            }
        });

        publishTweetItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentUser == null) {
                    JOptionPane.showMessageDialog(null, "No user loaded");
                    return;
                }
                String message = JOptionPane.showInputDialog("Enter tweet message:");
                if (message != null && !message.isEmpty()) {
                    try {
                        Main.publishTweet(message);
                        JOptionPane.showMessageDialog(null, "Tweet published");
                    } catch (IllegalArgumentException ex) {
                        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
                    }
                }
            }
        });

        sortUsersItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.sortUsersByEmail();
                JOptionPane.showMessageDialog(null, "Users sorted by email");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}
