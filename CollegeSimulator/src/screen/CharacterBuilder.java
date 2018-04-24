package screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import acm.graphics.GCanvas;

public class CharacterBuilder extends GCanvas {

    private Character avatar;
    private JButton skinTone;
    private JButton hairStyle;
    private JButton hairColor;
    private JButton shirtColor;
    private JButton finalize;
    
    public CharacterBuilder(Character avatar) {
        
        this.avatar = avatar;
        
        skinTone = new JButton("Skin Tone");
        this.skinTone.addActionListener(new ActionListener( ) {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        hairStyle = new JButton("Hair Style");
        this.hairStyle.addActionListener(new ActionListener( ) {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        hairColor = new JButton("Hair Color");
        this.hairColor.addActionListener(new ActionListener( ) {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        shirtColor = new JButton("Shirt Color");
        this.shirtColor.addActionListener(new ActionListener( ) {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        finalize = new JButton("Finalize");
        this.finalize.addActionListener(new ActionListener( ) {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        this.add(skinTone);
        this.add(hairStyle);
        this.add(hairColor);
        this.add(shirtColor);
        this.add(finalize);
        
    }
    
    
    
}
