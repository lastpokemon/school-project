
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nash
 */
public class Game {
    String yesNo;
    int Lives = 3;
    
    Player input = new Player();
    Robot computer = new Robot();
    Processing checker = new Processing();
    Score score = new Score();
    Scanner sc = new Scanner(System.in);

    private static class Player {
        pHand
       
    }

    private static class Robot {

        public Robot() {
        }
    }
// Processing time 
    private class Processing {

    private final int TIE = 0;
    private final int WIN = 1;
    private final int LOSE = 2;
    private final int INVALID = -1;

    public int check(int pHand, int cHand) {

        if (pHand == cHand) {
            return TIE;
        } else if (pHand == 1 && cHand == 2) {
            return LOSE;
        } else if (pHand == 2 && cHand == 1) {
            return WIN;
        } else if (pHand == 1 && cHand == 3) {
            return WIN;
        } else if (pHand == 3 && cHand == 1) {
            return LOSE;
        } else if (pHand == 2 && cHand == 3) {
            return LOSE;
        } else if (pHand == 3 && cHand == 2) {
            return WIN;
        } else {
            return INVALID;
        }
    }
    }

    private static class Score {

        public Score() {
        }
    }
    
    
    
}
