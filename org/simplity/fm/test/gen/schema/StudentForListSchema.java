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
 * class that represents structure of studentForList
 */ 
public class StudentForListSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("studentId", 0, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("departmentId", 2, DefinedDataTypes.id, null, null, "departmentList", "department_id", ColumnType.RequiredData), 
			new DbField("programId", 3, DefinedDataTypes.id, null, null, null, "program_id", ColumnType.RequiredData), 
			new DbField("levelId", 4, DefinedDataTypes.id, null, null, null, "level_id", ColumnType.OptionalData), 
			new DbField("sectionId", 5, DefinedDataTypes.id, null, null, "sectionList", "section_id", ColumnType.OptionalData), 
			new DbField("usn", 6, DefinedDataTypes.text, null, null, null, "usn", ColumnType.OptionalData), 
			new DbField("departmentName", 7, DefinedDataTypes.name, null, null, null, "department_name", ColumnType.OptionalData), 
			new DbField("programName", 8, DefinedDataTypes.name, null, null, null, "program_name", ColumnType.OptionalData), 
			new DbField("levelName", 9, DefinedDataTypes.name, null, null, null, "level_name", ColumnType.OptionalData), 
			new DbField("section", 10, DefinedDataTypes.name, null, null, null, "section", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {false, false, false, false, true, false};
	private static final String SELECT = "SELECT student_id, institute_id, department_id, program_id, level_id, section_id, usn, department_name, program_name, level_name, section FROM students_for_list";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	private static final  String INSERT = "INSERT INTO students_for_list(student_id, institute_id, department_id, program_id, level_id, section_id, usn, department_name, program_name, level_name, section) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	private static final String WHERE = " WHERE student_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE students_for_list SET department_id= ? , program_id= ? , level_id= ? , section_id= ? , usn= ? , department_name= ? , program_name= ? , level_name= ? , section= ?  WHERE student_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 1};
	private static final String DELETE = "DELETE FROM students_for_list";
	private static final IValidation[] VALIDS = {new DependentListValidation(3, 2, "programList", "programId", null),
		new DependentListValidation(4, 3, "programLevelList", "levelId", null)
	};

	/**
	 *
	 */
	public StudentForListSchema() {
		this.name = "studentForList";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "students_for_list";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(11, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public StudentForListData newSchemaData() {
		return new StudentForListData(this, null);
	}

	@Override
	protected StudentForListData newSchemaData(final Object[] data) {
		return new StudentForListData(this, data);
	}

	@Override
	public StudentForListData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (StudentForListData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public StudentForListData parseKeys(JsonObject json, IServiceContext ctx) {
		return (StudentForListData) super.parseKeys(json, ctx);
	}

	@Override
	public StudentForListDataTable newSchemaDataTable() {
		return new StudentForListDataTable(this, null);
	}

	@Override
	protected StudentForListDataTable newSchemaDataTable(final Object[][] data) {
		return new StudentForListDataTable(this, data);
	}

	@Override
	public StudentForListDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (StudentForListDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
