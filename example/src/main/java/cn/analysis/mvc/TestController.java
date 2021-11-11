package cn.analysis.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaojie
 * @date 2021/11/11 21:11:13
 */
@RestController
@RequestMapping("test")
public class TestController {

	@RequestMapping("/controller")
	public String test(@RequestParam String msg) {
		return "TestController invoked, msg is " + msg;
	}
}