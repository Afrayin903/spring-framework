package com.cydeo.proxy;

import com.cydeo.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Push")// Use @qualifier annotation(give implementation name as @qualifier("xxxx") if neccessary) if there are 2 implementation for same object
public class CommentPushNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment " + comment.getText());
    }
}
