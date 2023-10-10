package pet.shop.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import pet.shop.ProductManagementApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { ProductManagementApplication.class })
public class CucumberSpingConfiguration {}
