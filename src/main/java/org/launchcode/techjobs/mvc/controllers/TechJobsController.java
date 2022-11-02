package org.launchcode.techjobs.mvc.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

public class TechJobsController {

    static HashMap<String, String> actionChoices = new HashMap<>();
    actionChoices.put("search", "Search");
    actionChoices.put("list", "List");

    static HashMap<> getActionChoices(@ModelAttribute Hashmap<> actions) {
        return actions;
    }

}
