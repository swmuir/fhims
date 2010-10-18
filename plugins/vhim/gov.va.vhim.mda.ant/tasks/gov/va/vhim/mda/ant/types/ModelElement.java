/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package gov.va.vhim.mda.ant.types;

/**
 * Holds a UML QName (e.g. Model::pack1::pack2::class1 )
 * 
 * @version $id:  $
 *
 */
public class ModelElement {
	
	private String modelId;
	private String qname;
	private boolean nested = false;
	
	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	
	public boolean isNested() {
		return nested;
	}

	public void setNested(boolean b) {
		nested = b;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String string) {
		qname = string;
	}

}
