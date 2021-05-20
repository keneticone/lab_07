package pl.utp.programowanie.lab7;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeDecoderSingleton {

    private static ZipCodeDecoderSingleton INSTANCE = new ZipCodeDecoderSingleton();

    private Map<Integer, String> zipCodesMap;

    private ZipCodeDecoderSingleton(){
        zipCodesMap = downloadAllZipCodesFromDB();
    }

    public static ZipCodeDecoderSingleton getInstance() {
        return INSTANCE;
    }

    public String decodeZipcode(Integer zipcode){
        return zipCodesMap.get(zipcode);
    }

    private Map<Integer, String> downloadAllZipCodesFromDB() {

        // connecting and downloading zipcodes from db takes a lot of time...
        try {
            Thread.sleep(1000l);
        } catch (InterruptedException e) {
            // ignore
        }

        return new HashMap<Integer, String>() {{
            put(87100, "Toruń");
            put(61408, "Poznań");
            //.... many, many codes
            put(10101, "New YOrk");
        }};
    }
}
