package me.sumitkawatra.webservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.sumitkawatra.webservice.dao.MessageDao;
import me.sumitkawatra.webservice.domain.Message;

@Service
public class MessageServiceImpl implements MessageService {
	
	@Autowired
	private MessageDao messageDao;
	
	public List<Message> getAll() {

		return messageDao.getAll();
	}

	public Message getById(long id) {

		return messageDao.getById(id);
	}

	public void save(Message message) {
		messageDao.save(message);
	}

	public void update(Message message) {
		messageDao.update(message);
	}

	public void delete(Message message) {
		messageDao.delete(message);
	}

	public void deleteById(long id) {
		messageDao.deleteById(id);
	}

	public MessageDao getMessageDao() {
		return messageDao;
	}

	public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
	}

}
