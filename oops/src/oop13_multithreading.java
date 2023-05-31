class A extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            if(i == 1){
                Thread.yield();
            }
            System.out.println("i"+i);
        }
        System.out.println("Exit from thread A");
    }
}

class B extends Thread{
    @Override
    public void run() {
        for(int j=0;j<=5;j++){
            System.out.println("j"+j);
            if(j == 3){
                stop();
            }
        }
        System.out.println("Exit from thread B");
    }
}
class C extends Thread{
    @Override
    public void run() {
        for(int k=0;k<=5;k++){
            System.out.println("k"+k);
            if(k == 1){
                try{
                    sleep(1000);
                }catch(Exception e){
                    e.getMessage();
                }
            }
        }
        System.out.println("Exit from thread C");
    }
}
public class oop13_multithreading {
    public static void main(String[] args) {
        A obj = new A();
        obj.start();

        B obj2 = new B();
        obj2.start();

        C obj3 = new C();
        obj3.start();
    }
}

/* 
output:- will change each time but here is one example output

i0
k0
k1
j0
j1
j2
i1
i2
j3
i3
i4
i5
Exit from thread A
k2
k3
k4
k5
Exit from thread C

*/
