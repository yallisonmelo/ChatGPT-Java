package br.com.yfsmsystem.chatgpt.model.question.response;

import br.com.yfsmsystem.chatgpt.model.ChatGptResponse;
import lombok.Data;

import java.util.ArrayList;
@Data
public class ResponseQuestion implements ChatGptResponse {

    public String id;
    public String object;
    public int created;
    public String model;
    public Usage usage;
    public ArrayList<Choice> choices;

}
