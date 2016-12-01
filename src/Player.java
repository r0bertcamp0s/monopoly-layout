/**
 * Created by robertcampos on 11/29/16.
 */
public class Player {
    private String name;
    private String token;
    private int money;

    public Player(String name, String token, int money) {
        this.name = "robert";
        this.token = "shoe";
        this.money = 1500;
    }

    public String getName() {
        return this.name;
    }

    public String getToken(){
        return this.token;
    }

    public void setName(){
        return this.name;
    }

    public void setToken(){
        return this.token;
    }

    public void receiveMoney(int paid) {
        this.money += paid;
    }

    public void payMoney(int paid) {
        this.money -= paid;
    }



}
