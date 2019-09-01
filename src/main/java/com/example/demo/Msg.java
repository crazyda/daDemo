package com.example.demo;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.MessageCreator;

public class Msg implements MessageCreator {

	public Message createMessage(Session session) throws JMSException {
		// TODO Auto-generated method stub
		return session.createTextMessage("≤‚ ‘œ˚œ¢");
	}

}
