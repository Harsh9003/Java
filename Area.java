import java.util.Scanner;
class recArea{
   float length;
   float breadth;
    void setDim(float l, float b){
        length = l;
        breadth = b;
    }
    float getArea(){
        return length * breadth;
    }
}
class Area {
    
   
    public static void main(String[] args) {
        Scanner sArea = new Scanner(System.in);
        recArea obj = new recArea();
        System.out.print("Enter lenght : ");
        float length = sArea.nextFloat();
        System.out.print("Enter breadth : ");
        float breadth = sArea.nextFloat();

        System.out.println("Area is : "+obj.getArea());

    }
}
