package com.yayiya.mall.service.test.rpc;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yayiya.mall.client.test.rpc.RPCTestService;
import com.yayiya.mall.service.test.mapper.TestMapper;
import com.yayiya.mall.service.test.model.TestDO;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * 测试服务
 *
 * @author xfd
 * 2021/7/3
 */
@Slf4j
@Service
public class RPCTestServiceImpl implements RPCTestService
{
    @Autowired
    private TestMapper testMapper;

    @Override
    public String list() {
        QueryWrapper<TestDO> queryWrapper = new QueryWrapper<>();
        List<TestDO> ls = testMapper.selectList(queryWrapper);
        return ls ==null ? "nullstr" : JSON.toJSONString(ls);
    }
}
