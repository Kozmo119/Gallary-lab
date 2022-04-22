import java.util.ArrayList;

public class Gallery {
    private String name;
    private double till;
    private ArrayList<Artwork> artwork;
    // Constructor
    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.artwork = new ArrayList<Artwork>();
    }

    public void addArtwork(Artwork artwork1){
        this.artwork.add(artwork1);
    }

    public String getGalleryName(){
        return name;
    }
    public ArrayList<Artwork> getArtwork(){
        return this.artwork;
    }

    public double getTill(){
        return till;
    }


    public void galleryTillBalance(Gallery gallery){
        double tillBalance = 0;
        for (Artwork artwork : gallery.getArtwork()){
            tillBalance+= artwork.getPrice();
        }
            this.till= tillBalance;
    }

    public double getGalleryTillBalance(){
        return this.till;
    }


}
