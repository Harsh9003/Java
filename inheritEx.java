//Hirarchical Inheritance

// class getstudent{
//     void name(){
//         System.err.println("Harsh");
//     }
// }
// class stream extends getstudent{
//     void streamName(){
//         System.out.println("M.C.A.");
//     }
// }
// class subject extends getstudent{
//     void subjectName(){
//         System.out.println("Java");
//     }
// }

//Multiple inheritance

interface fly{
    void flyable(String str);
}
interface swim{
    void swimable(String str);
}
class Bird implements fly, swim{
    public void flyable(String str){
        System.out.println(str+" can fly");
    }

    public void swimable(String str){
        System.out.println(str+" can swim");
    }
}

class inheritEx {
    public static void main(String[] args) {
        //Hirarchical Inheritance

        // stream sName = new stream();
        // sName.name();
        // sName.streamName();

        // subject subName = new subject();
        // subName.name();
        // subName.subjectName();

        //Multiple Inheritance

        Bird bird = new Bird();
        String str = "Duck";
        bird.flyable(str);
        bird.swimable(str);
    }    
}
