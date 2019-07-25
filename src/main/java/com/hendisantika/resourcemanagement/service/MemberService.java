package com.hendisantika.resourcemanagement.service;

import com.hendisantika.resourcemanagement.domain.Member;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : resource-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-25
 * Time: 07:03
 */
public interface MemberService {
    void add(Member member);

    void edit(Member member);

    void delete(int memberId);

    Member getMember(int memberId);

    List<Member> getAllMember();

    Member validateMember(Member member);

    boolean checkUsername(String username);

    String encryptPass(String password);

    boolean checkPassword(String password, String encodedPassword);

    List<Member> getMemberByName(String name);
}