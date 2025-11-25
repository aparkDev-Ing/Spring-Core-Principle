package hello.core.members.repository;

import hello.core.members.domain.Member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long id);


}
