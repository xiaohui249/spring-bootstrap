package com.sean.spring.jdbctemplate.entity;

/**
 * User对象
 *
 * @author xiaoh
 * @date 2019/9/2
 */
public class User {
    private int id;
    private String name;
    private String icon;
    private int sex;
    private String birthday;
    private int status;
    private long registerTs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getRegisterTs() {
        return registerTs;
    }

    public void setRegisterTs(long registerTs) {
        this.registerTs = registerTs;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", sex=" + sex +
                ", birthday='" + birthday + '\'' +
                ", status=" + status +
                '}';
    }
}
