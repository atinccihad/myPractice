package work01;

public class Test09 {
    public static void main(String[] args) {
        Computer mouse=new Laptop();
        System.out.println(mouse.getValue(100,200));
    }
}
class NoteBook{
    int getValue(int a,int b){
        if (a>b)
            return a;
        else
            return b;
    }
}
class Computer extends NoteBook{
    int getValue(int a, int b) {
        return a*b;
    }
}
class Laptop extends Computer{
    int getValue(int a,int b){
        return b-a;
    }
}
