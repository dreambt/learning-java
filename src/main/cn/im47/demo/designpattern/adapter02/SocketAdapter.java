/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package cn.im47.demo.designpattern.adapter02;

/**
 * <p>Title: Adapter</p>
 * <p>Description: 适配器类，继承了被适配类，同时实现标准接口</p>
 * <p>Copyright: Copyright (c)2011</p>
 * <p>Company: 易宝支付(YeePay)</p>
 *
 * @author baitao.ji
 * @version 0.1, 14-4-21 8:57
 */
public class SocketAdapter implements DBSocket {

	private GBSocket gbSocket;

	public SocketAdapter(GBSocket gbSocket) {
		this.gbSocket = gbSocket;
	}

	@Override
	public void powerWithTwoRound() {
		System.out.println("使用适配器");

		gbSocket.powerWithThreeFlat();
	}
}
