package cn.analysis.bean;

import org.springframework.stereotype.Component;

/**
 * @author zhaojie
 * @date 2021/10/13 15:51:22
 */
@Component("BeanTest")
public class BeanTest {
	private BeanDefinitionTest beanDefinitionTest;
	private String test;

	public BeanTest(BeanDefinitionTest beanDefinitionTest) {
		this.beanDefinitionTest = beanDefinitionTest;
		// this.test = test;
		System.out.println("111");
	}

	public BeanTest() {
		System.out.println("222");
	}
}