package cn.mldn.mldnspring.context.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mldn.mldnspring.context.dao.IDeptDAO;
import cn.mldn.mldnspring.context.service.IDeptService;
import cn.mldn.mldnspring.context.vo.Dept;

@Service
public class DeptServiceImpl implements IDeptService {
	@Resource
	private IDeptDAO deptDAO;
	@Override
	public boolean add(Dept dept) {
		System.out.println("****Dept业务层调用****");

		return deptDAO.doCreate(dept);
	}

}
