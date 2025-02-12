package com.abrigo.animais.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
package com.abrigo.animais;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Map;
import java.util.stream.Collectors;
@SpringBootApplication
public class AbrigoAnimaisApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbrigoAnimaisApplication.class, args);
	}

}
