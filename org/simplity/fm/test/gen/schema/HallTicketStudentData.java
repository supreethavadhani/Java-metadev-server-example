package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of hallTicketStudent
 */ 
public class HallTicketStudentData extends SchemaData {

	protected HallTicketStudentData(final HallTicketStudentSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected HallTicketStudentData newInstance(final Object[] arr) {
		return new HallTicketStudentData((HallTicketStudentSchema) this.schema, arr);
	}

	/**
	 * set value for studentId
	 * @param value to be assigned to studentId
	 */
	public void setStudentId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of studentId
	 */
	public long getStudentId(){
		return super.getLongValue(0);
	}

	/**
	 * set value for instituteId
	 * @param value to be assigned to instituteId
	 */
	public void setInstituteId(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of instituteId
	 */
	public long getInstituteId(){
		return super.getLongValue(1);
	}

	/**
	 * set value for seasonId
	 * @param value to be assigned to seasonId
	 */
	public void setSeasonId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of seasonId
	 */
	public long getSeasonId(){
		return super.getLongValue(2);
	}

	/**
	 * set value for programId
	 * @param value to be assigned to programId
	 */
	public void setProgramId(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of programId
	 */
	public long getProgramId(){
		return super.getLongValue(3);
	}

	/**
	 * set value for levelId
	 * @param value to be assigned to levelId
	 */
	public void setLevelId(long value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of levelId
	 */
	public long getLevelId(){
		return super.getLongValue(4);
	}

	/**
	 * set value for levelName
	 * @param value to be assigned to levelName
	 */
	public void setLevelName(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of levelName
	 */
	public String getLevelName(){
		return super.getStringValue(5);
	}

	/**
	 * set value for studentName
	 * @param value to be assigned to studentName
	 */
	public void setStudentName(String value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of studentName
	 */
	public String getStudentName(){
		return super.getStringValue(6);
	}

	/**
	 * set value for usn
	 * @param value to be assigned to usn
	 */
	public void setUsn(String value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of usn
	 */
	public String getUsn(){
		return super.getStringValue(7);
	}

	/**
	 * set value for programName
	 * @param value to be assigned to programName
	 */
	public void setProgramName(String value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of programName
	 */
	public String getProgramName(){
		return super.getStringValue(8);
	}

	/**
	 * set value for departmentName
	 * @param value to be assigned to departmentName
	 */
	public void setDepartmentName(String value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of departmentName
	 */
	public String getDepartmentName(){
		return super.getStringValue(9);
	}
}
