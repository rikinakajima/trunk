package jp.sample.app.home.form;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class HomeForm implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotEmpty
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}