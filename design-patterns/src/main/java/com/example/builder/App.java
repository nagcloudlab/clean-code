package com.example.builder;

public class App {

    public static void main(String[] args) {

        // object creation 2step process
        // step-1 : memory allocation => new
        // step-2 : object initialization => constructor

        //Employee emp = new Employee(1, "John", 1000, "IT", "Developer");
        //System.out.println(emp);

        // complexities with builder pattern

        // 1. all constructor arguments are mandatory
        // 2. if we have more arguments, then constructor will be complex
        // 3. if we have more arguments, then we need to remember the order of arguments
        // 4. if we have more arguments, then we need to pass null for optional arguments
        // 5. if we have more arguments, then we need to pass default values for optional arguments

        // builder pattern
        // creates complex object in a step-by-step approach

        Employee emp = new Employee.EmployeeBuilder()
                .setId(1)
                .setName("John")
                .setDesignation("Developer")
                .setDept("IT")
                .build();

        System.out.println(emp);


        // Build ResponseEntity with builder pattern, with status code, headers, and body
        // ResponseEntity<String> responseEntity =
        // ResponseEntity
        //         .status(HttpStatus.OK)
        //         .header("X-Header", "value")
        //         .body("Hello, World!");
        // System.out.println(responseEntity);





    }

}
