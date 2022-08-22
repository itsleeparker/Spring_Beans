package beans;

public class PoeticJuggler extends juggler{
    private Poem poem;

    public PoeticJuggler(int bags   , Poem p){
        super(bags);
        this.poem = p;
    }

    @Override
    public void perform(){
        super.perform();
        System.out.println("While Reciting");
        this.poem.Recite();
    }
}
