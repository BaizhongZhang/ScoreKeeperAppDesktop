package Model;

/**
 * Created by HenryChiang on 15-11-03.
 */
public interface ShotManager {

    void setNumOfPenalties(int numOfPenalties);
    void setNumOfYellowCards(int numOfYellowCards);
    void setNumOfRedCards(int numOfRedCards);

    int getNumOfPenalties();
    int getNumOfYellowCards();
    int getNumOfRedCards();

}
