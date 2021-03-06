package bank;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.json.simple.JSONObject;

/**
 *
 * @author adamstreich
 */
public class Password {
    String pword;

    public Password(String pw) {
        this.pword = pw;
        
        
    }

    public String getPword() {
        return this.pword;
    }
    
    public static Password createPassword(String pw){
        Password rt;
        if(pw.length()>0 && pw.length()<9 && (-1 == pw.indexOf(' '))){
            rt = new Password(pw);
        }else{
            throw new IllegalArgumentException("Does not fit password requirements");
        }
        return rt;
    }
    
    
    public boolean equals(Object o) { 
  
        // If the object is compared with itself then return true   
        if (o == this) { 
            return true; 
        }
        Password ot = (Password) o;
        return this.pword.equals(ot.pword);
    }


    public JSONObject toJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("pword",pword);
        return jsonObject;
    }

    public static Password fromJSON(JSONObject jsonObject){
        String pword = (String) jsonObject.get("pword");
        return new Password(pword);
    }
}
