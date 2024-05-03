package com.dao;

import com.entity.FuzerenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuzerenVO;
import com.entity.view.FuzerenView;


/**
 * 负责人
 * 
 * @author 
 * @email 
 * @date 2022-04-15 18:03:02
 */
public interface FuzerenDao extends BaseMapper<FuzerenEntity> {
	
	List<FuzerenVO> selectListVO(@Param("ew") Wrapper<FuzerenEntity> wrapper);
	
	FuzerenVO selectVO(@Param("ew") Wrapper<FuzerenEntity> wrapper);
	
	List<FuzerenView> selectListView(@Param("ew") Wrapper<FuzerenEntity> wrapper);

	List<FuzerenView> selectListView(Pagination page,@Param("ew") Wrapper<FuzerenEntity> wrapper);
	
	FuzerenView selectView(@Param("ew") Wrapper<FuzerenEntity> wrapper);
	

}
