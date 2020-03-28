/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms.project;

/**
 *
 * @author 
 */
public class Date {
  private String month,day,year;
  public Date()
  {
      month=day=year="";
  }

    public Date(String month, String day, String year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return month+"/"+day+"/"+year;
    }
  
    public void display()
    {
        System.out.println("Date:"+month+"/"+day+"/"+year);
    }
}
