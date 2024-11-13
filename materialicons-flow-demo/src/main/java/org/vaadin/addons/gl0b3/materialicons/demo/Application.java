package org.vaadin.addons.gl0b3.materialicons.demo;

import com.vaadin.flow.component.page.AppShellConfigurator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The entry point of the Spring Boot application.
 * <p>
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 */
@SpringBootApplication
public class Application implements AppShellConfigurator {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
