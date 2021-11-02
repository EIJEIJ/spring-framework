package cn.analysis.transaction;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhaojie
 * @date 2021/11/02 15:58:11
 */
@Component
public class TransactionAnalysis {

	@Transactional
	public void transactionTest1() {
		System.out.println("进入事务 Test1，准备执行 SQL ...");
		System.out.println("进入事务 Test1，完成执行 SQL ...");
	}
}