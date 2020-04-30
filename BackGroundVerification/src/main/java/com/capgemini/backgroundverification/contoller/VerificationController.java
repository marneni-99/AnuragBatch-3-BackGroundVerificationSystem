package com.capgemini.backgroundverification.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.backgroundverification.entity.LoginData;
import com.capgemini.backgroundverification.entity.Verification;
import com.capgemini.backgroundverification.exception.IdNotFoundException;
import com.capgemini.backgroundverification.service.VerificationService;


@RestController
@RequestMapping("/ver")
//@CrossOrigin("http://localhost:4200")
public class VerificationController {
	@Autowired
	VerificationService serviceobj;

	// Add user
	@PostMapping("/addVer")
	public ResponseEntity<String> addUser(@RequestBody Verification u) {
		Verification e = serviceobj.addVer(u);
		if (e == null) {
			throw new IdNotFoundException("Enter Valid Id");
		} else {
			return new ResponseEntity<String>("Data entered successfully", new HttpHeaders(), HttpStatus.OK);
		}
	}
}