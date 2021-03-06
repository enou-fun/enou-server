package fun.enou.alpha.dto.dtodb;

import fun.enou.alpha.dto.dtoweb.DtoWebArticle;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("article")
public class DtoDbArticle {

    @Id
    private long id;
    private String title;
    private String content;
    private int like;

    public DtoDbArticle(Long id, String title, String content, int like) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.like = like;
    }

    public DtoDbArticle(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public DtoWebArticle toDtoWeb() {
        return new DtoWebArticle(id, title, content);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
}
