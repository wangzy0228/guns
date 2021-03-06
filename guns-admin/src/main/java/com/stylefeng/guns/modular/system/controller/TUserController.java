package com.stylefeng.guns.modular.system.controller;

import com.stylefeng.guns.core.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import com.stylefeng.guns.core.log.LogObjectHolder;
import org.springframework.web.bind.annotation.RequestParam;
import com.stylefeng.guns.modular.system.model.TUser;
import com.stylefeng.guns.modular.system.service.ITUserService;

/**
 * 客户端用户管理控制器
 *
 * @author fengshuonan
 * @Date 2018-03-18 13:04:05
 */
@Controller
@RequestMapping("/tUser")
public class TUserController extends BaseController {

    private String PREFIX = "/system/tUser/";

    @Autowired
    private ITUserService tUserService;

    /**
     * 跳转到客户端用户管理首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "tUser.html";
    }

    /**
     * 跳转到添加客户端用户管理
     */
    @RequestMapping("/tUser_add")
    public String tUserAdd() {
        return PREFIX + "tUser_add.html";
    }

    /**
     * 跳转到修改客户端用户管理
     */
    @RequestMapping("/tUser_update/{tUserId}")
    public String tUserUpdate(@PathVariable Integer tUserId, Model model) {
        TUser tUser = tUserService.selectById(tUserId);
        model.addAttribute("item",tUser);
        LogObjectHolder.me().set(tUser);
        return PREFIX + "tUser_edit.html";
    }
    /**
     * 跳转到审核客户端用户管理
     */
    @RequestMapping("/tUser_check/{tUserId}")
    public String tUserCheck(@PathVariable Integer tUserId, Model model) {
        TUser tUser = tUserService.selectById(tUserId);
        model.addAttribute("item",tUser);
        LogObjectHolder.me().set(tUser);
        return PREFIX + "tUser_check.html";
    }

    /**
     * 获取客户端用户管理列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return tUserService.selectList(null);
    }

    /**
     * 新增客户端用户管理
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(TUser tUser) {
        tUserService.insert(tUser);
        return SUCCESS_TIP;
    }

    /**
     * 删除客户端用户管理
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer tUserId) {
        tUserService.deleteById(tUserId);
        return SUCCESS_TIP;
    }

    /**
     * 修改客户端用户管理
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(TUser tUser) {
        tUserService.updateById(tUser);
        return SUCCESS_TIP;
    }

    /**
     * 客户端用户管理详情
     */
    @RequestMapping(value = "/detail/{tUserId}")
    @ResponseBody
    public Object detail(@PathVariable("tUserId") Integer tUserId) {
        return tUserService.selectById(tUserId);
    }
}
