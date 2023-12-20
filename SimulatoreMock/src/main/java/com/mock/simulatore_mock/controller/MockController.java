package com.mock.simulatore_mock.controller;




import com.mock.simulatore_mock.models.MessageWIMCross;
import com.mock.simulatore_mock.service.MockService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


@Slf4j
@RestController
@RequestMapping("/api")
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

    @GetMapping("/vehicles/image/0000000/{id}")
    public MessageWIMCross findImage(HttpServletRequest request) throws IOException {
        var url = request.getRequestURL().toString();
       return service.findImage(url);
    }

    @GetMapping("/1.0/vehicles/findAll")
    public MessageWIMCross findAll() throws IOException {
        return service.findAll();
    }






}
