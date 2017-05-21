package member.card.service;

import member.card.model.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2015/8/4.
 */

public interface SignService {

    public int insertSign(Sign sign);

    //根据会员id 和 商户id 查 会员信息
    public List<Member> getMember(MemberExample member);

    //根据会员id 和 商户id 更新会员信息
    public int updateMember(Member member,MemberExample memberExample);

    //根据日期范围 查询相应账单
    public List<PayOrder> getPayOrder(PayOrderExample payOrderExample);
    public List<RechargeOrder> getRechargeOrder(RechargeOrderExample rechargeOrderExample);
}
