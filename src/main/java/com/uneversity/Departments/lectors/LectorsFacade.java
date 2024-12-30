package com.uneversity.Departments.lectors;

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
        return service.searchBy(template).stream()
                .map(mapper::of)
                .toList();
    }
}
