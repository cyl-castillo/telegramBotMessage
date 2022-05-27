package com.example.telegrambotmessage.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Message implements Serializable {
    String fullName;
    String email;
    String phone;
    int range;
    String interestedIn;
    String message;



    public String toString(){
        return "Full Name: " + fullName + " " +
                "Email: " + email + " " +
                "Phone: " + phone + " " +
                "Range: " + range + " " +
                "Interest In: " + interestedIn + " " +
                "Message: " + message
                ;
    }

}
