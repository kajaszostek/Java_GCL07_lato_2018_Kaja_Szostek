package com.company;

import java.util.Calendar;

/**
 * Created by kszostek on 2018-03-13.
 */
public class User {

   private long id;
    private String name;
    private long cretatedAt;

    User(String name)
    {
        Calendar calendar = Calendar.getInstance();

        this.name=name;
        this.cretatedAt = calendar.get(Calendar.MILLISECOND);
    }

    String getName()
    {
        return this.name;
    }

    void setId(long id)
    {
        this.id=id;
    }

    long getId()
    {
        return this.id;
    }
}
