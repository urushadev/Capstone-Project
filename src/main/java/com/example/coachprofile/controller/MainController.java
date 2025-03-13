package com.example.coachprofile.controller;

import com.example.coachprofile.Service.UserService;
import com.example.coachprofile.model.ContactForm;
import com.example.coachprofile.model.User;
import com.example.coachprofile.repository.ContactRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private UserService userService;

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("contactForm", new ContactForm());
        return "contact";
    }

    @PostMapping("/submit-contact")
    public String submitContactForm(@ModelAttribute ContactForm contactForm) {
        contactRepository.save(contactForm);
        return "redirect:/contact";
    }

    @GetMapping("/sign-in")
    public String signIn() {
        return "sign-in";
    }

//    @PostMapping("/sign-in")
//    public String signInUser(@RequestParam String username, @RequestParam String password, HttpSession session, Model model) {
//        System.out.println("I am in inside sign in user function");
//        if (userService.validateUser(username, password)) {
//            session.setAttribute("user", username);
//            System.out.println("Session set with user: " + username); // Debugging statement
//            return "redirect:/dashboard";
//        } else {
//            model.addAttribute("error", "Invalid username or password");
//            return "sign-in";
//        }
//    }

//    @GetMapping("/dashboard")
//    public String showDashboard(HttpSession session, Model model) {
//        String username = (String) session.getAttribute("user");
//
//        if (username == null) {
//            System.out.println("User not found in session, redirecting to sign-in."); // Debugging statement
//            return "redirect:/sign-in";
//        }
////
//        model.addAttribute("username", username);
////        System.out.println("User found: " + username); // Debugging statement
//        return "dashboard";
//    }

//@GetMapping("/dashboard")
//public String showDashboard(Model model, Authentication authentication) {
//    String username = authentication.getName(); // Get the authenticated user's name
//
//    if (username == null) {
//        return "redirect:/home";
//    }
//
//    model.addAttribute("username", username);
//    return "dashboard";
//}

@GetMapping("/dashboard")
public String showDashboard(Model model, Authentication authentication) {
    if (authentication != null && authentication.isAuthenticated()) {
        String username = authentication.getName(); // Get authenticated username
        model.addAttribute("username", username);
    } else {
        return "redirect:/sign-in";
    }
    return "dashboard";
}

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {
        userService.registerUser(user);
        return "redirect:/sign-in";
    }
}