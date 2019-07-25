package com.hendisantika.resourcemanagement.service;

import com.hendisantika.resourcemanagement.domain.Building;
import com.hendisantika.resourcemanagement.domain.Pair;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : resource-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-25
 * Time: 07:02
 */
public interface BuildingService {
    void add(Building building);

    void edit(Building building);

    void delete(int id);

    Building getDetail(int id);

    List<Building> getAllList();

    Map<String, String> getOptionList();

    Building validateMember(Building building);

    List<Pair<Integer, String>> Rooms(Integer buildingId);
}