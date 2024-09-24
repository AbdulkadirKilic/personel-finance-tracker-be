package com.kilicdev.personalfinancetracking.controller.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kilicdev.personalfinancetracking.dto.UserDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserResponse extends BaseResponse {
	private UserDTO userDTO;
}
