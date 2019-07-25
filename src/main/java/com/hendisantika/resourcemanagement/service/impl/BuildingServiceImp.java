package com.hendisantika.resourcemanagement.service.impl;

import com.hendisantika.resourcemanagement.domain.Building;
import com.hendisantika.resourcemanagement.domain.Pair;
import com.hendisantika.resourcemanagement.domain.Room;
import com.hendisantika.resourcemanagement.repository.BuildingRepository;
import com.hendisantika.resourcemanagement.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : resource-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-26
 * Time: 05:45
 */
@Service
@Transactional
public class BuildingServiceImp implements BuildingService {

    @Autowired
    BuildingRepository buildingRepository;

    @Override
    public void add(Building building) {
        // TODO Auto-generated method stub
        buildingRepository.save(building);
    }


    @Override
    public void edit(Building building) {
        // TODO Auto-generated method stub
        buildingRepository.save(building);
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        buildingRepository.deleteById(id);
    }

    @Override
    public Building getDetail(int id) {
        // TODO Auto-generated method stub
        return buildingRepository.findById(id).get();
    }

    @Override
    public List<Building> getAllList() {
        // TODO Auto-generated method stub
        return (List<Building>) buildingRepository.findAll();
    }

    @Override
    public Map<String, String> getOptionList() {
        Map<String, String> map = new HashMap();//
        for (Building building : getAllList()) {
            map.put("" + building.getId(), building.getName());
        }
        return map;
    }

    @Override
    public Building validateMember(Building building) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public List<Pair<Integer, String>> Rooms(Integer buildingId) {
        List<Pair<Integer, String>> rooms = new ArrayList<Pair<Integer, String>>();
        Building b = buildingRepository.findById(buildingId).get();
        if (b != null) {
            for (Room r : b.getLstRoomInBuilding()) {
                rooms.add(new Pair(r.getId(), r.getName()));
            }
        }
        return rooms;
    }

}

