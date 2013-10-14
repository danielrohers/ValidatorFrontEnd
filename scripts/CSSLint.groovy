includeTargets << grailsScript("_GrailsInit")

target(main: " Validate all the CSS application module NPM 'CSSLint' ") {
    boolean npm = true
    try{
        println "csslint".execute().in.text
    }catch(IOException e){
        npm = false
        println "\nERROR: ${e.message}"
        println "\nVerify module NPM (Node) 'CSSLint' this up and try again"
    }

    new File("web-app/css").eachFileRecurse {
        def file = it.toString()
        if(file.endsWith(".css") && !file.endsWith(".min.css") && npm){
            println "csslint ${it}".execute().in.text
            println "\n#######################################################################################################################"
        }
    }

}

setDefaultTarget(main)
