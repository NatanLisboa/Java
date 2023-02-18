package com.algaworks.curso.dao;

@SuppressWarnings("serial")
public class DAOException extends Exception {
	
	public DAOException(String msg, Throwable t) {
		super(msg, t);
	}

}
