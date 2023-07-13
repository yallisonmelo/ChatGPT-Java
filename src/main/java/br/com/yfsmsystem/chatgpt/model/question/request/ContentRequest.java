package br.com.yfsmsystem.chatgpt.model.question.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContentRequest {

    private String role;
    private String content;
}
