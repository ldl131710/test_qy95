package aaa.test_git2.entity;

/**
 * 部门管理实体类
 */
public class Dept {
    private Long deptno;
    private String dname;
    private String loc;
    private String address;
    private String age;


    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
