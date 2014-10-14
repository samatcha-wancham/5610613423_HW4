/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grade;

/**
 *
 * @author Administrator
 */
public class StudentGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s = new Student();
        s.Input();
        CalGrade cal = new CalGrade(s);
        cal.printGrade();
    }

}
