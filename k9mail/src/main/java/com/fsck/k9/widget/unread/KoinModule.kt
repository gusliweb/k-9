package com.fsck.k9.widget.unread

import org.koin.dsl.module.applicationContext

val unreadWidgetModule = applicationContext {
    bean { UnreadWidgetRepository(get()) }
}
