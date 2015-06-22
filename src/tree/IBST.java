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

public interface IBST<T>
{

	void add(T element);

	boolean contains(T element);

	void remove(T element);

	int getSize();
}
