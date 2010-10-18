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
package gov.va.vhim.mda.ant;

import org.eclipse.core.runtime.Plugin;




public class VHIMMDAAntPlugin extends Plugin
{
  //The shared instance.
  private static VHIMMDAAntPlugin plugin;

  public VHIMMDAAntPlugin()
  {
    super();
    plugin = this;
  }

  /**
   * Returns the shared instance.
   */
  public static VHIMMDAAntPlugin getDefault()
  {
    return plugin;
  }
}
