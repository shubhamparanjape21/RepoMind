package com.repomind.backend.dto;

public record CitationDto(
		String filePath,
		Integer startLine,
		Integer endLine,
		String language
		) {

}
