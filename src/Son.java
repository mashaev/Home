import java.util.ArrayList;

public class Son extends Human {

    private boolean isFree;
    private ArrayList<Product> products= new ArrayList<>();

    public Son(String name, float money){
        this.name = name;
        this.money = money;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void setFree(boolean free) {
        isFree = free;
    }


    public void setMoney(float money){
        this.money += money;

    }

    public boolean goToMarket(){
       float productCost =0;

        for (Product product:products){
            productCost += product.getPrice();
        }
        if (productCost > money){
            System.out.println("Not enough money ");
            return false;
        }
        System.out.println("I going to Market");
        return true;
    }

    public void showProduct(){
        for (Product p:products){
            System.out.println(p.getProductName());
        }
    }
}
