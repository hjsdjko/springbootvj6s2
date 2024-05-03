package com.entity.view;

import com.entity.FuzerenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 负责人
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-15 18:03:02
 */
@TableName("fuzeren")
public class FuzerenView  extends FuzerenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuzerenView(){
	}
 
 	public FuzerenView(FuzerenEntity fuzerenEntity){
 	try {
			BeanUtils.copyProperties(this, fuzerenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
