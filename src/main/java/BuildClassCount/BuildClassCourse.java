package BuildClassCount;

public class BuildClassCourse {
    private String name;
    private String[] students = new String[20];
    private int studentCount = 0;

    public BuildClassCourse(String name) {
        this.name = name;
    }

    public BuildClassCourse() {

    }

    public String getName() {
        return name;
    }

    public String[] getStudents() {
        return students;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void addStudent(String name) {
        students[studentCount] = name;
        studentCount++;
    }

    public void removeStudent(String name) {
        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].equals(name)) {
                found = true;
                for (int j = i + 1; j < studentCount; j++) {
                    students[j] = students[j - 1];
                    studentCount--;
                    System.out.println("The student: " + name + " removed");
                }
            }
        }
        if (!found) {
            System.out.println("The student: " + name + " not exited in list, nothing removed!");
        }
    }
}

