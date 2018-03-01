package org.luodou.modules.shaomi.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.xjj.framework.core.model.BaseModel;

@Entity
@Table(name="F_SEASON_INFO")
@Getter
@Setter
public class Season extends BaseModel  {

	private static final long serialVersionUID = 1L;
	
	public static final Season dao = new Season();
	
	private String seasonName;
	private String leagueInfoId;
	private Integer gameRound;
	private Integer sort;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date lastModifyTime;
	private Integer delFlag;
	
}
