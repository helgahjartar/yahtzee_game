/*
Helga Hjartardóttir 
helgahja@gmail.com 
8. febrúar 2015
Yahtzee15 er einfaldur yahtzee leikur með þremur teningum. 
Maður kastar einu sinni, skráir stig og heldur þannig áfram þar til leikurinn 
klárast og þá safnar maður saman lokastigum. 
Notast var við NetBeans til að þýða og þjappa forritið. 
*/
package yahtzee15;

/**
 *
 * @author helgah
 */
//YahtzeeLeikur geymir YahtzeeBlad og nidurstodur úr teningakasti
public class YahtzeeLeikur {
    public Teningur[] teningar = new Teningur[3]; //býr til fylki fyrir 3 teninga
    public YahtzeeBlad yahtzeeBlad = new YahtzeeBlad(); //býr til nýtt Yahtzeeblad
    
    //YahtzeeLeikur býr til nýja teninga.
    public YahtzeeLeikur() {
        for (int i = 0; i<teningar.length; i++)
        {
            teningar[i] = new Teningur();
        }
    }
    //kastaTeningum kastar teningunum í leiknum.
    public void kastaTeningum(){
        for (int i = 0; i<teningar.length;i++){
            teningar[i].kastaTening();
        }
    }
    //nyrLeikur býr til nýtt YahtzeeBlad og nýtt teningakast.         
    public void nyrLeikur() {
        for (int i = 0; i<teningar.length;i++){
            teningar[i].kastaTening();
        }
        yahtzeeBlad = new YahtzeeBlad();
    }
    //nidurstada inniheldur nidurstödu leiksins.     
    public int nidurstada() {
        return yahtzeeBlad.nidurstada();
    } 
}
