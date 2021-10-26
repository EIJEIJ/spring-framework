package cn.analysis.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author zhaojie
 * @date 2021/10/26 14:07:00
 */
@Component
@Aspect
public class LogTestAop {

	@Pointcut("execution(public * cn.analysis.aop.*.*(..))")
	public void methodArgs() {}

	@Before("methodArgs()")
	public void before() {
		System.out.println("Before target method invoke.");
	}

	@After("methodArgs()")
	public void after() {
		System.out.println("After target method invoke.");
	}
}