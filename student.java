class st{
    int id;
    String name;
    // st(){
    //     System.out.println("This is a default constructor");
    // }
    // st(int i, String n){ //Perametrize constructor
    //     id = i;
    //     name = n;
    // }
    void getdata(int id, String name){ //Call by reference
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}
class student{
    public static void main(String args[]){
        st obj = new st();
        // st obj1 = new st(101, "Harsh");
        // st obj2 = new st(102, "Chauhan");
        obj.getdata(108, "Adb");
        obj.display();
        // obj1.display();
        // obj2.display();
    }
}