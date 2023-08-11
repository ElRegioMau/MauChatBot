package com.example.mauchatbot.api.model

data class ChatCompletionRequest(
    val model: String,
    val messages: List<Message>
)
