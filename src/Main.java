import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Cиз супермаркетке келип сатып алып жатканыңызды элестетип
        //көрсөңүз, карта менен төлөйсүз, Эгер азык-түлүктүн суммасы 100
        //сомдон ашса, сизден пароль талап кылынат, киргизүүдө пароль
        //текшерилет жана эгер ал туура эмес болсо, консолго "туура эмес
        //пароль" чыгарылат, эгер ал туура болсо, сиз операцияны уланта
        //аласыз. эгерде сизде жетиштүү каражат болсо, Сиз төлөйсүз жана
        //консолдон сиз чекти көрө аласыз (азык-түлүктүн аталыштары жана
        //баалары жана алардын жалпы суммасы менен), ал эми
        //консолдо жок болсо "сизде каражат жетишпейт".
        // Card  деген класс тузунуз  (firstname, lastname, card number,
        //balance, password).
        // Product деген класс тузунуз   (productname, price).
        // Basket деген класс тузунуз  (products[] ).
        //Client  деген класс тузунуз  полялары (firstname, lastname, age,
        //card, basket).
        //cardInterface интерфейс  түзүңүз жана paywithcard(double money)
        //абстракттуу метод түзүңүз, ал метод сатылып алынган продуктынын
        //квитанциясын кайтарат, жана getcardbalance() методу картадагы
        //балансты кайтарат.
        //  Client классы cardInterface мурасталып, анын методорун
        //реализация кылат.
        Card card  = new Card("Нурмухаммед","Медетов",12345678,5000,6666);

        Product product1 = new Product("Картошка",5);
        Product product2= new Product("Капуста",5);
        Product product3= new Product("Пияз",100);
        Product product4= new Product("Томат",9);
        Product product5= new Product("Сабиз",7);
        Product[] products = {product1,product2,product3,product4,product5};
        Basket basket = new Basket(products);
        Client client = new Client("Нурмухаммед","Медетов",20,card,basket);

        System.out.println(Arrays.toString(products));
        double money = 0;
        for (int i = 0; i < products.length; i++) {
            money+=products[i].price;

        }
        client.paywithcard(money);
        client.getardbalans();

        }



                }