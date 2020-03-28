/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
   public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("khushi",1);
        obj.insert("jalanki",4);
        obj.insert("vaibhav",3);
        obj.insert("riya",2);
        obj.insert("sameeksha",5);
        obj.display();
    }
  
}
