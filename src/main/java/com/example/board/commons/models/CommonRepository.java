package com.example.board.commons.models;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * name         : BoardDAO
 * version      : 1.0.0.1
 * date         : 2023-05-10
 * description  : 설명
 */
@Mapper
@Repository
public interface CommonRepository {
	void create(CommonModel model) throws Exception;
	CommonModel read(BigDecimal id) throws Exception;
	void update(CommonModel model) throws Exception;
	void delete(BigDecimal id) throws Exception;
	List<CommonModel> readAll() throws Exception;
	int countList(Criteria criteria) throws Exception;
	List<CommonModel> readPaging(Criteria criteria) throws Exception;
}
