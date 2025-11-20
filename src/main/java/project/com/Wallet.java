package project.com;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wallet {

    private String color;
    private int size;
    private Double money;
    private boolean lost;

    public Wallet(String color, int size, Double money, boolean lost) {
        this.color = color;
        this.size = size;
        this.money = Math.max(money, 0);
        this.lost = lost;
    }

    public Double addMoney(double amount) {
        if (amount < 0) {
            return money;
        }
        money += amount;
        return money;
    }

    public Double getMoneyWithAmount(double amount) {
        if (amount <= 0) {
            return money;
        };
        money -= amount;
        return money;
    }

    public String open() {
        return "Wallet opened";
    }

    public String close() {
        return "Wallet closed";
    }

    public boolean isLost() {
        return lost;
    }

    public Double checkMoney() {
        return money;
    }
}
