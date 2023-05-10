package com.example.board.users.domains;

import com.example.board.commons.models.CommonModel;
import lombok.Getter;

import java.math.BigDecimal;

/**
 * name         : User
 * version      : 1.0.0.1
 * date         : 2023-05-10
 * description  : 설명
 */
@Getter
public class User implements CommonModel {
	private BigDecimal id;
}
