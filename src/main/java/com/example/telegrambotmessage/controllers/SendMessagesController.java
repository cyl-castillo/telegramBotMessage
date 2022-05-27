package com.example.telegrambotmessage.controllers;

import com.example.telegrambotmessage.Services.SendMessage;
import com.example.telegrambotmessage.models.Message;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("telegram")
@CrossOrigin("*")
public class SendMessagesController {

    private final SendMessage sendMessage;

    public SendMessagesController(SendMessage sendMessage) {
        this.sendMessage = sendMessage;
    }


    @PostMapping("/send")
    public String sendMessageTest(@RequestBody Message message){
        sendMessage.sendToTelegram(message);
        return "Message Sended";
    }
}
