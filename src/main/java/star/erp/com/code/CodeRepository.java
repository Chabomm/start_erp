package star.erp.com.code;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeRepository extends JpaRepository<Code, Long> {
    
}

// jpa로 바꿔주는거임 쿼리생성하고
// 직접 쿼리를 생성해줄수있고  메소드 이름으로도 쿼리를 만들 수 있음