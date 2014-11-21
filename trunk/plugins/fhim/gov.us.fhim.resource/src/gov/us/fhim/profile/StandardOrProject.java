/**
 */
package gov.us.fhim.profile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Standard Or Project</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gov.us.fhim.profile.FHIMPackage#getStandardOrProject()
 * @model annotation="uml2.extensions addedInVersion='1'"
 * @generated
 */
public enum StandardOrProject implements Enumerator {
	/**
	 * The '<em><b>CCDA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CCDA_VALUE
	 * @generated
	 * @ordered
	 */
	CCDA(0, "CCDA", "CCDA"), /**
								* The '<em><b>HL7CDA</b></em>' literal object.
								* <!-- begin-user-doc -->
								* <!-- end-user-doc -->
								* @see #HL7CDA_VALUE
								* @generated
								* @ordered
								*/
	HL7CDA(1, "HL7CDA", "HL7CDA"), /**
									* The '<em><b>HL7FHIR</b></em>' literal object.
									* <!-- begin-user-doc -->
									* <!-- end-user-doc -->
									* @see #HL7FHIR_VALUE
									* @generated
									* @ordered
									*/
	HL7FHIR(2, "HL7FHIR", "HL7FHIR"), /**
										* The '<em><b>HL 7v2</b></em>' literal object.
										* <!-- begin-user-doc -->
										* <!-- end-user-doc -->
										* @see #HL_7V2_VALUE
										* @generated
										* @ordered
										*/
	HL_7V2(3, "HL7v2", "HL7v2"), /**
									* The '<em><b>HL 7v3</b></em>' literal object.
									* <!-- begin-user-doc -->
									* <!-- end-user-doc -->
									* @see #HL_7V3_VALUE
									* @generated
									* @ordered
									*/
	HL_7V3(4, "HL7v3", "HL7v3"), /**
									* The '<em><b>NCPDP</b></em>' literal object.
									* <!-- begin-user-doc -->
									* <!-- end-user-doc -->
									* @see #NCPDP_VALUE
									* @generated
									* @ordered
									*/
	NCPDP(5, "NCPDP", "NCPDP"), /**
								* The '<em><b>X12</b></em>' literal object.
								* <!-- begin-user-doc -->
								* <!-- end-user-doc -->
								* @see #X12_VALUE
								* @generated
								* @ordered
								*/
	X12(6, "X12", "X12"), /**
							* The '<em><b>ONCSI Blue Button</b></em>' literal object.
							* <!-- begin-user-doc -->
							* <!-- end-user-doc -->
							* @see #ONCSI_BLUE_BUTTON_VALUE
							* @generated
							* @ordered
							*/
	ONCSI_BLUE_BUTTON(7, "ONCSIBlueButton", "ONCSIBlueButton"), /**
																* The '<em><b>ONCSICQF</b></em>' literal object.
																* <!-- begin-user-doc -->
																* <!-- end-user-doc -->
																* @see #ONCSICQF_VALUE
																* @generated
																* @ordered
																*/
	ONCSICQF(8, "ONCSICQF", "ONCSICQF"), /**
											* The '<em><b>ONCSIDAF</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #ONCSIDAF_VALUE
											* @generated
											* @ordered
											*/
	ONCSIDAF(9, "ONCSIDAF", "ONCSIDAF"), /**
											* The '<em><b>ONCSIDPROV</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #ONCSIDPROV_VALUE
											* @generated
											* @ordered
											*/
	ONCSIDPROV(10, "ONCSIDPROV", "ONCSIDPROV"), /**
												* The '<em><b>ONCSIDS4P</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #ONCSIDS4P_VALUE
												* @generated
												* @ordered
												*/
	ONCSIDS4P(11, "ONCSIDS4P", "ONCSIDS4P"), /**
												* The '<em><b>ONCS Ies MD</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #ONCS_IES_MD_VALUE
												* @generated
												* @ordered
												*/
	ONCS_IES_MD(12, "ONCSIesMD", "ONCSIesMD"), /**
												* The '<em><b>ONCSIEUU Se Health</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #ONCSIEUU_SE_HEALTH_VALUE
												* @generated
												* @ordered
												*/
	ONCSIEUU_SE_HEALTH(13, "ONCSIEUUSeHealth", "ONCSIEUUSeHealth"), /**
																	* The '<em><b>ONCSI He D</b></em>' literal object.
																	* <!-- begin-user-doc -->
																	* <!-- end-user-doc -->
																	* @see #ONCSI_HE_D_VALUE
																	* @generated
																	* @ordered
																	*/
	ONCSI_HE_D(14, "ONCSIHeD", "ONCSIHeD"), /**
											* The '<em><b>ONCSILCC</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #ONCSILCC_VALUE
											* @generated
											* @ordered
											*/
	ONCSILCC(15, "ONCSILCC", "ONCSILCC"), /**
											* The '<em><b>ONCSILOI</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #ONCSILOI_VALUE
											* @generated
											* @ordered
											*/
	ONCSILOI(16, "ONCSILOI", "ONCSILOI"), /**
											* The '<em><b>ONCSILRI</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #ONCSILRI_VALUE
											* @generated
											* @ordered
											*/
	ONCSILRI(17, "ONCSILRI", "ONCSILRI"), /**
											* The '<em><b>ONCSIPD</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #ONCSIPD_VALUE
											* @generated
											* @ordered
											*/
	ONCSIPD(18, "ONCSIPD", "ONCSIPD"), /**
										* The '<em><b>ONCSIPDMP</b></em>' literal object.
										* <!-- begin-user-doc -->
										* <!-- end-user-doc -->
										* @see #ONCSIPDMP_VALUE
										* @generated
										* @ordered
										*/
	ONCSIPDMP(19, "ONCSIPDMP", "ONCSIPDMP"), /**
												* The '<em><b>ONCSI Public Health</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #ONCSI_PUBLIC_HEALTH_VALUE
												* @generated
												* @ordered
												*/
	ONCSI_PUBLIC_HEALTH(20, "ONCSIPublicHealth", "ONCSIPublicHealth"), /**
																		* The '<em><b>ONCSIQH</b></em>' literal object.
																		* <!-- begin-user-doc -->
																		* <!-- end-user-doc -->
																		* @see #ONCSIQH_VALUE
																		* @generated
																		* @ordered
																		*/
	ONCSIQH(21, "ONCSIQH", "ONCSIQH"), /**
										* The '<em><b>ONCSIRH Ex</b></em>' literal object.
										* <!-- begin-user-doc -->
										* <!-- end-user-doc -->
										* @see #ONCSIRH_EX_VALUE
										* @generated
										* @ordered
										*/
	ONCSIRH_EX(22, "ONCSIRHEx", "ONCSIRHEx"), /**
												* The '<em><b>ONCSISDC</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #ONCSISDC_VALUE
												* @generated
												* @ordered
												*/
	ONCSISDC(23, "ONCSISDC", "ONCSISDC"), /**
											* The '<em><b>ONCSITOC</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #ONCSITOC_VALUE
											* @generated
											* @ordered
											*/
	ONCSITOC(24, "ONCSITOC", "ONCSITOC");

