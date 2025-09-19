package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주문개수 입력>>>...");
        int n = sc.nextInt();
        ProductOrder[] orders = new ProductOrder[n];

        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+"번째 주문정보 입력하기");

            System.out.print("상품명>>..");
            String name = sc.next();
            System.out.print("가격>>..");
            int price = sc.nextInt();
            System.out.print("수량>>..");
            int quantity = sc.nextInt();

            orders[i] = createOrder(name, price, quantity);
        }
        printOrder(orders);
        System.out.println("총 결제 금액: " + getTotalAmount(orders));
    }
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println(order.productName + " " + order.price + " " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        return total;
    }
}
