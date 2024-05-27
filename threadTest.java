class A extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("I is ="+i);
        }
    }
}
class B extends Thread{
    public void run(){
        for(int j=1; j<=5; j++){
            System.out.println("J is ="+j);
        }
    }
}
class C extends Thread{
    public void run(){
        for(int k=1; k<=5; k++){
            System.out.println("K is ="+k);
        }
    }
}
class threadTest {
    public static void main(String[] args) {
        new A().start();
        new B().start();
        new C().start();
    }
}
