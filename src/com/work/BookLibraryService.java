package com.work;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

@Stateless
public class BookLibraryService {

	/*
	 * @Inject private EntityManager entityManager;
	 * 
	 * @Inject private Logger logger;
	 */

	@Interceptors(LoggingIntercept.class)
	public void createPatron(String testatron) {

		System.out.println("Insie createPatron" + testatron);
	}

	public static void main(String str[]) {
		new BookLibraryService().createPatron("Welcome ZZZZZZZZ");
	}
}
