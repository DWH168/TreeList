package com.Tree.ListDemo;

//列表项类
public class TreeData {
    private String  name,code,code_id;
    private Boolean hasChild;
    private int Level;
    //               名字  当前的ID 上一级的ID 层级  是否可以展开
    public TreeData(String name,String code ,String code_id ,int Level,Boolean hasChild)
    {
        this.name=name;
        this.code=code;
        this.code_id=code_id;
        this.Level=Level;
        this.hasChild=hasChild;
    }
    public int getLevel() {
        return Level;
    }

    public Boolean getHasChild() {
        return hasChild;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getCode_id() {
        return code_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCode_id(String code_id) {
        this.code_id = code_id;
    }

    public void setHasChild(Boolean hasChild) {
        this.hasChild = hasChild;
    }

    public void setLevel(int level) {
        Level = level;
    }
}
