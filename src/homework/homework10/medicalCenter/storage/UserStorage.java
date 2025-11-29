package homework.homework10.medicalCenter.storage;

import homework.homework10.medicalCenter.model.User;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class UserStorage implements Serializable {
    private Map<String, User> userMap = new HashMap<>();

    public void register(User user ){
        userMap.put(user.getEmail(),user);
    }

    public User getByEmail(String email){
        return userMap.get(email);
    }

    public boolean login(String email,String password){
        User user = userMap.get(email);
        return user != null && user.getPassword().equals(password);
    }

    public void printAllUsers(){
        for(User user : userMap.values()){
            System.out.println(user);
        }
    }

    public void removeUserByEmail(String userEmail){
        userMap.remove(userEmail);
    }
}
