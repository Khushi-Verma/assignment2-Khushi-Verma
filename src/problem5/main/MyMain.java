/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;
//executable class
public class MyMain {
  public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue();
        obj.enqueue(1,3,0);
        obj.enqueue(2,6,1);
        obj.enqueue(3,6,4);
        obj.enqueue(4,2,1);
        obj.enqueue(5,1,2);
        obj.enqueue(6,0,0);
        obj.removeBackLog();
        obj.display();

    }
}
