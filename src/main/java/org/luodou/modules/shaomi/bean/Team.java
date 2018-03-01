package org.luodou.modules.shaomi.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.xjj.framework.core.model.BaseModel;

@Entity
@Table(name="F_TEAM_INFO")
@Getter
@Setter
public class Team extends BaseModel  {

	private static final long serialVersionUID = 1L;
	
	public static final Team dao = new Team();
	
	private String teamName;
	private String leagueInfoId;
	private String remark;
	private Integer sort;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date lastModifyTime;
	private Integer delFlag;
	
}
