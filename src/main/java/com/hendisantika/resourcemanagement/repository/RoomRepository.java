package com.hendisantika.resourcemanagement.repository;

import com.hendisantika.resourcemanagement.domain.Room;
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
 * Time: 06:59
 */
public interface RoomRepository extends CrudRepository<Room, Integer> {
    @Query("SELECT b FROM Room b WHERE b.name = :name")
    Room findByRoomName(@Param("name") String name);
}
