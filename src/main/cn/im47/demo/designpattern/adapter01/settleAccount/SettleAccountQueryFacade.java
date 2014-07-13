/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package cn.im47.demo.designpattern.adapter01.settleAccount;

/**
 * <p>Title: </p>
 * <p>Description: 描述</p>
 * <p>Copyright: Copyright (c)2011</p>
 * <p>Company: 易宝支付(YeePay)</p>
 *
 * @author baitao.ji
 * @version 0.1, 14-4-21 0:02
 */
public interface SettleAccountQueryFacade {

	SettleAccountDTO getAccountByAccountNo(String accountNo);

}
