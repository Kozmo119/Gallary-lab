import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArtistTest {
    Artist artist1;
    Artist artist2;
    Artist artist3;

    @BeforeEach
    public void setUp(){

        artist1 = new Artist("Leonardo");
        artist2 = new Artist("Edvard");
        artist3 = new Artist("Vincent");
    }

    @Test
    public void artistHasName(){
        assertThat(artist1.getName()).isEqualTo("Leonardo");
    }


}
