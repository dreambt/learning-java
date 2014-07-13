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
 * @version 0.1, 14-4-21 8:49
 */
public class DGHotel {

	private DBSocket dbSocket;

	public DGHotel(DBSocket dbSocket) {
		this.dbSocket = dbSocket;
	}

	/**
	 * 充电
	 */
	public void charge(){
		dbSocket.powerWithTwoRound();
	}

	public void setDbSocket(DBSocket dbSocket) {
		this.dbSocket = dbSocket;
	}

}
