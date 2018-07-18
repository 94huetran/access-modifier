package appManagerStudent;

public class ManagerStudent {
    Student[] students = new Student[20];
    int size;

    public ManagerStudent() {
    }

    public void add(Student student) {
        students[size] = student;
        size++;
    }

    public void find(String name) {
        int found = 0;
        for (int i = 0; i < students.length; i++) {
            boolean match = students[i].getName().equals(name);
            if (match) {
                System.out.println("The position of student "+name+"in the list is "+i);
                found++;
                break;
            }
            boolean notFound = found == 0;
            if (notFound) {
                System.out.println("The student " + name + " not in list.");
                break;
            }
        }
    }

    public void dishPlay() {
        if (size == 0) {
            System.out.println("Not Studen in list.");
        } else if (size == 1) {
            System.out.println("The list have a 1 student");
        } else if (size > 1) {
            System.out.println("There are "+size+" in list: ");
            for (int i = 0; i < size; i++) {
                System.out.println(students[i].getInfomation()+" ,");
            }
        }
        System.out.println();
    }

}
