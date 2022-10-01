public class Employee {
    String name;
    double salary;
    int workHours;
    double hireYear;

    public Employee(String name, double salary, int workHours, double hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(double salary){
        double tax = 0;
        if(this.salary > 1000)
            tax = this.salary * 0.03;
        return tax;
    }

    public double bonus(int workHours) {
        int bonus = 0;
        int hour = this.workHours - 40;
        if(this.workHours > 40)
            bonus = hour * 30;
        return bonus;
    }

    public void raiseSalary() {
        double workYear = 2021 - this.hireYear;
        double raise;
        double salaryBonusTax;
        double totalSalary;
        if(workYear > 0 && workYear < 10) {
            raise = this.salary * 0.05;
        } else if (workYear >= 10 && workYear < 20) {
            raise = this.salary * 0.1;
        }else
            raise = this.salary * 0.15;
        System.out.println("Maaş artışı: " + raise);

        salaryBonusTax = this.salary + bonus(this.workHours) - tax(this.salary);
        System.out.println("Vergi ve bonuslarla birlikte maaş: " + salaryBonusTax);

        totalSalary = salaryBonusTax + raise;
        System.out.println("Toplam Maaş: " + totalSalary);
    }

    public void toStringEmployee(Employee employee) {
        System.out.println("Ad-Soyad: " + employee.name);
        System.out.println("Maaş: " + employee.salary);
        System.out.println("Çalışma Saati: " + employee.workHours);
        System.out.println("Başlangıç Yılı: " + employee.hireYear);
        System.out.println("Vergi: " + employee.tax(employee.salary));
        System.out.println("Bonus: " + employee.bonus(employee.workHours));
        employee.raiseSalary();
    }

}
