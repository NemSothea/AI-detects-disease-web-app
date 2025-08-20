
package com.plant.detectsdiseaseapp.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.plant.detectsdiseaseapp.models.DetectionRecord;

@Controller
public class DiseaseController {

  @GetMapping("/")
  public String home(Model model) {
    // Fetch records from database (example mock data)
    List<DetectionRecord> records = List.of(
        new DetectionRecord(1, "healthy_leaf.jpg", "Healthy", LocalDate.now()),
        new DetectionRecord(2, "diseased_leaf.jpg", "Blight", LocalDate.now()));

    // Use addAttribute with the attribute name and value
    model.addAttribute("records", (Object) records);
    model.addAttribute("activePage", "home");
    return "home";
  }

  @GetMapping("/detect")
  public String detectPage(Model model) {
    model.addAttribute("activePage", "detect");
    return "detect";
  }

  @GetMapping("/about")
  public String aboutPage(Model model) {
    model.addAttribute("activePage", "about");
    return "about";
  }

  @GetMapping("/test")
  public String test(Model model) {
    model.addAttribute("message", "Hello World"); // Simple String
    model.addAttribute("activePage", "test");
    return "test";
  }

}
