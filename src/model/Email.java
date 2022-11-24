package model;

import java.util.regex.Pattern;

public class Email {
    
    private final String email;

    public Email(String email){
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
