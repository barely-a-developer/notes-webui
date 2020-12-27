package notes.controllers;

import lombok.RequiredArgsConstructor;
import notes.clients.NotesCoreClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.constraints.NotNull;

@Controller
@RequiredArgsConstructor
public class DashboardController {

    private final NotesCoreClient notesCoreClient;

    @GetMapping("/")
    public String getHome() {
        return "home";
    }

    @GetMapping("/dashboard")
    public String getDefaultDashboard(@NotNull Model model) {
        model.addAttribute("notes", notesCoreClient.getNotes());
        return "dashboard";
    }

}
