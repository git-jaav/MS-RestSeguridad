package pe.jaav.sistemas.MSRestSeguridad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages={"pe.jaav.sistemas"})
@EnableConfigurationProperties
@EnableScheduling
@EnableCaching
@EnableDiscoveryClient
public class MSRestSeguridadApplication {

	public static void main(String[] args) {
		SpringApplication.run(MSRestSeguridadApplication.class, args);
	}
}
