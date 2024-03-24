package HomeWork4_2;

public class BankService {
    private double balance; // Баланс банковского счета

    public BankService() {
        this.balance = 0; // Изначально баланс равен 0
    }

    public void deposit(double amount) {
        if (amount > 0) { // Если сумма депозита положительная
            this.balance += amount; // Увеличиваем баланс на сумму депозита
            System.out.println("Deposited: " + amount); // Выводим информацию о депозите
        } else {
            System.out.println("Invalid deposit amount."); // Выводим сообщение об ошибке
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) { // Если сумма снятия положительная и не превышает баланс
            this.balance -= amount; // Уменьшаем баланс на сумму снятия
            System.out.println("Withdrawn: " + amount); // Выводим информацию о снятии
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance."); // Выводим сообщение об ошибке
        }
    }

    public double getBalance() {
        return this.balance; // Возвращаем текущий баланс
    }
}
