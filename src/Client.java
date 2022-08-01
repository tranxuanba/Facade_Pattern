public class Client {
    public static void main(String[] args) {
        ShopFacade.getInstance().buyProductByCashWithFreeShipping("thoitran.com");
        ShopFacade.getInstance().buyProductByPaypalWithStandarShipping("thoitran2107.com", "315.04578.10");
    }
}
