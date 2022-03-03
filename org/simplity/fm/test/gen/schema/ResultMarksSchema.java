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
 * class that represents structure of resultMarks
 */ 
public class ResultMarksSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("resultMarksId", 0, DefinedDataTypes.id, null, null, null, "result_marks_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("subjectRegisterId", 2, DefinedDataTypes.id, null, null, null, "subject_register_id", ColumnType.RequiredData), 
			new DbField("subjectResultId", 3, DefinedDataTypes.id, null, null, null, "subject_result_id", ColumnType.RequiredData), 
			new DbField("userId", 4, DefinedDataTypes.id, null, null, null, "user_id", ColumnType.RequiredData), 
			new DbField("createdAt", 5, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 6, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT result_marks_id, institute_id, subject_register_id, subject_result_id, user_id, created_at, updated_at FROM result_marks";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6};
	private static final  String INSERT = "INSERT INTO result_marks(institute_id, subject_register_id, subject_result_id, user_id, created_at, updated_at) values (?, ?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {1, 2, 3, 4};
	private static final String WHERE = " WHERE result_marks_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE result_marks SET subject_register_id= ? , subject_result_id= ? , user_id= ? , updated_at= CURRENT_TIMESTAMP  WHERE result_marks_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 0, 1};
	private static final String DELETE = "DELETE FROM result_marks";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public ResultMarksSchema() {
		this.name = "resultMarks";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "result_marks";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(7, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "result_marks_id", 0, null);
		this.initialize();
	}

	@Override
	public ResultMarksData newSchemaData() {
		return new ResultMarksData(this, null);
	}

	@Override
	protected ResultMarksData newSchemaData(final Object[] data) {
		return new ResultMarksData(this, data);
	}

	@Override
	public ResultMarksData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (ResultMarksData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public ResultMarksData parseKeys(JsonObject json, IServiceContext ctx) {
		return (ResultMarksData) super.parseKeys(json, ctx);
	}

	@Override
	public ResultMarksDataTable newSchemaDataTable() {
		return new ResultMarksDataTable(this, null);
	}

	@Override
	protected ResultMarksDataTable newSchemaDataTable(final Object[][] data) {
		return new ResultMarksDataTable(this, data);
	}

	@Override
	public ResultMarksDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (ResultMarksDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
