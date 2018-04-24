package system;

import java.awt.Color;

import acm.graphics.GCompound;
import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;

public class Character extends GCompound {

    private GOval head;
    private GRect body;
    private GPolygon hair;
    private GLine leftArm;
    private GLine rightArm;
    private GLine leftLeg;
    private GLine rightLeg;
    private Color skinTone;
    private Color hairColor;
    private Color shirtColor;
    private boolean isLong;
    
    public Character(double x, double y) {
        head = new GOval(50,50);
        head.setFilled(true);
        head.setFillColor(skinTone);
        
        body = new GRect(60,80);
        body.setFilled(true);
        body.setFillColor(shirtColor);
        
        hair = newShortHair();
        isLong = false;
        hair.setFilled(true);
        hair.setFillColor(hairColor);
        
        this.add(head);
        this.add(body);
        this.add(hair);
        
        this.setLocation(x, y);
        
    }
    
    public void changeSkinTone(Color skinTone) {
        this.skinTone = skinTone;
        head.setFillColor(this.skinTone);
    }
    
    public void changeShirtColor(Color shirtColor) {
        this.shirtColor = shirtColor;
        body.setFillColor(this.shirtColor);
    }
    
    public void changeHairColor(Color hairColor) {
        this.hairColor = hairColor;
        hair.setFillColor(this.hairColor);
    }
    
    public void changeHairStyle() {
        this.isLong = !this.isLong;
        if (this.isLong) {
            hair = newLongHair();
        }
        else {
            hair = newShortHair();
        }
        hair.setFillColor(hairColor);
    }
    
    public GPolygon newShortHair() {
        GPolygon out = new GPolygon();
        return out;
    }
    
    public GPolygon newLongHair() {
        GPolygon out = new GPolygon();
        return out;
    }
  
}
