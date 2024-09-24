package com.kilicdev.personalfinancetracking.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDTO {
	private Long id;
	private String category;
	private Double amount;
	private LocalDate date;
	private String type;
	private Long userId;
}
