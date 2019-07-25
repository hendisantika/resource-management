package com.hendisantika.resourcemanagement.service;

import com.hendisantika.resourcemanagement.domain.Room;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : resource-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-25
 * Time: 07:04
 */
public interface RoomService {
    void add(Room room);

    void edit(Room room);

    void delete(int id);

    Room getDetail(int id);

    List<Room> getAllList();
}
