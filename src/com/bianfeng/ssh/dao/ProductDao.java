package com.bianfeng.ssh.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bianfeng.ssh.domain.Product;

public class ProductDao extends HibernateDaoSupport {
	/**
	 * DAO中保存商品的方法
	 * 
	 * @param product
	 */
	public void save(Product product) {
		System.out.println("dao中的save方法....");
		// dao中调用模板中的save方法
		//HibernateTemplate模板类不能直接支持Query,Criteria接口操作，所以可以通过回调函数传递Session对象，来使用这两个接口。    
	    //当调用execute方法时，execute方法会回调参数对象的重写方法(doInHibernate).  
		this.getHibernateTemplate().save(product);
	}
}
