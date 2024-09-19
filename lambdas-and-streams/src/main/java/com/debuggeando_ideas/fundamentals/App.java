package com.debuggeando_ideas.fundamentals;

import java.util.List;

public class App {

    public static void main(String[] args) {
        ProductDB pDB = new ProductDB();
        EmployeeDB eDB = new EmployeeDB();
        System.out.println(pDB.getById(2L));
        System.out.println(eDB.getById(1L));

        System.out.println(Product.class.getName());
        System.out.println(Employee.class.getName());
        System.out.println(String.class.getName());

        // Clase anónima
        DatabaseService<String> anonimoDB = new DatabaseService<>() {

            @Override
            public String getById(Long id) {
                return null;
            }

            @Override
            public List<String> getAllRecords() {
                return null;
            }
        };

        System.out.println(anonimoDB.getClass().getName());
    }

}
