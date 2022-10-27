package com.carnoprojet.carnoprojet.config;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(
					new ApiInfoBuilder()
					 .description("Category et subCategory")
					 .title("Gestion de Category et subCategory")
					 .build()
				)
				.groupName("REST API")
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.carnoprojet.carnoprojet"))
				.paths(PathSelectors.ant("/**"))
				.build();
	}
}
