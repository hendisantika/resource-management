package com.hendisantika.resourcemanagement.repository;

import com.hendisantika.resourcemanagement.domain.Item;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : resource-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-25
 * Time: 06:57
 */
public interface ItemsRepository extends CrudRepository<Item, Long> {
}
