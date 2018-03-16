package com.work;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestThread {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(1);

		for (int i = 0; i <= 5; i++) {
			executorService.execute(new Runnable() {
				public void run() {
					try {

						TimeUnit.SECONDS.sleep(10);
						System.out.println("Asynchronous task" + this.hashCode());
					} catch (Exception e) {

					}
				}
			});

		}
		executorService.shutdown();
	}
}
