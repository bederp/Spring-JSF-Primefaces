package controllers;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("session")
public class TemplateController {
    private String page;

    public TemplateController() {
    }

    @PostConstruct
    public void init() {
        this.page = "1"; // Ensure that default is been set.
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

}
