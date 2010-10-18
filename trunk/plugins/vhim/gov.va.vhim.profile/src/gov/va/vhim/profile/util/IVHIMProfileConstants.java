package gov.va.vhim.profile.util;

public interface IVHIMProfileConstants {
	
	public static final String VHIM_PROFILE_NAME = "VHIM";
	
	/*
	 * VHIMPackage
	 */
	public static final String VHIM_PACKAGE_STEREOTYPE = "VHIMPackage";  // stereotype name
	
	public static final String VHIM_MODEL_ELEMENT_CLIENT_PROPERTY = "client";  // VHIMPackage is a subclass of VHIMModelElement, an abstract stereotype
	public static final String VHIM_MODEL_ELEMENT_CLIENT_UNSPECIFIED_ENUM = "Unspecified";  // one of the enumerations of VHIMClient
	public static final String VHIM_MODEL_ELEMENT_CLIENT_ADR_ENUM = "ADR";  // one of the enumerations of VHIMClient
	public static final String VHIM_MODEL_ELEMENT_CLIENT_HDR_ENUM = "HDR";  // one of the enumerations of VHIMClient
	
	public static final String VHIM_PACKAGE_PACKAGE_TYPE_PROPERTY = "packageType";
	public static final String VHIM_PACKAGE_PACKAGE_TYPE_DOMAIN_ENUM = "Domain";  // one of the enumerations of VHIMPackageType
	public static final String VHIM_PACKAGE_PACKAGE_TYPE_ASIS_ENUM = "AsIs";  // one of the enumerations of VHIMPackageType
	public static final String VHIM_PACKAGE_PACKAGE_TYPE_COMMON_ENUM = "Common";  // one of the enumerations of VHIMPackageType
	public static final String VHIM_PACKAGE_PACKAGE_TYPE_DATATYPES_ENUM = "DataTypes";  // one of the enumerations of VHIMPackageType
	public static final String VHIM_PACKAGE_PACKAGE_TYPE_UNSPECIFIED_ENUM = "Unspecified";  // one of the enumerations of VHIMPackageType		
	public static final String VHIM_PACKAGE_COMMON = "Common";  // VHIM Common package		
	public static final String VHIM_PACKAGE_BASE_DATA_TYPES = "BaseDatatypes";  // VHIM Base Datatypes package

	/*
	 * VHIMClass
	 */
	public static final String VHIM_CLASS_STEREOTYPE = "VHIMClass";  // stereotype name
	
	public static final String VHIM_CLASS_CONVERT_TO_CHOICE_PROPERTY = "convertToChoice";  // boolean property of VHIMClass
	public static final String VHIM_CLASS_IS_ENTRY_CLASS_PROPERTY = "isEntryClass";  // boolean property of VHIMClass
	public static final String VHIM_CLASS_IS_MULTI_OBSERVATION_PROPERTY = "isMultiObservation";  // boolean property of VHIMClass
	public static final String VHIM_CLASS_HL7_MOOD_PROPERTY = "hl7Mood";  // enum property of VHIMClass
	
	/*
	 * VHIMProperty
	 */
	public static final String VHIM_PROPERTY_STEREOTYPE = "VHIMProperty";  // stereotype name
	
	public static final String VHIM_PROPERTY_HL7ATTRIBUTE_PROPERTY = "hl7Attribute";  // property of VHIMProperty of type HL7V3RimAttribute
	public static final String VHIM_PROPERTY_HL7DATATYPE_PROPERTY = "hl7Datatype";  // property of VHIMProperty of type HL7V3Datatype
	public static final String VHIM_PROPERTY_HL7OBSERVATION_CLASS_NAME_PROPERTY = "hl7ObservationClassName";  // property of VHIMProperty of type String
	
	/*
	 * VHIMTimeProperty
	 */
	public static final String VHIM_TIME_PROPERTY_STEREOTYPE = "VHIMTimeProperty";  // stereotype name
	
	public static final String VHIM_TIME_PROPERTY_CAN_BE_IMPRECISE_PROPERTY = "canBeImprecise";  // boolean property of VHIMTimeProperty
	
	/*
	 * VHIMCodedProperty
	 */
	public static final String VHIM_CODED_PROPERTY_STEREOTYPE = "VHIMCodedProperty";  // stereotype name
	
	public static final String VHIM_CODED_PROPERTY_VOCABULARY_DOMAIN_MNEMONIC_PROPERTY = "vocabularyDomainMnemonic";  // String property of VHIMCodedProperty
	public static final String VHIM_CODED_PROPERTY_VOCABULARY_DOMAIN_NAME_PROPERTY = "vocabularyDomainName";  // String property of VHIMCodedProperty
	public static final String VHIM_CODED_PROPERTY_VALUE_SET_VUID_PROPERTY = "valueSetVuid";  // String property of VHIMCodedProperty
	
	/*
	 * VHIMStringProperty
	 */
	public static final String VHIM_STRING_PROPERTY_STEREOTYPE = "VHIMStringProperty";  // stereotype name
	
	public static final String VHIM_STRING_PROPERTY_MAXIMUM_LENGTH_PROPERTY = "maximumLength";  // Integer property of VHIMStringProperty
	public static final String VHIM_STRING_PROPERTY_MINIMUM_LENGTH_PROPERTY = "minimumLength";  // Integer property of VHIMStringProperty
	
	public static final String FULLYQUALIFIED_VHIM_PROPERTY_STEREOTYPE = IVHIMProfileConstants.VHIM_PROFILE_NAME + "::" + IVHIMProfileConstants.VHIM_PROPERTY_STEREOTYPE;
	public static final String FULLYQUALIFIED_VHIM_CODED_PROPERTY_STEREOTYPE = IVHIMProfileConstants.VHIM_PROFILE_NAME + "::" + IVHIMProfileConstants.VHIM_CODED_PROPERTY_STEREOTYPE;
	public static final String FULLYQUALIFIED_VHIM_STRING_PROPERTY_STEREOTYPE = IVHIMProfileConstants.VHIM_PROFILE_NAME + "::" + IVHIMProfileConstants.VHIM_STRING_PROPERTY_STEREOTYPE;
	public static final String FULLYQUALIFIED_VHIM_TIME_PROPERTY_STEREOTYPE = IVHIMProfileConstants.VHIM_PROFILE_NAME + "::" + IVHIMProfileConstants.VHIM_TIME_PROPERTY_STEREOTYPE;		public static final String VHIM_STRING_PROPERTY_POINTINTIME = "PointInTime";  // String property of PointInTime

}
