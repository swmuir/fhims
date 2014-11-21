/*******************************************************************************
 * Copyright (c) 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - support nested datatype subclasses (artf3350)
 *     
 * $Id$
 *******************************************************************************/
package gov.us.fhim.ui.filters;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.common.ui.filters.WrapperAwareFilter;

/**
 * Selects an object if it is a UML Property.
 */
public class PropertyFilter extends WrapperAwareFilter {

	@Override
	public boolean select(Object object) {
		Element element = getElement(object);

		if (element instanceof Property) {
			return true;
		}

		return false;
	}

	protected Element getElement(Object object) {
		Element element = null;
		if (object instanceof IAdaptable) {
			element = (Element) ((IAdaptable) object).getAdapter(Element.class);
		} else {
			EObject eobject = getEObject(object);
			if (eobject instanceof Element) {
				element = (Element) eobject;
			}
		}

		return element;
	}

}
