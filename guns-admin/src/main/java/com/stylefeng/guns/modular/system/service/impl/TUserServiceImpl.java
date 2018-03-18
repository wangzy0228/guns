package com.stylefeng.guns.modular.system.service.impl;

import com.stylefeng.guns.modular.system.model.TUser;
import com.stylefeng.guns.modular.system.dao.TUserMapper;
import com.stylefeng.guns.modular.system.service.ITUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author stylefeng123
 * @since 2018-03-18
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
