package br.com.bianeck.customerregisterstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class CustomerRegisterLauncher {

	public static void main(String[] args) {
		SpringApplication.run(CustomerRegisterLauncher.class, args);
	}

}
