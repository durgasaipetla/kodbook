
	package com.kodbook.controllers;

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;

	@Controller
	public class NavigationController {
		
		@GetMapping("/")
		public String indexPage() {
			return "index";
		}
		
		@GetMapping("/openSignupPage")
		public String openSignupPage() {
			return "signUp";
		}
		
		@GetMapping("/openCreatePost")
		public String openCreatePost() {
			return "createPost";
		}


	}


