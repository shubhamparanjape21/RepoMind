package com.repomind.backend.service.ai;

import java.util.List;

import com.repomind.backend.dto.CitationDto;

public record RetrievedContext(
        List<CitationDto> citations,
        String contextText) {
}