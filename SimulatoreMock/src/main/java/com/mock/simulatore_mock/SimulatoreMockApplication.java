package com.mock.simulatore_mock;

import com.mock.simulatore_mock.models.MessageWIMCross;
import com.mock.simulatore_mock.service.MockService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@Slf4j
@SpringBootApplication
public class SimulatoreMockApplication {

	public static void main(String[] args) throws IOException {

		MockService service = new MockService();

		SpringApplication.run(SimulatoreMockApplication.class, args);

		try {
			MessageWIMCross imageUrl = service.findImage("FULL");
			log.info("ImageUrl: " + imageUrl);
		} catch (IOException e) {
			e.printStackTrace();
		}



	}

}
