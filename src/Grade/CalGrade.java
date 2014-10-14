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
public class CalGrade {

    // field
    public String[] member;
    public String[] id;
    public String[] midterm;
    public String[] finalterm;
    public int[] sum;
    public char[] grade;
    private int max;
    private int min;
    private int avg;

    //constructor
    public CalGrade(Student s) {
        max = 0;
        min = 0;
        avg = 0;
        this.id = new String[s.getLength()];
        this.midterm = new String[s.getLength()];
        this.finalterm = new String[s.getLength()];
        this.sum = new int[s.getLength()];
        this.member = new String[s.getLength()];
        this.grade = new char[s.getLength()];
        System.arraycopy(s.member, 0, this.member, 0, s.getLength());
    }

    // method
    public void printGrade() {
        int[] mt = new int[member.length];
        int[] ft = new int[member.length];
        // Sub ID : Midterm : Finalterm
        for (int i = 0; i < member.length; i++) {
            String[] temp = member[i].split(":");
            id[i] = temp[0];
            midterm[i] = temp[1];
            finalterm[i] = temp[2];
            mt[i] = Integer.parseInt(midterm[i]);
            ft[i] = Integer.parseInt(finalterm[i]);
        }
        // Sum Midterm & Finalterm
        for (int i = 0; i < member.length; i++) {
            sum[i] += mt[i] + ft[i];
        }
        // search Average
        for(int i = 0;i < member.length;i++){
            avg = sum[i];
        }
        avg = avg / member.length;
        // search Max
        for (int i = 0; i < member.length; i++) {
            max = sum[i];
            if (sum[i] > max) {
                max = sum[i];
            }
        }
        // search Min
        for (int i = 0; i < member.length; i++) {
            min = sum[i];
            if (sum[i] < min) {
                min = sum[i];
            }
        }
        // Set Grade
        for (int i = 0; i < member.length; i++) {
            if ((max + avg) / 2 <= sum[i] && sum[i] <= max) {
                grade[i] = 'A';
            }else if(avg <= sum[i] && sum[i] < (max + avg) / 2 ){
                grade[i] = 'B';
            }else if((avg+min) / 2 <= sum[i] && sum[i] < avg){
                grade[i] = 'C';
            }else if(min <= sum[i] && sum[i] < (avg+min) / 2){
                grade[i] = 'D';
            }else{
                grade[i] = 'F';
            }
        }
        // print
        for(int i = 0;i < member.length;i++){
            System.out.println("ID : " + id[i]);
            System.out.println("Grade : " + grade[i]);
        }
    }

}
