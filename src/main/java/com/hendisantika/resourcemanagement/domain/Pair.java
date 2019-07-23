package com.hendisantika.resourcemanagement.domain;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : resource-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-24
 * Time: 06:35
 */
@Data
public class Pair<K, V> {
    K key;
    V value;
}
