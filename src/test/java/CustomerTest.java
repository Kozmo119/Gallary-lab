import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    Customer customer;
    Artwork artwork1;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Mani",100_000);
        artwork1 = new Artwork("Mona_Lisa","Leonardo",20_000,"nft1");
    }

    @Test
    public void customerHasName(){
        assertThat(customer.getName()).isEqualTo("Mani");
    }

    @Test
    public void customerHasWallet(){
        assertThat(customer.getWallet()).isEqualTo(100_000);
    }


    @Test
    public void getCustomerHasWalletBalance(){
        assertThat(customer.getCustomerWalletBalance()).isEqualTo(80_000);
    }

}
