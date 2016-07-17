package net.xeric.demos.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.xeric.demos.services.CounterService;

import javax.inject.Inject;

/**
 * @author markshead
 */
@RestController
public class CounterController {

	@Inject
	CounterService counterService;

	@RequestMapping("/counter")
	public @ResponseBody int count() {
		return counterService.increment();
	}
}
