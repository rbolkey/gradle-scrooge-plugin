package com.bolkey.gradle.scrooge

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import spock.lang.Specification

/**
 * Specification that the plugin is creating the expected models and tasks.
 */
class ScroogePluginSpecification extends Specification {

    Project project = ProjectBuilder.builder().build()

    def "should add the scrooge plugin"() {
        when:
        project.apply(plugin: 'scrooge')

        then:
        project.plugins['scrooge']
    }
}
