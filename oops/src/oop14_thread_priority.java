/* there are basically 3 options in thread priority. we can also assign numbers between 1 to 10
    1 will be the least priority and 10 will be the max priority or we can also write these 3 words

 *  1) MIN_PRIORITY equivalent to 1
 *  2) NORM_PRIORITY equivalent to 5
 *  3) MAX_PRIORITY equivalent to 10
 * 
 */
class A extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=5;i++){
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
        }
        System.out.println("Exit from thread B");
    }
}
class C extends Thread{
    @Override
    public void run() {
        for(int k=0;k<=5;k++){
            System.out.println("k"+k);
        }
        System.out.println("Exit from thread C");
    }
}

public class oop14_thread_priority {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        
        obj3.setPriority(Thread.MAX_PRIORITY);// setPriority function will set the priority of the thread
        // by deafult the thread priority is 5
        obj2.setPriority(obj1.getPriority() + 1);// getPriority function will get the priority of the thread
        obj1.setPriority(Thread.MIN_PRIORITY);// setPriority function will set the priority of the thread

        System.out.println("Thread A started");
        obj1.start();

        System.out.println("Thread B started");
        obj2.start();

        System.out.println("Thread C started");
        obj3.start();

        System.out.println("Main thread end");
    }
}

/* 
output:- will change each time but here is one example output

Thread A started
Thread B started
Thread C started
Main thread end
k0
k1
k2
k3
k4
k5
Exit from thread C
j0
j1
j2
j3
j4
j5
Exit from thread B
i0
i1
i2
i3
i4
i5
Exit from thread A
*/
