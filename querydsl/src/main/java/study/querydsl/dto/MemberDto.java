package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberDto {

    private String userName;
    private int age;

    @QueryProjection
    public MemberDto(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }
}
