package br.com.yfsmsystem.chatgpt.model.question.response;

import lombok.Data;

@Data
public class Message {
    public String role;
    public String content;
}
