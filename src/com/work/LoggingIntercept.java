package com.work;

import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LoggingIntercept {

	@AroundConstruct
	private void onInit(InvocationContext ic) {
		try {
			System.out.println("Logging initialized");
			ic.proceed();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Initialization done");
		}
	}

	@AroundInvoke
	private Object doLog(InvocationContext ic) {
		Object obj = null;
		try {
			System.out.println(ic.getTarget().toString());
			System.out.println(ic.getMethod().getName());
			obj = ic.proceed();
		} catch (Exception ex) {

		} finally {
			// logger.exiting(ic.getTarget().toString(),
			// ic.getMethod().getName());

			System.out.println("Finally metho of doLog");
		}
		return obj;
	}
}