	/**
	 * The '<em><b>CCDA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CCDA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CCDA
	 * @model annotation="uml2.extensions addedInVersion='1'"
	 * @generated
	 * @ordered
	 */
	public static final int CCDA_VALUE = 0;

	/**
	 * The '<em><b>HL7CDA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HL7CDA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HL7CDA
	 * @model annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 * @ordered
	 */
	public static final int HL7CDA_VALUE = 1;

	/**
	 * The '<em><b>HL7FHIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HL7FHIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HL7FHIR
	 * @model annotation="uml2.extensions addedInVersion='1'"
	 * @generated
	 * @ordered
	 */
	public static final int HL7FHIR_VALUE = 2;

	/**
	 * The '<em><b>HL 7v2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HL 7v2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HL_7V2
	 * @model name="HL7v2"
	 *        annotation="uml2.extensions addedInVersion='1'"
	 * @generated
	 * @ordered
	 */
	public static final int HL_7V2_VALUE = 3;

	/**
	 * The '<em><b>HL 7v3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HL 7v3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HL_7V3
	 * @model name="HL7v3"
	 *        annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 * @ordered
	 */
	public static final int HL_7V3_VALUE = 4;

	/**
	 * The '<em><b>NCPDP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NCPDP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NCPDP
	 * @model annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 * @ordered
	 */
	public static final int NCPDP_VALUE = 5;

