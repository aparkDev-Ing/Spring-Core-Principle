package hello.core.members.service;

import hello.core.members.domain.Member;

public interface MemberService {

    void join(Member member);
    Member findMember(Long id);

}
