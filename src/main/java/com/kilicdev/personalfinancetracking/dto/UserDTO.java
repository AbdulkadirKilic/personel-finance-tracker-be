package com.kilicdev.personalfinancetracking.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {
	private Long id;
	private String name;
	private String email;
	private List<TransactionDTO> transactionDTOs;
}
