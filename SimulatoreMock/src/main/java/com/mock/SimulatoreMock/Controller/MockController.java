package com.mock.SimulatoreMock.Controller;



import com.fasterxml.jackson.databind.ObjectMapper;

import com.mock.SimulatoreMock.Models.MessageWIMCross;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;


@RestController
@RequestMapping("/api/vehicles")
public class MockController {


    @GetMapping("/list")
    public MessageWIMCross findAll() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStream = new ClassPathResource("MockData/SPA-GREECE-ExampleResponse.json").getInputStream();

        return objectMapper.readValue(inputStream, MessageWIMCross.class);

    }


}
