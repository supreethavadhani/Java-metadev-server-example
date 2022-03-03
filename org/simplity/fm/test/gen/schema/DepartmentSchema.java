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
 * class that represents structure of department
 */ 
public class DepartmentSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("departmentId", 0, DefinedDataTypes.id, null, null, null, "department_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("name", 2, DefinedDataTypes.name, null, null, null, "name", ColumnType.RequiredData), 
			new DbField("code", 3, DefinedDataTypes.code, null, null, null, "code", ColumnType.OptionalData), 
			new DbField("addressLine1", 4, DefinedDataTypes.desc, null, null, null, "address_line1", ColumnType.OptionalData), 
			new DbField("addressLine2", 5, DefinedDataTypes.desc, null, null, null, "address_line2", ColumnType.OptionalData), 
			new DbField("city", 6, DefinedDataTypes.name, null, null, null, "city", ColumnType.OptionalData), 
			new DbField("state", 7, DefinedDataTypes.state, null, null, null, "state", ColumnType.OptionalData), 
			new DbField("pincode", 8, DefinedDataTypes.pin, null, null, null, "pincode", ColumnType.OptionalData), 
			new DbField("country", 9, DefinedDataTypes.country, "130", null, null, "country", ColumnType.OptionalData), 
			new DbField("phoneNumber", 10, DefinedDataTypes.phone, null, null, null, "phone_number", ColumnType.OptionalData), 
			new DbField("email", 11, DefinedDataTypes.email, null, null, null, "email", ColumnType.OptionalData), 
			new DbField("createdAt", 12, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 13, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT department_id, institute_id, name, code, address_line1, address_line2, city, state, pincode, country, phone_number, email, created_at, updated_at FROM departments";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	private static final  String INSERT = "INSERT INTO departments(institute_id, name, code, address_line1, address_line2, city, state, pincode, country, phone_number, email, created_at, updated_at) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	private static final String WHERE = " WHERE department_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE departments SET name= ? , code= ? , address_line1= ? , address_line2= ? , city= ? , state= ? , pincode= ? , country= ? , phone_number= ? , email= ? , updated_at= CURRENT_TIMESTAMP  WHERE department_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 0, 1};
	private static final String DELETE = "DELETE FROM departments";
	private static final IValidation[] VALIDS = {new DependentListValidation(7, 9, "state", "state", null)
	};

	/**
	 *
	 */
	public DepartmentSchema() {
		this.name = "department";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "departments";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(14, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "department_id", 0, null);
		this.initialize();
	}

	@Override
	public DepartmentData newSchemaData() {
		return new DepartmentData(this, null);
	}

	@Override
	protected DepartmentData newSchemaData(final Object[] data) {
		return new DepartmentData(this, data);
	}

	@Override
	public DepartmentData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (DepartmentData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public DepartmentData parseKeys(JsonObject json, IServiceContext ctx) {
		return (DepartmentData) super.parseKeys(json, ctx);
	}

	@Override
	public DepartmentDataTable newSchemaDataTable() {
		return new DepartmentDataTable(this, null);
	}

	@Override
	protected DepartmentDataTable newSchemaDataTable(final Object[][] data) {
		return new DepartmentDataTable(this, data);
	}

	@Override
	public DepartmentDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (DepartmentDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
