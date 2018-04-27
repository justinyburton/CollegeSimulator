package screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.GCanvas;
import acm.graphics.GLabel;
import game.Game;
import system.Avatar;

public class AvatarNamer extends Screen {

    Avatar avatar;
    private GLabel glabel;
    private JTextField textField;
    private JButton done;
    private String name;
    
    public AvatarNamer(Avatar avatar, Game game) {
    	
    	super(game);
    	
        this.avatar = avatar;
        this.add(avatar, 450, 400);
        
        glabel = new GLabel("Name your character:");
        glabel.setFont("Century Gothic-PLAIN-18");
        this.add(glabel, 250, 100);
        
        textField = new JTextField();
        textField.setColumns(25);
        textField.setHorizontalAlignment(JTextField.LEFT);
        this.add(textField, 150, 150);
        
        done = new JButton("Done!");
        this.done.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                name = textField.getText();
                System.out.println(name);
                game.changeScreen(new CollegeSelection(game));
            }
        });
        this.add(done, 475, 150);
        
    }
    
}
