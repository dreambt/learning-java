/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package cn.im47.demo.c31;

/**
 * <p>Title: kejianxing </p>
 * <p>Description: 描述</p>
 * <p>Copyright: Copyright (c)2011</p>
 * <p>Company: 易宝支付(YeePay)</p>
 *
 * @author baitao.ji
 * @version 0.1, 14-3-30 11:24
 */
public class NoVisibility {

	private static boolean ready;

	private static int number;

	public static void main(String[] args) throws InterruptedException {
		new ReaderThread().start();
//		Thread.sleep(1);
		ready = true;
		number = 24;
	}

	private static class ReaderThread extends Thread {
		public void run() {
			while (!ready) {
				Thread.yield();
			}
			// 有可能会先输出0
			System.out.println(number);
		}
	}

}
