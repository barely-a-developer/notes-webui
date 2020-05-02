package notes.clients;

import notes.models.dto.NoteDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "NotesCoreClient", url = "${services.notes.core.url}/notes")
public interface NotesCoreClient {

    @RequestMapping(method = RequestMethod.GET, value = "/?size=100&sort=id,desc", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<NoteDto> getNotes();

}
