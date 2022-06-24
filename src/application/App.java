package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Department obj = new Department(1, "Books");

        Seller seller = new Seller(
                21, "Bob", "bob@gmail.com",
                new Date(sdf.parse("22/04/1985").getTime()),
                3000.0, obj);

        System.out.println(seller);
    }
}
