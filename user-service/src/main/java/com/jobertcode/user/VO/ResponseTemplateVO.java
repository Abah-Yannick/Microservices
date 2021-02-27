package com.jobertcode.user.VO;

import com.jobertcode.user.entity.User;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Setter
@Getter
public class ResponseTemplateVO {
	
	private User user;
	private Department department;

}
