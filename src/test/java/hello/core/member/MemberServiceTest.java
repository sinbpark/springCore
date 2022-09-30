package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest { //테스트 클래스는 반드시 public으로 선언해야 한다.

    MemberService memberService = new MemberServiceImpl();

    @Test // 메서드가 호출할 때 마다 새로운 인스턴스를 생성하여 독립적인 테스트가 이루어지게 한다.
    void join() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(member); //회원가입
        Member findMember = memberService.findMember(1L); //1L에 해당하는 회원정보

        //then
        Assertions.assertThat(member).isEqualTo(findMember); //회원가입한 멤버와 찾은 멤버가 같냐?
    }
}
