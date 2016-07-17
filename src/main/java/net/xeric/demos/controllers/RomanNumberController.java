package net.xeric.demos.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.xeric.demos.services.RomanNumberService;

import javax.inject.Inject;

@RestController
public class RomanNumberController {

	@Inject
	RomanNumberService romanNumberService;

	@RequestMapping("/romanNumber")
	public @ResponseBody String toRomanNum(@RequestParam(value = "num", defaultValue = "0") int num) {
		return romanNumberService.toRoman(num);
	}
}
