package appManagerStudent;

public class StudentManagerTest {
    public static void main(String[] args) {
        Student andy = new Student("Andy", 23);
        ManagerStudent studentManager = new ManagerStudent();
        studentManager.add(andy);
        System.out.println("added " + andy.getInfomation());
        studentManager.dishPlay();

        Student booby = new Student("Booby", 25);
        studentManager.add(booby);
        System.out.println("added " + booby.getInfomation());
        studentManager.dishPlay();

        Student samy = new Student("Samy", 22);
        studentManager.add(samy);
        System.out.println("added " + samy.getInfomation());
        studentManager.dishPlay();

        studentManager.find("Andy");
        studentManager.find("Michael");
        studentManager.find("Sony");
    }
}
