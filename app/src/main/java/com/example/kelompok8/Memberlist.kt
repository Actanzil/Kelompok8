package com.example.kelompok8

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Memberlist(
    val imgMemberlist: Int,
    val nameMemberlist: String,
    val nimMemberlist: String,
    val emailMemberlist: String,
    val alamatMemberlist: String
) : Parcelable
