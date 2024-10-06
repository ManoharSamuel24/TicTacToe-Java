
package tictactoe;

import java.awt.Component;

public class TicTacToe {

    public static void main(String[] args) {
        GameField game = new GameField();
        game.setVisible(true);
        game.pack();
        game.setLocationRelativeTo((Component)null);
    }
}
