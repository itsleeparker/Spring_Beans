package beans;

public class Musician implements performer{

    //The Musician plays instrument while singing song

    private Instrument instrument;
    public void setInstrument(Instrument i){
            this.instrument = i;
    }

    private String song;
    public void setSong(String name){
        this.song = name;
    }

    @Override
    public void perform(){
        System.out.println("Musician is performing ");
        this.instrument.Play();
        System.out.println("Song Playing  : " + this.song);
    }
}
