package BuildClassCount;

import org.junit.Assert;
import org.junit.Test;

public class CourseTest {
    BuildClassCourse buildClassCourse =new BuildClassCourse();

    @Test
    public void testGetStudentCount() {
        buildClassCourse.addStudent("hieu");
        buildClassCourse.addStudent("ha");
        buildClassCourse.addStudent("linh");
        int result = buildClassCourse.getStudentCount();
        Assert.assertEquals(3,result);
    }
    @Test
    public void testGetStudent() {
        buildClassCourse.addStudent("hieu");
        buildClassCourse.addStudent("ha");
        buildClassCourse.addStudent("linh");
        String[] arr = new String[]{"hieu","ha","linh"};
        boolean result = arr.equals(buildClassCourse.getStudents());
        Assert.assertTrue(result);

    }
    @Test
    public void testRemoveStudent() {
        buildClassCourse.addStudent("hieu");
        buildClassCourse.addStudent("ha");
        buildClassCourse.addStudent("linh");
        buildClassCourse.removeStudent("ha");
        int result = buildClassCourse.getStudentCount();
        Assert.assertEquals(2,result);
    }

    @Test
    public void testRemoveStudent2() {
        buildClassCourse.addStudent("hieu");
        buildClassCourse.addStudent("ha");
        buildClassCourse.addStudent("linh");
        buildClassCourse.removeStudent("ha");
        String[] arr = new String[]{"hieu","linh"};
        boolean result = arr.equals(buildClassCourse.getStudents());
        Assert.assertTrue(result);

    }


}