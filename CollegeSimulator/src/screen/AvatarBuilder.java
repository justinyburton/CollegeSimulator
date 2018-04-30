package screen;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import game.Game;
import system.Avatar;

public class AvatarBuilder extends Screen {

    private static final long serialVersionUID = 1L;
	Avatar avatar;
    private JButton skinTone;
    private JButton hairStyle;
    private JButton hairColor;
    private JButton shirtColor;
    private JButton finalize;
    private int skinTonePosition;
    private int hairColorPosition;
    private int shirtColorPosition;
    private final Color[] SKIN_TONES = {new Color(255,220,175), new Color(235,155,95), new Color(180,90,30), new Color(125,45,10), new Color(65,15,0)};
    private final Color[] HAIR_COLORS = {new Color(0,0,0), new Color(140,70,20), new Color(255,160,0), new Color(255,255,0)};
    private final Color[] SHIRT_COLORS = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.BLACK};
    
    public AvatarBuilder(Game game) {
        
        super(game);
    	
        this.avatar = game.getPlayer().getAvatar();
        
        skinTonePosition = 0;
        skinTone = new JButton("Skin Tone");
        skinTone.addActionListener(new ActionListener( ) {
            public void actionPerformed(ActionEvent e) {
                skinTonePosition = cycleInt(skinTonePosition, SKIN_TONES.length);
                avatar.changeSkinTone(SKIN_TONES[skinTonePosition]);
            }
        });
        
        hairStyle = new JButton("Hair Style");
        hairStyle.addActionListener(new ActionListener( ) {
            public void actionPerformed(ActionEvent e) {
                avatar.changeHairStyle();
            }
        });
        
        hairColorPosition = 0;
        hairColor = new JButton("Hair Color");
        hairColor.addActionListener(new ActionListener( ) {
            public void actionPerformed(ActionEvent e) {
                hairColorPosition = cycleInt(hairColorPosition, HAIR_COLORS.length);
                avatar.changeHairColor(HAIR_COLORS[hairColorPosition]);
            }
        });
        
        shirtColorPosition = 0;
        shirtColor = new JButton("Shirt Color");
        shirtColor.addActionListener(new ActionListener( ) {
            public void actionPerformed(ActionEvent e) {
                shirtColorPosition = cycleInt(shirtColorPosition, SHIRT_COLORS.length);
                avatar.changeShirtColor(SHIRT_COLORS[shirtColorPosition]);
            }
        });
        
        finalize = new JButton("Finalize");
        finalize.addActionListener(new ActionListener( ) {
            public void actionPerformed(ActionEvent e) {
                game.changeScreen(new AvatarNamer(game));
            }
        });
        
        this.add(avatar, 5*Game.X_UNIT, 2.5*Game.Y_UNIT);
        this.add(skinTone, 6.5*Game.X_UNIT, 1.5*Game.Y_UNIT);
        this.add(hairStyle, 6.5*Game.X_UNIT, 2*Game.Y_UNIT);
        this.add(hairColor, 6.5*Game.X_UNIT, 2.5*Game.Y_UNIT);
        this.add(shirtColor, 6.5*Game.X_UNIT, 3*Game.Y_UNIT);
        this.add(finalize, 6.5*Game.X_UNIT, 3.5*Game.Y_UNIT);
        
    }
    
    private int cycleInt(int arrayPointer, int max) {
        arrayPointer++;
        if (arrayPointer >= max) {
          arrayPointer = 0;
        }
        return arrayPointer;
    }
    
}
