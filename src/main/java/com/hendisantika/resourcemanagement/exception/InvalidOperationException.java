package com.hendisantika.resourcemanagement.exception;

/**
 * Created by IntelliJ IDEA.
 * Project : resource-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-25
 * Time: 06:55
 */
public class InvalidOperationException extends RuntimeException {

    private static final long serialVersionUID = 9060751397339719682L;
    private String entityId;
    private String message = "The operation is invalid";

    public InvalidOperationException() {
    }

    public InvalidOperationException(String entityId, String message) {
        this.entityId = entityId;
        if (message != null) this.message = message;
    }

    public String getFullMessage() {
        return (message + entityId);
    }

    public String getEntityId() {
        return entityId;
    }

    @Override
    public String getLocalizedMessage() {
        return super.getLocalizedMessage();
    }


}