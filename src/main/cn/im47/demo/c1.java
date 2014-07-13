/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package cn.im47.demo;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * <p>Title: </p>
 * <p>Description: 描述</p>
 * <p>Copyright: Copyright (c)2011</p>
 * <p>Company: 易宝支付(YeePay)</p>
 *
 * @author baitao.ji
 * @version 0.1, 14-3-30 11:54
 */
public class c1 {

	private static boolean ready;

	// 提供同步的弱形式
//	private volatile static int number;

	private static int number;

	private static ReentrantReadWriteLock.ReadLock readLock = new ReentrantReadWriteLock().readLock();

	public static void main(String[] args) throws InterruptedException {
		new InceThread().start();
		new InceThread().start();
		ready = true;
	}

	private static class InceThread extends Thread {
		public void run() {
			synchronized (readLock) {
				while (ready) {
					if (number == 100) {
						ready = false;
					}
					System.out.println(number++ + " " + this.getName());
				}
			}
		}
	}

}
