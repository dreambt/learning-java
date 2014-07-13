/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package cn.im47.demo.designpattern.adapter01.settleAccount.impl;

import cn.im47.demo.designpattern.adapter01.settleAccount.SettleAccountDTO;
import cn.im47.demo.designpattern.adapter01.settleAccount.SettleAccountQueryFacade;

/**
 * <p>Title: </p>
 * <p>Description: 描述</p>
 * <p>Copyright: Copyright (c)2011</p>
 * <p>Company: 易宝支付(YeePay)</p>
 *
 * @author baitao.ji
 * @version 0.1, 14-4-21 0:06
 */
public class SettleAccountQueryFacadeImpl implements SettleAccountQueryFacade {

	@Override
	public SettleAccountDTO getAccountByAccountNo(String accountNo) {
		SettleAccountDTO accountDTO = new SettleAccountDTO();
		accountDTO.setAccountNo(accountNo);
		return accountDTO;
	}

}
