public class Customer {

    int id;

    String name;

    double balance;

    public Customer(){}
    public Customer(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    void incrementBalance(double amount){
        balance=balance+amount;
        System.out.println(balance);
    }

    void changeName(String name){
      name= name.toUpperCase();
       System.out.println("converting to uppercase :"+name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
