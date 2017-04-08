package controllers;

import models.MancalaModel;
import views.MancalaView;

/**
 * Created by paul on 3/8/17.
 * To represent a mancala controller. Handles user input and defines game sequence
 */
public class SimpleController implements MancalaController {

  MancalaModel model;
  MancalaView view;

  public SimpleController(MancalaModel model, MancalaView view) {
    this.model = model;
    this.view = view;
  }

  /**
   * The pie rule, sometimes referred to as the swap rule, is a rule used to balance abstract
   * strategy games where a first-move advantage has been demonstrated. After the first move is made
   * in a game that uses the pie rule, the second player has one of two options:
   *
   * - Letting the move stand, in which case the second player remains the second player and moves
   *   immediately
   *
   * - Switching places, in which case the second player becomes the first-moving player, and the
   *   "new" second player then makes their "first" move. (I.e., the game proceeds from the opening
   *   move already made, but with roles reversed.)
   *
   * Source: https://en.wikipedia.org/wiki/Pie_rule, 3/29/2017
   */

  @Override
  public void go() {
    model.init();
    view.showIntro();
    while (!model.isGameOver()) {
      view.drawBoard(model.getCups());
      String in = view.getInput(model.isFirstPlayerTurn());
      model.sow(getCupNum(in));
      model.toggleTurn();
    }
  }

  /**
   * Gets the cup to move from
   * @param input user input
   * @return integer representing cup to move from
   */
  private int getCupNum(String input) {
    return Integer.getInteger(input) - 1;
  }
}