package org.example.pattern.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class Database {
    private static final String TAG = "Database";

    private Database() { }

    public static Properties getProperties(String dbName) {
//        String fileName = dbName + ".txt"; // and
        String fileName = "raw/" + dbName + ".txt";
        Properties prop = new Properties();
        try {
//            prop.load(new FileInputStream(fileName));
//            InputStream is = context.getResources().openRawResource(R.raw.maildata); // and
//            prop.load(is); // and

            String filePath = Objects.requireNonNull(Database.class.getClassLoader().getResource(fileName)).getPath();
            InputStream is = new FileInputStream(filePath);
            prop.load(is);
        }
        catch (IOException e) {
            System.out.println("Warning: " + fileName + "is not found.");
        }

        return prop;
    }
}
