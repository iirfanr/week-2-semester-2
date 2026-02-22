package id.ac.polban;

import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.*;

public class Main {
    public static void main(String[] args) {

        Department it = new Department("IT");
        EmploymentType fullTime = new EmploymentType("Full-Time");

        Employee emp1 = new Employee(1, "Budi", it, fullTime, 5000000);

        EmployeeService service = new EmployeeService();
        service.addEmployee(emp1);

        service.raiseSalary(1, 10);
        Employee emp2 = new Employee(2, "Siti", it, fullTime, 6000000);
        service.addEmployee(emp2);
        

        System.out.println("Nama: " + emp1.getName());
        System.out.println("Gaji: " + emp1.getSalary());
        System.out.println("Nama: " + emp2.getName());
        System.out.println("Gaji: " + emp2.getSalary());
        System.out.println("Total Karyawan: " + Employee.getEmployeeCount());
    }
}

/*Adapun ketentuan dan tugas praktikum adalah sebagai berikut:
1.	Lengkapi studi kasus yang telah dibuat dengan menerapkan penggunaan static field dan static method secara tepat!
    dimasukkan ke dalam class Employee untuk menghitung jumlah total karyawan yang telah dibuat.
2.	Terapkan konsep package dengan membuat minimal dua package, yaitu:
●	id.ac.polban.employee.model
●	id.ac.polban.employee.service
    sudah terbuat pada studi kasus.
2.	Buat diagram kelas (class diagram) yang menggambarkan struktur class, attribute, method, serta hubungan antar class dalam sistem.
    
    Department
    attributes:
    - name: String
    
    methods:
    - getName
    - setName

    EmploymentType
    attributes:
    - type: String

    methods:
    - getType
    - setType

    Employee
    attributes:
    - id: int
    - name: String
    - department: Department
    - employmentType: EmploymentType
    - salary: double
    - employeeCount: int (static)

    methods:
    - getId
    - setId
    - getName
    - setName
    - getDepartment
    - setDepartment
    - getType
    - setType
    - getSalary
    - setSalary
    - getEmployeeCount

    employeeService
    attributes:
    - employees: Map<Integer, Employee>

    methods:
    - addEmployee
    - getEmployee
    - raiseSalary


    Dependency:
    EmployeeService -> Employee (Menggunakan Employee untuk mengelola data karyawan)

    Aggregation:
    Employee -> Department (Employee memiliki Department)
    Employee -> EmploymentType (Employee memiliki EmploymentType)

Jelaskan perbedaan dan fungsi masing-masing jenis relasi tersebut berdasarkan kasus yang dibuat!
    Dependency: hubungan sementara, digunakan di parameter method. contoh: employeeService menggunakan Employee.
    Aggregation: Disimpan sebagai attribute, contoh: Employee memiliki Department dan EmploymentType.

Lakukan proses generate aplikasi ke dalam file JAR!
    
 */