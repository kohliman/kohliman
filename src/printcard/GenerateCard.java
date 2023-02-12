/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printcard;

/**
 * responsible for generation of cards and stores in deck array
 * high cohesion
 * @author user
 */
public class GenerateCard
{
private int size = 56;
UnoCard[] deck = new UnoCard[size];
public void generate()
{
    int c = 0;
    for(UnoCard.Suit s :UnoCard.Suit.values()) //enum suits Hearts
    {
      
        for(  UnoCard.Value v:UnoCard.Value.values() ) //1
        {
            deck[c] = new UnoCard(s,v); //deck[0] = hearts,1,2
            c++;
        }
    }
}
}
