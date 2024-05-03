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


import com.dao.QiandaobaobeiDao;
import com.entity.QiandaobaobeiEntity;
import com.service.QiandaobaobeiService;
import com.entity.vo.QiandaobaobeiVO;
import com.entity.view.QiandaobaobeiView;

@Service("qiandaobaobeiService")
public class QiandaobaobeiServiceImpl extends ServiceImpl<QiandaobaobeiDao, QiandaobaobeiEntity> implements QiandaobaobeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiandaobaobeiEntity> page = this.selectPage(
                new Query<QiandaobaobeiEntity>(params).getPage(),
                new EntityWrapper<QiandaobaobeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiandaobaobeiEntity> wrapper) {
		  Page<QiandaobaobeiView> page =new Query<QiandaobaobeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiandaobaobeiVO> selectListVO(Wrapper<QiandaobaobeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiandaobaobeiVO selectVO(Wrapper<QiandaobaobeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiandaobaobeiView> selectListView(Wrapper<QiandaobaobeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiandaobaobeiView selectView(Wrapper<QiandaobaobeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
