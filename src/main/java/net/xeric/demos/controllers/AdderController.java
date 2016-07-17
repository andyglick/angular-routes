package net.xeric.demos.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.xeric.demos.services.AdderService;

import javax.inject.Inject;

/**
 * @author markshead
 */
@RestController
public class AdderController {

	@Inject
	AdderService adderService;

	@RequestMapping("/adder")
	public int adder(@RequestParam(value = "firstNumber", defaultValue = "0") int firstNumber,
			@RequestParam(value = "secondNumber", defaultValue = "0") int secondNumber) {

		return adderService.add(firstNumber, secondNumber);
	}
}
