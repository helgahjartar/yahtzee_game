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
// YahtzeeBlad geymir gögnin úr yahtzee blaði.
public class YahtzeeBlad {
    
    private int[] reitir = new int[8];
    //reitir er fylki með reitum talnanna úr teningakastinu
    
    //YahtzeeBlad byrjar með reitina í núlli.
    public YahtzeeBlad() {
        for(int i = 0; i<reitir.length; i++)
        {
            reitir[i] = 0;
        }
    }
    // setjaTolureit setur tölu í reit eitt, tvö osfrv.
    public void setjaToluIReit(int reitur, int tala) {
        reitir[reitur] = tala;
    }
    //nidurstada reiknar út samtöluna á reitnum.
    public int nidurstada(){
        int summa = 0;
        for (int i = 0; i<reitir.length; i++)
        {
             summa += reitir[i];
        }
        return summa;
    }
}
