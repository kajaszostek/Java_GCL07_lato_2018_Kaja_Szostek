package com.company;

/**
 * Created by kszostek on 2018-03-13.
 */
public class UserRemoveException extends ChatException {

    void UserRemoveException() throws ChatException
    {
        System.out.println("Usuwanie nie powiodlo sie");
        throw new ChatException();
    }
}
