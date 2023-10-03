package com.alinesno.infra.common.web.adapter.login.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alinesno.infra.common.facade.response.AjaxResult;
import com.alinesno.infra.common.web.adapter.dto.LoginBodyDto;
import com.alinesno.infra.common.web.adapter.dto.menus.Menu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CommonLoginController {

    /**
     * 令牌
     */
    public static final String TOKEN = "token";

    /**
     * 登录方法
     *
     * @param loginBody 登录信息
     * @return 结果
     */
    @PostMapping("/login")
    public AjaxResult login(@RequestBody LoginBodyDto loginBody)
    {
        AjaxResult ajax = AjaxResult.success();
        // 生成令牌
        String token = UUID.randomUUID().toString() ;
        ajax.put(TOKEN, token);
        return ajax;
    }

    /**
     * 获取用户信息
     *
     * @return 用户信息
     */
    @GetMapping("getInfo")
    public AjaxResult getInfo() {

        Map<String, Object> data = new HashMap<>();
        // 将数据填充到data中...
        data.put("permissions", new String[]{"*:*:*"});

        Map<String, Object> user = new HashMap<>();
        user.put("createBy", "admin");
        user.put("createTime", "2023-04-23 16:11:38");
        user.put("updateBy", null);
        user.put("updateTime", null);
        user.put("remark", "管理员");
        user.put("userId", 1);
        user.put("deptId", 103);
        user.put("userName", "admin");
        user.put("nickName", "AIP技术团队");
        user.put("email", "aip-team@163.com");
        user.put("phonenumber", "15888888888");
        user.put("sex", "1");
        user.put("avatar", "");
        user.put("password", "");
        user.put("status", "0");
        user.put("delFlag", "0");
        user.put("loginIp", "");
        user.put("loginDate", "2023-09-21T16:54:12.000+08:00");

        Map<String, Object> dept = new HashMap<>();
        dept.put("createBy", null);
        dept.put("createTime", null);
        dept.put("updateBy", null);
        dept.put("updateTime", null);
        dept.put("remark", null);
        dept.put("deptId", 103);
        dept.put("parentId", 101);
        dept.put("ancestors", "0,100,101");
        dept.put("deptName", "研发部门");
        dept.put("orderNum", 1);
        dept.put("leader", "AIP技术团队");
        dept.put("phone", null);
        dept.put("email", null);
        dept.put("status", "0");
        dept.put("delFlag", null);
        dept.put("parentName", null);
        dept.put("children", new Object[]{});

        user.put("dept", dept);

        Map<String, Object> role = new HashMap<>();
        role.put("createBy", null);
        role.put("createTime", null);
        role.put("updateBy", null);
        role.put("updateTime", null);
        role.put("remark", null);
        role.put("roleId", 1);
        role.put("roleName", "超级管理员");
        role.put("roleKey", "admin");
        role.put("roleSort", 1);
        role.put("dataScope", "1");
        role.put("menuCheckStrictly", false);
        role.put("deptCheckStrictly", false);
        role.put("status", "0");
        role.put("delFlag", null);
        role.put("flag", false);
        role.put("menuIds", null);
        role.put("deptIds", null);
        role.put("permissions", null);
        role.put("admin", true);

        user.put("roles", new Object[]{role});

        AjaxResult ajax = AjaxResult.success();
        ajax.put("user", user);
        ajax.put("roles", user.get("roles"));
        ajax.put("permissions", data.get("permissions"));

        return ajax;
    }

    /**
     * 获取路由信息
     *
     * @return 路由信息
     */
    @GetMapping("getRouters")
    public AjaxResult getRouters()
    {

        Menu dashboardMenu = new Menu("Dashboard", "/dashboard", false, "noRedirect", "Layout", true, new Menu.Meta("仪盘表", "dashboard", false, null), List.of(
                new Menu("Dashboard", "index", false, false , "dashboard", new Menu.Meta("概览", "dashboard", false, null))
        ));

        Menu systemMenu = new Menu("System", "/system", false, "noRedirect", "Layout", true, new Menu.Meta("风险管理", "post", false, null),
                List.of(
                        new Menu("Tenant", "system/tenant/index", false,false,  "system/tenant/index", new Menu.Meta("日志分析", "tree", false, null)),
                        new Menu("User", "system/user/index", false,false,  "system/user/index", new Menu.Meta("登陆风险", "user", false, null)),
                        new Menu("Tenant", "system/tenant/index", false,false,  "system/tenant/index", new Menu.Meta("攻击分析", "tree", false, null)),
                        new Menu("Tenant", "system/tenant/index", false,false,  "system/tenant/index", new Menu.Meta("代码风险", "tree", false, null)),
                        new Menu("Tenant", "system/tenant/index", false,false,  "system/tenant/index", new Menu.Meta("规范分析", "tree", false, null))

                ));

        Menu serviceMenu = new Menu("Log", "/log", false, "noRedirect", "Layout", true, new Menu.Meta("安全防护", "log", false, null),
                        List.of(
                                new Menu("Operlog", "monitor/operlog/index", false,false, "monitor/operlog/index", new Menu.Meta("服务防御", "form", false, null)),
                                new Menu("Logininfor", "monitor/logininfor/index", false,false, "monitor/logininfor/index", new Menu.Meta("请求防护", "logininfor", false, null))
                        ));

        Menu monitorMenu = new Menu("Monitor", "/monitor", false, "noRedirect", "Layout", true, new Menu.Meta("资产管理", "monitor", false, null),
                List.of(
                        new Menu("Online", "monitor/online/index", false,false, "monitor/online/index", new Menu.Meta("服务资产", "online", false, null)),
                        new Menu("Cache", "monitor/cache/index", false,false, "monitor/cache/index", new Menu.Meta("容器资产", "redis", false, null))
                ));

        Menu themeMenu = new Menu("Theme", "/theme", false, "noRedirect", "Layout", true, new Menu.Meta("合规配置", "tool", false, null),
                List.of(
                        new Menu("Build", "tool/build/index", false,false, "tool/build/index", new Menu.Meta("运行配置", "build", false, null)),
                        new Menu("Swagger", "tool/swagger/index",false, false, "tool/swagger/index", new Menu.Meta("合规检查", "swagger", false, null)),
                        new Menu("Swagger", "tool/swagger/index",false, false, "tool/swagger/index", new Menu.Meta("通知设置", "swagger", false, null)),
                        new Menu("Swagger", "tool/swagger/index",false, false, "tool/swagger/index", new Menu.Meta("安全报告", "swagger", false, null))
                ));

        List<Menu> menus = List.of(dashboardMenu , systemMenu, serviceMenu , monitorMenu, themeMenu);

        return AjaxResult.success(menus) ;
    }
}