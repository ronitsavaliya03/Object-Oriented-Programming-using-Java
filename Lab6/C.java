class A {
    int a=20;
}
class B extends A{
    int b=10;
}
class C extends B{
    int c=40;
    void sum(){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        C obj=new C();
        obj.sum();
    }
}