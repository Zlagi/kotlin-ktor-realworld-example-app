package io.realworld.app.config

import io.realworld.app.web.controllers.ArticleController
import io.realworld.app.web.controllers.CommentController
import io.realworld.app.web.controllers.ProfileController
import io.realworld.app.web.controllers.TagController
import io.realworld.app.web.controllers.UserController
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton

object ModulesConfig {
    private val userModule = Kodein.Module("USER") {
        bind() from singleton { UserController() }
    }
    private val articleModule = Kodein.Module("ARTICLE") {
        bind() from singleton { ArticleController() }
    }
    private val profileModule = Kodein.Module("PROFILE") {
        bind() from singleton { ProfileController() }
    }
    private val commentModule = Kodein.Module("COMMENT") {
        bind() from singleton { CommentController() }
    }
    private val tagModule = Kodein.Module("TAG") {
        bind() from singleton { TagController() }
    }
    internal val kodein = Kodein {
        import(userModule)
        import(articleModule)
        import(profileModule)
        import(commentModule)
        import(tagModule)
    }
}