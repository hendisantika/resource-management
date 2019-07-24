package com.hendisantika.resourcemanagement.repository;

import com.hendisantika.resourcemanagement.domain.ResourceRequest;
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
 * Time: 06:58
 */
public interface RequestRepository extends CrudRepository<ResourceRequest, Integer> {
    @Query("SELECT r FROM ResourceRequest r WHERE r.item.id = :item_id")
    ResourceRequest findByItemId(@Param("item_id") Long itemId);
}
