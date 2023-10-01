package com.nttdata.escuela.java.projectbank.controller;
import com.nttdata.escuela.java.projectbank.entity.Headline;
import com.nttdata.escuela.java.projectbank.service.HeadlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/headlines")
public class HeadlineController {

    @Autowired
    private HeadlineService headlineService;

    @GetMapping
    public List<Headline> getAllHeadlines() {
        return headlineService.getAllHeadlines();
    }

    @GetMapping("/{id}")
    public Headline getHeadlinesById(@PathVariable Long id) {
        return headlineService.getHeadlineById(id);
    }

    @PostMapping
    public Headline createHeadline(@RequestBody Headline headline) {
        return headlineService.createHeadline(headline);
    }

    @PutMapping("/{id}")
    public Headline updateHeadline(@PathVariable Long id, @RequestBody Headline headline) {
        return headlineService.updateHeadline(id, headline);
    }

    @DeleteMapping("/{id}")
    public void deleteHeadline(@PathVariable Long id) {
        headlineService.deleteHeadline(id);
    }
}
