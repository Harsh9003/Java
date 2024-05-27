import employee.Emp;

class Emppay {
    public static void main(String[] args) {
        Emp e = new Emp();
        e.name = "John";
        e.empid = 101;
        e.category = "Manager";
        e.bpay = 50000;
        e.hra = 10000;
        e.da = 8000;
        e.allowance = 2000;

        e.calculateNetPay();
        e.displayDetails();
    }
}
