package pet.shop.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import pet.shop.MemberManagementApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { MemberManagementApplication.class })
public class CucumberSpingConfiguration {}
