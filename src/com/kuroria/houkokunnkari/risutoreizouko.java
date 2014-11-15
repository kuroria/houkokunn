package com.kuroria.houkokunnkari;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "test")
public class risutoreizouko extends Model {

	@Column(name = "category")
	public String category;

	@Column(name = "name")
	public String name;

	@Column(name = "limit")
	public long limit;

	public risutoreizouko() {
		super();
	}
}