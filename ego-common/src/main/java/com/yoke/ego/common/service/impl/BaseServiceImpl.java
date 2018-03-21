package com.yoke.ego.common.service.impl;

import com.sun.prism.impl.Disposer;
import com.yoke.ego.common.service.BaseService;
import com.yoke.ego.common.util.InstanceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Yoke on 2018/3/19
 */
public class BaseServiceImpl<Mapper, Record, Example> implements BaseService<Record, Example> {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseServiceImpl.class);
    @Autowired
    private Mapper mapper;


    public long countByExample(Object o) {
        Object result = null;
        try {
            result = InstanceUtil.invokeMethod(mapper, "countByExample", (Object) null);
        } catch (Exception e) {
            LOGGER.info("执行方法countExample错误{}", e);
            e.printStackTrace();
        }
        return Long.parseLong(String.valueOf(result));
    }

    public int deleteByExample(Object o) {
        return 0;
    }

    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    public int insert(Object o) {
        return 0;
    }

    public int insertSelective(Object o) {
        return 0;
    }

    public List<Record> selectByExampleWithBLOBs(Object o) {
        return null;
    }

    public List<Record> selectByExample(Object o) {
        return null;
    }

    public Record selectByPrimaryKey(Long id) {
        return null;
    }

    public int updateByExampleSelective(Object o, Object o2) {
        return 0;
    }

    public int updateByExampleWithBLOBs(Object o, Object o2) {
        return 0;
    }

    public int updateByExample(Object o, Object o2) {
        return 0;
    }

    public int updateByPrimaryKeySelective(Object o) {
        return 0;
    }

    public int updateByPrimaryKeyWithBLOBs(Object o) {
        return 0;
    }

    public int updateByPrimaryKey(Object o) {
        return 0;
    }
}
