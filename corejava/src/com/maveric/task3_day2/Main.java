package com.maveric.task3_day2;

public class Main {

    Customer[] customer = new Customer[4];
    int size=0;
    int size1 = 0;
    Feedback[] feedbacks = new Feedback[4];



//    int customerGeneratedId(){
//        return ++size;
//    }
//    int feedbackGeneratedId(){
//        return ++size1;
//    }
    void registerCustomer(Customer cust) {
        customer[size] = cust;
        size++;
    }

    void addFeedback(Feedback feedback) {
        feedbacks[size1] = feedback;
        size1++;
    }

    void display() {
        for (Customer s : customer) {
            Customer s1 = s;
            System.out.println(s1);
        }
    }

    void display1() {
        for (Feedback f : feedbacks) {
            Feedback s1 = f;
            System.out.println(s1);
        }
    }

    void findbyid(int id) {
        System.out.println("feedbacks by customer id:");
        for (int i = 0; i < feedbacks.length; i++) {
            if (feedbacks[i].customer.id == id) {
                System.out.println(feedbacks[i].fb_id);
            }
        }

    }


    public static void main(String[] args) {
        Main obj = new Main();
        Customer cust = new Customer(1, "sampath");
        Customer cust1 = new Customer(2, "Hemanth");
        Customer cust2 = new Customer(3, "karthik");

        Feedback f = new Feedback(101, "good", cust);
        Feedback f1 = new Feedback(102, "bad", cust1);
        Feedback f2 = new Feedback(103, "verygood", cust2);
        Feedback f3 = new Feedback(104, "bad", cust2);
        obj.registerCustomer(cust);
        obj.registerCustomer(cust1);
        obj.registerCustomer(cust2);
        obj.addFeedback(f);
        obj.addFeedback(f1);
        obj.addFeedback(f2);
        obj.addFeedback(f3);
        obj.display();
        obj.display1();
        obj.findbyid(3);
    }
}
