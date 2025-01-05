package com.uneversity.Departments.lectors;

import com.uneversity.Departments.exception.LectorNotFoundException;
import com.uneversity.Departments.lectors.model.LectorDTO;
import com.uneversity.Departments.lectors.model.LectorMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class LectorsFacade {
    private final LectorsService service;
    private final LectorMapper mapper;

    public List<LectorDTO> searchBy(String template) {
        List<LectorDTO> result = service.searchBy(template).stream()
                .map(mapper::toDto)
                .toList();
        if (result.isEmpty()) {
            throw new LectorNotFoundException("No results found for the given template: " + template);
        }
        return result;
    }

}
