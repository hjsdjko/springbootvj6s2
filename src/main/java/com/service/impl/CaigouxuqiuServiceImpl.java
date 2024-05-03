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


import com.dao.CaigouxuqiuDao;
import com.entity.CaigouxuqiuEntity;
import com.service.CaigouxuqiuService;
import com.entity.vo.CaigouxuqiuVO;
import com.entity.view.CaigouxuqiuView;

@Service("caigouxuqiuService")
public class CaigouxuqiuServiceImpl extends ServiceImpl<CaigouxuqiuDao, CaigouxuqiuEntity> implements CaigouxuqiuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaigouxuqiuEntity> page = this.selectPage(
                new Query<CaigouxuqiuEntity>(params).getPage(),
                new EntityWrapper<CaigouxuqiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaigouxuqiuEntity> wrapper) {
		  Page<CaigouxuqiuView> page =new Query<CaigouxuqiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaigouxuqiuVO> selectListVO(Wrapper<CaigouxuqiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaigouxuqiuVO selectVO(Wrapper<CaigouxuqiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaigouxuqiuView> selectListView(Wrapper<CaigouxuqiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaigouxuqiuView selectView(Wrapper<CaigouxuqiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
