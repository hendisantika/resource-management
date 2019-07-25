package com.hendisantika.resourcemanagement.service.impl;

import com.hendisantika.resourcemanagement.domain.Category;
import com.hendisantika.resourcemanagement.repository.CategoryRepository;
import com.hendisantika.resourcemanagement.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : resource-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-26
 * Time: 05:48
 */

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getCategories() {
        List<Category> lst = new ArrayList<Category>();
        for (Category c : categoryRepository.findAll()) {
            lst.add(c);
        }
        return lst;
    }

    public Category getCategory(String name) {
        return categoryRepository.getCategoryByName(name);
    }

    public Category getCategory(Integer id) {
        return categoryRepository.findById(id).get();
    }

}
