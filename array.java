import java.util.Scanner;
class array {
    public static void main(String[] args) {
        
        int[] orArray = new int[10];
        Scanner obj = new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.print("Enter "+(i+1)+" number value in array :");
            orArray[i] = obj.nextInt();
            System.out.println();
        }
        int[] rvArray = new int[10];
        for(int i=0; i<10; i++){
            rvArray[i] = orArray[9-i];
        }
        System.out.println("Revers array is: ");
        for(int i=0; i<10; i++){
            System.out.print(rvArray[i]+" ");
        }
    }
}
