package com.dao;

import com.entity.RenyuanmingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenyuanmingdanVO;
import com.entity.view.RenyuanmingdanView;


/**
 * 人员名单
 * 
 * @author 
 * @email 
 * @date 2022-04-15 18:03:02
 */
public interface RenyuanmingdanDao extends BaseMapper<RenyuanmingdanEntity> {
	
	List<RenyuanmingdanVO> selectListVO(@Param("ew") Wrapper<RenyuanmingdanEntity> wrapper);
	
	RenyuanmingdanVO selectVO(@Param("ew") Wrapper<RenyuanmingdanEntity> wrapper);
	
	List<RenyuanmingdanView> selectListView(@Param("ew") Wrapper<RenyuanmingdanEntity> wrapper);

	List<RenyuanmingdanView> selectListView(Pagination page,@Param("ew") Wrapper<RenyuanmingdanEntity> wrapper);
	
	RenyuanmingdanView selectView(@Param("ew") Wrapper<RenyuanmingdanEntity> wrapper);
	

}
