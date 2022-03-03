package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of institute
 */ 
public class InstituteData extends SchemaData {

	protected InstituteData(final InstituteSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected InstituteData newInstance(final Object[] arr) {
		return new InstituteData((InstituteSchema) this.schema, arr);
	}

	/**
	 * set value for instituteId
	 * @param value to be assigned to instituteId
	 */
	public void setInstituteId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of instituteId
	 */
	public long getInstituteId(){
		return super.getLongValue(0);
	}

	/**
	 * set value for trustId
	 * @param value to be assigned to trustId
	 */
	public void setTrustId(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of trustId
	 */
	public long getTrustId(){
		return super.getLongValue(1);
	}

	/**
	 * set value for name
	 * @param value to be assigned to name
	 */
	public void setName(String value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of name
	 */
	public String getName(){
		return super.getStringValue(2);
	}

	/**
	 * set value for instituteType
	 * @param value to be assigned to instituteType
	 */
	public void setInstituteType(String value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of instituteType
	 */
	public String getInstituteType(){
		return super.getStringValue(3);
	}

	/**
	 * set value for addressLine1
	 * @param value to be assigned to addressLine1
	 */
	public void setAddressLine1(String value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of addressLine1
	 */
	public String getAddressLine1(){
		return super.getStringValue(4);
	}

	/**
	 * set value for addressLine2
	 * @param value to be assigned to addressLine2
	 */
	public void setAddressLine2(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of addressLine2
	 */
	public String getAddressLine2(){
		return super.getStringValue(5);
	}

	/**
	 * set value for city
	 * @param value to be assigned to city
	 */
	public void setCity(String value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of city
	 */
	public String getCity(){
		return super.getStringValue(6);
	}

	/**
	 * set value for state
	 * @param value to be assigned to state
	 */
	public void setState(String value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of state
	 */
	public String getState(){
		return super.getStringValue(7);
	}

	/**
	 * set value for pincode
	 * @param value to be assigned to pincode
	 */
	public void setPincode(String value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of pincode
	 */
	public String getPincode(){
		return super.getStringValue(8);
	}

	/**
	 * set value for country
	 * @param value to be assigned to country
	 */
	public void setCountry(long value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of country
	 */
	public long getCountry(){
		return super.getLongValue(9);
	}

	/**
	 * set value for govtCode
	 * @param value to be assigned to govtCode
	 */
	public void setGovtCode(String value){
		this.fieldValues[10] = value;
	}

	/**
	 * @return value of govtCode
	 */
	public String getGovtCode(){
		return super.getStringValue(10);
	}

	/**
	 * set value for phoneNumber
	 * @param value to be assigned to phoneNumber
	 */
	public void setPhoneNumber(String value){
		this.fieldValues[11] = value;
	}

	/**
	 * @return value of phoneNumber
	 */
	public String getPhoneNumber(){
		return super.getStringValue(11);
	}

	/**
	 * set value for email
	 * @param value to be assigned to email
	 */
	public void setEmail(String value){
		this.fieldValues[12] = value;
	}

	/**
	 * @return value of email
	 */
	public String getEmail(){
		return super.getStringValue(12);
	}

	/**
	 * set value for createdAt
	 * @param value to be assigned to createdAt
	 */
	public void setCreatedAt(Instant value){
		this.fieldValues[13] = value;
	}

	/**
	 * @return value of createdAt
	 */
	public Instant getCreatedAt(){
		return super.getTimestampValue(13);
	}

	/**
	 * set value for updatedAt
	 * @param value to be assigned to updatedAt
	 */
	public void setUpdatedAt(Instant value){
		this.fieldValues[14] = value;
	}

	/**
	 * @return value of updatedAt
	 */
	public Instant getUpdatedAt(){
		return super.getTimestampValue(14);
	}

	/**
	 * set value for isActive
	 * @param value to be assigned to isActive
	 */
	public void setIsActive(boolean value){
		this.fieldValues[15] = value;
	}

	/**
	 * @return value of isActive
	 */
	public boolean getIsActive(){
		return super.getBoolValue(15);
	}
}
