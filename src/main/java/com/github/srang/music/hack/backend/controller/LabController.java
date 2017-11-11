package com.github.srang.music.hack.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by srang on 11/11/2017.
 */
@Controller
@RequestMapping("/")
public class LabController {
    @RequestMapping("/lab")
    public String home() {
        return "lab";
    }
    @RequestMapping("/")
    public String redir() { return "redirect:/lab"; }
}
