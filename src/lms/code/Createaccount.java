/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms.code;

import lms.project.Date;

/**
 *
 * @author f2018266166
 */
public class Createaccount {
 private String createname,createusername,createpassword;
 private Date DOB;
 public Createaccount()
 {
     createname=createusername=createpassword="";
     DOB=new Date();
 }

   
    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname;
    }

    public String getCreateusername() {
        return createusername;
    }

    public void setCreateusername(String createusername) {
        this.createusername = createusername;
    }

    public String getCreatepassword() {
        return createpassword;
    }

    public void setCreatepassword(String createpassword) {
        this.createpassword = createpassword;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public Createaccount(String createname, String createusername, String createpassword, Date DOB) {
        this.createname = createname;
        this.createusername = createusername;
        this.createpassword = createpassword;
        this.DOB = DOB;
    }
     @Override
    public String toString() {
        return "Createaccount{" + "createname=" + createname + ", createusername=" + createusername + ", createpassword=" + createpassword + ", DOB=" + DOB + '}';
    }

}
