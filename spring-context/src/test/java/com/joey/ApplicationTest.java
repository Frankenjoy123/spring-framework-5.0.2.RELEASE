package com.joey;

import com.jeoy.demo.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiaowu.zhou@tongdun.cn on 2018/7/22.
 */
public class ApplicationTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("personContext.xml");

		Person person = (Person) context.getBean("person");

		System.out.println(person);

	}
}
