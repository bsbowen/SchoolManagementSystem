package school.management.system;

import java.util.List;

/**
 * many teacher, many students.
 * Implements teachers and students
 *
 */

public class School {
    private List<Teacher> teachers; //use list b/c we don't know how many teacher/students we will have
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;


    /**
     * new school object is created
     * @param teachers list of teachers in school
     * @param students list of students in school
     */

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    /**
     *
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     *Adds a teacher to the school.
     * @param teacher the teacher to be added
     */

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school.
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     *adds a student to the school
     * @param student the student to be added.
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money earned by the school.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school.
     * @param MoneyEarned money that is supposed to be  added.
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school which
     * is the salary given by the school to its teachers.
     * @param moneySpent the money spent by school.
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
    }











}
