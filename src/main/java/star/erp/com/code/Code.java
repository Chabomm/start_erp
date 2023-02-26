package star.erp.com.code;

import javax.persistence.Entity;


import javax.persistence.*;

import org.hibernate.annotations.ColumnDefault;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Table(name= "sys_code")
@Entity
@NoArgsConstructor
@ToString
public class Code {

    @Builder
    public Code(Long uid, String code, String upperCode, String codeNm, String codeDc, String useAt, int sortNo, String regUid) {
        this.uid = uid;
        this.code = code;
        this.upperCode = upperCode;
        this.codeNm = codeNm;
        this.codeDc = codeDc;
        this.useAt = useAt;
        this.sortNo = sortNo;
        this.regUid = regUid;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;
    @Column(nullable = false, length = 25)
    // Column 먼저 

    private String code;
    @Column(nullable = false, length = 50)

    private String upperCode;
    @Column(nullable = false, length = 50)

    private String codeNm;
    @Column(nullable = false, length = 100)

    private String codeDc;
    @Column(nullable = false, length = 200)

    @ColumnDefault("'Y'")
    private String useAt;
    @Column(nullable = false, length = 10)

    private int sortNo;
    @Column(nullable = false, length = 20)

    private String regUid;
    @Column(nullable = false, length = 100)

    public Code toEntity() {
        Code build = Code.builder()
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
