package notes.controllers;

import notes.clients.NotesCoreClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
@RequiredArgsConstructor
public class DashboardController {

    private final NotesCoreClient notesCoreClient;

    @RequestMapping("/")
    public String getDefaultDashboard(Model model) {
        model.addAttribute("notes", notesCoreClient.getNotes());
        return "dashboard";
    }

}
