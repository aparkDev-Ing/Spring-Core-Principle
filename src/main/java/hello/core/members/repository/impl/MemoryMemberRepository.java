package hello.core.members.repository.impl;

import hello.core.members.domain.Member;
import hello.core.members.repository.MemberRepository;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    public static Map<Long,Member> store = new HashMap<>();
    @Override
    public void save(Member member) {
        this.store.put(member.getId(),member);
    }

    @Override
    public Member findById(Long id) {
        return this.store.get(id);
    }
}
