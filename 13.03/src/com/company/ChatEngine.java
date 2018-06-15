package com.company;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Created by kszostek on 2018-03-13.
 */
public class ChatEngine extends  ChatException {

    HashMap <Integer, String> hashMap1 = new HashMap<>();
    HashMap <Integer, User> hashMap = new HashMap<>();
    Integer id=0;

    void addUser(User user) throws UserException
    {
        Iterator it = hashMap.entrySet().iterator();
        boolean check = false;

        for(HashMap.Entry<Integer,String> entry:hashMap1.entrySet())
        {
            String name = entry.getValue();

            if(name.equals(user.getName()))
            {
                UserException userException= new UserException();
                check=true;
               try{
                   userException.UserAddException();
               }
               catch(ChatException ce)
               {
                   System.out.println("Taki uzytkownik juz istnieje!");
               }
            }

        }

        if(check == false)
        {
            id++;
            hashMap1.put(id,user.getName());
            hashMap.put(id,user);
        }

    }

    void removeUser(long userId) throws UserRemoveException
    {
        if(userId==0)
        {
            return;
        }

        Iterator it = hashMap.entrySet().iterator();
        boolean check = false;

        for(HashMap.Entry<Integer,User> entry:hashMap.entrySet())
        {
            Integer id = entry.getKey();

            if(id.equals(userId))
            {
               hashMap.remove(userId);
               hashMap1.remove(userId);
               check=true;
            }

        }

        if(check==false)
        {
            UserRemoveException userRemoveException= new UserRemoveException();

            try{
                userRemoveException.UserRemoveException();
            }
            catch(ChatException ce)
            {

            }
        }
    }

    int getNumberOfUsers()
    {
        return  hashMap.size();
    }

    boolean hasUser(long userId)
    {
        return hashMap.containsKey(userId);
    }

    boolean hasUser(String userName)
    {
        return hashMap1.containsValue(userName);
    }

    void createBan(String userName)
    {
        boolean check = hasUser(userName);
        int k=0;

        if(check == true)
        {

            for(HashMap.Entry<Integer,User> entry:hashMap.entrySet())
            {
               String name = entry.getValue().getName();

                if(name.equals(userName))
                {
                   k=entry.getKey();
                }

            }
            hashMap1.remove(userName);
            hashMap.remove(k);
        }
    }

    void removeBan(String userName)
    {

    }
}
