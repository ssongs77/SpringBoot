package com.tuyano.springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "mydata") // 생략하면 클래스명이 table 명이 됨
public class MyData {

	@Id // 메인 키 지정. 엔터티 클래스를 정의할때 반드시 설정
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	@NotNull
	private long id;

	@Column(length = 50, nullable = false)
	@NotEmpty(message = "공백 불가")
	private String name;

	@Column(length = 200, nullable = true)
	@Email(message = "메일 주소만")
	private String mail;

	@Column(nullable = true)
	@Min(value = 0, message = "0이상")
	@Max(value = 200, message = "200이하")
	private Integer age;

	@Column(nullable = true)
	private String memo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String meno) {
		this.memo = meno;
	}

}
