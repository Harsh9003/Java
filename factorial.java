class factorial {
    int res = 0;
    int fact(int a){
        if(a == 1 || a==0){
            return 1;
        }
        else{
            return(a * fact(a-1));
        }
    }
    public static void main(String[] args) {
        factorial obj = new factorial();
        int Fact_res = obj.fact(5);
        System.out.println("Factorial is : "+Fact_res);
    }
}
