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

public interface IDoubleLinkedList<T>
{

	void add(T element);

	void add(int index, T element);

	boolean contains(T element);

	void remove(T element);

	void remove(int index);

	int getSize();
}
