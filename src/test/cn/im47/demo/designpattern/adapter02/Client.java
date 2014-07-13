/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package cn.im47.demo.designpattern.adapter02;

import org.junit.Test;

/**
 * <p>Title: </p>
 * <p>Description: 描述</p>
 * <p>Copyright: Copyright (c)2011</p>
 * <p>Company: 易宝支付(YeePay)</p>
 *
 * @author baitao.ji
 * @version 0.1, 14-4-21 8:52
 */
public class Client {
	@Test
	public void testCharge() throws Exception {
		GBSocket gbSocket = new GBSocketImpl();
		DGHotel hotel = new DGHotel(new SocketAdapter(gbSocket));
		hotel.charge();
	}
}
