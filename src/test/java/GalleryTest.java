import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GalleryTest {

    Gallery gallery;
    Artwork Mona_Lisa;
    Artwork The_Scream;

    @BeforeEach
    public void setUp(){
        gallery = new Gallery("BNTA");
        Mona_Lisa = new Artwork("Mona_Lisa","Leonardo",20_000,"nft1");
        The_Scream = new Artwork("The_Scream","Edvard",15_000,"nft2");
        gallery.addArtwork(Mona_Lisa);
        gallery.addArtwork(The_Scream);

    }

    @Test
    public void galleryHasName(){
        assertThat(gallery.getGalleryName()).isEqualTo("BNTA");

    }


    @Test
    public void galleryHasTill(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }



    @Test
    public void canGetGalleryBalance(){
        gallery.galleryTillBalance(gallery);
        assertThat(gallery.getTill()).isEqualTo(35_000);
    }


}
