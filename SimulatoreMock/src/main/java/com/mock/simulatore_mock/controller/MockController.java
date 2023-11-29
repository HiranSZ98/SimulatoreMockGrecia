package com.mock.simulatore_mock.controller;




import com.mock.simulatore_mock.models.MessageWIMCross;
import com.mock.simulatore_mock.service.MockService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@Slf4j
@RestController
@RequestMapping("/api/vehicles")
public class MockController {
    private final MockService service;

    @Autowired
    public MockController(MockService service) {
        this.service = service;
    }

    @GetMapping("/list")
    public MessageWIMCross findDate(
            @RequestParam(value = "from") String from,
            @RequestParam(value = "to") String to,
            @RequestParam(value = "lane") String lane,
            @RequestParam(value = "limit") String limit){
        log.info("request parameter works");

        return null;

    }

    @GetMapping("/image/0000000")
    public MessageWIMCross findImage( @RequestParam(value = "url") String url) throws IOException {
       return service.findImage(url);
    }

    @GetMapping("/findAll")
    public MessageWIMCross findAll() throws IOException {
        return service.findAll();
    }




}
