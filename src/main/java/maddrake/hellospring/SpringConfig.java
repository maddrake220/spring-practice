package maddrake.hellospring;

import maddrake.hellospring.repository.MemberRepository;
import maddrake.hellospring.repository.MemoryMemberRepository;
import maddrake.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
