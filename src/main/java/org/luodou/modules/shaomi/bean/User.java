package org.luodou.modules.shaomi.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.xjj.framework.core.model.BaseModel;


@Entity
@Table(name="F_USER")
@Getter
@Setter
public class User extends BaseModel {

	private static final long serialVersionUID = 1L;
	
	public static final User dao = new User();
	
	private String username;
	private String password;
	private Integer sex;
	private String email;
	private String phoneNumber;
	private String headImageUrl;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date lastModifyTime;
	private Integer delFlag;

}
