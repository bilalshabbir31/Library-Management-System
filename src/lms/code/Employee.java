/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms.code;

/**
 *
 * @author f2018266166
 */
public class Employee {
private String Empname;
private int Empmobilenumber,Empid,EmpCNIC;
public Employee()
{
    Empname="";
    Empmobilenumber=Empid=EmpCNIC=0;
}
    public String getEmpname() {
        return Empname;
    }

    public void setEmpname(String Empname) {
        this.Empname = Empname;
    }

    public int getEmpmobilenumber() {
        return Empmobilenumber;
    }

    public void setEmpmobilenumber(int Empmobilenumber) {
        this.Empmobilenumber = Empmobilenumber;
    }

    public int getEmpid() {
        return Empid;
    }

    public void setEmpid(int Empid) {
        this.Empid = Empid;
    }

    public int getEmpCNIC() {
        return EmpCNIC;
    }

    public void setEmpCNIC(int EmpCNIC) {
        this.EmpCNIC = EmpCNIC;
    }

    public Employee(String Empname, int Empmobilenumber, int Empid, int EmpCNIC) {
        this.Empname = Empname;
        this.Empmobilenumber = Empmobilenumber;
        this.Empid = Empid;
        this.EmpCNIC = EmpCNIC;
    }
    
    void Employee_Display()
    {
        System.out.println("Employee Id:"+Empid);
        System.out.println("Employee Name:"+Empname);
        System.out.println("Employee CNIC:"+EmpCNIC);
        System.out.println("Employee Phonenumber:"+Empmobilenumber);
    }
}
