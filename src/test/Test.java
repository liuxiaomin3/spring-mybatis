package test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.User;
import service.UserService;

public class Test {

	public static void main(String[] args) throws ParseException, IOException {
		System.out.println("=========>left");
		System.out.println("======>spring-mybatis4");
		System.out.println("======>spring-mybatis");
		System.out.println("woshilisi");
		System.out.println("woshizhangsan");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml","applicationContext-user.xml","applicationContext-order.xml");
		UserService userService = (UserService)ctx.getBean("userService");
		//UserService userService2 = (UserService)ctx.getBean("userService");
		//System.out.println(userService==userService2);//
		
		
		/*User user = new User();
        user.setUserCode("test001");
        user.setUserName("≤‚ ‘”√ªß001");
        user.setUserPassword("1234567");
        Date birthday =new SimpleDateFormat("yyyy-MM-dd").parse("1984-12-12");
        user.setBirthday(birthday);
        user.setCreationDate(new Date());
        user.setAddress("µÿ÷∑≤‚ ‘");
        user.setGender(1);
        user.setPhone("13688783697");
        user.setUserRole(1);
        user.setCreatedBy(1);
        user.setCreationDate(new Date());
        
		userService.addUser(user);*/
		
		
		User user=new User();
		user.setUserName("’‘");
		user.setUserRole(3);
		List<User> userList = userService.getUserListByNameAndRoleId(user);
		for (User user2 : userList) {
			System.out.println(user2);
		}
	}

}
