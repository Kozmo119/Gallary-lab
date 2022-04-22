import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.CharArrayWriter;

public class ArtworkTest {

    Artwork artwork1;
    Artwork artwork2;
    Artwork artwork3;


    @BeforeEach
    public void setUp(){
        artwork1 = new Artwork("Mona_Lisa","Leonardo",20_000,"nft1");
        artwork2= new Artwork("The_Scream","Edvard",15_000,"nft2");
        artwork3 = new Artwork("The_Starry_Night","Vincent",10_000,"nft3");
    }


    @Test
    public void artworkHasPrice(){
        assertThat(artwork1.getPrice()).isEqualTo(20_000);

    }
}
