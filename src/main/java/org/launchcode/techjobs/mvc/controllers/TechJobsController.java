package org.launchcode.techjobs.mvc.controllers;

import org.springframework.ui.Model;

import java.util.HashMap;

public class TechJobsController {

    static HashMap<String, String> actionChoices = new HashMap<>();

    static String getActionChoices(Model model) {
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");
        model.addAttribute("actions", actionChoices);
        return "";
    }

}
