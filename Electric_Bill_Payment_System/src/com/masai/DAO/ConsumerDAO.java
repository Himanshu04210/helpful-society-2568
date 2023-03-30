package com.masai.DAO;

import java.util.List;

import com.masai.DTO.ConsumerDTO;
import com.masai.Exception.NoRecordFoundException;
import com.masai.Exception.SomethingWentWrongException;

public interface ConsumerDAO {
	public void addConsumer(ConsumerDTO conDto) throws SomethingWentWrongException;
	public List<ConsumerDTO> viewAllConsumer() throws SomethingWentWrongException, NoRecordFoundException;
	public void deleteConsumer(int userId) throws SomethingWentWrongException;
	public void login(String userName, String password) throws SomethingWentWrongException, NoRecordFoundException;
}
