package com.hendisantika.resourcemanagement.repository;

import com.hendisantika.resourcemanagement.domain.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by IntelliJ IDEA.
 * Project : resource-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-25
 * Time: 07:00
 */
public interface RoleRepository extends CrudRepository<Role, Integer> {
    @Query("select r from Role r where name=:name")
    Role getRoleByName(@Param("name") String name);
}
