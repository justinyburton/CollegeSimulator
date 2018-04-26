package screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.GCanvas;
import acm.graphics.GLabel;
import system.Avatar;

public class AvatarNamer extends GCanvas {

    private Avatar avatar;
    private GLabel glabel;
    private JTextField textField;
    private JButton done;
    
    public AvatarNamer(Avatar avatar) {
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
