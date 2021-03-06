package member.card.model;

import java.util.Date;

public class RechargeOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_order.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_order.member_id
     *
     * @mbggenerated
     */
    private Integer memberId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_order.business_id
     *
     * @mbggenerated
     */
    private Integer businessId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_order.money
     *
     * @mbggenerated
     */
    private Long money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_order.money_before
     *
     * @mbggenerated
     */
    private Long moneyBefore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_order.money_after
     *
     * @mbggenerated
     */
    private Long moneyAfter;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_order.type
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_order.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_order.recharge_num
     *
     * @mbggenerated
     */
    private String rechargeNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_order.status
     *
     * @mbggenerated
     */
    private Short status;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_order
     *
     * @mbggenerated
     */
    public RechargeOrder(Integer id, Integer memberId, Integer businessId, Long money, Long moneyBefore, Long moneyAfter, Integer type, Date createTime, String rechargeNum, Short status) {
        this.id = id;
        this.memberId = memberId;
        this.businessId = businessId;
        this.money = money;
        this.moneyBefore = moneyBefore;
        this.moneyAfter = moneyAfter;
        this.type = type;
        this.createTime = createTime;
        this.rechargeNum = rechargeNum;
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_order
     *
     * @mbggenerated
     */
    public RechargeOrder() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_order.id
     *
     * @return the value of recharge_order.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_order.id
     *
     * @param id the value for recharge_order.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_order.member_id
     *
     * @return the value of recharge_order.member_id
     *
     * @mbggenerated
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_order.member_id
     *
     * @param memberId the value for recharge_order.member_id
     *
     * @mbggenerated
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_order.business_id
     *
     * @return the value of recharge_order.business_id
     *
     * @mbggenerated
     */
    public Integer getBusinessId() {
        return businessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_order.business_id
     *
     * @param businessId the value for recharge_order.business_id
     *
     * @mbggenerated
     */
    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_order.money
     *
     * @return the value of recharge_order.money
     *
     * @mbggenerated
     */
    public Long getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_order.money
     *
     * @param money the value for recharge_order.money
     *
     * @mbggenerated
     */
    public void setMoney(Long money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_order.money_before
     *
     * @return the value of recharge_order.money_before
     *
     * @mbggenerated
     */
    public Long getMoneyBefore() {
        return moneyBefore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_order.money_before
     *
     * @param moneyBefore the value for recharge_order.money_before
     *
     * @mbggenerated
     */
    public void setMoneyBefore(Long moneyBefore) {
        this.moneyBefore = moneyBefore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_order.money_after
     *
     * @return the value of recharge_order.money_after
     *
     * @mbggenerated
     */
    public Long getMoneyAfter() {
        return moneyAfter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_order.money_after
     *
     * @param moneyAfter the value for recharge_order.money_after
     *
     * @mbggenerated
     */
    public void setMoneyAfter(Long moneyAfter) {
        this.moneyAfter = moneyAfter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_order.type
     *
     * @return the value of recharge_order.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_order.type
     *
     * @param type the value for recharge_order.type
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_order.create_time
     *
     * @return the value of recharge_order.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_order.create_time
     *
     * @param createTime the value for recharge_order.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_order.recharge_num
     *
     * @return the value of recharge_order.recharge_num
     *
     * @mbggenerated
     */
    public String getRechargeNum() {
        return rechargeNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_order.recharge_num
     *
     * @param rechargeNum the value for recharge_order.recharge_num
     *
     * @mbggenerated
     */
    public void setRechargeNum(String rechargeNum) {
        this.rechargeNum = rechargeNum == null ? null : rechargeNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_order.status
     *
     * @return the value of recharge_order.status
     *
     * @mbggenerated
     */
    public Short getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_order.status
     *
     * @param status the value for recharge_order.status
     *
     * @mbggenerated
     */
    public void setStatus(Short status) {
        this.status = status;
    }
}