/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.niem.ui.filters;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.term.core.util.TermProfileUtil;
import org.openhealthtools.mdht.uml.term.core.util.ITermProfileConstants;
import org.openhealthtools.mdht.uml.term.ui.filters.TermFilter;

/**
 * Selects an object if it is a UML Property with ValueSetConstraint stereotype
 * applied.
 */
public class ValueSetConstraintFilter extends
		org.openhealthtools.mdht.uml.term.ui.filters.ValueSetConstraintFilter {

	public boolean select(Object object) {

		boolean status = super.select(object);

		if (status == false) {

			Element element = getElement(object);			//		
			if (element instanceof Property) {

				Property property = (Property) element;

				if (property.getType() != null) {
					if ("Code".equals(property.getType().getName())) {
						status = true;
					}
				}
			}
		}
		return status;
	}

}
