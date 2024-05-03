package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaigouxuqiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaigouxuqiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaigouxuqiuView;


/**
 * 采购需求
 *
 * @author 
 * @email 
 * @date 2022-04-15 18:03:02
 */
public interface CaigouxuqiuService extends IService<CaigouxuqiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaigouxuqiuVO> selectListVO(Wrapper<CaigouxuqiuEntity> wrapper);
   	
   	CaigouxuqiuVO selectVO(@Param("ew") Wrapper<CaigouxuqiuEntity> wrapper);
   	
   	List<CaigouxuqiuView> selectListView(Wrapper<CaigouxuqiuEntity> wrapper);
   	
   	CaigouxuqiuView selectView(@Param("ew") Wrapper<CaigouxuqiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaigouxuqiuEntity> wrapper);
   	

}

