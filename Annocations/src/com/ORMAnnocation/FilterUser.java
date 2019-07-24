package com.ORMAnnocation;

//设置 User表的过滤条件

@Table("user")
public class FilterUser {

    @Column("id")
    private Integer id;

    @Column("name")
    private  String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column("email")
    private  String email;


}
