package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of marksUpdate
 */ 
public class MarksUpdateData extends SchemaData {

	protected MarksUpdateData(final MarksUpdateSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected MarksUpdateData newInstance(final Object[] arr) {
		return new MarksUpdateData((MarksUpdateSchema) this.schema, arr);
	}

	/**
	 * set value for studentAssessmentId
	 * @param value to be assigned to studentAssessmentId
	 */
	public void setStudentAssessmentId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of studentAssessmentId
	 */
	public long getStudentAssessmentId(){
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
	 * set value for subjectRegisterId
	 * @param value to be assigned to subjectRegisterId
	 */
	public void setSubjectRegisterId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of subjectRegisterId
	 */
	public long getSubjectRegisterId(){
		return super.getLongValue(2);
	}

	/**
	 * set value for assessmentSeqNo
	 * @param value to be assigned to assessmentSeqNo
	 */
	public void setAssessmentSeqNo(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of assessmentSeqNo
	 */
	public long getAssessmentSeqNo(){
		return super.getLongValue(3);
	}

	/**
	 * set value for currentMarks
	 * @param value to be assigned to currentMarks
	 */
	public void setCurrentMarks(String value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of currentMarks
	 */
	public String getCurrentMarks(){
		return super.getStringValue(4);
	}

	/**
	 * set value for studentId
	 * @param value to be assigned to studentId
	 */
	public void setStudentId(long value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of studentId
	 */
	public long getStudentId(){
		return super.getLongValue(5);
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
	 * set value for subjectId
	 * @param value to be assigned to subjectId
	 */
	public void setSubjectId(long value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of subjectId
	 */
	public long getSubjectId(){
		return super.getLongValue(8);
	}

	/**
	 * set value for subjectName
	 * @param value to be assigned to subjectName
	 */
	public void setSubjectName(String value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of subjectName
	 */
	public String getSubjectName(){
		return super.getStringValue(9);
	}

	/**
	 * set value for testName
	 * @param value to be assigned to testName
	 */
	public void setTestName(String value){
		this.fieldValues[10] = value;
	}

	/**
	 * @return value of testName
	 */
	public String getTestName(){
		return super.getStringValue(10);
	}

	/**
	 * set value for marks
	 * @param value to be assigned to marks
	 */
	public void setMarks(String value){
		this.fieldValues[11] = value;
	}

	/**
	 * @return value of marks
	 */
	public String getMarks(){
		return super.getStringValue(11);
	}

	/**
	 * set value for requesterName
	 * @param value to be assigned to requesterName
	 */
	public void setRequesterName(String value){
		this.fieldValues[12] = value;
	}

	/**
	 * @return value of requesterName
	 */
	public String getRequesterName(){
		return super.getStringValue(12);
	}

	/**
	 * set value for requesterPhone
	 * @param value to be assigned to requesterPhone
	 */
	public void setRequesterPhone(String value){
		this.fieldValues[13] = value;
	}

	/**
	 * @return value of requesterPhone
	 */
	public String getRequesterPhone(){
		return super.getStringValue(13);
	}

	/**
	 * set value for remarks
	 * @param value to be assigned to remarks
	 */
	public void setRemarks(String value){
		this.fieldValues[14] = value;
	}

	/**
	 * @return value of remarks
	 */
	public String getRemarks(){
		return super.getStringValue(14);
	}
}
