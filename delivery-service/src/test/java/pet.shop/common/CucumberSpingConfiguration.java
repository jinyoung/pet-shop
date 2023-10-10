package pet.shop.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import pet.shop.DeliveryServiceApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { DeliveryServiceApplication.class })
public class CucumberSpingConfiguration {}
