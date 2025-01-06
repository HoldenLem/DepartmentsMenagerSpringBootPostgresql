package com.uneversity.Departments.lectors;

import com.uneversity.Departments.format.OutputFormatter;
import lombok.RequiredArgsConstructor;
import org.springframework.shell.command.annotation.Command;
import org.springframework.shell.command.annotation.Option;

import java.util.List;

@RequiredArgsConstructor
@Command(group = "Lectors")
public class LectorsCommand {
    private final LectorsFacade facade;
    private final OutputFormatter formatter;

    @Command(command = "lector-search ", description = "Global search for lectors")
    public String search(@Option(required = true, description = "The first name of the lector") final String template) {
        return formatter.coverToTable(facade.searchBy(template));
    }

}
