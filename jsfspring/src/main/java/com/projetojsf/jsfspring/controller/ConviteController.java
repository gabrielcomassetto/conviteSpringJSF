package com.projetojsf.jsfspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projetojsf.jsfspring.model.Convite;


@Controller
@RequestMapping("/convites")
public class ConviteController {
   
	
   @GetMapping
   public String conviteForm(final Model model) {
       model.addAttribute("convite", new Convite());
       return "conviteForm";
   }
   
   @PostMapping
   public String result(@ModelAttribute final Convite convite) {
       return "result";
   }
}
