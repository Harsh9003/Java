import java.util.Scanner;
class threeNumber{
    void findMaxThree(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :: ");
        int a= sc.nextInt();
        System.out.print("Enter Second number :: ");
        int b=sc.nextInt();
        System.out.print("Enter third number :: ");
        int c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("First is greater number");
            }
            else{
                System.out.println("Second is greater number");
            }
        }
        else{
            if(b>c){
                System.out.println("Second is greater number");
            }
            else{
                System.out.println("Third is greater number");
            }
        }
    }
}

class arrayMax{
    void finMaxArray(){
        int Numbers[] = {10, 20, 30, 5, 15,45,3,55};
        int max=Numbers[0];
        int length = Numbers.length;
        for(int i=0; i<length; i++){
            if(max<Numbers[i]){
                max = Numbers[i];
            }
        }
        System.out.println("Maximum number in array : "+max);
    }
}
class findMax{
    public static void main(String[] args) {
        arrayMax obj = new arrayMax();
        obj.finMaxArray();
    }
}
