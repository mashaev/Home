import java.util.ArrayList;

public class Mother extends Human {

    private Son son;
    private ArrayList<Product> products = new ArrayList<>();
    public Mother(String name, float money){
        this.name = name;
        this.money = money;
    }

    public void setProducts(Product product) {
        products.add(product);
    }

    public void setSon(Son son){
        this.son = son;

    }

    private float getProductSum(){
        float productCost =0;

        for (Product product:products){
            productCost += product.getPrice();
        }
        return productCost;
    }
    private void giveMoney(float money, Human human){
        this.money -= money;
        human.money += money;

    }

    public void sendSonToMarket(){
      if (son.isFree()){
        son.setProducts(products);
        giveMoney(getProductSum(),son);
        son.goToMarket();
      }else {
          System.out.println("Son is busy now");
      }
    }
}
