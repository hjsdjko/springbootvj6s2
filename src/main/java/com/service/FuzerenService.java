package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuzerenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuzerenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuzerenView;


/**
 * 负责人
 *
 * @author 
 * @email 
 * @date 2022-04-15 18:03:02
 */
public interface FuzerenService extends IService<FuzerenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuzerenVO> selectListVO(Wrapper<FuzerenEntity> wrapper);
   	
   	FuzerenVO selectVO(@Param("ew") Wrapper<FuzerenEntity> wrapper);
   	
   	List<FuzerenView> selectListView(Wrapper<FuzerenEntity> wrapper);
   	
   	FuzerenView selectView(@Param("ew") Wrapper<FuzerenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuzerenEntity> wrapper);
   	

}

