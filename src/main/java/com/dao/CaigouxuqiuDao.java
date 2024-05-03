package com.dao;

import com.entity.CaigouxuqiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaigouxuqiuVO;
import com.entity.view.CaigouxuqiuView;


/**
 * 采购需求
 * 
 * @author 
 * @email 
 * @date 2022-04-15 18:03:02
 */
public interface CaigouxuqiuDao extends BaseMapper<CaigouxuqiuEntity> {
	
	List<CaigouxuqiuVO> selectListVO(@Param("ew") Wrapper<CaigouxuqiuEntity> wrapper);
	
	CaigouxuqiuVO selectVO(@Param("ew") Wrapper<CaigouxuqiuEntity> wrapper);
	
	List<CaigouxuqiuView> selectListView(@Param("ew") Wrapper<CaigouxuqiuEntity> wrapper);

	List<CaigouxuqiuView> selectListView(Pagination page,@Param("ew") Wrapper<CaigouxuqiuEntity> wrapper);
	
	CaigouxuqiuView selectView(@Param("ew") Wrapper<CaigouxuqiuEntity> wrapper);
	

}
