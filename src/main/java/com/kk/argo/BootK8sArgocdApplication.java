package com.kk.argo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class BootK8sArgocdApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootK8sArgocdApplication.class, args);
	}

	@GetMapping("/data")
    public String index(final Model model) {
        model.addAttribute("title", "Whoh! I've successfuly deployed a application using Maven");
        model.addAttribute("msg", "This application is deployed on to Kubernetes using Argo CD");
        return "index";
    }
}
