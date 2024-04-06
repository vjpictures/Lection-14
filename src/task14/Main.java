package task14;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("Ручка", 5.99, 4.5);
        Product product2 = new Product("Юбка", 10.99, 3.5);
        Product product3 = new Product("Яблоки", 15.99, 4.0);

        Category category1 = new Category("Канцелярия", new Product[]{product1});
        Category category2 = new Category("Женская одежда", new Product[]{product2});
        Category category3 = new Category("Фрукты", new Product[]{product3});

        Basket basket1= new Basket(new Product[]{product1});

        java.time.LocalDate currentDate = java.time.LocalDate.now();
        System.out.println("Дата:   " + currentDate);

        System.out.println("\nПРОДУКТЫ  КАТЕГОРИИ  ЦЕНА");
        System.out.println("--------------------------");

        for (Product product : category1.products) {
            System.out.println(product.name + " - " + category1.name + " - " + product.price);
        }

        for (Product product : category2.products) {
            System.out.println(product.name + " - " + category2.name + " - " + product.price);
        }

        for (Product product : category3.products) {
            System.out.println(product.name + " - " + category3.name + " - " + product.price);
        }

        double sum = product1.price + product2.price + product3.price;
        System.out.println("--------------------------");
        System.out.println("Итого: " + sum);
    }
}