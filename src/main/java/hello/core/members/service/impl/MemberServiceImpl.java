package hello.core.members.service.impl;

import hello.core.members.domain.Member;
import hello.core.members.repository.MemberRepository;
import hello.core.members.repository.impl.MemoryMemberRepository;
import hello.core.members.service.MemberService;

public class MemberServiceImpl implements MemberService {

//    private final MemberRepository memberRepository=new MemoryMemberRepository();

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository){
        this.memberRepository=memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long id) {
        return memberRepository.findById(id);
    }
}
