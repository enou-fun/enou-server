package fun.enou.alpha.dto.dtoweb;

import fun.enou.alpha.dto.dtodb.DtoDbOldUserWord;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @Author: nagi
 * @Modified By:
 * @Date Created in 2020-09-22 18:38
 * @Description:
 * @Attention:
 */

public class DtoWebUserWord {

    private Long id;

    @NotNull
    @Length(max = 60, message = "word is too long")
    @Pattern(regexp ="[a-zA-Z \\-]+")
    private String word;

    public DtoWebUserWord() {
    }

    public DtoWebUserWord(Long id, String word) {
        this.id = id;
        this.word = word;
    }

    public DtoDbOldUserWord toDtoDb() {
        return new DtoDbOldUserWord(id, null,word,1,null);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
