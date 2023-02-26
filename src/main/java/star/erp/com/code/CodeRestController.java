
package star.erp.com.code;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
@RequiredArgsConstructor
public class CodeRestController {

    private final CodeService service;


    @GetMapping("/codelist/{id}")
    public ResponseEntity<Optional> getCode(@PathVariable Long uid) {
        log.info("CodeRestController::getUser(model, id)");
        Optional<Code> user = service.findById(uid);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    
}
