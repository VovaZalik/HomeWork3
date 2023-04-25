import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        ArrayList<String> products = new ArrayList<>();
        while (true) {
            menu();
            String input = ss.nextLine();
            switch (input) {
                case ("1"): {
                    addProduct(ss, products);
                    break;
                }
                case ("2"): {
                    shoppingList(products);
                    break;
                }
                case ("3"): {
                    deleteProduct(ss, products);
                    break;
                }
                case ("4"): {
                    searchProduct (ss, products);
                }
            }
        }
    }

    private static void searchProduct (Scanner ss, ArrayList<String> products) {
        String pop = ss.nextLine();
        System.out.println("Найдено:");
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).toLowerCase().contains(pop.toLowerCase())) {
                System.out.println((i + 1) + ". " + products.get(i));
            }
        }
    }

    private static void deleteProduct(Scanner ss, ArrayList<String> products) {
        shoppingList(products);
        System.out.println("Какую хотите удалить? Введите номер или название.");
        String operation = ss.next();
        try {
            int number = Integer.parseInt(operation);
            products.remove(number - 1);
        } catch (Exception e) {
            products.remove(operation);
        }
    }

    private static void addProduct(Scanner ss, ArrayList<String> products) {
        System.out.println("Какую покупку добавить ?");
        products.add(ss.nextLine());
        System.out.println("Итого в списке покупок: " + products.size());
        System.out.println();
    }

    public static void shoppingList (ArrayList < String > products) {
        System.out.println("Список покупок:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }
        System.out.println();
    }
    public static void menu () {
        System.out.println("Выберите операцию: ");
        System.out.println("1. Добавить");
        System.out.println("2. Показать");
        System.out.println("3. Удалить");
        System.out.println("4. Найти");
    }
}