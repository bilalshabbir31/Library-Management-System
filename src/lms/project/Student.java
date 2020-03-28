/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms.project;

/**
 *
 * @author f2018266166
 */
public class Student {
    private String nameofborrow,Stdname,Stdid,Stddepartment;
    private Date DOI,DOE;
    public Student()
    {
        nameofborrow=Stdname=Stdid=Stddepartment="";
        DOI=new Date();
        DOE=new Date();
    }

    public Student( String Stdid,String Stdname,String Stddepartment,String nameofborrow,Date DOI, Date DOE) {
        this.nameofborrow = nameofborrow;
        this.Stdname = Stdname;
        this.Stdid = Stdid;
        this.Stddepartment = Stddepartment;
        this.DOI = DOI;
        this.DOE = DOE;
    }

    public String getNameofborrow() {
        return nameofborrow;
    }

    public void setNameofborrow(String nameofborrow) {
        this.nameofborrow = nameofborrow;
    }

    public String getStdname() {
        return Stdname;
    }

    public void setStdname(String Stdname) {
        this.Stdname = Stdname;
    }

    public String getStdid() {
        return Stdid;
    }

    public void setStdid(String Stdid) {
        this.Stdid = Stdid;
    }

    public String getStddepartment() {
        return Stddepartment;
    }

    public void setStddepartment(String Stddepartment) {
        this.Stddepartment = Stddepartment;
    }

    public Date getDOI() {
        return DOI;
    }

    public void setDOI(Date DOI) {
        this.DOI = DOI;
    }

    public Date getDOE() {
        return DOE;
    }

    public void setDOE(Date DOE) {
        this.DOE = DOE;
    }

//    @Override
//    public String toString() {
//        return "Student{" + "nameofborrow=" + nameofborrow + ", Stdname=" + Stdname + ", Stdid=" + Stdid + ", Stddepartment=" + Stddepartment + ", DOI=" + DOI + ", DOE=" + DOE + '}';
//    }
    @Override
      public String toString() {
        return "id:"+Stdid+"Name:"+Stdname+"Student Department:"+Stddepartment+"Name of borrowBook:"+nameofborrow+"Date of Issue:"+DOI+"Date of End:"+DOE;
    }
    public void disp()
    {
         System.out.println("id"+Stdid);
        System.out.println("name"+Stdname);
        System.out.println("Stddepartment="+Stddepartment);
        System.out.println("nameofborrow"+nameofborrow);
        DOI.display();
        DOE.display();
    }
}
