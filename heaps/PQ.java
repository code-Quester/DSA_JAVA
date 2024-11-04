package heaps;
import java.util.*;
public class PQ {
    public static class Student implements Comparable<Student> {
        String name;
        int rank;
        public Student(String name, int rank){
            this.name= name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue <Student> pq = new PriorityQueue<>();
        pq.add(new Student("a",3));
        pq.add(new Student("v",5));
        pq.add(new Student("c",1));
        pq.add(new Student("d",7));
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
    }
}
