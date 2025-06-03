package shaco.tjnu_data_form;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("shaco.tjnu_data_form.mapper")
public class TjnuDataFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(TjnuDataFormApplication.class, args);
	}

}
