package com.entity.view;

import com.entity.JiankangdakaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康打卡
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-15 18:03:02
 */
@TableName("jiankangdaka")
public class JiankangdakaView  extends JiankangdakaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankangdakaView(){
	}
 
 	public JiankangdakaView(JiankangdakaEntity jiankangdakaEntity){
 	try {
			BeanUtils.copyProperties(this, jiankangdakaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
