import java.util.Scanner;

public class Main {

    int size;
    Product[] product;
    public void findbyid(long id) {
        for (Product p : product) {
            if (p.getId() == id) {
                System.out.println("id you search:" + id);
                System.out.println(p);
            }
            return ;
        }
        System.out.println("No product found with id: " + id);
    }

    public void addProducts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length  of Array");
        size = sc.nextInt();
        product = new Product[size];
        int i = 0;
        for (i = 0; i < size; i++) {
            Product obj = new Product();
            System.out.println("Enter Product Id ");
            obj.id = sc.nextInt();
            System.out.println("enter Product price:");
            obj.price = sc.nextDouble();
            product[i] = obj;
        }
        System.out.println("products are Added");
        for (Product p : product) {
            System.out.println(p);
        }
    }

    void increasePriceBy(Double amount, Long id) {
        for (Product p : product) {
            if (p.getId() == id) {
                p.setPrice(p.getPrice() + amount);
                System.out.println(p);
            }
            return;
        }
        System.out.println("No product found with id: " + id);
    }

    void displayallProduct() {
        for (Product p : product) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {

        Main obj = new Main();
        obj.addProducts();
        obj.findbyid(2);
        obj.displayallProduct();
        System.out.println("-----");
        obj.increasePriceBy(10.0, 1L);
        System.out.println("---------");

    }


}

