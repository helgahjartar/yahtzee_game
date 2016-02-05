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
// Teningur inniheldur hlutverk teningsins, kastaTening og lesaGildi.
public class Teningur {
    
    private int gildi = 1; //grunngildi teningsins.
    // kastTening býr til random tölugildi fyrir teninginn á bili 1-6. 
    public void kastaTening() {
        
      gildi = (1 + (int)(Math.random()*6)); 
    }
    //lesaGildi skila gildi teningsins.
    public int lesaGildi() {
        return gildi;
    }
    
}
