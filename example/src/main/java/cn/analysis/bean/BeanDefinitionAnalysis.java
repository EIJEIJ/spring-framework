package cn.analysis.bean;

import cn.analysis.Application;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * BeanDefinition 的使用
 * @author zhaojie
 * @date 2021/10/13 21:46:37
 */
public class BeanDefinitionAnalysis {

	public static void main(String[] args) {
		// 从 IoC 容器中获取 beanDefinition
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);
		BeanDefinition beanDefinition = applicationContext.getBeanDefinition("beanDefinitionTest");
		System.out.println("=== " + beanDefinition.getScope());
		System.out.println("=== " + beanDefinition.getBeanClassName());

		// 实现 BeanFactoryAware 方法获取 beanFactory，再获取 beanDefinition
		BeanDefinitionTest bean = applicationContext.getBean("beanDefinitionTest", BeanDefinitionTest.class);
		DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) bean.getBeanFactory();
		System.out.println("=== " + beanFactory.getBeanDefinition("beanDefinitionTest").getBeanClassName());
	}
}