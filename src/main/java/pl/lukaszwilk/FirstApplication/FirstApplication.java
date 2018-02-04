package pl.lukaszwilk.FirstApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}
	@Bean(name = "messageSource")
		public MessageSource messageSource(){
			ResourceBundleMessageSource source = new ResourceBundleMessageSource();
			source.setBasename("messages");
			source.setDefaultEncoding("UTF-8");
			return source;
	}
}
