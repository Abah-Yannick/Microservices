package com.jobertcode.user.VO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class Department {
	
	private Long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;

}
