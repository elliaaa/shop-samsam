package com.ohgiraffers.samsam.login.model.service;

public interface loginService {
    boolean isLogin(String id, String pwd);

    String findAccountRoll(String username);

    int findSeq(String username);
}
