package beans;

public class juggler implements performer {
    private int Balls_to_juggle;
    juggler(int balls){
            this.Balls_to_juggle = balls;
    }
    public void perform(){
        System.out.println("Performer is juggling " + this.Balls_to_juggle + " Balls");
    }
}
