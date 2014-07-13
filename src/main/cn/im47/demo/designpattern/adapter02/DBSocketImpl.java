/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package cn.im47.demo.designpattern.adapter02;

/**
 * <p>Title: </p>
 * <p>Description: 描述</p>
 * <p>Copyright: Copyright (c)2011</p>
 * <p>Company: 易宝支付(YeePay)</p>
 *
 * @author baitao.ji
 * @version 0.1, 14-4-21 8:47
 */
public class DBSocketImpl implements DBSocket {
	@Override
	public void powerWithTwoRound() {
		System.out.println("使用德国两口插头供电");
	}
}
