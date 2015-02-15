package pf.blog.view;

import java.io.Serializable;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named
@Scope("view")
public class TestView implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name = "Phillip";

	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
}
