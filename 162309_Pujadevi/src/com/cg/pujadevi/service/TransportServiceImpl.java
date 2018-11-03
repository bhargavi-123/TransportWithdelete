package com.cg.pujadevi.service;

import java.util.Map;

import com.cg.pujadevi.bean.TransportBean;
import com.cg.pujadevi.dao.ITransportDao;
import com.cg.pujadevi.dao.TransportDaoImpl;
import com.cg.pujadevi.exception.TicketException;

public class TransportServiceImpl implements ITransportService {
      ITransportDao dao = new TransportDaoImpl();
	@Override
	public Map<String, String> getTransportDetails() throws TicketException {
		// TODO Auto-generated method stub
		return dao.getTransportDetails();
	}
	@Override
	public void addTransport(TransportBean bean) throws TicketException {
		// TODO Auto-generated method stub
		dao.addTransport(bean);
	}
	public Map<Integer, TransportBean> displayTransportDetails() {
		 return dao.displayTransportDetails();
	}
	@Override
	public void deleteBooking(int choiceDelete) {
		// TODO Auto-generated method stub
		dao.deleteBooking(choiceDelete);
	}
}
