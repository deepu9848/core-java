package assignment.collection;



import java.util.*;

public class MainApplication {

    public static void main(String[] args) {
        List<student> studentArrayList = new ArrayList<>();
        student student1 = new student(1, "deepak", 16);
        student student2 = new student(2, "hari", 13);
        student student3 = new student(3, "shyam", 25);

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);


            //add duplicate
            student student4 = new student(1, "deepak", 16);
            studentArrayList.add(student4);
            //linllist of students object
            List<student> studentLinkedList = new LinkedList<>();
            student student5 = new student(5, "darshan", 12);
            student student6 = new student(6, "rajendra", 20);
            student student7 = new student(7, "bharat", 17);

            studentLinkedList.add(student5);
            studentLinkedList.add(student6);
            studentLinkedList.add(student7);

            for (assignment.collection.student student : studentLinkedList) {
                System.out.println(student);
            }//duplicate add to linkedList
            student student8 = new student(7,"bharat",17);
            studentLinkedList.add(student8);
            // add hash code
            Set<student> hashSet = new HashSet<>();

            student student9 = new student(9, "paneru", 18);
            student student10 = new student(10,"jay", 19);
            student student11 = new student(11,"laxmi",17);

            hashSet.add(student9);
            hashSet.add(student10);
            hashSet.add(student11);

            for(assignment.collection.student student: hashSet){
                System.out.println(student);
            }
            //add duplicate to hashcode
            student student12 = new student(10,"jay", 19);
            hashSet.add(student12);
        //treeset
            Set<student> treeSet = new TreeSet<>();

            student student13 = new student(13, "andre", 13);
            student student14 = new student(14,"punam", 16);
            student student15 = new student(15,"suwash",14);

            treeSet.add(student13);
            treeSet.add(student14);
            treeSet.add(student15);

            for(assignment.collection.student student: treeSet){
                System.out.println(student);
            }

            // Adding duplicate student to the TreeSet
            student student16 = new student(13, "andre", 13);
            treeSet.add(student16);

            System.out.println("\n");
            System.out.println("After adding duplicate student to TreeSet: ");
            // TreeSet doesn't allow adding duplicate student
            for(assignment.collection.student student: treeSet) {
                System.out.println(student);
            }


        }
    }

