package com.hendisantika.resourcemanagement.repository;

import com.hendisantika.resourcemanagement.domain.Building;
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
 * Time: 06:56
 */
public interface BuildingRepository extends CrudRepository<Building, Integer> {
    @Query("SELECT b FROM Building b WHERE b.name = :name")
    Building findByBuildingName(@Param("name") String name);
}