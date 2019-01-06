package com.show.admin.scetc.service;

import java.util.List;

import com.show.admin.scetc.pojo.Bgm;
import com.show.admin.scetc.pojo.PageResult;
import com.show.admin.scetc.pojo.Roles;

public interface RolesService {

	/**
	 * 查询所有权限信息
	 * 
	 * @return
	 */
	public List<Roles> queryAll();
}
