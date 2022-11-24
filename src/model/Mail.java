package model;

import java.util.regex.Pattern;

public class Mail {
    
    private final String email;

    public Mail(String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
    public String getDomain() {
        return email.split("@")[1];
    }
    
    public boolean isEmail(){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
        return pattern.matcher(email).matches();
    } 
}
