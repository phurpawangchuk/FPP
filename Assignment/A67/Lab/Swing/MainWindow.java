package A67.Lab.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-13-03
 */
public class MainWindow {
    private JFrame frame;

    MainWindow(){
        frame = new JFrame();
        frame.setTitle("New Title");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600,400);
        frame.setLayout(new GridBagLayout());
        frame.setLocationRelativeTo(null);


        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.anchor = GridBagConstraints.WEST;

        JLabel namelabel = new JLabel("Enter name:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(namelabel, gbc);

        JTextField textInput = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(textInput, gbc);

        JButton button = new JButton("Submit");
        gbc.gridx = 2;
        gbc.gridy = 0;
        frame.add(button, gbc);

//        JLabel resultLabel = new JLabel("Name  is:");
//        gbc.gridx = 1;
//        gbc.gridy = 1;
//        frame.add(resultLabel, gbc);

        JLabel namelabel1 = new JLabel("Enter name:");
        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(namelabel1, gbc);
//
//        JTextField textInput1 = new JTextField(20);
//        gbc.gridx = 2;
//        gbc.gridy = 1;
//        frame.add(textInput1, gbc);

        JTextField result = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        frame.add(result, gbc);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(textInput.getText());
                textInput.setText("");
            }
        });

        frame.setVisible(true);
//        frame.add(namelabel);
//        frame.add(textInput);
//        frame.add(button);
//
//        frame.add(resultLabel);
//        frame.add(result);

    }

    public void show(){
        frame.setVisible(true);
    }
}
