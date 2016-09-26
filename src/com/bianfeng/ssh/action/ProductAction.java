package com.bianfeng.ssh.action;

import com.bianfeng.ssh.domain.Product;
import com.bianfeng.ssh.services.ProductServices;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 商品管理action类
 * 
 * @author sf
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product> {
	// 模型驱动所使用的类
	private Product product;

	@Override
	public Product getModel() {
		// TODO Auto-generated method stub
		return product;
	}

	// Struts2和Spring整合过程中按名称自动注入的业务类
	private ProductServices productServices;

	public void setProductServices(ProductServices productServices) {
		this.productServices = productServices;
	}

}
