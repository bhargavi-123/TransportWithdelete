package com.cg.pujadevi.service;

import java.util.Map;

import com.cg.pujadevi.bean.TransportBean;
import com.cg.pujadevi.exception.TicketException;

public interface ITransportService {

	public Map<String, String> getTransportDetails() throws TicketException;

	public void addTransport(TransportBean bean) throws TicketException;
	public Map<Integer, TransportBean> displayTransportDetails();

	public void deleteBooking(int choiceDelete);

}
