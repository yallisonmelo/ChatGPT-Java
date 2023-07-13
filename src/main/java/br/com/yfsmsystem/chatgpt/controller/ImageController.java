package br.com.yfsmsystem.chatgpt.controller;

import br.com.yfsmsystem.chatgpt.model.image.ImageRequest;
import br.com.yfsmsystem.chatgpt.model.image.ResponseImage;
import br.com.yfsmsystem.chatgpt.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.apache.hc.core5.http.ParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class ImageController {

    private final ImageService imageService;

    @PostMapping("/image")
    public ResponseEntity<ResponseImage> sendQuestionGptIntegration(@RequestBody ImageRequest input) throws IOException, ParseException {
        return ResponseEntity.status(HttpStatus.OK)
                .body(imageService.sendRequestImage(input));
    }

}
