import controllers.MancalaController;
import controllers.KalahController;
import models.MancalaModel;
import views.MancalaConsoleView;
import views.MancalaView;

/**
 * Created by paul on 3/7/17.
 * To represent a mancala runner
 */
public class MancalaRunner {
  public static void main(String[] args) {
    MancalaModel model = new TwoPlayerMancalaModel();
    MancalaView view = new MancalaConsoleView();
    MancalaController controller = new KalahController(model, view);
    controller.go();
  }
}
