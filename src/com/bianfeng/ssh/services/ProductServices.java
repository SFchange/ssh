package com.bianfeng.ssh.services;

import com.bianfeng.ssh.dao.ProductDao;
import com.bianfeng.ssh.domain.Product;

public class ProductServices {
	// 业务层注入Dao层的类
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	/**
	 * 业务层保存商品的方法
	 * 
	 * @param product
	 * @return
	 */
	public void save(Product product) {
		System.out.println("services中的save方法....");
		productDao.save(product);
	}

}
