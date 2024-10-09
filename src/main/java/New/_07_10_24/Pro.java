package New._07_10_24;

public class Pro {
    public static void main(String[] args) {

        Promo[] promos = new Promo[] {
                new InnerPro1(10), new InnerPro2(10)
        };

        Product product = new Product();
        product.price = 100;
        System.out.println(product.price);
        Product item = new ProxyProduct(promos).getProduct(product);

        System.out.println(item.price);
    }
}

class Product {
    int price;
}

interface Promo {
    int apply(int price);
}

class InnerPro1 implements Promo {

    int sale;

    public InnerPro1(int sale) {

        this.sale = sale;
    }

    @Override
    public int apply(int price) {

        return price -= sale;
    }
}

class InnerPro2 implements Promo {

    double sale;

    public InnerPro2(double sale) {
        this.sale = sale;
    }

    @Override
    public int apply(int price) {
        return price = (int) (price - price * this.sale / 100);
    }

}

class ProxyProduct {
    Promo[] promos;

    public ProxyProduct(Promo[] promos) {
        this.promos = promos;
    }

    Product getProduct(Product product) {
        Product temp = new Product();
        temp.price = product.price;

        for (Promo item : promos) {
            temp.price = item.apply(temp.price);
        }

        return temp;
    }
}
