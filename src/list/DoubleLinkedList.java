/*
 * Copyright 2006 Mentor Graphics Corporation
 * All Rights Reserved
 *
 * THIS WORK CONTAINS TRADE SECRET AND PROPRIETARY
 * INFORMATION WHICH IS THE PROPERTY OF MENTOR
 * GRAPHICS CORPORATION OR ITS LICENSORS AND IS
 * SUBJECT TO LICENSE TERMS.   
 */
package list;

public class DoubleLinkedList<T> implements IDoubleLinkedList<T>
{

	private final Node<T> head;
	private int size;

	public DoubleLinkedList()
	{
		head = new Node<T>();
		head.next = head;
		head.previous = head;
	}

	@Override public void add(T element)
	{
		Node<T> newElement = new Node<T>();
		newElement.data = element;
		head.previous.next = newElement;
		newElement.previous = head.previous;
		head.previous = newElement;
		newElement.next = head;
		size++;
	}

	@Override public void add(int index, T element)
	{
		Node<T> node = head;
		for (int i = 1; i < index; i++) {
			node = node.next;
		}
		Node<T> newElement = new Node<T>();
		newElement.data = element;
		node.next.previous = newElement;
		newElement.next = node.next;
		node.previous = node;
		node.next = newElement;
		size++;
	}

	@Override public boolean contains(T element)
	{
		Node<T> node = head;
		for (int i = 0; i < size; i++) {
			node = node.next;
			if (node.data == element) {
				return true;
			}
		}
		return false;
	}

	@Override public void remove(T element)
	{
		Node<T> node = head;
		for (int i = 0; i < size; i++) {
			node = node.next;
			if (node.data == element) {
				node.previous.next = node.next;
				node.next.previous = node.previous;
				size--;
				break;
			}
		}
	}

	@Override public void remove(int index)
	{
		Node<T> node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		node.previous.next = node.next;
		node.next.previous = node.previous;
		size--;
	}

	@Override public int getSize()
	{
		return size;
	}

	@Override public String toString()
	{
		StringBuilder sb = new StringBuilder();
		Node<T> node = head;
		for (int i = 0; i < size; i++) {
			node = node.next;
			sb.append("Data at position " + i + " is " + node.data + "\n");
		}
		return sb.toString();
	}

	private static class Node<T>
	{

		Node<T> next, previous;
		T data;
	}
}


