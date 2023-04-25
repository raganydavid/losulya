
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controllers.MainController;

public class TestWeight {
    MainController mc;

    @BeforeEach
    public void initEach() {
        mc = new  MainController();
    }

    @Test
    public void testValami() {
        //MainController mc = new MainController();       //Ctrl + Space importalja a  MainController-t   először pédányosítottuk az mc-t tehát ide nem kell
        double actual =  mc.calcWeight(30, 35);         // publicra kell tenni a calcWeight metódust
        double expected = 2.6521848951755493;                       
        assertEquals(expected, actual, 0.01);           // delta érték arra kell az utolsó paraméter, hogyha eltér egy picit az érték mert pl számológéppel számoltuk, ezért századokkal számolunl és nem egész számmal
    }                                                   // másnéven megengedett eltérés

    @Test 
    public void testCalcWeight02() {
          
        double actual =  mc.calcWeight(130, 135);         
        double expected = 192.0939631220005;                       
        assertEquals(expected, actual);
    } 

    @Test
    public void testCalcWeight03() {    
        double actual =  mc.calcWeight(150, 160);         
        double expected = 303.1068451629199;                       
        assertEquals(expected, actual);
    }

}
