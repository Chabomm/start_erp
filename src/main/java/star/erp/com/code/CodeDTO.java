package star.erp.com.code;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@ToString
public class CodeDTO {

    @Builder
    CodeDTO(Long uid, String code, String upperCode, String codeNm, String codeDc, String useAt, int sortNo, String regUid) {
        this.uid = uid;
        this.code = code;
        this.upperCode = upperCode;
        this.codeNm = codeNm;
        this.codeDc = codeDc;
        this.useAt = useAt;
        this.sortNo = sortNo;
        this.regUid = regUid;
    }

    private Long uid;
    private String code;
    private String upperCode;
    private String codeNm;
    private String codeDc;
    private String useAt;
    private int sortNo;
    private String regUid;
    private Timestamp regDt;
    private Timestamp udtDt;

    public Code toEntity() {
        Code build = Code.builder()
                .uid(uid)
                .code(code)
                .upperCode(upperCode)
                .codeNm(codeNm)
                .codeDc(codeDc)
                .useAt(useAt)
                .sortNo(sortNo)
                .regUid(regUid)
                .build();
        return build;
    }

}
