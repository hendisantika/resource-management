package com.hendisantika.resourcemanagement.service;

import com.hendisantika.resourcemanagement.domain.Category;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : resource-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-25
 * Time: 07:03
 */
public interface CategoryService {

    List<Category> getCategories();

    Category getCategory(String name);

    Category getCategory(Integer id);
}