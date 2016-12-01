/**
 * Created by robertcampos on 11/29/16.
 */
public class Main {
    public static void main(String[] args) {
        Player robert = new Player("name", "token");
        Property square = new Property("Boardwalk", "Blue", 000, 000);


        robert.receiveMoney(400);
        robert.payMoney(100);

    System.out.println(robert.getName() + " " + robert.receiveMoney() + " " + robert.getToken());
        System.out.println(robert.getName() + " " + robert.payMoney() + " " + robert.getToken());



    }
}

