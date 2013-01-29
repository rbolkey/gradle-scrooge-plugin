package com.bolkey.gradle.scrooge

import org.gradle.api.Plugin
import org.gradle.api.Project

class ScroogePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        project.extensions.create("scrooge", ScroogePluginExtension)

    }
}
