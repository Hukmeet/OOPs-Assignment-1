interface Sports {
    void setHomeTeam();
    void setVisitingTeam();
}
interface Hockey extends Sports{  
    void homeGoalScore();
    void visitingGoalScore();
    void endOfPeriod(int time);
    void overtimePeriod(int time);
}
public class R47_Hockey_And_Sports implements Hockey{
    public void setHomeTeam() {
        System.out.println("Home Team: CangQiongStars");
    }
    public void setVisitingTeam() {
        System.out.println("Visiting Team: NothernKings");
    }
    public void homeGoalScore() {
        System.out.println("Home Goal Score: 45");
    }
    public void visitingGoalScore() {
        System.out.println("Visiting Goal Score: 47");
    }
    public void endOfPeriod(int time) {
        System.out.println("End-Of period: "+time);
    }
    public void overtimePeriod(int time) {
        System.out.println("Overtime period: "+time);
    }
    public static void main(String[] args) {
        R47_Hockey_And_Sports play=new R47_Hockey_And_Sports();
        play.setHomeTeam();
        play.setVisitingTeam();
        play.homeGoalScore();
        play.visitingGoalScore();
        play.endOfPeriod(7);
        play.overtimePeriod(10);
    }
}