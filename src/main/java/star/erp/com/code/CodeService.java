package star.erp.com.code;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CodeService {
    private final CodeRepository repository;

    public List<Code> findAll() {
        return repository.findAll();
    }
    @Transactional
    public Optional<Code> findById(Long uid) {
        return repository.findById(uid);
    }

}
