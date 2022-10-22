/* BattleshipApplication contains the main() to start the Battleship game.
 * Author: Ryan Collins, John Schmidt
 * Last Update: 10/18/2022
 */

public class BattleshipApplication {
    public static void main(String[] args) {
        Controller mainController = new Controller();
        Viewer mainView = new Viewer(mainController);
        Model mainModel = new Model(mainController);

    }

}
