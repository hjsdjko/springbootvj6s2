package com.dao;

import com.entity.QiandaobaobeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiandaobaobeiVO;
import com.entity.view.QiandaobaobeiView;


/**
 * 签到报备
 * 
 * @author 
 * @email 
 * @date 2022-04-15 18:03:02
 */
public interface QiandaobaobeiDao extends BaseMapper<QiandaobaobeiEntity> {
	
	List<QiandaobaobeiVO> selectListVO(@Param("ew") Wrapper<QiandaobaobeiEntity> wrapper);
	
	QiandaobaobeiVO selectVO(@Param("ew") Wrapper<QiandaobaobeiEntity> wrapper);
	
	List<QiandaobaobeiView> selectListView(@Param("ew") Wrapper<QiandaobaobeiEntity> wrapper);

	List<QiandaobaobeiView> selectListView(Pagination page,@Param("ew") Wrapper<QiandaobaobeiEntity> wrapper);
	
	QiandaobaobeiView selectView(@Param("ew") Wrapper<QiandaobaobeiEntity> wrapper);
	

}
