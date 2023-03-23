/*

 * Copyright (c) 2019 cognitron.in
 * all rights reserved
 */

package in.cognitron.lms;

import org.simplity.fm.gen.Generator;

/**
 *
 */
public class Gen {

	private static final String JAVA_PACKAGE = "in.cognitron.lms.gen";
	private static final String SPEC_ROOT = "/Users/supreethavadhani/workspace/metadev-server-example/assets/spec/";
	private static final String JAVA_ROOT = "/Users/supreethavadhani/workspace/metadev-server-example/src/main/java/";
	private static final String TS_ROOT = "/Users/supreethavadhani/workspace/metadev-client-example/src/app/framework-modules/formdata/gen/";
	private static final String TEMPLATE_ROOT = "/Users/supreethavadhani/workspace/metadev-client-example/src/app/framework-modules/formdata/template/";
	private static final String Page_ROOT = "/Users/supreethavadhani/workspace/metadev-client-example/src/app/pages/";
	private static final String ROUTE_ROOT = "/Users/supreethavadhani/workspace/metadev-client-example/src/app/";
	private static final String TS_FORM_IMPORT_PREFIX = "../form/";

	/**
	 *
	 * @param args
	 */
	public static void main(final String[] args) {
		final long start = System.currentTimeMillis();
		if (args.length == 0) {
			Generator.generate(SPEC_ROOT, JAVA_ROOT, JAVA_PACKAGE, TS_ROOT, TS_FORM_IMPORT_PREFIX, TEMPLATE_ROOT,
					Page_ROOT, ROUTE_ROOT);
		} else if (args.length == 6) {
			Generator.generate(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7]);
		} else {
			System.err.print("Usage: Gen spec_root java_root java_package_name ts_root ts_form_import_prefix ");
		}
		System.out.println("generated sources in " + (System.currentTimeMillis() - start) + "ms");
	}
}
