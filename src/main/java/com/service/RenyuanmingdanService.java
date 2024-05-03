package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenyuanmingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenyuanmingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenyuanmingdanView;


/**
 * 人员名单
 *
 * @author 
 * @email 
 * @date 2022-04-15 18:03:02
 */
public interface RenyuanmingdanService extends IService<RenyuanmingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenyuanmingdanVO> selectListVO(Wrapper<RenyuanmingdanEntity> wrapper);
   	
   	RenyuanmingdanVO selectVO(@Param("ew") Wrapper<RenyuanmingdanEntity> wrapper);
   	
   	List<RenyuanmingdanView> selectListView(Wrapper<RenyuanmingdanEntity> wrapper);
   	
   	RenyuanmingdanView selectView(@Param("ew") Wrapper<RenyuanmingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenyuanmingdanEntity> wrapper);
   	

}

