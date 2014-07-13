/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package cn.im47.demo.designpattern.adapter01;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>Title: </p>
 * <p>Description: 描述</p>
 * <p>Copyright: Copyright (c)2011</p>
 * <p>Company: 易宝支付(YeePay)</p>
 *
 * @author baitao.ji
 * @version 0.1, 14-4-21 0:04
 */
public final class AccountDTO implements Serializable {

	private static final long serialVersionUID = -6749308710177014353L;

	/**
	 * 账号
	 */
	private String accountNo;

	/**
	 * 客户
	 */
	private String customerNo;

	/**
	 * 账户类型
	 */
	private String accountType;

	/**
	 * 币种名称
	 */
//	private CurrencyEnum currency;

	/**
	 * 账户提供方编号
	 */
	private String accountProviderCode;

	/**
	 * 帐户提供方名称
	 */
	private String accountProviderName;

	/**
	 * 账户状态
	 */
	private Integer accountStatusCode;

	/**
	 * 账户状态
	 */
//	private AccountStatusEnum accountStatus;

	/**
	 * 账户余额
	 */
	private BigDecimal balance;

	/**
	 * 交易密码
	 */
	private String transactionPassword;

	/**
	 * 可提现额度
	 */
	private BigDecimal availableWithdrawQuota = BigDecimal.ZERO;

	/**
	 * 冻结额度
	 */
	private BigDecimal frozenQuota = BigDecimal.ZERO;

	/**
	 * 固定保证金
	 */
	private BigDecimal fixedCautionMoney = BigDecimal.ZERO;

	/**
	 * 循环保证金
	 */
	private BigDecimal cycledCautionMoney = BigDecimal.ZERO;

	/**
	 * 创建时间
	 */
	private Date createDate;

	/**
	 * 备注
	 */
	private String remark;

	public AccountDTO() {

	}

	/**
	 * 获得可用余额
	 *
	 * @return
	 */
	public BigDecimal getAvailableBalance() {
		return balance.subtract(frozenQuota).subtract(fixedCautionMoney)
				.subtract(cycledCautionMoney);
	}

	/**
	 * 判断账户状态是否正常
	 *
	 * @return
	 */
//	public boolean isAvailable() {
//		if (AccountStatusEnum.ACCOUNT_AVAILABLE == accountStatus) {
//			return true;
//		}
//		return false;
//	}

	/**
	 * 判断帐户状态是否是冻结状态
	 *
	 * @return
	 */
//	public boolean isFrozen() {
//		if (AccountStatusEnum.ACCOUNT_FROZEN == accountStatus) {
//			return true;
//		}
//		return false;
//	}

	/**
	 * 判断帐户状态是否是冻结止付状态
	 *
	 * @return
	 */
//	public boolean isFrozenDebit() {
//		if (AccountStatusEnum.ACCOUNT_FREEZE_DEBIT == accountStatus) {
//			return true;
//		}
//		return false;
//	}

	/**
	 * 判断帐户状态是否是冻结止收状态
	 *
	 * @return
	 */
//	public boolean isFrozenCredit() {
//		if (AccountStatusEnum.ACCOUNT_FREEZE_CREDIT == accountStatus) {
//			return true;
//		}
//		return false;
//	}
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

//	public CurrencyEnum getCurrency() {
//		return currency;
//	}
//
//	public void setCurrency(CurrencyEnum currency) {
//		this.currency = currency;
//	}

	public String getAccountProviderCode() {
		return accountProviderCode;
	}

	public void setAccountProviderCode(String accountProviderCode) {
		this.accountProviderCode = accountProviderCode;
	}

	public String getAccountProviderName() {
		return accountProviderName;
	}

	public void setAccountProviderName(String accountProviderName) {
		this.accountProviderName = accountProviderName;
	}

	public Integer getAccountStatusCode() {
		return accountStatusCode;
	}

	public void setAccountStatusCode(Integer accountStatusCode) {
		this.accountStatusCode = accountStatusCode;
	}

//	public AccountStatusEnum getAccountStatus() {
//		return accountStatus;
//	}
//
//	public void setAccountStatus(AccountStatusEnum accountStatus) {
//		this.accountStatus = accountStatus;
//	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getTransactionPassword() {
		return transactionPassword;
	}

	public void setTransactionPassword(String transactionPassword) {
		this.transactionPassword = transactionPassword;
	}

	public BigDecimal getAvailableWithdrawQuota() {
		return availableWithdrawQuota;
	}

	public void setAvailableWithdrawQuota(BigDecimal availableWithdrawQuota) {
		this.availableWithdrawQuota = availableWithdrawQuota;
	}

	public BigDecimal getFrozenQuota() {
		return frozenQuota;
	}

	public void setFrozenQuota(BigDecimal frozenQuota) {
		this.frozenQuota = frozenQuota;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public BigDecimal getFixedCautionMoney() {
		return fixedCautionMoney;
	}

	public void setFixedCautionMoney(BigDecimal fixedCautionMoney) {
		this.fixedCautionMoney = fixedCautionMoney;
	}

	public BigDecimal getCycledCautionMoney() {
		return cycledCautionMoney;
	}

	public void setCycledCautionMoney(BigDecimal cycledCautionMoney) {
		this.cycledCautionMoney = cycledCautionMoney;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
