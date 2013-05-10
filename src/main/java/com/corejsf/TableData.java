package com.corejsf;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class TableData implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Name[] names = {
	       new Name("William", "Dupont"),
	       new Name("Anna", "Keeney"),
	       new Name("Mariko", "Randor"),
	       new Name("John", "Wilson")
	};
	
	public Name[] getNames() {
		return names;
	}
}
