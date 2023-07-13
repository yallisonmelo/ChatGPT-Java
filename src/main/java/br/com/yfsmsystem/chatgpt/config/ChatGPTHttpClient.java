package br.com.yfsmsystem.chatgpt.config;

import br.com.yfsmsystem.chatgpt.exceptions.IntegrationException;
import br.com.yfsmsystem.chatgpt.model.ChatGptRequest;
import br.com.yfsmsystem.chatgpt.model.ChatGptResponse;
import br.com.yfsmsystem.chatgpt.model.question.response.ResponseQuestion;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpHeaders;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class ChatGPTHttpClient {

    @Value("${chatgpt.apiKey}")
    private String apiKey;

    private final CloseableHttpClient httpClient;
    private final ObjectMapper objectMapper;

    public ChatGptResponse callQuestionChatGpt(ChatGptRequest request, String endpoint) throws IOException, ParseException {
        var httpPost = new HttpPost(endpoint);
        httpPost.setHeader(HttpHeaders.AUTHORIZATION, "Bearer " + apiKey);
        httpPost.setHeader(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.getMimeType());

        var requestBody = objectMapper.writeValueAsString(request);
        var requestEntity = new StringEntity(requestBody, ContentType.APPLICATION_JSON);
        httpPost.setEntity(requestEntity);

        try (CloseableHttpResponse response = httpClient.execute(httpPost)) {
            if(response.getCode() != 200){
                throw new IntegrationException();
            }
            var responseEntity = response.getEntity();
            if (responseEntity != null) {
                var responseBody = EntityUtils.toString(responseEntity);
                return objectMapper.readValue(responseBody, ResponseQuestion.class);
            }
        }catch (Exception ex){
            throw  ex;
        }
        return null;
    }
}
