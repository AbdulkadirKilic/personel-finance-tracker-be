package com.kilicdev.personalfinancetracking.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kilicdev.personalfinancetracking.model.Transaction;
import lombok.*;

import java.util.List;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {
	private Long id;
	private String name;
	private String email;
	private List<TransactionDTO> transactionDTOs;
}
