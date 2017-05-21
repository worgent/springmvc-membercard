package member.card.dao;

import java.util.List;
import member.card.model.PayOrder;
import member.card.model.PayOrderExample;
import org.apache.ibatis.annotations.Param;

public interface PayOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_order
     *
     * @mbggenerated
     */
    int countByExample(PayOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_order
     *
     * @mbggenerated
     */
    int deleteByExample(PayOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_order
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_order
     *
     * @mbggenerated
     */
    int insert(PayOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_order
     *
     * @mbggenerated
     */
    int insertSelective(PayOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_order
     *
     * @mbggenerated
     */
    List<PayOrder> selectByExample(PayOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_order
     *
     * @mbggenerated
     */
    PayOrder selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_order
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PayOrder record, @Param("example") PayOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_order
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PayOrder record, @Param("example") PayOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_order
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PayOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_order
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PayOrder record);
}