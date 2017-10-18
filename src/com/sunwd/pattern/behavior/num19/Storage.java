package com.sunwd.pattern.behavior.num19;

public class Storage {

	private Memento memento;
	
	public Storage(Memento memento){
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
}
