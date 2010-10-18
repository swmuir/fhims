/**
 * <copyright>
 *
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id$
 */

package gov.va.vhim.plugin.validation.internal;

import org.eclipse.ui.plugin.AbstractUIPlugin;


public class VHIMValidationPlugin
	extends AbstractUIPlugin {

	// The shared instance.
	private static VHIMValidationPlugin plugin;
	
	public VHIMValidationPlugin() {
		super();
		plugin = this;
	}
	
	/**
	 * Returns the shared instance.
	 */
	public static VHIMValidationPlugin getDefault() {
		return plugin;
	}
}
