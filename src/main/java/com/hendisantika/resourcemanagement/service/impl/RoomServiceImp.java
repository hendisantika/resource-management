package com.hendisantika.resourcemanagement.service.impl;

import com.hendisantika.resourcemanagement.domain.Room;
import com.hendisantika.resourcemanagement.repository.BuildingRepository;
import com.hendisantika.resourcemanagement.repository.RoomRepository;
import com.hendisantika.resourcemanagement.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
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
 * Time: 05:59
 */
@Service
@Transactional
public class RoomServiceImp implements RoomService {

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    BuildingRepository buildingRepository;

    @Override
    public void add(Room room) {
//		Building b = buildingRepository.findOne(room.getBuilding().getId());
//		if(b == null){
//			b = new Building();
//			b.setName("");
//			b.setLstRoomInBuilding(new ArrayList<Room>());
//		}
//		b.getLstRoomInBuilding().add(room);
        roomRepository.save(room);
    }

    @Override
    public void edit(Room room) {
        // TODO Auto-generated method stub
        roomRepository.save(room);
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        roomRepository.deleteById(id);
    }

    @Override
    public Room getDetail(int id) {
        // TODO Auto-generated method stub
        return roomRepository.findById(id).get();
    }

    @Override
    public List<Room> getAllList() {
        // TODO Auto-generated method stub
        return (List<Room>) roomRepository.findAll();
    }

}

