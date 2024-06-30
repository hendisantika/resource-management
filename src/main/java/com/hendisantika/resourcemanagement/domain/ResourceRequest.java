package com.hendisantika.resourcemanagement.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : resource-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-24
 * Time: 06:35
 */
@Entity
@Data
public class ResourceRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @OneToOne(fetch = FetchType.EAGER)
    Room room;

    @OneToOne(fetch = FetchType.EAGER)
    Item item;

    @OneToOne(fetch = FetchType.EAGER)
    Member member;

    Date requestdate;

    Date completiondate;
}
