package com.zhupp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("注册")
                .select()
                .paths(regex("/user.*"))
                .build();
    }

    @Bean
    public Docket createRestApi2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("控制")
                .select()
                .paths(regex("/control.*"))
                .build();
    }
    @Bean
    public Docket createRestApi3() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("展示")
                .select()
                .paths(regex("/ems/show.*"))
                .build();
    }
    @Bean
    public Docket createRestApi4() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("管理")
                .select()
                .paths(regex("/ems/manager.*"))
                .build();
    }


    @Bean
    public Docket createRestApi5() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("登陆")
                .select()
                .paths(regex("/ems/login.*"))
                .build();
    }


    @Deprecated
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("环境检测系统接口测试平台")
                .description("参数含义请看源码")
                .termsOfServiceUrl("")
                .contact("无名之辈 欧阳")
                .version("1.0")
                .build();
    }


}
