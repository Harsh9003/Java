class exceptionTest {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int div;
        try {
            div = a/b;
        } catch (Exception e) {
            System.out.println("Zero is not divided");
        }
        finally{
            System.out.println("Program complete");
        }
    }    
}
