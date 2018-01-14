package com.github.adrienpessu.kotlincodelabbttf.models

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Event (
        val date: Date?,
        @Id val title: String,
        val description: String
)