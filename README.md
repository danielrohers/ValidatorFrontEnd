ValidatorFrontEnd
=================

This plugin is intended to validate the JavaScript and CSS technologies through JSLint and CSSLint

# Installation
    cd ValidatorFrontEnd
    grails clean
    grails refresh-dependencies
    grails compile
    grails maven-install
    
    cd YourProject
    grails clean
    grails refresh-dependencies
    
# Usage
In your project execute this scripts:

    grails JSLint
    grails CSSLint

# Requirements
* NPM [jslint] (https://npmjs.org/package/jslint)
* NPM [csslint] (http://csslint.net/about.html#node)
* [Grails 2.2.3] (http://grails.org)
