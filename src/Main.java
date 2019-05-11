public class Main {

    public static void main(String[] args) {

        Mother mother = new Mother("Meerim", 45500);
        Son son = new Son("Tima",50);
        mother.setSon(son);
        son.setFree(true);

        mother.setProducts(new Product("Milk",45));
        mother.setProducts(new Product("Bread",15));
        mother.setProducts(new Product("Cheese",155));

        mother.sendSonToMarket();

        son.showProduct();
    }
}
