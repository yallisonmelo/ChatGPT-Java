package br.com.yfsmsystem.chatgpt.model.question.response;

import lombok.Data;

@Data
public class Usage {

    public int prompt_tokens;
    public int completion_tokens;
    public int total_tokens;
}
