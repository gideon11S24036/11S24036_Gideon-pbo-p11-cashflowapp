package org.delcom.todos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Anotasi ajaib yang mengkonfigurasi semuanya secara otomatis
public class TodosApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodosApplication.class, args);
        System.out.println("Server is running on http://localhost:8080");
    }
}