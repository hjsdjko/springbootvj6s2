package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.RenyuanmingdanDao;
import com.entity.RenyuanmingdanEntity;
import com.service.RenyuanmingdanService;
import com.entity.vo.RenyuanmingdanVO;
import com.entity.view.RenyuanmingdanView;

@Service("renyuanmingdanService")
public class RenyuanmingdanServiceImpl extends ServiceImpl<RenyuanmingdanDao, RenyuanmingdanEntity> implements RenyuanmingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenyuanmingdanEntity> page = this.selectPage(
                new Query<RenyuanmingdanEntity>(params).getPage(),
                new EntityWrapper<RenyuanmingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenyuanmingdanEntity> wrapper) {
		  Page<RenyuanmingdanView> page =new Query<RenyuanmingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenyuanmingdanVO> selectListVO(Wrapper<RenyuanmingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenyuanmingdanVO selectVO(Wrapper<RenyuanmingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenyuanmingdanView> selectListView(Wrapper<RenyuanmingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenyuanmingdanView selectView(Wrapper<RenyuanmingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
