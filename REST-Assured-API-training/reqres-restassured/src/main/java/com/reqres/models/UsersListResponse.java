package com.reqres.models;

import java.util.List;

public class UsersListResponse {
    private List<User> data;
    private Support support;

    public List<User> getData() { return data; }
    public void setData(List<User> data) { this.data = data; }
    public Support getSupport() { return support; }
    public void setSupport(Support support) { this.support = support; }
}
