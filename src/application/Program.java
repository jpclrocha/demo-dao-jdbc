package application;

import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "books");

        Seller seller = new Seller(1,"joao","email", LocalDate.now(),2000.0,obj);
        System.out.println(seller);
    }
}
