package br.com.yfsmsystem.chatgpt.service.impl;

import br.com.yfsmsystem.chatgpt.config.ChatGPTHttpClient;
import br.com.yfsmsystem.chatgpt.model.image.ImageRequest;
import br.com.yfsmsystem.chatgpt.model.image.ResponseImage;
import br.com.yfsmsystem.chatgpt.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.apache.hc.core5.http.ParseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {

    @Value("${chatgpt.endpoint.image}")
    private String endpoint;


    private final ChatGPTHttpClient chatGPTHttpClient;

    public ResponseImage sendRequestImage(ImageRequest request) throws IOException, ParseException {
        return (ResponseImage) chatGPTHttpClient.callQuestionChatGpt(request,endpoint);
    }
}
