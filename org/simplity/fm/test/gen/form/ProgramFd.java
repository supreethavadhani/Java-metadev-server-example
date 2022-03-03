package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.test.gen.schema.ProgramData;
/** class for form data program  */
public class ProgramFd extends FormData {
	public ProgramFd(final ProgramForm form, final ProgramData dataObject, final Object[] values, final FormDataTable[] data) {
		super(form, dataObject, values, data);
	}

	@Override
	public ProgramData getSchemaData() {
		return (ProgramData) this.dataObject;
	}

	/**
	 * replace underlying data
	 * @param table non-null 
	 */
	public void replaceSchemaData(ProgramData data) {
		this.dataObject = data;
	}
}
