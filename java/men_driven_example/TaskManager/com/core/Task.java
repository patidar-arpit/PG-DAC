package com.core;

import java.time.LocalDate;

public class Task {

	private int taskID;
	private String name;
	private String desc;
	private LocalDate taskDate;
	private Status st;
	private boolean active;
	private static int idGen;
	
	static {
		idGen=0;
	}
	
	public Task(String name, String desc, LocalDate taskDate) {
		super();
		this.name = name;
		this.desc = desc;
		this.taskDate = taskDate;
		this.active=true;
		this.st=Status.valueOf("PENDING");
		this.taskID=++idGen;
	}

	@Override
	public String toString() {
		return "Task [taskID=" + taskID + ", name=" + name + ", desc=" + desc + ", taskDate=" + taskDate + ", st=" + st
				+ ", active=" + active + "]";
	}

	public int getTaskID() {
		return taskID;
	}

	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public LocalDate getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	public Status getSt() {
		return st;
	}

	public void setSt(Status st) {
		this.st = st;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
}
