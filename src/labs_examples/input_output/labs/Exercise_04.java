package labs_examples.input_output.labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */


public class Exercise_04 {

    public static void main(String[] args) throws IOException {
        ArrayList<Employee> employees = new ArrayList(11);
        String filePath = "src/labs_examples/input_output/files/purchases.csv";

        try(BufferedReader buffRead = new BufferedReader((new FileReader(filePath)))){
            String line;
            while((line = buffRead.readLine()) != null){
                String[] values = line.split(",");
                employees.add(mapValuesToEmployees(values));
            }
        }catch(FileNotFoundException noFileExc){
            noFileExc.printStackTrace();
        }catch(IOException exc){
            exc.printStackTrace();
        }

        for(Employee employee : employees){
            System.out.println(employee.toString());
        }
    }


    private static Employee mapValuesToEmployees(String[] values){
        Employee employee = new Employee();
        employee.setName(values[0]);
        employee.setAmount(Double.parseDouble(values[1]));
        employee.setComment(values[2]);

        return employee;
    }

}

class Employee {
    private String name;
    private double amount;
    private String comment;

    public Employee(){}

    public Employee(String name, double amount, String comment){
        this.name = name;
        this.amount = amount;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", amount= $" + amount +
                ", comment='" + comment + '\'' +
                '}';
    }
}
