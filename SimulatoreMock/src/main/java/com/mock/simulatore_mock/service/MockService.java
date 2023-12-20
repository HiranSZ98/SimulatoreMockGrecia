package com.mock.simulatore_mock.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mock.simulatore_mock.models.MessageWIMCross;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.io.InputStream;

@Slf4j
@Service

public class MockService {


    public MessageWIMCross findAll() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStream = new ClassPathResource("MockData/SPA-GREECE-ExampleResponse.json").getInputStream();

        return objectMapper.readValue(inputStream, MessageWIMCross.class);
    }

    public MessageWIMCross findImage(String url) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStream = new ClassPathResource("MockData/SPA-GREECE-ExampleResponse.json").getInputStream();
        JsonNode rootNode = objectMapper.readTree(inputStream);
        var imageUrl = extractImageUrl(rootNode, url);
        if(imageUrl != null) {
            log.info("ImageUrl: " + imageUrl);
        }
        return null;
    }

    private String extractImageUrl(JsonNode rootNode, String userTag) {
        JsonNode vehiclesNode = rootNode.path("data").path("vehicles");
        for (JsonNode vehicleNode : vehiclesNode) {
            JsonNode imagesNode = vehicleNode.path("images");
            for(JsonNode imageNode : imagesNode) {
                String tag = imageNode.path("tag").asText();
                if (tag.equals(userTag)) {
                    return imageNode.path("url").asText();
                }
            }
        }
        return null;
    }



}




