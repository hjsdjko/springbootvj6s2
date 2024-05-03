package com.entity.view;

import com.entity.QiandaobaobeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 签到报备
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-15 18:03:02
 */
@TableName("qiandaobaobei")
public class QiandaobaobeiView  extends QiandaobaobeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiandaobaobeiView(){
	}
 
 	public QiandaobaobeiView(QiandaobaobeiEntity qiandaobaobeiEntity){
 	try {
			BeanUtils.copyProperties(this, qiandaobaobeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
