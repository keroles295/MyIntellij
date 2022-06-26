package com.syntax.class24;

public class DatabaseTester {
    public static void main(String[] args) {
        Database [] databases={new Informix(), new MySQServer()};
        for(Database dt:databases){
            dt.closeTheDatabase();
            dt.open();
            dt.readData();
            dt.writeData();
        }
    }
}
