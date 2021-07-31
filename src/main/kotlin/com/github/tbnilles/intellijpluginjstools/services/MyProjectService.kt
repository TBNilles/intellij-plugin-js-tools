package com.github.tbnilles.intellijpluginjstools.services

import com.github.tbnilles.intellijpluginjstools.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
