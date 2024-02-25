package Oops;

@FunctionalInterface
interface A{
    void show();
}
class B implements A {
    public void show(){
        System.out.println("Hello");
    }
}
class FnctionalInterface{
    public static void main(String[] args){
        A obj = new A() {
          public void show(){
              System.out.println("Hello from Anonymous class");
          }
        };
        obj.show();
    }
}