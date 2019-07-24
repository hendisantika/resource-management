package com.hendisantika.resourcemanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by IntelliJ IDEA.
 * Project : resource-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-25
 * Time: 06:56
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No Record Found!!")
public class ResponseStatusException extends RuntimeException {
}
