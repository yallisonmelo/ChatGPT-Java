package br.com.yfsmsystem.chatgpt.model.question.response;

import lombok.Data;

@Data

public class Choice {

    public Message message;
    public String finish_reason;
    public int index;
}
