package lk.egreen.booking.server.utils;

import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.Date;
import java.util.Random;

/**
 * Created by dew on 3/1/16.
 */
@Component
public class KeyGenrator {


    public String getID(String id){
        id += new Date().getTime() + "";
        Hashids hashids = new Hashids(id);
        String hexaid = hashids.encodeHex(String.format("%040x", new BigInteger(1, id.getBytes())));
        String newid = hexaid + "" + randomString(5);
        return newid;
    }


    private String randomString(int len) {
        final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }
}
