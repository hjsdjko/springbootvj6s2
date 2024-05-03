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


import com.dao.FuzerenDao;
import com.entity.FuzerenEntity;
import com.service.FuzerenService;
import com.entity.vo.FuzerenVO;
import com.entity.view.FuzerenView;

@Service("fuzerenService")
public class FuzerenServiceImpl extends ServiceImpl<FuzerenDao, FuzerenEntity> implements FuzerenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuzerenEntity> page = this.selectPage(
                new Query<FuzerenEntity>(params).getPage(),
                new EntityWrapper<FuzerenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuzerenEntity> wrapper) {
		  Page<FuzerenView> page =new Query<FuzerenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuzerenVO> selectListVO(Wrapper<FuzerenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuzerenVO selectVO(Wrapper<FuzerenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuzerenView> selectListView(Wrapper<FuzerenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuzerenView selectView(Wrapper<FuzerenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
