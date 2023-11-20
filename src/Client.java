import java.time.ZonedDateTime;
import java.util.Scanner;

public class Client implements CardInterface {
    private String firstname;
    private String lastname;
    private int age;
    private Card card;
    private Basket basket;

    public Client(String firstname, String lastname, int age, Card card, Basket basket) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.card = card;
        this.basket = basket;
    }

    @Override
    public void paywithcard(double money) {
        Scanner scanner = new Scanner(System.in);
        if (money > 100) {
            while (true) {
                System.out.println("Введите пин код:");
                int pincode = scanner.nextInt();
                if (card.getPasword() == pincode) {

                    break;
                }else {System.err.println("Не верный пароль!");}
            }
            card.balans -= money;
            System.out.println("Общая сумма: " + money);


        } else if (money < 100) {
            card.balans -= money;
            System.out.println("Общая сумма продуктов :" + money + " . Дата: " + ZonedDateTime.now());

        } else {
            System.out.println("Недостаточно средств!");
        }
    }

    @Override
    public void getardbalans() {
        System.out.println("Остаток :" + card.balans + " сомов");

    }
}
