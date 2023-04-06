# Metadev Server

This repository has the starter code for using the Metadev framework. 
Checkout [MV-client-example](https://github.com/supreethavadhani/angular-metadev-client-example) for a already setup client app.
###### The repo will be published as a maven package very soon

## Setup Instructions
1. Clone this repository
2. Enter your DB connection string in `Bootstrapper.java`
    ```java
    private static final String CON_STRING = "<your-connection-string-here>";
    ```
3. Update the `Gen.java` file to match to your client and server root folder
    ```java
        // example path - /metadev-server-example/assets/spec/
        private static final String SPEC_ROOT = "<path to where your spec files are on your server project>";
        // example path - /metadev-server-example/src/main/java/
        private static final String JAVA_ROOT = "<Path to your main java root dir>";
        // example path - /metadev-client-example/src/app/framework-modules/formdata/gen/
        private static final String TS_ROOT = "<Path to your client root TS folder where the generated models get stored>";
        // example path - /metadev-client-example/src/app/framework-modules/formdata/template/
        private static final String TEMPLATE_ROOT = "<path to root client folder on where to store the generated templates>";
        // example path - /metadev-client-example/src/app/pages/
        private static final String Page_ROOT = "<path to where the generated pages are to be store on your client app>";
        // example path - /metadev-client-example/src/app/
        private static final String ROUTE_ROOT = "<path to where the generated routes are to be store on your client app >";
    ```
4. In the `/assets/spec/application.json` file you can define your app specific datatype, runtime lists, static lists.  

5. In the `assets` folder add your required form, record, template and page json files. Alternatively, you can use [MV-JSON-Generator](https://github.com/supreethavadhani/angular-mv-json-generator) to generate these json files.

6. Build the project
7. Run Gen.java to generate all the files
8. Run Server.java 
