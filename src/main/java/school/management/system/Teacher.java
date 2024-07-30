package school.management.system;

/**
 * This class is responsible for keeping track of teacher
 * id, name and salary
 */

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * creates a new teacher object.
     * @param id id for teacher.
     * @param name name of teacher.
     * @param salary teacher salary.
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     *
     * @return the id of the teacher
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of teacher
     */

    public String getName() {
        return name;
    }

    /**
     *
     * @return salary of teacher
     */
    public int getSalary() {
        return salary;
    }

    /**
     * set the salary.
     * @param salary set Salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
    /**
     * Adds  to salaryEarned.
     * Removes from the total money earned by the school.
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }


    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                +" Total salary earned so far $"
                + salaryEarned;

}

}