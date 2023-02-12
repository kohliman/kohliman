/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printcard;

/** raw data  for the card suit,values
 * model the card - model class
 * @author manmeet
 */
// according to me the oo principle used here is delegation or in other words encapsulation and abstraction that allowed to xtend the code or to reuse the code.. .
public class UnoCard {
    /*enum - special class, user defined datatype - constants
    avengers - card game - 4 enum value safety and type safety , loose coupling */
    public enum Suit {RED,BLUE,YELLOW,GREEN};
    public enum Value {DRAWTWO ,DRAWFOUR,ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,SKIP,REVERSECARD};    
    private Suit s;
    private Value v;
    public UnoCard(Suit s,Value v)
    {
        this.s=s;
        this.v=v;
    }

    /**
     * @return the s
     */
    public Suit getS() {
        return s;
    }

// the user data (enum) is the feature that will allow card class   to be reused or extended
    /**
     * @param s the s to set
     */
    public void setS(Suit s) {
        this.s = s;
    }

    /**
     * @return the v
     */
    public Value getV() {
        return v;
    }

    /**
     * @param v the v to set
     */
    public void setV(Value v) {
        this.v = v;
    }
            
}
