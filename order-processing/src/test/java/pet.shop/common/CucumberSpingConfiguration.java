package pet.shop.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import pet.shop.OrderProcessingApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderProcessingApplication.class })
public class CucumberSpingConfiguration {}
