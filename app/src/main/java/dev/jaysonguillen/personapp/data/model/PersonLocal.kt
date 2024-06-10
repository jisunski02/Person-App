package dev.jaysonguillen.personapp.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "persons"
)
data class PersonLocal(
    @ColumnInfo("mobileNumber")
    val mobileNumber: String,
    @ColumnInfo("dateOfBirth")
    val dateOfBirth: String,
    @ColumnInfo("email")
    val email: String,
    @ColumnInfo("gender")
    val gender: String,
    @ColumnInfo("location")
    val location: String,
    @ColumnInfo("fullName")
    val fullName: String,
    @ColumnInfo("phone")
    val phone: String,
    @ColumnInfo("urlPicture")
    val urlPicture: String,
)
