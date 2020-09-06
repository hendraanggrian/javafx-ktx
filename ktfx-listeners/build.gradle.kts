group = RELEASE_GROUP
version = RELEASE_VERSION

plugins {
    kotlin("jvm")
    dokka
    `bintray-release`
}

sourceSets {
    get("main").java.srcDir("src")
    get("test").java.srcDir("tests/src")
}

ktlint { add ->
    add(project(":rulesets:basic"))
    add(project(":rulesets:non-commons"))
}

dependencies {
    api(kotlin("stdlib"))

    testImplementation(project(":testing:listeners-coroutines"))
}

tasks {
    dokkaHtml.configure {
        dokkaSourceSets {
            named("main") {
                moduleDisplayName.set("$RELEASE_ARTIFACT-listeners")
                sourceLink {
                    localDirectory.set(file("src"))
                    remoteUrl.set(github("ktfx-listeners"))
                    remoteLineSuffix.set("#L")
                }
            }
        }
        doFirst { file(outputDirectory).deleteRecursively() }
    }
}

publishKotlinFix()
publish {
    bintrayUser = BINTRAY_USER
    bintrayKey = BINTRAY_KEY
    dryRun = false
    repoName = RELEASE_ARTIFACT

    userOrg = RELEASE_USER
    groupId = RELEASE_GROUP
    artifactId = "$RELEASE_ARTIFACT-listeners"
    publishVersion = RELEASE_VERSION
    desc = RELEASE_DESC
    website = RELEASE_WEB
}
