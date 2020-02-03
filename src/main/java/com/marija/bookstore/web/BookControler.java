package com.marija.bookstore.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@Controller
public class BookControler {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String bookForm(Model model) {
		return "book";
	}

	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public String bookSubmit(Model model) {
		return "book";
	}
}