	/**
	 * The '<em><b>X12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>X12</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #X12
	 * @model annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 * @ordered
	 */
	public static final int X12_VALUE = 6;

	/**
	 * The '<em><b>ONCSI Blue Button</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONCSI Blue Button</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCSI_BLUE_BUTTON
	 * @model name="ONCSIBlueButton"
	 *        annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 * @ordered
	 */
	public static final int ONCSI_BLUE_BUTTON_VALUE = 7;

	/**
	 * The '<em><b>ONCSICQF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONCSICQF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCSICQF
	 * @model annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 * @ordered
	 */
	public static final int ONCSICQF_VALUE = 8;

	/**
	 * The '<em><b>ONCSIDAF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONCSIDAF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCSIDAF
	 * @model annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 * @ordered
	 */
	public static final int ONCSIDAF_VALUE = 9;

	/**
	 * The '<em><b>ONCSIDPROV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONCSIDPROV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCSIDPROV
	 * @model annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 * @ordered
	 */
	public static final int ONCSIDPROV_VALUE = 10;

	/**
	 * The '<em><b>ONCSIDS4P</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONCSIDS4P</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCSIDS4P
	 * @model annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 * @ordered
	 */
	public static final int ONCSIDS4P_VALUE = 11;

	/**
	 * The '<em><b>ONCS Ies MD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONCS Ies MD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCS_IES_MD
	 * @model name="ONCSIesMD"
	 *        annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 * @ordered
	 */
	public static final int ONCS_IES_MD_VALUE = 12;

	/**
	 * The '<em><b>ONCSIEUU Se Health</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONCSIEUU Se Health</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCSIEUU_SE_HEALTH
	 * @model name="ONCSIEUUSeHealth"
	 *        annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 * @ordered
	 */
	public static final int ONCSIEUU_SE_HEALTH_VALUE = 13;

	/**
	 * The '<em><b>ONCSI He D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONCSI He D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCSI_HE_D
	 * @model name="ONCSIHeD"
	 *        annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 * @ordered
	 */
	public static final int ONCSI_HE_D_VALUE = 14;

	/**
	 * The '<em><b>ONCSILCC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONCSILCC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCSILCC
	 * @model annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 * @ordered
	 */
	public static final int ONCSILCC_VALUE = 15;

	/**
	 * The '<em><b>ONCSILOI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONCSILOI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCSILOI
	 * @model annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 * @ordered
	 */
	public static final int ONCSILOI_VALUE = 16;

	/**
	 * The '<em><b>ONCSILRI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONCSILRI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCSILRI
	 * @model annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 * @ordered
	 */
	public static final int ONCSILRI_VALUE = 17;

	/**
	 * The '<em><b>ONCSIPD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONCSIPD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCSIPD
	 * @model annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 * @ordered
	 */
	public static final int ONCSIPD_VALUE = 18;

	/**
	 * The '<em><b>ONCSIPDMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONCSIPDMP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCSIPDMP
	 * @model annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 * @ordered
	 */
	public static final int ONCSIPDMP_VALUE = 19;

	/**
	 * The '<em><b>ONCSI Public Health</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONCSI Public Health</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCSI_PUBLIC_HEALTH
	 * @model name="ONCSIPublicHealth"
	 *        annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 * @ordered
	 */
	public static final int ONCSI_PUBLIC_HEALTH_VALUE = 20;

