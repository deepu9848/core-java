package assignment.collection;


import java.util.Comparator;
import java.util.TreeSet;

public class StudentsDescendingOrder {
    public static void main(String[] args) {

        // String List

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("AA");
        treeSet.add("BB");

        System.out.println("TreeSet" + treeSet);
        TreeSet<String> treeSetSort = (TreeSet<String>)treeSet.descendingSet();
        System.out.println("Descending order" + treeSetSort);

        // Student List



        TreeSet<student> students = new TreeSet<>((Comparator) new student());
        student student1 = new student(1,"A", 14);
        student student2 = new student(1,"G", 26);
        student student3 = new student(1,"Z", 19);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students);

    }
}







