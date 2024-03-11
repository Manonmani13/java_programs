package com.proretention.scrm.admin.services;

import com.proretention.commons.api.core.Constants;
import com.proretention.commons.api.util.Cryptography;
import org.joda.time.Instant;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vanarajm on 13/2/17.
 */
public class Test {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;


    public static void  main(String args[]){
        Map<String, Object> claims = new HashMap<String, Object>();
        claims.put(Constants.EXTERNAL_USER_IDENTIFIER, true);
        claims.put(Constants.USER_ID_IDENTIFIER, 68);
        claims.put(Constants.ORGANIZATION_ID_IDENTIFIER, 5);
        claims.put(Constants.USER_TYPE_IDENTIFIER, "staff");
        claims.put(Constants.ADMIN_IDENTIFIER, true);
        claims.put(Constants.ORGANIZATION_TYPE_IDENTIFIER, "free");
        long expiry = new Instant().getMillis() + 63113904000l;
        claims.put(Constants.EMAIL_ID_IDENTIFIER, "manuel@minglebox.com");
        claims.put(Constants.TOKEN_EXPIRATION_IDENTIFIER, expiry);
        System.out.println(Cryptography.signJWT(claims, "d74a3828c2cc896f73d06f8843b7712e"));
        Map<String,Object> numbers=new HashMap<>();
        numbers.put("0","Zero");
        numbers.put("1","One");
        numbers.put("2","Two");
        numbers.put("3","Three");
        numbers.put("4","Four");
        numbers.put("5","Five");
        numbers.put("6","Six");
        numbers.put("7","Seven");
        numbers.put("8","Eight");
        numbers.put("9","nine");
        Map<String,Object> tens=new HashMap<>();
        numbers.put("10","Zero");
        numbers.put("1","Ten");
        numbers.put("2","Twenty");
        numbers.put("3","Thirty");
        numbers.put("4","Fourty");
        numbers.put("5","Fivty");
        numbers.put("6","Sixty");
        numbers.put("7","Seventy");
        numbers.put("8","Eighty");
        numbers.put("9","ninety");
        Map<String,Object> format=new HashMap<>();
        format.put("0","Five");
        format.put("1","Ten");
        format.put("2","Hundred");
        format.put("3","Thousand");
        String n="1332";
        for(int i=0;i<n.length();i++)
        {
            if(i==0)
            System.out.print(numbers.get(Character.toString(n.charAt(i))));
            else {
                if(i==1)
                    System.out.print(" "+format.get(Character.toString(n.charAt(n.length()-1)))+" "+numbers.get(Character.toString(n.charAt(i))));
                else
                    System.out.print(" "+numbers.get(Character.toString(n.charAt(i))));

            }
        }
    }
}
