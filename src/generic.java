public class generic {
    public static void main(String[] args) {
        var a1=new A<Integer, Integer>();
        a1.x=10;
        a1.Y=5;
        a1.info2(10);
        a1.info1(10,8);
        var a2=new A<Integer,Boolean>();
        a2.x=10;
        a2.Y=false;
        a2.info1(10,false);
        a2.info2(true);


    }
    static class A<T,E>{
        T x;
        E Y;
        public void info1(T a,E b){}
        public E info2(E a){
            return a;
        }
    }
}
