package com.example.kmphelloworld

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform