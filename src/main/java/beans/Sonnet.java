package beans;

public class Sonnet implements  Poem{
    private String[] Stanza = {
            "My Heart Aches for something" ,
            "Something i don't know off" ,
            "Something that feels like never did before" ,
            "Something anonymous i don't know off" ,
            "Oh I thrive thy touch ",
            "Oh I thrive thy beauty ",
            "The many moons i have spent without seeing thy beauty ",
            "When shall i be freed from this pain " ,
            "When shall i end my sorrow ",
            "I ask the almighty"
     };

    @Override
    public void Recite() {
        for(String i : this.Stanza){
            System.out.println(i);
        }
    }
}
