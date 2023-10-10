package pet.shop.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import pet.shop.SupplierManagementApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { SupplierManagementApplication.class })
public class CucumberSpingConfiguration {}
