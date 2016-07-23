package me.sumitkawatra.webservice.utils;

import org.springframework.beans.BeanUtils;

import me.sumitkawatra.webservice.domain.Comment;
import me.sumitkawatra.webservice.domain.Message;
import me.sumitkawatra.webservice.domain.User;
import me.sumitkawatra.webservice.value.CommentVO;
import me.sumitkawatra.webservice.value.MessageVO;
import me.sumitkawatra.webservice.value.UserVO;
/**
 * 
 * @author Sumit Kawatra
 *
 */
public class ValueToDomainConverter {
	/**
	 * 
	 * @param userVO
	 * @return User
	 */
	public static User populateUser(UserVO userVO) {
		User user = new User();
		BeanUtils.copyProperties(userVO, user);
		return user;
	}

	public static Message populateMessage(MessageVO messageVO) {
		Message message = new Message();
		BeanUtils.copyProperties(messageVO, message);
		return message;
	}

	public static Comment populateComment(CommentVO commentVO) {
		Comment comment = new Comment();
		BeanUtils.copyProperties(commentVO, comment);
		return comment;
	}
}
