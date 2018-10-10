package com.hzcf.hzc.admin.service;


import com.baomidou.mybatisplus.service.IService;
import com.hzcf.hzc.admin.model.entity.SysMenu;
import com.hzcf.hzc.common.vo.MenuVO;

import java.util.List;

/**
 * <p>
 * 菜单权限表 服务类
 * </p>
 *
 * @author baiyun
 * @since 2017-10-29
 */
public interface SysMenuService extends IService<SysMenu> {
    /**
     * 通过角色名称查询URL 权限
     *
     * @param role 角色名称
     * @return 菜单列表
     */
    List<MenuVO> findMenuByRoleName(String role);

    /**
     * 级联删除菜单
     *
     * @param id   菜单ID
     * @return 成功、失败
     */
    Boolean deleteMenu(Integer id);

    /**
     * 更新菜单信息
     *
     * @param sysMenu 菜单信息
     * @return 成功、失败
     */
    Boolean updateMenuById(SysMenu sysMenu);
}
