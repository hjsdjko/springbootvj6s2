package com.entity.view;

import com.entity.CaigouxuqiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 采购需求
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-15 18:03:02
 */
@TableName("caigouxuqiu")
public class CaigouxuqiuView  extends CaigouxuqiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaigouxuqiuView(){
	}
 
 	public CaigouxuqiuView(CaigouxuqiuEntity caigouxuqiuEntity){
 	try {
			BeanUtils.copyProperties(this, caigouxuqiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
