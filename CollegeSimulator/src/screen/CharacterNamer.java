package screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.GCanvas;
import acm.graphics.GLabel;

public class CharacterNamer extends GCanvas {

    private Character avatar;
    private GLabel glabel;
    private JTextField textField;
    private JButton done;
    
    public CharacterNamer(Character avatar) {
        this.avatar = avatar;
        
        this.glabel = new GLabel("Name your character:");
        glabel.setFont("Times-PLAIN-12");
        this.add(glabel, 300, 100);
        
        this.textField = new JTextField("");
        this.add(textField);
        
        done = new JButton("Done!");
        this.done.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        this.add(done);
        
    }
    
}