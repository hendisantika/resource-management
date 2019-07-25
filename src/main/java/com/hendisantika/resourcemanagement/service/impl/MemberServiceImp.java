package com.hendisantika.resourcemanagement.service.impl;

import com.hendisantika.resourcemanagement.domain.Member;
import com.hendisantika.resourcemanagement.domain.Role;
import com.hendisantika.resourcemanagement.repository.MemberRepository;
import com.hendisantika.resourcemanagement.repository.RoleRepository;
import com.hendisantika.resourcemanagement.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : resource-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-26
 * Time: 05:50
 */
@Service
@Transactional
public class MemberServiceImp implements MemberService {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    RoleRepository roleRepository;

    @PreAuthorize(value = "hasRole('ADMIN')")
    public void add(Member member) {

        Role role = roleRepository.getRoleByName("guest");
        member.setRole(role);
        memberRepository.save(member);

    }

    @PreAuthorize("hasRole('ADMIN') or hasRole('USER')")
    public void edit(Member member) {
        // TODO Auto-generated method stub

    }

    @PreAuthorize(value = "hasRole('ADMIN')")
    public void delete(int memberId) {
        memberRepository.deleteById(memberId);

    }

    @PreAuthorize(value = "hasRole('ADMIN')")
    public Member getMember(int memberId) {
        return memberRepository.findById(memberId).get();//.getMemberById(memberId);
    }

    @PreAuthorize(value = "hasRole('ADMIN')")
    public List<Member> getAllMember() {
        return (List<Member>) memberRepository.findAll();
    }

    public boolean checkUsername(String username) {
        return (memberRepository.getMemberByUsername(username) != null);

    }

    public String encryptPass(String password) {
        BCryptPasswordEncoder pass1 = new BCryptPasswordEncoder();
        return pass1.encode(password);
    }

    public boolean checkPassword(String password, String encodedPassword) {
        BCryptPasswordEncoder passEncoder = new BCryptPasswordEncoder();
        return passEncoder.matches(password, encodedPassword);
    }

    @Override
    public Member validateMember(Member member) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Member> getMemberByName(String name) {
        return memberRepository.getMemberByName(name);
    }

}