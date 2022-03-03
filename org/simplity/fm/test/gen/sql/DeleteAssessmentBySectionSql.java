package org.simplity.fm.test.gen.sql;

import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.ValueObject;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.core.rdb.WriteSql;

/** generated class for DeleteAssessmentBySectionSql */
public class DeleteAssessmentBySectionSql extends WriteSql {
	private static final String SQL = "delete from student_assessments where institute_id=? and offered_subject_id=? and section_id=?";
	private static final Field[] IN = {
			new Field("instituteId", 0, DefinedDataTypes.id, null, null, null, false),
			new Field("offeredSubjectId", 1, DefinedDataTypes.id, null, null, null, false),
			new Field("sectionId", 2, DefinedDataTypes.id, null, null, null, false)};

	/** default constructor */
	public DeleteAssessmentBySectionSql() {
		this.sqlText = SQL;
		this.inputData = new ValueObject(IN, null);
	}

	/**
	 * set value for instituteId
	 * @param value to be assigned to instituteId
	 */
	public void setInstituteId(long value){
		this.inputData.setValue(0, value);
	}

	/**
	 * set value for offeredSubjectId
	 * @param value to be assigned to offeredSubjectId
	 */
	public void setOfferedSubjectId(long value){
		this.inputData.setValue(1, value);
	}

	/**
	 * set value for sectionId
	 * @param value to be assigned to sectionId
	 */
	public void setSectionId(long value){
		this.inputData.setValue(2, value);
	}
}
