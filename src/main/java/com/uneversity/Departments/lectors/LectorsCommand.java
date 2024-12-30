package com.uneversity.Departments.lectors;

import com.uneversity.Departments.lectors.model.LectorDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.shell.command.annotation.Command;
import org.springframework.shell.command.annotation.Option;

import java.util.List;

@RequiredArgsConstructor
@Command(group = "Lectors")
public class LectorsCommand {

    private final LectorsFacade facade;

    @Command(command = "lector-search ", description = "Global search for lectors")
    public List<LectorDTO> search(@Option(required = true, description = "The first name of the lector") final String template) {
        return facade.searchBy(template);
    }
}
