package com.hendisantika.resourcemanagement.service;

import com.hendisantika.resourcemanagement.domain.Item;
import com.hendisantika.resourcemanagement.domain.ResourceRequest;

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
public interface ResourcesService {

    Item addNewItem(Item item);

    List<Item> getItems(int numberOfItems);

    Item getById(Long id);

    ResourceRequest addNewRequest(Long itemId, String username);

    List<ResourceRequest> getResourceRequests();

    void grantRequestForRequestId(Integer requestId);

    void discardRequestForRequestId(Integer requestId);

}