package com.wesleyreisz.interview.linkedlist;

public class Node {
	private String value = "";
	private Node pointerNode = null;
	
	public Node(String input) {
		this.value = input;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Node getPointerNode() {
		return pointerNode;
	}

	public void setPointerNode(Node pointerNode) {
		this.pointerNode = pointerNode;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", pointerNode=" + pointerNode + "]";
	}
	
	
	
}






























