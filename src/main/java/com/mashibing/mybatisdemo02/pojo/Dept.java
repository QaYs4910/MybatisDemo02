package com.mashibing.mybatisdemo02.pojo;

import java.util.List;

public class Dept {

    private Integer deptid;

    private String dname;

    private String ddesc;

    private List<Emp> emps;

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDdesc() {
        return ddesc;
    }

    public void setDdesc(String ddesc) {
        this.ddesc = ddesc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptid=" + deptid +
                ", dname='" + dname + '\'' +
                ", ddesc='" + ddesc + '\'' +
                ", emps=" + emps +
                '}';
    }
}
