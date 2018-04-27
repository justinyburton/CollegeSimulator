package screen;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import acm.graphics.GCanvas;
import game.Game;
import system.Avatar;

public class AvatarBuilder extends Screen {

    Avatar avatar;
    private JButton skinTone;
    private JButton hairStyle;
    private JButton hairColor;
    private JButton shirtColor;
    private JButton finalize;
    private final Color[] SKIN_TONES = {new Color(255,220,175), new Color(235,155,95), new Color(180,90,30), new Color(125,45,10), new Color(65,15,0)};
    private final Color[] HAIR_COLORS = {new Color(0,0,0), new Color(140,70,20), new Color(255,160,0), new Color(255,255,0)};
    private final Color[] SHIRT_COLORS = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.BLACK};
    
    public AvatarBuilder(Avatar avatar, Game game) {
        
    	super(game);
    	
        this.avatar = avatar;
        
        int skinTonePosition = 0;
        skinTone = new JButton("Skin Tone");
        this.skinTone.addActionListener(new ActionListener( ) {
            public void actionPerformed(ActionEvent e) {
                cycleInt(skinTonePosition, SKIN_TONES.length);
                avatar.changeHairColor(SKIN_TONES[skinTonePosition]);
            }
        });
        
        hairStyle = new JButton("Hair Style");
        this.hairStyle.addActionListener(new ActionListener( ) {
            public void actionPerformed(ActionEvent e) {
                avatar.changeHairStyle();
            }
        });
        
        int hairColorPosition = 0;
        hairColor = new JButton("Hair Color");
        this.hairColor.addActionListener(new ActionListener( ) {
            public void actionPerformed(ActionEvent e) {
                cycleInt(hairColorPosition, 4);
                avatar.changeHairColor(HAIR_COLORS[hairColorPosition]);
            }
        });
        
        int shirtColorPosition = 0;
        shirtColor = new JButton("Shirt Color");
        this.shirtColor.addActionListener(new ActionListener( ) {
            public void actionPerformed(ActionEvent e) {
                cycleInt(shirtColorPosition, 6);
                avatar.changeShirtColor(SHIRT_COLORS[shirtColorPosition]);
            }
        });
        
        finalize = new JButton("Finalize");
        this.finalize.addActionListener(new ActionListener( ) {
            public void actionPerformed(ActionEvent e) {
                game.changeScreen(new AvatarBuilder(avatar, game));
            }
        });
        
        this.add(skinTone);
        this.add(hairStyle);
        this.add(hairColor);
        this.add(shirtColor);
        this.add(finalize);
        
    }
    
    private void cycleInt(int arrayPointer, int max) {
        arrayPointer++;
        if (arrayPointer >= max) {
          arrayPointer = 0;
        }
    }
    
}
