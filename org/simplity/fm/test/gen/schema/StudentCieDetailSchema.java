package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.DbField;
import org.simplity.fm.core.data.Schema;
import org.simplity.fm.core.validn.IValidation;
import org.simplity.fm.core.data.DbAssistant;
import org.simplity.fm.core.service.IServiceContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import org.simplity.fm.core.data.ColumnType;
import org.simplity.fm.core.validn.DependentListValidation;
import org.simplity.fm.test.gen.DefinedDataTypes;

/**
 * class that represents structure of studentCieDetail
 */ 
public class StudentCieDetailSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("studentId", 0, DefinedDataTypes.flexibleId, "-1", null, null, "student_id", ColumnType.PrimaryKey), 
			new DbField("subjectSectionId", 1, DefinedDataTypes.id, null, null, null, "subject_section_id", ColumnType.RequiredData), 
			new DbField("departmentName", 2, DefinedDataTypes.text, null, null, null, "department_name", ColumnType.RequiredData), 
			new DbField("usn", 3, DefinedDataTypes.text, null, null, null, "usn", ColumnType.OptionalData), 
			new DbField("name", 4, DefinedDataTypes.name, null, null, null, "student_name", ColumnType.RequiredData), 
			new DbField("eligibility", 5, DefinedDataTypes.name, null, null, null, "is_eligible", ColumnType.OptionalData), 
			new DbField("test1", 6, DefinedDataTypes.text, "1", null, null, null, ColumnType.OptionalData), 
			new DbField("test2", 7, DefinedDataTypes.text, "1", null, null, null, ColumnType.OptionalData), 
			new DbField("test3", 8, DefinedDataTypes.text, "1", null, null, null, ColumnType.OptionalData), 
			new DbField("quiz1", 9, DefinedDataTypes.text, "1", null, null, null, ColumnType.OptionalData), 
			new DbField("quiz2", 10, DefinedDataTypes.text, "1", null, null, null, ColumnType.OptionalData), 
			new DbField("theoryCie", 11, DefinedDataTypes.text, "1", null, null, null, ColumnType.OptionalData), 
			new DbField("theoryClassesHeld", 12, DefinedDataTypes.text, "1", null, null, null, ColumnType.OptionalData), 
			new DbField("theoryClassesAttended", 13, DefinedDataTypes.text, "1", null, null, null, ColumnType.OptionalData), 
			new DbField("theoryClassesPercentage", 14, DefinedDataTypes.text, "1", null, null, null, ColumnType.OptionalData), 
			new DbField("practicalCie", 15, DefinedDataTypes.text, "1", null, null, null, ColumnType.OptionalData), 
			new DbField("practicalClassesHeld", 16, DefinedDataTypes.text, "1", null, null, null, ColumnType.OptionalData), 
			new DbField("practicalClassesAttended", 17, DefinedDataTypes.text, "1", null, null, null, ColumnType.OptionalData), 
			new DbField("practicalClassesPercentage", 18, DefinedDataTypes.text, "1", null, null, null, ColumnType.OptionalData), 
			new DbField("selfStudy", 19, DefinedDataTypes.text, "1", null, null, null, ColumnType.OptionalData), 
			new DbField("practicalMarks", 20, DefinedDataTypes.text, "1", null, null, null, ColumnType.OptionalData), 
			new DbField("totalCie", 21, DefinedDataTypes.text, "1", null, null, null, ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT student_id, subject_section_id, department_name, usn, student_name, is_eligible, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null FROM student_cie_details";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
	private static final  String INSERT = "INSERT INTO student_cie_details(student_id, subject_section_id, department_name, usn, student_name, is_eligible, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
	private static final String WHERE = " WHERE student_id=?";
	private static final int[] WHERE_IDX = {0};
	private static final  String UPDATE = "UPDATE student_cie_details SET subject_section_id= ? , department_name= ? , usn= ? , student_name= ? , is_eligible= ? , null= ? , null= ? , null= ? , null= ? , null= ? , null= ? , null= ? , null= ? , null= ? , null= ? , null= ? , null= ? , null= ? , null= ? , null= ? , null= ?  WHERE student_id=?";
	private static final  int[] UPDATE_IDX = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 0};
	private static final String DELETE = "DELETE FROM student_cie_details";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public StudentCieDetailSchema() {
		this.name = "studentCieDetail";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "student_cie_details";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(22, null, SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public StudentCieDetailData newSchemaData() {
		return new StudentCieDetailData(this, null);
	}

	@Override
	protected StudentCieDetailData newSchemaData(final Object[] data) {
		return new StudentCieDetailData(this, data);
	}

	@Override
	public StudentCieDetailData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (StudentCieDetailData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public StudentCieDetailData parseKeys(JsonObject json, IServiceContext ctx) {
		return (StudentCieDetailData) super.parseKeys(json, ctx);
	}

	@Override
	public StudentCieDetailDataTable newSchemaDataTable() {
		return new StudentCieDetailDataTable(this, null);
	}

	@Override
	protected StudentCieDetailDataTable newSchemaDataTable(final Object[][] data) {
		return new StudentCieDetailDataTable(this, data);
	}

	@Override
	public StudentCieDetailDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (StudentCieDetailDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
