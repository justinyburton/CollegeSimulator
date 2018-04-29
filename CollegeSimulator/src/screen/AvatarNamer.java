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
        this.add(avatar, 4*Game.X_UNIT, 2*Game.Y_UNIT);
        
        glabel = new GLabel("Name your character:");
        glabel.setFont("Serif-PLAIN-18");
        this.add(glabel, 5.5*Game.X_UNIT, Game.Y_UNIT);
        
        textField = new JTextField();
        textField.setColumns(25);
        textField.setHorizontalAlignment(JTextField.LEFT);
        this.add(textField, 5*Game.X_UNIT, 2*Game.Y_UNIT);
        
        done = new JButton("Done!");
        done.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                name = textField.getText();
                game.changeScreen(new CollegeSelection(game));
            }
        });
        this.add(done, 7*Game.X_UNIT, 2*Game.Y_UNIT);
        
    }
    
}
