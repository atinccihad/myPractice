package work01;

class Super{
    public Integer getLength(){
        return new  Integer(4);
    }
}

public class Test07 extends Super{
    public Integer getLength(){
        return (5);
}

    public static void main(String[] args) {
        Super sooper=new Super();
        Test07 sub=new Test07();
        System.out.println(sub.getLength().toString()+","+sub.getLength().toString());
    }
}
