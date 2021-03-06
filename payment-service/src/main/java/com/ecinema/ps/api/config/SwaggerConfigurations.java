package com.ecinema.ps.api.config;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Class responsible to swagger configuration
 * 
 * @author j.a.vasconcelos
 *
 */
@Configuration
public class SwaggerConfigurations {

	public Docket paymentServiceApi() {

		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.ecinema.ps.api")).paths(PathSelectors.ant("/**"))
				.build();
	}
}
