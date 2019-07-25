package com.hendisantika.resourcemanagement.repository;

import com.hendisantika.resourcemanagement.domain.Member;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : resource-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-25
 * Time: 07:01
 */
public interface MemberRepository extends CrudRepository<Member, Integer> {

    @Query("select m from Member m where m.username = :username")
    Member getMemberByUsername(@Param("username") String username);

    @Query("select m from Member m where id = :memberId")
    Member getMemberById(@Param("memberId") int memberId);

    @Query("select m from Member m where username = :name")
    List<Member> getMemberByName(@Param("name") String name);
}
