public class Post {
    private Long id; 
    private String title; 
    public Post() {} 
    public Post(String title) {
        this.title = title;
    } 
    private List<Tag> tags = new ArrayList<>();
    public void addTag(Tag tag) {
        tags.add(tag);
        tag.getPosts().add(this);
    } 
    public void removeTag(Tag tag) {
        tags.remove(tag);
        tag.getPosts().remove(this);
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post)) return false;
        return id != null && id.equals(((Post) o).id);
    }
}
 

public class Tag {
    private Long id;
    private String name;
    private List<Post> posts = new ArrayList<>();
    public Tag() {} 
    public Tag(String name) {
        this.name = name;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return Objects.equals(name, tag.name);
    }
} 