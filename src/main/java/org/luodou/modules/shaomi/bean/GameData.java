package org.luodou.modules.shaomi.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.xjj.framework.core.model.BaseModel;

@Entity
@Table(name="F_GAME_DATA_INFO")
@Getter
@Setter
public class GameData extends BaseModel  {

	private static final long serialVersionUID = 1L;
	
	public static final GameData dao = new GameData();
	
	private String leagueInfoId;
	private String seasonInfoId;
	private Integer curRound;
	private String aId;
	private String bId;
	private Integer aFirstHalfCorner;
	private Integer aTotalCorner;
	private Integer aFirstHalfGoal;
	private Integer aTotalGoal;
	
	private Integer bFirstHalfCorner;
	private Integer bTotalCorner;
	private Integer bFirstHalfGoal;
	private Integer bTotalGoal;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date gameTime;
	private Integer matchResult;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date lastModifyTime;
	private Integer delFlag;
	
}
