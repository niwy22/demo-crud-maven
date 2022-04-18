package com.spring.project;
import java.io.FileReader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication

public class SpringCrudProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudProjectApplication.class, args);
	}
}
/*
 * @Bean public Docket swaggerConfiguration() { // Return a prepared Docket
 * instance return new Docket(DocumentationType.SWAGGER_2)
 * .select().paths(PathSelectors.ant("/api/*"))
 * .apis(RequestHandlerSelectors.basePackage("com.spring"))
 * .build().apiInfo(apiInfo()); } private ApiInfo apiInfo() { return new
 * ApiInfoBuilder().title("demo-crud-project")
 * .description("Database query using Swaggerhub")
 * .termsOfServiceUrl("http://nous.com") .license("NousInfo License")
 * .licenseUrl("http://niweditar@nousinfo.com") .version("1.0.0") .build(); } }
 */