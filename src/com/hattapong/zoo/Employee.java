package com.hattapong.zoo;

/**
 * Created by Hattapong on 7/12/2016.
 */
public class Employee {
    protected String fname;
    protected String lname;
    protected String position;

    public Employee(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }


}
