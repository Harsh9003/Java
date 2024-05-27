import java.util.*;
class check{
    int number[] = {1,2,3,4,5,6,7,8,9,10};
    //int even=0;
    //int odd=0;
    ArrayList <Integer> even_number = new ArrayList<>();
    ArrayList <Integer> odd_number = new ArrayList<>();
    void data(){
        for(int i=0; i<number.length; i++){
            if(number[i]%2==0){
                //even+=1;
                get_even(number[i]);
            }
            else{
                //odd+=1;
                get_odd(number[i]);
            }
        }
    }
    void get_even(int num){
        even_number.add(num);
    }
    void get_odd(int num){
        odd_number.add(num);
    }
    void display(){
       
        System.out.println(even_number);
      
        System.out.println(odd_number);
       
    }
}

class find {
    public static void main(String[] args) {
        check obj = new check();
        obj.data();
        obj.display();
    }
}