	/**
	 * The '<em><b>ONCSIQH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONCSIQH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCSIQH
	 * @model annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 * @ordered
	 */
	public static final int ONCSIQH_VALUE = 21;

	/**
	 * The '<em><b>ONCSIRH Ex</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONCSIRH Ex</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCSIRH_EX
	 * @model name="ONCSIRHEx"
	 *        annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 * @ordered
	 */
	public static final int ONCSIRH_EX_VALUE = 22;

	/**
	 * The '<em><b>ONCSISDC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONCSISDC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCSISDC
	 * @model annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 * @ordered
	 */
	public static final int ONCSISDC_VALUE = 23;

	/**
	 * The '<em><b>ONCSITOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONCSITOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCSITOC
	 * @model annotation="uml2.extensions addedInVersion='4'"
	 * @generated
	 * @ordered
	 */
	public static final int ONCSITOC_VALUE = 24;

	/**
	 * An array of all the '<em><b>Standard Or Project</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StandardOrProject[] VALUES_ARRAY = new StandardOrProject[] {
			CCDA, HL7CDA, HL7FHIR, HL_7V2, HL_7V3, NCPDP, X12, ONCSI_BLUE_BUTTON, ONCSICQF, ONCSIDAF, ONCSIDPROV,
			ONCSIDS4P, ONCS_IES_MD, ONCSIEUU_SE_HEALTH, ONCSI_HE_D, ONCSILCC, ONCSILOI, ONCSILRI, ONCSIPD, ONCSIPDMP,
			ONCSI_PUBLIC_HEALTH, ONCSIQH, ONCSIRH_EX, ONCSISDC, ONCSITOC, };

	/**
	 * A public read-only list of all the '<em><b>Standard Or Project</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StandardOrProject> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Standard Or Project</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StandardOrProject get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StandardOrProject result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Standard Or Project</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StandardOrProject getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StandardOrProject result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Standard Or Project</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StandardOrProject get(int value) {
		switch (value) {
			case CCDA_VALUE:
				return CCDA;
			case HL7CDA_VALUE:
				return HL7CDA;
			case HL7FHIR_VALUE:
				return HL7FHIR;
			case HL_7V2_VALUE:
				return HL_7V2;
			case HL_7V3_VALUE:
				return HL_7V3;
			case NCPDP_VALUE:
				return NCPDP;
			case X12_VALUE:
				return X12;
			case ONCSI_BLUE_BUTTON_VALUE:
				return ONCSI_BLUE_BUTTON;
			case ONCSICQF_VALUE:
				return ONCSICQF;
			case ONCSIDAF_VALUE:
				return ONCSIDAF;
			case ONCSIDPROV_VALUE:
				return ONCSIDPROV;
			case ONCSIDS4P_VALUE:
				return ONCSIDS4P;
			case ONCS_IES_MD_VALUE:
				return ONCS_IES_MD;
			case ONCSIEUU_SE_HEALTH_VALUE:
				return ONCSIEUU_SE_HEALTH;
			case ONCSI_HE_D_VALUE:
				return ONCSI_HE_D;
			case ONCSILCC_VALUE:
				return ONCSILCC;
			case ONCSILOI_VALUE:
				return ONCSILOI;
			case ONCSILRI_VALUE:
				return ONCSILRI;
			case ONCSIPD_VALUE:
				return ONCSIPD;
			case ONCSIPDMP_VALUE:
				return ONCSIPDMP;
			case ONCSI_PUBLIC_HEALTH_VALUE:
				return ONCSI_PUBLIC_HEALTH;
			case ONCSIQH_VALUE:
				return ONCSIQH;
			case ONCSIRH_EX_VALUE:
				return ONCSIRH_EX;
			case ONCSISDC_VALUE:
				return ONCSISDC;
			case ONCSITOC_VALUE:
				return ONCSITOC;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StandardOrProject(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String toString() {
		return literal;
	}

} // StandardOrProject
