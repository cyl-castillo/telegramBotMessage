package com.example.telegrambotmessage.Services;

import com.example.telegrambotmessage.models.Message;
import org.springframework.stereotype.Service;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

@Service
public class SendMessage {

    public void sendToTelegram(Message message) {

    String urlString = "https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=%s";

    String apiToken = "5231417511:AAFAkucB1sYYrUnlYSLZ0hUG_Rji29w9FZg";

    //Add chatId (given chatId is fake)
    String chatId = "-501296033";
    String text = message.toString();

    urlString = String.format(urlString, apiToken, chatId, text);

        try {
        URL url = new URL(urlString);
        URLConnection conn = url.openConnection();
        InputStream is = new BufferedInputStream(conn.getInputStream());
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
