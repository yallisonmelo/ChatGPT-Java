package br.com.yfsmsystem.chatgpt.model.image;

import br.com.yfsmsystem.chatgpt.model.ChatGptResponse;

import java.util.ArrayList;


public class ResponseImage implements ChatGptResponse {
    public int created;
    public ArrayList<Image> data;
}
