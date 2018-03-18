package com.stylefeng.guns.modular.system.service.impl;

import com.stylefeng.guns.modular.system.model.TMessage;
import com.stylefeng.guns.modular.system.dao.TMessageMapper;
import com.stylefeng.guns.modular.system.service.ITMessageService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 消息表 服务实现类
 * </p>
 *
 * @author stylefeng123
 * @since 2018-03-18
 */
@Service
public class TMessageServiceImpl extends ServiceImpl<TMessageMapper, TMessage> implements ITMessageService {

}
