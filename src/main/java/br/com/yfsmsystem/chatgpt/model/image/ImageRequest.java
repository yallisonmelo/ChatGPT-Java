package br.com.yfsmsystem.chatgpt.model.image;

import br.com.yfsmsystem.chatgpt.model.ChatGptRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ImageRequest implements ChatGptRequest {

    private  String prompt;
    private int n;
    private String size;
}
