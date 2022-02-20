package com.github.chwoerz.inlinemustache.services

import com.intellij.openapi.project.Project
import com.github.chwoerz.inlinemustache.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
