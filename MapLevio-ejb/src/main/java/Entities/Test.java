package Entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Test {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int testId;
	private String specialty;
	private int mark;
	private Date dateOfPassing;
	private int difficulty;
	private Boolean answer1;
	private Boolean answer2;
	private Boolean answer3;
	private Boolean answer4;
	private Boolean answer5;
	private Boolean answer6;
	private Boolean answer7;
	private Boolean answer8;
	private Boolean answer9;
	private Boolean answer10;
	
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public Date getDateOfPassing() {
		return dateOfPassing;
	}
	public void setDateOfPassing(Date dateOfPassing) {
		this.dateOfPassing = dateOfPassing;
	}
	public int getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	public Boolean getAnswer1() {
		return answer1;
	}
	public void setAnswer1(Boolean answer1) {
		this.answer1 = answer1;
	}
	public Boolean getAnswer2() {
		return answer2;
	}
	public void setAnswer2(Boolean answer2) {
		this.answer2 = answer2;
	}
	public Boolean getAnswer3() {
		return answer3;
	}
	public void setAnswer3(Boolean answer3) {
		this.answer3 = answer3;
	}
	public Boolean getAnswer4() {
		return answer4;
	}
	public void setAnswer4(Boolean answer4) {
		this.answer4 = answer4;
	}
	public Boolean getAnswer5() {
		return answer5;
	}
	public void setAnswer5(Boolean answer5) {
		this.answer5 = answer5;
	}
	public Boolean getAnswer6() {
		return answer6;
	}
	public void setAnswer6(Boolean answer6) {
		this.answer6 = answer6;
	}
	public Boolean getAnswer7() {
		return answer7;
	}
	public void setAnswer7(Boolean answer7) {
		this.answer7 = answer7;
	}
	public Boolean getAnswer8() {
		return answer8;
	}
	public void setAnswer8(Boolean answer8) {
		this.answer8 = answer8;
	}
	public Boolean getAnswer9() {
		return answer9;
	}
	public void setAnswer9(Boolean answer9) {
		this.answer9 = answer9;
	}
	public Boolean getAnswer10() {
		return answer10;
	}
	public void setAnswer10(Boolean answer10) {
		this.answer10 = answer10;
	}
	

}
