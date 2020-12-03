package DAO;

import Model.UserData;

import java.util.ArrayList;
import java.util.List;

public class LocalDataBase {

    public List<UserData> userDataList = new ArrayList<UserData>();

    public void Add(UserData _userData){
        userDataList.add(_userData);
    }

    public UserData Get(int _id){

        return userDataList.get(_id);

    }

}
