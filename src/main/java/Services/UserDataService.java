package Services;

import DAO.LocalDataBase;
import Model.UserData;

public class UserDataService {

    public void Create(String _name, String _sourname, String _address, String _zipCode, String _city, String _telNumber){

        UserData userData = new UserData(_name, _sourname, _address, _zipCode, _city, _telNumber);

    }



}
