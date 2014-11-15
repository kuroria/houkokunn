package com.kuroria.houkokunnkari;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "reizouko")
public class risutoreitouko extends Model {

	@Column(name = "category")
	public String category;

	@Column(name = "name")
	public String name;

	@Column(name = "limit")
	public long limit;

	public risutoreitouko() {
		super();
	}
}
