package com.kotlin.ktboard.controller.dto

data class PostDetailRequest(
    val id: Long,
    val title: String,
    val content: String,
    val createdBy: String,
    val createdAt: String,
)
