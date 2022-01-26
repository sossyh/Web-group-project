package com.Group11.Mekinaye;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.Group11.Mekinaye.ServiceType.Type;

@SpringBootApplication
public class MekinayeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MekinayeApplication.class, args);
	}
	@Bean
public CommandLineRunner dataBaseAgent(ServiceTypeRepository repository){
	return args->{
		repository.save(new ServiceType ("TIRE","flat tire",Type.Failure));
		repository.save(new ServiceType ("WALI","warning light",Type.Failure));
		repository.save(new ServiceType ("nath","naftha",Type.Gas));
		repository.save(new ServiceType ("gass","gasoline",Type.Gas));
		repository.save(new ServiceType ("raoh","radiator overheating",Type.EngineFailure));
		repository.save(new ServiceType ("deba","dead battery",Type.EngineFailure));
		repository.save(new ServiceType ("brpb","break problem",Type.OtherProblem));
		repository.save(new ServiceType ("otpb","other problem",Type.OtherProblem));
	

};

}}


