package com.entity.vo;

import com.entity.QiandaobaobeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 签到报备
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-15 18:03:02
 */
public class QiandaobaobeiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 行程码
	 */
	
	private String xingchengma;
		
	/**
	 * 报备类型
	 */
	
	private String baobeileixing;
		
	/**
	 * 报备内容
	 */
	
	private String baobeineirong;
		
	/**
	 * 报备时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date baobeishijian;
		
	/**
	 * 疫苗接种
	 */
	
	private String yimiaojiezhong;
		
	/**
	 * 核酸检查
	 */
	
	private String hesuanjiancha;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：行程码
	 */
	 
	public void setXingchengma(String xingchengma) {
		this.xingchengma = xingchengma;
	}
	
	/**
	 * 获取：行程码
	 */
	public String getXingchengma() {
		return xingchengma;
	}
				
	
	/**
	 * 设置：报备类型
	 */
	 
	public void setBaobeileixing(String baobeileixing) {
		this.baobeileixing = baobeileixing;
	}
	
	/**
	 * 获取：报备类型
	 */
	public String getBaobeileixing() {
		return baobeileixing;
	}
				
	
	/**
	 * 设置：报备内容
	 */
	 
	public void setBaobeineirong(String baobeineirong) {
		this.baobeineirong = baobeineirong;
	}
	
	/**
	 * 获取：报备内容
	 */
	public String getBaobeineirong() {
		return baobeineirong;
	}
				
	
	/**
	 * 设置：报备时间
	 */
	 
	public void setBaobeishijian(Date baobeishijian) {
		this.baobeishijian = baobeishijian;
	}
	
	/**
	 * 获取：报备时间
	 */
	public Date getBaobeishijian() {
		return baobeishijian;
	}
				
	
	/**
	 * 设置：疫苗接种
	 */
	 
	public void setYimiaojiezhong(String yimiaojiezhong) {
		this.yimiaojiezhong = yimiaojiezhong;
	}
	
	/**
	 * 获取：疫苗接种
	 */
	public String getYimiaojiezhong() {
		return yimiaojiezhong;
	}
				
	
	/**
	 * 设置：核酸检查
	 */
	 
	public void setHesuanjiancha(String hesuanjiancha) {
		this.hesuanjiancha = hesuanjiancha;
	}
	
	/**
	 * 获取：核酸检查
	 */
	public String getHesuanjiancha() {
		return hesuanjiancha;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
