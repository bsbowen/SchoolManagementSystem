package school.management.system;

/**
 * this class is responsible for keeping track of students fees, names, id, grade
 */

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * the constructor is used to create a new student object by initializing the values
     * fees for every student is $30K per year.
     * fees paid initially is 0.
     * @param id id for student: unique
     * @param name name of student.
     * @param grade of the student.
     */

    public Student(int id, String name, int grade) {
        this.feesPaid =0;
        this.feesTotal = 30_000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }
    //not going to alter student name, id.

    /**
     * used to update the student's grade.
     * @param grade new grade of the student.
     * @param grade
     */

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * keep adding the fees to feedPaid field.
     * Add the fees to fees paid.
     * the school is going to receive funds from student
     * @param fees the fees that the student pays.
     */

    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }


    /**
     *
     * @return id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade (1-12) of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return total fees of the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees
     */

    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: "+name+
                " Total fees paid so far $"+ feesPaid;
    }
}