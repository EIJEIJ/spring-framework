package cn.analysis.aop;

import cn.analysis.Application;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhaojie
 * @date 2021/10/26 14:04:40
 */
@Service
public class TargetService {

	@Transactional
	public void targetMethod() {
		System.out.println("Target method invoked...");
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);

		TargetService targetService = applicationContext.getBean("targetService", TargetService.class);
		targetService.targetMethod();
	}
}