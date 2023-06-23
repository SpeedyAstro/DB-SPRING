package in.astro.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = { "in.astro" })
@Import(value = PersistenceConfig.class)
public class AppConfig {
	static {
		System.out.println("AppConfig.class is loading...");
	}
	
	public AppConfig() {
		System.out.println("AppConfig:: Zero param Constructor");
	}
}
