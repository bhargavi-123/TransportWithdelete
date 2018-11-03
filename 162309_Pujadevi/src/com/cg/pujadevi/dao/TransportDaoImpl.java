package com.cg.pujadevi.dao;

import java.util.Map;

import com.cg.pujadevi.bean.TransportBean;
import com.cg.pujadevi.util.DataBase;

public class TransportDaoImpl implements ITransportDao {

	@Override
	public Map<String, String> getTransportDetails() {
		// TODO Auto-generated method stub
		return DataBase.getTransportDetails();
	}

	@Override
	public void addTransport(TransportBean bean) {
		// TODO Auto-generated method stub
		 DataBase.addTransport(bean);
	}

	@Override
	public Map<Integer, TransportBean> displayTransportDetails() {
		// TODO Auto-generated method stub
		return DataBase.displayTransportDetails();
	}

	@Override
	public void deleteBooking(int choiceDelete) {
		// TODO Auto-generated method stub
		DataBase.deleteBooking(choiceDelete);
	}

}
