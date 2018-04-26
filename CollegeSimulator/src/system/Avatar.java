package system;

import java.awt.Color;

import acm.graphics.GCompound;
import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;

public class Avatar extends GCompound {

    private GOval head;
    private GRect body;
    private GPolygon hair;
    private Color skinTone;
    private Color hairColor;
    private Color shirtColor;
    private boolean isLong;
    
    public Avatar(double x, double y) {
        
        skinTone = new Color(255, 220, 175);
        shirtColor = Color.RED;
        hairColor = new Color(0, 0, 0);
        
        head = new GOval(5, -50, 50,50);
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
        out.addVertex(5, -25);
        out.addVertex(4, -40);
        out.addVertex(20, -55);
        out.addVertex(40, -55);
        out.addVertex(56, -40);
        out.addVertex(55, -25);
        out.addVertex(40, -40);
        out.addVertex(20, -40);
        return out;
    }
    
    public GPolygon newLongHair() {
        GPolygon out = new GPolygon();
        out.addVertex(5, 5);
        out.addVertex(4, -40);
        out.addVertex(20, -55);
        out.addVertex(40, -55);
        out.addVertex(56, -40);
        out.addVertex(55, 5);
        out.addVertex(42, -40);
        out.addVertex(18, -40);
        return out;
    }
  
}
