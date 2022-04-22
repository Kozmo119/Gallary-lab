import java.util.ArrayList;
import java.util.List;

public class Artist {
    private String name;
    private ArrayList<Artwork> artworks;

    // Constructor
    public Artist(String name) {
        this.name = name;
        this.artworks = new ArrayList<Artwork>();

    }

    public void addArtworks(Artwork artwork1){
        this.artworks.add(artwork1);

    }

    public String getName(){
        return name;
    }


}
