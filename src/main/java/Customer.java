public class Customer {
    private String name;
    private double wallet;


    // Constructor
    public Customer(String name,double wallet){
        this.name = name;
        this.wallet = wallet;
    }



    public String getName(){

        return name;
    }

    public double getWallet(){
        return wallet;
    }


    

    public void customerWalletBalance(Gallery gallery) {
        double walletBalance = 0;
        for (Artwork artwork : gallery.getArtwork()) {
            walletBalance = wallet - artwork.getPrice();
        }
        this.wallet = walletBalance;
    }

    public double getCustomerWalletBalance(){
        return this.wallet;
    }


}
