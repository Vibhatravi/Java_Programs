package com.example.program1;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Program1Application {

	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(Program1Application.class, args);
//		
//		Customer c = context.getBean(Customer.class);
////		Ticket t = context.getBean(Ticket.class);
//		
//		c.display();
		
//		SpringApplication.run(Program1Application.class, args);
//		ApplicationContext context = new ClassPathXmlApplicationContext("testBean.xml");
//		Customer c = (Customer)context.getBean("customer");
//		System.out.println(c.getId());
//		System.out.println(c.getName());
//		System.out.println(c.getPhNo());
//		
//		Ticket t = (Ticket)context.getBean("ticket");
//		System.out.println(t.getIdTkt());
//		System.out.println(t.getDate());
//		System.out.println(t.getPrice());
		
		Scanner sc = new Scanner(System.in);
        SpringApplication.run(Program1Application.class, args);
        ApplicationContext ac = new ClassPathXmlApplicationContext("testBEAN.xml");
        Customer c = (Customer) ac.getBean("customer");

        while (true) {
            System.out.println("1. insert the details\n 2. Display details \n"
                    + "3. exit");
            System.out.println("enter the choice");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("enter the customer name");
                    String name = sc.next();
                    System.out.println("enter the customer address");
                    String address = sc.next();
                    System.out.println("enter the ticket number");
                    int ticno = sc.nextInt();
                    System.out.println("enter the ticket seat no");
                    int seatno = sc.nextInt();
                    System.out.println("enter the ticket price");
                    int price = sc.nextInt();
                    System.out.println("enter the ticket Type -economic/gold/platinum");
                    String ticktype = sc.next();

                    // Create Ticket object with constructor
                    Ticket t = new Ticket(ticno, price, seatno, ticktype);

                    // Create Customer object with constructor
                    Customer newCustomer = new Customer(name, address, t);

                    // Set the new Customer object
                    c = newCustomer;

                    System.out.println("thanks for input");
                    break;

                case 2:
                    System.out.println("Customer Details:");
                    System.out.println("Name:" + c.getName() + " " + "Address:" + c.getAddress());
                    System.out.println("Ticket Details");
                    t = c.getTick();
                    System.out.println("Ticket No: " + t.getTicno());
                    System.out.println("Ticket Type: " + t.getTicktype());
                    System.out.println("Ticket Seat No: " + t.getSeatno());
                    System.out.println("Ticket Price: " + t.getPrice());
                    break;
                case 3:
                	sc.close(); // Close the Scanner before exiting
                    ((ClassPathXmlApplicationContext) ac).close(); // Close the ApplicationContext
                    System.exit(0);
            }
		}
	}

}
