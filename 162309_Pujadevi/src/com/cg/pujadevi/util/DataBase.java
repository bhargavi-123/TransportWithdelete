package com.cg.pujadevi.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.cg.pujadevi.bean.TransportBean;

public class DataBase {
	private static Map<String, String> transportDetails = new HashMap<>();
	private static Map<Integer, TransportBean> bookTransport = new HashMap<>();

	public static Map<String, String> getTransportDetails() {
		// TODO Auto-generated method stub
		transportDetails.put("f-1", "flight");
		transportDetails.put("t-2", "train");
		transportDetails.put("Ta-1", "Taxi");
		return transportDetails;
	}

	public static void addTransport(TransportBean bean) {
		// TODO Auto-generated method stub
		bookTransport.put(bean.getId(), bean);

	}

	public static Map<Integer, TransportBean> displayTransportDetails() {
		return bookTransport;

	}

	public static void deleteBooking(int choiceDelete) {
		// TODO Auto-generated method stub

		Iterator<Map.Entry<Integer, TransportBean>> it = bookTransport
				.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<Integer, TransportBean> entry = it.next();

			if (choiceDelete == entry.getKey()) {

				it.remove();
			}

		}

		/*
		 * for (Map.Entry<Integer, TransportBean> entrySet :
		 * bookTransport.entrySet()) {
		 * 
		 * if (choiceDelete==entrySet.getKey() ){
		 * bookTransport.remove(choiceDelete); }
		 * 
		 * }
		 */

	}

}
