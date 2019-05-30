package com.skcc.member.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

	@GetMapping("/member")
	public ResponseEntity<String> member() {
		return ResponseEntity.ok("Member!");
	}
}
