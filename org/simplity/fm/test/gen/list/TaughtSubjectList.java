package org.simplity.fm.test.gen.list;

import org.simplity.fm.core.validn.RuntimeList;
public class TaughtSubjectList extends RuntimeList {
	 private static final String NAME = "taughtSubjectList";
	 private static final String LIST_SQL = "SELECT offered_subject_id, name FROM taught_subject_list WHERE department_id=?";
	 private static final String CHECK_SQL = "SELECT offered_subject_id FROM taught_subject_list WHERE offered_subject_id=? AND department_id=?";
	/**
	 *
	 */
	public TaughtSubjectList() {
		this.name = NAME;
		this.listSql = LIST_SQL;
		this.checkSql = CHECK_SQL;
		this.valueIsNumeric = true;
		this.hasKey = true;
		this.keyIsNumeric = true;
	}
}
