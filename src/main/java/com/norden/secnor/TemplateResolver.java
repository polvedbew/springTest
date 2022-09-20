package com.norden.secnor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.templateresolver.FileTemplateResolver;
import org.thymeleaf.templateresolver.StringTemplateResolver;

import javax.annotation.PostConstruct;

/**
 * ----------------------*    Norden Communication    *-------------------------
 * Created on 20/09/2022
 * R&D SCK
 * -----------------------------------------------------------------------------
 **/
@Configuration
public class TemplateResolver {

        public TemplateResolver(TemplateEngine templateEngine) {
            templateEngine.addTemplateResolver(new StringTemplateResolver());
        }




}
