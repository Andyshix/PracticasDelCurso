package model;

import java.awt.*;

public class Card implements UnoCard{
    private String value;
    private Color color;
    public Card(String valor, Color color){
        value = valor;
        this.color = color;
    }
    @Override
    public String getValue() {
        return value;
    }

    @Override
    public Color getColor() {
        return color;
    }
    
}
