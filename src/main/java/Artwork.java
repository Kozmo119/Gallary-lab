import java.util.ArrayList;

public class Artwork {
        private String title;
        private String artist;
        private double price;
        private String nft;

        public Artwork(String title, String artist, double price, String nft){
            this.title = title;
            this.price = price;
            this.artist = artist;
            this.nft = nft;
        }

        public double getPrice(){
            return price;
        }

    }
