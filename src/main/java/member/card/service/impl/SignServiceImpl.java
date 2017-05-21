package member.card.service.impl;

import member.card.dao.MemberMapper;
import member.card.dao.PayOrderMapper;
import member.card.dao.RechargeOrderMapper;
import member.card.dao.SignMapper;
import member.card.model.*;
import member.card.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2015/8/4.
 */
@Service
public class SignServiceImpl implements SignService {
    @Autowired
    private SignMapper signMapper;
    @Autowired
    private MemberMapper memberMapper;
    @Autowired
    private PayOrderMapper payOrderMapper;
    @Autowired
    private RechargeOrderMapper rechargeOrderMapper;


    public int insertSign(Sign sign) {
        return signMapper.insertSelective(sign);
    }

    @Override
    public List<Member> getMember(MemberExample member) {
        return memberMapper.selectByExample(member);
    }

    @Override
    public int updateMember(Member member, MemberExample memberExample) {
        return memberMapper.updateByExampleSelective(member, memberExample);
    }

    @Override
    public List<PayOrder> getPayOrder(PayOrderExample payOrderExample) {
        return payOrderMapper.selectByExample(payOrderExample);
    }

    @Override
    public List<RechargeOrder> getRechargeOrder(RechargeOrderExample rechargeOrderExample) {
        return rechargeOrderMapper.selectByExample(rechargeOrderExample);
    }
}
