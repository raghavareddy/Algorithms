/*
 * Copyright 2006 Mentor Graphics Corporation
 * All Rights Reserved
 *
 * THIS WORK CONTAINS TRADE SECRET AND PROPRIETARY
 * INFORMATION WHICH IS THE PROPERTY OF MENTOR
 * GRAPHICS CORPORATION OR ITS LICENSORS AND IS
 * SUBJECT TO LICENSE TERMS.   
 */
package tree;

public class BST<T> implements IBST<T>
{

	private Node<T> root;
	private int size;

	public BST()
	{
	}

	@Override public void add(T element)
	{
		if (root == null) {
			root = new Node<T>(element);
		}
		Node<T> current = root;
		while (current != null) {
			int compareTo = ((Comparable) current.data).compareTo(element);
			if (compareTo < 0) {
				if (current.left == null) {
					current.left = new Node<T>(element);
				}
				else {
					current = current.left;
				}
			}
			else if (compareTo > 0) {
				if (current.right == null) {
					current.right = new Node<T>(element);
				}
				else {
					current = current.right;
				}
			}
			else {
				return;
			}
		}
		size++;
	}

	@Override public boolean contains(T element)
	{
		Node<T> current = root;
		while (current != null) {
			int compareTo = ((Comparable) current.data).compareTo(element);
			if (compareTo < 0) {
				current = current.left;
			}
			else if (compareTo > 0) {
				current = current.right;
			}
			else {
				return true;
			}
		}

		return false;
	}

	@Override public void remove(T element)
	{

	}

	@Override public int getSize()
	{
		return size;
	}

	@Override public String toString()
	{
		StringBuilder sb = new StringBuilder();
		Node<T> node = root;
		//sb.append("Data at position " + i + " is " + node.data + "\n");
		return sb.toString();
	}

	private static class Node<T>
	{

		Node(T element)
		{
			data = element;
		}

		Node<T> left, right;
		T data;
	}
}
