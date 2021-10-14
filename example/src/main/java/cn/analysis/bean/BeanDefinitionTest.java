package cn.analysis.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

/**
 * @author zhaojie
 * @date 2021/10/14 10:15:03
 */
@Component("beanDefinitionTest")
public class BeanDefinitionTest implements BeanFactoryAware {

	private String name;
	private BeanFactory beanFactory;

	public BeanDefinitionTest() {
		System.out.println("BeanDefinitionTest 创建了");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

	public BeanFactory getBeanFactory() {
		return beanFactory;
	}
}