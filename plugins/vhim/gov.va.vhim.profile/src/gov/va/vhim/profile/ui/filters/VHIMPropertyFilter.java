package gov.va.vhim.profile.ui.filters;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

public class VHIMPropertyFilter implements IFilter {

	public boolean select(Object toTest) {
	
		boolean result = false;
		if (toTest instanceof IAdaptable)
		{
			Element element = (Element) ((IAdaptable)toTest).getAdapter(Element.class);
			if (element instanceof org.eclipse.uml2.uml.Property)
			{
				Stereotype stereotype = element.getAppliedStereotype("VHIM::VHIMProperty");
				if (stereotype !=null)
				{
					result = true;
				}
				
				stereotype =element.getAppliedStereotype("VHIM::VHIMCodedProperty");
				if (stereotype !=null)
				{
					result = true;
				}
				
				
				stereotype =element.getAppliedStereotype("VHIM::VHIMTimeProperty");
				if (stereotype !=null)
				{
					result = true;
				}
			}
		}
		
		
		return result ;
	}

}
