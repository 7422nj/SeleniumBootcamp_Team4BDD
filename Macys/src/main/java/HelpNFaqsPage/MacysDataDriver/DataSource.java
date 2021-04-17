package HelpNFaqsPage.MacysDataDriver;

import databases.ConnectToSqlDB;
import utilities.DataReader;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static DataReader excelReader = new DataReader();

    // Insert Data from into Database
    public static void insertDataIntoDB(){
        List<String> list = getItemValue();
        connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToSqlTable(list,"MacysItems","items");
    }

    //  From Class/ Same class
    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("pritamdas15217@gmail.com");
        itemsList.add("Bootcamp404");
        itemsList.add("bootcamp");
        itemsList.add("Pritam");
        itemsList.add("Das");
        itemsList.add("pizzaguy@gmail.com");
        itemsList.add("return");
        return itemsList;
    }


    //Database
    public static List<String> getItemsListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("MacysItems", "items");
        return list;
    }

    //Excel file
    public static List<String> getItemsListFromExcel() throws Exception, IOException, SQLException, ClassNotFoundException{
        String path = "../BankOfAmerica/DataTest/BankOfAmerica.xlsx";
        String[] myStringArray = excelReader.fileReader2(path, 0);
        for(int i=1;i<myStringArray.length; i++)
            System.out.println(myStringArray[i] + " ");
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < myStringArray.length; i++) {
            list.add(myStringArray[i]);
        }
        return list;
    }

}