package br.com.yfsmsystem.chatgpt.model.question.request;

import br.com.yfsmsystem.chatgpt.model.ChatGptRequest;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class QuestionRequest implements ChatGptRequest {

    private String model;
    private List<ContentRequest> messages;
    private String temperature;
}
