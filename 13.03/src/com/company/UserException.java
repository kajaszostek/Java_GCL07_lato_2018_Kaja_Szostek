package com.company;

/**
 * Created by kszostek on 2018-03-13.
 */
public class UserException extends ChatException {

    public void UserAddException()throws ChatException
    {
        System.out.println("Podany uzytkownik istnieje");
        throw new ChatException();
    }
}
