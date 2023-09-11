package de.seckinger.tobias.plugins

import io.ktor.http.ContentDisposition.Companion.File
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.routing.get
import java.io.File

fun Application.configureRouting() {
    routing {
        staticResources("/", "")
        staticFiles("/libs/pdfjs", File("node_modules/pdfjs-dist/build"))
        get("/") {
            call.respondText("Hello World!")
        }
    }
}
