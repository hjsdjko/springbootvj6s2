package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiandaobaobeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiandaobaobeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiandaobaobeiView;


/**
 * 签到报备
 *
 * @author 
 * @email 
 * @date 2022-04-15 18:03:02
 */
public interface QiandaobaobeiService extends IService<QiandaobaobeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiandaobaobeiVO> selectListVO(Wrapper<QiandaobaobeiEntity> wrapper);
   	
   	QiandaobaobeiVO selectVO(@Param("ew") Wrapper<QiandaobaobeiEntity> wrapper);
   	
   	List<QiandaobaobeiView> selectListView(Wrapper<QiandaobaobeiEntity> wrapper);
   	
   	QiandaobaobeiView selectView(@Param("ew") Wrapper<QiandaobaobeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiandaobaobeiEntity> wrapper);
   	

}

