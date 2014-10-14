package Grade;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class Student {

    // field
    public String[] member;
    public String line;

    public Student() {

    }

    // method
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("java StudentGrade ");
        line = sc.nextLine();
        member = line.split(" ");
    }

    public int getLength() {
        return member.length;
    }
}
