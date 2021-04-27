package AccessoriesPage.VerizonDataDriver;

import common.WebAPI;
import databases.ConnectToSqlDB;
import utilities.DataReader;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSource extends WebAPI {

    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static DataReader excelReader = new DataReader();

    // Insert Data from into Database
    public static void insertDataIntoDB(){
        List<String> list = getItemValue();
        connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToSqlTable(list,"VerizonItems","items");
    }

    //  From Class/ Same class
    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("pritamdas15217@gmail.com");
        itemsList.add("Bootcamp404");
        itemsList.add("iPhone");
        itemsList.add("Pritam");
        itemsList.add("Das");
        itemsList.add("pizzaguy@gmail.com");
        itemsList.add("return");
        return itemsList;
    }


    //Database
    public static List<String> getItemsListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("VerizonItems", "items");
        return list;
    }
}
