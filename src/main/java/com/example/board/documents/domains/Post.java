package com.example.board.documents.domains;

import com.example.board.commons.models.CommonModel;
import lombok.Getter;

import java.math.BigDecimal;

/**
 * name         : Post
 * version      : 1.0.0.1
 * date         : 2023-05-10
 * description  : 설명
 */
@Getter
public class Post implements CommonModel {
	private BigDecimal id;
}
