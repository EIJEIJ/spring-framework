package cn.analysis.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author zhaojie
 * @date 2021/10/31 16:12:32
 */
@Component
@Aspect
public class LogTest2Aop {

	@Pointcut("execution(public * cn.analysis.aop.*.*(..))")
	public void methodArgs() {}

	@Before("methodArgs()")
	public void before() {
		System.out.println("222 Before target method invoke.");
	}

	@After("methodArgs()")
	public void after() {
		System.out.println("222 After target method invoke.");
	}
}