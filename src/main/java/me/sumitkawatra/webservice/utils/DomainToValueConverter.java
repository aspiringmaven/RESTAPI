/**
 * 
 */
package me.sumitkawatra.webservice.utils;

import org.springframework.beans.BeanUtils;

import me.sumitkawatra.webservice.domain.Comment;
import me.sumitkawatra.webservice.domain.Message;
import me.sumitkawatra.webservice.domain.User;
import me.sumitkawatra.webservice.value.CommentVO;
import me.sumitkawatra.webservice.value.MessageVO;
import me.sumitkawatra.webservice.value.UserVO;

/**
 * @author Sumit Kawatra
 *
 */
public class DomainToValueConverter {
	
	public static UserVO populateUserVO(User user) {
		UserVO userVO = new UserVO();
		 BeanUtils.copyProperties(user, userVO);
		 return userVO;
	} 
	
	public static MessageVO populateMessageVO(Message message) {
		MessageVO messageVO = new MessageVO();
		BeanUtils.copyProperties(message, messageVO);
		return messageVO;
	}
	
	public static CommentVO populateCommentVO(Comment comment) {
		CommentVO commentVO = new CommentVO();
		BeanUtils.copyProperties(comment, commentVO);
		return commentVO;
	}
	
}
