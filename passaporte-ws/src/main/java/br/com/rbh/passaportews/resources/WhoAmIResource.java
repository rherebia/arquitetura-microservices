package br.com.rbh.passaportews.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhoAmIResource {
	
	@Autowired
	private Environment environment;

	@GetMapping("whoami")
	public String ok() {
		return "OK from port " + environment.getProperty("local.server.port");
	}
}
