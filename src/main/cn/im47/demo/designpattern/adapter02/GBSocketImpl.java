/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package cn.im47.demo.designpattern.adapter02;

/**
 * <p>Title: ConcreteTarget</p>
 * <p>Description: 具体目标类，只提供普通功能</p>
 * <p>Copyright: Copyright (c)2011</p>
 * <p>Company: 易宝支付(YeePay)</p>
 *
 * @author baitao.ji
 * @version 0.1, 14-4-21 8:55
 */
public class GBSocketImpl implements GBSocket {
	@Override
	public void powerWithThreeFlat() {
		System.out.println("使用国标三项扁插头供电");
	}
}
