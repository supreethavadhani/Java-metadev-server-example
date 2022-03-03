package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of integratedCie
 */ 
public class IntegratedCieData extends SchemaData {

	protected IntegratedCieData(final IntegratedCieSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected IntegratedCieData newInstance(final Object[] arr) {
		return new IntegratedCieData((IntegratedCieSchema) this.schema, arr);
	}

	/**
	 * set value for subjectRegisterId
	 * @param value to be assigned to subjectRegisterId
	 */
	public void setSubjectRegisterId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of subjectRegisterId
	 */
	public long getSubjectRegisterId(){
		return super.getLongValue(0);
	}

	/**
	 * set value for studentId
	 * @param value to be assigned to studentId
	 */
	public void setStudentId(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of studentId
	 */
	public long getStudentId(){
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
	 * set value for usn
	 * @param value to be assigned to usn
	 */
	public void setUsn(String value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of usn
	 */
	public String getUsn(){
		return super.getStringValue(3);
	}

	/**
	 * set value for cieMarks
	 * @param value to be assigned to cieMarks
	 */
	public void setCieMarks(long value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of cieMarks
	 */
	public long getCieMarks(){
		return super.getLongValue(4);
	}

	/**
	 * set value for theoryCieMarks
	 * @param value to be assigned to theoryCieMarks
	 */
	public void setTheoryCieMarks(long value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of theoryCieMarks
	 */
	public long getTheoryCieMarks(){
		return super.getLongValue(5);
	}

	/**
	 * set value for labCieMarks
	 * @param value to be assigned to labCieMarks
	 */
	public void setLabCieMarks(long value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of labCieMarks
	 */
	public long getLabCieMarks(){
		return super.getLongValue(6);
	}
}
