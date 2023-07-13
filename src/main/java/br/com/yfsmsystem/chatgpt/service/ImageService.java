package br.com.yfsmsystem.chatgpt.service;

import br.com.yfsmsystem.chatgpt.model.image.ImageRequest;
import br.com.yfsmsystem.chatgpt.model.image.ResponseImage;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

public interface ImageService {

    ResponseImage sendRequestImage(ImageRequest request) throws IOException, ParseException;
}
