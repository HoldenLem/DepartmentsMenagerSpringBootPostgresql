package com.uneversity.Departments.lectors;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class LectorsService {
    private final LectorsRepository repo;

    List<Lector> searchBy(String template) {
        return repo.searchBy(template);
    }
}
