package rules;

import models.Cup;
import models.MancalaModel;

/**
 * Created by Paul on 12/9/2016.
 * to represent a mancala rule
 * TODO: What even is a mancala rule?
 * Hand: pieces in the players hand
 * Rules are a set of cup and hand interactions
 *  ex: hand is not empty, drop one stone in cup
 *      cup is empty, hand has one stone, move ends
 */
public interface MancalaRule {

  /**
   * Applies this rule to a cup in a move and the current hand. By convention, rules should be
   * applied after the hand has dealt a stone into the given cup.
   * @param model the model in which the move is made
   * @param cup   the cup having the rule applied
   * @param hand  the current hand after placing a stone into the cup
   */
  void apply(MancalaModel model, Cup cup, int hand);

}