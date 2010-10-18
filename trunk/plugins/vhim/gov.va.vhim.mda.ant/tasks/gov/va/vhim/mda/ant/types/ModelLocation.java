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

import java.io.File;

public class ModelLocation {
	
	private String id;
	private File file;
	private String uri;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
}
