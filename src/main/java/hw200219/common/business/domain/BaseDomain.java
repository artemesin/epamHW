package hw200219.common.business.domain;

public abstract class BaseDomain {

    protected Long id;

    public BaseDomain(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
