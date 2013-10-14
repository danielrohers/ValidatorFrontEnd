includeTargets << grailsScript("_GrailsInit")

target(main: " Validate all the JS application module NPM 'JSLint' ") {
    boolean npm = true
    try{
        println "jslint".execute().in.text
    }catch(IOException e){
        npm = false
        println "\nERROR: ${e.message}"
        println "\nVerify module NPM (Node) 'JSLint' this up and try again"
    }

    new File("web-app/js").eachFileRecurse {
        def file = it.toString()
        if(file.endsWith(".js") && !file.endsWith(".min.js") && npm){
            println "jslint ${it}".execute().in.text
            println "\n#######################################################################################################################"
        }
    }

}

setDefaultTarget(main)
