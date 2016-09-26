package com.bianfeng.ssh.services;

import com.bianfeng.ssh.dao.ProductDao;

public class ProductServices {
	// 业务层注入Dao层的类
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
}
